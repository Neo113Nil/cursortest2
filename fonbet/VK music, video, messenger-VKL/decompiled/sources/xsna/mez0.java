package xsna;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.my.target.common.MyTargetActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import xsna.u3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class mez0 {
    public static final WeakHashMap e = new WeakHashMap();
    public static final u3z0 f = new u3z0();
    public static idy0 g;
    public static qjz0 h;
    public final qnk b;
    public final int c;
    public long d = 0;
    public final giz0 a = ehz0.c(g);

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static abstract class a {
        public final xey0 a;

        public a(xey0 xey0Var) {
            this.a = xey0Var;
        }

        public static b a(xey0 xey0Var, String str, String str2, HashMap hashMap, int i) {
            return new b(xey0Var, str, str2, hashMap, i);
        }

        public static e b(String str, xey0 xey0Var, qnk qnkVar) {
            return new e(str, xey0Var, qnkVar);
        }

        public static f c(giz0 giz0Var, String str, xey0 xey0Var) {
            return s770.j(str) ? new d(giz0Var, str, xey0Var) : new f(giz0Var, str, xey0Var);
        }

        public abstract boolean d(Context context);
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static final class b extends a {
        public final String b;
        public final String c;
        public final HashMap d;
        public final int e;

        public b(xey0 xey0Var, String str, String str2, HashMap hashMap, int i) {
            super(xey0Var);
            this.b = str;
            this.c = str2;
            this.d = hashMap;
            this.e = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        
            if ((r4 == null ? false : xsna.de.L(null, null, r4, null, r13)) == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x002d, code lost:
        
            if (r4 == null) goto L38;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.mez0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean d(Context context) {
            String str;
            Intent launchIntentForPackage;
            xey0 xey0Var = this.a;
            String str2 = xey0Var.p;
            e5z0 e5z0Var = xey0Var.a;
            if (X3.i.U.equals(str2)) {
                giz0 giz0Var = null;
                Object[] objArr = 0;
                if (Build.VERSION.SDK_INT < 30 || xey0Var.y) {
                    str = xey0Var.H;
                    if (str != null) {
                        launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
                    }
                } else {
                    str = null;
                    launchIntentForPackage = null;
                }
                String str3 = xey0Var.I;
                WeakHashMap weakHashMap = mez0.e;
                if (str3 == null ? false : str == null ? de.K(str3, context) : de.I(context, str3, str)) {
                    h8z0.e(e5z0Var, "deeplinkClick", 2, null);
                    return true;
                }
                String str4 = xey0Var.G;
                if (!(str4 == null ? false : str == null ? de.K(str4, context) : de.I(context, str4, str))) {
                }
                h8z0.f(e5z0Var, this.c, this.d, 2);
                String str5 = this.b;
                if (str5 != null && !s770.j(str5)) {
                    o8z0.c(new kez0(giz0Var, str5, this.e, xey0Var.T, objArr == true ? 1 : 0));
                }
                return true;
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public interface c {
        void c();
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static final class d extends f {
        @Override // xsna.mez0.f, xsna.mez0.a
        public final boolean d(Context context) {
            if (!de.L(this.b, null, null, null, context)) {
                return super.d(context);
            }
            this.c.a();
            return true;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static class e extends a {
        public final String b;
        public final qnk c;

        public e(String str, xey0 xey0Var, qnk qnkVar) {
            super(xey0Var);
            this.b = str;
            this.c = qnkVar;
        }

        @Override // xsna.mez0.a
        public final boolean d(Context context) {
            mfz0.a(this.b, this.c, context);
            return true;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static class f extends a {
        public final String b;
        public final giz0 c;

        public f(giz0 giz0Var, String str, xey0 xey0Var) {
            super(xey0Var);
            this.c = giz0Var;
            this.b = str;
        }

        @Override // xsna.mez0.a
        public boolean d(Context context) {
            boolean equals = context.getPackageName().equals("ru.mail.browser");
            String str = this.b;
            boolean L = !equals ? false : de.L(str, "ru.mail.browser", null, q9k.a("com.android.browser.application_id", "ru.mail.browser"), context);
            giz0 giz0Var = this.c;
            if (L) {
                giz0Var.a();
                return true;
            }
            if (!this.a.w) {
                o8z0.d(new vrl(9, this, context));
                return true;
            }
            giz0Var.a();
            WeakHashMap weakHashMap = mez0.e;
            return de.L(str, null, null, null, context);
        }
    }

    public mez0(qnk qnkVar, Integer num) {
        this.b = qnkVar;
        this.c = num == null ? 10 : num.intValue();
    }

    public static mez0 a(qnk qnkVar) {
        return new mez0(qnkVar, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r0.equals("webform") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str, xey0 xey0Var, fiz0 fiz0Var, Context context) {
        a c2;
        char c3 = 2;
        h8z0.e(xey0Var.d(), "urlResolved", 2, null);
        gu8.c(null, "WebViewReachability: url resolved");
        String a2 = xey0Var.a();
        a2.getClass();
        switch (a2.hashCode()) {
            case 117588:
                if (a2.equals("web")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 109770977:
                if (a2.equals(X3.i.U)) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 1223953944:
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
            case 1:
                c2 = a.c(this.a, str, xey0Var);
                break;
            case 2:
                c2 = a.b(str, xey0Var, this.b);
                break;
            default:
                return;
        }
        boolean d2 = c2.d(context);
        this.d = SystemClock.elapsedRealtime();
        if (d2) {
            xey0Var.j().f(7002, fiz0.a(fiz0Var));
        } else {
            xey0Var.j().f(7001, fiz0.a(fiz0Var));
        }
    }

    public final void c(xey0 xey0Var, int i, fiz0 fiz0Var, Context context) {
        String e2;
        xey0Var.j().f(7000, fiz0.a(fiz0Var));
        if (g()) {
            xey0Var.j().g(2, 7005, "too-many-clicks");
            return;
        }
        if (i == 2) {
            e2 = xey0Var.l();
            if (e2 == null) {
                e2 = xey0Var.e();
                i = 1;
            }
        } else {
            e2 = xey0Var.e();
        }
        d(xey0Var, e2, i, null, fiz0Var, context);
    }

    public final void d(final xey0 xey0Var, String str, int i, c cVar, final fiz0 fiz0Var, final Context context) {
        WeakHashMap weakHashMap = e;
        if (weakHashMap.containsKey(xey0Var)) {
            xey0Var.j().g(2, 7005, "nested-call");
            return;
        }
        String str2 = "click";
        if (i == 2 && xey0Var.l() != null && (str == null || !str.equals(xey0Var.e()))) {
            str2 = "ctaClick";
        }
        HashMap hashMap = new HashMap();
        if (fiz0Var != null && fiz0Var.b()) {
            hashMap.put("click_target", String.valueOf(fiz0Var.c()));
        }
        if (str != null && (str.equals(xey0Var.e()) || str.equals(xey0Var.l()))) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (Map.Entry entry : hashMap.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            str = buildUpon.build().toString();
        }
        final String str3 = str;
        int i2 = this.c;
        if (a.a(xey0Var, str3, str2, hashMap, i2).d(context)) {
            this.d = SystemClock.elapsedRealtime();
            xey0Var.j().f(7002, fiz0.a(fiz0Var));
            return;
        }
        h8z0.f(xey0Var.d(), str2, hashMap, 2);
        gu8.c(null, "WebViewReachability: banner clicked");
        if (cVar != null) {
            cVar.c();
        }
        if (str3 == null) {
            return;
        }
        boolean h2 = xey0Var.h();
        giz0 giz0Var = this.a;
        if (h2 || s770.j(str3)) {
            if (g != null) {
                giz0Var.b();
            }
            o8z0.d(new Runnable() { // from class: xsna.jez0
                @Override // java.lang.Runnable
                public final void run() {
                    mez0.this.b(str3, xey0Var, fiz0Var, context);
                }
            });
        } else {
            weakHashMap.put(xey0Var, Boolean.TRUE);
            o8z0.c(new kez0(giz0Var, str3, i2, xey0Var.j(), new t8z0() { // from class: xsna.iez0
                @Override // xsna.t8z0
                public final void accept(Object obj) {
                    String str4;
                    u3z0.a aVar = (u3z0.a) obj;
                    if (aVar == null || !aVar.a() || (str4 = aVar.b) == null) {
                        str4 = null;
                    }
                    xey0 xey0Var2 = xey0Var;
                    if (str4 != null) {
                        mez0.this.b(str4, xey0Var2, fiz0Var, context);
                    }
                    mez0.e.remove(xey0Var2);
                }
            }));
        }
    }

    public final void e(xey0 xey0Var, String str, int i, fiz0 fiz0Var, c cVar, Context context) {
        xey0Var.j().f(7000, fiz0.a(fiz0Var));
        if (g()) {
            xey0Var.j().g(2, 7005, "too-many-clicks");
        } else {
            d(xey0Var, str, i, cVar, fiz0Var, context);
        }
    }

    public final void f(final xey0 xey0Var, String str, String str2, final String str3, final Context context) {
        xey0Var.j().e(2, 7000, "available-link");
        if (g()) {
            xey0Var.j().g(2, 7005, "too-many-clicks");
            return;
        }
        String k = xey0Var.k();
        if (str == null ? false : k == null ? de.K(str, context) : de.I(context, str, k)) {
            this.d = SystemClock.elapsedRealtime();
            xey0Var.j().d(2, 7002);
        } else if (!TextUtils.isEmpty(str2) && de.K(str2, context)) {
            this.d = SystemClock.elapsedRealtime();
            xey0Var.j().d(2, 7002);
        } else if (TextUtils.isEmpty(str3)) {
            xey0Var.j().c(2, 7001, "url is empty");
        } else {
            this.a.b();
            o8z0.d(new Runnable() { // from class: xsna.lez0
                @Override // java.lang.Runnable
                public final void run() {
                    mez0.this.b(str3, xey0Var, null, context);
                }
            });
        }
    }

    public final boolean g() {
        return SystemClock.elapsedRealtime() - this.d < 800;
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static final class g implements MyTargetActivity.a {
        public final String a;
        public tiz0 b;

        public g(String str) {
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
                gu8.e(null, "ClickHandler: Error - " + th.getMessage());
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
