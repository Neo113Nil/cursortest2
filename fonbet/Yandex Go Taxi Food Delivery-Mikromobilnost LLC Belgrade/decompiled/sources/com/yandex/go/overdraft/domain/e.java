package com.yandex.go.overdraft.domain;

import android.content.Context;
import com.yandex.go.overdraft.data.model.ActionButton;
import com.yandex.go.overdraft.data.model.ActionButtonPrerequisite;
import com.yandex.go.overdraft.data.model.ButtonActionType;
import com.yandex.go.overdraft.data.model.DebtFlow;
import com.yandex.go.overdraft.data.model.DebtInfo;
import com.yandex.go.overdraft.data.model.PaymentState;
import com.yandex.go.overdraft.data.model.PlusPoints;
import com.yandex.go.overdraft.data.model.Ride;
import com.yandex.go.overdraft.data.model.TapAction$PayDebtAction;
import com.yandex.go.overdraft.data.model.TextItem;
import com.yandex.go.overdraft.data.model.s0;
import com.yandex.go.overdraft.data.model.t0;
import defpackage.aid0;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.cba0;
import defpackage.ds;
import defpackage.eq51;
import defpackage.er31;
import defpackage.es;
import defpackage.fef;
import defpackage.gs;
import defpackage.gug;
import defpackage.gwk0;
import defpackage.hs;
import defpackage.hug;
import defpackage.ief;
import defpackage.is;
import defpackage.jfa0;
import defpackage.jl40;
import defpackage.jug;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.lea0;
import defpackage.mt;
import defpackage.mug;
import defpackage.ny61;
import defpackage.o0a0;
import defpackage.pdc;
import defpackage.pl21;
import defpackage.sea0;
import defpackage.stg;
import defpackage.t0a0;
import defpackage.tcc;
import defpackage.ttg;
import defpackage.ufu;
import defpackage.uv51;
import defpackage.wn8;
import defpackage.wqk0;
import defpackage.xdf;
import defpackage.xn8;
import defpackage.xng0;
import defpackage.xxc;
import defpackage.yy51;
import defpackage.zuj0;
import defpackage.zv51;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class e {
    public final zuj0 a;
    public final Context b;
    public final pdc c;
    public final cba0 d;
    public final xdf e;
    public final a f;
    public final eq51 g;
    public final sea0 h;
    public final com.yandex.go.payments.common.a i;

    public e(zuj0 zuj0Var, Context context, pdc pdcVar, cba0 cba0Var, xdf xdfVar, a aVar, eq51 eq51Var, sea0 sea0Var, com.yandex.go.payments.common.a aVar2) {
        this.a = zuj0Var;
        this.b = context;
        this.c = pdcVar;
        this.d = cba0Var;
        this.e = xdfVar;
        this.f = aVar;
        this.g = eq51Var;
        this.h = sea0Var;
        this.i = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00bd -> B:10:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mug mugVar, lea0 lea0Var, uv51 uv51Var, ContinuationImpl continuationImpl) {
        DebtViewModelConverter$convertActionButtons$1 debtViewModelConverter$convertActionButtons$1;
        int i;
        mug mugVar2;
        DebtInfo debtInfo;
        Iterator it;
        ArrayList arrayList;
        uv51 uv51Var2;
        DebtViewModelConverter$convertActionButtons$1 debtViewModelConverter$convertActionButtons$12;
        lea0 lea0Var2;
        ActionButtonPrerequisite actionButtonPrerequisite;
        er31 hugVar;
        ds dsVar;
        if (continuationImpl instanceof DebtViewModelConverter$convertActionButtons$1) {
            debtViewModelConverter$convertActionButtons$1 = (DebtViewModelConverter$convertActionButtons$1) continuationImpl;
            int i2 = debtViewModelConverter$convertActionButtons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                debtViewModelConverter$convertActionButtons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = debtViewModelConverter$convertActionButtons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = debtViewModelConverter$convertActionButtons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mugVar2 = mugVar;
                    DebtFlow debtFlow = mugVar2.e;
                    if (debtFlow == null || (debtInfo = debtFlow.e) == null) {
                        return new jug(c(), null);
                    }
                    List list = debtInfo.f;
                    ArrayList arrayList2 = new ArrayList();
                    it = list.iterator();
                    arrayList = arrayList2;
                    uv51Var2 = uv51Var;
                    debtViewModelConverter$convertActionButtons$12 = debtViewModelConverter$convertActionButtons$1;
                    lea0Var2 = lea0Var;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ActionButton actionButton = (ActionButton) debtViewModelConverter$convertActionButtons$1.L$11;
                    Iterator it2 = (Iterator) debtViewModelConverter$convertActionButtons$1.L$8;
                    ?? r9 = (Collection) debtViewModelConverter$convertActionButtons$1.L$6;
                    uv51 uv51Var3 = (uv51) debtViewModelConverter$convertActionButtons$1.L$2;
                    lea0 lea0Var3 = (lea0) debtViewModelConverter$convertActionButtons$1.L$1;
                    mug mugVar3 = (mug) debtViewModelConverter$convertActionButtons$1.L$0;
                    kotlin.b.b(obj);
                    debtViewModelConverter$convertActionButtons$12 = debtViewModelConverter$convertActionButtons$1;
                    lea0Var2 = lea0Var3;
                    ArrayList arrayList3 = r9;
                    it = it2;
                    hs hsVar = (hs) obj;
                    gs gsVar = gs.a;
                    if (!jl40.l(hsVar, gsVar) || (hsVar instanceof es)) {
                        actionButtonPrerequisite = actionButton.f;
                        if ((actionButtonPrerequisite == null ? actionButtonPrerequisite.c : null) != null) {
                            if (jl40.l(hsVar, gsVar)) {
                                hugVar = gug.a;
                            } else if (hsVar instanceof es) {
                                ButtonActionType a = actionButton.d.a();
                                zv51 zv51Var = ((es) hsVar).a;
                                int i3 = is.b[a.ordinal()];
                                if (i3 == 1 || i3 == 2) {
                                    hugVar = new hug(zv51Var);
                                }
                            }
                            dsVar = new ds(actionButton, hugVar);
                        }
                        hugVar = null;
                        dsVar = new ds(actionButton, hugVar);
                    } else {
                        dsVar = null;
                    }
                    if (dsVar != null) {
                        arrayList3.add(dsVar);
                    }
                    uv51Var2 = uv51Var3;
                    arrayList = arrayList3;
                    mugVar2 = mugVar3;
                    if (it.hasNext()) {
                        ActionButton actionButton2 = (ActionButton) it.next();
                        PaymentMethod$Type c = lea0Var2 != null ? lea0Var2.c() : null;
                        debtViewModelConverter$convertActionButtons$12.L$0 = mugVar2;
                        debtViewModelConverter$convertActionButtons$12.L$1 = lea0Var2;
                        debtViewModelConverter$convertActionButtons$12.L$2 = uv51Var2;
                        debtViewModelConverter$convertActionButtons$12.L$3 = null;
                        debtViewModelConverter$convertActionButtons$12.L$4 = null;
                        debtViewModelConverter$convertActionButtons$12.L$5 = null;
                        debtViewModelConverter$convertActionButtons$12.L$6 = arrayList;
                        debtViewModelConverter$convertActionButtons$12.L$7 = null;
                        debtViewModelConverter$convertActionButtons$12.L$8 = it;
                        debtViewModelConverter$convertActionButtons$12.L$9 = null;
                        debtViewModelConverter$convertActionButtons$12.L$10 = null;
                        debtViewModelConverter$convertActionButtons$12.L$11 = actionButton2;
                        debtViewModelConverter$convertActionButtons$12.label = 1;
                        Object a2 = this.f.a(actionButton2, c, uv51Var2, debtViewModelConverter$convertActionButtons$12);
                        if (a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        mugVar3 = mugVar2;
                        obj = a2;
                        ArrayList arrayList4 = arrayList;
                        uv51Var3 = uv51Var2;
                        actionButton = actionButton2;
                        arrayList3 = arrayList4;
                        hs hsVar2 = (hs) obj;
                        gs gsVar2 = gs.a;
                        if (jl40.l(hsVar2, gsVar2)) {
                        }
                        actionButtonPrerequisite = actionButton.f;
                        if ((actionButtonPrerequisite == null ? actionButtonPrerequisite.c : null) != null) {
                        }
                        hugVar = null;
                        dsVar = new ds(actionButton, hugVar);
                        if (dsVar != null) {
                        }
                        uv51Var2 = uv51Var3;
                        arrayList = arrayList3;
                        mugVar2 = mugVar3;
                        if (it.hasNext()) {
                            List<ds> A0 = kotlin.collections.a.A0(arrayList, 2);
                            ArrayList arrayList5 = new ArrayList(tcc.n(A0, 10));
                            for (ds dsVar2 : A0) {
                                ActionButton actionButton3 = dsVar2.a;
                                fef fefVar = mugVar2.h;
                                ief iefVar = actionButton3.e;
                                if (iefVar != null) {
                                    fefVar = gwk0.h(iefVar);
                                }
                                ActionButton actionButton4 = dsVar2.a;
                                String str = actionButton4.b;
                                ufu ufuVar = (ufu) this.c;
                                kdc b = ufuVar.b(str);
                                TextItem textItem = actionButton4.a;
                                arrayList5.add(new mt(this.e.a(fefVar, textItem.a, false, true), b, ufuVar.i(textItem.b), actionButton4.d, dsVar2.b));
                            }
                            return new jug((mt) kotlin.collections.a.S(1, arrayList5), (mt) kotlin.collections.a.S(0, arrayList5));
                        }
                    }
                }
            }
        }
        debtViewModelConverter$convertActionButtons$1 = new DebtViewModelConverter$convertActionButtons$1(this, continuationImpl);
        Object obj2 = debtViewModelConverter$convertActionButtons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = debtViewModelConverter$convertActionButtons$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(pl21 pl21Var, lea0 lea0Var, uv51 uv51Var, jfa0 jfa0Var, ContinuationImpl continuationImpl) {
        DebtViewModelConverter$convertDebt$2 debtViewModelConverter$convertDebt$2;
        int i;
        DebtInfo debtInfo;
        aid0 aid0Var;
        stg stgVar;
        aid0 aid0Var2;
        String str;
        String str2;
        mug mugVar;
        stg stgVar2;
        if (continuationImpl instanceof DebtViewModelConverter$convertDebt$2) {
            debtViewModelConverter$convertDebt$2 = (DebtViewModelConverter$convertDebt$2) continuationImpl;
            int i2 = debtViewModelConverter$convertDebt$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                debtViewModelConverter$convertDebt$2.label = i2 - Integer.MIN_VALUE;
                Object obj = debtViewModelConverter$convertDebt$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = debtViewModelConverter$convertDebt$2.label;
                xdf xdfVar = this.e;
                stg stgVar3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mug mugVar2 = pl21Var.b;
                    DebtFlow debtFlow = mugVar2.e;
                    fef fefVar = mugVar2.h;
                    if (debtFlow == null || (debtInfo = debtFlow.e) == null) {
                        return ttg.i;
                    }
                    PlusPoints plusPoints = debtInfo.e;
                    int i3 = mugVar2.i == PaymentState.PROCESSING ? 1 : 0;
                    String a = xdfVar.a(fefVar, debtInfo.a, false, true);
                    String a2 = xdfVar.a(fefVar, debtInfo.b, false, true);
                    t0 t0Var = debtInfo.d;
                    if (i3 == 0) {
                        int size = jfa0Var.a.size();
                        boolean z = !jl40.l(t0Var, s0.INSTANCE);
                        com.yandex.go.payments.common.a aVar = this.i;
                        o0a0 o0a0Var = o0a0.c;
                        if (uv51Var != null) {
                            String str3 = uv51Var.b;
                            String str4 = uv51Var.c;
                            String str5 = uv51Var.a;
                            yy51 yy51Var = lea0Var instanceof yy51 ? (yy51) lea0Var : null;
                            t0a0 d = yy51Var != null ? aVar.d(yy51Var) : null;
                            stgVar2 = new stg(str5, str3, str4, d == null ? o0a0Var : d, new xn8(t0Var), z);
                        } else {
                            zuj0 zuj0Var = this.a;
                            if (lea0Var != null) {
                                stgVar2 = new stg(lea0Var.getId(), ((avj0) zuj0Var).h(kyh0.summary_payment_method_title), this.h.a(this.b, lea0Var), aVar.d(lea0Var), new xn8(t0Var), z);
                            } else if (size > 1) {
                                stgVar2 = new stg(null, ((avj0) zuj0Var).h(kyh0.summary_payment_method_title), null, o0a0Var, new xn8(t0Var), z);
                            } else {
                                stgVar3 = new stg(null, ((avj0) zuj0Var).h(kyh0.credit_cards_add), null, o0a0Var, wn8.a, true);
                            }
                        }
                        stgVar3 = stgVar2;
                    }
                    PlusPoints.Companion.getClass();
                    if (jl40.l(plusPoints, PlusPoints.d)) {
                        aid0Var = null;
                    } else {
                        xxc g = ((com.yandex.go.payments.paymentlist.domain.i) this.d).u.b.g();
                        aid0Var = new aid0(plusPoints.a, plusPoints.b, g != null && g.a.e());
                    }
                    debtViewModelConverter$convertDebt$2.L$0 = null;
                    debtViewModelConverter$convertDebt$2.L$1 = null;
                    debtViewModelConverter$convertDebt$2.L$2 = null;
                    debtViewModelConverter$convertDebt$2.L$3 = null;
                    debtViewModelConverter$convertDebt$2.L$4 = mugVar2;
                    debtViewModelConverter$convertDebt$2.L$5 = debtInfo;
                    debtViewModelConverter$convertDebt$2.L$6 = a;
                    debtViewModelConverter$convertDebt$2.L$7 = a2;
                    debtViewModelConverter$convertDebt$2.L$8 = stgVar3;
                    debtViewModelConverter$convertDebt$2.L$9 = aid0Var;
                    debtViewModelConverter$convertDebt$2.I$0 = i3;
                    debtViewModelConverter$convertDebt$2.label = 1;
                    Object a3 = a(mugVar2, lea0Var, uv51Var, debtViewModelConverter$convertDebt$2);
                    if (a3 == obj2) {
                        return obj2;
                    }
                    stgVar = stgVar3;
                    aid0Var2 = aid0Var;
                    str = a2;
                    str2 = a;
                    mugVar = mugVar2;
                    obj = a3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aid0 aid0Var3 = (aid0) debtViewModelConverter$convertDebt$2.L$9;
                    stg stgVar4 = (stg) debtViewModelConverter$convertDebt$2.L$8;
                    String str6 = (String) debtViewModelConverter$convertDebt$2.L$7;
                    String str7 = (String) debtViewModelConverter$convertDebt$2.L$6;
                    debtInfo = (DebtInfo) debtViewModelConverter$convertDebt$2.L$5;
                    mugVar = (mug) debtViewModelConverter$convertDebt$2.L$4;
                    kotlin.b.b(obj);
                    aid0Var2 = aid0Var3;
                    stgVar = stgVar4;
                    str = str6;
                    str2 = str7;
                }
                jug jugVar = (jug) obj;
                List<Ride> list = debtInfo.c;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (Ride ride : list) {
                    fef fefVar2 = mugVar.h;
                    ief iefVar = ride.c;
                    if (iefVar != null) {
                        fefVar2 = gwk0.h(iefVar);
                    }
                    arrayList.add(new wqk0(xdfVar.a(fefVar2, ride.a, false, true), xdfVar.a(fefVar2, ride.b, false, true), xdfVar.a(fefVar2, ride.d, false, true), ride.e));
                }
                return new ttg(str2, str, (wqk0) kotlin.collections.a.S(1, arrayList), (wqk0) kotlin.collections.a.S(0, arrayList), stgVar, aid0Var2, jugVar.a, jugVar.b);
            }
        }
        debtViewModelConverter$convertDebt$2 = new DebtViewModelConverter$convertDebt$2(this, continuationImpl);
        Object obj3 = debtViewModelConverter$convertDebt$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = debtViewModelConverter$convertDebt$2.label;
        xdf xdfVar2 = this.e;
        stg stgVar32 = null;
        if (i != 0) {
        }
        jug jugVar2 = (jug) obj3;
        List<Ride> list2 = debtInfo.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        while (r0.hasNext()) {
        }
        return new ttg(str2, str, (wqk0) kotlin.collections.a.S(1, arrayList2), (wqk0) kotlin.collections.a.S(0, arrayList2), stgVar, aid0Var2, jugVar2.a, jugVar2.b);
    }

    public final mt c() {
        return new mt(((avj0) this.a).h(kyh0.overdraft_dialog_pay_button), new bdc(xng0.controlMinor), new bdc(xng0.textOnControlMinor), new TapAction$PayDebtAction(0), null);
    }
}
