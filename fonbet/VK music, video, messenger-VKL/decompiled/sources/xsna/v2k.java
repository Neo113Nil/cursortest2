package xsna;

/* compiled from: Cover.kt */
/* loaded from: classes7.dex */
public final class v2k {
    public final zhf0 a;
    public final zhf0 b;
    public final en10 c;

    public v2k(zhf0 zhf0Var, zhf0 zhf0Var2, en10 en10Var) {
        this.a = zhf0Var;
        this.b = zhf0Var2;
        this.c = en10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2k)) {
            return false;
        }
        v2k v2kVar = (v2k) obj;
        return this.a.equals(v2kVar.a) && this.b.equals(v2kVar.b) && this.c.equals(v2kVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CoverInfo(imageRectInitial=" + this.a + ", coverRect=" + this.b + ", matrixInitial=" + ((Object) qow.b(this.c)) + ')';
    }
}
