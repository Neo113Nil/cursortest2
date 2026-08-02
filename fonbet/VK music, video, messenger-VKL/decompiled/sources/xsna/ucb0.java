package xsna;

import com.vk.video.playlist.playlistscreen.ui.store.PlaylistScreenInlineActor$listenVideoDataChangedEvents$2$invokeSuspend$$inlined$filter$1$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.el50;
import xsna.ln50;

/* compiled from: PlaylistScreenInlineActor.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.ui.store.PlaylistScreenInlineActor$listenVideoDataChangedEvents$2", f = "PlaylistScreenInlineActor.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ucb0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ vcb0 $this_listenVideoDataChangedEvents;
    int label;

    /* compiled from: PlaylistScreenInlineActor.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ vcb0 b;

        public a(vcb0 vcb0Var) {
            this.b = vcb0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            rn50 rn50Var = new rn50("SectionStoresLoadTask");
            vcb0 vcb0Var = this.b;
            qhf qhfVar = new qhf(new g60(vcb0Var, 17), 1);
            vcb0Var.getClass();
            el50.a.a(vcb0Var, rn50Var, ln50.a.c, qhfVar);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucb0(vcb0 vcb0Var, spj<? super ucb0> spjVar) {
        super(2, spjVar);
        this.$this_listenVideoDataChangedEvents = vcb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ucb0(this.$this_listenVideoDataChangedEvents, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ucb0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            nb9 a2 = cdn.a(wjs0.b);
            a aVar = new a(this.$this_listenVideoDataChangedEvents);
            this.label = 1;
            Object collect = a2.collect(new PlaylistScreenInlineActor$listenVideoDataChangedEvents$2$invokeSuspend$$inlined$filter$1$2(aVar), this);
            if (collect != coroutineSingletons) {
                collect = s3q0.a;
            }
            if (collect == coroutineSingletons) {
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
