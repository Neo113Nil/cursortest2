package defpackage;

import java.util.HashSet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class ge10 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (ge10.class) {
            if (a.add(str)) {
                b += Extension.FIX_SPACE + str;
            }
        }
    }
}
