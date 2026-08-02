package defpackage;

import android.net.Uri;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.Map;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final class ot3 implements v1g0 {
    public final wnt a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final c1g0 e;

    public ot3(wnt wntVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, c1g0 c1g0Var) {
        this.a = wntVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = c1g0Var;
    }

    @Override // defpackage.v1g0
    public final boolean a(Map map) {
        String obj;
        boolean b;
        String str = (String) map.get("msg");
        String str2 = (String) map.get("notification_group");
        wnt wntVar = this.a;
        i5p d = r85.d(wntVar, map);
        if (d == null || !d.d) {
            return false;
        }
        String str3 = (String) map.get("local_channel_id");
        h3y h3yVar = this.d;
        if (str3 == null) {
            r85.e(h3yVar, map);
            return true;
        }
        String str4 = d.e;
        kmf0 kmf0Var = (kmf0) this.b.get();
        if (kmf0Var.a.a.l("promocode", null) == null && str4 != null) {
            lmf0 lmf0Var = kmf0Var.a;
            cne0 cne0Var = lmf0Var.a;
            cne0Var.w("promocode");
            cne0Var.w(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
            cne0Var.w("details");
            cne0Var.w("canUseAnyway");
            cne0Var.w("valid");
            cne0 cne0Var2 = lmf0Var.a;
            if (a2f.a.matcher(str4).matches()) {
                StringBuilder sb = new StringBuilder();
                int length = str4.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str4.charAt(i);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                obj = sb.toString();
            } else {
                obj = evu0.k0(str4).toString();
            }
            cne0Var2.r("promocode", obj);
            cne0Var2.u("valid", false);
            cne0Var2.u("canUseAnyway", true);
            Uri.Builder builder = new Uri.Builder();
            ((pux0) ((o3h) this.c.get())).getClass();
            Uri build = builder.scheme(pux0.c).authority("promocode").appendQueryParameter(AuthSdkActivity.RESPONSE_TYPE_CODE, str4).build();
            if (str == null) {
                str = "";
            }
            b = ((e1g0) this.e).b(o501.D(build, null, str, str3, map, null, 96), str2, false, r85.a(wntVar, map));
        } else {
            b = false;
        }
        if (b) {
            return true;
        }
        r85.h(h3yVar, map);
        return true;
    }
}
