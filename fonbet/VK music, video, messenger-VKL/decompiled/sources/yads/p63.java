package yads;

import android.os.Build;
import com.ironsource.adapters.vungle.VungleConstants;

/* loaded from: classes10.dex */
public final class p63 implements ic3 {
    public final String a() {
        String str;
        String str2 = null;
        try {
            str = System.getProperty("http.agent");
        } catch (Exception unused) {
            str = null;
        }
        if (str != null && str.length() != 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Dalvik/");
        try {
            str2 = System.getProperty("java.vm.version");
        } catch (Exception unused2) {
        }
        if (str2 == null || str2.length() == 0) {
            str2 = VungleConstants.META_DATA_VUNGLE_CONSENT_MESSAGE_VERSION;
        }
        sb.append(str2);
        sb.append(" (Linux; U; Android ");
        String str3 = Build.VERSION.RELEASE;
        if (str3.length() == 0) {
            str3 = "1.0";
        }
        sb.append(str3);
        if ("REL".equals(Build.VERSION.CODENAME)) {
            String str4 = Build.MODEL;
            if (str4.length() > 0) {
                sb.append("; ");
                sb.append(str4);
            }
        }
        String str5 = Build.ID;
        if (str5.length() > 0) {
            sb.append(" Build/");
            sb.append(str5);
        }
        sb.append(")");
        return sb.toString();
    }
}
