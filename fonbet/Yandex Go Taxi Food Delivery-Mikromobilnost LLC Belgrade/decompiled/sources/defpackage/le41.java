package defpackage;

import android.net.Uri;
import java.util.Set;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class le41 {
    public static final Set b = j73.f0(new String[]{ClearCryptoProPrefs.COUNTRY, "by", "ua", "kz", "com", "az", "ee", "fr", "lt", "lv", "md", "tj", "tm", "uz"});
    public static final Set c = j73.f0(new String[]{"com.tr", "co.il", "com.am", "com.ge"});
    public final Uri a;

    public static String a(Uri uri) {
        return g8e.m(uri, "WebChatUrl(value=", Extension.C_BRAKE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof le41) {
            return this.a.equals(((le41) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
