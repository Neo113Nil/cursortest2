package defpackage;

/* loaded from: classes7.dex */
public abstract class k45 implements ca20 {
    public ea20 a;

    public k45(ssr ssrVar, String str) {
        ea20 ea20Var = new ea20(ssrVar.c, "flutter_yandex_mapkit/".concat(str));
        this.a = ea20Var;
        ea20Var.b(new m6(17, this));
    }

    public void a() {
        ea20 ea20Var = this.a;
        if (ea20Var != null) {
            ea20Var.b(null);
        }
        this.a = null;
    }
}
