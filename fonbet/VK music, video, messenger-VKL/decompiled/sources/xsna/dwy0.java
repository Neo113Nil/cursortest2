package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.my.target.nativeads.views.IconAdView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import xsna.fly0;
import xsna.ov50;
import xsna.s3z0;
import xsna.ubz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class dwy0 extends fly0 implements qay0, ov50.a {
    public final ov50 j;
    public nv50 k;
    public WeakReference l;
    public WeakReference m;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a {
        public final xgy0 a;

        public a(xgy0 xgy0Var) {
            this.a = xgy0Var;
        }

        public final void a(iaz0 iaz0Var, q120 q120Var) {
            dwy0 dwy0Var = dwy0.this;
            if (dwy0Var.d != q120Var) {
                return;
            }
            StringBuilder sb = new StringBuilder("MediationNativeBannerAdEngine: No data from ");
            xgy0 xgy0Var = this.a;
            sb.append(xgy0Var.a);
            sb.append(" ad network - ");
            sb.append(iaz0Var);
            gu8.c(null, sb.toString());
            dwy0Var.t(xgy0Var, false);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class b extends fly0.a {
        public final int g;

        public b(String str, String str2, HashMap hashMap, int i, int i2, int i3, pg0 pg0Var) {
            super(str, str2, hashMap, i, i2, pg0Var);
            this.g = i3;
        }
    }

    public dwy0(ov50 ov50Var, wcy0 wcy0Var, u6z0 u6z0Var, s3z0.a aVar) {
        super(wcy0Var, u6z0Var, aVar);
        this.j = ov50Var;
    }

    @Override // xsna.qay0
    public final void a() {
        if (this.d == null) {
            gu8.e(null, "MediationNativeBannerAdEngine error: can't unregister view, adapter is not set");
            return;
        }
        WeakReference weakReference = this.m;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            this.m.clear();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        WeakReference weakReference2 = this.l;
        IconAdView iconAdView = weakReference2 != null ? (IconAdView) weakReference2.get() : null;
        if (iconAdView != null) {
            this.l.clear();
            nv50 nv50Var = this.k;
            kiw kiwVar = nv50Var != null ? nv50Var.q : null;
            whz0 whz0Var = (whz0) iconAdView.getImageView();
            if (kiwVar != null) {
                o2z0.d(kiwVar, whz0Var);
            }
            whz0Var.setImageData(null);
        }
        this.m = null;
        this.l = null;
        try {
            ((q120) this.d).a();
        } catch (Throwable th) {
            gu8.e(null, "MediationNativeBannerAdEngine error: " + th);
        }
    }

    @Override // xsna.qay0
    public final nv50 b() {
        return this.k;
    }

    @Override // xsna.qay0
    public final void c(View view) {
        n120 n120Var = this.d;
        if (n120Var instanceof cjc) {
            ((cjc) n120Var).c(view);
        }
    }

    @Override // xsna.qay0
    public final void d(View view, List list, int i) {
        int i2;
        if (view == null) {
            gu8.e(null, "MediationNativeBannerAdEngine error: wrong args for using viewGroup like adView");
            return;
        }
        if (this.d == null) {
            gu8.e(null, "MediationNativeBannerAdEngine error: Can't register view, adapter is not set");
            return;
        }
        if (this.k == null) {
            gu8.e(null, "MediationNativeBannerAdEngine error: Can't register view, banner is null or not loaded yet");
            return;
        }
        a();
        List<View> arrayList = list != null ? new ArrayList<>(list) : Collections.EMPTY_LIST;
        if (!(this.d instanceof is50) && (view instanceof ViewGroup)) {
            ubz0.a aVar = new ubz0.a();
            aVar.d = 1;
            aVar.a = (ViewGroup) view;
            ubz0 b2 = aVar.b();
            IconAdView d = b2.d();
            if (d == null) {
                gu8.e(null, "MediationNativeBannerAdEngine: IconView component not found in " + view + ". It's required");
                return;
            }
            whz0 whz0Var = d.b;
            this.l = new WeakReference(d);
            try {
                ViewGroup g = b2.g();
                if ((g != null ? g.getContext() : null) != null) {
                    ((q120) this.d).getClass();
                }
            } catch (Throwable th) {
                gu8.e(null, "MediationNativeBannerAdEngine: Error - " + th);
            }
            kiw kiwVar = this.k.q;
            if (kiwVar == null) {
                d.c = 0;
                d.d = 0;
                whz0Var.e = 0;
                whz0Var.d = 0;
            } else {
                int i3 = kiwVar.b;
                if (i3 <= 0 || (i2 = kiwVar.c) <= 0) {
                    d.c = 1;
                    d.d = 1;
                    whz0Var.e = 1;
                    whz0Var.d = 1;
                } else {
                    d.c = i3;
                    d.d = i2;
                    whz0Var.e = i3;
                    whz0Var.d = i2;
                }
            }
            whz0 whz0Var2 = (whz0) d.getImageView();
            whz0Var2.setImageData(kiwVar);
            if (kiwVar != null && kiwVar.a() == null) {
                o2z0.e(kiwVar, whz0Var2, null);
            }
        }
        try {
            ((q120) this.d).d(view, arrayList, i);
        } catch (Throwable th2) {
            gu8.e(null, "MediationNativeBannerAdEngine: Error - " + th2);
        }
    }

    @Override // xsna.ov50.a
    public final boolean e() {
        ov50.a aVar = this.j.j;
        if (aVar == null) {
            return true;
        }
        return aVar.e();
    }

    @Override // xsna.ov50.a
    public final void n(ov50 ov50Var) {
        ov50 ov50Var2 = this.j;
        ov50.a aVar = ov50Var2.j;
        if (aVar == null) {
            return;
        }
        aVar.n(ov50Var2);
    }

    @Override // xsna.ov50.a
    public final void q(ov50 ov50Var) {
        ov50 ov50Var2 = this.j;
        ov50.a aVar = ov50Var2.j;
        if (aVar == null) {
            return;
        }
        aVar.q(ov50Var2);
    }

    @Override // xsna.fly0
    public final void s(n120 n120Var, xgy0 xgy0Var, Context context) {
        q120 q120Var = (q120) n120Var;
        String str = xgy0Var.b;
        String str2 = xgy0Var.f;
        HashMap a2 = xgy0Var.a();
        u6z0 u6z0Var = this.a;
        b bVar = new b(str, str2, a2, u6z0Var.a.d(), u6z0Var.a.e(), u6z0Var.f, TextUtils.isEmpty(this.h) ? null : u6z0Var.a(this.h));
        if (q120Var instanceof is50) {
            njz0 njz0Var = xgy0Var.g;
            if (njz0Var instanceof rjz0) {
                ((is50) q120Var).a = (rjz0) njz0Var;
            }
        }
        try {
            q120Var.j(bVar, new a(xgy0Var), context);
        } catch (Throwable th) {
            gu8.e(null, "MediationNativeBannerAdEngine error: " + th);
        }
    }

    @Override // xsna.fly0
    public final boolean u(n120 n120Var) {
        return n120Var instanceof q120;
    }

    @Override // xsna.fly0
    public final void w() {
        ov50.b bVar = this.j.h;
        if (bVar != null) {
            bVar.c(iaz0.v);
        }
    }

    @Override // xsna.fly0
    public final n120 x() {
        return new is50();
    }

    @Override // xsna.qay0
    public final void b(Context context) {
        n120 n120Var = this.d;
        if (n120Var instanceof ee0) {
            ((ee0) n120Var).b(context);
        }
    }
}
