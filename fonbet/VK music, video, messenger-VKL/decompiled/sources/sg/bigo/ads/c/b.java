package sg.bigo.ads.c;

import android.content.Context;
import android.provider.Settings;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes9.dex */
public final class b {
    public static String a(Context context) {
        int i;
        String a = e.a(sg.bigo.ads.a.a.Y, "");
        int i2 = -1;
        try {
            i = Settings.Global.getInt(context.getContentResolver(), "auto_time_zone", -1);
            try {
                i2 = Settings.Global.getInt(context.getContentResolver(), "auto_time", -1);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            i = -1;
        }
        return a + StringUtils.PROCESS_POSTFIX_DELIMITER + i + StringUtils.PROCESS_POSTFIX_DELIMITER + i2;
    }

    public static String b(Context context) {
        try {
            SignalStrength signalStrength = ((TelephonyManager) context.getSystemService("phone")).getSignalStrength();
            if (signalStrength != null) {
                return String.valueOf(signalStrength.getLevel());
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
