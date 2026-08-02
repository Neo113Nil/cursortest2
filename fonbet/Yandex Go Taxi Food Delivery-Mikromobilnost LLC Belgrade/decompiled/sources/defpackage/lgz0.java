package defpackage;

/* loaded from: classes14.dex */
public final class lgz0 {
    public final wnt a;
    public final cne0 b;

    public lgz0(wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.b = dne0Var.a("tips_notification_preferences");
    }

    public final lj60 a() {
        String l = this.b.l("SHOWED_INFO_KEY", null);
        if (l == null) {
            return new lj60(0);
        }
        return (lj60) ((xnt) this.a).c(l, lj60.Companion.serializer());
    }
}
