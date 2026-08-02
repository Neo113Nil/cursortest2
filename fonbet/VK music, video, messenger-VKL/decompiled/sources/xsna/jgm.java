package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: Dialog.kt */
/* loaded from: classes2.dex */
public final class jgm {
    public static final boolean a(Dialog dialog) {
        ChatSettings Hb;
        if (dialog == null || !dialog.Gb() || dialog.sc()) {
            return false;
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        if (epx.f(dialog.Zb(), new Peer.User(100L))) {
            return false;
        }
        return !dialog.uc() || ((Hb = dialog.Hb()) != null && Hb.T);
    }
}
