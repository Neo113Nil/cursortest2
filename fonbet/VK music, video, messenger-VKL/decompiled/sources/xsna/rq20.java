package xsna;

import android.content.Context;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.FriendsUseApp;
import com.vk.dto.discover.carousel.CarouselDescription;
import com.vk.dto.discover.carousel.apps.AppCarouselItem;
import com.vk.external.miniapp.net.app.ProfileItem;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MiniAppsCarouselItemTransformer.kt */
/* loaded from: classes4.dex */
public final class rq20 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    public static RecommendationsCarouselItemUiDto a(Context context, AppCarouselItem appCarouselItem) {
        String str;
        RecommendationsCarouselItemUiDto.a aVar;
        FriendsUseApp friendsUseApp;
        ?? r8;
        ApiApplication apiApplication = appCarouselItem.f;
        String str2 = appCarouselItem.b;
        if (str2 == null) {
            str2 = "";
        }
        RecommendationsCarouselItemUiDto.c cVar = new RecommendationsCarouselItemUiDto.c(str2, null, null, 30);
        CarouselDescription carouselDescription = appCarouselItem.e;
        if (carouselDescription == null || (str = carouselDescription.b) == null) {
            str = "";
        }
        Image image = appCarouselItem.c;
        RecommendationsCarouselItemUiDto.b bVar = image != null ? new RecommendationsCarouselItemUiDto.b(image, null) : null;
        if (apiApplication == null || (friendsUseApp = apiApplication.Q) == null) {
            aVar = null;
        } else {
            String str3 = friendsUseApp.b;
            List H0 = j5g.H0(friendsUseApp.c, 2);
            if (H0 != null) {
                List list = H0;
                int i = 10;
                r8 = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List<WebImageSize> list2 = ((ProfileItem) it.next()).c.b;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, i));
                    for (WebImageSize webImageSize : list2) {
                        arrayList.add(new ImageSize(webImageSize.b, webImageSize.d, webImageSize.c, null, webImageSize.e, webImageSize.f, 8, null));
                    }
                    r8.add(new Image(arrayList));
                    i = 10;
                }
            } else {
                r8 = EmptyList.b;
            }
            aVar = new RecommendationsCarouselItemUiDto.a(str3, new RecommendationsCarouselItemUiDto.a.InterfaceC1369a.b(r8), true);
        }
        return new RecommendationsCarouselItemUiDto(cVar, str, bVar, aVar, apiApplication != null ? apiApplication.zb().equals(Boolean.FALSE) : false ? new RecommendationsCarouselItemUiDto.ActionButtonData(context.getString(R.string.feed_feature_block_service), null, null, null, 14) : null);
    }
}
