package defpackage;

import java.util.TreeSet;

/* loaded from: classes8.dex */
public final class ae61 {
    public final cne0 a;
    public final String b;
    public final String c;

    public ae61(dne0 dne0Var, b03 b03Var) {
        this.a = dne0Var.b();
        String applicationId = b03Var.getApplicationId();
        this.b = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_DISPLAYABLE_TARIFFS_CLASSES");
        this.c = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_ZONEINFO_DISPLAYABLE_TARIFFS_CLASSES");
    }

    public final TreeSet a() {
        cne0 cne0Var = this.a;
        String str = this.b;
        return new TreeSet(cne0Var.c(str) ? cne0Var.n(str) : cne0Var.n(this.c));
    }
}
