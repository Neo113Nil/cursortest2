package com.yandex.go.rida.bids.data;

import defpackage.cmt;
import defpackage.fmt;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z1b1;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.data.BidsNetworkRepository$rejectBid$2", f = "BidsNetworkRepository.kt", l = {139}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsNetworkRepository$rejectBid$2 extends SuspendLambda implements wls {
    final /* synthetic */ cmt<zy11> $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsNetworkRepository$rejectBid$2(cmt cmtVar, Continuation continuation) {
        super(2, continuation);
        this.$request = cmtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BidsNetworkRepository$rejectBid$2(this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BidsNetworkRepository$rejectBid$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                cmt<zy11> cmtVar = this.$request;
                this.label = 1;
                obj = ru.yandex.taxi.network.api.a.b(cmtVar, null, this);
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
            return Boolean.valueOf(z1b1.b(((fmt) obj).b));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.r("Failed to call reject bid request", th);
            return Boolean.FALSE;
        }
    }
}
