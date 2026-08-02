package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.ud90;

/* compiled from: VkPaginationDots.kt */
@b6l(c = "com.vk.core.compose.component.pagination.VkPaginationDotsKt$VkPaginationDots$animateScrollBy$2", f = "VkPaginationDots.kt", l = {Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class rav0 extends SuspendLambda implements wzs<ggh0, spj<? super s3q0>, Object> {
    final /* synthetic */ ud90.a $animationSpecFactory;
    final /* synthetic */ Ref$FloatRef $previousValue;
    final /* synthetic */ Ref$FloatRef $targetValue;
    final /* synthetic */ kg50 $unconsumedScrollPx$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rav0(Ref$FloatRef ref$FloatRef, ud90.a aVar, Ref$FloatRef ref$FloatRef2, kg50 kg50Var, spj<? super rav0> spjVar) {
        super(2, spjVar);
        this.$targetValue = ref$FloatRef;
        this.$animationSpecFactory = aVar;
        this.$previousValue = ref$FloatRef2;
        this.$unconsumedScrollPx$delegate = kg50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        rav0 rav0Var = new rav0(this.$targetValue, this.$animationSpecFactory, this.$previousValue, this.$unconsumedScrollPx$delegate, spjVar);
        rav0Var.L$0 = obj;
        return rav0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ggh0 ggh0Var, spj<? super s3q0> spjVar) {
        return ((rav0) create(ggh0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final ggh0 ggh0Var = (ggh0) this.L$0;
            float f = this.$targetValue.element;
            dtp0 a = this.$animationSpecFactory.a();
            final Ref$FloatRef ref$FloatRef = this.$previousValue;
            final Ref$FloatRef ref$FloatRef2 = this.$targetValue;
            final kg50 kg50Var = this.$unconsumedScrollPx$delegate;
            wzs wzsVar = new wzs() { // from class: xsna.qav0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    float floatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).floatValue();
                    Ref$FloatRef ref$FloatRef3 = Ref$FloatRef.this;
                    float f2 = ref$FloatRef3.element;
                    float f3 = ggh0Var.f(floatValue - f2) + f2;
                    ref$FloatRef3.element = f3;
                    kg50Var.g(ref$FloatRef2.element - f3);
                    return s3q0.a;
                }
            };
            this.label = 1;
            if (nkn0.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a, wzsVar, this, 4) == coroutineSingletons) {
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
