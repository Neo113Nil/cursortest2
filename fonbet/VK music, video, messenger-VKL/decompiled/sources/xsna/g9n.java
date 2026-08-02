package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;

/* compiled from: DiscoverSimilarFeedViewState.kt */
/* loaded from: classes4.dex */
public final class g9n implements lm50 {
    public final String b;
    public final sq60 c;
    public final int d;
    public final ListLoadingState e;
    public final boolean f;
    public final boolean g;

    public g9n(String str, sq60 sq60Var, int i, ListLoadingState listLoadingState, boolean z, boolean z2) {
        this.b = str;
        this.c = sq60Var;
        this.d = i;
        this.e = listLoadingState;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9n)) {
            return false;
        }
        g9n g9nVar = (g9n) obj;
        return epx.f(this.b, g9nVar.b) && epx.f(this.c, g9nVar.c) && this.d == g9nVar.d && this.e == g9nVar.e && this.f == g9nVar.f && this.g == g9nVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b((this.e.hashCode() + shy.a(this.d, (this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverSimilarFeedViewState(title=");
        sb.append(this.b);
        sb.append(", items=");
        sb.append(this.c);
        sb.append(", scrollToPosition=");
        sb.append(this.d);
        sb.append(", loadingState=");
        sb.append(this.e);
        sb.append(", isLoaderVisible=");
        sb.append(this.f);
        sb.append(", isErrorVisible=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
