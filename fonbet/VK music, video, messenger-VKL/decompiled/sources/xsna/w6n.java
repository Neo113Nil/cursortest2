package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.domain.model.NewsfeedSimilarFeedType;
import java.util.List;
import kotlin.Lazy;

/* compiled from: DiscoverSimilarFeedArguments.kt */
/* loaded from: classes4.dex */
public final class w6n {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final s1q f;
    public final String g;
    public final Long h;
    public final Integer i;
    public final NewsfeedSimilarFeedType j;
    public final Object k;

    public w6n(String str, String str2, String str3, boolean z, String str4, s1q s1qVar, String str5, Long l, Integer num, NewsfeedSimilarFeedType newsfeedSimilarFeedType, Lazy<? extends List<? extends NewsEntry>> lazy) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = s1qVar;
        this.g = str5;
        this.h = l;
        this.i = num;
        this.j = newsfeedSimilarFeedType;
        this.k = lazy;
    }
}
