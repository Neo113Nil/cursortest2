package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.fly0;
import xsna.s3z0;
import xsna.ubz0;
import xsna.vtl0;
import xsna.zu50;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class kuy0 extends fly0 implements ckz0, zu50.b {
    public final zu50 j;
    public final i620 k;
    public cw50 l;
    public WeakReference m;
    public WeakReference n;
    public WeakReference o;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a {
        public final xgy0 a;

        public a(xgy0 xgy0Var) {
            this.a = xgy0Var;
        }

        public final void a(iaz0 iaz0Var, p120 p120Var) {
            kuy0 kuy0Var = kuy0.this;
            if (kuy0Var.d != p120Var) {
                return;
            }
            StringBuilder sb = new StringBuilder("MediationNativeAdEngine: No data from ");
            xgy0 xgy0Var = this.a;
            sb.append(xgy0Var.a);
            sb.append(" ad network - ");
            sb.append(iaz0Var);
            gu8.c(null, sb.toString());
            kuy0Var.t(xgy0Var, false);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class b extends fly0.a {
        public final int g;
        public final i620 h;

        public b(String str, String str2, HashMap hashMap, int i, int i2, int i3, pg0 pg0Var, i620 i620Var) {
            super(str, str2, hashMap, i, i2, pg0Var);
            this.g = i3;
            this.h = i620Var;
        }
    }

    public kuy0(zu50 zu50Var, wcy0 wcy0Var, u6z0 u6z0Var, s3z0.a aVar, i620 i620Var) {
        super(wcy0Var, u6z0Var, aVar);
        this.j = zu50Var;
        this.k = i620Var;
    }

    @Override // xsna.ckz0
    public final void a() {
        if (this.d == null) {
            gu8.e(null, "MediationNativeAdEngine error: can't unregister view, adapter is not set");
            return;
        }
        WeakReference weakReference = this.n;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            this.n.clear();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        WeakReference weakReference2 = this.m;
        MediaAdView mediaAdView = weakReference2 != null ? (MediaAdView) weakReference2.get() : null;
        if (mediaAdView != null) {
            this.m.clear();
            cw50 cw50Var = this.l;
            kiw kiwVar = cw50Var != null ? cw50Var.v : null;
            whz0 whz0Var = (whz0) mediaAdView.getImageView();
            if (kiwVar != null) {
                o2z0.d(kiwVar, whz0Var);
            }
            whz0Var.setImageData(null);
            mediaAdView.b(0, 0);
        }
        WeakReference weakReference3 = this.o;
        IconAdView iconAdView = weakReference3 != null ? (IconAdView) weakReference3.get() : null;
        if (iconAdView != null) {
            this.o.clear();
            cw50 cw50Var2 = this.l;
            kiw kiwVar2 = cw50Var2 != null ? cw50Var2.q : null;
            whz0 whz0Var2 = (whz0) iconAdView.getImageView();
            if (kiwVar2 != null) {
                o2z0.d(kiwVar2, whz0Var2);
            }
            whz0Var2.setImageData(null);
        }
        this.n = null;
        this.m = null;
        try {
            ((p120) this.d).a();
        } catch (Throwable th) {
            gu8.e(null, "MediationNativeAdEngine error: " + th);
        }
    }

    @Override // xsna.ckz0
    public final void b(Context context) {
        n120 n120Var = this.d;
        if (n120Var instanceof ee0) {
            ((ee0) n120Var).b(context);
        }
    }

    @Override // xsna.ckz0
    public final void c(View view) {
        n120 n120Var = this.d;
        if (n120Var instanceof cjc) {
            ((cjc) n120Var).c(view);
        }
    }

    @Override // xsna.zu50.b
    public final boolean e() {
        zu50.b bVar = this.j.l;
        if (bVar == null) {
            return true;
        }
        return bVar.e();
    }

    @Override // xsna.ckz0
    public final void f() {
    }

    @Override // xsna.zu50.b
    public final void g(zu50 zu50Var) {
        zu50 zu50Var2 = this.j;
        zu50.b bVar = zu50Var2.l;
        if (bVar == null) {
            return;
        }
        bVar.g(zu50Var2);
    }

    @Override // xsna.zu50.b
    public final void h(zu50 zu50Var) {
        zu50 zu50Var2 = this.j;
        zu50.b bVar = zu50Var2.l;
        if (bVar == null) {
            return;
        }
        bVar.h(zu50Var2);
    }

    @Override // xsna.ckz0
    public final void j(View view, List list, int i) {
        z(view, null, list, i, false);
    }

    @Override // xsna.ckz0
    public final void m(zu50.d dVar) {
        gu8.c(null, "MediationNativeAdEngine: NativeAdMediaListener is not currently supported for mediation");
    }

    @Override // xsna.ckz0
    public final void r(lv50 lv50Var, List list, int i) {
        z(null, lv50Var, list, i, true);
    }

    @Override // xsna.fly0
    public final void s(n120 n120Var, xgy0 xgy0Var, Context context) {
        p120 p120Var = (p120) n120Var;
        String str = xgy0Var.b;
        String str2 = xgy0Var.f;
        HashMap a2 = xgy0Var.a();
        u6z0 u6z0Var = this.a;
        b bVar = new b(str, str2, a2, u6z0Var.a.d(), u6z0Var.a.e(), u6z0Var.f, TextUtils.isEmpty(this.h) ? null : u6z0Var.a(this.h), this.k);
        if (p120Var instanceof as50) {
            njz0 njz0Var = xgy0Var.g;
            if (njz0Var instanceof rjz0) {
                ((as50) p120Var).a = (rjz0) njz0Var;
            }
        }
        try {
            p120Var.e(bVar, new a(xgy0Var), context);
        } catch (Throwable th) {
            gu8.e(null, "MediationNativeAdEngine error: " + th);
        }
    }

    @Override // xsna.fly0
    public final boolean u(n120 n120Var) {
        return n120Var instanceof p120;
    }

    @Override // xsna.fly0
    public final void w() {
        zu50 zu50Var = this.j;
        zu50.c cVar = zu50Var.i;
        if (cVar != null) {
            cVar.c(iaz0.v, zu50Var);
        }
    }

    @Override // xsna.fly0
    public final n120 x() {
        return new as50();
    }

    public final void z(View view, lv50 lv50Var, List list, int i, boolean z) {
        ArrayList arrayList;
        ubz0 b2;
        int i2;
        int i3;
        if (z && lv50Var == null) {
            gu8.e(null, "MediationNativeAdEngine error: wrong args for using nativeAdViewBinder");
            return;
        }
        if (!z && view == null) {
            gu8.e(null, "MediationNativeAdEngine error: wrong args for using viewGroup like adView");
            return;
        }
        if (this.d == null) {
            gu8.e(null, "MediationNativeAdEngine error: can't register view, adapter is not set");
            return;
        }
        if (this.l == null) {
            gu8.e(null, "MediationNativeAdEngine error: can't register view, banner is null or not loaded yet");
            return;
        }
        a();
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                if (view2 != null) {
                    arrayList.add(view2);
                }
            }
        } else {
            arrayList = null;
        }
        if (!(this.d instanceof as50) && (z || (view instanceof ViewGroup))) {
            if (z) {
                ubz0.a aVar = new ubz0.a();
                aVar.d = 2;
                aVar.b = lv50Var;
                b2 = aVar.b();
            } else {
                ubz0.a aVar2 = new ubz0.a();
                aVar2.d = 1;
                aVar2.a = (ViewGroup) view;
                b2 = aVar2.b();
            }
            MediaAdView e = b2.e();
            if (e != null) {
                this.m = new WeakReference(e);
                try {
                    ViewGroup g = b2.g();
                    if ((g != null ? g.getContext() : null) != null) {
                        ((p120) this.d).getClass();
                    }
                } catch (Throwable th) {
                    gu8.e(null, "MediationNativeAdEngine error: " + th);
                }
                cw50 cw50Var = this.l;
                kiw kiwVar = cw50Var.v;
                boolean a2 = cw50Var.a();
                if (kiwVar == null && !a2) {
                    e.b(0, 0);
                } else if (kiwVar == null || (i2 = kiwVar.b) <= 0 || (i3 = kiwVar.c) <= 0) {
                    e.b(16, 10);
                } else {
                    e.b(i2, i3);
                }
                whz0 whz0Var = (whz0) e.getImageView();
                whz0Var.setImageData(kiwVar);
                if (kiwVar != null && kiwVar.a() == null) {
                    o2z0.e(kiwVar, whz0Var, null);
                }
            }
            IconAdView d = b2.d();
            kiw kiwVar2 = this.l.q;
            if (d != null && kiwVar2 != null) {
                this.o = new WeakReference(d);
                whz0 whz0Var2 = (whz0) d.getImageView();
                whz0Var2.setImageData(kiwVar2);
                if (kiwVar2.a() == null) {
                    o2z0.e(kiwVar2, whz0Var2, null);
                }
            }
        }
        try {
            if (z) {
                ((p120) this.d).f(lv50Var, arrayList, i);
            } else {
                ((p120) this.d).d(view, arrayList, i);
            }
        } catch (Throwable th2) {
            gu8.e(null, "MediationNativeAdEngine error: " + th2);
        }
    }

    @Override // xsna.ckz0
    public final void f(aeq aeqVar) {
    }

    @Override // xsna.ckz0
    public final cw50 g() {
        return this.l;
    }

    @Override // xsna.ckz0
    public final void o() {
    }

    @Override // xsna.ckz0
    public final void p() {
    }

    @Override // xsna.ckz0
    public final void i(vtl0.b bVar) {
    }

    @Override // xsna.ckz0
    public final void k(vtl0.c cVar) {
    }

    @Override // xsna.ckz0
    public final void l(zu50.a aVar) {
    }

    @Override // xsna.ckz0
    public final void a(long j) {
    }
}
