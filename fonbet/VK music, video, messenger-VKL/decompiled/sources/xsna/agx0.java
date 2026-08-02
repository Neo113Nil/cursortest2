package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import java.util.Set;

/* compiled from: WebAuthBrowserOpener.kt */
/* loaded from: classes17.dex */
public final class agx0 {
    public static void a(Context context, rk8 rk8Var, Uri uri) {
        LaunchContext launchContext = new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, false, false, null, null, null, 67098623);
        Set<String> set = xk8.a;
        if (xk8.e(context.getPackageManager(), uri, true) != null) {
            rk8Var.i(context, uri, launchContext, null);
        } else {
            if (pok.b(context, uri)) {
                return;
            }
            rk8Var.i(context, uri, launchContext, null);
        }
    }
}
