package com.yandex.go.payments.order.domain;

import com.yandex.go.payments.domain.r0;
import defpackage.cz51;
import defpackage.ief;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import java.math.BigDecimal;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a implements cz51 {
    public final n20 a;
    public final r0 b;

    public a(n20 n20Var, r0 r0Var) {
        this.a = n20Var;
        this.b = r0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.cz51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        InOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1 inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        o2y0 o2y0Var;
        ief iefVar;
        String str;
        if (continuation instanceof InOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1) {
            inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1 = (InOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1) continuation;
            int i2 = inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) this.a).t(inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var == null || (iefVar = o2y0Var.b().V().K) == null || (str = iefVar.b) == null) {
                    return null;
                }
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(o2y0Var.b().V().u));
                inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.L$0 = null;
                inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.L$1 = null;
                inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.L$2 = null;
                inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.label = 2;
                Object a = this.b.a(bigDecimal, str, inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1 = new InOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1(this, (ContinuationImpl) continuation);
        Object obj2 = inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var == null) {
            BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(o2y0Var.b().V().u));
            inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.L$0 = null;
            inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.L$1 = null;
            inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.L$2 = null;
            inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1.label = 2;
            Object a2 = this.b.a(bigDecimal2, str, inOrderYbWalletTopUpAmountInteractor$getTopUpAmount$1);
            if (a2 != coroutineSingletons) {
            }
        }
        return null;
    }
}
