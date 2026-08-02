package xsna;

/* compiled from: UiCropFormat.kt */
/* loaded from: classes4.dex */
public final class typ0 {
    public final ghk a;
    public final boolean b;

    public typ0(ghk ghkVar, boolean z) {
        this.a = ghkVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof typ0)) {
            return false;
        }
        typ0 typ0Var = (typ0) obj;
        return epx.f(this.a, typ0Var.a) && this.b == typ0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UiCropFormat(description=" + this.a + ", isSelected=" + this.b + ")";
    }
}
