package xsna;

import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.design.view.pagination.pin.b;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.reporters.api.analytics.click.ImPinClickAnalyticsItem;
import java.util.List;

/* compiled from: ChannelPinMsgComponent.kt */
/* loaded from: classes16.dex */
public final class n8b implements b.a {
    public final /* synthetic */ m8b a;

    public n8b(m8b m8bVar) {
        this.a = m8bVar;
    }

    @Override // com.vk.im.design.view.pagination.pin.b.a
    public final void a(int i) {
        m8b m8bVar = this.a;
        MsgFromChannel msgFromChannel = (MsgFromChannel) j5g.b0(i, (List) m8bVar.q.b);
        if (msgFromChannel != null) {
            ChannelFragment.c cVar = m8bVar.o;
            int i2 = msgFromChannel.d;
            sf20 ro = ChannelFragment.this.ro();
            ro.k.f(MsgIdType.CNV_ID, i2, true, "scrollToMsg");
            m8bVar.n.a(new ImPinClickAnalyticsItem.PinnedMessage(ImPinClickAnalyticsItem.PinnedMessage.ClickType.PINNED_VIEW, ImPinClickAnalyticsItem.PinnedMessage.ConversationType.CHANNEL, m8bVar.i, msgFromChannel.d));
        }
    }
}
