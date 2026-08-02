package xsna;

import android.graphics.Color;
import com.vk.api.generated.apps.dto.AppsAppAdConfigDto;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.apps.dto.AppsAppPlaceholderInfoDto;
import com.vk.api.generated.apps.dto.AppsSplashScreenDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebAppPlaceholderInfo;
import com.vk.external.miniapp.net.app.WebAppSplashScreen;
import java.util.List;

/* compiled from: AppAppMinDtoToApiApplication.kt */
/* loaded from: classes3.dex */
public final class e13 {
    public static ImageSize a(int i, String str) {
        return new ImageSize(str, i, i, Boolean.FALSE, ImageSize.b.c(i, i), false, 32, null);
    }

    public static ApiApplication b(AppsAppMinDto appsAppMinDto) {
        WebAdConfig webAdConfig;
        WebAppSplashScreen webAppSplashScreen;
        Integer f;
        ApiApplication apiApplication = new ApiApplication();
        apiApplication.b = new UserId(appsAppMinDto.getId());
        apiApplication.c = appsAppMinDto.getTitle();
        apiApplication.h = appsAppMinDto.T();
        apiApplication.C = appsAppMinDto.a0().name();
        String B = appsAppMinDto.B();
        WebAppPlaceholderInfo webAppPlaceholderInfo = null;
        ImageSize a = B != null ? a(75, B) : null;
        String n = appsAppMinDto.n();
        ImageSize a2 = n != null ? a(139, n) : null;
        String o = appsAppMinDto.o();
        ImageSize a3 = o != null ? a(150, o) : null;
        String p = appsAppMinDto.p();
        ImageSize a4 = p != null ? a(278, p) : null;
        String u = appsAppMinDto.u();
        apiApplication.d = new Photo(new Image((List<ImageSize>) rl3.I(new ImageSize[]{a, a2, a3, a4, u != null ? a(576, u) : null})));
        Boolean f2 = appsAppMinDto.f();
        Boolean bool = Boolean.TRUE;
        apiApplication.r = epx.f(f2, bool);
        apiApplication.s = epx.f(appsAppMinDto.H0(), bool);
        apiApplication.u = appsAppMinDto.g() != null ? new UserId(r1.intValue()) : null;
        apiApplication.v = epx.f(appsAppMinDto.K0(), bool);
        apiApplication.x = epx.f(appsAppMinDto.D0(), bool);
        Integer R = appsAppMinDto.R();
        apiApplication.z = R != null ? R.intValue() : 0;
        apiApplication.B = appsAppMinDto.r();
        Integer D = appsAppMinDto.D();
        apiApplication.F = D != null ? D.intValue() : 1;
        apiApplication.G = appsAppMinDto.l0();
        apiApplication.H = appsAppMinDto.ra();
        apiApplication.J = appsAppMinDto.l() == BaseBoolIntDto.YES;
        apiApplication.K = epx.f(appsAppMinDto.U0(), bool);
        apiApplication.L = appsAppMinDto.C();
        String i = appsAppMinDto.i();
        apiApplication.M = i != null ? Integer.valueOf(Color.parseColor(i)) : null;
        apiApplication.N = epx.f(appsAppMinDto.F(), bool);
        apiApplication.O = epx.f(appsAppMinDto.G(), bool);
        apiApplication.R = epx.f(appsAppMinDto.j(), bool);
        apiApplication.S = epx.f(appsAppMinDto.k(), bool);
        AppsAppAdConfigDto d = appsAppMinDto.d();
        if (d == null || (f = d.f()) == null) {
            webAdConfig = null;
        } else {
            int intValue = f.intValue();
            Integer d2 = d.d();
            webAdConfig = new WebAdConfig(intValue, d2 != null ? d2.intValue() : -1, epx.f(d.j(), bool), epx.f(d.g(), bool), epx.f(d.i(), bool), epx.f(d.e(), bool));
        }
        apiApplication.a0 = webAdConfig;
        AppsSplashScreenDto Z = appsAppMinDto.Z();
        if (Z == null) {
            webAppSplashScreen = null;
        } else {
            String url = Z.getUrl();
            if (url == null) {
                url = "";
            }
            String d3 = Z.d();
            if (d3 == null) {
                d3 = "";
            }
            webAppSplashScreen = new WebAppSplashScreen(url, d3, epx.f(Z.e(), bool));
        }
        apiApplication.T = webAppSplashScreen;
        apiApplication.W = appsAppMinDto.v0();
        apiApplication.X = Boolean.valueOf(epx.f(appsAppMinDto.P0(), bool));
        AppsAppPlaceholderInfoDto M = appsAppMinDto.M();
        if (M != null) {
            WebAppPlaceholderInfo.Reason.a aVar = WebAppPlaceholderInfo.Reason.Companion;
            int d4 = M.d();
            aVar.getClass();
            WebAppPlaceholderInfo.Reason a5 = WebAppPlaceholderInfo.Reason.a.a(d4);
            String title = M.getTitle();
            webAppPlaceholderInfo = new WebAppPlaceholderInfo(title != null ? title : "", M.e(), a5);
        }
        apiApplication.Y = webAppPlaceholderInfo;
        apiApplication.c0 = Boolean.valueOf(epx.f(appsAppMinDto.K(), bool));
        return apiApplication;
    }
}
