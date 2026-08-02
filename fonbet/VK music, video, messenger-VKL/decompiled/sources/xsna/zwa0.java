package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlaybackQueue.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue$MutableQueueItems$2$1$1", f = "PlaybackQueue.kt", l = {171}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class zwa0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ zzf0 $reorderState;
    int I$0;
    int label;
    final /* synthetic */ gxa0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwa0(zzf0 zzf0Var, gxa0 gxa0Var, spj<? super zwa0> spjVar) {
        super(2, spjVar);
        this.$reorderState = zzf0Var;
        this.this$0 = gxa0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zwa0(this.$reorderState, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zwa0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.a.a(obj);
            i = this.$reorderState.f() != null ? 1 : 0;
            if (i == 0) {
                this.I$0 = i;
                this.label = 1;
                if (qsl.b(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i2 = i;
            }
            this.this$0.b.setValue(Boolean.valueOf(i != 0));
            return s3q0.a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = this.I$0;
        kotlin.a.a(obj);
        i = i2;
        this.this$0.b.setValue(Boolean.valueOf(i != 0));
        return s3q0.a;
    }
}
