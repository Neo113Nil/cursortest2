package com.yandex.go.loyalty.impl.common.data;

import com.yandex.go.loyalty.impl.common.data.model.UnbindParam;
import com.yandex.go.loyalty.impl.selector.data.LoyaltyApi;
import defpackage.cmt;
import defpackage.ny61;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class d {
    public final LoyaltyApi a;

    public d(LoyaltyApi loyaltyApi) {
        this.a = loyaltyApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        LoyaltyUnbindApiRepository$unbindLoyaltyProgram$1 loyaltyUnbindApiRepository$unbindLoyaltyProgram$1;
        int i;
        try {
            if (continuationImpl instanceof LoyaltyUnbindApiRepository$unbindLoyaltyProgram$1) {
                loyaltyUnbindApiRepository$unbindLoyaltyProgram$1 = (LoyaltyUnbindApiRepository$unbindLoyaltyProgram$1) continuationImpl;
                int i2 = loyaltyUnbindApiRepository$unbindLoyaltyProgram$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    loyaltyUnbindApiRepository$unbindLoyaltyProgram$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = loyaltyUnbindApiRepository$unbindLoyaltyProgram$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = loyaltyUnbindApiRepository$unbindLoyaltyProgram$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<zy11> a = this.a.a(new UnbindParam(str, str2));
                        loyaltyUnbindApiRepository$unbindLoyaltyProgram$1.L$0 = null;
                        loyaltyUnbindApiRepository$unbindLoyaltyProgram$1.L$1 = null;
                        loyaltyUnbindApiRepository$unbindLoyaltyProgram$1.L$2 = null;
                        loyaltyUnbindApiRepository$unbindLoyaltyProgram$1.label = 1;
                        if (ru.yandex.taxi.network.api.a.b(a, null, loyaltyUnbindApiRepository$unbindLoyaltyProgram$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        loyaltyUnbindApiRepository$unbindLoyaltyProgram$1 = new LoyaltyUnbindApiRepository$unbindLoyaltyProgram$1(this, continuationImpl);
        Object obj2 = loyaltyUnbindApiRepository$unbindLoyaltyProgram$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltyUnbindApiRepository$unbindLoyaltyProgram$1.label;
    }
}
