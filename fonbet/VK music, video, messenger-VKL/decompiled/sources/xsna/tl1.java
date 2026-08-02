package xsna;

/* compiled from: AlbumViewedItems.kt */
/* loaded from: classes18.dex */
public final class tl1 {
    public final sl1 a;
    public final sl1 b;
    public final sl1 c;

    public tl1(sl1 sl1Var, sl1 sl1Var2, sl1 sl1Var3) {
        this.a = sl1Var;
        this.b = sl1Var2;
        this.c = sl1Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl1)) {
            return false;
        }
        tl1 tl1Var = (tl1) obj;
        return epx.f(this.a, tl1Var.a) && epx.f(this.b, tl1Var.b) && epx.f(this.c, tl1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AlbumViewedItems(first=" + this.a + ", second=" + this.b + ", third=" + this.c + ')';
    }
}
