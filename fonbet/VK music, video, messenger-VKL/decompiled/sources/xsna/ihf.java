package xsna;

import androidx.car.app.hardware.common.CarZone;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsUploadScreenContent.kt */
@b6l(c = "com.vk.clips.upload.ui.impl.compose.views.content.ClipsUploadScreenContentKt$ClipsUploadScreenContent$1$1", f = "ClipsUploadScreenContent.kt", l = {CarZone.CAR_ZONE_COLUMN_DRIVER}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ihf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ rg50 $framesCount$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihf(rg50 rg50Var, spj<? super ihf> spjVar) {
        super(2, spjVar);
        this.$framesCount$delegate = rg50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ihf(this.$framesCount$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ihf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        while (this.$framesCount$delegate.getIntValue() < 3) {
            gr3 gr3Var = new gr3(this.$framesCount$delegate, 21);
            this.label = 1;
            if (i830.a(getContext()).k(gr3Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return s3q0.a;
    }
}
