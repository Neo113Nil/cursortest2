package xsna;

import android.telephony.PhoneNumberUtils;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: MobilePhoneMatcher.kt */
/* loaded from: classes2.dex */
public final class qu20 {
    public final String a;
    public final bpn0 b;
    public final bpn0 c;
    public final String d;
    public final String e;

    public qu20(String str, String str2) {
        this.a = str;
        bpn0 bpn0Var = new bpn0(new bih(this, 27));
        this.b = bpn0Var;
        this.c = new bpn0(new h1j(this, 23));
        r6m.a.getClass();
        String simCountryIso = r6m.g().getSimCountryIso();
        String upperCase = (simCountryIso == null || simCountryIso.length() == 0) ? null : simCountryIso.toUpperCase(Locale.ROOT);
        if (upperCase != null) {
            String str3 = upperCase.length() == 2 ? upperCase : null;
            if (str3 != null) {
                str2 = str3;
            }
        }
        this.d = str2.toUpperCase(Locale.ROOT);
        this.e = c((String) bpn0Var.getValue());
    }

    public static boolean b(CharSequence charSequence) {
        return charSequence.length() > 0 && (charSequence.charAt(0) == '7' || charSequence.charAt(0) == '8');
    }

    public final boolean a(String str) {
        String str2 = (String) this.b.getValue();
        bpn0 bpn0Var = new bpn0(new wzh(str, 21));
        bpn0 bpn0Var2 = new bpn0(new com.vk.voip.a(17, str2, bpn0Var));
        bpn0 bpn0Var3 = new bpn0(new wx0(str2, this, bpn0Var));
        bpn0 bpn0Var4 = new bpn0(new hn9(str2, this, bpn0Var));
        if (((Boolean) bpn0Var2.getValue()).booleanValue() || ((Boolean) bpn0Var3.getValue()).booleanValue() || ((Boolean) bpn0Var4.getValue()).booleanValue()) {
            return true;
        }
        String str3 = this.e;
        if (str3 != null) {
            return PhoneNumberUtils.compare(c(str), str3);
        }
        return false;
    }

    public final String c(String str) {
        if (str.length() >= 6) {
            Iterator it = rl3.y0(new String[]{this.d, "RU"}).iterator();
            while (it.hasNext()) {
                String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(str, (String) it.next());
                if (formatNumberToE164 != null) {
                    return formatNumberToE164;
                }
            }
        }
        return null;
    }
}
