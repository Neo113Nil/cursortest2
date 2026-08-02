package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.bwy;

/* compiled from: NewsEntryLazyLoader.kt */
/* loaded from: classes4.dex */
public final class va60 {
    public final zof a;
    public final HashMap<NewsEntry, io.reactivex.rxjava3.disposables.c> b = new HashMap<>();
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new f4(26));

    public va60(zof zofVar) {
        this.a = zofVar;
    }

    public final void a() {
        HashMap<NewsEntry, io.reactivex.rxjava3.disposables.c> hashMap = this.b;
        for (Object obj : hashMap.values()) {
            if (obj != null) {
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
            }
        }
        hashMap.clear();
    }

    public final io.reactivex.rxjava3.disposables.c b(NewsEntry newsEntry, io.reactivex.rxjava3.core.q<NewsEntry> qVar) {
        bwy bwyVar = newsEntry.f;
        bwy.c cVar = bwy.c.a;
        if (epx.f(bwyVar, cVar) || epx.f(bwyVar, bwy.a.a)) {
            return null;
        }
        newsEntry.f = cVar;
        if (!(newsEntry instanceof YandexNativeAdEntry)) {
            ce60.b.getClass();
            p870.f().e(135, new Pair(newsEntry, newsEntry));
        }
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new f5y(new qb6(19, newsEntry, this), 10), new nex(new gb(23, newsEntry, this), 7));
        this.b.put(newsEntry, subscribe);
        return subscribe;
    }
}
