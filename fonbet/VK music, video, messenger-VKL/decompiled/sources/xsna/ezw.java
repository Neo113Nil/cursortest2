package xsna;

import com.vk.newsfeed.posting.api.model.PostingMediaEntryPoint;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class ezw {
    public final dpc0 a;
    public final String b;
    public final PostingMediaEntryPoint c;

    public ezw(dpc0 dpc0Var, String str, PostingMediaEntryPoint postingMediaEntryPoint) {
        this.a = dpc0Var;
        this.b = str;
        this.c = postingMediaEntryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezw)) {
            return false;
        }
        ezw ezwVar = (ezw) obj;
        return epx.f(this.a, ezwVar.a) && epx.f(this.b, ezwVar.b) && this.c == ezwVar.c;
    }

    public final int hashCode() {
        dpc0 dpc0Var = this.a;
        return this.c.hashCode() + urd0.a((dpc0Var == null ? 0 : dpc0Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "InitialPostingViewData(toolbarViewState=" + this.a + ", text=" + this.b + ", mediaEntryPoint=" + this.c + ')';
    }
}
