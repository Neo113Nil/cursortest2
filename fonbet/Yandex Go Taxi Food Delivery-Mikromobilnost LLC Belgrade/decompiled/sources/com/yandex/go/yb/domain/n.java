package com.yandex.go.yb.domain;

import com.adjust.sdk.Constants;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import com.yandex.go.yb.experiments.ChangeToYbWalletExperiment;
import com.yandex.go.yb.ui.ChangeToYbWalletModalView;
import com.yandex.go.yb.ui.YbScreenContainerView;
import defpackage.bh9;
import defpackage.c6w;
import defpackage.cda0;
import defpackage.d6z;
import defpackage.epz;
import defpackage.fva0;
import defpackage.gay0;
import defpackage.gh9;
import defpackage.hh9;
import defpackage.hr51;
import defpackage.hst;
import defpackage.ih9;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.jst;
import defpackage.lw90;
import defpackage.mdh;
import defpackage.n20;
import defpackage.n65;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qqo;
import defpackage.qqy;
import defpackage.rgf;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.tf51;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xw91;
import defpackage.y6i0;
import defpackage.ycq0;
import defpackage.yy51;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes15.dex */
public final class n {
    public static final HashMap o = new HashMap();
    public static final tf51 p = new tf51(BigDecimal.ZERO, "", "");
    public final tse a;
    public final tt2 b;
    public final o c;
    public final hr51 d;
    public final n20 e;
    public final ycq0 f;
    public final cda0 g;
    public final hh9 h;
    public final com.yandex.go.yb.data.h i;
    public final rgf j;
    public final qqo k;
    public pzt0 l;
    public pzt0 m;
    public volatile Map n = o;

