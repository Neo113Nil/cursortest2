package xsna;

import android.util.Base64OutputStream;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class gjz0 {
    public static String a(HashMap hashMap) {
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 2));
            try {
                boolean z = true;
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getValue();
                    if (str2 != null) {
                        String str3 = (String) entry.getKey();
                        try {
                            str = URLEncoder.encode(str2, C.UTF8_NAME);
                        } catch (Throwable th) {
                            gu8.c(null, "UrlResolver: Unable to encode url - " + th.getMessage());
                            str = "";
                        }
                        if (z) {
                            z = false;
                        } else {
                            deflaterOutputStream.write(38);
                        }
                        deflaterOutputStream.write(str3.getBytes());
                        deflaterOutputStream.write(61);
                        deflaterOutputStream.write(str.getBytes());
                    }
                }
                deflaterOutputStream.close();
                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                deflaterOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream2;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
