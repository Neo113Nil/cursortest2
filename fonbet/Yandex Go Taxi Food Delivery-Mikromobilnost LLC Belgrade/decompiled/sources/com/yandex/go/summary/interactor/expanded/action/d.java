package com.yandex.go.summary.interactor.expanded.action;

import com.yandex.go.summary.analytics.SummaryAnalytics$RequirementRedirectSource;
import com.yandex.go.summary.analytics.SummaryAnalytics$RequirementTappedSource;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryAction;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandingState;
import com.yandex.go.summary.analytics.SummaryAnalytics$UnsupportedRequirementSource;
import com.yandex.go.summary.model.LastVisibleTariffCardItemOrigin;
import com.yandex.go.summary.ui.model.common.basetariffinfo.TariffOrderFlowUiState;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.adu;
import defpackage.aex0;
import defpackage.alj0;
import defpackage.aqj0;
import defpackage.ax8;
import defpackage.b8r;
import defpackage.bdu;
import defpackage.bdv0;
import defpackage.bex0;
import defpackage.blj0;
import defpackage.bux;
import defpackage.bx8;
import defpackage.bxi0;
import defpackage.c0h;
import defpackage.c4r0;
import defpackage.clj0;
import defpackage.cux;
import defpackage.cx8;
import defpackage.dcx0;
import defpackage.ddu;
import defpackage.dlj0;
import defpackage.dtz0;
import defpackage.dx8;
import defpackage.edu;
import defpackage.ejj0;
import defpackage.elj0;
import defpackage.evu0;
import defpackage.ex8;
import defpackage.f580;
import defpackage.fdv0;
import defpackage.flj0;
import defpackage.fnx0;
import defpackage.ftz0;
import defpackage.fx8;
import defpackage.g8e;
import defpackage.gdu;
import defpackage.ghp0;
import defpackage.glj0;
import defpackage.gmi;
import defpackage.gmw0;
import defpackage.gym;
import defpackage.hgb;
import defpackage.hlj0;
import defpackage.hxx;
import defpackage.iev0;
import defpackage.ijj0;
import defpackage.ilj0;
import defpackage.jcx0;
import defpackage.jl40;
import defpackage.jlj0;
import defpackage.jmw0;
import defpackage.jst;
import defpackage.klj0;
import defpackage.kmq0;
import defpackage.lb5;
import defpackage.llj0;
import defpackage.m950;
import defpackage.maj0;
import defpackage.mi31;
import defpackage.mlj0;
import defpackage.nlj0;
import defpackage.nu1;
import defpackage.ny61;
import defpackage.o3i;
import defpackage.ob5;
import defpackage.oep0;
import defpackage.oiv0;
import defpackage.olj0;
import defpackage.pep0;
import defpackage.pev0;
import defpackage.pex0;
import defpackage.plj0;
import defpackage.qib1;
import defpackage.qlj0;
import defpackage.qn40;
import defpackage.rdx0;
import defpackage.rkj0;
import defpackage.rlj0;
import defpackage.rn40;
import defpackage.s421;
import defpackage.sdx0;
import defpackage.sgx0;
import defpackage.skj0;
import defpackage.slj0;
import defpackage.t450;
import defpackage.tdx0;
import defpackage.tkj0;
import defpackage.tlj0;
import defpackage.udx0;
import defpackage.uio0;
import defpackage.ukj0;
import defpackage.ulj0;
import defpackage.v920;
import defpackage.vdx0;
import defpackage.vkj0;
import defpackage.vlj0;
import defpackage.w3i;
import defpackage.w511;
import defpackage.wcu;
import defpackage.wdx0;
import defpackage.wiq0;
import defpackage.wkj0;
import defpackage.wlj0;
import defpackage.wud;
import defpackage.xby;
import defpackage.xcu;
import defpackage.xdx0;
import defpackage.xkj0;
import defpackage.xlj0;
import defpackage.ycu;
import defpackage.ydx0;
import defpackage.yfx0;
import defpackage.yjj0;
import defpackage.ykj0;
import defpackage.yvf0;
import defpackage.zbx0;
import defpackage.zdx0;
import defpackage.zkj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.requirements.analytics.RequirementRemoveSource;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.summary.requirements.list.interactors.h0;
import ru.yandex.taxi.summary.requirements.list.models.RequirementType;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class d {
    public final ftz0 a;
    public final gdu b;
    public final com.yandex.go.summary.interactor.common.action.a c;
    public final c d;
    public final rn40 e;
    public final lb5 f;
    public final pev0 g;
    public final dcx0 h;
    public final v920 i;
    public final cux j;
    public final c0h k;

    public d(ftz0 ftz0Var, gdu gduVar, com.yandex.go.summary.interactor.common.action.a aVar, c cVar, rn40 rn40Var, lb5 lb5Var, pev0 pev0Var, dcx0 dcx0Var, v920 v920Var, cux cuxVar, c0h c0hVar) {
        this.a = ftz0Var;
        this.b = gduVar;
        this.c = aVar;
        this.d = cVar;
        this.e = rn40Var;
        this.f = lb5Var;
        this.g = pev0Var;
        this.h = dcx0Var;
        this.i = v920Var;
        this.j = cuxVar;
        this.k = c0hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0716, code lost:
    
        if (r7.a(defpackage.acx0.a, r4) == r5) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0701, code lost:
    
        if (r7.a(defpackage.ybx0.a, r4) == r5) goto L487;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bex0 bex0Var, oiv0 oiv0Var, ContinuationImpl continuationImpl) {
        TariffCardUiActionInteractor$handleAction$1 tariffCardUiActionInteractor$handleAction$1;
        int i;
        int i2;
        gmw0 gmw0Var;
        pex0 pex0Var;
        gmw0 gmw0Var2;
        List list;
        mi31 mi31Var;
        mi31 mi31Var2;
        Object value;
        bux buxVar;
        Object value2;
        ob5 ob5Var;
        Object obj;
        ob5 ob5Var2;
        mi31 mi31Var3;
        pex0 b;
        nu1 nu1Var;
        pex0 pex0Var2;
        pex0 b2;
        sgx0 sgx0Var;
        pex0 b3;
        nu1 nu1Var2;
        jmw0 jmw0Var;
        ejj0 p;
        mi31 mi31Var4;
        pex0 pex0Var3;
        jmw0 jmw0Var2;
        mi31 mi31Var5;
        pex0 pex0Var4;
        Object value3;
        ob5 ob5Var3;
        r0 r0Var;
        Object value4;
        if (continuationImpl instanceof TariffCardUiActionInteractor$handleAction$1) {
            tariffCardUiActionInteractor$handleAction$1 = (TariffCardUiActionInteractor$handleAction$1) continuationImpl;
            int i3 = tariffCardUiActionInteractor$handleAction$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tariffCardUiActionInteractor$handleAction$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = tariffCardUiActionInteractor$handleAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardUiActionInteractor$handleAction$1.label;
                pev0 pev0Var = this.g;
                lb5 lb5Var = this.f;
                Object obj3 = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj2);
                        i2 = 1;
                        if (bex0Var instanceof aex0) {
                            dtz0 dtz0Var = ((aex0) bex0Var).a;
                            tariffCardUiActionInteractor$handleAction$1.L$0 = null;
                            tariffCardUiActionInteractor$handleAction$1.L$1 = null;
                            tariffCardUiActionInteractor$handleAction$1.label = 1;
                            ftz0 ftz0Var = this.a;
                            ftz0Var.getClass();
                            if (!jl40.l(dtz0Var, dtz0.a)) {
                                w511.b();
                                return null;
                            }
                            Object a = ftz0Var.a.a(new fdv0(null), tariffCardUiActionInteractor$handleAction$1);
                            if (a != coroutineSingletons) {
                                return a;
                            }
                        } else if (bex0Var instanceof tdx0) {
                            edu eduVar = ((tdx0) bex0Var).a;
                            tariffCardUiActionInteractor$handleAction$1.L$0 = null;
                            tariffCardUiActionInteractor$handleAction$1.L$1 = null;
                            tariffCardUiActionInteractor$handleAction$1.label = 2;
                            gdu gduVar = this.b;
                            gduVar.getClass();
                            if (jl40.l(eduVar, wcu.a)) {
                                if (gduVar.a.c().b.size() > 1) {
                                    gduVar.f.d(qib1.d(gduVar.d));
                                    oiv0Var.h();
                                } else {
                                    bdv0 bdv0Var = gduVar.e;
                                    SummaryAnalytics$SummaryExpandingState summaryAnalytics$SummaryExpandingState = SummaryAnalytics$SummaryExpandingState.Expanded;
                                    bdv0Var.a.c(summaryAnalytics$SummaryExpandingState, bdv0Var.a(summaryAnalytics$SummaryExpandingState), SummaryAnalytics$SummaryAction.AddressSuggest);
                                    oiv0Var.j();
                                }
                            } else if (eduVar instanceof adu) {
                                String str = ((adu) eduVar).a;
                                if (str == null || evu0.J(str)) {
                                    oiv0Var.e("tariff_card_price");
                                } else {
                                    oiv0Var.k(str);
                                }
                            } else if (jl40.l(eduVar, bdu.a)) {
                                oiv0Var.e("tariff_card_price_details");
                            } else if (jl40.l(eduVar, ddu.a)) {
                                oiv0Var.d();
                            } else if (eduVar instanceof xcu) {
                                gduVar.b.a.emit(((xcu) eduVar).a, tariffCardUiActionInteractor$handleAction$1);
                            } else {
                                if (!(eduVar instanceof ycu)) {
                                    w511.b();
                                    return null;
                                }
                                jcx0 jcx0Var = gduVar.c;
                                boolean z = ((ycu) eduVar).a;
                                r0 r0Var2 = jcx0Var.a;
                                do {
                                    value3 = r0Var2.getValue();
                                    ((Boolean) value3).getClass();
                                } while (!r0Var2.k(value3, Boolean.valueOf(z)));
                            }
                            if (obj3 != coroutineSingletons) {
                                return obj3;
                            }
                        } else {
                            boolean z2 = bex0Var instanceof xdx0;
                            List list2 = EmptyList.a;
                            if (!z2) {
                                if (bex0Var instanceof wdx0) {
                                    qn40 qn40Var = ((wdx0) bex0Var).a;
                                    rn40 rn40Var = this.e;
                                    if (qn40Var == null) {
                                        rn40Var.getClass();
                                        w511.b();
                                        return null;
                                    }
                                    fnx0 n = ((k) rn40Var.a).n();
                                    if (n != null && (mi31Var3 = n.a) != null) {
                                        if (!mi31Var3.a.K0) {
                                            g8e.C("Not a multiclass", jst.e);
                                            return obj3;
                                        }
                                        boolean z3 = qn40Var.b;
                                        String str2 = qn40Var.a;
                                        boolean z4 = !z3;
                                        ((hgb) rn40Var.b.get()).a(mi31Var3, str2, mi31Var3.b, z4);
                                        rn40Var.c.a(str2, mi31Var3, z4);
                                        return obj3;
                                    }
                                } else if (bex0Var instanceof rdx0) {
                                    ob5Var = ((rdx0) bex0Var).a;
                                    if (ob5Var.d == TariffOrderFlowUiState.DELIVERY_FLOW && (ob5Var2 = (ob5) lb5Var.b.getValue()) != null && jl40.l(ob5Var2.b, ob5Var.b) && jl40.l(ob5Var2.a, ob5Var.a)) {
                                        i2 = 0;
                                    }
                                    if (i2 != 0) {
                                        obj = null;
                                        tariffCardUiActionInteractor$handleAction$1.L$0 = null;
                                        tariffCardUiActionInteractor$handleAction$1.L$1 = null;
                                        tariffCardUiActionInteractor$handleAction$1.L$2 = ob5Var;
                                        tariffCardUiActionInteractor$handleAction$1.I$0 = i2;
                                        tariffCardUiActionInteractor$handleAction$1.label = 4;
                                        break;
                                    }
                                    ob5Var3 = ob5Var;
                                    r0Var = lb5Var.a;
                                    do {
                                        value4 = r0Var.getValue();
                                    } while (!r0Var.k(value4, ob5Var3));
                                } else if (bex0Var instanceof zdx0) {
                                    kmq0 kmq0Var = ((zdx0) bex0Var).a;
                                    tariffCardUiActionInteractor$handleAction$1.L$0 = null;
                                    tariffCardUiActionInteractor$handleAction$1.L$1 = null;
                                    tariffCardUiActionInteractor$handleAction$1.label = 6;
                                    Object a2 = this.c.a(kmq0Var, oiv0Var, tariffCardUiActionInteractor$handleAction$1);
                                    if (a2 != coroutineSingletons) {
                                        return a2;
                                    }
                                } else if (bex0Var instanceof udx0) {
                                    boolean z5 = !((udx0) bex0Var).a;
                                    r0 r0Var3 = this.h.a;
                                    do {
                                        value2 = r0Var3.getValue();
                                        ((Boolean) value2).getClass();
                                    } while (!r0Var3.k(value2, Boolean.valueOf(z5)));
                                } else if (bex0Var instanceof vdx0) {
                                    vdx0 vdx0Var = (vdx0) bex0Var;
                                    ob5 ob5Var4 = vdx0Var.c;
                                    bux buxVar2 = new bux(ob5Var4, vdx0Var.a, vdx0Var.b ? LastVisibleTariffCardItemOrigin.USER : LastVisibleTariffCardItemOrigin.SYSTEM);
                                    r0 r0Var4 = this.j.a;
                                    do {
                                        value = r0Var4.getValue();
                                        buxVar = (bux) value;
                                    } while (!r0Var4.k(value, !jl40.l(buxVar.a, ob5Var4) ? buxVar2 : new bux(ob5Var4, Math.max(buxVar.b, buxVar2.b), buxVar2.c)));
                                } else if (bex0Var instanceof sdx0) {
                                    fx8 fx8Var = ((sdx0) bex0Var).a;
                                    tariffCardUiActionInteractor$handleAction$1.L$0 = null;
                                    tariffCardUiActionInteractor$handleAction$1.L$1 = null;
                                    tariffCardUiActionInteractor$handleAction$1.label = 7;
                                    v920 v920Var = this.i;
                                    x xVar = (x) v920Var.x;
                                    h0 h0Var = (h0) v920Var.w;
                                    wiq0 wiq0Var = (wiq0) v920Var.a;
                                    if (fx8Var instanceof bx8) {
                                        bx8 bx8Var = (bx8) fx8Var;
                                        String str3 = bx8Var.a;
                                        String str4 = bx8Var.b;
                                        int i4 = bx8Var.c;
                                        fnx0 n2 = ((k) wiq0Var).n();
                                        if (n2 != null && (mi31Var2 = n2.a) != null) {
                                            ((iev0) v920Var.y).a(str3, SummaryAnalytics$RequirementRedirectSource.Carousel, str4, new t450(i4), mi31Var2.f, mi31Var2.b, mi31Var2.g);
                                        }
                                        obj3 = h0Var.b(bx8Var.a, tariffCardUiActionInteractor$handleAction$1, false);
                                    } else if (fx8Var instanceof cx8) {
                                        cx8 cx8Var = (cx8) fx8Var;
                                        String str5 = cx8Var.a;
                                        String str6 = cx8Var.b;
                                        int i5 = cx8Var.d;
                                        fnx0 n3 = ((k) wiq0Var).n();
                                        if (n3 != null && (mi31Var = n3.a) != null) {
                                            ((iev0) v920Var.y).c(str5, str6, mi31Var.f, mi31Var.b, i5, mi31Var.g);
                                        }
                                        obj3 = h0Var.b(cx8Var.c, tariffCardUiActionInteractor$handleAction$1, false);
                                    } else if (fx8Var instanceof ex8) {
                                        fnx0 n4 = ((k) wiq0Var).n();
                                        mi31 mi31Var6 = n4 != null ? n4.a : null;
                                        ex8 ex8Var = (ex8) fx8Var;
                                        String str7 = ex8Var.a;
                                        boolean z6 = ex8Var.b;
                                        int i6 = ex8Var.c;
                                        if (mi31Var6 != null) {
                                            ((iev0) v920Var.y).b(str7, SummaryAnalytics$RequirementTappedSource.Carousel, z6, null, new t450(i6), mi31Var6.f, mi31Var6.b, mi31Var6.g);
                                        }
                                        obj3 = h0Var.b(ex8Var.a, tariffCardUiActionInteractor$handleAction$1, false);
                                    } else if (fx8Var instanceof dx8) {
                                        fnx0 n5 = ((k) wiq0Var).n();
                                        mi31 mi31Var7 = n5 != null ? n5.a : null;
                                        dx8 dx8Var = (dx8) fx8Var;
                                        String str8 = dx8Var.a;
                                        List list3 = dx8Var.b;
                                        String str9 = dx8Var.a;
                                        int i7 = dx8Var.c;
                                        if (mi31Var7 != null) {
                                            list = list3;
                                            ((iev0) v920Var.y).d(str9, SummaryAnalytics$UnsupportedRequirementSource.Carousel, list, new t450(i7), mi31Var7.f, mi31Var7.b, mi31Var7.g);
                                        } else {
                                            list = list3;
                                        }
                                        List<String> singletonList = Collections.singletonList("");
                                        if (!list.isEmpty()) {
                                            singletonList = list;
                                        }
                                        for (String str10 : singletonList) {
                                            ((f580) v920Var.b).e(str8, (str10 == null || evu0.J(str10)) ? list2 : Collections.singletonList(str10), RequirementRemoveSource.LIST, null);
                                            bxi0 bxi0Var = (bxi0) v920Var.c;
                                            String str11 = mi31Var7 != null ? mi31Var7.f : null;
                                            String str12 = mi31Var7 != null ? mi31Var7.b : null;
                                            if (str12 == null) {
                                                str12 = "";
                                            }
                                            ((yjj0) bxi0Var).a(str8, str10, str11, str12);
                                        }
                                    } else {
                                        if (!(fx8Var instanceof ax8)) {
                                            w511.b();
                                            return null;
                                        }
                                        ax8 ax8Var = (ax8) fx8Var;
                                        int i8 = ax8Var.c;
                                        boolean z7 = ax8Var.b;
                                        String str13 = ax8Var.a;
                                        k kVar = (k) wiq0Var;
                                        fnx0 n6 = kVar.n();
                                        if (n6 == null || (pex0Var = n6.c) == null) {
                                            gmw0Var = null;
                                        } else {
                                            List list4 = pex0Var.c;
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj4 : list4) {
                                                if (obj4 instanceof gmw0) {
                                                    arrayList.add(obj4);
                                                }
                                            }
                                            Iterator it = arrayList.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    gmw0Var2 = it.next();
                                                    if (jl40.l(((gmw0) gmw0Var2).c, str13)) {
                                                    }
                                                } else {
                                                    gmw0Var2 = 0;
                                                }
                                            }
                                            gmw0Var = gmw0Var2;
                                        }
                                        if (gmw0Var != null) {
                                            List c = xVar.c(gmw0Var);
                                            fnx0 n7 = kVar.n();
                                            mi31 mi31Var8 = n7 != null ? n7.a : null;
                                            ejj0 ejj0Var = z7 ? (ejj0) kotlin.collections.a.S(i8, c) : null;
                                            String str14 = ax8Var.a;
                                            String str15 = ejj0Var != null ? ejj0Var.a : null;
                                            boolean z8 = ax8Var.b;
                                            int i9 = ax8Var.d;
                                            if (mi31Var8 != null) {
                                                ((iev0) v920Var.y).b(str14, SummaryAnalytics$RequirementTappedSource.Carousel, z8, str15, new t450(i9), mi31Var8.f, mi31Var8.b, mi31Var8.g);
                                            }
                                            if (z7) {
                                                if (ejj0Var != null) {
                                                    xVar.a(gmw0Var, kotlin.collections.a.j0(c, ejj0Var));
                                                }
                                            } else if (mi31Var8 == null) {
                                                xby.l(jst.e, "Summary:Requirement:OptionSelection:Modal:Show", null, null, "Selected tariff is null", 6);
                                            } else {
                                                oiv0Var.t(mi31Var8, gmw0Var, c, i8);
                                            }
                                        }
                                    }
                                    if (obj3 != coroutineSingletons) {
                                        return obj3;
                                    }
                                } else {
                                    if (!(bex0Var instanceof ydx0)) {
                                        w511.b();
                                        return null;
                                    }
                                    ghp0 ghp0Var = ((ydx0) bex0Var).a;
                                    tariffCardUiActionInteractor$handleAction$1.L$0 = null;
                                    tariffCardUiActionInteractor$handleAction$1.L$1 = null;
                                    tariffCardUiActionInteractor$handleAction$1.label = 8;
                                    c0h c0hVar = this.k;
                                    c0hVar.getClass();
                                    if (!jl40.l(ghp0Var, ghp0.a)) {
                                        w511.b();
                                        return null;
                                    }
                                    Object a3 = c0hVar.a.a(zbx0.a, tariffCardUiActionInteractor$handleAction$1);
                                    if (a3 != coroutineSingletons) {
                                        return a3;
                                    }
                                }
                                return obj3;
                            }
                            xlj0 xlj0Var = ((xdx0) bex0Var).a;
                            tariffCardUiActionInteractor$handleAction$1.L$0 = null;
                            tariffCardUiActionInteractor$handleAction$1.L$1 = null;
                            tariffCardUiActionInteractor$handleAction$1.label = 3;
                            c cVar = this.d;
                            gmi gmiVar = cVar.s;
                            b8r b8rVar = cVar.f;
                            maj0 maj0Var = cVar.g;
                            w3i w3iVar = cVar.c;
                            c4r0 c4r0Var = cVar.e;
                            h0 h0Var2 = cVar.a;
                            if (xlj0Var instanceof ukj0) {
                                h0Var2.c(RequirementType.DRIVER_COMMENT);
                            } else if (xlj0Var instanceof xkj0) {
                                h0Var2.c(RequirementType.COST_CENTER);
                            } else if (xlj0Var instanceof glj0) {
                                h0Var2.c(RequirementType.EXTRA_PHONE_NUMBER);
                            } else if (xlj0Var instanceof ilj0) {
                                h0Var2.c(RequirementType.INTERCITY_CONTACT);
                            } else if (xlj0Var instanceof klj0) {
                                h0Var2.c(RequirementType.ORDER_DUE);
                            } else if (xlj0Var instanceof mlj0) {
                                h0Var2.c(RequirementType.ORDER_FOR_OTHER);
                            } else if (xlj0Var instanceof slj0) {
                                h0Var2.c(RequirementType.TRANSFER);
                            } else if (xlj0Var instanceof rlj0) {
                                h0Var2.c(RequirementType.TESTING_COMMANDS);
                            } else if (xlj0Var instanceof plj0) {
                                obj3 = h0Var2.b(((plj0) xlj0Var).a, tariffCardUiActionInteractor$handleAction$1, true);
                            } else if (xlj0Var instanceof wlj0) {
                                obj3 = h0Var2.b(((wlj0) xlj0Var).a, tariffCardUiActionInteractor$handleAction$1, true);
                            } else if (xlj0Var instanceof hlj0) {
                                h0Var2.d(RequirementType.EXTRA_PHONE_NUMBER);
                            } else if (xlj0Var instanceof jlj0) {
                                h0Var2.d(RequirementType.INTERCITY_CONTACT);
                            } else if (xlj0Var instanceof llj0) {
                                h0Var2.d(RequirementType.ORDER_DUE);
                            } else if (xlj0Var instanceof nlj0) {
                                h0Var2.d(RequirementType.ORDER_FOR_OTHER);
                            } else if (xlj0Var instanceof tlj0) {
                                h0Var2.d(RequirementType.TRANSFER);
                            } else if (xlj0Var instanceof ulj0) {
                                s421 s421Var = cVar.b;
                                ulj0 ulj0Var = (ulj0) xlj0Var;
                                String str16 = ulj0Var.a;
                                String str17 = ulj0Var.b;
                                s421Var.getClass();
                                if (!evu0.J(str17)) {
                                    list2 = Collections.singletonList(str17);
                                }
                                List list5 = list2;
                                fnx0 n8 = ((k) ((wiq0) s421Var.c)).n();
                                mi31 mi31Var9 = n8 != null ? n8.a : null;
                                if (mi31Var9 != null) {
                                    ((iev0) s421Var.x).d(str16, SummaryAnalytics$UnsupportedRequirementSource.Header, list5, null, mi31Var9.f, mi31Var9.b, mi31Var9.g);
                                }
                                ((f580) s421Var.w).e(str16, list5, RequirementRemoveSource.LIST, null);
                                bxi0 bxi0Var2 = (bxi0) s421Var.b;
                                String str18 = (n8 == null || (pex0Var4 = n8.c) == null) ? null : pex0Var4.b;
                                String str19 = n8 != null ? n8.d : null;
                                ((yjj0) bxi0Var2).a(str16, str17, str18, str19 != null ? str19 : "");
                            } else if (xlj0Var instanceof vkj0) {
                                vkj0 vkj0Var = (vkj0) xlj0Var;
                                String str20 = vkj0Var.a;
                                int i10 = vkj0Var.b;
                                jmw0 c2 = w3iVar.c(str20);
                                gmw0 gmw0Var3 = c2 instanceof gmw0 ? (gmw0) c2 : null;
                                if (gmw0Var3 != null) {
                                    ejj0 ejj0Var2 = (ejj0) kotlin.collections.a.S(i10, gmw0Var3.j.c);
                                    String str21 = ejj0Var2 != null ? ejj0Var2.a : null;
                                    if (str21 != null) {
                                        ((aqj0) w3iVar.w).a(str21);
                                    }
                                    fnx0 n9 = ((k) ((wiq0) w3iVar.z)).n();
                                    mi31 mi31Var10 = n9 != null ? n9.a : null;
                                    if (mi31Var10 == null) {
                                        xby.l(jst.e, "Summary:Requirement:OptionSelection:Modal:Show", null, null, "Selected tariff is null", 6);
                                    } else {
                                        List c3 = ((x) w3iVar.c).c(gmw0Var3);
                                        ejj0 ejj0Var3 = (ejj0) kotlin.collections.a.S(i10, c3);
                                        iev0 iev0Var = (iev0) w3iVar.B;
                                        String name = gmw0Var3.getName();
                                        String str22 = ejj0Var3 != null ? ejj0Var3.a : null;
                                        boolean z9 = ejj0Var3 != null;
                                        String str23 = mi31Var10.f;
                                        String str24 = mi31Var10.b;
                                        String str25 = mi31Var10.g;
                                        iev0Var.getClass();
                                        iev0Var.b(name, SummaryAnalytics$RequirementTappedSource.Glued, z9, str22, new t450(i10), str23, str24, str25);
                                        ((pep0) ((oep0) w3iVar.A)).f((m950) ((yvf0) w3iVar.b).get(), new wud(mi31Var10, gmw0Var3, c3, i10), hxx.a);
                                    }
                                }
                            } else if (xlj0Var instanceof wkj0) {
                                wkj0 wkj0Var = (wkj0) xlj0Var;
                                String str26 = wkj0Var.a;
                                int i11 = wkj0Var.b;
                                x xVar2 = (x) w3iVar.c;
                                jmw0 c4 = w3iVar.c(str26);
                                if (c4 != null) {
                                    ejj0 ejj0Var4 = (ejj0) kotlin.collections.a.S(i11, c4.s().c);
                                    String str27 = ejj0Var4 != null ? ejj0Var4.a : null;
                                    if (str27 != null) {
                                        ((aqj0) w3iVar.w).a(str27);
                                    }
                                    ArrayList arrayList2 = new ArrayList(xVar2.c(c4));
                                    if (((ejj0) kotlin.collections.a.S(i11, arrayList2)) != null) {
                                        ejj0 ejj0Var5 = (ejj0) arrayList2.remove(i11);
                                        xVar2.a(c4, arrayList2);
                                        ((f580) w3iVar.y).e(c4.getName(), Collections.singletonList(ejj0Var5.a), RequirementRemoveSource.LIST, null);
                                        fnx0 n10 = ((k) ((wiq0) w3iVar.z)).n();
                                        if (n10 != null && (mi31Var5 = n10.a) != null) {
                                            iev0 iev0Var2 = (iev0) w3iVar.B;
                                            String name2 = c4.getName();
                                            String str28 = ejj0Var5.a;
                                            String str29 = mi31Var5.f;
                                            String str30 = mi31Var5.b;
                                            String str31 = mi31Var5.g;
                                            iev0Var2.getClass();
                                            iev0Var2.b(name2, SummaryAnalytics$RequirementTappedSource.Glued, true, str28, new t450(i11), str29, str30, str31);
                                        }
                                    }
                                }
                            } else if (xlj0Var instanceof vlj0) {
                                uio0 uio0Var = cVar.d;
                                vlj0 vlj0Var = (vlj0) xlj0Var;
                                String str32 = vlj0Var.a;
                                String str33 = vlj0Var.b;
                                boolean z10 = vlj0Var.c;
                                boolean z11 = !z10;
                                x xVar3 = (x) uio0Var.c;
                                k kVar2 = (k) ((wiq0) uio0Var.d);
                                fnx0 n11 = kVar2.n();
                                if (n11 == null || (pex0Var3 = n11.c) == null) {
                                    jmw0Var = null;
                                } else {
                                    ((yfx0) uio0Var.a).getClass();
                                    Iterator it2 = yfx0.a(pex0Var3).iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            jmw0Var2 = it2.next();
                                            if (jl40.l(((jmw0) jmw0Var2).getName(), str32)) {
                                            }
                                        } else {
                                            jmw0Var2 = 0;
                                        }
                                    }
                                    jmw0Var = jmw0Var2;
                                }
                                if (jmw0Var != null && (p = jmw0Var.p(str33)) != null) {
                                    List<ejj0> c5 = xVar3.c(jmw0Var);
                                    ArrayList arrayList3 = new ArrayList();
                                    for (ejj0 ejj0Var6 : c5) {
                                        String str34 = jl40.l(ejj0Var6.a, str33) ? null : ejj0Var6.a;
                                        if (str34 != null) {
                                            arrayList3.add(str34);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(arrayList3);
                                    if (!z10) {
                                        arrayList4.add(str33);
                                    }
                                    ((ijj0) uio0Var.e).getClass();
                                    xVar3.a(jmw0Var, ijj0.c(arrayList4, jmw0Var, false));
                                    fnx0 n12 = kVar2.n();
                                    if (n12 != null && (mi31Var4 = n12.a) != null) {
                                        int indexOf = jmw0Var.s().c.indexOf(p);
                                        iev0 iev0Var3 = (iev0) uio0Var.f;
                                        String name3 = jmw0Var.getName();
                                        String str35 = p.a;
                                        String str36 = mi31Var4.f;
                                        String str37 = mi31Var4.b;
                                        String str38 = mi31Var4.g;
                                        iev0Var3.getClass();
                                        iev0Var3.b(name3, SummaryAnalytics$RequirementTappedSource.Glued, z10, str35, new t450(indexOf), str36, str37, str38);
                                    }
                                    ((gym) uio0Var.b).e(str32, str33, z11);
                                }
                            } else if (xlj0Var instanceof qlj0) {
                                oiv0Var.f(((qlj0) xlj0Var).a);
                            } else if (xlj0Var instanceof ykj0) {
                                oiv0Var.l(((ykj0) xlj0Var).a);
                            } else if (xlj0Var instanceof rkj0) {
                                rkj0 rkj0Var = (rkj0) xlj0Var;
                                String str39 = rkj0Var.c;
                                mi31 d = b8r.d(b8rVar, rkj0Var.a, str39, 4);
                                if (d != null && (b3 = d.a.b()) != null) {
                                    Iterator it3 = ru.yandex.taxi.tariffs.model.b.b(b3).iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            ?? next = it3.next();
                                            if (jl40.l(((nu1) next).b, rkj0Var.b)) {
                                                nu1Var2 = next;
                                            }
                                        } else {
                                            nu1Var2 = null;
                                        }
                                    }
                                    nu1 nu1Var3 = nu1Var2;
                                    if (nu1Var3 != null) {
                                        c4r0Var.d(SelectionOrigin.USER, nu1Var3.a.J0, str39, true);
                                    }
                                }
                            } else if (xlj0Var instanceof skj0) {
                                skj0 skj0Var = (skj0) xlj0Var;
                                String str40 = skj0Var.c;
                                String str41 = skj0Var.b;
                                maj0Var.a(str41);
                                mi31 d2 = b8r.d(b8rVar, str41, str40, 4);
                                if (d2 != null && (pex0Var2 = d2.a) != null && (b2 = pex0Var2.b()) != null && (sgx0Var = b2.J0) != null) {
                                    c4r0Var.d(SelectionOrigin.USER, sgx0Var, str40, true);
                                }
                                oiv0Var.f(skj0Var.a);
                            } else if (xlj0Var instanceof tkj0) {
                                tkj0 tkj0Var = (tkj0) xlj0Var;
                                String str42 = tkj0Var.d;
                                mi31 d3 = b8r.d(b8rVar, tkj0Var.a, str42, 4);
                                if (d3 != null && (b = d3.a.b()) != null) {
                                    Iterator it4 = ru.yandex.taxi.tariffs.model.b.b(b).iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            ?? next2 = it4.next();
                                            if (jl40.l(((nu1) next2).b, tkj0Var.b)) {
                                                nu1Var = next2;
                                            }
                                        } else {
                                            nu1Var = null;
                                        }
                                    }
                                    nu1 nu1Var4 = nu1Var;
                                    if (nu1Var4 != null) {
                                        maj0Var.a(tkj0Var.c);
                                        c4r0Var.d(SelectionOrigin.USER, nu1Var4.a.J0, str42, true);
                                    }
                                }
                            } else if (xlj0Var instanceof alj0) {
                                obj3 = cVar.a((alj0) xlj0Var, oiv0Var, tariffCardUiActionInteractor$handleAction$1);
                            } else if (xlj0Var instanceof olj0) {
                                cVar.m.a();
                                boolean z12 = ((olj0) xlj0Var).a;
                                cVar.l.a(!z12);
                                if (!z12) {
                                    oiv0Var.n();
                                }
                            } else if (xlj0Var instanceof blj0) {
                                oiv0Var.z();
                            } else if (xlj0Var instanceof clj0) {
                                cVar.n.a(!((clj0) xlj0Var).a);
                                ((j) cVar.o.a).d("Summary.Requirements.PaidInsuranceTapped").m();
                            } else if (xlj0Var instanceof flj0) {
                                ((flj0) xlj0Var).a.invoke();
                            } else if (xlj0Var instanceof zkj0) {
                                zkj0 zkj0Var = (zkj0) xlj0Var;
                                boolean z13 = !zkj0Var.a;
                                o3i o3iVar = cVar.p;
                                Boolean valueOf = Boolean.valueOf(z13);
                                r0 r0Var5 = o3iVar.a;
                                r0Var5.getClass();
                                r0Var5.m(null, valueOf);
                                cVar.q.c(zkj0Var.b, z13);
                            } else if (xlj0Var instanceof dlj0) {
                                gmiVar.b(((dlj0) xlj0Var).a);
                                oiv0Var.u();
                            } else {
                                if (!(xlj0Var instanceof elj0)) {
                                    w511.b();
                                    return null;
                                }
                                elj0 elj0Var = (elj0) xlj0Var;
                                String str43 = elj0Var.a;
                                int i12 = elj0Var.b;
                                i d4 = ((j) gmiVar.a).d("DeliveryCargoHour.TimeCard.ResetButton.Tapped");
                                d4.a.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str43);
                                d4.b(i12, "selected_time_option");
                                d4.m();
                                cVar.r.a.l(null);
                            }
                            if (obj3 != coroutineSingletons) {
                                return obj3;
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        kotlin.b.b(obj2);
                        return obj2;
                    case 4:
                        int i13 = tariffCardUiActionInteractor$handleAction$1.I$0;
                        ob5 ob5Var5 = (ob5) tariffCardUiActionInteractor$handleAction$1.L$2;
                        kotlin.b.b(obj2);
                        i2 = i13;
                        ob5Var = ob5Var5;
                        obj = null;
                        tariffCardUiActionInteractor$handleAction$1.L$0 = obj;
                        tariffCardUiActionInteractor$handleAction$1.L$1 = obj;
                        tariffCardUiActionInteractor$handleAction$1.L$2 = ob5Var;
                        tariffCardUiActionInteractor$handleAction$1.I$0 = i2;
                        tariffCardUiActionInteractor$handleAction$1.label = 5;
                        break;
                    case 5:
                        ob5Var = (ob5) tariffCardUiActionInteractor$handleAction$1.L$2;
                        kotlin.b.b(obj2);
                        ob5Var3 = ob5Var;
                        r0Var = lb5Var.a;
                        do {
                            value4 = r0Var.getValue();
                        } while (!r0Var.k(value4, ob5Var3));
                        return obj3;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        tariffCardUiActionInteractor$handleAction$1 = new TariffCardUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj22 = tariffCardUiActionInteractor$handleAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardUiActionInteractor$handleAction$1.label;
        pev0 pev0Var2 = this.g;
        lb5 lb5Var2 = this.f;
        Object obj32 = zy11.a;
        switch (i) {
        }
    }
}
