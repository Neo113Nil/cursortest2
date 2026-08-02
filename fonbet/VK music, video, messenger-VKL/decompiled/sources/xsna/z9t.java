package xsna;

import com.vk.api.generated.apps.dto.AppsFriendsStackDto;
import com.vk.api.generated.apps.dto.AppsLaunchScreenAppUsersTopUserDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogGameDto;
import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.ArrayList;
import java.util.List;
import xsna.sbt;

/* compiled from: GamesCatalogAppMapper.kt */
/* loaded from: classes17.dex */
public final class z9t {
    public final cct a;

    public z9t(cct cctVar) {
        this.a = cctVar;
    }

    public static sbt.a a(AppsFriendsStackDto appsFriendsStackDto) {
        List<AppsLaunchScreenAppUsersTopUserDto> d = appsFriendsStackDto.d();
        if (d == null) {
            return null;
        }
        List<AppsLaunchScreenAppUsersTopUserDto> list = d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (AppsLaunchScreenAppUsersTopUserDto appsLaunchScreenAppUsersTopUserDto : list) {
            arrayList.add(new sbt.a.C3659a(appsLaunchScreenAppUsersTopUserDto.e(), appsLaunchScreenAppUsersTopUserDto.f(), appsLaunchScreenAppUsersTopUserDto.d()));
        }
        String e = appsFriendsStackDto.e();
        if (e.length() == 0) {
            return null;
        }
        return new sbt.a(e, arrayList);
    }

    public final sbt b(AppsMiniappsCatalogGameDto appsMiniappsCatalogGameDto, String str) {
        WebApiApplication d = this.a.d(appsMiniappsCatalogGameDto.getId());
        if (d == null) {
            return null;
        }
        String j = appsMiniappsCatalogGameDto.j();
        String i = appsMiniappsCatalogGameDto.i();
        String f = appsMiniappsCatalogGameDto.f();
        AppsFriendsStackDto e = appsMiniappsCatalogGameDto.e();
        return new sbt(d, j, i, str, f, e != null ? a(e) : null, appsMiniappsCatalogGameDto.g(), appsMiniappsCatalogGameDto.d());
    }
}
