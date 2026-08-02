package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: SwipeableV2.kt */
@b6l(c = "com.vk.core.compose.utils.swipable.SwipeableV2State$animateTo$2", f = "SwipeableV2.kt", l = {Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class xmn0 extends SuspendLambda implements wzs<pgo, spj<? super s3q0>, Object> {
    final /* synthetic */ Float $targetOffset;
    final /* synthetic */ Object $targetValue;
    final /* synthetic */ float $velocity;
    int label;
    final /* synthetic */ ymn0<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmn0(ymn0<Object> ymn0Var, Object obj, Float f, float f2, spj<? super xmn0> spjVar) {
        super(2, spjVar);
        this.this$0 = ymn0Var;
        this.$targetValue = obj;
        this.$targetOffset = f;
        this.$velocity = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xmn0(this.this$0, this.$targetValue, this.$targetOffset, this.$velocity, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(pgo pgoVar, spj<? super s3q0> spjVar) {
        return ((xmn0) create(pgoVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xmn0 xmn0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ((zak0) this.this$0.l).setValue(this.$targetValue);
            Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            Float f = (Float) ((zak0) this.this$0.g).getValue();
            float floatValue = f != null ? f.floatValue() : 0.0f;
            ref$FloatRef.element = floatValue;
            float floatValue2 = this.$targetOffset.floatValue();
            float f2 = this.$velocity;
            ymn0<Object> ymn0Var = this.this$0;
            iq2<Float> iq2Var = ymn0Var.a;
            io7 io7Var = new io7(12, ymn0Var, ref$FloatRef);
            this.label = 1;
            xmn0Var = this;
            if (nkn0.a(floatValue, floatValue2, f2, iq2Var, io7Var, xmn0Var) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            xmn0Var = this;
        }
        ((zak0) xmn0Var.this$0.i).setValue(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        return s3q0.a;
    }
}
