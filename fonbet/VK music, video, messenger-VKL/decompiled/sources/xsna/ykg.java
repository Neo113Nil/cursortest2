package xsna;

import android.graphics.Color;
import com.vk.api.generated.apps.dto.AppsAppAdConfigDto;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppInstallRightDto;
import com.vk.api.generated.apps.dto.AppsAppLeaderboardTypeDto;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.apps.dto.AppsAppNotificationBadgeTypeDto;
import com.vk.api.generated.apps.dto.AppsAppPlaceholderInfoDto;
import com.vk.api.generated.apps.dto.AppsCatalogBannerDto;
import com.vk.api.generated.apps.dto.AppsCatalogBannerImagesDto;
import com.vk.api.generated.apps.dto.AppsGetAboutScreenPoliciesDto;
import com.vk.api.generated.apps.dto.AppsLegalInfoDto;
import com.vk.api.generated.apps.dto.AppsSplashScreenDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseImageContainerDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsUserStackDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.external.miniapp.net.app.ProfileItem;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebAppPlaceholderInfo;
import com.vk.external.miniapp.net.app.WebAppSplashScreen;
import com.vk.external.miniapp.net.app.WebCatalogBanner;
import com.vk.external.miniapp.net.app.WebFriendsUseApp;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.external.miniapp.net.app.WebLegalInfo;
import com.vk.external.miniapp.net.app.WebPhoto;
import com.vk.external.miniapp.net.app.WebPolicies;
import com.vk.external.miniapp.net.app.WebRights;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommonMapper.kt */
/* loaded from: classes6.dex */
public final class ykg {
    public static WebAdConfig a(AppsAppAdConfigDto appsAppAdConfigDto) {
        Integer f = appsAppAdConfigDto.f();
        if (f == null) {
            return null;
        }
        int intValue = f.intValue();
        Integer d = appsAppAdConfigDto.d();
        int intValue2 = d != null ? d.intValue() : -1;
        Boolean j = appsAppAdConfigDto.j();
        Boolean bool = Boolean.TRUE;
        return new WebAdConfig(intValue, intValue2, epx.f(j, bool), epx.f(appsAppAdConfigDto.g(), bool), epx.f(appsAppAdConfigDto.i(), bool), epx.f(appsAppAdConfigDto.e(), bool));
    }

