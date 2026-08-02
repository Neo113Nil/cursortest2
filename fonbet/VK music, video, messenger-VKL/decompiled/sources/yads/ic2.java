package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import kotlin.NoWhenBranchMatchedException;
import xsna.go9;
import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class ic2 extends wo implements o11, wd2, qm3 {
    public static boolean k;
    public final xo3 b;
    public final Context c;
    public final rm3 d;
    public final xd2 e;
    public final a13 f;
    public q11 g;
    public p11 h;
    public boolean i;
    public boolean j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ic2(Context context, xo3 xo3Var, AttributeSet attributeSet, int i) {
        this(context, r2, attributeSet, r4, new rm3(), xd2.h.a(r4));
        xo3 xo3Var2 = (i & 2) != 0 ? new xo3() : xo3Var;
        attributeSet = (i & 4) != 0 ? null : attributeSet;
        Context applicationContext = context.getApplicationContext();
    }

    public final void a(Context context) {
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        int i = 1;
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setTextZoom(100);
        getSettings().setMinimumFontSize(1);
        getSettings().setMinimumLogicalFontSize(1);
        WebSettings settings = getSettings();
        gx2.a();
        synchronized (hx2.j) {
        }
        int ordinal = this.b.a.ordinal();
        if (ordinal == 0) {
            i = -1;
        } else if (ordinal != 1) {
            i = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 2;
            }
        }
        settings.setCacheMode(i);
        WebSettings settings2 = getSettings();
        if (ub.a(21)) {
            settings2.setMixedContentMode(2);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        setWebViewClient(new n11(this, dt2.b()));
        setWebChromeClient(new j11());
    }

    @Override // yads.wo
    public final String b() {
        return go9.b("<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n", wo3.a());
    }

    @Override // yads.wo
    public final void c() {
        setHtmlWebViewListener(null);
        super.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        q11 q11Var;
        if (motionEvent != null && motionEvent.getAction() == 0 && (q11Var = this.g) != null) {
            q11Var.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract void e();

    public final Context f() {
        return this.c;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = true;
        this.e.a(this);
        this.d.getClass();
        a(rm3.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.j = false;
        this.d.getClass();
        a(rm3.a(this));
        this.e.b(this);
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.d.getClass();
        a(rm3.a(this));
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.d.getClass();
        a(rm3.a(this));
    }

    public final void setHtmlWebViewErrorListener(p11 p11Var) {
        this.h = p11Var;
    }

    public void setHtmlWebViewListener(q11 q11Var) {
        this.g = q11Var;
    }

    public ic2(Context context, xo3 xo3Var, AttributeSet attributeSet, Context context2, rm3 rm3Var, xd2 xd2Var) {
        super(context2, attributeSet);
        this.b = xo3Var;
        this.c = context2;
        this.d = rm3Var;
        this.e = xd2Var;
        this.f = new a13();
        a(context);
        if (k) {
            return;
        }
        k = true;
    }

    public final void a(boolean z) {
        if (this.i != z) {
            this.i = z;
            q11 q11Var = this.g;
            if (q11Var != null) {
                q11Var.a(z);
            }
        }
    }

    public void a(Context context, String str) {
        q11 q11Var = this.g;
        if (q11Var != null) {
            q11Var.a(str);
        }
    }

    @Override // yads.o11
    public void a() {
        a13 a13Var = this.f;
        synchronized (a13Var.a) {
            if (a13Var.b) {
                return;
            }
            a13Var.b = true;
            s3q0 s3q0Var = s3q0.a;
            a(this);
        }
    }

    public static final void a(ic2 ic2Var) {
        ic2Var.e();
    }

    @Override // yads.wd2
    public final void a(sd2 sd2Var) {
        boolean z;
        if (sd2Var != sd2.c) {
            this.d.getClass();
            if (rm3.a(this) && this.e.a()) {
                z = true;
                a(z);
            }
        }
        z = false;
        a(z);
    }

    @Override // yads.o11
    public void a(int i) {
        p11 p11Var = this.h;
        if (p11Var != null) {
            p11Var.a(i);
        }
    }
}
