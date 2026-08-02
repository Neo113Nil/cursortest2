package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg421;", "Lj530;", "Lh421;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class g421 extends j530 {
    public final float a;
    public final float b;

    public g421(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.j530
    public final e530 a() {
        h421 h421Var = new h421();
        h421Var.a = this.a;
        h421Var.b = this.b;
        return h421Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g421)) {
            return false;
        }
        g421 g421Var = (g421) obj;
        return y7m.b(this.a, g421Var.a) && y7m.b(this.b, g421Var.b);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        h421 h421Var = (h421) e530Var;
        h421Var.a = this.a;
        h421Var.b = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
