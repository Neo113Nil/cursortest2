package xsna;

import android.app.Activity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WindowInfoTrackerImpl.kt */
@b6l(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f = "WindowInfoTrackerImpl.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class xpx0 extends SuspendLambda implements wzs<zhd0<? super erx0>, spj<? super s3q0>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ypx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpx0(ypx0 ypx0Var, Activity activity, spj<? super xpx0> spjVar) {
        super(2, spjVar);
        this.this$0 = ypx0Var;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        xpx0 xpx0Var = new xpx0(this.this$0, this.$activity, spjVar);
        xpx0Var.L$0 = obj;
        return xpx0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super erx0> zhd0Var, spj<? super s3q0> spjVar) {
        return ((xpx0) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final zhd0 zhd0Var = (zhd0) this.L$0;
            o7j<erx0> o7jVar = new o7j() { // from class: xsna.vpx0
                @Override // xsna.o7j
                public final void accept(Object obj2) {
                    zhd0.this.f((erx0) obj2);
                }
            };
            this.this$0.b.a(this.$activity, new ddk(), o7jVar);
            wpx0 wpx0Var = new wpx0(0, this.this$0, o7jVar);
            this.label = 1;
            if (phd0.a(zhd0Var, wpx0Var, this) == coroutineSingletons) {
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
