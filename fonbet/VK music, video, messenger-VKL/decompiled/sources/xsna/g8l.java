package xsna;

import java.util.Locale;

/* compiled from: DecoderCounters.java */
/* loaded from: classes12.dex */
public final class g8l {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = y2r0.a;
        Locale locale = Locale.US;
        StringBuilder a = odj.a(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        cgn.a(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", a);
        cgn.a(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", a);
        cgn.a(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", a);
        cgn.a(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", a);
        a.append(j);
        a.append("\n videoFrameProcessingOffsetCount=");
        a.append(i11);
        a.append("\n}");
        return a.toString();
    }
}
