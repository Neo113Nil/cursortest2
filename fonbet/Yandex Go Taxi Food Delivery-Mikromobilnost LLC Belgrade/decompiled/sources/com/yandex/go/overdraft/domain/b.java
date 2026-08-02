package com.yandex.go.overdraft.domain;

import com.yandex.go.overdraft.data.model.PaymentState;
import defpackage.cne0;
import defpackage.jst;
import defpackage.kug;
import defpackage.lt3;
import defpackage.lv90;
import defpackage.lz60;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.p1m0;
import defpackage.pl21;
import defpackage.ql21;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xnt;
import defpackage.ycq0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class b implements lz60 {
    public final tse a;
    public final tt2 b;
    public final kug c;
    public final p1m0 d;
    public final ql21 e;
    public final com.yandex.go.payments.data.p f;
    public final ycq0 g;

    public b(tse tseVar, tt2 tt2Var, kug kugVar, p1m0 p1m0Var, ql21 ql21Var, com.yandex.go.payments.data.p pVar, ycq0 ycq0Var) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = kugVar;
        this.d = p1m0Var;
        this.e = ql21Var;
        this.f = pVar;
        this.g = ycq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b bVar, lt3 lt3Var, Continuation continuation) {
        AutoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1 autoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1;
        int i;
        boolean booleanValue;
        lv90 lv90Var;
        lv90 lv90Var2;
        PaymentMethod$Type paymentMethod$Type;
        PaymentMethod$Type paymentMethod$Type2;
        PaymentState paymentState;
        bVar.getClass();
        if (continuation instanceof AutoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1) {
            autoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1 = (AutoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1) continuation;
            int i2 = autoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kug kugVar = bVar.c;
                    autoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1.L$0 = lt3Var;
                    autoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1.label = 1;
                    obj = kugVar.b.f(autoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lt3Var = (lt3) autoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (booleanValue && (lv90Var = lt3Var.a) != null && (lv90Var2 = lt3Var.b) != null) {
                    paymentMethod$Type = lv90Var.a;
                    paymentMethod$Type2 = PaymentMethod$Type.CASH;
                    if (paymentMethod$Type != paymentMethod$Type2 && lv90Var2.a == paymentMethod$Type2 && ((paymentState = ((pl21) kotlinx.coroutines.flow.e.d(bVar.e.a).a.getValue()).b.i) == PaymentState.DEBT || paymentState == PaymentState.PROCESSING)) {
                        p1m0 p1m0Var = bVar.d;
                        p1m0Var.b.r("payment", ((xnt) p1m0Var.a).e(lv90Var, lv90.Companion.serializer()));
                    }
                }
                return zy11Var;
            }
        }
        autoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1 = new AutoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1(bVar, continuation);
        Object obj2 = autoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoRestorePaymentBeforeDebtInteractor$handleSelectedPaymentTransition$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (booleanValue) {
            paymentMethod$Type = lv90Var.a;
            paymentMethod$Type2 = PaymentMethod$Type.CASH;
            if (paymentMethod$Type != paymentMethod$Type2) {
                p1m0 p1m0Var2 = bVar.d;
                p1m0Var2.b.r("payment", ((xnt) p1m0Var2.a).e(lv90Var, lv90.Companion.serializer()));
            }
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(b bVar, pl21 pl21Var, Continuation continuation) {
        AutoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1 autoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1;
        Object obj;
        int i;
        lv90 lv90Var;
        String l;
        p1m0 p1m0Var = bVar.d;
        if (continuation instanceof AutoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1) {
            autoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1 = (AutoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1) continuation;
            int i2 = autoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1.label = i2 - Integer.MIN_VALUE;
                obj = autoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1.label;
                lv90Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kug kugVar = bVar.c;
                    autoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1.L$0 = pl21Var;
                    autoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1.label = 1;
                    obj = kugVar.b.f(autoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pl21Var = (pl21) autoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue() && pl21Var.a && (pl21Var.equals(pl21.d) || pl21Var.b.i == PaymentState.NO_DEBT)) {
                    cne0 cne0Var = p1m0Var.b;
                    cne0 cne0Var2 = p1m0Var.b;
                    l = cne0Var.l("payment", null);
                    if (l != null) {
                        try {
                            lv90Var = (lv90) ((xnt) p1m0Var.a).c(l, lv90.Companion.serializer());
                        } catch (Throwable th) {
                            jst.e.j(th);
                            cne0Var2.w("payment");
                        }
                    }
                    if (lv90Var != null) {
                        bVar.g.b(lv90Var);
                        cne0Var2.w("payment");
                    }
                }
                return zy11.a;
            }
        }
        autoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1 = new AutoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1(bVar, continuation);
        obj = autoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoRestorePaymentBeforeDebtInteractor$handleUserDebtsState$1.label;
        lv90Var = null;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
            cne0 cne0Var3 = p1m0Var.b;
            cne0 cne0Var22 = p1m0Var.b;
            l = cne0Var3.l("payment", null);
            if (l != null) {
            }
            if (lv90Var != null) {
            }
        }
        return zy11.a;
    }

    @Override // defpackage.lz60
    public final void g() {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        AutoRestorePaymentBeforeDebtInteractor$observeSelectedPaymentForSave$1 autoRestorePaymentBeforeDebtInteractor$observeSelectedPaymentForSave$1 = new AutoRestorePaymentBeforeDebtInteractor$observeSelectedPaymentForSave$1(this, null);
        tse tseVar = this.a;
        tje.N(tseVar, mdhVar, null, autoRestorePaymentBeforeDebtInteractor$observeSelectedPaymentForSave$1, 2);
        tje.N(tseVar, mdhVar, null, new AutoRestorePaymentBeforeDebtInteractor$observeUserDebtsStateForRestore$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "AutoRestorePaymentBeforeDebtInteractor";
    }
}
