package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: NewsfeedLocalPage.kt */
/* loaded from: classes4.dex */
public final class os60 extends lu60 {
    public final List<NewsEntry> d;
    public final String e;
    public final Boolean f;
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public os60(List<? extends NewsEntry> list, String str, Boolean bool, boolean z) {
        super(list, str, bool);
        this.d = list;
        this.e = str;
        this.f = bool;
        this.g = z;
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
        if (!(obj instanceof os60)) {
            return false;
        }
        os60 os60Var = (os60) obj;
        return epx.f(this.d, os60Var.d) && epx.f(this.e, os60Var.e) && epx.f(this.f, os60Var.f) && this.g == os60Var.g;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f;
        return Boolean.hashCode(this.g) + ((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedLocalPage(items=");
        sb.append(this.d);
        sb.append(", nextFrom=");
        sb.append(this.e);
        sb.append(", isSmartNews=");
        sb.append(this.f);
        sb.append(", isFiltered=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
