package defpackage;

/* loaded from: classes10.dex */
public final class iid0 implements xbi0 {
    public final cne0 a;
    public final String b;

    public iid0(dne0 dne0Var, rs2 rs2Var) {
        this.a = dne0Var.a("ru.yandex.taxi.yaplus.YA_PLUS");
        rs2Var.getClass();
        this.b = "ru.yandex.taxiSHOW_BUY_PROMO_AFTER_SPLASH";
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        return this.a.l(this.b, null);
    }

    @Override // defpackage.xbi0
    public void setValue(Object obj, kgx kgxVar, Object obj2) {
        this.a.r(this.b, (String) obj2);
    }

    public iid0(cne0 cne0Var, String str) {
        this.a = cne0Var;
        this.b = str;
    }
}
