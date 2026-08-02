package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: DiscoverSimilarFeedMviState.kt */
/* loaded from: classes4.dex */
public final class l8n implements tw60<l8n> {
    public final String b;
    public final String c;
    public final List<NewsEntry> d;
    public final ur60 e;
    public final String f;
    public final s1q g;
    public final String h;
    public final String i;
    public final boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public l8n(String str, String str2, List<? extends NewsEntry> list, ur60 ur60Var, String str3, s1q s1qVar, String str4, String str5, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = ur60Var;
        this.f = str3;
        this.g = s1qVar;
        this.h = str4;
        this.i = str5;
        this.j = z;
    }

    public static l8n a(l8n l8nVar, String str, ur60 ur60Var, String str2, int i) {
        if ((i & 1) != 0) {
            str = l8nVar.b;
        }
        String str3 = str;
        String str4 = l8nVar.c;
        List<NewsEntry> list = l8nVar.d;
        if ((i & 16) != 0) {
            str2 = l8nVar.f;
        }
        String str5 = str2;
        s1q s1qVar = l8nVar.g;
        String str6 = l8nVar.h;
        String str7 = (i & 128) != 0 ? l8nVar.i : null;
        boolean z = l8nVar.j;
        l8nVar.getClass();
        return new l8n(str3, str4, list, ur60Var, str5, s1qVar, str6, str7, z);
    }

    @Override // xsna.tw60
    public final l8n b(ur60 ur60Var) {
        return a(this, null, ur60Var, null, 503);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8n)) {
            return false;
        }
        l8n l8nVar = (l8n) obj;
        return epx.f(this.b, l8nVar.b) && epx.f(this.c, l8nVar.c) && epx.f(this.d, l8nVar.d) && epx.f(this.e, l8nVar.e) && epx.f(this.f, l8nVar.f) && epx.f(this.g, l8nVar.g) && epx.f(this.h, l8nVar.h) && epx.f(this.i, l8nVar.i) && this.j == l8nVar.j;
    }

    public final int hashCode() {
        int a = urd0.a((this.e.hashCode() + fw3.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31, 31, this.f);
        s1q s1qVar = this.g;
        int hashCode = (a + (s1qVar == null ? 0 : s1qVar.hashCode())) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return Boolean.hashCode(this.j) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // xsna.tw60
    public final ur60 p() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverSimilarFeedMviState(title=");
        sb.append(this.b);
        sb.append(", feedId=");
        sb.append(this.c);
        sb.append(", recommendedPosts=");
        sb.append(this.d);
        sb.append(", listState=");
        sb.append(this.e);
        sb.append(", refer=");
        sb.append(this.f);
        sb.append(", recommendedPostsExcerptConfig=");
        sb.append(this.g);
        sb.append(", trackCode=");
        sb.append(this.h);
        sb.append(", scrollToPost=");
        sb.append(this.i);
        sb.append(", shouldExpandPost=");
        return defpackage.q0.a(sb, this.j, ')');
    }
}
