package yads;

/* loaded from: classes10.dex */
public final class aa0 extends ba0 {
    public final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(boolean z) {
        super(0);
        z90 z90Var = z90.b;
        this.a = z;
    }

    @Override // yads.ba0
    public final boolean a(Object obj) {
        if (!(obj instanceof aa0)) {
            return false;
        }
        ((aa0) obj).getClass();
        z90 z90Var = z90.b;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa0)) {
            return false;
        }
        aa0 aa0Var = (aa0) obj;
        aa0Var.getClass();
        z90 z90Var = z90.b;
        return this.a == aa0Var.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + ((z90.b.hashCode() - 1222345866) * 31);
    }

    public final String toString() {
        return "Switch(text=Debug Error Indicator, switchType=" + z90.b + ", initialState=" + this.a + ")";
    }
}
