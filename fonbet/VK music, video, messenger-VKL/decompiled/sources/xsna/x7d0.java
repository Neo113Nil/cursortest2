package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PrimaryBlockGoodsContentImpl.kt */
@b6l(c = "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl$Content$2$1", f = "PrimaryBlockGoodsContentImpl.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class x7d0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ xvy $state;
    int label;
    final /* synthetic */ d8d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7d0(d8d0 d8d0Var, xvy xvyVar, spj<? super x7d0> spjVar) {
        super(2, spjVar);
        this.this$0 = d8d0Var;
        this.$state = xvyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new x7d0(this.this$0, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((x7d0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.this$0.v().c && this.$state.j().d() > 1) {
                xvy xvyVar = this.$state;
                int d = xvyVar.j().d() - 1;
                this.label = 1;
                if (xvyVar.k(d, 0, this) == coroutineSingletons) {
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
