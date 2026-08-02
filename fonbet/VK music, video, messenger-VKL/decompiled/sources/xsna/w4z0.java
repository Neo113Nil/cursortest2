package xsna;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.BuildConfig;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import xsna.qbz0.b;
import xsna.qbz0.c;
import xsna.rhz0;
import xsna.u7z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class w4z0 implements u7z0 {
    public final saz0 b;
    public final t12 c;
    public final epy0 d;
    public final mgz0 e;
    public final qbz0 f;
    public final WeakReference g;
    public final Context h;
    public final r5z0 i;
    public String j;
    public Integer k;
    public fvy0 l;
    public rhz0 m;
    public u7z0.a n;
    public nxy0 o;
    public boolean p;
    public long q;
    public long r;
    public boolean s;
    public boolean t;
    public ycy u;

    public w4z0(Context context) {
        qbz0 qbz0Var = new qbz0();
        epy0 epy0Var = new epy0(context);
        this.b = new saz0(o8z0.g, 200);
        this.c = new t12(this, 16);
        this.t = true;
        this.u = new ycy(1);
        this.f = qbz0Var;
        this.h = context.getApplicationContext();
        this.d = epy0Var;
        if (context instanceof Activity) {
            this.g = new WeakReference((Activity) context);
        } else {
            this.g = new WeakReference(null);
        }
        this.j = "loading";
        this.e = new mgz0();
        epy0Var.setOnCloseListener(new fl40(this, 14));
        this.i = new r5z0(context, null);
        qbz0Var.c = this;
    }

    @Override // xsna.u7z0
    public final void a(int i) {
        rhz0 rhz0Var;
        this.b.h(this.c);
        if (!this.p) {
            this.p = true;
            if (i <= 0 && (rhz0Var = this.m) != null) {
                rhz0Var.d(true);
            }
        }
        epy0 epy0Var = this.d;
        ViewParent parent = epy0Var.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(epy0Var);
        }
        this.f.d = null;
        rhz0 rhz0Var2 = this.m;
        if (rhz0Var2 != null) {
            rhz0Var2.a(i);
            this.m = null;
        }
        epy0Var.removeAllViews();
    }

    public final void b(Uri uri) {
        nxy0 nxy0Var = this.o;
        dhz0 akz0Var = (nxy0Var == null || !nxy0Var.T.c) ? new akz0() : new viy0(0, new y9z0());
        u7z0.a aVar = this.n;
        if (aVar != null) {
            aVar.b(this.o, uri.toString(), 1, wn4.d(akz0Var), this.d.getContext());
        }
    }

    public final boolean c(ycy ycyVar) {
        if (!"none".equals((String) ycyVar.d)) {
            Activity activity = (Activity) this.g.get();
            if (activity != null) {
                try {
                    ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
                    int i = activityInfo.screenOrientation;
                    if (i == -1) {
                        int i2 = activityInfo.configChanges;
                        if ((i2 & 128) != 0 && (i2 & 1024) != 0) {
                            return true;
                        }
                    } else if (i == ycyVar.c) {
                    }
                } catch (Throwable unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // xsna.u7z0
    public final void d(nxy0 nxy0Var) {
        this.o = nxy0Var;
        long j = (long) (nxy0Var.V * 1000.0f);
        this.q = j;
        epy0 epy0Var = this.d;
        if (j > 0) {
            gu8.c(null, "InterstitialHtmlPresenter: Banner will be allowed to close in " + nxy0Var.V + " seconds");
            this.q = (long) (nxy0Var.V * 1000.0f);
            this.b.c(this.c);
            this.r = System.currentTimeMillis();
            u7z0.a aVar = this.n;
            if (aVar != null) {
                aVar.a(false);
            }
        } else {
            gu8.c(null, "InterstitialMraidPresenter: Banner is allowed to close");
            epy0Var.setCloseVisible(true);
        }
        String str = nxy0Var.a0;
        Context context = this.h;
        if (str != null) {
            rhz0 rhz0Var = new rhz0(context);
            rhz0Var.e = rhz0Var.getVisibility() == 0;
            WebSettings settings = rhz0Var.getSettings();
            if (settings != null) {
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setAllowContentAccess(false);
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
            rhz0.b bVar = new rhz0.b(rhz0Var.getContext(), rhz0Var);
            bVar.b = new kxa0(rhz0Var, 18);
            rhz0Var.setOnTouchListener(new apb(bVar, 1));
            this.m = rhz0Var;
            qbz0 qbz0Var = this.f;
            qbz0Var.d = rhz0Var;
            WebSettings settings2 = rhz0Var.getSettings();
            if (settings2 != null) {
                settings2.setJavaScriptEnabled(true);
                if ("interstitial".equals(qbz0Var.a)) {
                    settings2.setMediaPlaybackRequiresUserGesture(false);
                }
            }
            qbz0Var.d.setScrollContainer(false);
            qbz0Var.d.setVerticalScrollBarEnabled(false);
            qbz0Var.d.setHorizontalScrollBarEnabled(false);
            qbz0Var.d.setWebViewClient(qbz0Var.b);
            qbz0Var.d.setWebChromeClient(qbz0Var.new b());
            qbz0Var.d.setVisibilityChangedListener(qbz0Var.new c());
            epy0Var.addView(this.m, new FrameLayout.LayoutParams(-1, -1));
            rhz0 rhz0Var2 = qbz0Var.d;
            if (rhz0Var2 == null) {
                gu8.c(null, "MraidBridge: MRAID bridge called setContentHtml before WebView was attached");
            } else {
                qbz0Var.e = false;
                WebView webView = rhz0Var2.b;
                if (webView != null) {
                    try {
                        webView.loadDataWithBaseURL("https://ad.mail.ru/", str, "text/html", C.UTF8_NAME, null);
                    } catch (Throwable th) {
                        lyy0.c(th);
                    }
                }
            }
        }
        wty0 wty0Var = nxy0Var.L;
        r5z0 r5z0Var = this.i;
        if (wty0Var == null) {
            r5z0Var.setVisibility(8);
            return;
        }
        if (r5z0Var.getParent() != null) {
            return;
        }
        int d = c1z0.d(10, context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(d, d, d, d);
        epy0Var.addView(r5z0Var, layoutParams);
        r5z0Var.setImageBitmap(wty0Var.a.a());
        r5z0Var.setOnClickListener(new u4z0(this));
        if (wty0Var.c == null) {
            return;
        }
        fvy0 fvy0Var = new fvy0(wty0Var, new mnh0());
        this.l = fvy0Var;
        fvy0Var.d = new v4z0(this, nxy0Var);
    }

    @Override // xsna.jaz0
    public final void destroy() {
        a(0);
    }

    @Override // xsna.u7z0
    public final void e(u7z0.a aVar) {
        this.n = aVar;
    }

    public final boolean f(int i) {
        Activity activity = (Activity) this.g.get();
        if (activity != null && c(this.u)) {
            if (this.k == null) {
                this.k = Integer.valueOf(activity.getRequestedOrientation());
            }
            activity.setRequestedOrientation(i);
            return true;
        }
        this.f.d("setOrientationProperties", "Attempted to lock orientation to unsupported value: " + ((String) this.u.d));
        return false;
    }

    public final void g(String str) {
        nxy0 nxy0Var;
        gu8.c(null, "InterstitialMraidPresenter: MRAID state set to ".concat(str));
        this.j = str;
        qbz0 qbz0Var = this.f;
        qbz0Var.getClass();
        qbz0Var.c("mraidbridge.setState(" + JSONObject.quote(str) + ")");
        if ("hidden".equals(str)) {
            gu8.c(null, "InterstitialMraidPresenter: Mraid on close");
            u7z0.a aVar = this.n;
            if (aVar == null || (nxy0Var = this.o) == null) {
                return;
            }
            aVar.f(nxy0Var);
        }
    }

    @Override // xsna.jaz0
    public final View getCloseButton() {
        return null;
    }

    public final void h() {
        Integer num;
        if (this.m == null || "loading".equals(this.j) || "hidden".equals(this.j)) {
            return;
        }
        Activity activity = (Activity) this.g.get();
        if (activity != null && (num = this.k) != null) {
            activity.setRequestedOrientation(num.intValue());
        }
        this.k = null;
        if (BuildConfig.FLAVOR.equals(this.j)) {
            this.d.setVisibility(4);
            g("hidden");
        }
    }

    @Override // xsna.jaz0
    public final View i() {
        return this.d;
    }

    public final void j() {
        DisplayMetrics displayMetrics = this.h.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        mgz0 mgz0Var = this.e;
        Rect rect = mgz0Var.a;
        rect.set(0, 0, i, i2);
        mgz0.a(rect, mgz0Var.b);
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        Rect rect2 = mgz0Var.e;
        rect2.set(0, 0, i3, i4);
        mgz0.a(rect2, mgz0Var.f);
        int i5 = displayMetrics.widthPixels;
        int i6 = displayMetrics.heightPixels;
        Rect rect3 = mgz0Var.c;
        rect3.set(0, 0, i5, i6);
        mgz0.a(rect3, mgz0Var.d);
        int i7 = displayMetrics.widthPixels;
        int i8 = displayMetrics.heightPixels;
        Rect rect4 = mgz0Var.g;
        rect4.set(0, 0, i7, i8);
        mgz0.a(rect4, mgz0Var.h);
    }

    @Override // xsna.jaz0
    public final void pause() {
        this.p = true;
        rhz0 rhz0Var = this.m;
        if (rhz0Var != null) {
            rhz0Var.d(false);
        }
        if (this.r > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.r;
            if (currentTimeMillis > 0) {
                long j = this.q;
                if (currentTimeMillis < j) {
                    this.q = j - currentTimeMillis;
                }
            }
            this.q = 0L;
        }
        this.b.h(this.c);
    }

    @Override // xsna.jaz0
    public final void resume() {
        WebView webView;
        this.p = false;
        rhz0 rhz0Var = this.m;
        if (rhz0Var != null && (webView = rhz0Var.b) != null) {
            try {
                webView.onResume();
            } catch (Throwable th) {
                lyy0.c(th);
            }
        }
        if (this.q > 0) {
            this.b.c(this.c);
            this.r = System.currentTimeMillis();
            u7z0.a aVar = this.n;
            if (aVar != null) {
                aVar.a(false);
            }
        }
    }

    @Override // xsna.jaz0
    public final void stop() {
        this.p = true;
        rhz0 rhz0Var = this.m;
        if (rhz0Var != null) {
            rhz0Var.d(false);
        }
    }
}
