package defpackage;

import com.yandex.plus.core.strings.PlusSdkBrandType;
import java.util.Locale;
import java.util.Set;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* loaded from: classes8.dex */
public final class jsu0 implements p5z {
    public static final Set c = j73.f0(new String[]{ClearCryptoProPrefs.COUNTRY, "en", "ar", "az", "iw", "hy", "ka", "kk", "ro", "uk", "uz"});
    public final PlusSdkBrandType a;
    public final p5z b;

    public jsu0(PlusSdkBrandType plusSdkBrandType, p5z p5zVar) {
        this.a = plusSdkBrandType;
        this.b = p5zVar;
    }

    @Override // defpackage.p5z
    public final Locale getLocale() {
        Locale locale = this.b.getLocale();
        if (c.contains(locale.getLanguage())) {
            return locale;
        }
        int i = isu0.a[this.a.ordinal()];
        if (i == 1) {
            return new Locale(ClearCryptoProPrefs.COUNTRY);
        }
        if (i == 2) {
            return new Locale("en");
        }
        w511.b();
        return null;
    }
}
