package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.vk.common.links.LaunchContext;
import java.util.Map;

/* compiled from: BrowserRouter.kt */
/* loaded from: classes.dex */
public interface rk8 {
    static /* synthetic */ void g(rk8 rk8Var, Context context, Uri uri, LaunchContext launchContext, Bundle bundle, int i) {
        if ((i & 8) != 0) {
            bundle = null;
        }
        rk8Var.e(context, uri, launchContext, bundle, (i & 16) != 0);
    }

    void a(Context context, Uri uri);

    Uri b(Uri uri, Map<String, String> map, Bundle bundle);

    void c(Context context, Bundle bundle, LaunchContext launchContext, String str);

    void d(Context context, Uri uri, boolean z);

    void e(Context context, Uri uri, LaunchContext launchContext, Bundle bundle, boolean z);

    void f(Context context, Bundle bundle, LaunchContext launchContext, String str);

    void h(Context context, String str);

    void i(Context context, Uri uri, LaunchContext launchContext, Bundle bundle);

    void k(Context context, String str, int i, String str2);
}
