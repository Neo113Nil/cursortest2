package com.yandex.go.payments.sbp.data;

import com.yandex.go.payments.sbp.data.model.SbpTokenBindRequest;
import com.yandex.go.payments.sbp.data.model.SbpTokenBindResponse;
import defpackage.cmt;
import defpackage.ny61;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class g {
    public final SbpTokenApi a;

    public g(SbpTokenApi sbpTokenApi) {
        this.a = sbpTokenApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        SbpTokenBindingRepository$bindSbpToken$1 sbpTokenBindingRepository$bindSbpToken$1;
        int i;
        try {
            if (continuationImpl instanceof SbpTokenBindingRepository$bindSbpToken$1) {
                sbpTokenBindingRepository$bindSbpToken$1 = (SbpTokenBindingRepository$bindSbpToken$1) continuationImpl;
                int i2 = sbpTokenBindingRepository$bindSbpToken$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sbpTokenBindingRepository$bindSbpToken$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = sbpTokenBindingRepository$bindSbpToken$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sbpTokenBindingRepository$bindSbpToken$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<SbpTokenBindResponse> b = this.a.b(new SbpTokenBindRequest(str, str2));
                        sbpTokenBindingRepository$bindSbpToken$1.L$0 = null;
                        sbpTokenBindingRepository$bindSbpToken$1.L$1 = null;
                        sbpTokenBindingRepository$bindSbpToken$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(b, null, sbpTokenBindingRepository$bindSbpToken$1);
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
                    return (SbpTokenBindResponse) obj;
                }
            }
            if (i != 0) {
            }
            return (SbpTokenBindResponse) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        sbpTokenBindingRepository$bindSbpToken$1 = new SbpTokenBindingRepository$bindSbpToken$1(this, continuationImpl);
        Object obj2 = sbpTokenBindingRepository$bindSbpToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbpTokenBindingRepository$bindSbpToken$1.label;
    }
}
