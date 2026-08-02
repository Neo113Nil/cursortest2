package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: NewsfeedPage.kt */
/* loaded from: classes4.dex */
public abstract class lu60 {
    public final List<NewsEntry> a;
    public final String b;
    public final Boolean c;

    public lu60() {
        throw null;
    }

    public lu60(List list, String str, Boolean bool) {
        this.a = list;
        this.b = str;
        this.c = bool;
    }

    public List<NewsEntry> a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public Boolean c() {
        return this.c;
    }
}
