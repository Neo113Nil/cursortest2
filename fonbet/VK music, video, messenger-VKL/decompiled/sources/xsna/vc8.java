package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.rc8;

/* compiled from: BringIntoViewRelocator.kt */
@b6l(c = "com.vk.core.compose.utils.BringIntoViewRelocatorKt$relocate$1$1$1", f = "BringIntoViewRelocator.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class vc8 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $imeIsVisible;
    final /* synthetic */ wh50<tny> $inputCoordinates$delegate;
    final /* synthetic */ wh50<Boolean> $isFocused$delegate;
    final /* synthetic */ qc8 $relocator;
    final /* synthetic */ yc8 $requester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc8(boolean z, yc8 yc8Var, qc8 qc8Var, wh50<Boolean> wh50Var, wh50<tny> wh50Var2, spj<? super vc8> spjVar) {
        super(2, spjVar);
        this.$imeIsVisible = z;
        this.$requester = yc8Var;
        this.$relocator = qc8Var;
        this.$isFocused$delegate = wh50Var;
        this.$inputCoordinates$delegate = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vc8(this.$imeIsVisible, this.$requester, this.$relocator, this.$isFocused$delegate, this.$inputCoordinates$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vc8) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zhf0 zhf0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$imeIsVisible && this.$isFocused$delegate.getValue().booleanValue()) {
                yc8 yc8Var = this.$requester;
                tny value = this.$inputCoordinates$delegate.getValue();
                float f = ((rc8.a) ((zak0) ((rc8) this.$relocator).a).getValue()).a;
                if (value != null) {
                    long w = pli.w(value.a());
                    zhf0Var = p490.e(0L, mxj0.a(w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (4294967295L & w)) + f, 1));
                } else {
                    zhf0Var = null;
                }
                this.label = 1;
                if (yc8Var.a(zhf0Var, this) == coroutineSingletons) {
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
