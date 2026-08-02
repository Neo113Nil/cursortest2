package xsna;

/* compiled from: AuthorHeaderMediaPagerState.kt */
/* loaded from: classes5.dex */
public final class ka5 {
    public final b95 a;
    public final c95 b;
    public final com.vk.repository.internal.repos.stickers.suggests.a c;

    public ka5(b95 b95Var, c95 c95Var, com.vk.repository.internal.repos.stickers.suggests.a aVar) {
        this.a = b95Var;
        this.b = c95Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka5)) {
            return false;
        }
        ka5 ka5Var = (ka5) obj;
        return this.a.equals(ka5Var.a) && this.b.equals(ka5Var.b) && this.c.equals(ka5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AuthorHeaderPaginationCallbacks(onCurrentPageChanged=" + this.a + ", onSettledPageChanged=" + this.b + ", onProgressChanged=" + this.c + ')';
    }
}
