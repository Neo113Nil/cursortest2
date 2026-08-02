package defpackage;

/* loaded from: classes6.dex */
public final class i2s {
    public final h2s a;

    public i2s(yyq0 yyq0Var) {
        Object a = yyq0Var.a("TariffSwitchStorage", new ydf(3));
        if (!(a instanceof h2s)) {
            xby.t(jst.e, "SESSION_STORAGE:FEATURE_DATA_TYPE_INCONSISTENCY", null, "Feature storage with id=TariffSwitchStorage is expected to has type " + qoi0.e(h2s.class) + " but get " + (a != null ? a.getClass() : null), 6);
            a = new h2s();
        }
        this.a = (h2s) a;
    }
}
