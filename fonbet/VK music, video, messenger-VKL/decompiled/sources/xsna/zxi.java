package xsna;

import androidx.credentials.provider.CredentialEntry;
import java.util.Locale;
import java.util.Properties;

/* compiled from: ConfigUtil.java */
/* loaded from: classes8.dex */
public final class zxi {
    public static String a(String str) {
        String replace = str.toLowerCase(Locale.ROOT).replace("-", ".");
        String str2 = (String) ((Properties) System.getProperties().clone()).entrySet().stream().filter(new cx6(replace, 2)).map(new wxi()).findFirst().orElse(null);
        return str2 != null ? str2 : (String) System.getenv().entrySet().stream().filter(new xxi(replace, 0)).map(new yxi()).findFirst().orElse(CredentialEntry.FALSE_STRING);
    }
}
