package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.xv7;

/* compiled from: BookingRecordsScreenFeature.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.records.BookingRecordsScreenFeature$loadInitialData$1", f = "BookingRecordsScreenFeature.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class gv7 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ dv7 $action;
    final /* synthetic */ BookingScreenParams $params;
    final /* synthetic */ BookingActionResult $result;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ev7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv7(ev7 ev7Var, BookingScreenParams bookingScreenParams, BookingActionResult bookingActionResult, dv7 dv7Var, spj<? super gv7> spjVar) {
        super(2, spjVar);
        this.this$0 = ev7Var;
        this.$params = bookingScreenParams;
        this.$result = bookingActionResult;
        this.$action = dv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        gv7 gv7Var = new gv7(this.this$0, this.$params, this.$result, this.$action, spjVar);
        gv7Var.L$0 = obj;
        return gv7Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((gv7) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                zu7 zu7Var = this.this$0.g;
                UserId userId = this.$params.b;
                this.L$0 = yvjVar;
                this.label = 1;
                obj = zu7.d(zu7Var, userId, 0, this, 6);
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
            this.this$0.T(new xv7.d((cv7) obj, this.$params, this.$result));
        } catch (Exception e) {
            zvj.e(yvjVar);
            this.this$0.T(new xv7.c(e, this.$action));
        }
        return s3q0.a;
    }
}
