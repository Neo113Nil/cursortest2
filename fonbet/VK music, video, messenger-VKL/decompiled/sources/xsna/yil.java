package xsna;

import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.TrackBox;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

/* compiled from: DefaultMp4SampleList.java */
/* loaded from: classes13.dex */
public final class yil extends AbstractList<f0h0> {
    public static final q100 k = q100.a(yil.class);
    public final yej b;
    public final TrackBox c;
    public final SoftReference<ByteBuffer>[] d;
    public final int[] e;
    public final long[] f;
    public final long[] g;
    public final long[][] h;
    public final SampleSizeBox i;
    public int j = 0;

    /* compiled from: DefaultMp4SampleList.java */
    public class a implements f0h0 {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        @Override // xsna.f0h0
        public final void a(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            synchronized (this) {
                int c = yil.this.c(this.a);
                yil yilVar = yil.this;
                SoftReference<ByteBuffer> softReference = yilVar.d[c];
                int i = this.a - (yilVar.e[c] - 1);
                long j = c;
                long[] jArr = yilVar.h[up2.p(j)];
                long j2 = jArr[i];
                if (softReference == null || (byteBuffer = softReference.get()) == null) {
                    try {
                        yil yilVar2 = yil.this;
                        byteBuffer = yilVar2.b.getByteBuffer(yilVar2.f[up2.p(j)], jArr[jArr.length - 1] + yil.this.i.getSampleSizeAtIndex((r3 + jArr.length) - 1));
                        yil.this.d[c] = new SoftReference<>(byteBuffer);
                    } catch (IOException e) {
                        StringWriter stringWriter = new StringWriter();
                        e.printStackTrace(new PrintWriter(stringWriter));
                        yil.k.c(stringWriter.toString());
                        throw new IndexOutOfBoundsException(e.getMessage());
                    }
                }
                byteBuffer2 = (ByteBuffer) ((ByteBuffer) byteBuffer.duplicate().position(up2.p(j2))).slice().limit(up2.p(yil.this.i.getSampleSizeAtIndex(this.a)));
            }
            writableByteChannel.write(byteBuffer2);
        }

        @Override // xsna.f0h0
        public final long getSize() {
            return yil.this.i.getSampleSizeAtIndex(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Sample(index: ");
            int i = this.a;
            sb.append(i);
            sb.append(" size: ");
            sb.append(yil.this.i.getSampleSizeAtIndex(i));
            sb.append(")");
            return sb.toString();
        }
    }

    public yil(long j, yej yejVar) {
        int i;
        int i2;
        this.c = null;
        this.d = null;
        int i3 = 0;
        this.b = yejVar;
        for (TrackBox trackBox : ((MovieBox) yejVar.getBoxes(MovieBox.class).get(0)).getBoxes(TrackBox.class)) {
            if (trackBox.getTrackHeaderBox().getTrackId() == j) {
                this.c = trackBox;
            }
            i3 = 0;
        }
        TrackBox trackBox2 = this.c;
        if (trackBox2 == null) {
            throw new RuntimeException(defpackage.k0.a(j, "This MP4 does not contain track "));
        }
        long[] chunkOffsets = trackBox2.getSampleTableBox().getChunkOffsetBox().getChunkOffsets();
        this.f = chunkOffsets;
        this.g = new long[chunkOffsets.length];
        SoftReference<ByteBuffer>[] softReferenceArr = new SoftReference[chunkOffsets.length];
        this.d = softReferenceArr;
        Arrays.fill(softReferenceArr, new SoftReference(null));
        this.h = new long[chunkOffsets.length][];
        this.i = this.c.getSampleTableBox().getSampleSizeBox();
        List<SampleToChunkBox.a> entries = this.c.getSampleTableBox().getSampleToChunkBox().getEntries();
        SampleToChunkBox.a[] aVarArr = (SampleToChunkBox.a[]) entries.toArray(new SampleToChunkBox.a[entries.size()]);
        SampleToChunkBox.a aVar = aVarArr[i3];
        long j2 = aVar.a;
        int p = up2.p(aVar.b);
        int size = size();
        int i4 = i3;
        int i5 = i4;
        int i6 = 1;
        int i7 = 1;
        while (true) {
            int i8 = i4 + 1;
            if (i8 != j2) {
                i = i3;
            } else if (aVarArr.length > i6) {
                int i9 = i6 + 1;
                SampleToChunkBox.a aVar2 = aVarArr[i6];
                int p2 = up2.p(aVar2.b);
                i = i3;
                i5 = p;
                j2 = aVar2.a;
                p = p2;
                i6 = i9;
            } else {
                i = i3;
                i5 = p;
                p = -1;
                j2 = Long.MAX_VALUE;
            }
            this.h[i4] = new long[i5];
            i7 += i5;
            if (i7 > size) {
                break;
            }
            i4 = i8;
            i3 = i;
        }
        this.e = new int[i4 + 2];
        SampleToChunkBox.a aVar3 = aVarArr[i];
        long j3 = aVar3.a;
        int p3 = up2.p(aVar3.b);
        int i10 = i;
        int i11 = i10;
        int i12 = 1;
        int i13 = 1;
        while (true) {
            i2 = i10 + 1;
            this.e[i10] = i12;
            if (i2 == j3) {
                if (aVarArr.length > i13) {
                    SampleToChunkBox.a aVar4 = aVarArr[i13];
                    i11 = p3;
                    p3 = up2.p(aVar4.b);
                    j3 = aVar4.a;
                    i13++;
                } else {
                    i11 = p3;
                    p3 = -1;
                    j3 = Long.MAX_VALUE;
                }
            }
            i12 += i11;
            if (i12 > size) {
                break;
            } else {
                i10 = i2;
            }
        }
        this.e[i2] = Integer.MAX_VALUE;
        long j4 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 <= this.i.getSampleCount(); i15++) {
            while (i15 == this.e[i14]) {
                i14++;
                j4 = 0;
            }
            long[] jArr = this.g;
            int i16 = i14 - 1;
            int i17 = i15 - 1;
            jArr[i16] = this.i.getSampleSizeAtIndex(i17) + jArr[i16];
            this.h[i16][i15 - this.e[i16]] = j4;
            j4 += this.i.getSampleSizeAtIndex(i17);
        }
    }

    public final synchronized int c(int i) {
        int i2 = i + 1;
        int[] iArr = this.e;
        int i3 = this.j;
        int i4 = iArr[i3];
        if (i2 >= i4 && i2 < iArr[i3 + 1]) {
            return i3;
        }
        if (i2 < i4) {
            this.j = 0;
            while (true) {
                int[] iArr2 = this.e;
                int i5 = this.j;
                int i6 = i5 + 1;
                if (iArr2[i6] > i2) {
                    return i5;
                }
                this.j = i6;
            }
        } else {
            this.j = i3 + 1;
            while (true) {
                int[] iArr3 = this.e;
                int i7 = this.j;
                int i8 = i7 + 1;
                if (iArr3[i8] > i2) {
                    return i7;
                }
                this.j = i8;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < this.i.getSampleCount()) {
            return new a(i);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return up2.p(this.c.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }
}
