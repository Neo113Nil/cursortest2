package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.UnrecoverableKeyException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.x509.X509CertImpl;

/* loaded from: classes.dex */
public final class d {
    public static boolean a;

    public static void a(Context context, c cVar, a aVar, Map map, String str, String str2) {
        byte[] bArr;
        if (a) {
            Log.e("SignerInstance", "sign: library received error. It has locked down");
            return;
        }
        if (map == null || map.size() == 0 || str == null || str2 == null) {
            Log.e("SignerInstance", "sign: One or more parameters are null");
            return;
        }
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
        int i = 2;
        while (true) {
            if (i <= 0) {
                bArr = null;
                break;
            }
            try {
                cVar.b(context);
                bArr = cVar.a(context, map.toString().getBytes("UTF-8"));
                break;
            } catch (b e) {
                Log.e("SignerInstance", "sign: Api is less than JellyBean-4-18");
                a = true;
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e;
            } catch (InvalidKeyException | UnrecoverableKeyException e2) {
                Log.e("SignerInstance", "sign: Received a retriable exception: " + e2.getMessage(), e2);
                Log.e("SignerInstance", "sign: Attempting retry #" + i);
                i += -1;
                cVar.a(context);
            } catch (Exception e3) {
                Log.e("SignerInstance", "sign: Received an Exception: " + e3.getMessage(), e3);
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e3;
            }
        }
        if (i == 0) {
            a = true;
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        byte[] a2 = ((NativeLibHelper) aVar).a(context, map, bArr, cVar.a);
        if (a2 == null) {
            Log.e("SignerInstance", "sign: Returned an null signature. Exiting...");
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        int length = a2.length;
        char[] cArr = new char[length * 2];
        for (int i2 = 0; i2 < length; i2++) {
            byte b = a2[i2];
            int i3 = i2 * 2;
            char[] cArr2 = e.a;
            cArr[i3] = cArr2[(b & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b & PKIBody._CCP];
        }
        map.put(X509CertImpl.SIGNATURE, new String(cArr));
        map.remove("activity_kind");
        map.remove("client_sdk");
    }

    public static void a(Set set, Map map, Map map2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (String) map.get(str));
            }
        }
    }
}
