package xsna;

/* compiled from: TranscoderTrackHandler.kt */
/* loaded from: classes3.dex */
public abstract class gjp0 {
    public final rfp0 a;
    public final f100 b;
    public final String c;
    public long d;

    public gjp0(rfp0 rfp0Var, f100 f100Var, String str) {
        this.a = rfp0Var;
        this.b = f100Var;
        this.c = str;
    }

    public abstract boolean a();

    public void b() {
        f100 f100Var = this.b;
        if (f100Var != null) {
            f100Var.i(this.c, efz.b(System.currentTimeMillis() - this.d, " ms", new StringBuilder("time spent=")));
        }
    }

    public abstract void c();
}
