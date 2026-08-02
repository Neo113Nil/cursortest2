package com.yandex.go.loyalty.impl.selector.domain;

import com.yandex.go.loyalty.impl.selector.data.LoyaltyApi;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyProgramAuthResponse;
import defpackage.cmt;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.fvz;
import defpackage.ny61;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class b {
    public final LoyaltyApi a;

    public b(LoyaltyApi loyaltyApi) {
        this.a = loyaltyApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        LoyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1 loyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1;
        int i;
        String str2;
        String str3;
        try {
            if (continuationImpl instanceof LoyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1) {
                loyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1 = (LoyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1) continuationImpl;
                int i2 = loyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    loyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = loyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = loyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<LoyaltyProgramAuthResponse> b = this.a.b(str);
                        loyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1.L$0 = null;
                        loyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(b, null, loyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    LoyaltyProgramAuthResponse loyaltyProgramAuthResponse = (LoyaltyProgramAuthResponse) ((fmt) obj).a;
                    str2 = loyaltyProgramAuthResponse.a;
                    str3 = loyaltyProgramAuthResponse.b;
                    if (!evu0.J(str2) && !evu0.J(str3)) {
                        return new fvz(str2, str3);
                    }
                    return new Result.Failure(new IllegalStateException("form_url or finish_auth_url is blank!"));
                }
            }
            if (i != 0) {
            }
            LoyaltyProgramAuthResponse loyaltyProgramAuthResponse2 = (LoyaltyProgramAuthResponse) ((fmt) obj).a;
            str2 = loyaltyProgramAuthResponse2.a;
            str3 = loyaltyProgramAuthResponse2.b;
            if (!evu0.J(str2)) {
                return new fvz(str2, str3);
            }
            return new Result.Failure(new IllegalStateException("form_url or finish_auth_url is blank!"));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        loyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1 = new LoyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1(this, continuationImpl);
        Object obj2 = loyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltyProgramAuthRequestInteractor$getDataForProgramLoyaltyAuth$1.label;
    }
}
