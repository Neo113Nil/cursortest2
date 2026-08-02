package com.yandex.go.payments.yb.domain;

import com.yandex.go.payments.data.q;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class a {
    public final q a;

    public a(q qVar) {
        this.a = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, PaymentMethod$Type paymentMethod$Type, ContinuationImpl continuationImpl) {
        LpmWalletUnbindingInteractor$unbindWallet$1 lpmWalletUnbindingInteractor$unbindWallet$1;
        int i;
        if (continuationImpl instanceof LpmWalletUnbindingInteractor$unbindWallet$1) {
            lpmWalletUnbindingInteractor$unbindWallet$1 = (LpmWalletUnbindingInteractor$unbindWallet$1) continuationImpl;
            int i2 = lpmWalletUnbindingInteractor$unbindWallet$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lpmWalletUnbindingInteractor$unbindWallet$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lpmWalletUnbindingInteractor$unbindWallet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lpmWalletUnbindingInteractor$unbindWallet$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                kotlin.b.b(obj);
                String code = paymentMethod$Type.getCode();
                lpmWalletUnbindingInteractor$unbindWallet$1.L$0 = null;
                lpmWalletUnbindingInteractor$unbindWallet$1.L$1 = null;
                lpmWalletUnbindingInteractor$unbindWallet$1.label = 1;
                Object a = this.a.a(str, code, lpmWalletUnbindingInteractor$unbindWallet$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        lpmWalletUnbindingInteractor$unbindWallet$1 = new LpmWalletUnbindingInteractor$unbindWallet$1(this, continuationImpl);
        Object obj2 = lpmWalletUnbindingInteractor$unbindWallet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lpmWalletUnbindingInteractor$unbindWallet$1.label;
        if (i == 0) {
        }
    }
}
