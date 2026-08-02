package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CollapsibleSheet.kt */
@b6l(c = "com.vk.search.communities.map.impl.ui.details.compose.component.CollapsingDetailsStateKt$CollapsibleSheet$2$1", f = "CollapsibleSheet.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class b4g extends SuspendLambda implements yzs<yvj, Float, spj<? super s3q0>, Object> {
    final /* synthetic */ a4g $state;
    /* synthetic */ float F$0;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4g(a4g a4gVar, spj<? super b4g> spjVar) {
        super(3, spjVar);
        this.$state = a4gVar;
    }

    @Override // xsna.yzs
    public final Object invoke(yvj yvjVar, Float f, spj<? super s3q0> spjVar) {
        float floatValue = f.floatValue();
        b4g b4gVar = new b4g(this.$state, spjVar);
        b4gVar.F$0 = floatValue;
        return b4gVar.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f = this.F$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ?? r2 = 0;
            r2 = 0;
            if (Math.abs(f) >= 6000.0f ? f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.$state.k() > 0.5f) {
                r2 = 1;
            }
            a4g a4gVar = this.$state;
            this.F$0 = f;
            this.I$0 = r2;
            this.label = 1;
            if (a4gVar.c(r2, f, this) == coroutineSingletons) {
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
