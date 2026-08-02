package xsna;

import android.location.Location;
import android.net.Uri;
import android.webkit.URLUtil;
import com.huawei.hms.framework.common.BundleUtil;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.generated.apps.dto.AppsAdsSlotsDto;
import com.vk.api.generated.apps.dto.AppsAppFieldsDto;
import com.vk.api.generated.apps.dto.AppsGetEmbeddedUrlResponseDto;
import com.vk.api.generated.apps.dto.AppsGetResponseDto;
import com.vk.api.generated.apps.dto.AppsGetTrackBridgeCallHandlersResponseDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadListDto;
import com.vk.api.generated.apps.dto.AppsNeedToShowActionPlaceIdDto;
import com.vk.api.generated.apps.dto.AppsStartCallResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.orders.dto.OrdersOrderDto;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.external.miniapp.net.app.AppFields;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.app.AppLifecycleEvent;
import com.vk.superapp.api.dto.app.AppsGroupsContainer;
import com.vk.superapp.api.dto.app.AutoBuyStatus;
import com.vk.superapp.api.dto.app.catalog.section.AppsCategory;
import com.vk.superapp.api.internal.requests.app.AddActionSuggestion;
import com.vk.superapp.api.internal.requests.app.ConfirmResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.vf3;

/* compiled from: WebAppNewAliasApiGenerated.kt */
/* loaded from: classes7.dex */
public final class xex0 implements zen0 {
    public final fit a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final bpn0 e = new bpn0(new ta50(23));
    public final bpn0 f = new bpn0(new g9l0(10));

