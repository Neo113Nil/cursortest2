package com.ybsdk.screens.registration.data;

import com.ybsdk.common.entities.ChangePhoneApplicationStatusEntity$Status;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.network.dto.changephone.ChangePhoneApplicationStatusResponse;
import defpackage.ee9;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.yci0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusResponse;", "statusResponse", "Lkotlin/Result;", "Lee9;", "<anonymous>", "(Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusResponse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.data.ChangePhoneRepository$startPolling$3$1$1", f = "ChangePhoneRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ChangePhoneRepository$startPolling$3$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePhoneRepository$startPolling$3$1$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangePhoneRepository$startPolling$3$1$1 changePhoneRepository$startPolling$3$1$1 = new ChangePhoneRepository$startPolling$3$1$1(this.this$0, continuation);
        changePhoneRepository$startPolling$3$1$1.L$0 = obj;
        return changePhoneRepository$startPolling$3$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangePhoneRepository$startPolling$3$1$1) create((ChangePhoneApplicationStatusResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChangePhoneApplicationStatusEntity$Status changePhoneApplicationStatusEntity$Status;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ChangePhoneApplicationStatusResponse changePhoneApplicationStatusResponse = (ChangePhoneApplicationStatusResponse) this.L$0;
        this.this$0.getClass();
        ChangePhoneApplicationStatusEntity$Status[] values = ChangePhoneApplicationStatusEntity$Status.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                changePhoneApplicationStatusEntity$Status = null;
                break;
            }
            changePhoneApplicationStatusEntity$Status = values[i];
            if (jl40.l(changePhoneApplicationStatusEntity$Status.getStatus(), changePhoneApplicationStatusResponse.getStatus().name())) {
                break;
            }
            i++;
        }
        if (changePhoneApplicationStatusEntity$Status != null) {
            return new Result(new ee9(changePhoneApplicationStatusEntity$Status, d.f(changePhoneApplicationStatusResponse.getTitle()), d.f(changePhoneApplicationStatusResponse.getDescription()), changePhoneApplicationStatusResponse.getSupportUrl()));
        }
        yci0.t(changePhoneApplicationStatusResponse.getStatus(), "Unexpected status ");
        return null;
    }
}
