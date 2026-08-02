package xsna;

import android.graphics.Color;
import com.vk.api.generated.apps.dto.AppsAppAdConfigDto;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppPlaceholderInfoDto;
import com.vk.api.generated.apps.dto.AppsSplashScreenDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseImageContainerDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsUserStackDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.FriendsUseApp;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.external.miniapp.net.app.ProfileItem;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebAppPlaceholderInfo;
import com.vk.external.miniapp.net.app.WebAppSplashScreen;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.app.catalog.UserStack;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AppsDtoToApiApplicationMapper.kt */
/* loaded from: classes3.dex */
public final class re3 {
    public static ImageSize a(int i, String str) {
        return new ImageSize(str, i, i, Boolean.FALSE, ImageSize.b.c(i, i), false, 32, null);
    }

    public static ApiApplication b(AppsAppDto appsAppDto) {
        WebAdConfig webAdConfig;
        WebAppSplashScreen webAppSplashScreen;
        WebAppPlaceholderInfo webAppPlaceholderInfo;
        UserStack userStack;
        WebImage webImage;
        Integer f;
        ApiApplication apiApplication = new ApiApplication();
        apiApplication.b = new UserId(appsAppDto.getId());
        apiApplication.c = appsAppDto.getTitle();
        apiApplication.h = appsAppDto.S0();
        apiApplication.g = appsAppDto.getDescription();
        apiApplication.C = appsAppDto.d1().i();
        String T = appsAppDto.T();
        ImageSize a = T != null ? a(75, T) : null;
        String G = appsAppDto.G();
        ImageSize a2 = G != null ? a(139, G) : null;
        String K = appsAppDto.K();
        ImageSize a3 = K != null ? a(150, K) : null;
        String M = appsAppDto.M();
        ImageSize a4 = M != null ? a(278, M) : null;
        String R = appsAppDto.R();
        apiApplication.d = new Photo(new Image((List<ImageSize>) rl3.I(new ImageSize[]{a, a2, a3, a4, R != null ? a(576, R) : null})));
        Boolean f2 = appsAppDto.f();
        Boolean bool = Boolean.TRUE;
        apiApplication.r = epx.f(f2, bool);
        apiApplication.s = epx.f(appsAppDto.z1(), bool);
        apiApplication.u = appsAppDto.g() != null ? new UserId(r1.intValue()) : UserId.d;
        apiApplication.v = epx.f(appsAppDto.B1(), bool);
        apiApplication.x = epx.f(appsAppDto.x1(), bool);
        Integer N0 = appsAppDto.N0();
        apiApplication.z = N0 != null ? N0.intValue() : 0;
        apiApplication.B = appsAppDto.r();
        Integer v0 = appsAppDto.v0();
        apiApplication.F = v0 != null ? v0.intValue() : 0;
        apiApplication.G = appsAppDto.n1();
        apiApplication.H = appsAppDto.ra();
        apiApplication.J = appsAppDto.F() == BaseBoolIntDto.YES;
        apiApplication.K = epx.f(appsAppDto.R1(), bool);
        apiApplication.L = appsAppDto.a0();
        String i = appsAppDto.i();
        apiApplication.M = i != null ? Integer.valueOf(Color.parseColor(i)) : null;
        apiApplication.N = epx.f(appsAppDto.w0(), bool);
        apiApplication.O = epx.f(appsAppDto.y0(), bool);
        apiApplication.R = epx.f(appsAppDto.n(), bool);
        apiApplication.S = epx.f(appsAppDto.D(), bool);
        AppsAppAdConfigDto d = appsAppDto.d();
        if (d == null || (f = d.f()) == null) {
            webAdConfig = null;
        } else {
            int intValue = f.intValue();
            Integer d2 = d.d();
            webAdConfig = new WebAdConfig(intValue, d2 != null ? d2.intValue() : -1, epx.f(d.j(), bool), epx.f(d.g(), bool), epx.f(d.i(), bool), epx.f(d.e(), bool));
        }
        apiApplication.a0 = webAdConfig;
        AppsSplashScreenDto V0 = appsAppDto.V0();
        if (V0 == null) {
            webAppSplashScreen = null;
        } else {
            String url = V0.getUrl();
            if (url == null) {
                url = "";
            }
            String d3 = V0.d();
            if (d3 == null) {
                d3 = "";
            }
            webAppSplashScreen = new WebAppSplashScreen(url, d3, epx.f(V0.e(), bool));
        }
        apiApplication.T = webAppSplashScreen;
        apiApplication.W = appsAppDto.o1();
        apiApplication.X = Boolean.valueOf(epx.f(appsAppDto.E1(), bool));
        AppsAppPlaceholderInfoDto H0 = appsAppDto.H0();
        if (H0 == null) {
            webAppPlaceholderInfo = null;
        } else {
            WebAppPlaceholderInfo.Reason.a aVar = WebAppPlaceholderInfo.Reason.Companion;
            int d4 = H0.d();
            aVar.getClass();
            WebAppPlaceholderInfo.Reason a5 = WebAppPlaceholderInfo.Reason.a.a(d4);
            String title = H0.getTitle();
            webAppPlaceholderInfo = new WebAppPlaceholderInfo(title != null ? title : "", H0.e(), a5);
        }
        apiApplication.Y = webAppPlaceholderInfo;
        ExploreWidgetsUserStackDto u = appsAppDto.u();
        if (u != null) {
            List<ExploreWidgetsBaseImageContainerDto> d5 = u.d();
            ArrayList arrayList = new ArrayList(c5g.u(d5, 10));
            for (ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto : d5) {
                long intValue2 = exploreWidgetsBaseImageContainerDto.e() != null ? r9.intValue() : -1L;
                List<BaseImageDto> d6 = exploreWidgetsBaseImageContainerDto.d();
                if (d6 != null) {
                    List<BaseImageDto> list = d6;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                    for (BaseImageDto baseImageDto : list) {
                        arrayList2.add(new WebImageSize(baseImageDto.getUrl(), baseImageDto.getHeight(), baseImageDto.getWidth(), (char) 0, false, baseImageDto.e(), 24, null));
                    }
                    webImage = new WebImage(arrayList2);
                } else {
                    webImage = new WebImage(EmptyList.b);
                }
                arrayList.add(new ProfileItem(intValue2, webImage));
            }
            userStack = new UserStack(u.getDescription(), arrayList);
        } else {
            userStack = null;
        }
        apiApplication.Q = userStack != null ? new FriendsUseApp(userStack.b, userStack.c) : null;
        apiApplication.c0 = Boolean.valueOf(epx.f(appsAppDto.D0(), Boolean.TRUE));
        apiApplication.l = appsAppDto.B();
        apiApplication.p = appsAppDto.D1() == BaseBoolIntDto.YES;
        return apiApplication;
    }
}
