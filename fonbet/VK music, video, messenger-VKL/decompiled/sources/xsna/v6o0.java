package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.longpoll.response_handler.LongPollLiveEventsHandlerImpl;
import com.vk.im.engine.models.LongPollType;
import xsna.a400;
import xsna.v400;
import xsna.w300;

/* compiled from: TaskLongPollLiveMessagesImpl.kt */
/* loaded from: classes2.dex */
public final class v6o0 implements t6o0 {
    public final String a;
    public final LongPollLiveEventsHandlerImpl b;

    public v6o0(String str, LongPollLiveEventsHandlerImpl longPollLiveEventsHandlerImpl) {
        this.a = str;
        this.b = longPollLiveEventsHandlerImpl;
    }

    @Override // xsna.t6o0
    public final a400 a(w2w w2wVar, a400 a400Var, long j) {
        a400.b bVar = (a400.b) a400Var;
        Peer a = mq9.a(w2wVar);
        w300.a aVar = (w300.a) bz2.c(new w300(bVar.c, bVar.b, bVar.a.b, a, j, this.a, new com.vk.im.engine.internal.api_parsers.a(w2wVar.getExperiments())), "LongPollApiCmd");
        this.b.a(aVar.c, com.vk.im.engine.internal.longpoll.response_handler.b.a(LongPollType.MESSAGES), "v6o0");
        return a400.b.c(bVar, new v400.b(aVar.b, aVar.a));
    }
}
