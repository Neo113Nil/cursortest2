package defpackage;

/* loaded from: classes8.dex */
public final class id {
    public final cne0 a;
    public volatile String b;

    public id(dne0 dne0Var) {
        cne0 a = dne0Var.a("debts_acceptance_payment_preferences");
        this.a = a;
        String str = null;
        String l = a.l("ACTIVE_ORDER_ID", null);
        if (l != null && !evu0.J(l)) {
            str = l;
        }
        this.b = str;
    }
}
