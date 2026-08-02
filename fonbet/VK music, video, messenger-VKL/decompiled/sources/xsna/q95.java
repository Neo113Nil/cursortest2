package xsna;

/* compiled from: AuthorHeaderLiveCoverLayout.kt */
/* loaded from: classes5.dex */
public final class q95 {
    public final boolean a;
    public final boolean b;

    public q95(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q95)) {
            return false;
        }
        q95 q95Var = (q95) obj;
        return this.a == q95Var.a && this.b == q95Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LandscapePictureHeightAdjustments(subtractAppBottomNavigationBar=");
        sb.append(this.a);
        sb.append(", subtractNavigationBarInset=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
