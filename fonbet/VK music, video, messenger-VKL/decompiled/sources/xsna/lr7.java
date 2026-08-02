package xsna;

import android.view.View;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BookingMastersScreen.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreenKt$BookingMastersScreen$6$2$1", f = "BookingMastersScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class lr7 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Object $performanceSession;
    final /* synthetic */ Object $uiMeasuring;
    final /* synthetic */ View $view;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr7(Object obj, View view, Object obj2, spj<? super lr7> spjVar) {
        super(2, spjVar);
        this.$uiMeasuring = obj;
        this.$view = view;
        this.$performanceSession = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lr7(this.$uiMeasuring, this.$view, this.$performanceSession, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lr7) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        mzp0 mzp0Var = (mzp0) this.$uiMeasuring;
        if (mzp0Var != null) {
            mzp0Var.d(this.$view);
        }
        yw90 yw90Var = (yw90) this.$performanceSession;
        if (yw90Var != null) {
            yw90Var.a();
        }
        return s3q0.a;
    }
}
