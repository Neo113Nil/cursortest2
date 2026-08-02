package xsna;

/* compiled from: AudioTrackConverter.kt */
/* loaded from: classes3.dex */
public final class bz4 {
    public final int a;
    public final kz4 b;
    public final n3q0 c;
    public double d;
    public double e;
    public final bqk f;
    public iz4 g;

    public bz4(int i, kz4 kz4Var, n3q0 n3q0Var) {
        this.a = i;
        this.b = kz4Var;
        this.c = n3q0Var;
        double d = n3q0Var.d;
        this.d = d;
        this.e = d;
        this.f = new bqk(n3q0Var.c);
    }

    public final boolean a(double d) {
        kz4 kz4Var = this.b;
        return d >= ((double) kz4Var.i) && d < ((double) kz4Var.j);
    }
}
