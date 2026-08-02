package xsna;

import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicTrackCellVh.kt */
@b6l(c = "com.vk.catalog2.feature.music.holders.MusicTrackCellVh$showHint$1", f = "MusicTrackCellVh.kt", l = {419}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class sa50 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ MusicTrackCellVh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa50(MusicTrackCellVh musicTrackCellVh, spj<? super sa50> spjVar) {
        super(2, spjVar);
        this.this$0 = musicTrackCellVh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new sa50(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((sa50) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            MusicTrackCellVh musicTrackCellVh = this.this$0;
            nm8 nm8Var = musicTrackCellVh.s;
            qna qnaVar = new qna(musicTrackCellVh.z, new qfj(musicTrackCellVh, 26));
            this.label = 1;
            if (nm8Var.t(qnaVar, this) == coroutineSingletons) {
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
