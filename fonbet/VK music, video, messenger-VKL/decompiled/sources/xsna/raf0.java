package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RecomThemesChooserScene.kt */
@b6l(c = "com.vk.onboardingscreens.impl.recomthemes.presentation.view.RecomThemesChooserSceneKt$RecomThemesChooserScene$2$1", f = "RecomThemesChooserScene.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class raf0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ dsy $gridState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public raf0(dsy dsyVar, spj<? super raf0> spjVar) {
        super(2, spjVar);
        this.$gridState = dsyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new raf0(this.$gridState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((raf0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            dsy dsyVar = this.$gridState;
            this.label = 1;
            fh9 fh9Var = dsy.w;
            dsyVar.getClass();
            Object b = dsyVar.b(MutatePriority.Default, new zry(dsyVar, 0, 0, null), this);
            if (b != coroutineSingletons) {
                b = s3q0.a;
            }
            if (b == coroutineSingletons) {
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
