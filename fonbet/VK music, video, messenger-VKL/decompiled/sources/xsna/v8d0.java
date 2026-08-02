package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PrimaryBlockServicesListContentImpl.kt */
@b6l(c = "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesListContentImpl$Content$1$1", f = "PrimaryBlockServicesListContentImpl.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class v8d0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ dsy $state;
    int label;
    final /* synthetic */ w8d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8d0(w8d0 w8d0Var, dsy dsyVar, spj<? super v8d0> spjVar) {
        super(2, spjVar);
        this.this$0 = w8d0Var;
        this.$state = dsyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new v8d0(this.this$0, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((v8d0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.this$0.e0().c && this.$state.i().d() > 1) {
                dsy dsyVar = this.$state;
                int d = dsyVar.i().d() - 1;
                this.label = 1;
                if (dsy.j(dsyVar, d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
