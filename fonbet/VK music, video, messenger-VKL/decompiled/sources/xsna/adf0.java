package xsna;

import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemRecommendedAppBlockDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemCaptionDto;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.newsfeed.entries.RecommendedMiniAppEntry;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.external.miniapp.net.app.WebPhoto;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hg1;

/* compiled from: RecommendedGamePrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class adf0 extends de {
    public final bpn0 b = new bpn0(new c2c0(6));

    /* compiled from: RecommendedGamePrefetchHelper.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<NewsfeedItemRecommendedAppBlockDto, RecommendedMiniAppEntry> {
        @Override // xsna.izs
        public final RecommendedMiniAppEntry invoke(NewsfeedItemRecommendedAppBlockDto newsfeedItemRecommendedAppBlockDto) {
            String e;
            NewsfeedItemRecommendedAppBlockDto newsfeedItemRecommendedAppBlockDto2 = newsfeedItemRecommendedAppBlockDto;
            dn60 dn60Var = (dn60) this.receiver;
            ne6 ne6Var = dn60Var.c;
            NewsfeedNewsfeedItemCaptionDto g = newsfeedItemRecommendedAppBlockDto2.g();
            ArrayList arrayList = null;
            ActionOpenUrl actionOpenUrl = (g == null || (e = g.e()) == null) ? null : new ActionOpenUrl(e, null, 2, null);
            RecommendedMiniAppEntry recommendedMiniAppEntry = dn60Var.a;
            String i = newsfeedItemRecommendedAppBlockDto2.k().i();
            String title = newsfeedItemRecommendedAppBlockDto2.getTitle();
            String f = newsfeedItemRecommendedAppBlockDto2.f();
            String j = newsfeedItemRecommendedAppBlockDto2.j();
            re3 re3Var = dn60Var.b;
            AppsAppDto d = newsfeedItemRecommendedAppBlockDto2.d();
            re3Var.getClass();
            WebApiApplication c = chx0.c(re3.b(d));
            List<List<BaseImageDto>> i2 = newsfeedItemRecommendedAppBlockDto2.i();
            if (i2 != null) {
                List<List<BaseImageDto>> list = i2;
                arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) it.next();
                    ne6Var.getClass();
                    arrayList.add(ne6.a(list2));
                }
            }
            List<BaseImageDto> e2 = newsfeedItemRecommendedAppBlockDto2.e();
            ne6Var.getClass();
            RecommendedMiniAppEntry recommendedMiniAppEntry2 = new RecommendedMiniAppEntry(i, title, f, j, c, arrayList, ne6.a(e2), newsfeedItemRecommendedAppBlockDto2.r(), actionOpenUrl);
            recommendedMiniAppEntry2.c = recommendedMiniAppEntry.c;
            recommendedMiniAppEntry2.g = recommendedMiniAppEntry.g;
            recommendedMiniAppEntry2.h = recommendedMiniAppEntry.h;
            return recommendedMiniAppEntry2;
        }
    }

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return u1c0Var.a instanceof RecommendedMiniAppEntry ? 1 : 0;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        WebApiApplication webApiApplication;
        WebPhoto webPhoto;
        WebImage webImage;
        WebImageSize e;
        NewsEntry newsEntry = u1c0Var.a;
        RecommendedMiniAppEntry recommendedMiniAppEntry = newsEntry instanceof RecommendedMiniAppEntry ? (RecommendedMiniAppEntry) newsEntry : null;
        if (recommendedMiniAppEntry == null || (webApiApplication = recommendedMiniAppEntry.m) == null || (webPhoto = webApiApplication.d) == null || (webImage = webPhoto.b) == null || (e = webImage.e(cn70.b(48))) == null) {
            return null;
        }
        return e.b;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        if (!(newsEntry instanceof RecommendedMiniAppEntry)) {
            return null;
        }
        RecommendedMiniAppEntry recommendedMiniAppEntry = (RecommendedMiniAppEntry) newsEntry;
        dz2 x = yfb.x(((vf3) this.b.getValue()).d(recommendedMiniAppEntry.p));
        x.n = true;
        return new io.reactivex.rxjava3.internal.operators.observable.i0(di60.N(rsg0.y0(x, null, null, 3), new a(1, new dn60(recommendedMiniAppEntry), dn60.class, "map", "map(Lcom/vk/api/generated/newsfeed/dto/NewsfeedItemRecommendedAppBlockDto;)Lcom/vk/dto/newsfeed/entries/RecommendedMiniAppEntry;", 0)), new hg1.i3()).U(new hg1.h3());
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
