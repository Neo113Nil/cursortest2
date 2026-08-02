package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class fk7 {
    public final jg7 a;
    public final jc4 b;
    public final yi7 c;

    public fk7(jg7 jg7Var, jc4 jc4Var, yi7 yi7Var) {
        this.a = jg7Var;
        this.b = jc4Var;
        this.c = yi7Var;
    }

    public final void a() {
        jc4 jc4Var = this.b;
        jc4Var.getClass();
        jc4Var.a.a("TaxiByPhoneButtonTapped", new HashMap(), 1, new HashMap());
        String b = ((kg7) this.a).b();
        if (b == null || evu0.J(b)) {
            jst.e.v("CallTaxiByPhoneInteractor", new IllegalStateException("callTaxiByPhone called without call center phone"));
        } else {
            ((aj7) this.c).b(b, true);
        }
    }
}