    /* compiled from: WebAppNewAliasApiGenerated.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<AppsGetResponseDto, WebApiApplication> {
        @Override // xsna.izs
        public final WebApiApplication invoke(AppsGetResponseDto appsGetResponseDto) {
            return ((q73) this.receiver).p(appsGetResponseDto);
        }
    }

    /* compiled from: WebAppNewAliasApiGenerated.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<AppsAdsSlotsDto, AdvertisementConfig> {
        @Override // xsna.izs
        public final AdvertisementConfig invoke(AppsAdsSlotsDto appsAdsSlotsDto) {
            ((c41) this.receiver).getClass();
            return c41.a(appsAdsSlotsDto);
        }
    }

    /* compiled from: WebAppNewAliasApiGenerated.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<AppsMiniappsCatalogDto, ke3> {
        @Override // xsna.izs
        public final ke3 invoke(AppsMiniappsCatalogDto appsMiniappsCatalogDto) {
            return ((q73) this.receiver).d(appsMiniappsCatalogDto);
        }
    }

    /* compiled from: WebAppNewAliasApiGenerated.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<AppsGetEmbeddedUrlResponseDto, nex0> {
        @Override // xsna.izs
        public final nex0 invoke(AppsGetEmbeddedUrlResponseDto appsGetEmbeddedUrlResponseDto) {
            AppsGetEmbeddedUrlResponseDto appsGetEmbeddedUrlResponseDto2 = appsGetEmbeddedUrlResponseDto;
            ((q73) this.receiver).getClass();
            return new nex0(appsGetEmbeddedUrlResponseDto2.e(), appsGetEmbeddedUrlResponseDto2.d());
        }
    }

    /* compiled from: WebAppNewAliasApiGenerated.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<AppsMiniappsCatalogItemPayloadListDto, List<? extends AppsCategory>> {
        @Override // xsna.izs
        public final List<? extends AppsCategory> invoke(AppsMiniappsCatalogItemPayloadListDto appsMiniappsCatalogItemPayloadListDto) {
            return ((q73) this.receiver).f(appsMiniappsCatalogItemPayloadListDto);
        }
    }

    public xex0(fit fitVar, boolean z, boolean z2, boolean z3) {
        this.a = fitVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> A(long j, UserId userId, String str, String str2) {
        return this.a.A(j, userId, str, str2);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> B(long j, String str) {
        return this.a.B(j, str);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> C(long j, AppLifecycleEvent appLifecycleEvent, String str) {
        return this.a.C(j, appLifecycleEvent, str);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q D(long j, String str, String str2, String str3, List list) {
        if (!this.b) {
            return this.a.D(j, str, str2, str3, list);
        }
        Z().getClass();
        ArrayList b2 = q73.b(list);
        Integer valueOf = Integer.valueOf((int) j);
        if ((52730 & 4) != 0) {
            str2 = null;
        }
        if ((52730 & 4096) != 0) {
            str3 = null;
        }
        if ((52730 & 8192) != 0) {
            b2 = null;
        }
        return rdx0.u(e370.e(vf3.a.h(str2, str, valueOf, str3, b2))).U(new cxd0(new a(1, Z(), q73.class, "mapToWebApiApplication", "mapToWebApiApplication(Lcom/vk/api/generated/apps/dto/AppsGetResponseDto;)Lcom/vk/external/miniapp/net/app/WebApiApplication;", 0), 21));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<List<AppsCategory>> E() {
        return this.c ? rdx0.u(e370.e(new ufx("apps.getAndroidMiniAppCategories", new zn(2), new ao(2)))).U(new e4t(new e(1, Z(), q73.class, "mapToAppsCategoryList", "mapToAppsCategoryList(Lcom/vk/api/generated/apps/dto/AppsMiniappsCatalogItemPayloadListDto;)Ljava/util/List;", 0), 23)) : this.a.E();
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q F(String str, List list) {
        return this.a.F(str, list);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<Boolean> G(long j, String str) {
        return this.a.G(j, str);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<BaseBoolIntDto> H(long j, boolean z) {
        return this.a.H(j, z);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<JSONObject> I(long j, long j2, String str, String str2) {
        return this.a.I(j, j2, str, str2);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<pf3> J(long j, String str) {
        return this.a.J(j, str);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> K(long j) {
        return this.a.K(j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Map<String, String>> L(long j, String str) {
        return this.a.L(j, str);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<BaseBoolIntDto> M(long j, boolean z) {
        return this.a.M(j, z);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<List<AppsGroupsContainer>> N(int i) {
        return this.a.N(i);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<nak> O(long j, int i, Integer num) {
        return this.a.O(j, i, num);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q P(long j, UserId userId) {
        return this.a.P(j, userId);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> Q(long j) {
        return this.a.Q(j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q R(String str, List list) {
        return this.a.R(str, list);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q S(long j, UserId userId, String str) {
        return this.a.S(j, userId, str);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q T(String str, Collection collection, int i, Collection collection2) {
        return this.a.T(str, collection, i, collection2);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<AppsGetTrackBridgeCallHandlersResponseDto> U() {
        return this.a.U();
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q V(int i, long j) {
        return this.a.V(i, j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<z53> W(long j, String str, Long l, Long l2) {
        return this.a.W(j, str, l, l2);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q X(String str) {
        String concat;
        String path;
        String group;
        if (!this.b) {
            return this.a.X(str);
        }
        if (ugx0.b.k().matcher(str).matches()) {
            Long n = arm0.n(str);
            return n != null ? ugx0.b(n.longValue(), 0L, str) : ugx0.c(str, str);
        }
        if (URLUtil.isNetworkUrl(str)) {
            if (!brm0.B(str, "http", false) && !brm0.B(str, HttpRequest.DEFAULT_SCHEME, false)) {
                int K = drm0.K(0, 6, str, "://", false);
                concat = str.substring(0, K).toLowerCase(Locale.ROOT).concat(str.substring(K));
            }
            concat = str;
        } else {
            if (!brm0.B(str, "vkontakte://", true) && !brm0.B(str, "vk://", true)) {
                concat = "https://".concat(str);
            }
            concat = str;
        }
        Uri parse = Uri.parse(concat);
        m2v0.a.getClass();
        if (!m2v0.a(parse) || (path = parse.getPath()) == null || path.length() == 0) {
            return io.reactivex.rxjava3.core.q.H(new IllegalArgumentException("Wrong url for screen resolving: ".concat(str)));
        }
        String s0 = drm0.s0(parse.getPath(), '/');
        Matcher matcher = ugx0.a.k().matcher(s0);
        if (!matcher.matches()) {
            Matcher matcher2 = ugx0.c.k().matcher(s0);
            return (!matcher2.matches() || (group = matcher2.group(1)) == null) ? io.reactivex.rxjava3.core.q.H(new IllegalArgumentException(go9.b("Wrong url for screen resolving: ", concat))) : ugx0.c(group, concat);
        }
        String group2 = matcher.group(4);
        StringBuilder sb = new StringBuilder();
        sb.append(matcher.group(2));
        if (group2 != null && !drm0.N(group2)) {
            sb.append(BundleUtil.UNDERLINE_TAG);
            sb.append(group2);
        }
        return ugx0.c(sb.toString(), concat);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Map<String, Boolean>> Y(long j, List<String> list) {
        return this.a.Y(j, list);
    }

    public final q73 Z() {
        return (q73) this.e.getValue();
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q a(int i, String str, String str2, long j) {
        return this.a.a(i, str, str2, j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x b(long j, Integer num, String str, String str2, String str3) {
        if (!this.b) {
            return this.a.b(j, num, str, str2, str3);
        }
        Z().getClass();
        ufx ufxVar = new ufx("apps.joinAndGetMiniApps", new kr(2), new lr(3));
        ufx.k(ufxVar, "app_id", (int) j, 0, 8);
        if (num != null) {
            ufx.k(ufxVar, "need_settings", num.intValue(), 0, 8);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "url", str2, 0, 12);
        }
        if (str != null) {
            ufx.n(ufxVar, "ref", str, 0, 12);
        }
        if (str3 != null) {
            ufx.n(ufxVar, "track_code", str3, 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new x310(new bi6(1, Z(), q73.class, "mapToWebApiApplication", "mapToWebApiApplication(Lcom/vk/api/generated/apps/dto/AppsJoinAndGetResponseDto;)Lcom/vk/external/miniapp/net/app/WebApiApplication;", 0, 13), 25));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q c(int i, String str, Collection collection) {
        return this.a.c(i, str, collection);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q d(long j, UserId userId, String str, String str2, String str3) {
        if (!this.b) {
            return this.a.d(j, userId, str, str2, str3);
        }
        int i = (int) j;
        if ((32 & 16) != 0) {
            str3 = null;
        }
        return rdx0.u(e370.e(vf3.a.i(i, userId, str, str2, str3))).U(new u730(new d(1, Z(), q73.class, "mapToWebAppEmbeddedUrl", "mapToWebAppEmbeddedUrl(Lcom/vk/api/generated/apps/dto/AppsGetEmbeddedUrlResponseDto;)Lcom/vk/superapp/api/dto/app/WebAppEmbeddedUrl;", 0), 23));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<AppsStartCallResponseDto> e(long j) {
        return this.a.e(j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q f(int i, int i2, long j) {
        return this.a.f(i, i2, j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q g(int i, long j, int i2, String str) {
        return this.a.g(i, j, i2, str);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> h(long j, long j2, boolean z) {
        return this.a.h(j, j2, z);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<OrdersOrderDto.StatusDto> i(int i, long j) {
        return this.a.i(i, j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q j(int i, long j) {
        return this.a.j(i, j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> k(long j) {
        return this.a.k(j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<ke3> l(List<? extends AppFields> list) {
        ArrayList arrayList;
        if (!this.c) {
            return this.a.l(list);
        }
        Z().getClass();
        ArrayList b2 = q73.b(list);
        ufx ufxVar = new ufx("apps.getAndroidMiniAppsCatalogSearch", new io.reactivex.rxjava3.internal.operators.observable.q1(2), new hr(2));
        if (b2 != null) {
            arrayList = new ArrayList(c5g.u(b2, 10));
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AppsAppFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            ufxVar.h("app_fields", arrayList);
        }
        return rdx0.u(e370.e(ufxVar)).U(new r2v(new c(1, Z(), q73.class, "mapToAppsCatalogSectionsResponse", "mapToAppsCatalogSectionsResponse(Lcom/vk/api/generated/apps/dto/AppsMiniappsCatalogDto;)Lcom/vk/superapp/api/dto/app/catalog/AppsCatalogSectionsResponse;", 0), 28));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<AdvertisementConfig> m(String str) {
        if (!this.d) {
            return this.a.m(str);
        }
        ufx ufxVar = new ufx("apps.getAdvConfig", new er(1), new fr(1));
        if (str != null) {
            ufx.n(ufxVar, "active_features", str, 128, 4);
        }
        return rdx0.B(e370.e(ufxVar)).l(new o8c0(new b(1, (c41) this.f.getValue(), c41.class, "mapToAdvertisementConfig", "mapToAdvertisementConfig(Lcom/vk/api/generated/apps/dto/AppsAdsSlotsDto;)Lcom/vk/external/miniapp/net/ad/AdvertisementConfig;", 0), 17));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q n(int i, long j) {
        return this.a.n(i, j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<ConfirmResult> o(long j, int i, String str, AutoBuyStatus autoBuyStatus, String str2) {
        return this.a.o(j, i, str, autoBuyStatus, str2);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<x30> p(int i) {
        return this.a.p(i);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<g16> q(long j) {
        return this.a.q(j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> r(long j) {
        return this.a.r(j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q s(Location location, String str, int i, Integer num, List list, String str2) {
        if (!this.c) {
            return this.a.s(location, str, i, num, list, str2);
        }
        ArrayList arrayList = null;
        Float valueOf = location != null ? Float.valueOf((float) location.getLatitude()) : null;
        Float valueOf2 = location != null ? Float.valueOf((float) location.getLongitude()) : null;
        int i2 = 1;
        List b0 = str != null ? drm0.b0(str, new char[]{','}, 0, 6) : null;
        Z().getClass();
        ArrayList b2 = q73.b(list);
        ufx ufxVar = new ufx("apps.getAndroidMiniAppsCatalog", new p11(i2), new rf3(0));
        ufx.k(ufxVar, SignalingProtocol.KEY_LIMIT, i, 0, 8);
        if (num != null) {
            ufx.k(ufxVar, "last_seen_section_id", num.intValue(), 0, 8);
        }
        if (valueOf != null) {
            ufx.j(ufxVar, "latitude", valueOf.floatValue());
        }
        if (valueOf2 != null) {
            ufx.j(ufxVar, "longitude", valueOf2.floatValue());
        }
        if (b0 != null) {
            ufxVar.h("active_features", b0);
        }
        if (b2 != null) {
            arrayList = new ArrayList(c5g.u(b2, 10));
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AppsAppFieldsDto) it.next()).i());
            }
        }
        if (arrayList != null) {
            ufxVar.h("app_fields", arrayList);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "section_id", str2, 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new or20(new ai6(1, Z(), q73.class, "mapToAppsCatalogSectionsResponse", "mapToAppsCatalogSectionsResponse(Lcom/vk/api/generated/apps/dto/AppsMiniappsCatalogDto;)Lcom/vk/superapp/api/dto/app/catalog/AppsCatalogSectionsResponse;", 0, 11), 26));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<AddActionSuggestion> t(long j, String str, String str2, AppsNeedToShowActionPlaceIdDto appsNeedToShowActionPlaceIdDto) {
        return this.a.t(j, str, str2, appsNeedToShowActionPlaceIdDto);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q u(long j, String str, ArrayList arrayList) {
        return this.a.u(j, str, arrayList);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q v() {
        return this.a.v();
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<nak> w(long j, String str, Integer num, String str2) {
        return this.a.w(j, str, num, str2);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> x(long j) {
        return this.a.x(j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> y(long j) {
        return this.a.y(j);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<fhx0> z(long j, String str, Integer num, String str2) {
        return this.a.z(j, str, num, str2);
    }
}
