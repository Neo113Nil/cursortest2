package xsna;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ub9;

/* compiled from: ListenableFuture.kt */
@b6l(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class zgz extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<yvj, spj<Object>, Object> $block;
    final /* synthetic */ ub9.a<Object> $completer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zgz(wzs<? super yvj, ? super spj<Object>, ? extends Object> wzsVar, ub9.a<Object> aVar, spj<? super zgz> spjVar) {
        super(2, spjVar);
        this.$block = wzsVar;
        this.$completer = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        zgz zgzVar = new zgz(this.$block, this.$completer, spjVar);
        zgzVar.L$0 = obj;
        return zgzVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zgz) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar = (yvj) this.L$0;
                wzs<yvj, spj<Object>, Object> wzsVar = this.$block;
                this.label = 1;
                obj = wzsVar.invoke(yvjVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.$completer.b(obj);
        } catch (CancellationException unused) {
            this.$completer.c();
        } catch (Throwable th) {
            this.$completer.d(th);
        }
        return s3q0.a;
    }
}
