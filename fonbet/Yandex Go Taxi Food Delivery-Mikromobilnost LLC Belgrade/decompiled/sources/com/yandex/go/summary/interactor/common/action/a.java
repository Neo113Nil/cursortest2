package com.yandex.go.summary.interactor.common.action;

import com.yandex.go.taxi.analytics.HubOpenReason;
import com.yandex.go.taxi.experiments.i;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.summary.api.model.MobilityHubSourceAction;
import com.yandex.go.taxi.summary.api.model.MobilityHubSourceType;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a2v;
import defpackage.ag31;
import defpackage.biv0;
import defpackage.by1;
import defpackage.c4r0;
import defpackage.c5b1;
import defpackage.cjw0;
import defpackage.ck31;
import defpackage.cne0;
import defpackage.cy1;
import defpackage.dy1;
import defpackage.ej31;
import defpackage.emq0;
import defpackage.ey1;
import defpackage.fmq0;
import defpackage.fnx0;
import defpackage.fy1;
import defpackage.gdv0;
import defpackage.gg31;
import defpackage.gid0;
import defpackage.gmq0;
import defpackage.hmq0;
import defpackage.im4;
import defpackage.imq0;
import defpackage.iuz0;
import defpackage.j2d0;
import defpackage.jjj0;
import defpackage.jk20;
import defpackage.jl40;
import defpackage.jmq0;
import defpackage.jsa1;
import defpackage.juz0;
import defpackage.kb5;
import defpackage.kmq0;
import defpackage.kuz0;
import defpackage.lmq0;
import defpackage.luz0;
import defpackage.muz0;
import defpackage.nex0;
import defpackage.nuz0;
import defpackage.nv20;
import defpackage.ny61;
import defpackage.ob5;
import defpackage.oiv0;
import defpackage.ojc;
import defpackage.ouz0;
import defpackage.p8f;
import defpackage.pev0;
import defpackage.pl2;
import defpackage.puz0;
import defpackage.pvz0;
import defpackage.py1;
import defpackage.qht0;
import defpackage.qnx0;
import defpackage.rft0;
import defpackage.sgx0;
import defpackage.t49;
import defpackage.teq0;
import defpackage.u0h;
import defpackage.u49;
import defpackage.ur40;
import defpackage.uy1;
import defpackage.vmd0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wu1;
import defpackage.xj31;
import defpackage.yu1;
import defpackage.yx00;
import defpackage.za31;
import defpackage.zo40;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.summary.selector.analytics.VerticalSelectorAnalytics$SelectionChangeReason;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.tooltips.repository.b;

/* loaded from: classes14.dex */
public final class a {
    public final ck31 a;
    public final ag31 b;
    public final c4r0 c;
    public final wiq0 d;
    public final teq0 e;
    public final fy1 f;
    public final rft0 g;
    public final pev0 h;
    public final biv0 i;
    public final cjw0 j;
    public final jk20 k;
    public final gg31 l;
    public final i m;
    public final im4 n;
    public final nv20 o;

    public a(ck31 ck31Var, ag31 ag31Var, c4r0 c4r0Var, wiq0 wiq0Var, teq0 teq0Var, fy1 fy1Var, rft0 rft0Var, pev0 pev0Var, biv0 biv0Var, cjw0 cjw0Var, jk20 jk20Var, gg31 gg31Var, i iVar, im4 im4Var, nv20 nv20Var) {
        this.a = ck31Var;
        this.b = ag31Var;
        this.c = c4r0Var;
        this.d = wiq0Var;
        this.e = teq0Var;
        this.f = fy1Var;
        this.g = rft0Var;
        this.h = pev0Var;
        this.i = biv0Var;
        this.j = cjw0Var;
        this.k = jk20Var;
        this.l = gg31Var;
        this.m = iVar;
        this.n = im4Var;
        this.o = nv20Var;
    }

