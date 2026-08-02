package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ViewExt.kt */
@b6l(c = "com.vk.uxpolls.coroutine.extension.ViewExtKt$viewScope$scope$1$1", f = "ViewExt.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class rwt0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Object $this_viewScope;
    final /* synthetic */ Throwable $throwable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwt0(Object obj, Throwable th, spj<? super rwt0> spjVar) {
        super(2, spjVar);
        this.$this_viewScope = obj;
        this.$throwable = th;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rwt0(this.$this_viewScope, this.$throwable, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rwt0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ((ewj) this.$this_viewScope).onError(this.$throwable);
        return s3q0.a;
    }
}
