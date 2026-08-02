package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.apps.dto.AppsAppFieldsDto;
import com.vk.api.generated.apps.dto.AppsClearRecentsPlatformDto;
import com.vk.api.generated.apps.dto.AppsGetAndroidCatalogFilterDto;
import com.vk.api.generated.apps.dto.AppsGetCatalogFilterDto;
import com.vk.api.generated.apps.dto.AppsSearchFiltersDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: AppsService.kt */
/* loaded from: classes6.dex */
public interface vf3 {

    /* compiled from: AppsService.kt */
    public static final class a {
        public static ufx a(AppsClearRecentsPlatformDto appsClearRecentsPlatformDto) {
            ufx ufxVar = new ufx("apps.clearRecents", new dn(3), new nr(2));
            if (appsClearRecentsPlatformDto != null) {
                ufx.n(ufxVar, "platform", appsClearRecentsPlatformDto.i(), 0, 12);
            }
            return ufxVar;
        }

        public static ufx b(String str, String str2, Integer num, String str3, List list) {
            ArrayList arrayList;
            ufx ufxVar = new ufx("apps.get", new et(1), new gp(3));
            ufx.k(ufxVar, "app_id", num.intValue(), 0, 8);
            if (str != null) {
                ufx.n(ufxVar, "url", str, 0, 12);
            }
            if (str2 != null) {
                ufx.n(ufxVar, "ref", str2, 0, 12);
            }
            if (str3 != null) {
                ufx.n(ufxVar, "track_code", str3, 0, 12);
            }
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AppsAppFieldsDto) it.next()).i());
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                ufxVar.h("app_fields", arrayList);
            }
            return ufxVar;
        }

        public static ufx c(Integer num, Integer num2, String str, Integer num3, Integer num4, AppsGetAndroidCatalogFilterDto appsGetAndroidCatalogFilterDto) {
            ufx ufxVar = new ufx("apps.getAndroidCatalog", new vp(2), new jq(4));
            if (num != null) {
                ufx.k(ufxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 8);
            }
            ufx.k(ufxVar, "count", num2.intValue(), 0, 8);
            ufx.n(ufxVar, "platform", "html5", 0, 12);
            if (str != null) {
                ufx.n(ufxVar, "friendly_url", str, 0, 12);
            }
            if (num3 != null) {
                ufx.k(ufxVar, "genre_id", num3.intValue(), 0, 8);
            }
            if (num4 != null) {
                ufx.k(ufxVar, "section_id", num4.intValue(), 0, 8);
            }
            if (appsGetAndroidCatalogFilterDto != null) {
                ufx.n(ufxVar, "filter", appsGetAndroidCatalogFilterDto.j(), 0, 12);
            }
            return ufxVar;
        }

        public static ufx d(Integer num, Integer num2, String str, Integer num3, Integer num4, AppsGetCatalogFilterDto appsGetCatalogFilterDto) {
            ufx ufxVar = new ufx("apps.getCatalog", new fr(2), new gr(2));
            ufx.k(ufxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 8);
            ufx.k(ufxVar, "count", num2.intValue(), 0, 8);
            ufx.n(ufxVar, "platform", "html5", 0, 12);
            if (str != null) {
                ufx.n(ufxVar, "friendly_url", str, 0, 12);
            }
            if (num3 != null) {
                ufx.k(ufxVar, "genre_id", num3.intValue(), 0, 8);
            }
            if (num4 != null) {
                ufx.k(ufxVar, "section_id", num4.intValue(), 0, 8);
            }
            if (appsGetCatalogFilterDto != null) {
                ufx.n(ufxVar, "filter", appsGetCatalogFilterDto.i(), 0, 12);
            }
            return ufxVar;
        }

        public static ufx e(int i, UserId userId, String str, String str2, String str3) {
            ufx ufxVar = new ufx("apps.getEmbeddedUrl", new com.vk.movika.sdk.android.defaultplayer.view.a(4), new er(2));
            ufx.k(ufxVar, "app_id", i, 0, 8);
            if (userId != null) {
                ufx.m(ufxVar, "owner_id", userId, 0L, 12);
            }
            if (str != null) {
                ufx.n(ufxVar, "url", str, 0, 12);
            }
            if (str2 != null) {
                ufx.n(ufxVar, "ref", str2, 0, 12);
            }
            if (str3 != null) {
                ufx.n(ufxVar, "track_code", str3, 0, 12);
            }
            return ufxVar;
        }

        public static ufx f(String str) {
            ufx ufxVar = new ufx("apps.getFeedRecommendedGameBlock", new ur(2), new sf3(1));
            if (str != null) {
                ufx.n(ufxVar, "track_code", str, 0, 12);
            }
            return ufxVar;
        }

        public static ufx g(String str) {
            ufx ufxVar = new ufx("apps.getFeedRecommendedGamesCarousel", new dq(2), new com.vk.movika.sdk.base.model.n(2));
            if (str != null) {
                ufx.n(ufxVar, "track_code", str, 0, 12);
            }
            return ufxVar;
        }

        public static ufx h(String str, String str2, Integer num, String str3, List list) {
            ArrayList arrayList;
            ufx ufxVar = new ufx("apps.getMiniApp", new uq(1), new vq(2));
            ufx.k(ufxVar, "app_id", num.intValue(), 0, 8);
            if (str != null) {
                ufx.n(ufxVar, "url", str, 0, 12);
            }
            if (str2 != null) {
                ufx.n(ufxVar, "ref", str2, 0, 12);
            }
            if (str3 != null) {
                ufx.n(ufxVar, "track_code", str3, 0, 12);
            }
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AppsAppFieldsDto) it.next()).i());
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                ufxVar.h("app_fields", arrayList);
            }
            return ufxVar;
        }

        public static ufx i(int i, UserId userId, String str, String str2, String str3) {
            ufx ufxVar = new ufx("apps.getMiniAppEmbeddedUrl", new dr(1), new com.vk.movika.sdk.android.defaultplayer.view.a(3));
            ufx.k(ufxVar, "app_id", i, 0, 8);
            if (userId != null) {
                ufx.m(ufxVar, "owner_id", userId, 0L, 12);
            }
            if (str != null) {
                ufx.n(ufxVar, "url", str, 0, 12);
            }
            if (str2 != null) {
                ufx.n(ufxVar, "ref", str2, 0, 12);
            }
            if (str3 != null) {
                ufx.n(ufxVar, "track_code", str3, 0, 12);
            }
            return ufxVar;
        }

        public static ufx j(String str) {
            ufx ufxVar = new ufx("apps.getMiniAppsFeedCarousel", new rq(1), new zq(1));
            if (str != null) {
                ufx.n(ufxVar, "track_code", str, 0, 12);
            }
            return ufxVar;
        }

        public static ufx k(String str, Float f, Float f2, ArrayList arrayList) {
            ArrayList arrayList2;
            ufx ufxVar = new ufx("apps.getVkApps", new pq(1), new j8(3));
            if (str != null) {
                ufx.n(ufxVar, "section_id", str, 0, 12);
            }
            if (f != null) {
                ufx.j(ufxVar, "latitude", f.floatValue());
            }
            if (f2 != null) {
                ufx.j(ufxVar, "longitude", f2.floatValue());
            }
            if (arrayList != null) {
                arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AppsAppFieldsDto) it.next()).i());
                }
            } else {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                ufxVar.h("app_fields", arrayList2);
            }
            return ufxVar;
        }

        public static ufx l(String str, ArrayList arrayList, Integer num, Integer num2) {
            ufx ufxVar = new ufx("apps.search", new rr(3), new zn(3));
            if (str != null) {
                ufx.n(ufxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 12);
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AppsSearchFiltersDto) it.next()).i());
            }
            ufxVar.h("filters", arrayList2);
            ufxVar.f(num.intValue(), 0, 1000, SignalingProtocol.KEY_OFFSET);
            ufxVar.f(num2.intValue(), 1, 200, "count");
            return ufxVar;
        }
    }

    ufx a(String str);

    ufx b(String str);

    xy2<BaseOkResponseDto> c(AppsClearRecentsPlatformDto appsClearRecentsPlatformDto);

    ufx d(String str);
}
