package com.yandex.go.overdraft.domain;

import com.yandex.go.overdraft.data.DebtsApiV4;
import com.yandex.go.overdraft.data.model.CvvInfo;
import com.yandex.go.overdraft.data.model.DebtFlow;
import com.yandex.go.overdraft.data.model.DebtStatusesParam;
import com.yandex.go.overdraft.data.model.DebtStatusesResponse;
import com.yandex.go.overdraft.data.model.PaymentState;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.fug;
import defpackage.hd;
import defpackage.id;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pl21;
import defpackage.pzt0;
import defpackage.qhw0;
import defpackage.qke;
import defpackage.r1e0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yvq;
import defpackage.z93;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f {
    public final i a;
    public final fug b;
    public final hd c;
    public final yvq d;
    public final ike e;
    public volatile pzt0 f;

    public f(i iVar, fug fugVar, hd hdVar, yvq yvqVar, tt2 tt2Var) {
        this.a = iVar;
        this.b = fugVar;
        this.c = hdVar;
        this.d = yvqVar;
        qhw0 a = jl40.a();
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.e = bvf0.a(cvw.U(a, mdh.b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r12 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a5 -> B:11:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, DebtStatusesParam debtStatusesParam, ContinuationImpl continuationImpl) {
        DebtsDelegateInteractor$fetchDebtStatusesAsync$1 debtsDelegateInteractor$fetchDebtStatusesAsync$1;
        int i;
        DebtStatusesParam debtStatusesParam2;
        r1e0 r1e0Var;
        CvvInfo cvvInfo;
        fVar.getClass();
        if (continuationImpl instanceof DebtsDelegateInteractor$fetchDebtStatusesAsync$1) {
            debtsDelegateInteractor$fetchDebtStatusesAsync$1 = (DebtsDelegateInteractor$fetchDebtStatusesAsync$1) continuationImpl;
            int i2 = debtsDelegateInteractor$fetchDebtStatusesAsync$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                debtsDelegateInteractor$fetchDebtStatusesAsync$1.label = i2 - Integer.MIN_VALUE;
                Object obj = debtsDelegateInteractor$fetchDebtStatusesAsync$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = debtsDelegateInteractor$fetchDebtStatusesAsync$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r1e0Var = (r1e0) debtsDelegateInteractor$fetchDebtStatusesAsync$1.L$1;
                        debtStatusesParam2 = (DebtStatusesParam) debtsDelegateInteractor$fetchDebtStatusesAsync$1.L$0;
                        kotlin.b.b(obj);
                        if (kotlinx.coroutines.a.p(debtsDelegateInteractor$fetchDebtStatusesAsync$1.get_context())) {
                            yvq yvqVar = fVar.d;
                            DebtStatusesResponse debtStatusesResponse = (DebtStatusesResponse) r1e0Var.a;
                            yvqVar.getClass();
                            if (debtStatusesResponse.g() == PaymentState.PROCESSING) {
                                DebtFlow e = debtStatusesResponse.getE();
                                if (((e == null || (cvvInfo = e.f) == null) ? null : cvvInfo.getA()) == null) {
                                    debtStatusesParam = debtStatusesParam2;
                                    fug fugVar = fVar.b;
                                    debtsDelegateInteractor$fetchDebtStatusesAsync$1.L$0 = debtStatusesParam;
                                    debtsDelegateInteractor$fetchDebtStatusesAsync$1.L$1 = null;
                                    debtsDelegateInteractor$fetchDebtStatusesAsync$1.label = 1;
                                    obj = ru.yandex.taxi.network.api.a.c(((DebtsApiV4) fugVar.b.getValue()).a(debtStatusesParam), null, debtsDelegateInteractor$fetchDebtStatusesAsync$1);
                                }
                            }
                        }
                        return zy11.a;
                    }
                    debtStatusesParam = (DebtStatusesParam) debtsDelegateInteractor$fetchDebtStatusesAsync$1.L$0;
                    kotlin.b.b(obj);
                    r1e0 r1e0Var2 = (r1e0) obj;
                    fVar.c.a((DebtStatusesResponse) r1e0Var2.a);
                    i iVar = fVar.a;
                    pl21 pl21Var = pl21.c;
                    iVar.e(qke.l((DebtStatusesResponse) r1e0Var2.a));
                    Long l = r1e0Var2.b;
                    if (l == null || l.longValue() <= 0) {
                        l = null;
                    }
                    long longValue = l != null ? l.longValue() : 5000L;
                    debtsDelegateInteractor$fetchDebtStatusesAsync$1.L$0 = debtStatusesParam;
                    debtsDelegateInteractor$fetchDebtStatusesAsync$1.L$1 = r1e0Var2;
                    debtsDelegateInteractor$fetchDebtStatusesAsync$1.J$0 = longValue;
                    debtsDelegateInteractor$fetchDebtStatusesAsync$1.label = 2;
                    if (kotlinx.coroutines.a.i(longValue, debtsDelegateInteractor$fetchDebtStatusesAsync$1) != coroutineSingletons) {
                        debtStatusesParam2 = debtStatusesParam;
                        r1e0Var = r1e0Var2;
                        if (kotlinx.coroutines.a.p(debtsDelegateInteractor$fetchDebtStatusesAsync$1.get_context())) {
                        }
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
                kotlin.b.b(obj);
                fug fugVar2 = fVar.b;
                debtsDelegateInteractor$fetchDebtStatusesAsync$1.L$0 = debtStatusesParam;
                debtsDelegateInteractor$fetchDebtStatusesAsync$1.L$1 = null;
                debtsDelegateInteractor$fetchDebtStatusesAsync$1.label = 1;
                obj = ru.yandex.taxi.network.api.a.c(((DebtsApiV4) fugVar2.b.getValue()).a(debtStatusesParam), null, debtsDelegateInteractor$fetchDebtStatusesAsync$1);
            }
        }
        debtsDelegateInteractor$fetchDebtStatusesAsync$1 = new DebtsDelegateInteractor$fetchDebtStatusesAsync$1(fVar, continuationImpl);
        Object obj2 = debtsDelegateInteractor$fetchDebtStatusesAsync$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = debtsDelegateInteractor$fetchDebtStatusesAsync$1.label;
        if (i == 0) {
        }
    }

    public final void b(List list) {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        if (!list.isEmpty()) {
            this.f = tje.N(this.e, new z93(this), null, new DebtsDelegateInteractor$startPollingDebts$1(this, null), 2);
            return;
        }
        id idVar = this.c.a;
        String str = idVar.b;
        idVar.b = null;
        idVar.a.w("ACTIVE_ORDER_ID");
        if (str != null) {
            idVar.a.w("OPENED_URL_".concat(str));
        }
        i iVar = this.a;
        iVar.getClass();
        iVar.e(pl21.d);
    }
}
