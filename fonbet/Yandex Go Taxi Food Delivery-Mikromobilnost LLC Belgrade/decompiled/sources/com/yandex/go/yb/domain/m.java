package com.yandex.go.yb.domain;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.yb.experiments.ChangeToYbWalletExperiment;
import defpackage.jst;
import defpackage.kv90;
import defpackage.lv90;
import defpackage.n20;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.ycq0;
import defpackage.yy51;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes15.dex */
public final class m implements vpr {
    public final /* synthetic */ n a;

    public m(n nVar) {
        this.a = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(yy51 yy51Var, Continuation continuation) {
        SelectYbCardInteractor$observeYbWalletOpened$1$1$emit$1 selectYbCardInteractor$observeYbWalletOpened$1$1$emit$1;
        Object obj;
        int i;
        if (continuation instanceof SelectYbCardInteractor$observeYbWalletOpened$1$1$emit$1) {
            selectYbCardInteractor$observeYbWalletOpened$1$1$emit$1 = (SelectYbCardInteractor$observeYbWalletOpened$1$1$emit$1) continuation;
            int i2 = selectYbCardInteractor$observeYbWalletOpened$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectYbCardInteractor$observeYbWalletOpened$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                obj = selectYbCardInteractor$observeYbWalletOpened$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectYbCardInteractor$observeYbWalletOpened$1$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                n nVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (((ChangeToYbWalletExperiment) nVar.k.b()).b()) {
                        n20 n20Var = nVar.e;
                        selectYbCardInteractor$observeYbWalletOpened$1$1$emit$1.L$0 = yy51Var;
                        selectYbCardInteractor$observeYbWalletOpened$1$1$emit$1.label = 1;
                        obj = ((com.yandex.go.taxi.order.provider.a) n20Var).q(selectYbCardInteractor$observeYbWalletOpened$1$1$emit$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yy51Var = (yy51) selectYbCardInteractor$observeYbWalletOpened$1$1$emit$1.L$0;
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    jst.e.getClass();
                    return zy11Var;
                }
                if (((PaymentsScreen) nVar.j.a.getValue()) == null) {
                    jst.e.getClass();
                    return zy11Var;
                }
                if (!((ChangeToYbWalletExperiment) nVar.k.b()).d) {
                    nVar.d(yy51Var.a);
                    return zy11Var;
                }
                ycq0 ycq0Var = nVar.f;
                kv90 kv90Var = lv90.Companion;
                PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.YB_WALLET;
                String str = yy51Var.a;
                kv90Var.getClass();
                ycq0Var.b(kv90.b(str, paymentMethod$Type));
                return zy11Var;
            }
        }
        selectYbCardInteractor$observeYbWalletOpened$1$1$emit$1 = new SelectYbCardInteractor$observeYbWalletOpened$1$1$emit$1(this, continuation);
        obj = selectYbCardInteractor$observeYbWalletOpened$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectYbCardInteractor$observeYbWalletOpened$1$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        n nVar2 = this.a;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
