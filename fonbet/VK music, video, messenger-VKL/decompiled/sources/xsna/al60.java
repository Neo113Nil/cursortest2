package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import java.util.Map;

/* compiled from: NewsfeedHeaterLocalPage.kt */
/* loaded from: classes4.dex */
public final class al60 extends lu60 {
    public final List<NewsEntry> d;
    public final String e;
    public final Boolean f;
    public final Map<NewsEntry, Object> g;
    public final boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public al60(List<? extends NewsEntry> list, String str, Boolean bool, Map<NewsEntry, ? extends Object> map, boolean z) {
        super(list, str, bool);
        this.d = list;
        this.e = str;
        this.f = bool;
        this.g = map;
        this.h = z;
    }

    @Override // xsna.lu60
    public final List<NewsEntry> a() {
        return this.d;
    }

    @Override // xsna.lu60
    public final String b() {
        return this.e;
    }

    @Override // xsna.lu60
    public final Boolean c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al60)) {
            return false;
        }
        al60 al60Var = (al60) obj;
        return epx.f(this.d, al60Var.d) && epx.f(this.e, al60Var.e) && epx.f(this.f, al60Var.f) && epx.f(this.g, al60Var.g) && this.h == al60Var.h;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f;
        return Boolean.hashCode(this.h) + v11.a((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedHeaterLocalPage(items=");
        sb.append(this.d);
        sb.append(", nextFrom=");
        sb.append(this.e);
        sb.append(", isSmartNews=");
        sb.append(this.f);
        sb.append(", prefetchedItems=");
        sb.append(this.g);
        sb.append(", isFiltered=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
