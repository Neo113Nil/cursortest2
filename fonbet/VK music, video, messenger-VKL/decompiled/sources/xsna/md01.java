package xsna;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.mbridge.msdk.MBridgeConstans;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class md01 implements Runnable {
    public final /* synthetic */ bf01 b;

    public md01(bf01 bf01Var) {
        this.b = bf01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        op01 op01Var = this.b.q;
        mb01 mb01Var = op01Var.a;
        kb01 kb01Var = mb01Var.k;
        bf01 bf01Var = mb01Var.q;
        x901 x901Var = mb01Var.i;
        mb01.k(kb01Var);
        kb01Var.k();
        if (op01Var.b()) {
            if (op01Var.c()) {
                mb01.i(x901Var);
                x901Var.x.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                bundle.putLong("_cc", 1L);
                mb01.j(bf01Var);
                bf01Var.r("auto", "_cmpx", bundle);
            } else {
                mb01.i(x901Var);
                String a = x901Var.x.a();
                if (TextUtils.isEmpty(a)) {
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.j.a("Cache still valid but referrer not found");
                } else {
                    mb01.i(x901Var);
                    long a2 = ((x901Var.y.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    Object obj = pair.first;
                    String str2 = obj == null ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : (String) obj;
                    mb01.j(bf01Var);
                    bf01Var.r(str2, "_cmp", (Bundle) pair.second);
                }
                mb01.i(x901Var);
                x901Var.x.b(null);
            }
            mb01.i(x901Var);
            x901Var.y.b(0L);
        }
    }
}
