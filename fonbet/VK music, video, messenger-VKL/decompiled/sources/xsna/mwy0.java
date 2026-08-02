package xsna;

import android.content.Context;
import android.view.GestureDetector;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.ironsource.B5;
import java.lang.ref.WeakReference;
import xsna.a6z0;
import xsna.a6z0.c;
import xsna.p7z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class mwy0 implements a6z0.a {
    public final b1z0 a;
    public final WeakReference b;
    public final izy0 c;
    public final y1z0 d;
    public WeakReference e;
    public p7z0.d f;

    public mwy0(b1z0 b1z0Var, y1z0 y1z0Var, Context context) {
        gu8.c(null, "ShoppableAdPresenter: create presenter");
        this.a = b1z0Var;
        this.b = new WeakReference(context);
        this.d = y1z0Var;
        this.c = izy0.b(b1z0Var.b, b1z0Var.a, null);
    }

    public final a6z0 a() {
        a6z0 a6z0Var;
        WeakReference weakReference = this.e;
        if (weakReference != null && (a6z0Var = (a6z0) weakReference.get()) != null) {
            return a6z0Var;
        }
        Context context = (Context) this.b.get();
        if (context == null) {
            gu8.c(null, "ShoppableAdPresenter: context is null");
            return null;
        }
        a6z0 a6z0Var2 = new a6z0(context);
        a6z0Var2.g = 0L;
        a6z0.b bVar = new a6z0.b();
        a6z0.c cVar = a6z0Var2.new c();
        new GestureDetector(a6z0Var2.getContext(), new GestureDetector.SimpleOnGestureListener()).setIsLongpressEnabled(false);
        a6z0Var2.setOnTouchListener(new pnb(a6z0Var2, 1));
        a6z0Var2.setHorizontalScrollBarEnabled(false);
        a6z0Var2.setVerticalScrollBarEnabled(false);
        a6z0Var2.setWebViewBackgroundColor(-16777216);
        WebSettings settings = a6z0Var2.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        a6z0Var2.setWebChromeClient(bVar);
        a6z0Var2.setWebViewClient(cVar);
        a6z0Var2.setListener(this);
        a6z0Var2.c.add(this.d);
        this.c.f(a6z0Var2);
        String str = this.a.U;
        WebView webView = a6z0Var2.b;
        if (webView != null) {
            try {
                webView.loadDataWithBaseURL(null, str, "text/html", B5.O, null);
            } catch (Throwable th) {
                lyy0.c(th);
            }
        }
        this.e = new WeakReference(a6z0Var2);
        return a6z0Var2;
    }
}
