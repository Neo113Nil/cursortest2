package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import xsna.zbb;

/* compiled from: ChannelMsgSendVc.kt */
/* loaded from: classes16.dex */
public final class j6b implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j6b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Context context;
        switch (this.b) {
            case 0:
                com.vk.channels.impl.channel_screen.send_msg.a aVar = (com.vk.channels.impl.channel_screen.send_msg.a) this.c;
                zbb.b bVar = aVar.E;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.f(ChannelMsgSendConfig.a(aVar.p, null, false, false, false, false, null, null, null, null, true, false, false, false, null, 31743), aVar.q != null, !(aVar.x != null ? r1 : null).getInputState().a());
                return s3q0.a;
            case 1:
                return (TextView) this.c;
            case 2:
                return ((zak0) ((wlp0) this.c).d).getValue();
            default:
                LinkBaseVh linkBaseVh = (LinkBaseVh) this.c;
                View b = linkBaseVh.b();
                if (b != null && (context = b.getContext()) != null) {
                    linkBaseVh.c(context);
                }
                return s3q0.a;
        }
    }
}