    public n(rqo rqoVar, tse tseVar, tt2 tt2Var, o oVar, hr51 hr51Var, n20 n20Var, ycq0 ycq0Var, cda0 cda0Var, hh9 hh9Var, com.yandex.go.yb.data.h hVar, rgf rgfVar) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = oVar;
        this.d = hr51Var;
        this.e = n20Var;
        this.f = ycq0Var;
        this.g = cda0Var;
        this.h = hh9Var;
        this.i = hVar;
        this.j = rgfVar;
        this.k = ((jbh) rqoVar).c(ChangeToYbWalletExperiment.q);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v4 java.util.List, still in use, count: 1, list:
          (r4v4 java.util.List) from 0x0040: INVOKE (r4v6 java.util.Iterator) = (r4v4 java.util.List) INTERFACE call: java.lang.Iterable.iterator():java.util.Iterator A[MD:():java.util.Iterator<T> (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.simplifyMoveInsns(CodeShrinkVisitor.java:289)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.processForceInlineInsns(RegionMakerVisitor.java:43)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:29)
        */
    public static java.util.HashMap a(java.util.List r4) {
        /*
            com.ybsdk.api.YBSdk r0 = com.ybsdk.api.YBSdk.INSTANCE
            n4u0 r0 = r0.observeStateChanges()
            java.lang.Object r0 = r0.getValue()
            ai51 r0 = (defpackage.ai51) r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r2 = r4.hasNext()
            tf51 r3 = com.yandex.go.yb.domain.n.p
            if (r2 == 0) goto L29
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            r1.put(r2, r3)
            goto L17
        L29:
            boolean r4 = r0 instanceof defpackage.yh51
            if (r4 != 0) goto L2e
            goto L5b
        L2e:
            yh51 r0 = (defpackage.yh51) r0
            java.util.List r4 = r0.b
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L5b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3e
            goto L5b
        L3e:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L44:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r4.next()
            xf51 r0 = (defpackage.xf51) r0
            java.lang.String r2 = r0.b
            tf51 r0 = r0.f
            if (r0 != 0) goto L57
            r0 = r3
        L57:
            r1.put(r2, r0)
            goto L44
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.go.yb.domain.n.a(java.util.List):java.util.HashMap");
    }

    public static void e(Map map) {
        hst hstVar = jst.e;
        for (Map.Entry entry : map.entrySet()) {
            String str = jl40.l(entry.getValue(), p) ? "balance unknown" : ((tf51) entry.getValue()).b;
            Object key = entry.getKey();
            StringBuilder sb = new StringBuilder("id ");
            sb.append(key);
            sb.append(Extension.COLON_SPACE);
            sb.append(str);
        }
        hstVar.getClass();
    }

    public final void b() {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        SelectYbCardInteractor$initSnapshot$1 selectYbCardInteractor$initSnapshot$1 = new SelectYbCardInteractor$initSnapshot$1(this, null);
        tse tseVar = this.a;
        this.m = tje.N(tseVar, mdhVar, null, selectYbCardInteractor$initSnapshot$1, 2);
        pzt0 pzt0Var = this.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.l = null;
        this.l = tje.N(tseVar, null, null, new SelectYbCardInteractor$observeYbWalletOpened$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        SelectYbCardInteractor$openChangeToYbWalletModalIfNeed$1 selectYbCardInteractor$openChangeToYbWalletModalIfNeed$1;
        int i;
        Iterator it;
        Object obj;
        String str;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof SelectYbCardInteractor$openChangeToYbWalletModalIfNeed$1) {
            selectYbCardInteractor$openChangeToYbWalletModalIfNeed$1 = (SelectYbCardInteractor$openChangeToYbWalletModalIfNeed$1) continuationImpl;
            int i2 = selectYbCardInteractor$openChangeToYbWalletModalIfNeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectYbCardInteractor$openChangeToYbWalletModalIfNeed$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = selectYbCardInteractor$openChangeToYbWalletModalIfNeed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectYbCardInteractor$openChangeToYbWalletModalIfNeed$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pzt0 pzt0Var = this.m;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    this.m = null;
                    o oVar = this.c;
                    selectYbCardInteractor$openChangeToYbWalletModalIfNeed$1.label = 1;
                    if (oVar.c(selectYbCardInteractor$openChangeToYbWalletModalIfNeed$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                Map map = this.n;
                HashMap a = a(EmptyList.a);
                e(a);
                it = a.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Map.Entry entry = (Map.Entry) obj;
                    tf51 tf51Var = (tf51) map.get(entry.getKey());
                    tf51 tf51Var2 = (tf51) entry.getValue();
                    if (tf51Var != null) {
                        tf51 tf51Var3 = p;
                        if (!tf51Var.equals(tf51Var3) && !jl40.l(tf51Var2, tf51Var3) && jl40.l(tf51Var2.b, tf51Var.b) && tf51Var2.a.compareTo(tf51Var.a) > 0) {
                            break;
                        }
                    }
                }
                Map.Entry entry2 = (Map.Entry) obj;
                str = entry2 != null ? (String) entry2.getKey() : null;
                if (str != null || str.length() == 0) {
                    jst.e.getClass();
                    return zy11Var;
                }
                d(str);
                return zy11Var;
            }
        }
        selectYbCardInteractor$openChangeToYbWalletModalIfNeed$1 = new SelectYbCardInteractor$openChangeToYbWalletModalIfNeed$1(this, continuationImpl);
        Object obj22 = selectYbCardInteractor$openChangeToYbWalletModalIfNeed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectYbCardInteractor$openChangeToYbWalletModalIfNeed$1.label;
        if (i != 0) {
        }
        Map map2 = this.n;
        HashMap a2 = a(EmptyList.a);
        e(a2);
        it = a2.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        Map.Entry entry22 = (Map.Entry) obj;
        if (entry22 != null) {
        }
        if (str != null) {
        }
        jst.e.getClass();
        return zy11Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(String str) {
        Object obj;
        boolean equals;
        YbScreenSource ybScreenSource;
        YbScreenSource ybScreenSource2 = this.i.b;
        if (ybScreenSource2 == null) {
            return;
        }
        jst.e.getClass();
        YbScreenContainerView a = this.d.a();
        c6w it = y6i0.n(0, a.getChildCount()).iterator();
        while (it.c) {
            if (a.getChildAt(it.nextInt()) instanceof ChangeToYbWalletModalView) {
                return;
            }
        }
        hh9 hh9Var = this.h;
        epz epzVar = hh9Var.d;
        gay0 gay0Var = hh9Var.c;
        ListBuilder h = ((com.yandex.go.payments.paymentlist.data.c) gay0Var.a).h();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = h.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            }
            Object next = qqyVar.next();
            if (next instanceof yy51) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (jl40.l(((yy51) obj).a, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        yy51 yy51Var = (yy51) obj;
        if (yy51Var == null) {
            return;
        }
        String str2 = yy51Var.a;
        ChangeToYbWalletExperiment changeToYbWalletExperiment = (ChangeToYbWalletExperiment) hh9Var.g.b();
        if (changeToYbWalletExperiment.b()) {
            List<String> list = changeToYbWalletExperiment.n;
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : list) {
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -1857640538:
                            if (str3.equals("summary")) {
                                ybScreenSource = YbScreenSource.SUMMARY;
                                break;
                            }
                            break;
                        case 3347807:
                            if (str3.equals("menu")) {
                                ybScreenSource = YbScreenSource.MENU;
                                break;
                            }
                            break;
                        case 629233382:
                            if (str3.equals(Constants.DEEPLINK)) {
                                ybScreenSource = YbScreenSource.DEEPLINK;
                                break;
                            }
                            break;
                        case 664688751:
                            if (str3.equals("promo_object")) {
                                ybScreenSource = YbScreenSource.PROMO_OBJECT;
                                break;
                            }
                            break;
                    }
                    if (ybScreenSource == null) {
                        arrayList2.add(ybScreenSource);
                    }
                }
                ybScreenSource = null;
                if (ybScreenSource == null) {
                }
            }
            if (!arrayList2.contains(ybScreenSource2)) {
                jst.e.getClass();
            } else if (System.currentTimeMillis() < TimeUnit.DAYS.toMillis(changeToYbWalletExperiment.m) + epzVar.a.j("KEY_YANDEX_CARD_SELECT_SUGGEST_SHOWN_AT", 0L)) {
                jst.e.getClass();
            } else {
                if (!jl40.l(gay0Var.b.a().b, str2)) {
                    equals = lw90.c(gay0Var.d, null, new n65[0], 3).b(yy51Var).equals(xw91.C);
                    if (equals) {
                        jst.e.getClass();
                        return;
                    }
                    fva0 fva0Var = hh9Var.e;
                    PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Inflate;
                    fva0.f(fva0Var, "ChangeCardSuggest", performanceAnalytics$Type, 0L, 4);
                    ChangeToYbWalletModalView changeToYbWalletModalView = new ChangeToYbWalletModalView(hh9Var.a, new gh9((bh9) hh9Var.b.get(), hh9Var.c, yy51Var, new ih9(d6z.Y(changeToYbWalletExperiment, changeToYbWalletExperiment.e), d6z.Y(changeToYbWalletExperiment, changeToYbWalletExperiment.j), d6z.Y(changeToYbWalletExperiment, changeToYbWalletExperiment.k), d6z.Y(changeToYbWalletExperiment, changeToYbWalletExperiment.l)), ybScreenSource2));
                    fva0.c(hh9Var.e, changeToYbWalletModalView, "ChangeCardSuggest", performanceAnalytics$Type, 8);
                    epzVar.a.q(System.currentTimeMillis(), "KEY_YANDEX_CARD_SELECT_SUGGEST_SHOWN_AT");
                    jst.e.getClass();
                    hh9Var.f.c.r("NOTIFICATION", str2);
                    changeToYbWalletModalView.show(a, a.getChildCount() > 0 ? a.getChildAt(0).getZ() - 1.0f : 0.0f);
                    return;
                }
                jst.e.getClass();
            }
        } else {
            jst.e.getClass();
        }
        equals = false;
        if (equals) {
        }
    }
}
