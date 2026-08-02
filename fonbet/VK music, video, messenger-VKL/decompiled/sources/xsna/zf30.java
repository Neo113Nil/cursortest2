package xsna;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.facebook.soloader.MinElf;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Mp4TrackImpl.java */
/* loaded from: classes13.dex */
public class zf30 extends ci {
    public final TrackBox e;
    public final i0h0 f;
    public final SampleDescriptionBox g;
    public final long[] h;
    public final ArrayList i;
    public final long[] j;
    public final ArrayList k;
    public final hgp0 l;
    public final String m;
    public final SubSampleInformationBox n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v1 */
    public zf30(String str, TrackBox trackBox, etx... etxVarArr) {
        super(str);
        long j;
        Iterator it;
        TrackRunBox trackRunBox;
        TrackFragmentHeaderBox trackFragmentHeaderBox;
        Iterator it2;
        Iterator<TrackRunBox.a> it3;
        TrackExtendsBox trackExtendsBox;
        zf30 zf30Var = this;
        zf30Var.j = null;
        hgp0 hgp0Var = new hgp0();
        hgp0Var.b = "eng";
        new Date();
        hgp0Var.d = new Date();
        hgp0Var.e = cn10.j;
        long j2 = 1;
        hgp0Var.i = 1L;
        zf30Var.l = hgp0Var;
        zf30Var.n = null;
        zf30Var.e = trackBox;
        long trackId = trackBox.getTrackHeaderBox().getTrackId();
        zf30Var.f = new i0h0(trackBox, etxVarArr);
        SampleTableBox sampleTableBox = trackBox.getMediaBox().getMediaInformationBox().getSampleTableBox();
        zf30Var.m = trackBox.getMediaBox().getHandlerBox().getHandlerType();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zf30Var.i = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        zf30Var.k = arrayList3;
        arrayList.addAll(sampleTableBox.getTimeToSampleBox().getEntries());
        if (sampleTableBox.getCompositionTimeToSample() != null) {
            arrayList2.addAll(sampleTableBox.getCompositionTimeToSample().getEntries());
        }
        if (sampleTableBox.getSampleDependencyTypeBox() != null) {
            arrayList3.addAll(sampleTableBox.getSampleDependencyTypeBox().getEntries());
        }
        if (sampleTableBox.getSyncSampleBox() != null) {
            zf30Var.j = sampleTableBox.getSyncSampleBox().getSampleNumber();
        }
        zf30Var.n = (SubSampleInformationBox) bq90.b(sampleTableBox, "subs");
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(((ga8) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class));
        int length = etxVarArr.length;
        boolean z = false;
        int i = 0;
        while (i < length) {
            arrayList4.addAll(etxVarArr[i].getBoxes(MovieFragmentBox.class));
            i++;
            zf30Var = this;
        }
        zf30Var.g = sampleTableBox.getSampleDescriptionBox();
        List boxes = trackBox.getParent().getBoxes(MovieExtendsBox.class);
        if (boxes.size() > 0) {
            Iterator it4 = boxes.iterator();
            while (it4.hasNext()) {
                for (TrackExtendsBox trackExtendsBox2 : ((MovieExtendsBox) it4.next()).getBoxes(TrackExtendsBox.class)) {
                    if (trackExtendsBox2.getTrackId() == trackId) {
                        long j3 = j2;
                        if (bq90.c(((ga8) trackBox.getParent()).getParent(), "/moof/traf/subs", z).size() > 0) {
                            zf30Var.n = new SubSampleInformationBox();
                        }
                        Iterator it5 = arrayList4.iterator();
                        long j4 = j3;
                        while (it5.hasNext()) {
                            for (TrackFragmentBox trackFragmentBox : ((MovieFragmentBox) it5.next()).getBoxes(TrackFragmentBox.class)) {
                                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                                    List boxes2 = sampleTableBox.getBoxes(SampleGroupDescriptionBox.class);
                                    Iterator it6 = it4;
                                    List c = bq90.c(trackFragmentBox, SampleGroupDescriptionBox.TYPE, z);
                                    List c2 = bq90.c(trackFragmentBox, SampleToGroupBox.TYPE, z);
                                    HashMap hashMap = zf30Var.d;
                                    b(boxes2, c, c2, hashMap, j4 - j3);
                                    zf30Var.d = hashMap;
                                    SubSampleInformationBox subSampleInformationBox = (SubSampleInformationBox) bq90.b(trackFragmentBox, "subs");
                                    if (subSampleInformationBox != null) {
                                        j = trackId;
                                        long j5 = (j4 - (z ? 1L : 0L)) - j3;
                                        Iterator<SubSampleInformationBox.a> it7 = subSampleInformationBox.getEntries().iterator();
                                        while (it7.hasNext()) {
                                            SubSampleInformationBox.a next = it7.next();
                                            boolean z2 = z ? 1 : 0;
                                            SubSampleInformationBox.a aVar = next;
                                            long j6 = j5;
                                            SubSampleInformationBox.a aVar2 = new SubSampleInformationBox.a();
                                            Iterator<SubSampleInformationBox.a> it8 = it7;
                                            aVar2.b.addAll(aVar.b);
                                            if (j6 != 0) {
                                                aVar2.a = j6 + aVar.a;
                                                j6 = 0;
                                            } else {
                                                aVar2.a = aVar.a;
                                            }
                                            zf30Var.n.getEntries().add(aVar2);
                                            it7 = it8;
                                            z = z2;
                                            j5 = j6;
                                        }
                                    } else {
                                        j = trackId;
                                    }
                                    ?? r23 = z;
                                    Iterator it9 = trackFragmentBox.getBoxes(TrackRunBox.class).iterator();
                                    while (it9.hasNext()) {
                                        TrackRunBox trackRunBox2 = (TrackRunBox) it9.next();
                                        TrackFragmentHeaderBox trackFragmentHeaderBox2 = ((TrackFragmentBox) trackRunBox2.getParent()).getTrackFragmentHeaderBox();
                                        char c3 = 1;
                                        for (Iterator<TrackRunBox.a> it10 = trackRunBox2.getEntries().iterator(); it10.hasNext(); it10 = it3) {
                                            TrackRunBox.a next2 = it10.next();
                                            if (trackRunBox2.isSampleDurationPresent()) {
                                                if (arrayList.size() != 0) {
                                                    it = it9;
                                                    trackRunBox = trackRunBox2;
                                                    if (((TimeToSampleBox.a) xy9.b(1, arrayList)).b == next2.a) {
                                                        trackFragmentHeaderBox = trackFragmentHeaderBox2;
                                                        it2 = it5;
                                                        ((TimeToSampleBox.a) xy9.b(1, arrayList)).a += j3;
                                                        it3 = it10;
                                                        trackExtendsBox = trackExtendsBox2;
                                                    }
                                                } else {
                                                    it = it9;
                                                    trackRunBox = trackRunBox2;
                                                }
                                                trackFragmentHeaderBox = trackFragmentHeaderBox2;
                                                it2 = it5;
                                                it3 = it10;
                                                trackExtendsBox = trackExtendsBox2;
                                                arrayList.add(new TimeToSampleBox.a(j3, next2.a));
                                            } else {
                                                it = it9;
                                                trackRunBox = trackRunBox2;
                                                trackFragmentHeaderBox = trackFragmentHeaderBox2;
                                                it2 = it5;
                                                it3 = it10;
                                                trackExtendsBox = trackExtendsBox2;
                                                long j7 = j3;
                                                if (trackFragmentHeaderBox.hasDefaultSampleDuration()) {
                                                    arrayList.add(new TimeToSampleBox.a(j7, trackFragmentHeaderBox.getDefaultSampleDuration()));
                                                } else {
                                                    arrayList.add(new TimeToSampleBox.a(j7, trackExtendsBox.getDefaultSampleDuration()));
                                                }
                                            }
                                            if (trackRunBox.isSampleCompositionTimeOffsetPresent()) {
                                                if (zf30Var.i.size() == 0 || ((CompositionTimeToSample.a) xy9.b(1, zf30Var.i)).b != next2.d) {
                                                    zf30Var.i.add(new CompositionTimeToSample.a(1, up2.p(next2.d)));
                                                } else {
                                                    ((CompositionTimeToSample.a) xy9.b(1, zf30Var.i)).a++;
                                                }
                                            }
                                            h0h0 defaultSampleFlags = trackRunBox.isSampleFlagsPresent() ? next2.c : (c3 == 0 || !trackRunBox.isFirstSampleFlagsPresent()) ? trackFragmentHeaderBox.hasDefaultSampleFlags() ? trackFragmentHeaderBox.getDefaultSampleFlags() : trackExtendsBox.getDefaultSampleFlags() : trackRunBox.getFirstSampleFlags();
                                            if (defaultSampleFlags != null && !defaultSampleFlags.g) {
                                                long[] jArr = zf30Var.j;
                                                long[] jArr2 = new long[1];
                                                jArr2[r23] = j4;
                                                zf30Var.j = skd.b(jArr, jArr2);
                                            }
                                            j3 = 1;
                                            j4++;
                                            it5 = it2;
                                            c3 = r23;
                                            it9 = it;
                                            trackRunBox2 = trackRunBox;
                                            trackFragmentHeaderBox2 = trackFragmentHeaderBox;
                                            trackExtendsBox2 = trackExtendsBox;
                                        }
                                    }
                                    it4 = it6;
                                    trackId = j;
                                    z = r23;
                                }
                            }
                        }
                        j2 = j3;
                    }
                }
            }
        } else {
            List boxes3 = sampleTableBox.getBoxes(SampleGroupDescriptionBox.class);
            List boxes4 = sampleTableBox.getBoxes(SampleToGroupBox.class);
            HashMap hashMap2 = zf30Var.d;
            b(boxes3, null, boxes4, hashMap2, 0L);
            zf30Var.d = hashMap2;
        }
        zf30Var.h = TimeToSampleBox.blowupTimeToSamples(arrayList);
        MediaHeaderBox mediaHeaderBox = trackBox.getMediaBox().getMediaHeaderBox();
        TrackHeaderBox trackHeaderBox = trackBox.getTrackHeaderBox();
        zf30Var.l.i = trackHeaderBox.getTrackId();
        zf30Var.l.d = mediaHeaderBox.getCreationTime();
        zf30Var.l.b = mediaHeaderBox.getLanguage();
        hgp0 hgp0Var2 = zf30Var.l;
        mediaHeaderBox.getModificationTime();
        hgp0Var2.getClass();
        zf30Var.l.c = mediaHeaderBox.getTimescale();
        zf30Var.l.g = trackHeaderBox.getHeight();
        zf30Var.l.f = trackHeaderBox.getWidth();
        zf30Var.l.j = trackHeaderBox.getLayer();
        zf30Var.l.e = trackHeaderBox.getMatrix();
        zf30Var.l.h = trackHeaderBox.getVolume();
        EditListBox editListBox = (EditListBox) bq90.b(trackBox, "edts/elst");
        MovieHeaderBox movieHeaderBox = (MovieHeaderBox) bq90.b(trackBox, "../mvhd");
        if (editListBox != null) {
            for (EditListBox.a aVar3 : editListBox.getEntries()) {
                ArrayList arrayList5 = zf30Var.c;
                long j8 = aVar3.c;
                long timescale = mediaHeaderBox.getTimescale();
                double d = aVar3.d;
                wyo wyoVar = new wyo();
                wyoVar.a = timescale;
                wyoVar.b = aVar3.b / r36.getTimescale();
                wyoVar.c = j8;
                wyoVar.d = d;
                arrayList5.add(wyoVar);
                zf30Var = this;
                movieHeaderBox = movieHeaderBox;
            }
        }
    }

    public static void b(List list, List list2, List list3, HashMap hashMap, long j) {
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            SampleToGroupBox sampleToGroupBox = (SampleToGroupBox) it.next();
            int i = 0;
            for (SampleToGroupBox.a aVar : sampleToGroupBox.getEntries()) {
                int i2 = aVar.b;
                if (i2 > 0) {
                    vju vjuVar = null;
                    if (i2 > 65535) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            SampleGroupDescriptionBox sampleGroupDescriptionBox = (SampleGroupDescriptionBox) it2.next();
                            if (sampleGroupDescriptionBox.getGroupingType().equals(sampleToGroupBox.getGroupingType())) {
                                vjuVar = sampleGroupDescriptionBox.getGroupEntries().get((i2 - 1) & MinElf.PN_XNUM);
                            }
                        }
                    } else {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            SampleGroupDescriptionBox sampleGroupDescriptionBox2 = (SampleGroupDescriptionBox) it3.next();
                            if (sampleGroupDescriptionBox2.getGroupingType().equals(sampleToGroupBox.getGroupingType())) {
                                vjuVar = sampleGroupDescriptionBox2.getGroupEntries().get(i2 - 1);
                            }
                        }
                    }
                    vju vjuVar2 = vjuVar;
                    long[] jArr = (long[]) hashMap.get(vjuVar2);
                    if (jArr == null) {
                        jArr = new long[0];
                    }
                    long[] jArr2 = jArr;
                    long[] jArr3 = new long[up2.p(aVar.a) + jArr2.length];
                    System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
                    int i3 = 0;
                    while (true) {
                        long j2 = i3;
                        if (j2 >= aVar.a) {
                            break;
                        }
                        jArr3[jArr2.length + i3] = j + i + j2;
                        i3++;
                    }
                    hashMap.put(vjuVar2, jArr3);
                }
                i = (int) (i + aVar.a);
            }
        }
    }

    @Override // xsna.uep0
    public final long[] B3() {
        long[] jArr = this.j;
        if (jArr == null || jArr.length == this.f.b.size()) {
            return null;
        }
        return jArr;
    }

    @Override // xsna.uep0
    public final SubSampleInformationBox E3() {
        return this.n;
    }

    @Override // xsna.uep0
    public final List<f0h0> K() {
        return this.f;
    }

    @Override // xsna.uep0
    public final ArrayList M() {
        return this.i;
    }

    @Override // xsna.uep0
    public final synchronized long[] Q3() {
        return this.h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        yej parent = this.e.getParent();
        if (parent instanceof BasicContainer) {
            ((BasicContainer) parent).close();
        }
    }

    @Override // xsna.uep0
    public final String getHandler() {
        return this.m;
    }

    @Override // xsna.uep0
    public final SampleDescriptionBox getSampleDescriptionBox() {
        return this.g;
    }

    @Override // xsna.uep0
    public final hgp0 i3() {
        return this.l;
    }

    @Override // xsna.uep0
    public final List<SampleDependencyTypeBox.a> r2() {
        return this.k;
    }
}
