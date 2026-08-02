package defpackage;

import android.os.Bundle;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.GlobalProcessingState;

/* loaded from: classes4.dex */
public abstract class pxa1 {
    public static v1m0 a(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            return new v1m0();
        }
        bundle.setClassLoader(v1m0.class.getClassLoader());
        MapBuilder mapBuilder = new MapBuilder(bundle.size());
        for (String str : bundle.keySet()) {
            mapBuilder.put(str, bundle.get(str));
        }
        return new v1m0(mapBuilder.j());
    }

    public static final int b(GlobalProcessingState globalProcessingState) {
        int i = fjt.a[globalProcessingState.ordinal()];
        if (i == 1) {
            return kzh0.ebssdk_processing_tv_text;
        }
        if (i == 2) {
            return kzh0.ebssdk_processing_tv_text_additional;
        }
        w511.b();
        return 0;
    }

    public static void c(ArrayList arrayList, ValueCallback valueCallback) {
        WebView.setSafeBrowsingWhitelist(arrayList, valueCallback);
    }

    public static boolean d(Object obj) {
        if (obj == null) {
            List list = x1m0.a;
            return true;
        }
        List list2 = x1m0.a;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static void e(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!i(b2)) {
            if ((((b2 + Alerts.alert_unrecognized_name) + (b << DerValue.tag_UniversalString)) >> 30) == 0 && !i(b3) && !i(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        su71.d("Protocol message had invalid UTF-8.");
    }

    public static void f(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!i(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!i(b3)) {
                cArr[i] = (char) (((b & PKIBody._CCP) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        su71.d("Protocol message had invalid UTF-8.");
    }

    public static void g(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || i(b2)) {
            su71.d("Protocol message had invalid UTF-8.");
        } else {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }
    }

    public static /* bridge */ /* synthetic */ boolean h(byte b) {
        return b >= 0;
    }

    public static boolean i(byte b) {
        return b > -65;
    }
}
