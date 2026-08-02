package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocketFactory;
import ru.CryptoPro.sspiSSL.gost.GostConstants;

/* loaded from: classes4.dex */
public final class mm71 {
    public static final String[] a(SSLSocketFactory sSLSocketFactory) {
        int i = kp71.b;
        String[] defaultCipherSuites = sSLSocketFactory.getDefaultCipherSuites();
        ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(defaultCipherSuites, defaultCipherSuites.length)));
        arrayList.remove(GostConstants.TLS_RSA_WITH_AES_128_CBC_SHA);
        arrayList.add(0, GostConstants.TLS_RSA_WITH_AES_128_CBC_SHA);
        return (String[]) arrayList.toArray(new String[0]);
    }
}
