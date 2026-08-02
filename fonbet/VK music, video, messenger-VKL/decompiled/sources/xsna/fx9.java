package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CartLoading.kt */
@b6l(c = "com.vk.ecomm.cart.impl.cart.ui.compose.CartLoadingKt$CartLoading$2$1", f = "CartLoading.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class fx9 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ egz $warmUpContent;
    final /* synthetic */ xvy $warmUpListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx9(xvy xvyVar, egz egzVar, spj<? super fx9> spjVar) {
        super(2, spjVar);
        this.$warmUpListState = xvyVar;
        this.$warmUpContent = egzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fx9(this.$warmUpListState, this.$warmUpContent, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fx9) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            xvy xvyVar = this.$warmUpListState;
            int size = this.$warmUpContent.a.size() - 1;
            this.label = 1;
            fh9 fh9Var = xvy.y;
            if (xvyVar.f(size, this) == coroutineSingletons) {
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
