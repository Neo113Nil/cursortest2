package xsna;

import com.vk.ads.analytics.NativeAdType;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonContextDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonTypeDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselItemDescriptionTypeDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselItemDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemAppsCarouselDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.actions.ActionOpenVkApp;
import com.vk.dto.common.actions.ButtonContext;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.discover.carousel.CarouselDescription;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.dto.discover.carousel.apps.AppCarouselItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class g9t implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ NewsEntry c;

    public /* synthetic */ g9t(NewsEntry newsEntry) {
        this.c = newsEntry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Action actionOpenUrl;
        ArrayList arrayList;
        String str;
        Action actionOpenUrl2;
        String str2;
        int i;
        ApiApplication apiApplication;
        Object obj2;
        long j;
        int i2 = this.b;
        String str3 = null;
        NewsEntry newsEntry = this.c;
        switch (i2) {
            case 0:
                NewsfeedItemAppsCarouselDto newsfeedItemAppsCarouselDto = (NewsfeedItemAppsCarouselDto) obj;
                newsEntry.e = false;
                AppCarousel appCarousel = (AppCarousel) newsEntry;
                List<AppsAppDto> f = newsfeedItemAppsCarouselDto.f();
                new re3();
                appCarousel.r = newsfeedItemAppsCarouselDto.getTitle();
                String title = newsfeedItemAppsCarouselDto.d().getTitle();
                int i3 = AppCarousel.a.$EnumSwitchMapping$0[newsfeedItemAppsCarouselDto.d().d().e().ordinal()];
                int i4 = 2;
                int i5 = 1;
                if (i3 == 1) {
                    String url = newsfeedItemAppsCarouselDto.d().d().getUrl();
                    if (url == null) {
                        url = "";
                    }
                    actionOpenUrl = new ActionOpenUrl(url, null, 2, null);
                } else {
                    if (i3 != 2 && i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    long d = newsfeedItemAppsCarouselDto.d().d().d() != null ? r8.d() : 0L;
                    String url2 = newsfeedItemAppsCarouselDto.d().d().getUrl();
                    long d2 = newsfeedItemAppsCarouselDto.d().d().d() != null ? r10.d() : 0L;
                    DiscoverCarouselButtonContextDto d3 = newsfeedItemAppsCarouselDto.d().d().d();
                    String e = d3 != null ? d3.e() : null;
                    DiscoverCarouselButtonContextDto d4 = newsfeedItemAppsCarouselDto.d().d().d();
                    actionOpenUrl = new ActionOpenVkApp(null, d, url2, new ButtonContext(d2, e, d4 != null ? d4.f() : null));
                }
                DiscoverCarouselButtonTypeDto e2 = newsfeedItemAppsCarouselDto.d().e();
                appCarousel.i = new LinkButton(title, actionOpenUrl, e2 != null ? e2.i() : null);
                List<DiscoverCarouselItemDto> e3 = newsfeedItemAppsCarouselDto.e();
                int i6 = 10;
                ArrayList arrayList2 = new ArrayList(c5g.u(e3, 10));
                for (DiscoverCarouselItemDto discoverCarouselItemDto : e3) {
                    DiscoverCarouselButtonContextDto d5 = discoverCarouselItemDto.d().d().d();
                    Integer valueOf = d5 != null ? Integer.valueOf(d5.d()) : str3;
                    DiscoverCarouselButtonDto d6 = discoverCarouselItemDto.d();
                    String title2 = discoverCarouselItemDto.getTitle();
                    List<BaseImageDto> f2 = discoverCarouselItemDto.f();
                    if (f2 != null) {
                        List<BaseImageDto> list = f2;
                        arrayList = new ArrayList(c5g.u(list, i6));
                        for (BaseImageDto baseImageDto : list) {
                            arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                        }
                    } else {
                        arrayList = null;
                    }
                    Image image = new Image(arrayList);
                    String title3 = d6.getTitle();
                    int i7 = AppCarousel.a.$EnumSwitchMapping$0[d6.d().e().ordinal()];
                    if (i7 == i5) {
                        str = title3;
                        String url3 = d6.d().getUrl();
                        if (url3 == null) {
                            url3 = "";
                        }
                        str2 = null;
                        i = 2;
                        actionOpenUrl2 = new ActionOpenUrl(url3, null, 2, null);
                    } else {
                        if (i7 != i4 && i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (valueOf != 0) {
                            str = title3;
                            j = valueOf.intValue();
                        } else {
                            str = title3;
                            j = 0;
                        }
                        String url4 = d6.d().getUrl();
                        long d7 = d6.d().d() != null ? r13.d() : 0L;
                        DiscoverCarouselButtonContextDto d8 = d6.d().d();
                        String e4 = d8 != null ? d8.e() : null;
                        DiscoverCarouselButtonContextDto d9 = d6.d().d();
                        actionOpenUrl2 = new ActionOpenVkApp(null, j, url4, new ButtonContext(d7, e4, d9 != null ? d9.f() : null));
                        str2 = null;
                        i = 2;
                    }
                    DiscoverCarouselButtonTypeDto e5 = d6.e();
                    LinkButton linkButton = new LinkButton(str, actionOpenUrl2, e5 != null ? e5.i() : str2);
                    String d10 = discoverCarouselItemDto.e().d();
                    DiscoverCarouselItemDescriptionTypeDto e6 = discoverCarouselItemDto.e().e();
                    CarouselDescription carouselDescription = new CarouselDescription(d10, e6 != null ? e6.i() : str2);
                    if (f != null) {
                        Iterator<T> it = f.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                int id = ((AppsAppDto) obj2).getId();
                                if (valueOf != 0 && id == valueOf.intValue()) {
                                }
                            } else {
                                obj2 = str2;
                            }
                        }
                        AppsAppDto appsAppDto = (AppsAppDto) obj2;
                        if (appsAppDto != null) {
                            apiApplication = re3.b(appsAppDto);
                            arrayList2.add(new AppCarouselItem(title2, image, linkButton, carouselDescription, apiApplication));
                            str3 = str2;
                            i4 = i;
                            i6 = 10;
                            i5 = 1;
                        }
                    }
                    apiApplication = str2;
                    arrayList2.add(new AppCarouselItem(title2, image, linkButton, carouselDescription, apiApplication));
                    str3 = str2;
                    i4 = i;
                    i6 = 10;
                    i5 = 1;
                }
                appCarousel.o = arrayList2;
                return appCarousel;
            default:
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.FEED_APPLOVIN_TRACKCODE.h(), null, newsEntry.Cb().b, null, "click", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -22, 3, null);
                l5mVar.q();
                NativeAdType nativeAdType = NativeAdType.APPLOVIN;
                String str4 = newsEntry.Cb().b;
                int i8 = newsEntry.Cb().c;
                ((w9v0) obj).a();
                throw null;
        }
    }
}
