package xsna;

import com.vk.reefton.protocol.ReefProtocol$Event;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PrimaryBlockServicesTileContentImpl.kt */
@b6l(c = "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesTileContentImpl$Content$2$1", f = "PrimaryBlockServicesTileContentImpl.kt", l = {ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED_VALUE}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class z8d0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ xvy $state;
    int label;
    final /* synthetic */ f9d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8d0(f9d0 f9d0Var, xvy xvyVar, spj<? super z8d0> spjVar) {
        super(2, spjVar);
        this.this$0 = f9d0Var;
        this.$state = xvyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new z8d0(this.this$0, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((z8d0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (((sa10) ((zak0) this.this$0.e).getValue()).c && this.$state.j().d() > 1) {
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
