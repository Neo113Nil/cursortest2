package com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;
import defpackage.aod0;
import defpackage.bod0;
import defpackage.cod0;
import defpackage.dod0;
import defpackage.eod0;
import defpackage.fod0;
import defpackage.hod0;
import defpackage.ind0;
import defpackage.iod0;
import defpackage.jod0;
import defpackage.jqr;
import defpackage.kod0;
import defpackage.mod0;
import defpackage.nod0;
import defpackage.ny61;
import defpackage.ood0;
import defpackage.owv;
import defpackage.pgz;
import defpackage.pod0;
import defpackage.qod0;
import defpackage.rod0;
import defpackage.sls;
import defpackage.sod0;
import defpackage.tls;
import defpackage.tod0;
import defpackage.uod0;
import defpackage.w511;
import defpackage.xnd0;
import defpackage.ynd0;
import defpackage.znd0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes2.dex */
public final class b implements dod0 {
    public final List a;
    public final List b;
    public final pgz c;

    public b(List list, List list2, pgz pgzVar) {
        this.a = list;
        this.b = list2;
        this.c = pgzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ind0 ind0Var, tls tlsVar, sls slsVar, ContinuationImpl continuationImpl) {
        PlusTarifficatorPaymentFacadeImpl$startPayment$1 plusTarifficatorPaymentFacadeImpl$startPayment$1;
        int i;
        ind0 ind0Var2;
        Object obj;
        eod0 eod0Var;
        mod0 mod0Var;
        Iterator it;
        int i2;
        ind0 ind0Var3;
        kod0 kod0Var;
        ind0 ind0Var4;
        Iterator it2;
        kod0 kod0Var2;
        kod0 kod0Var3;
        int i3;
        int i4;
        if (continuationImpl instanceof PlusTarifficatorPaymentFacadeImpl$startPayment$1) {
            plusTarifficatorPaymentFacadeImpl$startPayment$1 = (PlusTarifficatorPaymentFacadeImpl$startPayment$1) continuationImpl;
            int i5 = plusTarifficatorPaymentFacadeImpl$startPayment$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                plusTarifficatorPaymentFacadeImpl$startPayment$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = plusTarifficatorPaymentFacadeImpl$startPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusTarifficatorPaymentFacadeImpl$startPayment$1.label;
                zy11 zy11Var = zy11.a;
                List list = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Iterator it3 = this.a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            ind0Var2 = ind0Var;
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        ind0Var2 = ind0Var;
                        if (((mod0) obj).b(ind0Var2)) {
                            break;
                        }
                    }
                    mod0 mod0Var2 = (mod0) obj;
                    eod0Var = new eod0(slsVar, tlsVar);
                    pgz pgzVar = this.c;
                    if (mod0Var2 == null) {
                        LogPriority logPriority = LogPriority.ERROR;
                        if (pgzVar.e(logPriority)) {
                            pgzVar.a(logPriority, "PlusTarifficatorPaymentFacade", "There is no proper factory to create payment session");
                        }
                        return new iod0(PlusPaymentFlowErrorReason.Unexpected.INSTANCE);
                    }
                    LogPriority logPriority2 = LogPriority.DEBUG;
                    if (pgzVar.e(logPriority2)) {
                        pgzVar.a(logPriority2, "PlusTarifficatorPaymentFacade", "Found proper session factory: " + mod0Var2);
                    }
                    mod0Var = mod0Var2;
                    it = list.iterator();
                    i2 = 0;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = plusTarifficatorPaymentFacadeImpl$startPayment$1.I$1;
                            i4 = plusTarifficatorPaymentFacadeImpl$startPayment$1.I$0;
                            it2 = (Iterator) plusTarifficatorPaymentFacadeImpl$startPayment$1.L$10;
                            kod0Var2 = (kod0) plusTarifficatorPaymentFacadeImpl$startPayment$1.L$8;
                            kod0Var3 = (kod0) plusTarifficatorPaymentFacadeImpl$startPayment$1.L$7;
                            ind0Var4 = (ind0) plusTarifficatorPaymentFacadeImpl$startPayment$1.L$0;
                            kotlin.b.b(obj2);
                            while (it2.hasNext()) {
                                fod0 fod0Var = (fod0) it2.next();
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.L$0 = ind0Var4;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.L$1 = null;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.L$2 = null;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.L$3 = null;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.L$4 = null;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.L$5 = null;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.L$6 = null;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.L$7 = kod0Var3;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.L$8 = kod0Var2;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.L$9 = null;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.L$10 = it2;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.L$11 = null;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.L$12 = null;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.I$0 = i4;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.I$1 = i3;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.I$2 = 0;
                                plusTarifficatorPaymentFacadeImpl$startPayment$1.label = 3;
                                fod0Var.c(ind0Var4, kod0Var2);
                                if (zy11Var == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return kod0Var3;
                        }
                        ind0Var3 = (ind0) plusTarifficatorPaymentFacadeImpl$startPayment$1.L$0;
                        kotlin.b.b(obj2);
                        uod0 uod0Var = (uod0) obj2;
                        if ((uod0Var instanceof sod0) || (uod0Var instanceof rod0) || (uod0Var instanceof ood0) || (uod0Var instanceof tod0)) {
                            ny61.r("Unexpected terminal state for payment session");
                            return null;
                        }
                        if (uod0Var instanceof qod0) {
                            qod0 qod0Var = (qod0) uod0Var;
                            kod0Var = new jod0(qod0Var.a, qod0Var.b);
                        } else if (uod0Var instanceof pod0) {
                            cod0 cod0Var = ((pod0) uod0Var).b;
                            if (cod0Var instanceof ynd0) {
                                kod0Var = new iod0(new PlusPaymentFlowErrorReason.GooglePlay(((ynd0) cod0Var).a));
                            } else if (cod0Var instanceof znd0) {
                                kod0Var = new iod0(new PlusPaymentFlowErrorReason.Backend(((znd0) cod0Var).a));
                            } else if (cod0Var instanceof xnd0) {
                                kod0Var = new iod0(PlusPaymentFlowErrorReason.Connection.INSTANCE);
                            } else if (cod0Var instanceof aod0) {
                                kod0Var = new iod0(PlusPaymentFlowErrorReason.Unauthorized.INSTANCE);
                            } else {
                                if (!(cod0Var instanceof bod0)) {
                                    w511.b();
                                    return null;
                                }
                                kod0Var = new iod0(PlusPaymentFlowErrorReason.Unexpected.INSTANCE);
                            }
                        } else {
                            if (!(uod0Var instanceof nod0)) {
                                w511.b();
                                return null;
                            }
                            kod0Var = hod0.a;
                        }
                        ind0Var4 = ind0Var3;
                        it2 = list.iterator();
                        kod0Var2 = kod0Var;
                        kod0Var3 = kod0Var2;
                        i3 = 0;
                        i4 = 0;
                        while (it2.hasNext()) {
                        }
                        return kod0Var3;
                    }
                    i2 = plusTarifficatorPaymentFacadeImpl$startPayment$1.I$0;
                    it = (Iterator) plusTarifficatorPaymentFacadeImpl$startPayment$1.L$6;
                    eod0 eod0Var2 = (eod0) plusTarifficatorPaymentFacadeImpl$startPayment$1.L$4;
                    mod0Var = (mod0) plusTarifficatorPaymentFacadeImpl$startPayment$1.L$3;
                    ind0 ind0Var5 = (ind0) plusTarifficatorPaymentFacadeImpl$startPayment$1.L$0;
                    kotlin.b.b(obj2);
                    eod0Var = eod0Var2;
                    ind0Var2 = ind0Var5;
                }
                while (true) {
                    if (it.hasNext()) {
                        owv owvVar = new owv(new jqr(mod0Var.a(ind0Var2).a(), new PlusTarifficatorPaymentFacadeImpl$startPayment$terminalState$1(this, eod0Var, ind0Var2, null), 3), 1);
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$0 = ind0Var2;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$1 = null;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$2 = null;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$3 = null;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$4 = null;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$5 = null;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$6 = null;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$7 = null;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$8 = null;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.label = 2;
                        obj2 = e.y(owvVar, plusTarifficatorPaymentFacadeImpl$startPayment$1);
                        if (obj2 != coroutineSingletons) {
                            ind0Var3 = ind0Var2;
                        }
                    } else {
                        fod0 fod0Var2 = (fod0) it.next();
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$0 = ind0Var2;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$1 = null;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$2 = null;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$3 = mod0Var;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$4 = eod0Var;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$5 = null;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$6 = it;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$7 = null;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.L$8 = null;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.I$0 = i2;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.I$1 = 0;
                        plusTarifficatorPaymentFacadeImpl$startPayment$1.label = 1;
                        fod0Var2.b(ind0Var2);
                        if (zy11Var == coroutineSingletons) {
                            break;
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        plusTarifficatorPaymentFacadeImpl$startPayment$1 = new PlusTarifficatorPaymentFacadeImpl$startPayment$1(this, continuationImpl);
        Object obj22 = plusTarifficatorPaymentFacadeImpl$startPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusTarifficatorPaymentFacadeImpl$startPayment$1.label;
        zy11 zy11Var2 = zy11.a;
        List list2 = this.b;
        if (i != 0) {
        }
        while (true) {
            if (it.hasNext()) {
            }
        }
        return coroutineSingletons2;
    }
}
