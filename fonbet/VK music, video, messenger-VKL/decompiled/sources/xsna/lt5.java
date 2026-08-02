package xsna;

/* compiled from: AviStreamHeaderChunk.java */
/* loaded from: classes12.dex */
public final class lt5 implements it5 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public lt5(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final int a() {
        int i = this.a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        ahn.F("Found unsupported streamType fourCC: " + Integer.toHexString(i));
        return -1;
    }

    @Override // xsna.it5
    public final int getType() {
        return 1752331379;
    }
}
