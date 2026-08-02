package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: VideoDescriptionDelegate.kt */
@b6l(c = "com.vk.libvideo.bottomsheet.about.delegate.VideoDescriptionDelegateKt$LiveTimer$1$1", f = "VideoDescriptionDelegate.kt", l = {442}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ues0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ rg50 $elapsed$delegate;
    final /* synthetic */ int $startTimeSec;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ues0(int i, rg50 rg50Var, spj<? super ues0> spjVar) {
        super(2, spjVar);
        this.$startTimeSec = i;
        this.$elapsed$delegate = rg50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ues0(this.$startTimeSec, this.$elapsed$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ues0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        do {
            this.$elapsed$delegate.C((int) ((System.currentTimeMillis() / 1000) - this.$startTimeSec));
            zno.a aVar = zno.c;
            f = eoo.f(1000L, DurationUnit.MILLISECONDS);
            this.label = 1;
        } while (qsl.c(f, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
