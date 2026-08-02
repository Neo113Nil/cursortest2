package xsna;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.my.target.common.MyTargetActivity;
import java.util.Objects;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class z8z0 {
    public static boolean b(Context context, String str, String str2) {
        try {
            if (str == null) {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str2));
                intent.addFlags(268435456);
                context.startActivity(intent);
                return true;
            }
            Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str2));
            intent2.addFlags(268435456);
            intent2.setPackage(str);
            context.startActivity(intent2);
            return true;
        } catch (Throwable th) {
            gu8.e(null, "InternalNavigationRouterImpl: Error opening link: " + th.getMessage());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [xsna.y8z0] */
    public final void a(final xey0 xey0Var, final Context context, final String str) {
        if (xey0Var.w) {
            b(context, null, str);
            return;
        }
        final z6 z6Var = new z6(this, context, str);
        final pm01 pm01Var = new pm01(xey0Var);
        idy0 idy0Var = xr50.c;
        Objects.requireNonNull(idy0Var);
        final giz0 c = ehz0.c(idy0Var);
        c.b(new Runnable() { // from class: xsna.y8z0
            @Override // java.lang.Runnable
            public final void run() {
                Uri parse = Uri.parse(str);
                giy0 giy0Var = xey0Var.T;
                giz0 giz0Var = giz0.this;
                if (giz0Var.a(pm01Var, parse, giy0Var, context)) {
                    return;
                }
                giz0Var.a();
                z6Var.run();
            }
        });
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a implements MyTargetActivity.a {
        public final String a;
        public tiz0 b;

        public a(String str) {
            this.a = str;
        }

        @Override // com.my.target.common.MyTargetActivity.a
        public final boolean d() {
            tiz0 tiz0Var = this.b;
            if (tiz0Var != null) {
                lyy0 lyy0Var = tiz0Var.l;
                lyy0Var.getClass();
                try {
                    WebView webView = lyy0Var.b;
                    if (webView != null) {
                        if (webView.canGoBack()) {
                            WebView webView2 = this.b.l.b;
                            if (webView2 == null) {
                                return false;
                            }
                            try {
                                webView2.goBack();
                                return false;
                            } catch (Throwable th) {
                                lyy0.c(th);
                                return false;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    lyy0.c(th2);
                    return true;
                }
            }
            return true;
        }

        @Override // com.my.target.common.MyTargetActivity.a
        public final void g(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
            myTargetActivity.setTheme(R.style.Theme.Light.NoTitleBar);
            Window window = myTargetActivity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(-12232092);
            try {
                tiz0 tiz0Var = new tiz0(myTargetActivity);
                this.b = tiz0Var;
                frameLayout.addView(tiz0Var);
                this.b.b();
                this.b.setUrl(this.a);
                this.b.setListener(new nit(myTargetActivity, 29));
            } catch (Throwable th) {
                gu8.e(null, "InternalNavigationRouterImpl: Error - " + th.getMessage());
                myTargetActivity.finish();
            }
        }

        @Override // com.my.target.common.MyTargetActivity.a
        public final void l() {
            tiz0 tiz0Var = this.b;
            if (tiz0Var == null) {
                return;
            }
            lyy0 lyy0Var = tiz0Var.l;
            lyy0Var.setWebChromeClient(null);
            lyy0Var.a(0);
            this.b = null;
        }

        @Override // com.my.target.common.MyTargetActivity.a
        public final void a() {
        }

        @Override // com.my.target.common.MyTargetActivity.a
        public final void c() {
        }

        @Override // com.my.target.common.MyTargetActivity.a
        public final void m() {
        }

        @Override // com.my.target.common.MyTargetActivity.a
        public final void i(MyTargetActivity myTargetActivity) {
        }
    }
}
