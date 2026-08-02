package xsna;

import android.content.Context;
import com.vk.bridges.ImageViewer;
import java.util.Set;

/* compiled from: ChannelMsgSendVc.kt */
/* loaded from: classes16.dex */
public final class f6b implements ymw {
    public final /* synthetic */ com.vk.channels.impl.channel_screen.send_msg.a a;

    public f6b(com.vk.channels.impl.channel_screen.send_msg.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.ymw
    public final boolean a() {
        return false;
    }

    @Override // xsna.ymw
    public final Set<ImageViewer.ControlsOptions.MenuItem> b() {
        ImageViewer.ControlsOptions.MenuItem.Companion.getClass();
        return ImageViewer.ControlsOptions.MenuItem.a.a();
    }

    @Override // xsna.ymw
    public final Boolean c() {
        return Boolean.FALSE;
    }

    @Override // xsna.ymw
    public final Context j() {
        return this.a.o;
    }
}
