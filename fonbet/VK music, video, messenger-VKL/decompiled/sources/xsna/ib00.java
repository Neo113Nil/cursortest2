package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LyricsPage.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.LyricsPageKt$ContentLyrics$3$1", f = "LyricsPage.kt", l = {Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ib00 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Object $lyricsUiMeasuringSession;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib00(Object obj, spj<? super ib00> spjVar) {
        super(2, spjVar);
        this.$lyricsUiMeasuringSession = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ib00(this.$lyricsUiMeasuringSession, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ib00) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.label = 1;
            if (ktu.c(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        mzp0 mzp0Var = (mzp0) this.$lyricsUiMeasuringSession;
        mzp0Var.d(null);
        mzp0Var.h();
        return s3q0.a;
    }
}
