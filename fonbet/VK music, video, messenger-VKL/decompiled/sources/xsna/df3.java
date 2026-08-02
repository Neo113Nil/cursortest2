package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import kotlin.Pair;
import xsna.zen0;

/* compiled from: AppsHelperFromApi.kt */
/* loaded from: classes7.dex */
public final class df3 {
    public static final io.reactivex.rxjava3.core.q<Pair<WebApiApplication, String>> a(np20 np20Var, String str, String str2) {
        io.reactivex.rxjava3.core.t T;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.core.q b = zen0.a.b(vdx0Var.d(), np20Var.a, str2, null, null, null, 28);
        String str3 = np20Var.c.a;
        if (str3 == null) {
            vdx0 vdx0Var2 = e370.e;
            zen0 d = (vdx0Var2 != null ? vdx0Var2 : null).d();
            long j = np20Var.a;
            String str4 = np20Var.c.f;
            if (str4 == null || drm0.N(str4)) {
                StringBuilder sb = new StringBuilder("https://");
                sb.append(a0a.d);
                sb.append("/app");
                sb.append(np20Var.a);
                sb.append('#');
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                str4 = sb.toString();
            }
            T = d.d(j, UserId.d, str4, str2, np20Var.d.a).U(new rf1(new a60(2), 1));
        } else {
            T = io.reactivex.rxjava3.core.q.T(brm0.y(str3, "#peer_id", "&hash"));
        }
        return io.reactivex.rxjava3.core.q.I0(b, T, new n7(new cf3(0), 2));
    }
}
