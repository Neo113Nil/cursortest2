package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes5.dex */
public abstract class bgb0 {
    public static final Pattern a = Pattern.compile(",+");

    public static final String a(Context context, String str) {
        if (str == null || evu0.J(str)) {
            return "";
        }
        String[] split = a.split(str, 2);
        return split.length == 2 ? context.getString(kyh0.common_ext_phone_number, c(split[0]), split[1]) : c(str);
    }

    public static final String b(String str) {
        String str2 = str == null ? "" : str;
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        return cvu0.x(str, "+", false) ? "+".concat(sb2) : sb2;
    }

    public static final String c(String str) {
        if (str == null || evu0.J(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        boolean z = cvu0.x(str, "8", false) || cvu0.x(str, "+7", false) || cvu0.x(str, "7", false);
        return b64.k("\\s", cvu0.x(str, "+", false) ? "+".concat(d(sb2, z)) : d(sb2, z), " ");
    }

    public static String d(String str, boolean z) {
        if (z) {
            if (str.length() <= 11) {
                StringBuilder sb = new StringBuilder(str);
                if (f(1, Extension.O_BRAKE_SPACE, sb) && f(6, Extension.C_BRAKE_SPACE, sb) && f(11, "-", sb)) {
                    f(14, "-", sb);
                }
                return sb.toString();
            }
        } else if (str.length() <= 12) {
            if (str.length() == 12) {
                StringBuilder sb2 = new StringBuilder(str);
                if (f(3, Extension.O_BRAKE_SPACE, sb2) && f(7, Extension.C_BRAKE_SPACE, sb2) && f(12, "-", sb2)) {
                    f(15, "-", sb2);
                }
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder(str);
            if (cvu0.x(str, "0", false) && str.length() == 10) {
                if (f(0, Extension.O_BRAKE, sb3) && f(4, Extension.C_BRAKE_SPACE, sb3)) {
                    f(9, "-", sb3);
                }
                return sb3.toString();
            }
            if (f(3, Extension.O_BRAKE_SPACE, sb3) && f(7, Extension.C_BRAKE_SPACE, sb3) && f(11, "-", sb3)) {
                f(14, "-", sb3);
            }
            return sb3.toString();
        }
        return str;
    }

    public static final String e(String str) {
        String c = c(str);
        if (evu0.J(c)) {
            return c;
        }
        char charAt = c.charAt(0);
        return charAt != '7' ? charAt != '8' ? c : new Regex("8").k(c, "+7") : "+".concat(c);
    }

    public static boolean f(int i, String str, StringBuilder sb) {
        if (sb.length() <= i) {
            return false;
        }
        sb.insert(i, str);
        return true;
    }

    public static final boolean g(String str) {
        if (str == null || evu0.J(str)) {
            return false;
        }
        return !evu0.J(b(str));
    }

    public static void h(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.setFlags(SelfTester_JCP.IMITA);
        }
        try {
            context.startActivity(intent);
        } catch (Exception e) {
            jst.e.k(e, String.format("Failed to start activity for uri %s", Arrays.copyOf(new Object[]{intent.getDataString()}, 1)));
        }
    }

    public static final void i(Context context, Uri uri) {
        h(context, new Intent("android.intent.action.DIAL", uri));
    }

    public static final void j(Context context, String str) {
        i(context, Uri.parse("tel:" + str));
    }
}
