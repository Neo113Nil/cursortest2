package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BookingPreloaderTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.preloader.presentation.BookingPreloaderTaskExecutor$loadRebookingModel$servicesDeferred$1", f = "BookingPreloaderTaskExecutor.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class dt7 extends SuspendLambda implements wzs<yvj, spj<? super List<? extends BookingServiceModel>>, Object> {
    final /* synthetic */ UserId $groupId;
    int label;
    final /* synthetic */ com.vk.ecomm.onlinebooking.impl.preloader.presentation.e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt7(com.vk.ecomm.onlinebooking.impl.preloader.presentation.e eVar, UserId userId, spj<? super dt7> spjVar) {
        super(2, spjVar);
        this.this$0 = eVar;
        this.$groupId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new dt7(this.this$0, this.$groupId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super List<? extends BookingServiceModel>> spjVar) {
        return ((dt7) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        hx7 hx7Var = this.this$0.i;
        UserId userId = this.$groupId;
        EmptyList emptyList = EmptyList.b;
        this.label = 1;
        Object c = hx7Var.c(userId, null, emptyList, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
