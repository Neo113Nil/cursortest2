package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dz40;

/* compiled from: PlaybackQueue.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue$MutableQueueItems$1$1", f = "PlaybackQueue.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ywa0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ SnapshotStateList<dz40.o> $listSnapshot;
    int label;
    final /* synthetic */ gxa0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywa0(SnapshotStateList<dz40.o> snapshotStateList, gxa0 gxa0Var, spj<? super ywa0> spjVar) {
        super(2, spjVar);
        this.$listSnapshot = snapshotStateList;
        this.this$0 = gxa0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ywa0(this.$listSnapshot, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ywa0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$listSnapshot.clear();
        this.$listSnapshot.addAll(new wow(this.this$0.h().a()));
        return s3q0.a;
    }
}
