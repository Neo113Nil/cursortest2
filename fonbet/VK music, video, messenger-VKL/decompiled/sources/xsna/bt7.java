package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.preloader.domain.model.ReBookingArgs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.is7;

/* compiled from: BookingPreloaderTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.preloader.presentation.BookingPreloaderTaskExecutor$loadRebooking$1", f = "BookingPreloaderTaskExecutor.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class bt7 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ReBookingArgs $args;
    final /* synthetic */ BookingScreenParams $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ com.vk.ecomm.onlinebooking.impl.preloader.presentation.e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt7(com.vk.ecomm.onlinebooking.impl.preloader.presentation.e eVar, ReBookingArgs reBookingArgs, BookingScreenParams bookingScreenParams, spj<? super bt7> spjVar) {
        super(2, spjVar);
        this.this$0 = eVar;
        this.$args = reBookingArgs;
        this.$params = bookingScreenParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        bt7 bt7Var = new bt7(this.this$0, this.$args, this.$params, spjVar);
        bt7Var.L$0 = obj;
        return bt7Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((bt7) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                com.vk.ecomm.onlinebooking.impl.preloader.presentation.e eVar = this.this$0;
                ReBookingArgs reBookingArgs = this.$args;
                UserId userId = this.$params.b;
                this.L$0 = yvjVar;
                this.label = 1;
                obj = com.vk.ecomm.onlinebooking.impl.preloader.presentation.e.v(eVar, reBookingArgs, userId, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            zvj.e(yvjVar);
            com.vk.ecomm.onlinebooking.impl.preloader.presentation.e.t(this.this$0, (xye0) obj, this.$params);
        } catch (Exception e) {
            this.this$0.c(new is7.b(e));
            vs7.a(this.this$0, this.$params);
        }
        return s3q0.a;
    }
}