    public static Integer b(String str) {
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static WebApiApplication c(AppsAppDto appsAppDto) {
        WebCatalogBanner webCatalogBanner;
        WebFriendsUseApp webFriendsUseApp;
        WebAppSplashScreen webAppSplashScreen;
        WebAppPlaceholderInfo webAppPlaceholderInfo;
        WebLegalInfo webLegalInfo;
        ArrayList arrayList;
        ArrayList arrayList2;
        WebPhoto webPhoto;
        String str;
        String f;
        String T = appsAppDto.T();
        WebImageSize webImageSize = T != null ? new WebImageSize(T, 75, 75, (char) 0, false, null, 56, null) : null;
        String G = appsAppDto.G();
        WebImageSize webImageSize2 = G != null ? new WebImageSize(G, 139, 139, (char) 0, false, null, 56, null) : null;
        String K = appsAppDto.K();
        WebImageSize webImageSize3 = K != null ? new WebImageSize(K, 150, 150, (char) 0, false, null, 56, null) : null;
        String M = appsAppDto.M();
        WebImageSize webImageSize4 = M != null ? new WebImageSize(M, 278, 278, (char) 0, false, null, 56, null) : null;
        String R = appsAppDto.R();
        WebPhoto webPhoto2 = new WebPhoto(new WebImage((List<WebImageSize>) rl3.I(new WebImageSize[]{webImageSize, webImageSize2, webImageSize3, webImageSize4, R != null ? new WebImageSize(R, 576, 576, (char) 0, false, null, 56, null) : null})));
        long id = appsAppDto.getId();
        String title = appsAppDto.getTitle();
        String l = appsAppDto.l();
        String k = appsAppDto.k();
        String description = appsAppDto.getDescription();
        String S0 = appsAppDto.S0();
        Integer l0 = appsAppDto.l0();
        int intValue = l0 != null ? l0.intValue() : 0;
        List<Integer> p = appsAppDto.p();
        int size = p != null ? p.size() : 0;
        String B = appsAppDto.B();
        Integer C = appsAppDto.C();
        int intValue2 = C != null ? C.intValue() : 0;
        String j = appsAppDto.j();
        AppsAppNotificationBadgeTypeDto F0 = appsAppDto.F0();
        String i = F0 != null ? F0.i() : null;
        BaseBoolIntDto D1 = appsAppDto.D1();
        boolean z = D1 != null && D1.i() == 1;
        long intValue3 = appsAppDto.g() != null ? r0.intValue() : 0L;
        Boolean B1 = appsAppDto.B1();
        Boolean bool = Boolean.TRUE;
        boolean f2 = epx.f(B1, bool);
        boolean f3 = epx.f(appsAppDto.f(), bool);
        boolean f4 = epx.f(appsAppDto.z1(), bool);
        boolean f5 = epx.f(appsAppDto.x1(), bool);
        Integer N0 = appsAppDto.N0();
        int intValue4 = N0 != null ? N0.intValue() : 0;
        String r = appsAppDto.r();
        String i2 = appsAppDto.d1().i();
        Integer v0 = appsAppDto.v0();
        int intValue5 = v0 != null ? v0.intValue() : 1;
        BaseBoolIntDto F = appsAppDto.F();
        boolean z2 = F != null && F.i() == 1;
        boolean f6 = epx.f(appsAppDto.R1(), bool);
        String ra = appsAppDto.ra();
        String n1 = appsAppDto.n1();
        String a0 = appsAppDto.a0();
        Integer b = b(appsAppDto.i());
        AppsCatalogBannerDto o = appsAppDto.o();
        if (o != null) {
            String d = o.d();
            String concat = d != null ? "#".concat(d) : null;
            String g = o.g();
            String concat2 = g != null ? "#".concat(g) : null;
            String e = o.e();
            String concat3 = e != null ? "#".concat(e) : null;
            int r2 = concat != null ? f370.r(concat) : 0;
            int r3 = concat2 != null ? f370.r(concat2) : 0;
            int r4 = concat3 != null ? f370.r(concat3) : 0;
            String description2 = o.getDescription();
            String str2 = description2 == null ? "" : description2;
            AppsCatalogBannerImagesDto f7 = o.f();
            if (f7 != null) {
                float f8 = iah0.f().density;
                if (f8 <= 1.0f) {
                    f = f7.d();
                } else if (f8 > 1.0f && f8 <= 2.0f) {
                    f = f7.e();
                } else if (f8 > 2.0f) {
                    f = f7.f();
                }
                str = f;
                webCatalogBanner = new WebCatalogBanner(r2, r3, r4, str2, str);
            }
            str = null;
            webCatalogBanner = new WebCatalogBanner(r2, r3, r4, str2, str);
        } else {
            webCatalogBanner = null;
        }
        boolean f9 = epx.f(appsAppDto.w0(), bool);
        AppsAppLeaderboardTypeDto W = appsAppDto.W();
        int i3 = W != null ? W.i() : 0;
        boolean f10 = epx.f(appsAppDto.y0(), bool);
        ExploreWidgetsUserStackDto u = appsAppDto.u();
        if (u != null) {
            List<ExploreWidgetsBaseImageContainerDto> d2 = u.d();
            ArrayList arrayList3 = new ArrayList(c5g.u(d2, 10));
            for (ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto : d2) {
                long intValue6 = exploreWidgetsBaseImageContainerDto.e() != null ? r7.intValue() : -1L;
                List<BaseImageDto> d3 = exploreWidgetsBaseImageContainerDto.d();
                arrayList3.add(new ProfileItem(intValue6, d3 != null ? e(d3) : new WebImage(EmptyList.b)));
            }
            webFriendsUseApp = new WebFriendsUseApp(u.getDescription(), arrayList3);
        } else {
            webFriendsUseApp = null;
        }
        Boolean n = appsAppDto.n();
        Boolean bool2 = Boolean.TRUE;
        boolean f11 = epx.f(n, bool2);
        boolean f12 = epx.f(appsAppDto.D(), bool2);
        AppsSplashScreenDto V0 = appsAppDto.V0();
        if (V0 != null) {
            String url = V0.getUrl();
            if (url == null) {
                url = "";
            }
            String d4 = V0.d();
            if (d4 == null) {
                d4 = "";
            }
            webAppSplashScreen = new WebAppSplashScreen(url, d4, epx.f(V0.e(), bool2));
        } else {
            webAppSplashScreen = null;
        }
        boolean f13 = epx.f(appsAppDto.N1(), bool2);
        boolean f14 = epx.f(appsAppDto.t1(), bool2);
        Boolean o1 = appsAppDto.o1();
        Boolean E1 = appsAppDto.E1();
        AppsAppPlaceholderInfoDto H0 = appsAppDto.H0();
        if (H0 != null) {
            String title2 = H0.getTitle();
            if (title2 == null) {
                title2 = "";
            }
            String e2 = H0.e();
            WebAppPlaceholderInfo.Reason.a aVar = WebAppPlaceholderInfo.Reason.Companion;
            int d5 = H0.d();
            aVar.getClass();
            webAppPlaceholderInfo = new WebAppPlaceholderInfo(title2, e2, WebAppPlaceholderInfo.Reason.a.a(d5));
        } else {
            webAppPlaceholderInfo = null;
        }
        boolean f15 = epx.f(appsAppDto.y1(), bool2);
        AppsAppAdConfigDto d6 = appsAppDto.d();
        WebAdConfig a = d6 != null ? a(d6) : null;
        Integer e3 = appsAppDto.e();
        int intValue7 = e3 != null ? e3.intValue() : 0;
        boolean f16 = epx.f(appsAppDto.D0(), bool2);
        String U0 = appsAppDto.U0();
        boolean f17 = epx.f(appsAppDto.s1(), bool2);
        Boolean L1 = appsAppDto.L1();
        boolean booleanValue = L1 != null ? L1.booleanValue() : false;
        String b1 = appsAppDto.b1();
        AppsLegalInfoDto Z = appsAppDto.Z();
        if (Z != null) {
            AppsGetAboutScreenPoliciesDto g2 = Z.g();
            String d7 = g2 != null ? g2.d() : null;
            AppsGetAboutScreenPoliciesDto g3 = Z.g();
            webLegalInfo = new WebLegalInfo(Z.d(), Z.f(), new WebPolicies(d7, g3 != null ? g3.e() : null), Z.e(), Z.i());
        } else {
            webLegalInfo = null;
        }
        List<AppsAppInstallRightDto> K0 = appsAppDto.K0();
        if (K0 != null) {
            List<AppsAppInstallRightDto> list = K0;
            ArrayList arrayList4 = new ArrayList(c5g.u(list, 10));
            for (AppsAppInstallRightDto appsAppInstallRightDto : list) {
                arrayList4.add(new WebRights(appsAppInstallRightDto.f(), appsAppInstallRightDto.d(), appsAppInstallRightDto.getDescription(), appsAppInstallRightDto.e()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        List<PhotosPhotoDto> P0 = appsAppDto.P0();
        if (P0 != null) {
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it = P0.iterator();
            while (it.hasNext()) {
                List<PhotosPhotoSizesDto> R2 = ((PhotosPhotoDto) it.next()).R();
                if (R2 == null) {
                    webPhoto = null;
                } else {
                    List<PhotosPhotoSizesDto> list2 = R2;
                    ArrayList arrayList6 = new ArrayList(c5g.u(list2, 10));
                    for (PhotosPhotoSizesDto photosPhotoSizesDto : list2) {
                        String url2 = photosPhotoSizesDto.getUrl();
                        arrayList6.add(new WebImageSize(url2 == null ? "" : url2, photosPhotoSizesDto.getHeight(), photosPhotoSizesDto.getWidth(), (char) 0, false, null, 56, null));
                    }
                    webPhoto = new WebPhoto(new WebImage(arrayList6));
                }
                if (webPhoto != null) {
                    arrayList5.add(webPhoto);
                }
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = null;
        }
        return new WebApiApplication(id, title, webPhoto2, l, k, description, S0, intValue, size, null, B, intValue2, j, i, z, intValue3, f2, f3, f4, f5, intValue4, r, i2, intValue5, 0L, z2, f6, ra, n1, a0, b, webCatalogBanner, f9, i3, f10, null, webFriendsUseApp, f11, f12, webAppSplashScreen, f13, f14, o1, E1, webAppPlaceholderInfo, f15, a, intValue7, f16, U0, f17, booleanValue, b1, webLegalInfo, arrayList, arrayList2);
    }

    public static WebApiApplication d(AppsAppMinDto appsAppMinDto) {
        WebAppSplashScreen webAppSplashScreen;
        WebAppPlaceholderInfo webAppPlaceholderInfo;
        String B = appsAppMinDto.B();
        WebImageSize webImageSize = B != null ? new WebImageSize(B, 75, 75, (char) 0, false, null, 56, null) : null;
        String n = appsAppMinDto.n();
        WebImageSize webImageSize2 = n != null ? new WebImageSize(n, 139, 139, (char) 0, false, null, 56, null) : null;
        String o = appsAppMinDto.o();
        WebImageSize webImageSize3 = o != null ? new WebImageSize(o, 150, 150, (char) 0, false, null, 56, null) : null;
        String p = appsAppMinDto.p();
        WebImageSize webImageSize4 = p != null ? new WebImageSize(p, 278, 278, (char) 0, false, null, 56, null) : null;
        String u = appsAppMinDto.u();
        WebPhoto webPhoto = new WebPhoto(new WebImage((List<WebImageSize>) rl3.I(new WebImageSize[]{webImageSize, webImageSize2, webImageSize3, webImageSize4, u != null ? new WebImageSize(u, 576, 576, (char) 0, false, null, 56, null) : null})));
        long id = appsAppMinDto.getId();
        String title = appsAppMinDto.getTitle();
        String T = appsAppMinDto.T();
        String T2 = appsAppMinDto.T();
        long intValue = appsAppMinDto.g() != null ? r0.intValue() : 0L;
        Boolean K0 = appsAppMinDto.K0();
        Boolean bool = Boolean.TRUE;
        boolean f = epx.f(K0, bool);
        boolean f2 = epx.f(appsAppMinDto.f(), bool);
        boolean f3 = epx.f(appsAppMinDto.H0(), bool);
        boolean f4 = epx.f(appsAppMinDto.D0(), bool);
        String r = appsAppMinDto.r();
        String i = appsAppMinDto.a0().i();
        Integer D = appsAppMinDto.D();
        int intValue2 = D != null ? D.intValue() : 1;
        BaseBoolIntDto l = appsAppMinDto.l();
        boolean z = l != null && l.i() == 1;
        boolean f5 = epx.f(appsAppMinDto.U0(), bool);
        String ra = appsAppMinDto.ra();
        String l0 = appsAppMinDto.l0();
        String C = appsAppMinDto.C();
        String i2 = appsAppMinDto.i();
        Integer valueOf = i2 != null ? Integer.valueOf(Color.parseColor(i2)) : null;
        boolean f6 = epx.f(appsAppMinDto.F(), bool);
        boolean f7 = epx.f(appsAppMinDto.G(), bool);
        boolean f8 = epx.f(appsAppMinDto.j(), bool);
        boolean f9 = epx.f(appsAppMinDto.k(), bool);
        AppsSplashScreenDto Z = appsAppMinDto.Z();
        if (Z != null) {
            String url = Z.getUrl();
            if (url == null) {
                url = "";
            }
            String d = Z.d();
            if (d == null) {
                d = "";
            }
            webAppSplashScreen = new WebAppSplashScreen(url, d, epx.f(Z.e(), bool));
        } else {
            webAppSplashScreen = null;
        }
        Boolean N0 = appsAppMinDto.N0();
        boolean z2 = N0 != null && (N0.booleanValue() ^ true);
        boolean f10 = epx.f(appsAppMinDto.y0(), bool);
        Boolean v0 = appsAppMinDto.v0();
        Boolean P0 = appsAppMinDto.P0();
        AppsAppPlaceholderInfoDto M = appsAppMinDto.M();
        if (M != null) {
            String title2 = M.getTitle();
            String str = title2 != null ? title2 : "";
            String e = M.e();
            WebAppPlaceholderInfo.Reason.a aVar = WebAppPlaceholderInfo.Reason.Companion;
            int d2 = M.d();
            aVar.getClass();
            webAppPlaceholderInfo = new WebAppPlaceholderInfo(str, e, WebAppPlaceholderInfo.Reason.a.a(d2));
        } else {
            webAppPlaceholderInfo = null;
        }
        boolean f11 = epx.f(appsAppMinDto.F0(), bool);
        AppsAppAdConfigDto d3 = appsAppMinDto.d();
        WebAdConfig a = d3 != null ? a(d3) : null;
        Integer e2 = appsAppMinDto.e();
        int intValue3 = e2 != null ? e2.intValue() : 0;
        boolean f12 = epx.f(appsAppMinDto.K(), bool);
        String W = appsAppMinDto.W();
        boolean f13 = epx.f(appsAppMinDto.w0(), bool);
        Boolean S0 = appsAppMinDto.S0();
        return new WebApiApplication(id, title, webPhoto, null, null, T, T2, 0, 0, null, null, 0, null, null, false, intValue, f, f2, f3, f4, 0, r, i, intValue2, 0L, z, f5, ra, l0, C, valueOf, null, f6, 0, f7, null, null, f8, f9, webAppSplashScreen, z2, f10, v0, P0, webAppPlaceholderInfo, f11, a, intValue3, f12, W, f13, S0 != null ? S0.booleanValue() : false, null, null, null, null);
    }

    public static WebImage e(List list) {
        List<BaseImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (BaseImageDto baseImageDto : list2) {
            arrayList.add(new WebImageSize(baseImageDto.getUrl(), baseImageDto.getHeight(), baseImageDto.getWidth(), (char) 0, false, baseImageDto.e(), 24, null));
        }
        return new WebImage(arrayList);
    }
}
