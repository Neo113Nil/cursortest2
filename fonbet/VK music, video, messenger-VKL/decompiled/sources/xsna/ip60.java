package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import xsna.yo60;

/* compiled from: NewsfeedListEvent.kt */
/* loaded from: classes4.dex */
public final class ip60 implements yo60.c {
    public final NewsEntry a;
    public final Integer b;

    public ip60(NewsEntry newsEntry, Integer num) {
        this.a = newsEntry;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip60)) {
            return false;
        }
        ip60 ip60Var = (ip60) obj;
        return epx.f(this.a, ip60Var.a) && epx.f(this.b, ip60Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublishSuggestedPost(item=");
        sb.append(this.a);
        sb.append(", listItemPosition=");
        return uqi.b(sb, this.b, ')');
    }
}
