package xsna;

import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: FragmentedMp4SampleList.java */
/* loaded from: classes13.dex */
public final class oes extends AbstractList<f0h0> {
    public final yej b;
    public final etx[] c;
    public final TrackBox d;
    public final TrackExtendsBox e;
    public final SoftReference<f0h0>[] f;
    public final ArrayList g;
    public final int[] i;
    public final HashMap h = new HashMap();
    public int j = -1;

    public oes(long j, yej yejVar, etx... etxVarArr) {
        this.d = null;
        this.e = null;
        this.b = yejVar;
        this.c = etxVarArr;
        for (TrackBox trackBox : bq90.c(yejVar, "moov[0]/trak", false)) {
            if (trackBox.getTrackHeaderBox().getTrackId() == j) {
                this.d = trackBox;
            }
        }
        if (this.d == null) {
            throw new RuntimeException(defpackage.k0.a(j, "This MP4 does not contain track "));
        }
        for (TrackExtendsBox trackExtendsBox : bq90.c(yejVar, "moov[0]/mvex[0]/trex", false)) {
            if (trackExtendsBox.getTrackId() == this.d.getTrackHeaderBox().getTrackId()) {
                this.e = trackExtendsBox;
            }
        }
        this.f = (SoftReference[]) Array.newInstance((Class<?>) SoftReference.class, size());
        TrackBox trackBox2 = this.d;
        if (this.g != null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.getBoxes(MovieFragmentBox.class).iterator();
        while (it.hasNext()) {
            for (TrackFragmentBox trackFragmentBox : ((MovieFragmentBox) it.next()).getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackBox2.getTrackHeaderBox().getTrackId()) {
                    arrayList.add(trackFragmentBox);
                }
            }
        }
        etx[] etxVarArr2 = this.c;
        if (etxVarArr2 != null) {
            for (etx etxVar : etxVarArr2) {
                Iterator it2 = etxVar.getBoxes(MovieFragmentBox.class).iterator();
                while (it2.hasNext()) {
                    for (TrackFragmentBox trackFragmentBox2 : ((MovieFragmentBox) it2.next()).getBoxes(TrackFragmentBox.class)) {
                        if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == trackBox2.getTrackHeaderBox().getTrackId()) {
                            arrayList.add(trackFragmentBox2);
                        }
                    }
                }
            }
        }
        this.g = arrayList;
        this.i = new int[arrayList.size()];
        int i = 1;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            this.i[i2] = i;
            List<ga8> boxes = ((TrackFragmentBox) this.g.get(i2)).getBoxes();
            int i3 = 0;
            for (int i4 = 0; i4 < boxes.size(); i4++) {
                ga8 ga8Var = boxes.get(i4);
                if (ga8Var instanceof TrackRunBox) {
                    i3 += up2.p(((TrackRunBox) ga8Var).getSampleCount());
                }
            }
            i += i3;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long j;
        SoftReference<f0h0>[] softReferenceArr;
        long j2;
        long defaultSampleSize;
        f0h0 f0h0Var;
        oes oesVar = this;
        SoftReference<f0h0>[] softReferenceArr2 = oesVar.f;
        SoftReference<f0h0> softReference = softReferenceArr2[i];
        if (softReference != null && (f0h0Var = softReference.get()) != null) {
            return f0h0Var;
        }
        int i2 = i + 1;
        int length = oesVar.i.length - 1;
        while (i2 - oesVar.i[length] < 0) {
            length--;
            oesVar = this;
        }
        TrackFragmentBox trackFragmentBox = (TrackFragmentBox) oesVar.g.get(length);
        int i3 = i2 - oesVar.i[length];
        MovieFragmentBox movieFragmentBox = (MovieFragmentBox) trackFragmentBox.getParent();
        int i4 = 0;
        for (ga8 ga8Var : trackFragmentBox.getBoxes()) {
            if (ga8Var instanceof TrackRunBox) {
                TrackRunBox trackRunBox = (TrackRunBox) ga8Var;
                int i5 = i3 - i4;
                if (trackRunBox.getEntries().size() > i5) {
                    List<TrackRunBox.a> entries = trackRunBox.getEntries();
                    TrackFragmentHeaderBox trackFragmentHeaderBox = trackFragmentBox.getTrackFragmentHeaderBox();
                    boolean isSampleSizePresent = trackRunBox.isSampleSizePresent();
                    boolean hasDefaultSampleSize = trackFragmentHeaderBox.hasDefaultSampleSize();
                    long j3 = 0;
                    if (isSampleSizePresent) {
                        j = 0;
                    } else {
                        if (hasDefaultSampleSize) {
                            defaultSampleSize = trackFragmentHeaderBox.getDefaultSampleSize();
                        } else {
                            TrackExtendsBox trackExtendsBox = oesVar.e;
                            if (trackExtendsBox == null) {
                                throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                            }
                            defaultSampleSize = trackExtendsBox.getDefaultSampleSize();
                        }
                        j = defaultSampleSize;
                    }
                    HashMap hashMap = oesVar.h;
                    SoftReference softReference2 = (SoftReference) hashMap.get(trackRunBox);
                    ByteBuffer byteBuffer = softReference2 != null ? (ByteBuffer) softReference2.get() : null;
                    if (byteBuffer == null) {
                        yej yejVar = movieFragmentBox;
                        if (trackFragmentHeaderBox.hasBaseDataOffset()) {
                            j3 = trackFragmentHeaderBox.getBaseDataOffset();
                            yejVar = movieFragmentBox.getParent();
                        }
                        if (trackRunBox.isDataOffsetPresent()) {
                            j3 += trackRunBox.getDataOffset();
                        }
                        int i6 = 0;
                        for (TrackRunBox.a aVar : entries) {
                            if (isSampleSizePresent) {
                                softReferenceArr = softReferenceArr2;
                                j2 = i6 + aVar.b;
                            } else {
                                softReferenceArr = softReferenceArr2;
                                j2 = i6 + j;
                            }
                            i6 = (int) j2;
                            softReferenceArr2 = softReferenceArr;
                        }
                        try {
                            byteBuffer = yejVar.getByteBuffer(j3, i6);
                            hashMap.put(trackRunBox, new SoftReference(byteBuffer));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    SoftReference<f0h0>[] softReferenceArr3 = softReferenceArr2;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    int i7 = 0;
                    for (int i8 = 0; i8 < i5; i8++) {
                        i7 = (int) (isSampleSizePresent ? i7 + entries.get(i8).b : i7 + j);
                    }
                    if (isSampleSizePresent) {
                        j = entries.get(i5).b;
                    }
                    nes nesVar = new nes(j, i7, byteBuffer2);
                    softReferenceArr3[i] = new SoftReference<>(nesVar);
                    return nesVar;
                }
                i4 += trackRunBox.getEntries().size();
            } else {
                oesVar = this;
            }
        }
        throw new RuntimeException("Couldn't find sample in the traf I was looking");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        TrackBox trackBox;
        int i = this.j;
        if (i != -1) {
            return i;
        }
        Iterator it = this.b.getBoxes(MovieFragmentBox.class).iterator();
        int i2 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            trackBox = this.d;
            if (!hasNext) {
                break;
            }
            for (TrackFragmentBox trackFragmentBox : ((MovieFragmentBox) it.next()).getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId()) {
                    Iterator it2 = trackFragmentBox.getBoxes(TrackRunBox.class).iterator();
                    while (it2.hasNext()) {
                        i2 = (int) (((TrackRunBox) it2.next()).getSampleCount() + i2);
                    }
                }
            }
        }
        for (etx etxVar : this.c) {
            Iterator it3 = etxVar.getBoxes(MovieFragmentBox.class).iterator();
            while (it3.hasNext()) {
                for (TrackFragmentBox trackFragmentBox2 : ((MovieFragmentBox) it3.next()).getBoxes(TrackFragmentBox.class)) {
                    if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId()) {
                        Iterator it4 = trackFragmentBox2.getBoxes(TrackRunBox.class).iterator();
                        while (it4.hasNext()) {
                            i2 = (int) (((TrackRunBox) it4.next()).getSampleCount() + i2);
                        }
                    }
                }
            }
        }
        this.j = i2;
        return i2;
    }
}
