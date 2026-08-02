package xsna;

/* compiled from: PostingCarouselSwitcherState.kt */
/* loaded from: classes3.dex */
public final class ldc0 {
    public final boolean a;
    public final boolean b;

    public ldc0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldc0)) {
            return false;
        }
        ldc0 ldc0Var = (ldc0) obj;
        return this.a == ldc0Var.a && this.b == ldc0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingCarouselSwitcherState(isVisibleSwitcher=");
        sb.append(this.a);
        sb.append(", isGridLayout=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
