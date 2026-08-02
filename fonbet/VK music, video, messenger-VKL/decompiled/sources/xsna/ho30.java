package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.ui.formatters.DisplayNameFormatter;

/* compiled from: MsgPartBaseStoryHolder.kt */
/* loaded from: classes2.dex */
public abstract class ho30 extends hr30<AttachStory, yt30> {
    public final DisplayNameFormatter d = new DisplayNameFormatter(null, 3, null);
    public AttachStory e;

    public final boolean s(yt30 yt30Var) {
        AttachStory attachStory = this.e;
        if (attachStory == null) {
            return false;
        }
        Peer peer = yt30Var.c;
        xuo0.a.getClass();
        return attachStory.b(peer, xuo0.a());
    }
}
