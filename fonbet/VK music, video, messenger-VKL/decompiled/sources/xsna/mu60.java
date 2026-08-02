package xsna;

import com.vk.newsfeed.domain.model.NewsfeedInitialPost;

/* compiled from: NewsfeedPageParams.kt */
/* loaded from: classes4.dex */
public final class mu60 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final boolean f;
    public final boolean g;
    public final NewsfeedInitialPost h;

    public mu60(String str, int i, String str2, String str3, Boolean bool, boolean z, boolean z2, NewsfeedInitialPost newsfeedInitialPost, int i2) {
        bool = (i2 & 32) != 0 ? null : bool;
        z = (i2 & 64) != 0 ? false : z;
        z2 = (i2 & 128) != 0 ? false : z2;
        newsfeedInitialPost = (i2 & 256) != 0 ? null : newsfeedInitialPost;
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = bool;
        this.f = z;
        this.g = z2;
        this.h = newsfeedInitialPost;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu60)) {
            return false;
        }
        mu60 mu60Var = (mu60) obj;
        return epx.f(this.a, mu60Var.a) && this.b == mu60Var.b && epx.f(this.c, mu60Var.c) && this.d.equals(mu60Var.d) && epx.f(this.e, mu60Var.e) && this.f == mu60Var.f && this.g == mu60Var.g && epx.f(this.h, mu60Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int a = shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.c;
        int a2 = urd0.a((a + (str2 == null ? 0 : str2.hashCode())) * 31, 961, this.d);
        Boolean bool = this.e;
        int b = qoy.b(qoy.b((a2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f), 31, this.g);
        NewsfeedInitialPost newsfeedInitialPost = this.h;
        return b + (newsfeedInitialPost != null ? newsfeedInitialPost.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedPageParams(startFrom=" + this.a + ", listId=" + this.b + ", promoListId=" + this.c + ", intent=" + this.d + ", accessKey=null, hasCachedItems=" + this.e + ", shouldSkipLocal=" + this.f + ", forceFilterCache=" + this.g + ", initialPost=" + this.h + ')';
    }
}
