package xsna;

import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;

/* compiled from: CnvMsgWeightEncoder.kt */
/* loaded from: classes2.dex */
public final class eyf implements hkx0 {
    @Override // xsna.hkx0
    public final gkx0 b(MsgFromChannel msgFromChannel, int i) {
        return n140.b(i, msgFromChannel.b, msgFromChannel.o == MsgSyncState.SENDING);
    }

    @Override // xsna.hkx0
    public final gkx0 d(Msg msg) {
        return n140.b(msg.d, 0, false);
    }
}
