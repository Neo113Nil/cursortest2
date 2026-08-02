package xsna;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import com.vk.superapp.browser.ui.callback.ScreenState;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.util.Features;
import xsna.c63;
import xsna.mix0;

/* compiled from: OnScreenStateChangeCallback.kt */
/* loaded from: classes6.dex */
public final class yix0 extends aml {
    public final mfu0 b;
    public final bpn0 c = new bpn0(new j8n0(this, 28));
    public final Set<Activity> d = Collections.newSetFromMap(new WeakHashMap());
    public final a e = new a();

    /* compiled from: OnScreenStateChangeCallback.kt */
    public static final class a extends c63.b {
        public a() {
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            yix0.this.e(activity);
        }
    }

    public yix0(mfu0 mfu0Var) {
        this.b = mfu0Var;
    }

    @Override // xsna.eb80
    public final void a() {
        xgx0.a.getClass();
        xgx0.a("WebViewLayerTypeSwitcher: onAppBackground");
        this.a = ScreenState.BACKGROUND;
        WebView view = this.b.getState().getView();
        if (view == null) {
            return;
        }
        int layerType = view.getLayerType();
        if (layerType != 0 ? layerType == 2 : view.isHardwareAccelerated()) {
            xgx0.a("WebViewLayerTypeSwitcher: switchLayerToSoftware.\n currentState=" + this.a);
            view.setLayerType(1, null);
        }
        xgx0.a("WebViewLayerTypeSwitcher: startTrackingOtherForegroundActivity.\n currentState=" + this.a);
        this.d.clear();
        c63 c63Var = c63.a;
        c63.a(this.e);
        e(c63.b());
    }

    @Override // xsna.eb80
    public final void b() {
        xgx0 xgx0Var = xgx0.a;
        xgx0Var.getClass();
        xgx0.a("WebViewLayerTypeSwitcher: onAppForeground");
        this.a = ScreenState.FOREGROUND;
        String str = "WebViewLayerTypeSwitcher: stopTrackingOtherForegroundActivity.\n currentState=" + this.a;
        xgx0Var.getClass();
        xgx0.a(str);
        c63 c63Var = c63.a;
        c63.c(this.e);
        WebView view = this.b.getState().getView();
        if (view == null || view.getLayerType() == ((Number) this.c.getValue()).intValue()) {
            return;
        }
        view.setVisibility(4);
        d(view, 0);
    }

    @Override // xsna.eb80
    public final void c() {
        xgx0 xgx0Var = xgx0.a;
        xgx0Var.getClass();
        xgx0.a("WebViewLayerTypeSwitcher: onAppClosed");
        this.a = ScreenState.CLOSED;
        String str = "WebViewLayerTypeSwitcher: stopTrackingOtherForegroundActivity.\n currentState=" + this.a;
        xgx0Var.getClass();
        xgx0.a(str);
        c63 c63Var = c63.a;
        c63.c(this.e);
        this.d.clear();
    }

    public final void d(final WebView webView, final int i) {
        xgx0 xgx0Var = xgx0.a;
        StringBuilder b = ji.b(i, "WebViewLayerTypeSwitcher: scheduleSwitchLayerToOrigin.\n attemptNumber=", ", currentState=");
        b.append(this.a);
        String sb = b.toString();
        xgx0Var.getClass();
        xgx0.a(sb);
        if (!zq70.C(Features.VISUAL_STATE_CALLBACK)) {
            i0q0.d((i + 1) * 50, new Runnable() { // from class: xsna.xix0
                @Override // java.lang.Runnable
                public final void run() {
                    yix0.this.f(webView, i);
                }
            });
            return;
        }
        mix0.a aVar = new mix0.a() { // from class: xsna.wix0
            @Override // xsna.mix0.a
            public final void onComplete(long j) {
                yix0.this.f(webView, i);
            }
        };
        int i2 = mix0.a;
        oix0.a.getClass();
        my2.i(webView, 0L, aVar);
    }

    public final void e(Activity activity) {
        xgx0 xgx0Var = xgx0.a;
        String str = "WebViewLayerTypeSwitcher: trackOtherForegroundActivity.\n activity=" + activity + ", currentState=" + this.a;
        xgx0Var.getClass();
        xgx0.a(str);
        if (activity != null) {
            this.d.add(activity);
        }
    }

    public final void f(WebView webView, int i) {
        Object obj;
        Window window;
        xgx0 xgx0Var = xgx0.a;
        StringBuilder b = ji.b(i, "WebViewLayerTypeSwitcher: trySwitchLayerToOrigin.\n attemptNumber=", ", currentState=");
        b.append(this.a);
        String sb = b.toString();
        xgx0Var.getClass();
        xgx0.a(sb);
        if (this.a != ScreenState.FOREGROUND) {
            return;
        }
        c63 c63Var = c63.a;
        LinkedHashSet k = izi0.k(this.d, c63.b());
        xgx0.a("WebViewLayerTypeSwitcher: isHierarchyContainsConflictWebView.\nactivitiesToCheckCount=" + k.size());
        if (!k.isEmpty()) {
            Iterator it = k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Activity activity = (Activity) it.next();
                View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                if (viewGroup != null) {
                    Iterator it2 = rli0.A(rli0.j(new lxt0(viewGroup), hxt0.b)).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        WebView webView2 = (WebView) obj;
                        if (webView != webView2) {
                            int layerType = webView2.getLayerType();
                            if (layerType != 0 ? layerType == 2 : webView2.isHardwareAccelerated()) {
                                break;
                            }
                        }
                    }
                    if (((WebView) obj) != null) {
                        if (i < 10) {
                            d(webView, i + 1);
                            return;
                        }
                    }
                }
            }
        }
        webView.setVisibility(0);
        webView.setLayerType(((Number) this.c.getValue()).intValue(), null);
        webView.invalidate();
    }
}
