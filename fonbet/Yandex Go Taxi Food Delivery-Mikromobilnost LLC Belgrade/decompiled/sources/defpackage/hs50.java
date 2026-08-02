package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class hs50 {
    public final cne0 a;
    public final r0 b;
    public final gci0 c;

    public hs50(dne0 dne0Var) {
        cne0 a = dne0Var.a("network_environment");
        this.a = a;
        String str = null;
        String l = a.l("active_environment", null);
        if (l != null && l.length() != 0) {
            str = l;
        }
        r0 c = bvf0.c(new l10(str == null ? "default" : str, a.g("block_fallback_to_location", false)));
        this.b = c;
        this.c = e.d(c);
    }

    public final l10 a() {
        return (l10) this.b.getValue();
    }

    public final void b(String str, boolean z) {
        if (str == null) {
            str = "default";
        }
        l10 l10Var = new l10(str, z);
        r0 r0Var = this.b;
        r0Var.getClass();
        r0Var.m(null, l10Var);
        cne0 cne0Var = this.a;
        cne0Var.r("active_environment", str);
        cne0Var.u("block_fallback_to_location", z);
    }
}
