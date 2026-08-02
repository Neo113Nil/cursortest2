package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* compiled from: GooglePlayUtils.kt */
/* loaded from: classes.dex */
public final class gau {
    public static final gau a = new gau();
    public static rnk0 b;
    public static bpn0 c;

    public static final zd3 c() {
        bpn0 bpn0Var = c;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (zd3) bpn0Var.getValue();
    }

    public static void d(Context context, String str, String str2) {
        String concat = str2 != null ? "&referrer=".concat(str2) : "";
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=" + str + concat));
            intent.addFlags(1074266112);
            context.startActivity(intent);
        } catch (Throwable unused) {
            Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://play.google.com/store/apps/details?id=" + str + concat));
            intent2.addFlags(1074266112);
            context.startActivity(intent2);
        }
    }

    public static /* synthetic */ void e(Context context, int i, String str) {
        if ((i & 2) != 0) {
            str = context.getPackageName();
        }
        d(context, str, null);
    }

    public e3z a(Context context, String str) {
        return new e3z(new anr0(context, str));
    }

    public synchronized rnk0 b() {
        rnk0 rnk0Var;
        rnk0Var = b;
        if (rnk0Var == null) {
            throw new IllegalStateException("Please call init for the SseExecutorProvider");
        }
        return rnk0Var;
    }
}
