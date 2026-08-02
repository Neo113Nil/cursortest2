package xsna;

import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.discover.carousel.Carousel;
import com.vk.dto.newsfeed.entries.ClipsEntry;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.InterestingStoriesEntry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.dto.newsfeed.entries.RecommendedMiniAppEntry;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vk.newsfeed.common.prefetch.ClipsPrefetchHelper;
import java.util.HashMap;
import kotlin.Lazy;

/* compiled from: LazyLoadBlocksDelegate.kt */
/* loaded from: classes4.dex */
public final class awy {
    public final io.reactivex.rxjava3.disposables.b a;
    public final lo60 b;
    public final Lazy<zof> c;
    public final va60 d;

    public awy(io.reactivex.rxjava3.disposables.b bVar, lo60 lo60Var, Lazy lazy) {
        this.a = bVar;
        this.b = lo60Var;
        this.c = lazy;
        this.d = new va60((zof) lazy.getValue());
    }

    public final void a() {
        this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(NewsEntry newsEntry) {
        de b;
        io.reactivex.rxjava3.disposables.c b2;
        yzc0 yzc0Var = yzc0.b;
        if (newsEntry instanceof ProfilesRecommendations) {
            b = (bss) yzc0.o.getValue();
        } else if (newsEntry instanceof GroupsSuggestions) {
            b = (nqu) yzc0.p.getValue();
        } else if (newsEntry instanceof Carousel) {
            int i = ((Carousel) newsEntry).m;
            b = i != 26 ? i != 37 ? i != 44 ? i != 63 ? (sno) yzc0.v.getValue() : (h9t) yzc0.J.getValue() : (psd0) yzc0.C.getValue() : (a350) yzc0.K.getValue() : (tq20) yzc0.I.getValue();
        } else {
            b = newsEntry instanceof Videos ? epx.f(((Videos) newsEntry).s, "videos_for_you") ? (e6n0) yzc0.D.getValue() : (sno) yzc0.v.getValue() : newsEntry instanceof ClipsEntry ? (ClipsPrefetchHelper) yzc0.E.getValue() : newsEntry instanceof DiscoverMediaBlock ? (s4n) yzc0.H.getValue() : newsEntry instanceof InterestingStoriesEntry ? (bfx) yzc0.F.getValue() : newsEntry instanceof Digest ? (mx3) yzc0.L.getValue() : newsEntry instanceof MyTargetNativeAdEntry ? (cs50) yzc0.M.getValue() : newsEntry instanceof OptionalNativeAdEntry ? (tt80) yzc0.N.getValue() : newsEntry instanceof YandexNativeAdEntry ? (h5y0) yzc0.O.getValue() : newsEntry instanceof RecommendedMiniAppEntry ? (adf0) yzc0.P.getValue() : yzc0.b(newsEntry.zb());
        }
        io.reactivex.rxjava3.core.q<NewsEntry> e0 = b.e0((String) this.b.get(), newsEntry);
        if (e0 == null) {
            return;
        }
        va60 va60Var = this.d;
        HashMap<NewsEntry, io.reactivex.rxjava3.disposables.c> hashMap = va60Var.b;
        if (hashMap.containsKey(newsEntry)) {
            b2 = hashMap.get(newsEntry);
            if (b2 == null || b2.h()) {
                hashMap.remove(newsEntry);
            }
            if (b2 == null) {
                this.a.b(b2);
                return;
            }
            return;
        }
        b2 = va60Var.b(newsEntry, e0);
        if (b2 == null) {
        }
    }
}
