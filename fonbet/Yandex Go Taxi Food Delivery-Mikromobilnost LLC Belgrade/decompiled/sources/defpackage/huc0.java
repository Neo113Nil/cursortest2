package defpackage;

/* loaded from: classes8.dex */
public final class huc0 {
    public final String a;
    public final lnc0 b;

    public huc0(String str, lnc0 lnc0Var) {
        this.a = str;
        this.b = lnc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huc0)) {
            return false;
        }
        huc0 huc0Var = (huc0) obj;
        return this.a.equals(huc0Var.a) && this.b.equals(huc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Element(__typename=" + this.a + ", plaqueLevelElement=" + this.b + ')';
    }
}
