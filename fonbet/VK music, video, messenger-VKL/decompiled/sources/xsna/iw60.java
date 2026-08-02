package xsna;

import com.vk.newsfeed.domain.model.NewsfeedInitialPost;
import org.json.JSONObject;

/* compiled from: NewsfeedRequestParams.kt */
/* loaded from: classes4.dex */
public final class iw60 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;
    public final long f;
    public final boolean g;
    public final String h;
    public final String i;
    public final JSONObject j;
    public final Boolean k;
    public final boolean l;
    public final NewsfeedInitialPost m;

    public iw60(String str, int i, int i2, boolean z, String str2, long j, boolean z2, String str3, String str4, JSONObject jSONObject, Boolean bool, boolean z3, NewsfeedInitialPost newsfeedInitialPost) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = str2;
        this.f = j;
        this.g = z2;
        this.h = str3;
        this.i = str4;
        this.j = jSONObject;
        this.k = bool;
        this.l = z3;
        this.m = newsfeedInitialPost;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw60)) {
            return false;
        }
        iw60 iw60Var = (iw60) obj;
        return epx.f(this.a, iw60Var.a) && this.b == iw60Var.b && this.c == iw60Var.c && this.d == iw60Var.d && epx.f(this.e, iw60Var.e) && this.f == iw60Var.f && this.g == iw60Var.g && epx.f(this.h, iw60Var.h) && epx.f(this.i, iw60Var.i) && epx.f(this.j, iw60Var.j) && epx.f(this.k, iw60Var.k) && this.l == iw60Var.l && epx.f(this.m, iw60Var.m);
    }

    public final int hashCode() {
        String str = this.a;
        int b = qoy.b(bh10.a(urd0.a(qoy.b(shy.a(this.c, shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str2 = this.h;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        JSONObject jSONObject = this.j;
        int hashCode3 = (hashCode2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 961;
        Boolean bool = this.k;
        int b2 = qoy.b((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.l);
        NewsfeedInitialPost newsfeedInitialPost = this.m;
        return b2 + (newsfeedInitialPost != null ? newsfeedInitialPost.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedRequestParams(startFrom=" + this.a + ", count=" + this.b + ", listId=" + this.c + ", isNewsfeedSmart=" + this.d + ", deviceInfo=" + this.e + ", requestId=" + this.f + ", shouldSkipLocal=" + this.g + ", promoListId=" + this.h + ", intent=" + this.i + ", geo=" + this.j + ", accessKey=null, hasCachedItems=" + this.k + ", forceFilterCache=" + this.l + ", initialPost=" + this.m + ')';
    }
}
