package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.common.views.Html5View;
import com.my.target.nativeads.views.MediaAdView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import xsna.as50;
import xsna.cjy0;
import xsna.o2z0;
import xsna.thz0;
import xsna.ubz0;
import xsna.vtl0;
import xsna.zu50;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class c9z0 implements ckz0 {
    public final zu50 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final x1z0 d;
    public final mez0 e;
    public final dhy0 f;
    public final cw50 g;
    public final thz0 h;
    public zu50.d i;
    public aeq j;
    public zu50.a k;
    public boolean l;

    public c9z0(zu50 zu50Var, x1z0 x1z0Var, i620 i620Var, Context context) {
        this.a = zu50Var;
        this.d = x1z0Var;
        this.g = new cw50(x1z0Var);
        lgz0 lgz0Var = x1z0Var.W;
        thz0 a2 = thz0.a(x1z0Var, lgz0Var != null ? 3 : 2, lgz0Var, context);
        this.h = a2;
        d9z0 d9z0Var = new d9z0(a2, context);
        boolean z = zu50Var.s;
        u6z0 u6z0Var = zu50Var.a;
        d9z0Var.c = z;
        this.f = new dhy0(x1z0Var, new a(this, zu50Var), d9z0Var, this.k, i620Var, u6z0Var.a.a);
        this.e = mez0.a(u6z0Var.a);
    }

    @Override // xsna.ckz0
    public final void a() {
        this.f.g();
        thz0 thz0Var = this.h;
        if (thz0Var != null) {
            thz0Var.g();
        }
    }

    @Override // xsna.ckz0
    public final void b(Context context) {
        this.f.k.a(context);
    }

    @Override // xsna.ckz0
    public final void c(View view) {
        gu8.c(null, "NativeAdEngine: Click received by native ad");
        if (view != null) {
            d(this.d, null, 2, view, view.getContext());
        }
    }

    public final void d(xey0 xey0Var, String str, int i, View view, Context context) {
        zu50 zu50Var = this.a;
        if (xey0Var != null) {
            aeq aeqVar = this.j;
            if (aeqVar != null) {
                String l = xey0Var.l();
                e5z0 e5z0Var = xey0Var.a;
                String str2 = xey0Var.J;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                } else if (i == 2 && l != null) {
                    str2 = l;
                }
                String str3 = xey0Var.H;
                String str4 = xey0Var.I;
                aeqVar.a(str3, str4, str2, xey0Var.w);
                if (TextUtils.isEmpty(str2)) {
                    if (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4)) {
                        h8z0.g(e5z0Var.j("deeplinkClick"), 2, null);
                    }
                } else if (str2.equals(l)) {
                    h8z0.g(e5z0Var.j("ctaClick"), 2, null);
                } else {
                    h8z0.g(e5z0Var.j("click"), 2, null);
                }
                gu8.c(null, "NativeAdEngine: click was handled by app");
            } else if (str != null) {
                zu50Var.getClass();
                this.e.e(xey0Var, str, i, null, null, context);
            } else {
                zu50Var.getClass();
                this.e.c(xey0Var, i, null, context);
            }
        }
        zu50.c cVar = zu50Var.i;
        if (cVar != null) {
            try {
                cVar.a(view, zu50Var);
            } catch (AbstractMethodError e) {
                if (e.getStackTrace().length == new Exception().getStackTrace().length) {
                    cVar.onClick();
                }
            }
        }
    }

    public final void e(int[] iArr, Context context) {
        if (this.l) {
            String t = c1z0.t(context);
            ArrayList s = this.d.s();
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                a5z0 a5z0Var = (i2 < 0 || i2 >= s.size()) ? null : (a5z0) s.get(i2);
                if (a5z0Var != null) {
                    ArrayList arrayList = this.b;
                    if (!arrayList.contains(a5z0Var)) {
                        e5z0 e5z0Var = a5z0Var.a;
                        if (t != null) {
                            h8z0.d(e5z0Var, t);
                        }
                        h8z0.e(e5z0Var, "show", 1, null);
                        arrayList.add(a5z0Var);
                    }
                }
            }
        }
    }

    @Override // xsna.ckz0
    public final void f() {
        WeakReference weakReference;
        Html5View html5View;
        String str;
        scz0 scz0Var = this.f.r;
        if (scz0Var == null || (weakReference = scz0Var.a) == null || (html5View = (Html5View) weakReference.get()) == null || (str = html5View.f) == null) {
            return;
        }
        Html5View.e eVar = html5View.c;
        eVar.b.removeCallbacks(eVar.c);
        html5View.e = 0;
        html5View.b.setData(str);
    }

    @Override // xsna.ckz0
    public final cw50 g() {
        return this.g;
    }

    public final void h() {
        dhy0 dhy0Var = this.f;
        h8z0.e(dhy0Var.d.a, "closedByUser", 999, null);
        izy0 izy0Var = dhy0Var.e;
        izy0Var.h();
        izy0Var.l = null;
        suy0 suy0Var = dhy0Var.f;
        if (suy0Var != null) {
            suy0Var.d();
        }
        dhy0Var.h.e();
        dhy0Var.e(false);
        dhy0Var.p = true;
        ubz0 ubz0Var = dhy0Var.t;
        ViewGroup g = ubz0Var != null ? ubz0Var.g() : null;
        if (g != null) {
            g.setVisibility(4);
        }
    }

    @Override // xsna.ckz0
    public final void i(vtl0.b bVar) {
        this.f.w = bVar;
    }

    @Override // xsna.ckz0
    public final void j(View view, List list, int i) {
        a();
        thz0 thz0Var = this.h;
        if (thz0Var != null) {
            thz0Var.d(view, new thz0.b[0]);
        }
        dhy0 dhy0Var = this.f;
        giy0 giy0Var = dhy0Var.d.T;
        giy0Var.d(1, 5000);
        if (!(view instanceof ViewGroup)) {
            giy0Var.c(1, IronSourceConstants.errorCode_biddingDataException, "rootView is not ViewGroup");
            gu8.e(null, "NativeAdViewController: Unable to register view for displaying NativeAd " + view + ", should be instance of ViewGroup");
            return;
        }
        if (dhy0Var.p) {
            giy0Var.b(1, 1, IronSourceConstants.errorCode_loadInProgress, null, null);
            gu8.e(null, "NativeAdViewController: Registering ad was disabled by user");
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        ubz0.a aVar = new ubz0.a();
        aVar.d = 1;
        aVar.a = (ViewGroup) view;
        aVar.c = list;
        ubz0 b = aVar.b();
        dhy0Var.t = b;
        dhy0.d(b, dhy0Var.z, dhy0Var.A);
        dhy0Var.c(dhy0Var.t, i);
    }

    @Override // xsna.ckz0
    public final void k(vtl0.c cVar) {
        this.f.x = cVar;
    }

    @Override // xsna.ckz0
    public final void l(zu50.a aVar) {
        this.k = aVar;
        this.f.v = aVar;
    }

    @Override // xsna.ckz0
    public final void m(zu50.d dVar) {
        this.i = dVar;
    }

    @Override // xsna.ckz0
    public final void o() {
        this.f.getClass();
    }

    @Override // xsna.ckz0
    public final void p() {
        this.f.getClass();
    }

    @Override // xsna.ckz0
    public final void r(lv50 lv50Var, List list, int i) {
        a();
        thz0 thz0Var = this.h;
        if (thz0Var != null) {
            thz0Var.d(lv50Var.d(), new thz0.b[0]);
        }
        dhy0 dhy0Var = this.f;
        x1z0 x1z0Var = dhy0Var.d;
        x1z0Var.T.d(1, 5000);
        ViewGroup d = lv50Var.d();
        if (dhy0Var.p) {
            x1z0Var.T.b(1, 1, IronSourceConstants.errorCode_loadInProgress, null, null);
            gu8.e(null, "NativeAdViewController: Registering ad was disabled by user");
            d.setVisibility(4);
            return;
        }
        ubz0.a aVar = new ubz0.a();
        aVar.d = 2;
        aVar.b = lv50Var;
        aVar.c = list;
        ubz0 b = aVar.b();
        dhy0Var.t = b;
        dhy0.d(b, dhy0Var.z, dhy0Var.A);
        dhy0Var.c(dhy0Var.t, i);
    }

    @Override // xsna.ckz0
    public final void a(long j) {
        Html5View html5View;
        dhy0 dhy0Var = this.f;
        dhy0Var.y = j;
        scz0 scz0Var = dhy0Var.r;
        if (scz0Var != null) {
            scz0Var.h = j;
            WeakReference weakReference = scz0Var.a;
            if (weakReference == null || (html5View = (Html5View) weakReference.get()) == null) {
                return;
            }
            html5View.setLoadingTimeoutMillis(j);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements cjy0.a, o2z0.b {
        public final c9z0 b;
        public final zu50 c;
        public float d = -10.0f;

        public a(c9z0 c9z0Var, zu50 zu50Var) {
            this.b = c9z0Var;
            this.c = zu50Var;
        }

        @Override // xsna.o2z0.b
        public final void a(boolean z) {
            zu50 zu50Var = this.c;
            as50.a aVar = zu50Var.j;
            if (aVar == null) {
                return;
            }
            if (!z) {
                aVar.f(null, false);
                return;
            }
            cw50 d = zu50Var.d();
            if (d == null) {
                aVar.f(null, false);
                return;
            }
            kiw kiwVar = d.r;
            if (kiwVar == null) {
                aVar.f(null, false);
            } else {
                aVar.f(kiwVar, true);
            }
        }

        public final void b(int i) {
            c9z0 c9z0Var = this.b;
            ArrayList arrayList = c9z0Var.c;
            ArrayList s = c9z0Var.d.s();
            a5z0 a5z0Var = (i < 0 || i >= s.size()) ? null : (a5z0) s.get(i);
            if (a5z0Var == null || arrayList.contains(a5z0Var)) {
                return;
            }
            h8z0.e(a5z0Var.a, "render", 1, null);
            arrayList.add(a5z0Var);
        }

        public final void c(View view, int i) {
            gu8.c(null, "NativeAdEngine: Click received by native ad");
            if (view != null) {
                c9z0 c9z0Var = this.b;
                c9z0Var.d(c9z0Var.d, null, i, view, view.getContext());
            }
        }

        public final void d(View view, int i, int i2) {
            View view2;
            int i3;
            gu8.c(null, "NativeAdEngine: Click on native card received");
            c9z0 c9z0Var = this.b;
            x1z0 x1z0Var = c9z0Var.d;
            ArrayList s = x1z0Var.s();
            if (i < 0 || i >= s.size()) {
                view2 = view;
                i3 = i2;
            } else {
                view2 = view;
                i3 = i2;
                c9z0Var.d((a5z0) s.get(i), null, i3, view2, view.getContext());
            }
            if (x1z0Var.S.a) {
                return;
            }
            e5z0 e5z0Var = x1z0Var.a;
            if (view2.getContext() != null) {
                h8z0.e(e5z0Var, i3 == 2 ? "ctaClick" : "click", 2, null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            MediaAdView e;
            gu8.c(null, "NativeAdEngine: Video error");
            c9z0 c9z0Var = this.b;
            dhy0 dhy0Var = c9z0Var.f;
            dhy0Var.m = false;
            dhy0Var.l = 0;
            ady0 ady0Var = dhy0Var.q;
            if (ady0Var != null) {
                ady0Var.a();
            }
            ubz0 ubz0Var = dhy0Var.t;
            if (ubz0Var != null && (e = ubz0Var.e()) != null) {
                e.setBackgroundColor(-1118482);
                ucz0 f = dhy0Var.f(e);
                if (f != 0) {
                    dhy0Var.s = f.getState();
                    f.dispose();
                    ((View) f).setVisibility(8);
                }
                dhy0Var.b(e, dhy0Var.d.t);
                e.getImageView().setVisibility(0);
                e.getProgressBarView().setVisibility(8);
                e.getPlayButtonView().setVisibility(8);
                if (dhy0Var.o) {
                    e.setOnClickListener(new com.vk.im.video.d(dhy0Var, 16));
                }
            }
            c9z0Var.a.getClass();
        }
    }

    @Override // xsna.ckz0
    public final void f(aeq aeqVar) {
        this.j = aeqVar;
    }
}
