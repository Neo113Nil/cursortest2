package defpackage;

import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes10.dex */
public final class g4g0 {
    public static final /* synthetic */ kgx[] d = {new MutablePropertyReference1Impl("includedTags", 0, "getIncludedTags()Ljava/util/Set;", g4g0.class), new MutablePropertyReference1Impl("excludedTags", 0, "getExcludedTags()Ljava/util/Set;", g4g0.class), new MutablePropertyReference1Impl("migrationToDisabledMade", 0, "getMigrationToDisabledMade()Z", g4g0.class)};
    public final sme0 a;
    public final sme0 b;
    public final qme0 c;

    public g4g0(dne0 dne0Var) {
        cne0 a = dne0Var.a("push_settings");
        int i = 1;
        this.a = new sme0(i, a, a, "INCLUDED_TAGS");
        this.b = new sme0(i, a, a, "EXCLUDED_TAGS");
        this.c = new qme0(0, a, a, "MIGRATION_TO_DISABLED_MADE");
    }

    public final Set a() {
        return (Set) this.b.getValue(this, d[1]);
    }

    public final Set b() {
        return (Set) this.a.getValue(this, d[0]);
    }
}
