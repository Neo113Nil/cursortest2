package xsna;

import com.vk.api.generated.messages.dto.MessagesGetChatOnlineResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ChatOnlineMembersRemoteDataSource.kt */
@b6l(c = "com.vk.im.chat.onlines.impl.source.ChatOnlineMembersRemoteDataSourceImpl$loadCounters$2", f = "ChatOnlineMembersRemoteDataSource.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class bub extends SuspendLambda implements wzs<yvj, spj<? super Integer>, Object> {
    final /* synthetic */ Peer $ownerId;
    final /* synthetic */ Peer $peer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bub(Peer peer, Peer peer2, spj<? super bub> spjVar) {
        super(2, spjVar);
        this.$peer = peer;
        this.$ownerId = peer2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new bub(this.$peer, this.$ownerId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Integer> spjVar) {
        return ((bub) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                kotlin.a.a(obj);
                Long l = new Long(this.$peer.b);
                Peer peer = this.$ownerId;
                peer.getClass();
                if (!peer.Ab(Peer.Type.GROUP)) {
                    peer = null;
                }
                UserId userId = peer != null ? new UserId(peer.d) : null;
                tfx tfxVar = new tfx("messages.getChatOnline", new jq(24), new kq(23));
                tfx.m(tfxVar, "peer_id", l.longValue(), 0L, 12);
                if (userId != null) {
                    tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
                }
                iz2 A = yfb.A(tfxVar);
                this.label = 1;
                obj = evj.p(A, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            i = ((MessagesGetChatOnlineResponseDto) obj).d();
        } catch (Throwable th) {
            L.i(th);
            i = 0;
        }
        return new Integer(i);
    }
}
