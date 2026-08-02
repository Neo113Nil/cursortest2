package xsna;

/* compiled from: UiCropEvent.kt */
/* loaded from: classes4.dex */
public final class syp0 {
    public final uyp0 a;
    public final boolean b;

    public syp0(uyp0 uyp0Var, boolean z) {
        this.a = uyp0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syp0)) {
            return false;
        }
        syp0 syp0Var = (syp0) obj;
        return this.a.equals(syp0Var.a) && this.b == syp0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UiCropEvent(state=" + this.a + ", silently=" + this.b + ")";
    }
}
