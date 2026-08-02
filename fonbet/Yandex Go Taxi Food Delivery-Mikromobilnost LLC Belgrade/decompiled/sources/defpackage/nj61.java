package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.banner.BannerAdView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import yads.cy2;
import yads.gi0;
import yads.ij3;

/* loaded from: classes7.dex */
public final /* synthetic */ class nj61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oj61 b;

    public /* synthetic */ nj61(oj61 oj61Var, int i) {
        this.a = i;
        this.b = oj61Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0314  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        hk61 hk61Var;
        String str;
        int i;
        uid uidVar;
        gp51 gp51Var;
        int i2;
        ei81 ei81Var;
        gg81 a;
        uio0 uio0Var;
        j471 j471Var;
        ei81 ei81Var2;
        int i3;
        uid uidVar2;
        int i4;
        ei81 ei81Var3;
        Iterator it;
        Object obj;
        ei81 ei81Var4;
        int i5;
        ld71 ld71Var;
        boolean z;
        t171 t171Var;
        z4m0 z4m0Var;
        gp51 gp51Var2;
        omk omkVar;
        dv81 dv81Var;
        int i6;
        ujk ujkVar;
        Boolean bool;
        a081 a081Var;
        List f;
        ld71 ld71Var2;
        Object obj2;
        se71 se71Var;
        Object obj3;
        lg71 lg71Var;
        int i7 = this.a;
        oj61 oj61Var = this.b;
        switch (i7) {
            case 0:
                oj61Var.m.b.post(new myv0((ViewGroup) oj61Var.a.U, false));
                return;
            default:
                boolean z2 = oj61Var.r;
                j471 j471Var2 = oj61Var.a;
                if (z2) {
                    j471Var2.h(so61.f);
                    return;
                }
                d881 d881Var = oj61Var.p;
                BannerAdView bannerAdView = j471Var2.U;
                if (d881Var == null || (hk61Var = oj61Var.q) == null) {
                    return;
                }
                hn71 hn71Var = oj61Var.d;
                Context context = oj61Var.n;
                nr41 nr41Var = oj61Var.g;
                uid uidVar3 = oj61Var.o;
                dv81 dv81Var2 = j471Var2.W;
                gp51 gp51Var3 = oj61Var.l;
                hn71Var.getClass();
                qb71 b = hk61Var.b();
                if (b != null && (se71Var = (se71) a.R(b.a)) != null) {
                    Iterator it2 = se71Var.b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (((uy71) obj3).a.equals("media")) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    uy71 uy71Var = (uy71) obj3;
                    if (uy71Var != null) {
                        Object obj4 = uy71Var.c;
                        d171 d171Var = obj4 instanceof d171 ? (d171) obj4 : null;
                        if (d171Var != null && (lg71Var = d171Var.a) != null) {
                            li61 li61Var = lg71Var.a;
                            kv81 kv81Var = li61Var instanceof kv81 ? (kv81) li61Var : null;
                            if (kv81Var != null) {
                                str = kv81Var.a;
                                if (str != null) {
                                    uidVar = uidVar3;
                                    gp51Var = gp51Var3;
                                    ei81Var = null;
                                    i2 = 11;
                                    i = 0;
                                } else {
                                    cf81 cf81Var = new cf81(context.getApplicationContext());
                                    v981 v981Var = (v981) hn71Var.b;
                                    i = 0;
                                    t171 t171Var2 = new t171(ks81.b);
                                    uidVar = uidVar3;
                                    nr41 nr41Var2 = new nr41(11, t171Var2);
                                    Context context2 = ((n291) v981Var).a;
                                    ge71 c = wha1.c(context2, context2);
                                    gp51Var = gp51Var3;
                                    i2 = 11;
                                    ei81Var = new ei81(R$layout.monetization_ads_internal_divkit, new z4m0(hk61Var, nr41Var, t171Var2, nr41Var2, cf81Var, str, c), new zf71(d881Var));
                                }
                                vi71 vi71Var = (vi71) hn71Var.c;
                                a = ((k281) vi71Var.w).a.a(context);
                                if (a != null && !a.v) {
                                    f = hk61Var.f();
                                    if (f == null) {
                                        Iterator it3 = f.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj2 = it3.next();
                                                if (((ld71) obj2).a.equals("ad")) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        ld71Var2 = (ld71) obj2;
                                    } else {
                                        ld71Var2 = null;
                                    }
                                    if (ld71Var2 != null) {
                                        uio0Var = new uio0(ld71Var2, (fe81) vi71Var.b, (v981) vi71Var.c);
                                        if (uio0Var != null) {
                                            ld71 ld71Var3 = (ld71) uio0Var.c;
                                            ks81 ks81Var = ld71Var3.h;
                                            gp51 gp51Var4 = gp51Var;
                                            omk omkVar2 = ld71Var3.e;
                                            t171 t171Var3 = new t171(ks81Var);
                                            kz71 kz71Var = new kz71();
                                            Context context3 = ((n291) ((v981) uio0Var.b)).a;
                                            ge71 c2 = wha1.c(context3, context3);
                                            ((w881) uio0Var.d).getClass();
                                            boolean z3 = hk61Var instanceof mw81;
                                            if (z3) {
                                                z = z3;
                                                ld71Var = ld71Var3;
                                                j471Var = j471Var2;
                                                i5 = 1;
                                                z4m0 z4m0Var2 = new z4m0((mw81) hk61Var, (rq81) gp51Var4, nr41Var, t171Var3, c2);
                                                ei81Var2 = ei81Var;
                                                gp51Var2 = gp51Var4;
                                                t171Var = t171Var3;
                                                z4m0Var = z4m0Var2;
                                            } else {
                                                j471Var = j471Var2;
                                                i5 = 1;
                                                ld71Var = ld71Var3;
                                                z = z3;
                                                t171Var = t171Var3;
                                                ei81Var2 = ei81Var;
                                                z4m0Var = new z4m0(hk61Var, gp51Var4, nr41Var, t171Var, c2);
                                                gp51Var2 = gp51Var4;
                                            }
                                            bi61 bi61Var = new bi61(t171Var);
                                            i971 i971Var = (i971) uio0Var.e;
                                            i971Var.getClass();
                                            if (z) {
                                                i3 = i5;
                                                ge71 ge71Var = (ge71) i971Var.b;
                                                e391 e391Var = new e391();
                                                i6 = 3;
                                                dv81Var = dv81Var2;
                                                e391Var.a.put(omkVar2, new wn61((mw81) hk61Var, ge71Var, ld71Var.h));
                                                ntk ntkVar = new ntk(context);
                                                tp61 tp61Var = new tp61();
                                                ga71 ga71Var = new ga71();
                                                w671 w671Var = new w671();
                                                gm61 gm61Var = new gm61();
                                                q071 q071Var = new q071();
                                                id71 id71Var = new id71();
                                                omkVar = omkVar2;
                                                plk[] plkVarArr = new plk[6];
                                                plkVarArr[i] = tp61Var;
                                                plkVarArr[i3] = ga71Var;
                                                plkVarArr[2] = w671Var;
                                                plkVarArr[3] = gm61Var;
                                                plkVarArr[4] = id71Var;
                                                plkVarArr[5] = q071Var;
                                                qlk qlkVar = new qlk(plkVarArr);
                                                vp61 vp61Var = new vp61(bi61Var);
                                                a081 a081Var2 = a081.g;
                                                if (a081Var2 == null) {
                                                    synchronized (a081.f) {
                                                        a081Var = a081.g;
                                                        if (a081Var == null) {
                                                            a081Var = new a081();
                                                            a081.g = a081Var;
                                                        }
                                                    }
                                                    a081Var2 = a081Var;
                                                }
                                                gg81 a2 = a081Var2.a(context);
                                                if (a2 != null) {
                                                    ty61 ty61Var = a2.J0;
                                                    bool = Boolean.valueOf((ty61Var != null ? ty61Var.a : null) != null ? i3 : i);
                                                } else {
                                                    bool = null;
                                                }
                                                lml mmlVar = jl40.l(bool, Boolean.TRUE) ? new mml(context) : new rs81(context);
                                                tjk tjkVar = new tjk(ntkVar);
                                                tjkVar.e = qlkVar;
                                                tjkVar.h = mmlVar;
                                                tjkVar.b(e391Var);
                                                tjkVar.b(vp61Var);
                                                ujkVar = tjkVar.a();
                                            } else {
                                                omkVar = omkVar2;
                                                i3 = i5;
                                                dv81Var = dv81Var2;
                                                i6 = 3;
                                                ujkVar = (ujk) kotlin.a.a(new gi0(context, bi61Var)).getValue();
                                            }
                                            ujk ujkVar2 = ujkVar;
                                            uio0 uio0Var2 = uio0Var;
                                            uidVar2 = uidVar;
                                            i4 = 11;
                                            vmn0 vmn0Var = new vmn0(omkVar, new f281(context, (fe81) uio0Var.a, (v981) uio0Var.b, d881Var, gp51Var2, kz71Var, bi61Var), ujkVar2, c2, new tj81(), 192);
                                            i971 i971Var2 = new i971(hk61Var.d(), dv81Var);
                                            cv81[] cv81VarArr = new cv81[i6];
                                            cv81VarArr[i] = vmn0Var;
                                            cv81VarArr[i3] = z4m0Var;
                                            cv81VarArr[2] = i971Var2;
                                            nr41 nr41Var3 = new nr41(29, cv81VarArr);
                                            vm71 vm71Var = new vm71(d881Var);
                                            cs81 cs81Var = (cs81) uio0Var2.f;
                                            int i8 = R$layout.monetization_ads_internal_divkit;
                                            cs81Var.getClass();
                                            ei81Var3 = new ei81(i8, nr41Var3, vm71Var);
                                        } else {
                                            j471Var = j471Var2;
                                            ei81Var2 = ei81Var;
                                            i3 = 1;
                                            uidVar2 = uidVar;
                                            i4 = i2;
                                            ei81Var3 = null;
                                        }
                                        fp71 fp71Var = new fp71(context, bannerAdView, j73.A(new ei81[]{ei81Var2, ei81Var3}), uidVar2);
                                        oj61Var.s = new lm71(i4, fp71Var);
                                        jd81 a3 = d881Var.a();
                                        au2 au2Var = (au2) fp71Var.b;
                                        ViewGroup viewGroup = (ViewGroup) fp71Var.a;
                                        Context context4 = (Context) fp71Var.x;
                                        it = au2Var.a.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj = it.next();
                                                if (((ei81) obj).c.a(context4)) {
                                                }
                                            } else {
                                                obj = null;
                                            }
                                        }
                                        ei81Var4 = (ei81) obj;
                                        if (ei81Var4 != null) {
                                            ((to81) fp71Var.c).getClass();
                                            ViewGroup viewGroup2 = (ViewGroup) on71.a(viewGroup.getContext(), ExtendedNativeAdView.class, ei81Var4.a, viewGroup);
                                            if (viewGroup2 != null) {
                                                uf81 uf81Var = (uf81) fp71Var.w;
                                                r581 r581Var = uf81Var.d;
                                                kgx kgxVar = uf81.e[i];
                                                r581Var.getClass();
                                                r581Var.a = new WeakReference(viewGroup2);
                                                viewGroup.setVisibility(i);
                                                viewGroup.removeAllViews();
                                                xm71 xm71Var = uf81Var.b;
                                                Context context5 = viewGroup.getContext();
                                                ViewTreeObserver.OnPreDrawListener onPreDrawListener = uf81Var.a;
                                                xm71Var.getClass();
                                                if (viewGroup.indexOfChild(viewGroup2) == -1) {
                                                    xm71Var.a.getClass();
                                                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b281.a(context5, a3.b(context5)), m810.b(TypedValue.applyDimension(i3, a3.a(context5), context5.getResources().getDisplayMetrics())));
                                                    layoutParams.addRule(13);
                                                    viewGroup.setVisibility(0);
                                                    viewGroup2.setVisibility(0);
                                                    viewGroup.addView(viewGroup2, layoutParams);
                                                    if (onPreDrawListener != null) {
                                                        am81 am81Var = sj71.a;
                                                        viewGroup2.getViewTreeObserver().addOnPreDrawListener(new ij3(onPreDrawListener, viewGroup2));
                                                    }
                                                }
                                                cv81 cv81Var = ei81Var4.b;
                                                uf81Var.c = cv81Var;
                                                cv81Var.v(viewGroup2);
                                                j471 j471Var3 = j471Var;
                                                BannerAdView bannerAdView2 = j471Var3.U;
                                                fe81 fe81Var = j471Var3.c;
                                                o9a1.d(fe81Var.a.b);
                                                j471Var3.n();
                                                j471Var3.m();
                                                ct71 ct71Var = j471Var3.e0;
                                                if (ct71Var != j471Var3.f0) {
                                                    ct71 ct71Var2 = new ct71[]{ct71Var}[0];
                                                    if (ct71Var2 != null) {
                                                        ct71Var2.a(j471Var3.a);
                                                    }
                                                    j471Var3.e0 = j471Var3.f0;
                                                }
                                                a271 a271Var = fe81Var.d.a;
                                                if (cy2.d != (a271Var != null ? ((jd81) a271Var).a : null) || bannerAdView2.getLayoutParams() == null) {
                                                    return;
                                                }
                                                bannerAdView2.getLayoutParams().height = -2;
                                                return;
                                            }
                                        }
                                        j471Var.h(so61.f);
                                        return;
                                    }
                                }
                                uio0Var = null;
                                if (uio0Var != null) {
                                }
                                fp71 fp71Var2 = new fp71(context, bannerAdView, j73.A(new ei81[]{ei81Var2, ei81Var3}), uidVar2);
                                oj61Var.s = new lm71(i4, fp71Var2);
                                jd81 a32 = d881Var.a();
                                au2 au2Var2 = (au2) fp71Var2.b;
                                ViewGroup viewGroup3 = (ViewGroup) fp71Var2.a;
                                Context context42 = (Context) fp71Var2.x;
                                it = au2Var2.a.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                ei81Var4 = (ei81) obj;
                                if (ei81Var4 != null) {
                                }
                                j471Var.h(so61.f);
                                return;
                            }
                        }
                    }
                }
                str = null;
                if (str != null) {
                }
                vi71 vi71Var2 = (vi71) hn71Var.c;
                a = ((k281) vi71Var2.w).a.a(context);
                if (a != null) {
                    f = hk61Var.f();
                    if (f == null) {
                    }
                    if (ld71Var2 != null) {
                    }
                }
                uio0Var = null;
                if (uio0Var != null) {
                }
                fp71 fp71Var22 = new fp71(context, bannerAdView, j73.A(new ei81[]{ei81Var2, ei81Var3}), uidVar2);
                oj61Var.s = new lm71(i4, fp71Var22);
                jd81 a322 = d881Var.a();
                au2 au2Var22 = (au2) fp71Var22.b;
                ViewGroup viewGroup32 = (ViewGroup) fp71Var22.a;
                Context context422 = (Context) fp71Var22.x;
                it = au2Var22.a.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                ei81Var4 = (ei81) obj;
                if (ei81Var4 != null) {
                }
                j471Var.h(so61.f);
                return;
        }
    }
}
