package xsna;

import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.hg1;

/* compiled from: GamesCarouselPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class h9t extends de {
    public final bpn0 b = new bpn0(new x0(14));

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 0;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        return null;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        if (!(newsEntry instanceof AppCarousel)) {
            return null;
        }
        dz2 x = yfb.x(((vf3) this.b.getValue()).a(((AppCarousel) newsEntry).l));
        x.n = true;
        return new io.reactivex.rxjava3.internal.operators.observable.i0(rsg0.y0(x, null, null, 3).U(new sj4(new g9t(newsEntry), 15)), new hg1.o1()).U(new hg1.n1());
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
