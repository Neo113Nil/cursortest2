package xsna;

import android.os.Build;
import com.vk.core.preference.Preference;
import xsna.xhr0;

/* compiled from: PushesJobHelper.kt */
/* loaded from: classes2.dex */
public final class vle0 {
    public static void a(long j, String str) {
        if (c(j).equals(str)) {
            synchronized (b6m.class) {
                String str2 = m8f0.a;
                synchronized (m8f0.class) {
                    w83 w83Var = m8f0.c;
                    if (w83Var == null) {
                        w83Var = null;
                    }
                    w83Var.getClass();
                    Preference.l().edit().remove("device_token" + j).apply();
                }
            }
        }
    }

    public static String b() {
        String str = Build.MANUFACTURER;
        int i = 0;
        while (true) {
            if (i < str.length()) {
                if (!Character.isLowerCase(str.charAt(i))) {
                    break;
                }
                i++;
            } else if (str.length() > 0) {
                str = Character.toTitleCase(str.charAt(0)) + str.substring(1);
            }
        }
        StringBuilder b = v1v.b(str, ' ');
        b.append(Build.MODEL);
        return b.toString();
    }

    public static String c(long j) {
        String str;
        synchronized (b6m.class) {
            String str2 = m8f0.a;
            synchronized (m8f0.class) {
                w83 w83Var = m8f0.c;
                if (w83Var == null) {
                    w83Var = null;
                }
                w83Var.getClass();
                String string = Preference.l().getString("device_token" + j, "");
                str = string != null ? string : "";
            }
        }
        return str;
    }

    public static String d(String str, w2w w2wVar, String str2) {
        StringBuilder b = ho8.b(str, str2);
        b.append(w2wVar.getDeviceId());
        b.append(w2wVar.H0().d);
        return xhr0.a.a(b.toString());
    }
}
