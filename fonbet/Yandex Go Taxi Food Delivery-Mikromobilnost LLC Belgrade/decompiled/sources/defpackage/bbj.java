package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Locale;

/* loaded from: classes15.dex */
public final class bbj {
    public final Context a;

    public bbj(Context context) {
        this.a = context;
    }

    public static void a(t4j0 t4j0Var, String str, String str2) {
        if (str2 == null) {
            return;
        }
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                t4j0Var.a(str, "unexpected_value");
                return;
            }
        }
        t4j0Var.a(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(t4j0 t4j0Var) {
        Pair pair;
        Context context = this.a;
        a(t4j0Var, "X-App-Version", vqb1.d(context));
        a(t4j0Var, "X-App-Id", context.getPackageName());
        a(t4j0Var, "X-App-Platform", ConstantDeviceInfo.APP_PLATFORM);
        a(t4j0Var, "X-App-Platform-Version", String.valueOf(Build.VERSION.SDK_INT));
        a(t4j0Var, "X-App-Device-Manufacturer", Build.MANUFACTURER);
        a(t4j0Var, "X-App-Device-Model", Build.MODEL);
        a(t4j0Var, "X-App-Device-Locale", Locale.getDefault().toString());
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperator = telephonyManager.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() > 3) {
                pair = new Pair(networkOperator.substring(0, 3), networkOperator.substring(3));
                if (pair == null) {
                    a(t4j0Var, "X-App-Operator-MCC", (String) pair.first);
                    a(t4j0Var, "X-App-Operator-MNC", (String) pair.second);
                    return;
                }
                return;
            }
        }
        pair = null;
        if (pair == null) {
        }
    }
}
