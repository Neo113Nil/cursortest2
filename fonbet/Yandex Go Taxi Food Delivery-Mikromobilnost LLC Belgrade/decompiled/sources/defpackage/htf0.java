package defpackage;

import java.security.PrivilegedAction;
import java.security.Security;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.EllipticParamsSpecDH;
import ru.CryptoPro.JCP.params.EllipticParamsSpecDH2012_512;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
public final class htf0 implements PrivilegedAction {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ htf0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return Security.getProperty(str);
            case 1:
                return Security.getProperty(str);
            case 2:
                return System.getProperty(str);
            case 3:
                return System.getProperty(str);
            case 4:
                return Boolean.valueOf(Boolean.getBoolean(str));
            case 5:
                return Boolean.valueOf(Boolean.getBoolean(str));
            case 6:
                String property = System.getProperty(str);
                if (property == null) {
                    return null;
                }
                return property;
            case 7:
                try {
                    return System.getenv(str);
                } catch (Throwable unused) {
                    return null;
                }
            case 8:
                return System.getProperty(str);
            case 9:
                return new JCPPref(CryptParamsSpec.class).getOID(str, null);
            case 10:
                return new JCPPref(DigestParamsSpec.class).getOID(str, null);
            case 11:
                return new JCPPref(EllipticParamsSpecDH.class).getOID(str, null);
            case 12:
                return System.getProperty(str);
            default:
                return new JCPPref(EllipticParamsSpecDH2012_512.class).getOID(str, null);
        }
    }
}
