package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Binder.kt */
@b6l(c = "com.vk.mvi.binder.compose.BinderKt$Events$2$1$job$1$1$1", f = "Binder.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class s37 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ a47<Object> $binderScope;
    final /* synthetic */ yzs<z37<Object>, Object, spj<? super s3q0>, Object> $events;
    final /* synthetic */ Object $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s37(yzs<? super z37<Object>, Object, ? super spj<? super s3q0>, ? extends Object> yzsVar, a47<Object> a47Var, Object obj, spj<? super s37> spjVar) {
        super(2, spjVar);
        this.$events = yzsVar;
        this.$binderScope = a47Var;
        this.$it = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xsna.pk50] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new s37(this.$events, this.$binderScope, this.$it, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((s37) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yzs<z37<Object>, Object, spj<? super s3q0>, Object> yzsVar = this.$events;
            a47<Object> a47Var = this.$binderScope;
            Object obj2 = this.$it;
            this.label = 1;
            if (yzsVar.invoke(a47Var, obj2, this) == coroutineSingletons) {
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
