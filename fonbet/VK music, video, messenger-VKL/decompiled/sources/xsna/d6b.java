package xsna;

import android.os.Parcelable;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: ChannelMsgSendUtils.kt */
/* loaded from: classes2.dex */
public final class d6b {
    public static final d6b a = new d6b();

    public static void c(w2w w2wVar, MsgFromChannel msgFromChannel) {
        int i;
        Parcelable.Creator<ChannelMsgSendConfig> creator = ChannelMsgSendConfig.CREATOR;
        ChannelMsgSendConfig a2 = ChannelMsgSendConfig.a.a(msgFromChannel.Q);
        Peer peer = msgFromChannel.h;
        int i2 = msgFromChannel.b;
        String str = msgFromChannel.I.a;
        MsgTextFormat msgTextFormat = msgFromChannel.T;
        String str2 = msgFromChannel.P;
        List<Attach> list = msgFromChannel.E;
        int i3 = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((Attach) it.next()) instanceof AttachVideo) && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        List<Attach> list2 = msgFromChannel.E;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Attach attach : list2) {
                if ((attach instanceof AttachImage) || (attach instanceof AttachDoc) || (attach instanceof AttachAudioMsg)) {
                    i3++;
                    if (i3 < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
        }
        pzv config = w2wVar.getConfig();
        w2wVar.O0().a(new w5b(i2, peer, str, msgTextFormat, str2, a2, (config.v * i3) + (config.w * i) + config.p));
    }

    public final void a(w2w w2wVar, int i, MsgSyncState msgSyncState, AttachSyncState attachSyncState, String str) {
        Msg msg = (Msg) w2wVar.I0().c(new c6b(i, 0));
        if (msg == null || !(msg instanceof MsgFromChannel)) {
            return;
        }
        MsgFromChannel msgFromChannel = (MsgFromChannel) msg;
        msgFromChannel.g = qni0.a();
        msgFromChannel.o = msgSyncState;
        for (Attach attach : msgFromChannel.E) {
            if (attach.G0() != AttachSyncState.DONE) {
                attach.S2(attachSyncState);
            }
        }
        Parcelable.Creator<ChannelMsgSendConfig> creator = ChannelMsgSendConfig.CREATOR;
        ChannelMsgSendConfig a2 = ChannelMsgSendConfig.a.a(msgFromChannel.Q);
        Peer peer = msgFromChannel.h;
        String str2 = msgFromChannel.P;
        if (str2 == null) {
            str2 = "";
        }
        new v4b(peer, a2, msgFromChannel, str2).o(w2wVar);
        long j = msgFromChannel.h.b;
        w2wVar.e1(this, new o280(str, j, i));
        w2wVar.S0().H(j);
    }

    public final void b(w2w w2wVar, MsgFromChannel msgFromChannel, Throwable th, boolean z) {
        if (z) {
            return;
        }
        long j = msgFromChannel.O.b;
        int i = msgFromChannel.b;
        w2wVar.K().d().k(i, j, th);
        w2wVar.e1(this, new k280(i, j, th));
    }
}
