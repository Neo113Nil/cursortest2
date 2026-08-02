package xsna;

import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.eventhub.api.Message;
import com.vk.network.eventhub.api.MessageErrorHandler$ExpireStrategy;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: ChannelEventHubService.kt */
/* loaded from: classes2.dex */
public final class nya {
    public final /* synthetic */ laq a;
    public final /* synthetic */ oya b;

    public nya(laq laqVar, oya oyaVar) {
        this.a = laqVar;
        this.b = oyaVar;
    }

    public final void a(MessageErrorHandler$ExpireStrategy messageErrorHandler$ExpireStrategy, String str) {
        oya oyaVar = this.b;
        w2w w2wVar = oyaVar.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"ChannelEventHubService expiredHistory: " + str + ' ' + messageErrorHandler$ExpireStrategy});
        }
        laq laqVar = this.a;
        laqVar.b();
        boolean z = messageErrorHandler$ExpireStrategy instanceof MessageErrorHandler$ExpireStrategy.b;
        if (z) {
            oyaVar.b.I0().u(new wj2(((MessageErrorHandler$ExpireStrategy.b) messageErrorHandler$ExpireStrategy).a, 1));
        } else {
            w2wVar.I0().u(new com.vk.movika.sdk.base.observable.q(this, 16));
        }
        if (messageErrorHandler$ExpireStrategy.equals(MessageErrorHandler$ExpireStrategy.a.a)) {
            w2wVar.I0().system().g();
            w2wVar.I0().u(new com.vk.movika.sdk.base.observable.s(12));
        } else if (messageErrorHandler$ExpireStrategy instanceof MessageErrorHandler$ExpireStrategy.c) {
            w2wVar.I0().system().l(((MessageErrorHandler$ExpireStrategy.c) messageErrorHandler$ExpireStrategy).a);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            MessageErrorHandler$ExpireStrategy.b bVar = (MessageErrorHandler$ExpireStrategy.b) messageErrorHandler$ExpireStrategy;
            w2wVar.I0().system().o(bVar.b, bVar.a);
        }
        w2wVar.e1(this, new OnChannelsCacheInvalidateEvent("ChannelEventHubService", OnChannelsCacheInvalidateEvent.Reason.SPACE));
        w2wVar.e1(this, new q680(this));
        laqVar.e();
        if (!z) {
            oyaVar.a();
            return;
        }
        String str2 = ((MessageErrorHandler$ExpireStrategy.b) messageErrorHandler$ExpireStrategy).a;
        qzp qzpVar = oyaVar.c;
        JSONObject put = new JSONObject().put("action", "subscribe").put("payload", new JSONObject().put("type", "big_channel").put("queue", str2).putOpt(SignalingProtocol.KEY_OFFSET, w2wVar.I0().system().h(str2)));
        AtomicLong atomicLong = Message.e;
        qzpVar.e(Message.a.a((byte) 1, put));
    }

    public final void b(String str) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.e, new Object[]{go9.b("ChannelEventHubService methoderror: ", str)});
        }
        laq laqVar = this.a;
        laqVar.b();
        laqVar.e();
        this.b.a();
    }
}
