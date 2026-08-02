package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes7.dex */
public abstract class cs71 {
    public static final long a = (long) (Math.floor(Math.random() * 4.294967295E9d) + 1.0d);
    public static final /* synthetic */ int b = 0;

    public static final boolean a(Context context) {
        try {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage == null) {
                currentWebViewPackage = null;
                try {
                    String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
                    if (str != null) {
                        currentWebViewPackage = context.getPackageManager().getPackageInfo(str, 0);
                    }
                } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            return currentWebViewPackage != null;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public static boolean b(ln61 ln61Var) {
        return ln61Var == null || ln61Var.a();
    }
}
