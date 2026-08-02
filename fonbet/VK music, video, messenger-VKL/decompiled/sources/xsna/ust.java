package xsna;

import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Counters;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: GetModalPostReactionsInfoUseCase.kt */
/* loaded from: classes4.dex */
public final class ust {
    public final NewsEntry a;
    public final long b;
    public final UserId c;
    public final LikesGetList.Type d;
    public final Counters e;
    public final UserId f;
    public final rtt g;

    public ust(NewsEntry newsEntry, long j, UserId userId, LikesGetList.Type type, Counters counters, UserId userId2, rtt rttVar) {
        this.a = newsEntry;
        this.b = j;
        this.c = userId;
        this.d = type;
        this.e = counters;
        this.f = userId2;
        this.g = rttVar;
    }
}
