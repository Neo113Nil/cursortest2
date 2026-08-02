package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;

/* compiled from: PostponedPostsViewState.kt */
/* loaded from: classes4.dex */
public final class htc0 implements lm50 {
    public final sq60 b;
    public final ListLoadingState c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public htc0(sq60 sq60Var, ListLoadingState listLoadingState, boolean z, boolean z2, boolean z3) {
        this.b = sq60Var;
        this.c = listLoadingState;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htc0)) {
            return false;
        }
        htc0 htc0Var = (htc0) obj;
        return epx.f(this.b, htc0Var.b) && this.c == htc0Var.c && this.d == htc0Var.d && this.e == htc0Var.e && this.f == htc0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostponedPostsViewState(items=");
        sb.append(this.b);
        sb.append(", loadingState=");
        sb.append(this.c);
        sb.append(", isLoaderVisible=");
        sb.append(this.d);
        sb.append(", isErrorVisible=");
        sb.append(this.e);
        sb.append(", isEmptyVisible=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
