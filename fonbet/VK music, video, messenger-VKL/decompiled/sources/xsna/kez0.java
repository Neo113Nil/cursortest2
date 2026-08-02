package xsna;

import xsna.u3z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class kez0 implements Runnable {
    public final /* synthetic */ giz0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ giy0 e;
    public final /* synthetic */ t8z0 f;

    public /* synthetic */ kez0(giz0 giz0Var, String str, int i, giy0 giy0Var, t8z0 t8z0Var) {
        this.b = giz0Var;
        this.c = str;
        this.d = i;
        this.e = giy0Var;
        this.f = t8z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        giz0 giz0Var = this.b;
        if (giz0Var != null) {
            giz0Var.b();
        }
        u3z0 u3z0Var = mez0.f;
        qjz0 qjz0Var = mez0.h;
        u3z0Var.getClass();
        String str = this.c;
        u3z0.a a = u3z0.a(str, this.d, qjz0Var);
        if (!a.a()) {
            StringBuilder sb = new StringBuilder("responseCode=");
            jax0.a(a.c, ", url=", str, ", error=", sb);
            sb.append(a.d);
            this.e.g(2, 7004, sb.toString());
            if (giz0Var != null) {
                giz0Var.a();
            }
        }
        t8z0 t8z0Var = this.f;
        if (t8z0Var == null) {
            if (giz0Var != null) {
                giz0Var.a();
            }
        } else {
            if (!a.a() && giz0Var != null) {
                giz0Var.a();
            }
            o8z0.d(new ls2(14, t8z0Var, a));
        }
    }
}
