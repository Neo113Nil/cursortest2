package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BookingCalendarDayBlockView.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.calendar.ui.HeaderImpl$Content$1$1$3$1$1", f = "BookingCalendarDayBlockView.kt", l = {203}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class exu extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ fxu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exu(fxu fxuVar, spj<? super exu> spjVar) {
        super(2, spjVar);
        this.this$0 = fxuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new exu(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((exu) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            fxu fxuVar = this.this$0;
            xvy xvyVar = fxuVar.b;
            float floatValue = ((Number) fxuVar.g.getValue()).floatValue();
            this.label = 1;
            g = fdi.g(xvyVar, floatValue, jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7), this);
            if (g == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
