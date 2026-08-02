package defpackage;

/* loaded from: classes6.dex */
public final class aqj0 {
    public final cne0 a;

    public aqj0(dne0 dne0Var) {
        this.a = dne0Var.a("requirements_show_policy_preferences");
    }

    public final void a(String str) {
        cne0 cne0Var = this.a;
        cne0Var.p(cne0Var.i("pref_usage_count_" + str, 0) + 1, g8e.o("pref_usage_count_", str));
    }
}
