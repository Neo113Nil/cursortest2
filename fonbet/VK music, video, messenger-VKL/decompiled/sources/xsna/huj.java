package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CoreTextField.kt */
@b6l(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {346}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class huj extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yc8 $bringIntoViewRequester;
    final /* synthetic */ mjo0 $layoutResult;
    final /* synthetic */ uv70 $offsetMapping;
    final /* synthetic */ j1z $state;
    final /* synthetic */ tho0 $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huj(yc8 yc8Var, tho0 tho0Var, j1z j1zVar, mjo0 mjo0Var, uv70 uv70Var, spj<? super huj> spjVar) {
        super(2, spjVar);
        this.$bringIntoViewRequester = yc8Var;
        this.$value = tho0Var;
        this.$state = j1zVar;
        this.$layoutResult = mjo0Var;
        this.$offsetMapping = uv70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new huj(this.$bringIntoViewRequester, this.$value, this.$state, this.$layoutResult, this.$offsetMapping, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((huj) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long a;
        zhf0 zhf0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yc8 yc8Var = this.$bringIntoViewRequester;
            tho0 tho0Var = this.$value;
            sdo0 sdo0Var = this.$state.a;
            ljo0 ljo0Var = this.$layoutResult.a;
            uv70 uv70Var = this.$offsetMapping;
            this.label = 1;
            int b = uv70Var.b(qko0.e(tho0Var.b));
            if (b < ljo0Var.a.a.c.length()) {
                zhf0Var = ljo0Var.b(b);
            } else if (b != 0) {
                zhf0Var = ljo0Var.b(b - 1);
            } else {
                a = sfo0.a(sdo0Var.b, sdo0Var.g, sdo0Var.h, sfo0.a, 1);
                zhf0Var = new zhf0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, (int) (a & 4294967295L));
            }
            Object a2 = yc8Var.a(zhf0Var, this);
            if (a2 != coroutineSingletons) {
                a2 = s3q0.a;
            }
            if (a2 == coroutineSingletons) {
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
