package xsna;

/* compiled from: LottieAnimation.kt */
/* loaded from: classes5.dex */
public final class zf3 {
    public final k800 a;
    public int b = -1;
    public int c;
    public int d;
    public final int e;
    public final float f;

    public zf3(i700 i700Var) {
        this.f = 1.0f;
        k800 k800Var = new k800();
        this.a = k800Var;
        k800Var.s(i700Var);
        k800Var.c.setRepeatCount(-1);
        this.f = 0.5f;
        k800Var.start();
        this.e = (int) (k800Var.b.b() / k800Var.b.c());
    }

    public final void a() {
        this.a.o();
    }

    public final void b() {
        this.a.p();
    }

    public final void c() {
        k800 k800Var = this.a;
        this.b = (int) k800Var.c.k();
        this.c = (int) k800Var.c.j();
    }
}
