package defpackage;

/* loaded from: classes5.dex */
public final class d9u implements b151 {
    public final vu0 a;

    public d9u(vu0 vu0Var) {
        this.a = vu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9u) && jl40.l(this.a, ((d9u) obj).a);
    }

    public final int hashCode() {
        vu0 vu0Var = this.a;
        return (vu0Var == null ? 0 : vu0Var.hashCode()) * 31;
    }

    public final String toString() {
        return "HeaderAddressSelectionWidgetAction(addressFlow=" + this.a + ", analyticsData=null)";
    }
}
