package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BookingPreloaderTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.preloader.presentation.BookingPreloaderTaskExecutor$loadRebookingModel$mastersDeferred$1", f = "BookingPreloaderTaskExecutor.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class ct7 extends SuspendLambda implements wzs<yvj, spj<? super List<? extends BookingMaster>>, Object> {
    final /* synthetic */ UserId $groupId;
    int label;
    final /* synthetic */ com.vk.ecomm.onlinebooking.impl.preloader.presentation.e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct7(com.vk.ecomm.onlinebooking.impl.preloader.presentation.e eVar, UserId userId, spj<? super ct7> spjVar) {
        super(2, spjVar);
        this.this$0 = eVar;
        this.$groupId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ct7(this.this$0, this.$groupId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super List<? extends BookingMaster>> spjVar) {
        return ((ct7) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zq7 zq7Var = this.this$0.h;
            UserId userId = this.$groupId;
            this.label = 1;
            obj = zq7Var.a(userId, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return ((wq7) obj).a;
    }
}
