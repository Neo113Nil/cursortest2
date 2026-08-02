package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import xsna.qty0;
import xsna.u7z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class cwy0 implements qty0.a, u7z0 {
    public final qty0 d;
    public final wvy0 e;
    public final FrameLayout f;
    public final r5z0 h;
    public b i;
    public u7z0.a j;
    public long k;
    public long l;
    public nxy0 m;
    public long n;
    public long o;
    public fvy0 p;
    public final saz0 b = new saz0(o8z0.g, 200);
    public final io.reactivex.rxjava3.android.a c = new io.reactivex.rxjava3.android.a(this, 18);
    public final Handler g = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements View.OnClickListener {
        public final cwy0 b;

        public a(cwy0 cwy0Var) {
            this.b = cwy0Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cwy0 cwy0Var = this.b;
            u7z0.a aVar = cwy0Var.j;
            nxy0 nxy0Var = cwy0Var.m;
            if (aVar == null || nxy0Var == null) {
                return;
            }
            aVar.f(nxy0Var);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class b implements Runnable {
        public final cwy0 b;

        public b(cwy0 cwy0Var) {
            this.b = cwy0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            u7z0.a aVar = this.b.j;
            if (aVar != null) {
                aVar.e();
            }
        }
    }

    public cwy0(Context context) {
        qty0 qty0Var = new qty0(context);
        this.d = qty0Var;
        wvy0 wvy0Var = new wvy0(context);
        this.e = wvy0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        wvy0Var.setContentDescription("Close");
        c1z0.n(wvy0Var, "close_button");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        wvy0Var.setVisibility(8);
        wvy0Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 1;
        qty0Var.setLayoutParams(layoutParams2);
        frameLayout.addView(qty0Var);
        if (wvy0Var.getParent() == null) {
            frameLayout.addView(wvy0Var);
        }
        Bitmap a2 = ywy0.a((int) tj0.a(1, 28, context));
        if (a2 != null) {
            wvy0Var.a(a2, false);
        }
        r5z0 r5z0Var = new r5z0(context, null);
        this.h = r5z0Var;
        int d = c1z0.d(10, context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(d, d, d, d);
        frameLayout.addView(r5z0Var, layoutParams3);
    }

    @Override // xsna.u7z0
    public final void a(int i) {
        qty0 qty0Var = this.d;
        WebView webView = qty0Var.getWebView();
        if (webView != null) {
            webView.evaluateJavascript("window.playerDestroy && window.playerDestroy();", null);
        }
        this.f.removeView(qty0Var);
        qty0Var.a(i);
    }

    @Override // xsna.qty0.a
    public final void b() {
        u7z0.a aVar = this.j;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // xsna.u7z0
    public final void d(nxy0 nxy0Var) {
        this.m = nxy0Var;
        qty0 qty0Var = this.d;
        qty0Var.setBannerWebViewListener(this);
        String str = nxy0Var.a0;
        io.reactivex.rxjava3.android.a aVar = this.c;
        saz0 saz0Var = this.b;
        if (str == null) {
            u7z0.a aVar2 = this.j;
            if (aVar2 != null) {
                aVar2.k();
                u7z0.a aVar3 = this.j;
                if (aVar3 != null) {
                    aVar3.a(true);
                    saz0Var.h(aVar);
                    return;
                }
                return;
            }
            return;
        }
        qty0Var.setData(str);
        qty0Var.setForceMediaPlayback(nxy0Var.c0);
        kiw kiwVar = nxy0Var.U;
        wvy0 wvy0Var = this.e;
        if (kiwVar != null) {
            wvy0Var.a(kiwVar.a(), false);
        }
        wvy0Var.setOnClickListener(new a(this));
        if (nxy0Var.V > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            gu8.c(null, "InterstitialHtmlPresenter: Banner will be allowed to close in " + nxy0Var.V + " seconds");
            this.l = (long) (nxy0Var.V * 1000.0f);
            saz0Var.c(aVar);
            this.k = System.currentTimeMillis();
            u7z0.a aVar4 = this.j;
            if (aVar4 != null) {
                aVar4.a(false);
            }
        } else {
            gu8.c(null, "InterstitialHtmlPresenter: Banner is allowed to close");
            wvy0Var.setVisibility(0);
        }
        float f = nxy0Var.b0;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            b bVar = new b(this);
            this.i = bVar;
            long j = ((long) f) * 1000;
            this.o = j;
            Handler handler = this.g;
            handler.removeCallbacks(bVar);
            this.n = System.currentTimeMillis();
            handler.postDelayed(this.i, j);
        }
        wty0 wty0Var = nxy0Var.L;
        r5z0 r5z0Var = this.h;
        if (wty0Var == null) {
            r5z0Var.setVisibility(8);
        } else {
            r5z0Var.setImageBitmap(wty0Var.a.a());
            r5z0Var.setOnClickListener(new oyt(this, 13));
            if (wty0Var.c != null) {
                fvy0 fvy0Var = new fvy0(wty0Var, new mnh0());
                this.p = fvy0Var;
                fvy0Var.d = new vxb(this, nxy0Var);
            }
        }
        u7z0.a aVar5 = this.j;
        if (aVar5 != null) {
            aVar5.j(nxy0Var, this.f);
        }
    }

    @Override // xsna.jaz0
    public final void destroy() {
        a(0);
    }

    @Override // xsna.u7z0
    public final void e(u7z0.a aVar) {
        this.j = aVar;
    }

    @Override // xsna.qty0.a
    public final void f(String str) {
        u7z0.a aVar = this.j;
        if (aVar != null) {
            aVar.k();
            u7z0.a aVar2 = this.j;
            if (aVar2 != null) {
                aVar2.a(true);
                this.b.h(this.c);
            }
        }
    }

    @Override // xsna.jaz0
    public final View getCloseButton() {
        return this.e;
    }

    @Override // xsna.jaz0
    public final View i() {
        return this.f;
    }

    @Override // xsna.jaz0
    public final void pause() {
        if (this.k > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.k;
            if (currentTimeMillis > 0) {
                long j = this.l;
                if (currentTimeMillis < j) {
                    this.l = j - currentTimeMillis;
                }
            }
            this.l = 0L;
        }
        if (this.n > 0) {
            long currentTimeMillis2 = System.currentTimeMillis() - this.n;
            if (currentTimeMillis2 > 0) {
                long j2 = this.o;
                if (currentTimeMillis2 < j2) {
                    this.o = j2 - currentTimeMillis2;
                }
            }
            this.o = 0L;
        }
        b bVar = this.i;
        if (bVar != null) {
            this.g.removeCallbacks(bVar);
        }
        this.b.h(this.c);
    }

    @Override // xsna.jaz0
    public final void resume() {
        b bVar;
        if (this.l > 0) {
            this.b.c(this.c);
            this.k = System.currentTimeMillis();
            u7z0.a aVar = this.j;
            if (aVar != null) {
                aVar.a(false);
            }
        }
        long j = this.o;
        if (j <= 0 || (bVar = this.i) == null) {
            return;
        }
        Handler handler = this.g;
        handler.removeCallbacks(bVar);
        this.n = System.currentTimeMillis();
        handler.postDelayed(this.i, j);
    }

    @Override // xsna.qty0.a
    public final void a(String str) {
        dhz0 akz0Var;
        nxy0 nxy0Var = this.m;
        if (nxy0Var != null && nxy0Var.T.c) {
            akz0Var = new viy0(0, new y9z0());
        } else {
            akz0Var = new akz0();
        }
        u7z0.a aVar = this.j;
        if (aVar != null) {
            aVar.b(this.m, str, 1, wn4.d(akz0Var), this.f.getContext());
        }
    }

    @Override // xsna.jaz0
    public final void stop() {
    }

    @Override // xsna.qty0.a
    public final void a(WebView webView) {
        u7z0.a aVar = this.j;
        if (aVar != null) {
            aVar.a(webView);
        }
    }
}
