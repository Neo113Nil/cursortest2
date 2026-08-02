package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;

/* compiled from: FavePostsViewState.kt */
/* loaded from: classes4.dex */
public final class erq implements lm50 {
    public final sq60 b;
    public final ListLoadingState c;
    public final boolean d;
    public final boolean e;
    public final xnq f;

    public erq(sq60 sq60Var, ListLoadingState listLoadingState, boolean z, boolean z2, xnq xnqVar) {
        this.b = sq60Var;
        this.c = listLoadingState;
        this.d = z;
        this.e = z2;
        this.f = xnqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erq)) {
            return false;
        }
        erq erqVar = (erq) obj;
        return epx.f(this.b, erqVar.b) && this.c == erqVar.c && this.d == erqVar.d && this.e == erqVar.e && epx.f(this.f, erqVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b(qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "FavePostsViewState(items=" + this.b + ", loadingState=" + this.c + ", isLoaderVisible=" + this.d + ", isErrorVisible=" + this.e + ", emptyState=" + this.f + ')';
    }
}
