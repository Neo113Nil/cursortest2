package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.metrics.trackers.my.event.SingleEvent;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.nax0;

/* compiled from: CommonShareBridge.kt */
/* loaded from: classes7.dex */
public final class img implements hx2<NewsEntry> {
    public final /* synthetic */ Ref$ObjectRef<nax0> b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public img(Ref$ObjectRef<nax0> ref$ObjectRef, boolean z, boolean z2) {
        this.b = ref$ObjectRef;
        this.c = z;
        this.d = z2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, xsna.nax0$b] */
    @Override // xsna.hx2
    public final void b(NewsEntry newsEntry) {
        NewsEntry newsEntry2 = newsEntry;
        if (newsEntry2 instanceof Post) {
            Post post = (Post) newsEntry2;
            this.b.element = new nax0.b(post.n, post.m);
            if (!this.c) {
                ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                jt50.a(SingleEvent.POST);
                qr.d(ce60.b, 105, newsEntry2);
            } else {
                ce60.b.getClass();
                p870 f = p870.f();
                int i = post.n;
                UserId userId = post.m;
                Counters counters = post.E;
                f.e(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, new u0q(i, userId, counters.b, counters.c, post.W, this.d, this.c));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, xsna.nax0$a] */
    @Override // xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        this.b.element = new nax0.a(vKApiExecutionException);
        L.G("SharingBridge.NewPostRequest", vKApiExecutionException.toString());
    }
}
