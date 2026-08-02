package defpackage;

import java.util.List;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public abstract class kfb0 {
    public static final Regex a = new Regex("^\\+?[0-9 ()-]{0,15}$");

    public static String a(String str) {
        return (str.length() <= 0 || !c(str)) ? str : "+".concat(str);
    }

    public static String b(String str) {
        l9s l9sVar = new l9s((List) new ojj().b("### ###-##-##"), false, true);
        l9sVar.d(0, str);
        return l9sVar.b();
    }

    public static boolean c(String str) {
        return a.h(f(str));
    }

    public static String d(String str) {
        if (!c(str)) {
            return str;
        }
        String obj = evu0.k0(str).toString();
        if (cvu0.x(obj, "+", false)) {
            return f(obj);
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
        if (sb2.length() > 0) {
            char charAt2 = sb2.charAt(0);
            if (charAt2 == '8' && sb2.length() > 10) {
                charAt2 = '7';
            }
            sb2 = charAt2 + sb2.substring(1);
        }
        return oyr.p("+", cvu0.x(sb2, "7", false) ? "" : "7", sb2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r0.toString().length() > 10) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String e(String str) {
        if (!c(str)) {
            return str;
        }
        String obj = evu0.k0(str).toString();
        int i = 0;
        if (!cvu0.x(obj, "7", false)) {
            if (cvu0.x(obj, "+7", false)) {
                i = 2;
            } else if (cvu0.x(obj, "8", false)) {
                StringBuilder sb = new StringBuilder();
                int length = obj.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = obj.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
            }
            return obj.substring(i);
        }
        i = 1;
        return obj.substring(i);
    }

    public static String f(String str) {
        return evu0.k0(cvu0.v(cvu0.v(cvu0.v(cvu0.v(str, "-", "", false), " ", "", false), Extension.O_BRAKE, "", false), Extension.C_BRAKE, "", false)).toString();
    }
}
