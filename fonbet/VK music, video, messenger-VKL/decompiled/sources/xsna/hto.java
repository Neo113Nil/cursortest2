package xsna;

import com.vk.dto.newsfeed.entries.DzenArticlesBlock;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: DzenArticlesBlockPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class hto extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 0;
    }

    @Override // xsna.de
    public final /* bridge */ /* synthetic */ String d0(u1c0 u1c0Var, int i) {
        return null;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        if (!(newsEntry instanceof DzenArticlesBlock)) {
            return null;
        }
        dz2 x = yfb.x(new tfx("newsfeed.getDzenBlock", new dr(25), new com.vk.movika.sdk.android.defaultplayer.view.a(24)));
        x.n = true;
        return rsg0.l0(x, null, 3).U(new h7(new s6k((DzenArticlesBlock) newsEntry, this), 20)).a0(asu0.a.d());
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q<NewsEntry> f0(u1c0 u1c0Var) {
        return e0(u1c0Var.l, u1c0Var.b);
    }

    @Override // xsna.de
    public final boolean l0() {
        return true;
    }
}
