package xsna;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.common.MyTargetActivity;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import xsna.kq50;
import xsna.ocz0;
import xsna.wty0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class fkz0 implements xix, cjx {
    public final saz0 a = saz0.b(30);
    public final gjx b;
    public final ocz0 c;
    public final khz0 d;
    public final HashMap e;
    public final c f;
    public final j8z0 g;
    public final kly0 h;
    public final b i;
    public final kwy0 j;
    public final f5z0 k;
    public final qiy0 l;
    public final izy0 m;
    public weq n;
    public fjx o;
    public WeakReference p;
    public WeakReference q;
    public WeakReference r;
    public boolean s;
    public boolean t;
    public sm9 u;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a extends b920 {
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            fkz0 fkz0Var = fkz0.this;
            fjx fjxVar = fkz0Var.o;
            if (fjxVar == null) {
                return;
            }
            float progress = fjxVar.getProgress();
            float duration = fjxVar.getDuration();
            kwy0 kwy0Var = fkz0Var.j;
            if (kwy0Var != null) {
                kwy0Var.b(progress, duration);
            }
            f5z0 f5z0Var = fkz0Var.k;
            if (f5z0Var != null) {
                f5z0Var.d(fjxVar.a());
                f5z0Var.c(progress, duration);
            }
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class c {
        public final gjx a;
        public final HashMap b;
        public final saz0 c = saz0.f;
        public final or4 d = new or4(this, 21);
        public boolean e = false;
        public final HashMap f = new HashMap();

        public c(HashMap hashMap, gjx gjxVar) {
            this.b = hashMap;
            this.a = gjxVar;
        }

        public final void a() {
            if (this.e) {
                return;
            }
            gu8.c("ViewSizeTracker", "Start tracking of view sizes " + this.a.getId());
            this.e = true;
            this.f.clear();
            this.c.c(this.d);
        }

        public final void b() {
            if (this.e) {
                this.e = false;
                this.f.clear();
                this.c.h(this.d);
                gu8.c("ViewSizeTracker", "Stop tracking of view sizes " + this.a.getId());
            }
        }
    }

    public fkz0(gjx gjxVar) {
        mrc0 mrc0Var;
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        this.p = new WeakReference(null);
        this.q = new WeakReference(null);
        this.r = new WeakReference(null);
        this.s = false;
        this.t = false;
        this.u = null;
        this.b = gjxVar;
        ocz0 ocz0Var = ((p5z0) gjxVar).a;
        this.c = ocz0Var;
        this.f = new c(hashMap, gjxVar);
        ArrayList arrayList = ocz0Var.a0;
        e5z0 e5z0Var = ocz0Var.a;
        if (arrayList != null) {
            qiy0 qiy0Var = new qiy0();
            this.l = qiy0Var;
            mrc0Var = new mrc0(qiy0Var, 15);
        } else {
            this.l = null;
            mrc0Var = null;
        }
        qnk qnkVar = ocz0Var.U.a;
        this.d = new khz0(qnkVar, this.n, new zfz0(qnkVar));
        j8z0 j8z0Var = new j8z0(ocz0Var.b, e5z0Var, mrc0Var, ocz0Var.c0);
        this.g = j8z0Var;
        this.h = kly0.g(e5z0Var.c(1), e5z0Var.c(2), ocz0Var.c0, mrc0Var);
        this.i = new b();
        j8z0Var.j = new ekz0(this);
        ocz0.c cVar = ocz0Var.W;
        this.m = cVar != null ? izy0.b(cVar.b, cVar.a, null) : null;
        ocz0.d dVar = ocz0Var.X;
        if (dVar != null) {
            e5z0 e5z0Var2 = dVar.a;
            float f = dVar.D;
            kwy0 kwy0Var = new kwy0(null, null, null, null, new wiy0(new Handler(Looper.getMainLooper())));
            kwy0Var.e = e5z0Var2;
            kwy0Var.d = e5z0Var2 != null ? e5z0Var2.m() : null;
            kwy0Var.k = f;
            this.j = kwy0Var;
            this.k = f5z0.a(e5z0Var2, new hkc0(this, 14));
            return;
        }
        if (gjxVar.getContentType() != 4) {
            this.j = null;
            this.k = null;
            return;
        }
        kwy0 kwy0Var2 = new kwy0(null, null, null, null, new wiy0(new Handler(Looper.getMainLooper())));
        kwy0Var2.e = e5z0Var;
        kwy0Var2.d = e5z0Var.m();
        kwy0Var2.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = kwy0Var2;
        this.k = f5z0.a(e5z0Var, new hkc0(this, 14));
    }

    public static fiz0 u(int i) {
        dhz0 ejz0Var;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
                ejz0Var = new ejz0(i);
                break;
            case 12:
            default:
                gu8.c("IntrNativeAdCtrlImpl", "Unknown click target: " + i);
                ejz0Var = new w9y0("Unknown ClickTarget: " + i);
                break;
        }
        fiz0 d = wn4.d(ejz0Var);
        if (d != null) {
            d.f = true;
        }
        return d;
    }

    @Override // xsna.xix
    public final void a() {
        this.a.h(this.i);
    }

    @Override // xsna.xix
    public final void b(ajx ajxVar) {
        if (ajxVar instanceof ufy0) {
            Iterator it = this.e.keySet().iterator();
            Context context = null;
            while (it.hasNext()) {
                ViewGroup viewGroup = (ViewGroup) ((WeakReference) it.next()).get();
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
            }
            if (context == null) {
                return;
            }
            ufy0 ufy0Var = (ufy0) ajxVar;
            wty0.a aVar = ufy0Var.a;
            String str = aVar.a;
            if (!TextUtils.isEmpty(str)) {
                h8z0.b(str);
            }
            if ("copy".equals(ufy0Var.getType())) {
                String str2 = aVar.c;
                if (str2 != null) {
                    ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied id", str2));
                    return;
                }
                return;
            }
            String str3 = aVar.b;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            de.L(str3, null, null, null, context);
        }
    }

    @Override // xsna.xix
    public final void c(wix wixVar) {
        qiy0 qiy0Var = this.l;
        if (qiy0Var != null && (wixVar instanceof sez0)) {
            qiy0Var.b.remove(((sez0) wixVar).a);
        }
    }

    @Override // xsna.xix
    public final void d(String str) {
        wga0.b("Handling a custom stat: ", str, "IntrNativeAdCtrlImpl");
        h8z0.g(this.c.a.j(str), 999, null);
    }

    @Override // xsna.xix
    public final void e(boolean z) {
        kwy0 kwy0Var = this.j;
        if (kwy0Var != null) {
            kwy0Var.d(z);
        }
    }

    @Override // xsna.xix
    public final void f(vix vixVar) {
        gu8.c("IntrNativeAdCtrlImpl", "Unregister ViewHolder");
        sm9 sm9Var = this.u;
        if (sm9Var != null) {
            o8z0.g.removeCallbacks(sm9Var);
            this.u = null;
        }
        y(vixVar.a());
        if (this.e.isEmpty()) {
            this.f.b();
        }
    }

    @Override // xsna.xix
    public final void g() {
        kwy0 kwy0Var = this.j;
        if (kwy0Var != null) {
            kwy0Var.i();
        }
    }

    @Override // xsna.xix
    public final void h(cgx cgxVar, wix wixVar) {
        qiy0 qiy0Var = this.l;
        if (qiy0Var != null && (wixVar instanceof sez0)) {
            ocz0.a aVar = ((sez0) wixVar).a;
            ViewGroup c2 = cgxVar.c();
            HashMap hashMap = qiy0Var.b;
            if (!hashMap.containsKey(aVar)) {
                hashMap.put(aVar, new WeakReference(c2));
            }
            if (qiy0Var.a) {
                qiy0Var.a(aVar);
            }
        }
    }

    @Override // xsna.xix
    public final void i(View view, wix wixVar, String str) {
        gu8.c("IntrNativeAdCtrlImpl", "Click on card received");
        if (wixVar instanceof sez0) {
            w(((sez0) wixVar).a, view, str);
        } else {
            gu8.c("IntrNativeAdCtrlImpl", "Click on card failed, unknown instance of cardData");
        }
    }

    @Override // xsna.xix
    public final void j(View view, wix wixVar, int i) {
        gu8.c("IntrNativeAdCtrlImpl", "Click on card received");
        if (wixVar instanceof sez0) {
            v(((sez0) wixVar).a, view, i);
        } else {
            gu8.c("IntrNativeAdCtrlImpl", "Click on card failed, unknown instance of cardData");
        }
    }

    @Override // xsna.xix
    public final void k() {
        kwy0 kwy0Var = this.j;
        if (kwy0Var != null) {
            kwy0Var.n();
        }
    }

    @Override // xsna.xix
    public final void l() {
        kwy0 kwy0Var = this.j;
        if (kwy0Var != null) {
            kwy0Var.k();
        }
    }

    @Override // xsna.xix
    public final void m(weq weqVar) {
        this.n = weqVar;
        this.d.c = weqVar;
    }

    @Override // xsna.xix
    public final void n(int i) {
        kwy0 kwy0Var = this.j;
        if (kwy0Var == null) {
            return;
        }
        if (i == 1) {
            kwy0Var.m();
        } else {
            kwy0Var.l();
        }
    }

    @Override // xsna.xix
    public final void o(boolean z) {
        kwy0 kwy0Var = this.j;
        if (kwy0Var != null) {
            kwy0Var.f(z);
        }
    }

    @Override // xsna.xix
    public final void p(View view, String str) {
        wga0.b("Handling a click target: ", str, "IntrNativeAdCtrlImpl");
        w(this.c, view, str);
    }

    @Override // xsna.cjx
    public final void q(vix vixVar) {
        ViewGroup a2 = vixVar.a();
        WeakReference t = t(a2);
        HashMap hashMap = this.e;
        if (hashMap.containsKey(t)) {
            gu8.c("IntrNativeAdCtrlImpl", "Second register for view in use");
            return;
        }
        zgx b2 = vixVar.b();
        this.r = new WeakReference(b2 == null ? null : new FrameLayout(((kq50.b.a) b2).a.getContext()));
        WeakReference weakReference = new WeakReference(a2);
        hashMap.put(weakReference, vixVar);
        if (this.p.get() == null) {
            this.p = weakReference;
        }
        if (this.q.get() == null) {
            this.q = weakReference;
        }
        if (this.s) {
            this.g.a.add(new WeakReference(a2));
            gu8.c("IntrNativeAdCtrlImpl", "Register ViewHolder: Added to the views");
        } else if (this.p.get() == null || this.q.get() == null) {
            for (WeakReference weakReference2 : hashMap.keySet()) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((ViewGroup) weakReference2.get()).getHeight();
                }
            }
            gu8.c("IntrNativeAdCtrlImpl", "ViewHolder is registered but nothing happen");
            c cVar = this.f;
            if (!cVar.e) {
                cVar.a();
            }
        } else {
            sm9 sm9Var = new sm9(this, 17);
            this.u = sm9Var;
            o8z0.g.postDelayed(sm9Var, 50L);
            gu8.c("IntrNativeAdCtrlImpl", "Register ViewHolder is fully bound: Started tracking");
        }
        this.h.b(a2, null);
    }

    @Override // xsna.xix
    public final void r(int i, View view) {
        gu8.c("IntrNativeAdCtrlImpl", "Handling a click target: " + i);
        v(this.c, view, i);
    }

    @Override // xsna.xix
    public final void s(fjx fjxVar) {
        kwy0 kwy0Var = this.j;
        if (kwy0Var != null && fjxVar.a() != null) {
            kwy0Var.g = fjxVar.a().getContext();
        }
        this.o = fjxVar;
        this.a.c(this.i);
    }

    public final WeakReference t(ViewGroup viewGroup) {
        for (WeakReference weakReference : this.e.keySet()) {
            if (viewGroup == weakReference.get()) {
                return weakReference;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void v(xey0 xey0Var, View view, int i) {
        int i2;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
                i2 = 1;
                break;
            case 6:
                i2 = 2;
                break;
            case 12:
            default:
                gu8.c("IntrNativeAdCtrlImpl", "Unknown click target: " + i);
                i2 = 1;
                break;
        }
        Context context = view.getContext();
        fiz0 u = u(i);
        if ((xey0Var instanceof ocz0.a) && xey0Var.J != null && context != null) {
            ocz0 ocz0Var = this.c;
            if (!ocz0Var.S.a) {
                HashMap hashMap = new HashMap();
                if (u != null && u.b()) {
                    hashMap.put("click_target", String.valueOf(u.b));
                }
                h8z0.f(ocz0Var.a, i2 == 2 ? "ctaClick" : "click", hashMap, 2);
            }
        }
        if ((xey0Var instanceof ocz0) && x((ocz0) xey0Var, i2, context)) {
            return;
        }
        if (xey0Var.S.b) {
            this.d.b(xey0Var, u, new xyf(this, view), context);
        } else {
            this.d.a(xey0Var, new mn6(this, view), i2, u, context);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void w(xey0 xey0Var, View view, String str) {
        int i;
        fiz0 u;
        str.getClass();
        switch (str) {
            case "DEFAULT":
            case "RATING":
            case "BACKGROUND":
            case "AGE_RESTRICTIONS":
            case "ICON":
            case "IMAGE":
            case "TITLE":
            case "VIDEO":
            case "VOTES":
            case "APP_CATEGORY":
            case "DESCRIPTION":
            case "ADVERTISING_LABEL":
            case "DOMAIN":
                i = 1;
                break;
            case "CTA":
                i = 2;
                break;
            default:
                gu8.c("IntrNativeAdCtrlImpl", "Unknown click target: ".concat(str));
                return;
        }
        Context context = view.getContext();
        switch (str) {
            case "RATING":
                u = u(4);
                break;
            case "BACKGROUND":
                u = u(11);
                break;
            case "AGE_RESTRICTIONS":
                u = u(7);
                break;
            case "CTA":
                u = u(6);
                break;
            case "ICON":
                u = u(2);
                break;
            case "IMAGE":
                u = u(3);
                break;
            case "TITLE":
                u = u(0);
                break;
            case "VIDEO":
                u = u(13);
                break;
            case "VOTES":
                u = u(5);
                break;
            case "APP_CATEGORY":
                u = u(10);
                break;
            case "DESCRIPTION":
                u = u(1);
                break;
            case "ADVERTISING_LABEL":
                u = u(8);
                break;
            case "DOMAIN":
                u = u(9);
                break;
            default:
                gu8.c("IntrNativeAdCtrlImpl", "Unknown click target: ".concat(str));
                u = wn4.d(new w9y0("Unknown ClickTarget: ".concat(str)));
                break;
        }
        fiz0 fiz0Var = u;
        if ((xey0Var instanceof ocz0.a) && xey0Var.J != null && context != null) {
            ocz0 ocz0Var = this.c;
            if (!ocz0Var.S.a) {
                HashMap hashMap = new HashMap();
                if (fiz0Var != null && fiz0Var.b()) {
                    hashMap.put("click_target", String.valueOf(fiz0Var.b));
                }
                h8z0.f(ocz0Var.a, i == 2 ? "ctaClick" : "click", hashMap, 2);
            }
        }
        if ((xey0Var instanceof ocz0) && x((ocz0) xey0Var, i, context)) {
            return;
        }
        if (xey0Var.S.b) {
            this.d.b(xey0Var, fiz0Var, new xyf(this, view), context);
        } else {
            this.d.a(xey0Var, new mn6(this, view), i, fiz0Var, context);
        }
    }

    public final boolean x(ocz0 ocz0Var, int i, Context context) {
        if (!"playableAds".equals(ocz0Var.E) || 2 != i) {
            return false;
        }
        if (ocz0Var.W == null && ocz0Var.Z == null) {
            ocz0Var.T.c(999, IronSourceConstants.errorCode_biddingDataException, "Playable ad has neither HTML nor PostView");
            return false;
        }
        MyTargetActivity.f = new jpy0(ocz0Var, this, new a());
        Intent intent = new Intent(context, (Class<?>) MyTargetActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
        return true;
    }

    public final void y(ViewGroup viewGroup) {
        WeakReference weakReference;
        boolean z;
        WeakReference t = t(viewGroup);
        if (t != null) {
            gu8.c("IntrNativeAdCtrlImpl", "Release ViewHolder");
            this.e.remove(t);
            WeakReference weakReference2 = this.p;
            if (weakReference2 == t) {
                weakReference2.clear();
            }
            WeakReference weakReference3 = this.q;
            if (weakReference3 == t) {
                weakReference3.clear();
            }
            j8z0 j8z0Var = this.g;
            ArrayList arrayList = j8z0Var.a;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    weakReference = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                weakReference = (WeakReference) obj;
                if (weakReference.get() == viewGroup) {
                    break;
                }
            }
            if (weakReference != null) {
                arrayList.remove(weakReference);
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                }
                Object obj2 = arrayList.get(i2);
                i2++;
                if (((WeakReference) obj2).get() != null) {
                    z = true;
                    break;
                }
            }
            if (j8z0Var.i && !z) {
                j8z0Var.i = false;
                ekz0 ekz0Var = j8z0Var.j;
                if (ekz0Var != null) {
                    ekz0Var.b(false);
                }
            }
        }
        this.h.e();
    }
}
