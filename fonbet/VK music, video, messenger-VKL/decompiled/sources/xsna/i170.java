package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.data.PostInteract;

/* compiled from: NewsfeedUiDtoContext.kt */
/* loaded from: classes4.dex */
public final class i170 {
    public final NewsEntry a;
    public final s1c0 b;
    public final String c;
    public final String d;
    public final PostInteract e;

    public i170(NewsEntry newsEntry, s1c0 s1c0Var, String str, String str2, PostInteract postInteract) {
        this.a = newsEntry;
        this.b = s1c0Var;
        this.c = str;
        this.d = str2;
        this.e = postInteract;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i170)) {
            return false;
        }
        i170 i170Var = (i170) obj;
        return epx.f(this.a, i170Var.a) && epx.f(this.b, i170Var.b) && epx.f(this.c, i170Var.c) && epx.f(this.d, i170Var.d) && epx.f(this.e, i170Var.e);
    }

    public final int hashCode() {
        int a = urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        PostInteract postInteract = this.e;
        return hashCode + (postInteract != null ? postInteract.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedUiDtoContext(entry=" + this.a + ", displayContext=" + this.b + ", referer=" + this.c + ", listReferrer=" + this.d + ", postInteract=" + this.e + ')';
    }
}
