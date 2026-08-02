package xsna;

import com.vk.network.eventhub.api.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.a500;

/* compiled from: ChannelEventHubService.kt */
/* loaded from: classes2.dex */
public final class oya implements io.reactivex.rxjava3.disposables.c {
    public final w2w b;
    public final qzp c;
    public final com.vk.im.engine.internal.longpoll.polling_tasks.socket.a d;
    public final io.reactivex.rxjava3.disposables.b e;

    public oya(w2w w2wVar, qzp qzpVar, x3i x3iVar, a500.a aVar) {
        this.b = w2wVar;
        this.c = qzpVar;
        laq laqVar = new laq(24, 500L, 1.5f, 60000L);
        this.d = new com.vk.im.engine.internal.longpoll.polling_tasks.socket.a(w2wVar, x3iVar, new nya(laqVar, this), aVar, laqVar);
        this.e = new io.reactivex.rxjava3.disposables.b();
    }

    public final void a() {
        xgl0 I0 = this.b.I0();
        JSONObject jSONObject = new JSONObject();
        List<Long> e0 = I0.a().e0(true);
        int e = on00.e(c5g.u(e0, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Number number : e0) {
            linkedHashMap.put(Long.valueOf(number.longValue()), I0.system().f(number.longValue()));
        }
        LinkedHashMap h = p4g.h(linkedHashMap);
        final cd4 cd4Var = new cd4(jSONObject, 4);
        h.forEach(new BiConsumer() { // from class: xsna.mya
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                cd4.this.invoke(obj, obj2);
            }
        });
        JSONObject put = new JSONObject().put("action", "subscribe_to_channels").put("payload", new JSONObject().put(RTCStatsConstants.KEY_CHANNELS, jSONObject).putOpt("user", I0.system().p()));
        AtomicLong atomicLong = Message.e;
        this.c.e(Message.a.a((byte) 1, put));
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        this.e.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.e.c;
    }
}
