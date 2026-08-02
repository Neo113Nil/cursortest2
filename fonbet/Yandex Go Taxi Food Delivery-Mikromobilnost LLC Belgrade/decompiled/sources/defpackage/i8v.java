package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class i8v {
    public static final Object d = new Object();
    public final Context a;
    public final String b;
    public final Map c;

    public i8v(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || g8e.a(1, str) == '/') {
            this.b = str;
        } else {
            this.b = str.concat("/");
        }
        this.c = map;
        if (callback instanceof View) {
            this.a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.a = null;
        }
    }

    public final Bitmap a(String str) {
        String str2 = this.b;
        wtz wtzVar = (wtz) this.c.get(str);
        if (wtzVar != null) {
            int i = wtzVar.b;
            int i2 = wtzVar.a;
            Bitmap bitmap = wtzVar.f;
            if (bitmap != null) {
                return bitmap;
            }
            Context context = this.a;
            if (context != null) {
                String str3 = wtzVar.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str3.startsWith("data:") && str3.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                        try {
                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                            if (decodeByteArray != null) {
                                Bitmap d2 = zw21.d(decodeByteArray, i2, i);
                                b(d2, str);
                                return d2;
                            }
                            lgz.b("Decoded image `" + str + "` is null.");
                            return null;
                        } catch (IllegalArgumentException unused) {
                            lgz.c("Unable to decode image `" + str + "`.");
                            return null;
                        }
                    } catch (IllegalArgumentException unused2) {
                        lgz.c("data URL did not have correct base64 format.");
                        return null;
                    }
                }
                try {
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                    }
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(str2 + str3), null, options);
                        if (decodeStream != null) {
                            Bitmap d3 = zw21.d(decodeStream, i2, i);
                            b(d3, str);
                            return d3;
                        }
                        lgz.b("Decoded image `" + str + "` is null.");
                        return null;
                    } catch (IllegalArgumentException unused3) {
                        lgz.c("Unable to decode image `" + str + "`.");
                        return null;
                    }
                } catch (IOException unused4) {
                    lgz.c("Unable to open asset.");
                    return null;
                }
            }
        }
        return null;
    }

    public final void b(Bitmap bitmap, String str) {
        synchronized (d) {
            ((wtz) this.c.get(str)).f = bitmap;
        }
    }
}
