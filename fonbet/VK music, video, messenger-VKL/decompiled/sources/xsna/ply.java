package xsna;

import com.ironsource.O6;
import java.util.Locale;

/* compiled from: LangUtils.kt */
/* loaded from: classes.dex */
public final class ply {
    public static final ply a = new ply();
    public static final String[] b = {"ru", O6.d0, "en", "pt", "kz", "es", "uz", "be", "az", "hy", "vi"};

    public static final String a() {
        try {
            String language = Locale.getDefault().getLanguage();
            if ("uk".equals(language)) {
                language = O6.d0;
            }
            if ("kk".equals(language)) {
                language = "kz";
            }
            if (language.length() < 2) {
                language = "en";
            }
            for (String str : b) {
                if (brm0.B(language, str, false)) {
                    return str;
                }
            }
        } catch (Exception unused) {
        }
        return "en";
    }
}
