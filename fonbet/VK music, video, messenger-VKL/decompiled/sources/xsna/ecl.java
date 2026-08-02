package xsna;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;

/* compiled from: DefaultCacheKeyFactory.java */
/* loaded from: classes.dex */
public class ecl {
    public static ecl a;
    public static final siw b = new siw("SVG", ".svg");

    public nc7 a(ImageRequest imageRequest, Object obj) {
        nc7 nc7Var = new nc7(b(imageRequest.l()).toString(), imageRequest.i(), imageRequest.j(), imageRequest.c(), null, null);
        nc7Var.d(obj);
        return nc7Var;
    }

    public ww8 c(Uri uri) {
        return new ppj0(b(uri).toString());
    }

    public ww8 d(ImageRequest imageRequest, Object obj) {
        return c(imageRequest.l());
    }

    public nc7 e(ImageRequest imageRequest, Object obj) {
        ww8 ww8Var;
        String str;
        ktc0 f = imageRequest.f();
        if (f != null) {
            ww8 a2 = f.a();
            str = f.getClass().getName();
            ww8Var = a2;
        } else {
            ww8Var = null;
            str = null;
        }
        nc7 nc7Var = new nc7(b(imageRequest.l()).toString(), imageRequest.i(), imageRequest.j(), imageRequest.c(), ww8Var, str);
        nc7Var.d(obj);
        return nc7Var;
    }

    public Uri b(Uri uri) {
        return uri;
    }
}
