package xsna;

/* compiled from: SearchHistoryProviderComponent.kt */
/* loaded from: classes16.dex */
public final class fvh0 implements l9i {
    public final uuh0 a;
    public final boolean b;

    public fvh0(uuh0 uuh0Var, boolean z) {
        this.a = uuh0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvh0)) {
            return false;
        }
        fvh0 fvh0Var = (fvh0) obj;
        return this.a.equals(fvh0Var.a) && this.b == fvh0Var.b;
    }

    @Override // xsna.l9i
    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchHistoryProviderComponentParams(config=");
        sb.append(this.a);
        sb.append(", useObjectedSearchHistory=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
