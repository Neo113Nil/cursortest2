package defpackage;

import java.security.Security;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.reprov.RevCheck;
import ru.CryptoPro.ssl.Provider;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
public final class cdf {
    public static final Map a = b.i(new Pair(1, "Couldn't initialize context."), new Pair(2, "Couldn't create CSP infrastructure."), new Pair(3, "Couldn't copy CSP resources."), new Pair(4, "Couldn't change CSP working directory."), new Pair(5, "Invalid CSP serial number."), new Pair(6, "Couldn't create trust store for CAdES API."), new Pair(7, "Couldn't store native library path to config."), new Pair(8, "Integrity control failure."));

    public static void a() {
        if (Security.getProvider("JCSP") == null) {
            Security.addProvider(new JCSP());
        }
        if (Security.getProvider("JTLS") == null) {
            Security.addProvider(new Provider());
        }
        cpSSLConfig.setDefaultSSLProvider("JCSP");
        if (Security.getProvider(RevCheck.PROVIDER_NAME) == null) {
            Security.addProvider(new RevCheck());
        }
        System.setProperty("com.sun.security.crl.timeout", "5");
        System.setProperty("ru.CryptoPro.crl.read_timeout", "5");
    }
}
