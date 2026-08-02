package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.utils.swipable.DismissValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkSnackbarHost.kt */
@b6l(c = "com.vk.core.compose.snackbar.VkSnackbarHostKt$FadeInFadeOutWithScale$1$1$2$1", f = "VkSnackbarHost.kt", l = {248}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ykv0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ if2<Float, sq2> $dismissAlpha;
    final /* synthetic */ ccn $dismissState;
    int label;

    /* compiled from: VkSnackbarHost.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ ccn b;
        public final /* synthetic */ if2<Float, sq2> c;

        public a(ccn ccnVar, if2<Float, sq2> if2Var) {
            this.b = ccnVar;
            this.c = if2Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            float floatValue = ((Number) obj).floatValue();
            ccn ccnVar = this.b;
            DismissValue dismissValue = (DismissValue) ccnVar.a.f.getValue();
            DismissValue dismissValue2 = DismissValue.Default;
            if2<Float, sq2> if2Var = this.c;
            if (dismissValue != dismissValue2 && ccnVar.a() == dismissValue2) {
                Object e = if2Var.e(new Float(1.0f - floatValue), spjVar);
                return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
            }
            if (ccnVar.a() == dismissValue2) {
                Object e2 = if2Var.e(new Float(1.0f), spjVar);
                return e2 == CoroutineSingletons.COROUTINE_SUSPENDED ? e2 : s3q0.a;
            }
            Object e3 = if2Var.e(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), spjVar);
            return e3 == CoroutineSingletons.COROUTINE_SUSPENDED ? e3 : s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykv0(ccn ccnVar, if2<Float, sq2> if2Var, spj<? super ykv0> spjVar) {
        super(2, spjVar);
        this.$dismissState = ccnVar;
        this.$dismissAlpha = if2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ykv0(this.$dismissState, this.$dismissAlpha, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ykv0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 M = nr2.M(new lqs0(this.$dismissState, 10));
            a aVar = new a(this.$dismissState, this.$dismissAlpha);
            this.label = 1;
            if (M.collect(aVar, this) == coroutineSingletons) {
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
