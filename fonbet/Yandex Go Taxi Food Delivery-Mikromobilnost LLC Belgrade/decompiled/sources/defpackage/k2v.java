package defpackage;

/* loaded from: classes9.dex */
public final class k2v {
    public final k2v[] a;
    public final int b;
    public final int c;

    public k2v(int i, int i2) {
        this.a = null;
        this.b = i;
        int i3 = i2 & 7;
        this.c = i3 == 0 ? 8 : i3;
    }

    public k2v() {
        this.a = new k2v[256];
        this.b = 0;
        this.c = 0;
    }
}
