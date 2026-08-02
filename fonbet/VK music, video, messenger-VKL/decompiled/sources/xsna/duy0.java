package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.mxy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class duy0 extends t1z0 {
    public final WebView b;
    public b c;
    public boolean d;
    public boolean e;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a {
        public final mxy0 a;

        public a(mxy0 mxy0Var) {
            this.a = mxy0Var;
        }

        @JavascriptInterface
        public void onCTAClicked() {
            o8z0.d(new b04(this.a, 20));
        }

        @JavascriptInterface
        public void onCustomEvent(@NonNull String str, @Nullable String str2) {
            o8z0.d(new xy4(this, str, str2));
        }

        @JavascriptInterface
        public void onInteractiveFailedToLoad(@Nullable String str) {
            o8z0.d(new xz3(7, this, str));
        }

        @JavascriptInterface
        public void onInteractiveFinished() {
            o8z0.d(new cuy0(this.a, 0));
        }

        @JavascriptInterface
        public void onInteractiveLoaded() {
            o8z0.d(new u12(this.a, 17));
        }

        @JavascriptInterface
        public void onInteractiveStarted() {
            o8z0.d(new to2(this.a, 19));
        }

        @JavascriptInterface
        public void onWindowLoaded() {
            o8z0.d(new n93(this.a, 11));
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface b {
    }

    public duy0(Context context, mxy0 mxy0Var, mxy0.b bVar) {
        super(context);
        this.d = false;
        this.e = true;
        WebView webView = new WebView(context);
        this.b = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        webView.addJavascriptInterface(new a(mxy0Var), "myTargetPlayableAds");
        webView.setWebViewClient(bVar);
        addView(webView, -1, -1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (!this.e) {
            return true;
        }
        if (!this.d && motionEvent.getActionMasked() == 0 && (bVar = this.c) != null) {
            this.d = true;
            mxy0.a aVar = ((mxy0) bVar).i;
            if (aVar.d == 0 && aVar.e == null) {
                tnf tnfVar = new tnf(aVar, 15);
                aVar.e = tnfVar;
                o8z0.g.postDelayed(tnfVar, 3000L);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @NonNull
    public WebView getWebView() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        setMeasuredDimension(size, size2);
    }

    public void setInteractionEnabled(boolean z) {
        this.e = z;
    }

    public void setPlayableStartInteractiveListener(@Nullable b bVar) {
        this.c = bVar;
    }
}