    public final Object a(kmq0 kmq0Var, oiv0 oiv0Var, ContinuationImpl continuationImpl) {
        if (kmq0Var instanceof emq0) {
            return b((emq0) kmq0Var, oiv0Var, continuationImpl);
        }
        if (kmq0Var instanceof imq0) {
            c(((imq0) kmq0Var).a, VerticalSelectorAnalytics$SelectionChangeReason.Tap);
        } else if (kmq0Var instanceof jmq0) {
            c(((jmq0) kmq0Var).a, VerticalSelectorAnalytics$SelectionChangeReason.Swipe);
        } else if (kmq0Var instanceof fmq0) {
            puz0 puz0Var = ((fmq0) kmq0Var).a;
            cjw0 cjw0Var = this.j;
            t49 t49Var = (t49) cjw0Var.b;
            if (jl40.l(puz0Var, juz0.a)) {
                ((cne0) ((u49) t49Var).a.b).u("ru.yandex.taxi.cashback.onboarding.CASHBACK_PAYMENT_AVAILABLE_SHOWED", true);
            } else if (jl40.l(puz0Var, luz0.a)) {
                ((cne0) ((u49) t49Var).a.b).u("ru.yandex.taxi.cashback.onboarding.CASHBACK_FOR_TRIP_SHOWED", true);
            } else if (puz0Var instanceof ouz0) {
                ((nex0) cjw0Var.c).d(((ouz0) puz0Var).a);
            } else if (puz0Var instanceof nuz0) {
                nuz0 nuz0Var = (nuz0) puz0Var;
                ((b) cjw0Var.a).b(new pvz0(nuz0Var.a, nuz0Var.b, nuz0Var.c, nuz0Var.d));
            } else if (jl40.l(puz0Var, iuz0.a)) {
                oiv0Var.v();
            } else if (jl40.l(puz0Var, muz0.a)) {
                oiv0Var.a();
            } else {
                if (!jl40.l(puz0Var, kuz0.a)) {
                    w511.b();
                    return null;
                }
                oiv0Var.c();
            }
        } else {
            boolean z = kmq0Var instanceof gmq0;
            im4 im4Var = this.n;
            if (z) {
                im4Var.a(((gmq0) kmq0Var).a);
            } else {
                if (!(kmq0Var instanceof hmq0)) {
                    w511.b();
                    return null;
                }
                im4Var.b(((hmq0) kmq0Var).a);
            }
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:
    
        if (r11 == r1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(emq0 emq0Var, oiv0 oiv0Var, ContinuationImpl continuationImpl) {
        SelectorUiActionInteractor$processTariffCellClicked$1 selectorUiActionInteractor$processTariffCellClicked$1;
        int i;
        kb5 kb5Var;
        if (continuationImpl instanceof SelectorUiActionInteractor$processTariffCellClicked$1) {
            selectorUiActionInteractor$processTariffCellClicked$1 = (SelectorUiActionInteractor$processTariffCellClicked$1) continuationImpl;
            int i2 = selectorUiActionInteractor$processTariffCellClicked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectorUiActionInteractor$processTariffCellClicked$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectorUiActionInteractor$processTariffCellClicked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorUiActionInteractor$processTariffCellClicked$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ej31 ej31Var = emq0Var.a;
                    ob5 ob5Var = ej31Var.a;
                    fnx0 n = ((k) this.d).n();
                    ob5 d = (n == null || (kb5Var = n.e) == null) ? null : c5b1.d(kb5Var);
                    ob5 ob5Var2 = (jl40.l(ob5Var.b, d != null ? d.b : null) && jl40.l(ob5Var.a, d.a)) ? ob5Var : null;
                    wu1 wu1Var = ob5Var2 != null ? ob5Var2.c : null;
                    if (wu1Var instanceof p8f) {
                        oiv0Var.s();
                    } else {
                        if (!(wu1Var instanceof u0h)) {
                            if (wu1Var instanceof yx00) {
                                selectorUiActionInteractor$processTariffCellClicked$1.L$0 = null;
                                selectorUiActionInteractor$processTariffCellClicked$1.L$1 = null;
                                selectorUiActionInteractor$processTariffCellClicked$1.L$2 = null;
                                selectorUiActionInteractor$processTariffCellClicked$1.L$3 = null;
                                selectorUiActionInteractor$processTariffCellClicked$1.L$4 = null;
                                selectorUiActionInteractor$processTariffCellClicked$1.L$5 = oiv0Var;
                                selectorUiActionInteractor$processTariffCellClicked$1.label = 1;
                                obj = this.m.a(selectorUiActionInteractor$processTariffCellClicked$1);
                            } else {
                                if (!(wu1Var instanceof yu1) && !(wu1Var instanceof py1) && !(wu1Var instanceof uy1) && !(wu1Var instanceof pl2) && !(wu1Var instanceof ojc) && !(wu1Var instanceof zo40) && !(wu1Var instanceof ur40) && !(wu1Var instanceof gid0) && !(wu1Var instanceof vmd0) && !(wu1Var instanceof j2d0) && !(wu1Var instanceof jjj0) && !(wu1Var instanceof qnx0) && wu1Var != null) {
                                    w511.b();
                                    return null;
                                }
                                sgx0 sgx0Var = new sgx0(ob5Var.b, ej31Var.b);
                                if (ej31Var.c) {
                                    gdv0 gdv0Var = new gdv0(SummaryExpandReason.SELECTOR_TAP);
                                    selectorUiActionInteractor$processTariffCellClicked$1.L$0 = null;
                                    selectorUiActionInteractor$processTariffCellClicked$1.L$1 = null;
                                    selectorUiActionInteractor$processTariffCellClicked$1.L$2 = null;
                                    selectorUiActionInteractor$processTariffCellClicked$1.L$3 = null;
                                    selectorUiActionInteractor$processTariffCellClicked$1.L$4 = null;
                                    selectorUiActionInteractor$processTariffCellClicked$1.L$5 = null;
                                    selectorUiActionInteractor$processTariffCellClicked$1.label = 2;
                                    Object a = this.h.a(gdv0Var, selectorUiActionInteractor$processTariffCellClicked$1);
                                    if (a != coroutineSingletons) {
                                        return a;
                                    }
                                } else {
                                    this.c.d(SelectionOrigin.USER, sgx0Var, ob5Var.a, true);
                                }
                            }
                            return coroutineSingletons;
                        }
                        oiv0Var.k(((u0h) wu1Var).b);
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                oiv0Var = (oiv0) selectorUiActionInteractor$processTariffCellClicked$1.L$5;
                kotlin.b.b(obj);
                oiv0Var.k((String) obj);
                return zy11.a;
            }
        }
        selectorUiActionInteractor$processTariffCellClicked$1 = new SelectorUiActionInteractor$processTariffCellClicked$1(this, continuationImpl);
        Object obj2 = selectorUiActionInteractor$processTariffCellClicked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorUiActionInteractor$processTariffCellClicked$1.label;
        if (i != 0) {
        }
        oiv0Var.k((String) obj2);
        return zy11.a;
    }

    public final void c(xj31 xj31Var, VerticalSelectorAnalytics$SelectionChangeReason verticalSelectorAnalytics$SelectionChangeReason) {
        Object obj;
        Object obj2;
        Object obj3;
        if (xj31Var.isSelected()) {
            return;
        }
        String id = xj31Var.getId();
        k kVar = (k) this.a;
        Iterator it = kVar.j().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((za31) obj).d, id)) {
                    break;
                }
            }
        }
        za31 za31Var = (za31) obj;
        String str = za31Var != null ? za31Var.a.d : null;
        if (str == null) {
            str = "";
        }
        Iterator it2 = kVar.j().a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (jl40.l(((za31) obj2).d, kVar.h())) {
                    break;
                }
            }
        }
        za31 za31Var2 = (za31) obj2;
        String str2 = za31Var2 != null ? za31Var2.a.d : null;
        this.b.a(id, str, kVar.h(), str2 == null ? "" : str2, verticalSelectorAnalytics$SelectionChangeReason);
        jsa1 a = this.f.a(xj31Var.getId());
        boolean z = a instanceof ey1;
        biv0 biv0Var = this.i;
        rft0 rft0Var = this.g;
        if (z) {
            d(verticalSelectorAnalytics$SelectionChangeReason);
            ey1 ey1Var = new ey1(null, xj31Var.getId());
            ((qht0) rft0Var).d(ey1Var, biv0Var.a(), ey1Var.g(), null);
            return;
        }
        if (a instanceof dy1) {
            ((qht0) rft0Var).d(a, biv0Var.a(), a.g(), null);
            return;
        }
        if (a instanceof by1) {
            ((qht0) rft0Var).d(a, biv0Var.a(), a.g(), null);
            return;
        }
        if (!(a instanceof cy1)) {
            if (a == null) {
                this.e.a(SelectionOrigin.USER, xj31Var.getId());
                return;
            } else {
                w511.b();
                return;
            }
        }
        d(verticalSelectorAnalytics$SelectionChangeReason);
        String id2 = xj31Var.getId();
        String h = kVar.h();
        Iterator it3 = kVar.j().a.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            } else {
                obj3 = it3.next();
                if (jl40.l(((za31) obj3).d, h)) {
                    break;
                }
            }
        }
        this.k.getClass();
        MobilityHubSourceAction a2 = jk20.a((za31) obj3);
        this.l.getClass();
        MobilityHubSourceType a3 = gg31.a(id2);
        ((qht0) rft0Var).d(a, biv0Var.a(), a.g(), (a2 == null && a3 == null) ? null : new a2v(a2, a3));
    }

    public final void d(VerticalSelectorAnalytics$SelectionChangeReason verticalSelectorAnalytics$SelectionChangeReason) {
        HubOpenReason hubOpenReason;
        int i = lmq0.a[verticalSelectorAnalytics$SelectionChangeReason.ordinal()];
        if (i == 1) {
            hubOpenReason = HubOpenReason.TAP;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            hubOpenReason = HubOpenReason.SWIPE;
        }
        this.o.a(hubOpenReason);
    }
}
