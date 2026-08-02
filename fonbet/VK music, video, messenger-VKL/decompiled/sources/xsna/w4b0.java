package xsna;

import android.view.Surface;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlayerSurface.kt */
@b6l(c = "com.vk.video.ui.upload.impl.videoviewer.presentation.compose.playersurface.PlayerSurfaceKt$MediaView$onSurfaceInitialized$1$1$1", f = "PlayerSurface.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class w4b0 extends SuspendLambda implements a0t<mjn0, Surface, Integer, Integer, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<Surface, s3q0> $onSurfaceChanged;
    final /* synthetic */ izs<Surface, s3q0> $onSurfaceCreated;
    final /* synthetic */ gzs<s3q0> $onSurfaceDestroyed;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w4b0(izs<? super Surface, s3q0> izsVar, izs<? super Surface, s3q0> izsVar2, gzs<s3q0> gzsVar, spj<? super w4b0> spjVar) {
        super(5, spjVar);
        this.$onSurfaceCreated = izsVar;
        this.$onSurfaceChanged = izsVar2;
        this.$onSurfaceDestroyed = gzsVar;
    }

    @Override // xsna.a0t
    public final Object invoke(mjn0 mjn0Var, Surface surface, Integer num, Integer num2, spj<? super s3q0> spjVar) {
        num.intValue();
        num2.intValue();
        w4b0 w4b0Var = new w4b0(this.$onSurfaceCreated, this.$onSurfaceChanged, this.$onSurfaceDestroyed, spjVar);
        w4b0Var.L$0 = mjn0Var;
        w4b0Var.L$1 = surface;
        return w4b0Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mjn0 mjn0Var = (mjn0) this.L$0;
        Surface surface = (Surface) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onSurfaceCreated.invoke(surface);
        mjn0Var.a(new zco(1, this.$onSurfaceChanged, surface));
        mjn0Var.c(new je2(1, this.$onSurfaceDestroyed));
        return s3q0.a;
    }
}
