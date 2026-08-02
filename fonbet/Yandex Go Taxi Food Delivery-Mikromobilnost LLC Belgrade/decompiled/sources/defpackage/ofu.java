package defpackage;

import android.os.Build;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public abstract class ofu {
    public static final List a = Collections.singletonList("yandexbank://deeplink/close");
    public static final String b = b64.k("[^\\x00-\\x7F]", String.format("%s/%s.%d (%s %s; Android %s)", Arrays.copyOf(new Object[]{"com.yandex.payment.sdk", "7.6.6", 1, Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE}, 6)), "");

    public static byte[] a(String str) {
        if (str.length() % 2 != 0) {
            ny61.r("Hex string must have even length");
            return null;
        }
        ArrayList q0 = gvu0.q0(2, str);
        ArrayList arrayList = new ArrayList(tcc.n(q0, 10));
        Iterator it = q0.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            rza.a(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
        }
        return a.D0(arrayList);
    }

    public static String b(String str) {
        String str2;
        if (str == null) {
            return "null";
        }
        try {
            URL url = new URL(str);
            if (url.getPort() == -1) {
                str2 = "";
            } else {
                str2 = ":" + url.getPort();
            }
            return url.getProtocol() + "://" + url.getHost() + str2 + "/...";
        } catch (MalformedURLException unused) {
            return a.contains(str) ? str : "malformed url is hidden";
        }
    }
}
