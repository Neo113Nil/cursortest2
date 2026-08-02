package xsna;

import android.R;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import xsna.c9z0;
import xsna.j7z0;
import xsna.qty0;
import xsna.thz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class w7z0 implements j7z0.a, qty0.a {
    public final z6z0 b;
    public izy0 c;
    public WeakReference d;
    public WeakReference e;
    public c9z0.a f;
    public thz0 g;
    public qty0 h;
    public boolean i;
    public boolean j;

    public w7z0(z6z0 z6z0Var) {
        this.b = z6z0Var;
    }

    @Override // xsna.qty0.a
    public final void a(String str) {
        j7z0 j7z0Var;
        WeakReference weakReference;
        WeakReference weakReference2 = this.d;
        if (weakReference2 == null || (j7z0Var = (j7z0) weakReference2.get()) == null) {
            return;
        }
        c9z0.a aVar = this.f;
        if (aVar != null && (weakReference = this.e) != null) {
            View view = (View) weakReference.get();
            Context context = j7z0Var.getContext();
            c9z0 c9z0Var = aVar.b;
            gu8.c(null, "NativeAdEngine: Click on native content received");
            c9z0Var.d(this.b, str, 1, view, context);
            h8z0.e(c9z0Var.d.a, "click", 2, null);
        }
        this.i = true;
        if (j7z0Var.isShowing()) {
            j7z0Var.dismiss();
        }
    }

    @Override // xsna.j7z0.a
    public final void b(boolean z) {
        qty0 qty0Var;
        if (z == this.j) {
            return;
        }
        this.j = z;
        izy0 izy0Var = this.c;
        if (izy0Var == null) {
            return;
        }
        if (!z) {
            izy0Var.h();
            return;
        }
        WeakReference weakReference = this.e;
        if (weakReference == null || (qty0Var = (qty0) weakReference.get()) == null) {
            return;
        }
        this.c.f(qty0Var);
    }

    @Override // xsna.j7z0.a
    public final void c(j7z0 j7z0Var, FrameLayout frameLayout) {
        epy0 epy0Var = new epy0(frameLayout.getContext());
        epy0Var.setOnCloseListener(new k6c0(this, j7z0Var));
        frameLayout.addView(epy0Var, -1, -1);
        qty0 qty0Var = new qty0(frameLayout.getContext());
        this.h = qty0Var;
        qty0Var.setVisibility(8);
        this.h.setBannerWebViewListener(this);
        epy0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -1));
        this.h.setData(this.b.U);
        View progressBar = new ProgressBar(frameLayout.getContext(), null, R.attr.progressBarStyle);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        frameLayout.postDelayed(new qo2(12, this, progressBar), 555L);
    }

    @Override // xsna.qty0.a
    public final void f(String str) {
        gu8.c(null, "NativeAdContentController: Content JS error - ".concat(str));
    }

    @Override // xsna.j7z0.a
    public final void m() {
        if (this.d != null) {
            if (!this.i) {
                h8z0.e(this.b.a, "closedByUser", 999, null);
            }
            this.d.clear();
            this.d = null;
        }
        izy0 izy0Var = this.c;
        if (izy0Var != null) {
            izy0Var.h();
            this.c = null;
        }
        WeakReference weakReference = this.e;
        if (weakReference != null) {
            weakReference.clear();
            this.e = null;
        }
        thz0 thz0Var = this.g;
        if (thz0Var != null) {
            thz0Var.g();
        }
        qty0 qty0Var = this.h;
        if (qty0Var != null) {
            qty0Var.a(this.g != null ? 7000 : 0);
        }
    }

    @Override // xsna.qty0.a
    public final void b() {
    }

    @Override // xsna.qty0.a
    public final void a(WebView webView) {
        thz0 thz0Var = this.g;
        if (thz0Var == null) {
            return;
        }
        thz0Var.d(webView, new thz0.b[0]);
        this.g.h();
    }
}
