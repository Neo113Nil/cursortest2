package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TabsSheet.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.TabsSheetKt$animateSheetOffset$2", f = "TabsSheet.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class vzn0 extends SuspendLambda implements yzs<fz1, vgo<BigPlayerBottomSheetValue>, spj<? super s3q0>, Object> {
    final /* synthetic */ float $animatableSheetOffset;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzn0(float f, spj<? super vzn0> spjVar) {
        super(3, spjVar);
        this.$animatableSheetOffset = f;
    }

    @Override // xsna.yzs
    public final Object invoke(fz1 fz1Var, vgo<BigPlayerBottomSheetValue> vgoVar, spj<? super s3q0> spjVar) {
        vzn0 vzn0Var = new vzn0(this.$animatableSheetOffset, spjVar);
        vzn0Var.L$0 = fz1Var;
        return vzn0Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fz1 fz1Var = (fz1) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        fz1Var.a(this.$animatableSheetOffset, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return s3q0.a;
    }
}
