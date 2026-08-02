package xsna;

import com.vk.channels.api.Channel;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.pushes.msg.ChannelMsgPushInfoLoader;
import xsna.a7b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class v6b implements izs {
    public final /* synthetic */ a7b b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        a7b.a aVar = (a7b.a) obj;
        ChannelMsgPushInfoLoader channelMsgPushInfoLoader = this.b.h;
        long a = aVar.a();
        int b = aVar.b();
        pya a2 = channelMsgPushInfoLoader.a(a);
        t140 b2 = channelMsgPushInfoLoader.b(a, b, MsgIdType.LOCAL_ID);
        Channel a3 = a2.a().a();
        if (a3 == null) {
            throw new ChannelMsgPushInfoLoader.ChannelMessagePushLoaderException("No channel found for channelId=" + a + ", msgLocalId=" + b);
        }
        Msg msg = (Msg) b2.a().c.get(Integer.valueOf(b));
        if (msg != null) {
            ProfilesInfo b3 = a2.b();
            b3.Hb(b2.b());
            return new b5b(a3, msg, b3.Ob());
        }
        throw new ChannelMsgPushInfoLoader.ChannelMessagePushLoaderException("No message found for channelId=" + a + ", msgLocalId=" + b);
    }
}
