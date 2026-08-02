package defpackage;

/* loaded from: classes12.dex */
public final class i8i0 implements k8i0 {
    public final up2 a;

    public i8i0(up2 up2Var) {
        this.a = up2Var;
    }

    @Override // defpackage.k8i0
    public final ovi0 a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8i0) && this.a.equals(((i8i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Color(color=" + this.a + ", selectedStarBackgroundTag=null)";
    }
}
