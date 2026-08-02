package defpackage;

import java.util.Locale;

/* loaded from: classes10.dex */
public final class kyg {
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
        int i12 = tw21.a;
        Locale locale = Locale.US;
        StringBuilder s = b64.s(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        vfc.u(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", s);
        vfc.u(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", s);
        vfc.u(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", s);
        vfc.u(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", s);
        vfc.y(s, j, "\n videoFrameProcessingOffsetCount=", i11);
        s.append("\n}");
        return s.toString();
    }
}
