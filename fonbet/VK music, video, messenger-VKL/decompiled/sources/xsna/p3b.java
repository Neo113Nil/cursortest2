package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: ChannelMessagesStorage.kt */
/* loaded from: classes2.dex */
public interface p3b extends mf20 {
    ArrayList G(Class cls, UserId userId, Long l);

    List<Msg> V(Collection<Integer> collection);

    void a(Collection<? extends Msg> collection);

    Attach b(int i);

    List<MsgFromChannel> z0(List<String> list, List<? extends MsgSyncState> list2);
}
