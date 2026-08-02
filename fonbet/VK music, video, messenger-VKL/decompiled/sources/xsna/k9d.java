package xsna;

import android.content.Context;
import com.vk.media.pipeline.model.timeline.Timeline;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;

/* compiled from: ClipPlayer.kt */
@b6l(c = "com.vk.clips.upload.vk.impl.preview.compose.ClipPlayerKt$Player$1$2$1", f = "ClipPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class k9d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ azl $density;
    final /* synthetic */ o2b0 $playerListener;
    final /* synthetic */ e3b0 $playerRelatedUiData;
    final /* synthetic */ va8 $this_BoxWithConstraints;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9d(e3b0 e3b0Var, Context context, o2b0 o2b0Var, azl azlVar, va8 va8Var, spj<? super k9d> spjVar) {
        super(2, spjVar);
        this.$playerRelatedUiData = e3b0Var;
        this.$context = context;
        this.$playerListener = o2b0Var;
        this.$density = azlVar;
        this.$this_BoxWithConstraints = va8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new k9d(this.$playerRelatedUiData, this.$context, this.$playerListener, this.$density, this.$this_BoxWithConstraints, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((k9d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        e3b0 e3b0Var = this.$playerRelatedUiData;
        cv10 cv10Var = e3b0Var.c;
        Context context = this.$context;
        o2b0 o2b0Var = this.$playerListener;
        azl azlVar = this.$density;
        va8 va8Var = this.$this_BoxWithConstraints;
        int r0 = azlVar.r0(va8Var.j());
        int r02 = azlVar.r0(va8Var.g());
        cv10Var.g(new apk(e3b0Var.b, context, e3b0Var.d));
        cv10Var.d(new d80(3));
        OneVideoPlayer a = cv10Var.a();
        a.R(RepeatMode.ONE);
        a.d0(o2b0Var);
        cv10Var.e(new g0b0((Timeline) e3b0Var.a, r0, r02), 0L);
        return s3q0.a;
    }
}
