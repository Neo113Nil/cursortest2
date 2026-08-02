package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.video.recast.domain.model.PlaybackSnapshot;
import com.vk.video.ui.discovery.minimizable.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SubscriptionProposalHolder.kt */
@b6l(c = "com.vk.video.ui.discovery.minimizable.player.views.SubscriptionProposalHolder$onCurrentRoomChanged$1", f = "SubscriptionProposalHolder.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class qzm0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ tlg0 $room;
    int label;
    final /* synthetic */ szm0 this$0;

    /* compiled from: SubscriptionProposalHolder.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ szm0 b;

        public a(szm0 szm0Var) {
            this.b = szm0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            PlaybackSnapshot playbackSnapshot = (PlaybackSnapshot) obj;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"SUBSCRIPTION_PROPOSAL_HOLDER", "New playbackState: " + playbackSnapshot});
            }
            this.b.g.invoke(new c.x0(playbackSnapshot));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzm0(tlg0 tlg0Var, szm0 szm0Var, spj<? super qzm0> spjVar) {
        super(2, spjVar);
        this.$room = tlg0Var;
        this.this$0 = szm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qzm0(this.$room, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qzm0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ksr<PlaybackSnapshot> playbackState = this.$room.getPlaybackState();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (playbackState.collect(aVar, this) == coroutineSingletons) {
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
