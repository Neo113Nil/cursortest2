package xsna;

/* compiled from: AuthorHeaderPicturePager.kt */
/* loaded from: classes5.dex */
public final class wb90 {
    public final mc90 a;
    public final bc90 b;
    public final ka5 c;
    public final yvj d;

    public wb90(mc90 mc90Var, bc90 bc90Var, ka5 ka5Var, yvj yvjVar) {
        this.a = mc90Var;
        this.b = bc90Var;
        this.c = ka5Var;
        this.d = yvjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb90)) {
            return false;
        }
        wb90 wb90Var = (wb90) obj;
        return epx.f(this.a, wb90Var.a) && epx.f(this.b, wb90Var.b) && epx.f(this.c, wb90Var.c) && epx.f(this.d, wb90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PagerPictureClickContext(pagerState=" + this.a + ", pagerSettings=" + this.b + ", paginationCallbacks=" + this.c + ", coroutineScope=" + this.d + ')';
    }
}
