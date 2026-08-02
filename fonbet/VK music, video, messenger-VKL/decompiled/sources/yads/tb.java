package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.drm0;

/* loaded from: classes10.dex */
public abstract class tb {
    public static final long a = (long) (Math.floor(Math.random() * 4294967295L) + 1);
    public static final /* synthetic */ int b = 0;

    public static Bitmap a(String str) {
        try {
            String substring = str.substring(drm0.K(0, 6, str, StringUtils.COMMA, false) + 1);
            if (substring.length() <= 0) {
                return null;
            }
            byte[] decode = Base64.decode(substring, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String a(Object obj) {
        String obj2 = obj != null ? obj.toString() : null;
        return obj2 == null ? "" : obj2;
    }

    public static boolean a(mu muVar) {
        return muVar == null || muVar.a();
    }

    public static final boolean a(Context context) {
        try {
            return ap3.a(context) != null;
        } catch (Throwable unused) {
            return false;
        }
    }
}
