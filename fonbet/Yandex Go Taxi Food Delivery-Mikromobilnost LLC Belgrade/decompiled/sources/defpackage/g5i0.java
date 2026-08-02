package defpackage;

/* loaded from: classes.dex */
public final class g5i0 {
    public final String a;
    public final ums b;

    public g5i0(String str, ums umsVar) {
        this.a = str;
        this.b = umsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g5i0) {
            g5i0 g5i0Var = (g5i0) obj;
            return this.a.equals(g5i0Var.a) && this.b == g5i0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 961;
    }

    public final String toString() {
        return "AppHostStatics(uploadUrl=" + this.a + ", network=" + this.b + ", threadStatsTagDelegate=null, uploadErrorHandler=null)";
    }
}
