package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: NewsEntryWithExtraParams.kt */
/* loaded from: classes18.dex */
public final class kb60<K extends NewsEntry> {
    public final Post a;
    public final String b;

    public kb60(String str, Post post) {
        this.a = post;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb60)) {
            return false;
        }
        kb60 kb60Var = (kb60) obj;
        return this.a.equals(kb60Var.a) && epx.f(this.b, kb60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsEntryWithExtraParams(newsEntry=");
        sb.append(this.a);
        sb.append(", creationEntryPoint=");
        return ho8.a(sb, this.b, ')');
    }
}
