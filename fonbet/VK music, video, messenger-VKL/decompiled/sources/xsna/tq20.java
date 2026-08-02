package xsna;

import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonContextDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselItemDescriptionTypeDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselItemDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemAppsCarouselDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.discover.carousel.CarouselDescription;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.dto.discover.carousel.apps.AppCarouselItem;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hg1;

/* compiled from: MiniAppsCarouselPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class tq20 extends de {
    public final bpn0 b = new bpn0(new yv2(19));

    /* compiled from: MiniAppsCarouselPrefetchHelper.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<NewsfeedItemAppsCarouselDto, AppCarousel> {
        @Override // xsna.izs
        public final AppCarousel invoke(NewsfeedItemAppsCarouselDto newsfeedItemAppsCarouselDto) {
            Object obj;
            NewsfeedItemAppsCarouselDto newsfeedItemAppsCarouselDto2 = newsfeedItemAppsCarouselDto;
            jm60 jm60Var = (jm60) this.receiver;
            jm60Var.getClass();
            List<AppsAppDto> f = newsfeedItemAppsCarouselDto2.f();
            AppCarousel appCarousel = jm60Var.a;
            s1n s1nVar = jm60Var.c;
            DiscoverCarouselButtonDto d = newsfeedItemAppsCarouselDto2.d();
            s1nVar.getClass();
            appCarousel.i = s1n.a(d);
            appCarousel.r = newsfeedItemAppsCarouselDto2.getTitle();
            List<DiscoverCarouselItemDto> e = newsfeedItemAppsCarouselDto2.e();
            ArrayList arrayList = new ArrayList(c5g.u(e, 10));
            for (DiscoverCarouselItemDto discoverCarouselItemDto : e) {
                DiscoverCarouselButtonContextDto d2 = discoverCarouselItemDto.d().d().d();
                ApiApplication apiApplication = null;
                Integer valueOf = d2 != null ? Integer.valueOf(d2.d()) : null;
                String title = discoverCarouselItemDto.getTitle();
                ne6 ne6Var = jm60Var.d;
                List<BaseImageDto> f2 = discoverCarouselItemDto.f();
                ne6Var.getClass();
                Image a = ne6.a(f2);
                LinkButton a2 = s1n.a(discoverCarouselItemDto.d());
                String d3 = discoverCarouselItemDto.e().d();
                DiscoverCarouselItemDescriptionTypeDto e2 = discoverCarouselItemDto.e().e();
                CarouselDescription carouselDescription = new CarouselDescription(d3, e2 != null ? e2.i() : null);
                if (f != null) {
                    Iterator<T> it = f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        int id = ((AppsAppDto) obj).getId();
                        if (valueOf != null && id == valueOf.intValue()) {
                            break;
                        }
                    }
                    AppsAppDto appsAppDto = (AppsAppDto) obj;
                    if (appsAppDto != null) {
                        jm60Var.b.getClass();
                        apiApplication = re3.b(appsAppDto);
                    }
                }
                arrayList.add(new AppCarouselItem(title, a, a2, carouselDescription, apiApplication));
            }
            appCarousel.o = arrayList;
            appCarousel.e = false;
            appCarousel.c = appCarousel.c;
            appCarousel.g = appCarousel.g;
            appCarousel.h = appCarousel.h;
            return appCarousel;
        }
    }

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
        AppCarousel appCarousel = (AppCarousel) newsEntry;
        dz2 x = yfb.x(((vf3) this.b.getValue()).b(appCarousel.l));
        x.n = true;
        return new io.reactivex.rxjava3.internal.operators.observable.i0(di60.N(rsg0.y0(x, null, null, 3), new a(1, new jm60(appCarousel), jm60.class, "map", "map(Lcom/vk/api/generated/newsfeed/dto/NewsfeedItemAppsCarouselDto;)Lcom/vk/dto/discover/carousel/apps/AppCarousel;", 0)), new hg1.h2()).U(new hg1.g2());
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
