package xsna;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.Regex;
import xsna.vf3;

/* compiled from: WebLinkNewAliasUtilsGeneratedApi.kt */
/* loaded from: classes6.dex */
public final class ugx0 {
    public static final Regex a = new Regex("(/games)?/(app[-0-9]+)((?:_([-0-9]+)))?((?:.*))?");
    public static final Regex b = new Regex("([a-z0-9.\\-]+)");
    public static final Regex c = new Regex("/([A-Za-z0-9._]+)");
    public static final bpn0 d = new bpn0(new ltb0(20));

    public static boolean a(long j, String str) {
        if (epx.f(str, String.valueOf(j))) {
            return true;
        }
        if (epx.f(str, MBridgeConstans.DYNAMIC_VIEW_WX_APP + j)) {
            return true;
        }
        ArrayList a2 = e43.a("vk.com", "vk.ru");
        if (!a2.contains(a0a.d)) {
            a2.add(a0a.d);
        }
        if (a2.isEmpty()) {
            return false;
        }
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            if (epx.f(str, "https://" + ((String) it.next()) + "/app" + j)) {
                return true;
            }
        }
        return false;
    }

    public static io.reactivex.rxjava3.core.q b(long j, long j2, String str) {
        return rdx0.u(e370.e(vf3.a.h(null, null, Integer.valueOf((int) j), null, null))).U(new ga40(new cu4(1, (q73) d.getValue(), q73.class, "mapToWebApiApplication", "mapToWebApiApplication(Lcom/vk/api/generated/apps/dto/AppsGetResponseDto;)Lcom/vk/external/miniapp/net/app/WebApiApplication;", 0, 11), 21)).L(new uf20(new sgx0(str, j, j2), 26), false);
    }

    public static io.reactivex.rxjava3.core.q c(String str, String str2) {
        return rdx0.u(new b4r0(str)).L(new ac20(new nf5(str2, 3), 26), false);
    }
}
