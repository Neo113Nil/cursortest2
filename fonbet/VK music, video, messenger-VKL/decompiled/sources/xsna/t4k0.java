package xsna;

import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SmartCropInlineActor.kt */
@b6l(c = "com.vk.video.ui.smartcrop.impl.presentation.feature.store.SmartCropInlineActor$restoreCropVideoLongPoll$1$1", f = "SmartCropInlineActor.kt", l = {233}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class t4k0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ SmartCropState.CropVideoProgress $progress;
    int label;
    final /* synthetic */ w4k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4k0(w4k0 w4k0Var, SmartCropState.CropVideoProgress cropVideoProgress, spj<? super t4k0> spjVar) {
        super(2, spjVar);
        this.this$0 = w4k0Var;
        this.$progress = cropVideoProgress;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new t4k0(this.this$0, this.$progress, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((t4k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            w4k0 w4k0Var = this.this$0;
            long longValue = this.$progress.b.longValue();
            this.label = 1;
            if (w4k0.m(w4k0Var, longValue, this) == coroutineSingletons) {
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
