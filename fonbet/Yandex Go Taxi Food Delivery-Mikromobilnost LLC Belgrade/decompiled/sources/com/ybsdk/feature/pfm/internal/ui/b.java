package com.ybsdk.feature.pfm.internal.ui;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.PfmDetailsButtonPfm;
import com.ybsdk.core.analytics.generated.delegates.BottomNavigationEvents$BottomNavigationClickButtonVersion;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrIconClickedSource;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.b3z;
import defpackage.bab0;
import defpackage.dia0;
import defpackage.dpf;
import defpackage.ds31;
import defpackage.ebb0;
import defpackage.ecb0;
import defpackage.g8e;
import defpackage.gao;
import defpackage.gc5;
import defpackage.h9b0;
import defpackage.hdb0;
import defpackage.i9b0;
import defpackage.j4r;
import defpackage.jl40;
import defpackage.jo0;
import defpackage.jpl;
import defpackage.kpl;
import defpackage.l0p;
import defpackage.l4r;
import defpackage.l9b0;
import defpackage.lh6;
import defpackage.lrp0;
import defpackage.mv3;
import defpackage.n4r;
import defpackage.npb;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.o4r;
import defpackage.oy80;
import defpackage.p4r;
import defpackage.pdb0;
import defpackage.ph6;
import defpackage.ppl;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.q4r;
import defpackage.qdb0;
import defpackage.r4r;
import defpackage.r8j0;
import defpackage.r9b0;
import defpackage.rcb0;
import defpackage.s4r;
import defpackage.sb6;
import defpackage.scb0;
import defpackage.sh6;
import defpackage.sls;
import defpackage.srp0;
import defpackage.t8j0;
import defpackage.t9b0;
import defpackage.tab0;
import defpackage.tb6;
import defpackage.tcb0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.ucb0;
import defpackage.udb0;
import defpackage.v0h;
import defpackage.v4r0;
import defpackage.v920;
import defpackage.vab0;
import defpackage.vcb0;
import defpackage.vdb0;
import defpackage.w4x0;
import defpackage.w511;
import defpackage.wcb0;
import defpackage.wdb0;
import defpackage.wlp;
import defpackage.ww90;
import defpackage.x4c;
import defpackage.x4x0;
import defpackage.xls0;
import defpackage.xv10;
import defpackage.yab0;
import defpackage.yfq0;
import defpackage.z2z;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final ecb0 B;
    public final com.ybsdk.feature.pfm.internal.data.a C;
    public final sb6 D;
    public final AppAnalyticsReporter E;
    public final w4x0 F;
    public final oy80 G;
    public final nw70 H;
    public final vab0 I;
    public final ebb0 J;
    public final xv10 K;
    public final xls0 L;
    public pzt0 M;
    public pzt0 N;

    public b(v920 v920Var, ecb0 ecb0Var, com.ybsdk.feature.pfm.internal.data.a aVar, sb6 sb6Var, AppAnalyticsReporter appAnalyticsReporter, w4x0 w4x0Var, oy80 oy80Var, nw70 nw70Var, vab0 vab0Var, ebb0 ebb0Var, xv10 xv10Var, xls0 xls0Var) {
        super(new t9b0(2, ecb0Var), v920Var);
        this.B = ecb0Var;
        this.C = aVar;
        this.D = sb6Var;
        this.E = appAnalyticsReporter;
        this.F = w4x0Var;
        this.G = oy80Var;
        this.H = nw70Var;
        this.I = vab0Var;
        this.J = ebb0Var;
        this.K = xv10Var;
        this.L = xls0Var;
        ((b3z) nw70Var.b).a(new mv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, new pdb0(this, 2), 18));
        a0(new qdb0(this, 1));
        tje.N(ds31.a(this), null, null, new PfmViewModel$loadTransactionsBottomSkeleton$1(this, null), 3);
        h0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(b bVar, ContinuationImpl continuationImpl) {
        PfmViewModel$loadPfmTransactionsRefresh$1 pfmViewModel$loadPfmTransactionsRefresh$1;
        int i;
        Object e0;
        Throwable a;
        r0 r0Var;
        Object value;
        bVar.getClass();
        if (continuationImpl instanceof PfmViewModel$loadPfmTransactionsRefresh$1) {
            pfmViewModel$loadPfmTransactionsRefresh$1 = (PfmViewModel$loadPfmTransactionsRefresh$1) continuationImpl;
            int i2 = pfmViewModel$loadPfmTransactionsRefresh$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pfmViewModel$loadPfmTransactionsRefresh$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pfmViewModel$loadPfmTransactionsRefresh$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pfmViewModel$loadPfmTransactionsRefresh$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pfmViewModel$loadPfmTransactionsRefresh$1.label = 1;
                    e0 = bVar.e0(null, pfmViewModel$loadPfmTransactionsRefresh$1);
                    if (e0 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    e0 = ((Result) obj).getValue();
                }
                if (!(e0 instanceof Result.Failure)) {
                    r9b0 r9b0Var = (r9b0) e0;
                    pz40 Y = bVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, wcb0.a((wcb0) value, new r8j0(r9b0Var, null, 14), EmptyList.a, null, d0(r9b0Var.b), null, null, null, null, 489)));
                    bVar.z0(r9b0Var);
                }
                a = Result.a(e0);
                if (a != null) {
                    bVar.Z(new vdb0(gao.e(null, null, a, 3)));
                }
                return zy11.a;
            }
        }
        pfmViewModel$loadPfmTransactionsRefresh$1 = new PfmViewModel$loadPfmTransactionsRefresh$1(bVar, continuationImpl);
        Object obj3 = pfmViewModel$loadPfmTransactionsRefresh$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pfmViewModel$loadPfmTransactionsRefresh$1.label;
        if (i != 0) {
        }
        if (!(e0 instanceof Result.Failure)) {
        }
        a = Result.a(e0);
        if (a != null) {
        }
        return zy11.a;
    }

    public static String d0(ppl pplVar) {
        jpl jplVar = (jpl) kotlin.collections.a.R(pplVar.a);
        kpl kplVar = jplVar != null ? jplVar.f : null;
        hdb0 hdb0Var = kplVar instanceof hdb0 ? (hdb0) kplVar : null;
        if (hdb0Var != null) {
            return hdb0Var.a;
        }
        return null;
    }

    public final void A0(boolean z) {
        r0 r0Var;
        Object value;
        wcb0 wcb0Var;
        u8j0 u8j0Var;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            wcb0Var = (wcb0) value;
            u8j0Var = wcb0Var.b;
            r8j0 r8j0Var = u8j0Var instanceof r8j0 ? (r8j0) u8j0Var : null;
            r8j0 d = r8j0Var != null ? r8j0.d(r8j0Var, null, z, false, 13) : null;
            if (d != null) {
                u8j0Var = d;
            }
        } while (!r0Var.k(value, wcb0.a(wcb0Var, u8j0Var, null, null, null, null, null, null, null, 509)));
    }

    public final void B0(s4r s4rVar) {
        pz40 Y = Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            s4r s4rVar2 = s4rVar;
            if (r0Var.k(value, wcb0.a((wcb0) value, null, null, null, null, null, null, s4rVar2, null, 383))) {
                return;
            } else {
                s4rVar = s4rVar2;
            }
        }
    }

    @Override // defpackage.yr31
    public final void V() {
        c0();
    }

    public final void c0() {
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.N = null;
        pzt0 pzt0Var2 = this.M;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.M = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(String str, ContinuationImpl continuationImpl) {
        PfmViewModel$getPfmFeedAndUpdateCommonData$1 pfmViewModel$getPfmFeedAndUpdateCommonData$1;
        int i;
        Object a;
        if (continuationImpl instanceof PfmViewModel$getPfmFeedAndUpdateCommonData$1) {
            pfmViewModel$getPfmFeedAndUpdateCommonData$1 = (PfmViewModel$getPfmFeedAndUpdateCommonData$1) continuationImpl;
            int i2 = pfmViewModel$getPfmFeedAndUpdateCommonData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pfmViewModel$getPfmFeedAndUpdateCommonData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pfmViewModel$getPfmFeedAndUpdateCommonData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pfmViewModel$getPfmFeedAndUpdateCommonData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Set set = ((wcb0) X()).g;
                    List list = ((wcb0) X()).i.a;
                    pfmViewModel$getPfmFeedAndUpdateCommonData$1.label = 1;
                    a = this.C.a(str, set, list, pfmViewModel$getPfmFeedAndUpdateCommonData$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    a0(new ww90(19, this, (r9b0) a));
                }
                return a;
            }
        }
        pfmViewModel$getPfmFeedAndUpdateCommonData$1 = new PfmViewModel$getPfmFeedAndUpdateCommonData$1(this, continuationImpl);
        Object obj2 = pfmViewModel$getPfmFeedAndUpdateCommonData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pfmViewModel$getPfmFeedAndUpdateCommonData$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        return a;
    }

    public final boolean f0() {
        return ((CommonFeatureFlag) ((bab0) this.B).a.d(wlp.i).getData()).isEnabled();
    }

    public final void g0(PfmTransactionsDataSkeletonType pfmTransactionsDataSkeletonType, List list, sls slsVar) {
        c0();
        pzt0 N = tje.N(ds31.a(this), null, null, new PfmViewModel$loadPfmTransactionsCustomFilters$1(this, pfmTransactionsDataSkeletonType, list, slsVar, null), 3);
        N.w(new qdb0(this, 0));
        this.M = N;
    }

    public final void h0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, wcb0.a((wcb0) value, new t8j0(), EmptyList.a, null, null, null, null, null, new yfq0(0), 249)));
        c0();
        this.M = tje.N(ds31.a(this), null, null, new PfmViewModel$loadPfmTransactionsInitial$2(this, null), 3);
    }

    public final void i0() {
        String str;
        r9b0 r9b0Var;
        wcb0 wcb0Var = (wcb0) X();
        r9b0 r9b0Var2 = (r9b0) wcb0Var.b.a();
        ppl pplVar = r9b0Var2 != null ? r9b0Var2.b : null;
        List list = wcb0Var.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof r8j0) {
                arrayList.add(obj);
            }
        }
        r8j0 r8j0Var = (r8j0) kotlin.collections.a.b0(arrayList);
        ppl pplVar2 = (r8j0Var == null || (r9b0Var = (r9b0) r8j0Var.a()) == null) ? null : r9b0Var.b;
        if ((pplVar2 == null || (str = pplVar2.b) == null) && (pplVar == null || (str = pplVar.b) == null || pplVar2 != null)) {
            str = null;
        }
        if (str != null) {
            if (((wcb0) X()).b.b()) {
                str = null;
            }
            if (str == null) {
                return;
            }
            a0(new dia0(24));
            c0();
            this.N = tje.N(ds31.a(this), null, null, new PfmViewModel$loadPfmTransactionsNextPage$2(this, str, null), 3);
        }
    }

    public final boolean j0(String str) {
        Set set = ((wcb0) X()).g;
        this.I.getClass();
        vcb0 b = vab0.b(str, set);
        if (b == null) {
            return false;
        }
        LinkedHashSet f = v4r0.f(((wcb0) X()).g, b);
        if (!jl40.l(((wcb0) X()).g, f)) {
            this.J.b(f);
        }
        a0(new ww90(17, b, f));
        return true;
    }

    public final void k0(tb6 tb6Var) {
        this.D.a(tb6Var.a, BottomBarItemId.HISTORY.getId(), BottomNavigationEvents$BottomNavigationClickButtonVersion.SCREEN_BUTTON);
        sh6 sh6Var = tb6Var.e;
        if (sh6Var instanceof lh6) {
            Z(udb0.a);
            return;
        }
        boolean z = sh6Var instanceof ph6;
        w4x0 w4x0Var = this.F;
        if (!z) {
            ((x4x0) w4x0Var).b(sh6Var);
        } else {
            this.E.Y.x(QrPaymentEvents$QrIconClickedSource.HISTORY);
            ((x4x0) w4x0Var).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0132 A[LOOP:0: B:32:0x0102->B:34:0x0132, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0(l9b0 l9b0Var) {
        boolean equals;
        boolean z;
        boolean z2;
        int i;
        yfq0 yfq0Var;
        pz40 Y;
        r0 r0Var;
        Object value;
        yfq0 yfq0Var2;
        boolean equals2;
        l9b0 l9b0Var2 = l9b0Var;
        ((AppAnalyticsReporter) this.K.a).R.a.a("pfm.analytics.category.click", g8e.w(1, "category_id", l9b0Var2.e));
        String str = l9b0Var2.c;
        String a = ((wcb0) X()).i.a();
        if (a == null ? false : str.equals(a)) {
            str = null;
        }
        String str2 = l9b0Var2.d;
        String str3 = str == null ? str2 : str;
        String a2 = ((wcb0) X()).i.a();
        if (a2 == null) {
            if (str3 == null) {
                equals = true;
            }
            equals = false;
        } else {
            if (str3 != null) {
                equals = a2.equals(str3);
            }
            equals = false;
        }
        if (equals) {
            return;
        }
        List list = ((wcb0) X()).i.a;
        lrp0 lrp0Var = lrp0.u;
        boolean z3 = str3 != null;
        if (str == null) {
            if (str3 == null) {
                if (str2 == null) {
                    equals2 = true;
                    if (equals2) {
                        z = true;
                    }
                }
                equals2 = false;
                if (equals2) {
                }
            } else {
                if (str2 != null) {
                    equals2 = str3.equals(str2);
                    if (equals2) {
                    }
                }
                equals2 = false;
                if (equals2) {
                }
            }
            if (str != null) {
                if (str3 == null ? false : str3.equals(str)) {
                    z2 = true;
                    if (!z3) {
                        list = EmptyList.a;
                    } else if (z) {
                        list = kotlin.collections.a.K(list);
                    } else if (!z2) {
                        x4c.h("PFM: can't build path on category click, used currentPath", new srp0[]{lrp0Var}, null, 12);
                    } else if (str2 == null) {
                        list = Collections.singletonList(new h9b0(str));
                    } else {
                        ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                i = -1;
                                break;
                            } else if (jl40.l(((h9b0) listIterator.previous()).a, str2)) {
                                i = listIterator.nextIndex();
                                break;
                            }
                        }
                        if (i == -1) {
                            x4c.h("PFM: can't build path for new selection, used currentPath", new srp0[]{lrp0Var}, null, 12);
                        } else {
                            list = kotlin.collections.a.o0(kotlin.collections.a.A0(list, i + 1), new h9b0(str));
                        }
                    }
                    yfq0Var = new yfq0(list);
                    Y = Y();
                    while (true) {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                        yfq0Var2 = yfq0Var;
                        if (r0Var.k(value, wcb0.a((wcb0) value, null, null, null, null, null, null, null, yfq0Var2, 255))) {
                            g0(PfmTransactionsDataSkeletonType.CATEGORY_CHANGED, list, new jo0(l9b0Var2, this, str3, a2, 29));
                            return;
                        } else {
                            l9b0Var2 = l9b0Var;
                            yfq0Var = yfq0Var2;
                        }
                    }
                }
            }
            z2 = false;
            if (!z3) {
            }
            yfq0Var = new yfq0(list);
            Y = Y();
            while (true) {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                yfq0Var2 = yfq0Var;
                if (r0Var.k(value, wcb0.a((wcb0) value, null, null, null, null, null, null, null, yfq0Var2, 255))) {
                }
                l9b0Var2 = l9b0Var;
                yfq0Var = yfq0Var2;
            }
        }
        z = false;
        if (str != null) {
        }
        z2 = false;
        if (!z3) {
        }
        yfq0Var = new yfq0(list);
        Y = Y();
        while (true) {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            yfq0Var2 = yfq0Var;
            if (r0Var.k(value, wcb0.a((wcb0) value, null, null, null, null, null, null, null, yfq0Var2, 255))) {
            }
            l9b0Var2 = l9b0Var;
            yfq0Var = yfq0Var2;
        }
    }

    public final boolean m0(Uri uri) {
        z2z c = ((b3z) this.H.b).c(uri.toString());
        return c.b || (c.a instanceof v0h);
    }

    public final void n0() {
        r0 r0Var;
        Object value;
        ((AppAnalyticsReporter) this.K.a).R.a.a("pfm.analytics.category_expanded_header.close_button.click", null);
        yfq0 yfq0Var = new yfq0(0);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, wcb0.a((wcb0) value, null, null, null, null, null, null, null, yfq0Var, 255)));
        g0(PfmTransactionsDataSkeletonType.CATEGORY_CHANGED, yfq0Var.a, new pdb0(this, 3));
    }

    public final void o0() {
        ((AppAnalyticsReporter) this.K.a).R.a.a("pfm.analytics.category_expanded_header.expansion_button.click", null);
    }

    public final void p0() {
        B0(null);
    }

    public final void q0(String str) {
        this.K.j(str, PfmDetailsButtonPfm.RESET);
        r0(str);
    }

    public final void r0(String str) {
        Set set = ((wcb0) X()).g;
        this.I.getClass();
        Set set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (jl40.l(((vcb0) it.next()).a(), str)) {
                    Set e = ((wcb0) X()).e();
                    if (e == null) {
                        e = EmptySet.a;
                    }
                    Set set3 = ((wcb0) X()).g;
                    String str2 = ((wcb0) X()).e;
                    boolean j0 = j0(str);
                    B0(null);
                    g0(PfmTransactionsDataSkeletonType.CUSTOM_FILTERS, ((wcb0) X()).i.a, new dpf(j0, this, str, e, set3, str2));
                    return;
                }
            }
        }
        B0(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cd, code lost:
    
        if (((defpackage.tcb0) r8).b == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        if (r14.c != null) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(String str) {
        String str2;
        Object scb0Var;
        Object ucb0Var;
        this.K.j(str, PfmDetailsButtonPfm.SAVE);
        s4r s4rVar = ((wcb0) X()).h;
        if (s4rVar == null) {
            return;
        }
        this.I.getClass();
        if (s4rVar instanceof r4r) {
            q4r q4rVar = ((r4r) s4rVar).c;
            if (q4rVar instanceof n4r) {
                ucb0Var = new tcb0(str, ((n4r) q4rVar).a);
            } else {
                if (!(q4rVar instanceof p4r)) {
                    w511.b();
                    return;
                }
                Set<o4r> set = ((p4r) q4rVar).a;
                ArrayList arrayList = new ArrayList();
                for (o4r o4rVar : set) {
                    tab0 tab0Var = new tab0(o4rVar.b);
                    if (!o4rVar.c) {
                        tab0Var = null;
                    }
                    String str3 = tab0Var != null ? tab0Var.a : null;
                    tab0 tab0Var2 = str3 != null ? new tab0(str3) : null;
                    if (tab0Var2 != null) {
                        arrayList.add(tab0Var2);
                    }
                }
                ucb0Var = new ucb0(str, kotlin.collections.a.N0(arrayList));
            }
            str2 = str;
            scb0Var = ucb0Var;
        } else {
            if (!(s4rVar instanceof l4r)) {
                w511.b();
                return;
            }
            l4r l4rVar = (l4r) s4rVar;
            Calendar calendar = l4rVar.f;
            Calendar calendar2 = l4rVar.g;
            Pair pair = (calendar == null || calendar2 == null) ? calendar != null ? new Pair(calendar, calendar) : calendar2 != null ? new Pair(calendar2, calendar2) : new Pair(null, null) : new Pair(calendar, calendar2);
            str2 = str;
            scb0Var = new scb0(str2, (Calendar) pair.getFirst(), (Calendar) pair.getSecond(), l4rVar.c, l4rVar.e);
        }
        boolean z = false;
        if (!(scb0Var instanceof tcb0)) {
            if (scb0Var instanceof ucb0) {
                z = ((ucb0) scb0Var).b.isEmpty();
            } else if (!(scb0Var instanceof scb0)) {
                w511.b();
                return;
            } else {
                scb0 scb0Var2 = (scb0) scb0Var;
                if (scb0Var2.b != null) {
                }
                z = true;
            }
            if (z) {
                r0(str2);
                return;
            }
            if (jl40.l(vab0.b(str2, ((wcb0) X()).g), scb0Var)) {
                B0(null);
                return;
            }
            Set e = ((wcb0) X()).e();
            if (e == null) {
                e = EmptySet.a;
            }
            Set set2 = ((wcb0) X()).g;
            String str4 = ((wcb0) X()).e;
            a0(new ww90(18, scb0Var, this));
            B0(null);
            g0(PfmTransactionsDataSkeletonType.CUSTOM_FILTERS, ((wcb0) X()).i.a, new npb(this, scb0Var, e, set2, str4, 3));
        }
    }

    public final void t0(gc5 gc5Var) {
        r0 r0Var;
        Object value;
        jpl jplVar = gc5Var instanceof jpl ? (jpl) gc5Var : null;
        Object obj = jplVar != null ? jplVar.f : null;
        hdb0 hdb0Var = obj instanceof hdb0 ? (hdb0) obj : null;
        if (hdb0Var == null) {
            return;
        }
        String str = hdb0Var.a;
        String str2 = ((wcb0) X()).e;
        if (str2 == null ? false : str2.equals(str)) {
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, wcb0.a((wcb0) value, null, null, null, str, null, null, null, null, 495)));
        Set e = ((wcb0) X()).e();
        if (e == null) {
            e = EmptySet.a;
        }
        this.K.l(e, ((wcb0) X()).g, ((wcb0) X()).c(), ((wcb0) X()).i.a(), ((wcb0) X()).e);
    }

    public final boolean u0() {
        r0 r0Var;
        Object value;
        int i = 0;
        if (((wcb0) X()).i.a.isEmpty()) {
            return false;
        }
        List K = kotlin.collections.a.K(((wcb0) X()).i.a);
        yfq0 yfq0Var = ((wcb0) X()).i;
        yfq0 yfq0Var2 = new yfq0(K);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, wcb0.a((wcb0) value, null, null, null, null, null, null, null, yfq0Var2, 255)));
        g0(PfmTransactionsDataSkeletonType.CATEGORY_CHANGED, K, new pdb0(this, i));
        return true;
    }

    public final void v0() {
        int i = wdb0.a[((wcb0) X()).d.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return;
            }
            w511.b();
            return;
        }
        u8j0 u8j0Var = (u8j0) kotlin.collections.a.b0(((wcb0) X()).c);
        if (u8j0Var == null || (u8j0Var instanceof r8j0)) {
            i0();
        }
    }

    public final void w0() {
        i0();
    }

    public final void x0(String str, Set set, Set set2, String str2) {
        Object obj;
        Set e = ((wcb0) X()).e();
        if (e == null) {
            e = EmptySet.a;
        }
        Set set3 = ((wcb0) X()).g;
        Set c = ((wcb0) X()).c();
        String a = ((wcb0) X()).i.a();
        String str3 = ((wcb0) X()).e;
        xv10 xv10Var = this.K;
        xv10Var.getClass();
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((j4r) obj).a.equals(str)) {
                    break;
                }
            }
        }
        j4r j4rVar = (j4r) obj;
        ((AppAnalyticsReporter) xv10Var.a).R.f(j4rVar != null ? xv10Var.q(j4rVar, set2, str2) : null, xv10Var.r(str3, e, set3), null, xv10.p(a, c));
    }

    public final void y0(String str) {
        this.D.c(str);
    }

    public final void z0(r9b0 r9b0Var) {
        String d0 = d0(r9b0Var.b);
        Set set = (Set) r9b0Var.e.get(d0 != null ? new rcb0(d0) : null);
        if (set == null) {
            set = EmptySet.a;
        }
        Set set2 = r9b0Var.c;
        Set set3 = ((wcb0) X()).g;
        String str = ((wcb0) X()).e;
        String a = ((wcb0) X()).i.a();
        xv10 xv10Var = this.K;
        l0p l0pVar = ((AppAnalyticsReporter) xv10Var.a).R;
        ArrayList r = xv10Var.r(str, set2, set3);
        ArrayList p = xv10.p(a, set);
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        ArrayList arrayList = new ArrayList(tcc.n(r, 10));
        Iterator it = r.iterator();
        while (it.hasNext()) {
            arrayList.add(((yab0) it.next()).a());
        }
        linkedHashMap.put("filters", arrayList);
        ArrayList arrayList2 = new ArrayList(tcc.n(p, 10));
        Iterator it2 = p.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((i9b0) it2.next()).a());
        }
        linkedHashMap.put("categories", arrayList2);
        l0pVar.a.a("pfm.analytics.shown", linkedHashMap);
    }
}
