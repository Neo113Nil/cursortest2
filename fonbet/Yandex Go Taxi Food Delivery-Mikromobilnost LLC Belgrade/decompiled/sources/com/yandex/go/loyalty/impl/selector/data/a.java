package com.yandex.go.loyalty.impl.selector.data;

import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyStateParam;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyStateResponse;
import defpackage.bn9;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.kqz;
import defpackage.ny61;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final LoyaltyApi a;
    public final kqz b;

    public a(LoyaltyApi loyaltyApi, kqz kqzVar) {
        this.a = loyaltyApi;
        this.b = kqzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(LoyaltyStateParam loyaltyStateParam, ContinuationImpl continuationImpl) {
        LoyaltyApiRepository$getLoyaltyState$1 loyaltyApiRepository$getLoyaltyState$1;
        int i;
        try {
            if (continuationImpl instanceof LoyaltyApiRepository$getLoyaltyState$1) {
                loyaltyApiRepository$getLoyaltyState$1 = (LoyaltyApiRepository$getLoyaltyState$1) continuationImpl;
                int i2 = loyaltyApiRepository$getLoyaltyState$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    loyaltyApiRepository$getLoyaltyState$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = loyaltyApiRepository$getLoyaltyState$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = loyaltyApiRepository$getLoyaltyState$1.label;
                    if (i != 0) {
                        b.b(obj);
                        cmt<LoyaltyStateResponse> d = this.a.d(loyaltyStateParam);
                        loyaltyApiRepository$getLoyaltyState$1.L$0 = null;
                        loyaltyApiRepository$getLoyaltyState$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(d, null, loyaltyApiRepository$getLoyaltyState$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return ((bn9) this.b.get()).a((LoyaltyStateResponse) ((fmt) obj).a);
                }
            }
            if (i != 0) {
            }
            return ((bn9) this.b.get()).a((LoyaltyStateResponse) ((fmt) obj).a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        loyaltyApiRepository$getLoyaltyState$1 = new LoyaltyApiRepository$getLoyaltyState$1(this, continuationImpl);
        Object obj2 = loyaltyApiRepository$getLoyaltyState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltyApiRepository$getLoyaltyState$1.label;
    }
}
