package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.MimeTypeMap;
import coil.request.ViewTargetRequestManager;
import coil.view.Scale;
import java.io.Closeable;
import kotlin.collections.a;

/* loaded from: classes.dex */
public abstract class m {
    public static final Bitmap.Config[] a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
    public static final Bitmap.Config b = Bitmap.Config.HARDWARE;
    public static final meu c = new keu().d();

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || evu0.J(str)) {
            return null;
        }
        String h0 = evu0.h0('#', str, str);
        String h02 = evu0.h0('?', h0, h0);
        return mimeTypeMap.getMimeTypeFromExtension(evu0.e0('.', evu0.e0('/', h02, h02), ""));
    }

    public static final ViewTargetRequestManager c(View view) {
        ViewTargetRequestManager viewTargetRequestManager;
        Object tag = view.getTag(tch0.coil_request_manager);
        ViewTargetRequestManager viewTargetRequestManager2 = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager2 != null) {
            return viewTargetRequestManager2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(tch0.coil_request_manager);
                viewTargetRequestManager = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                if (viewTargetRequestManager == null) {
                    viewTargetRequestManager = new ViewTargetRequestManager(view);
                    view.addOnAttachStateChangeListener(viewTargetRequestManager);
                    view.setTag(tch0.coil_request_manager, viewTargetRequestManager);
                }
            } finally {
            }
        }
        return viewTargetRequestManager;
    }

    public static final boolean d(Uri uri) {
        return jl40.l(uri.getScheme(), "file") && jl40.l((String) a.R(uri.getPathSegments()), "android_asset");
    }

    public static final int e(jh91 jh91Var, Scale scale) {
        if (jh91Var instanceof lkj) {
            return ((lkj) jh91Var).a;
        }
        int i = l.b[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        w511.b();
        return 0;
    }
}
