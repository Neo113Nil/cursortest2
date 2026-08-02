package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebPhoto;
import com.vk.games.model.GamesCatalogSection;

/* compiled from: GameForYouInfoModel.kt */
/* loaded from: classes17.dex */
public final class d7t {
    public static final c7t a(GamesCatalogSection.e eVar) {
        String str;
        sbt sbtVar = eVar.d;
        WebApiApplication webApiApplication = sbtVar.a;
        WebPhoto webPhoto = webApiApplication.d;
        String str2 = webApiApplication.c;
        String str3 = webApiApplication.h;
        String str4 = webApiApplication.l;
        String str5 = webApiApplication.Y;
        if (str3 != null && str3.length() != 0) {
            str4 = webApiApplication.h;
        } else {
            if (str5 != null && str5.length() != 0) {
                str = str5;
                return new c7t(sbtVar, webPhoto, str2, str, eVar.e.a);
            }
            if (str4 == null || str4.length() == 0) {
                str4 = webApiApplication.g;
            }
        }
        str = str4;
        return new c7t(sbtVar, webPhoto, str2, str, eVar.e.a);
    }
}
