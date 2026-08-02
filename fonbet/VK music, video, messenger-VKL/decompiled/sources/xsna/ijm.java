package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.ImEngineException;
import com.vk.im.engine.models.attaches.CallParticipants;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.GroupCallInProgress;
import com.vk.im.engine.models.messages.PinnedMsg;
import java.util.List;

/* compiled from: DialogRelatedProfilesFinder.kt */
/* loaded from: classes2.dex */
public final class ijm {
    public static f1e0 a(Dialog dialog) {
        f1e0 f1e0Var = new f1e0();
        b(dialog, f1e0Var);
        return f1e0Var;
    }

    public static void b(Dialog dialog, f1e0 f1e0Var) {
        ChatSettings Hb;
        if (!dialog.uc()) {
            Peer.Type Ed = dialog.Ed();
            if (Ed == null) {
                throw new ImEngineException("Dialog info cannot be converted to memberType");
            }
            Long valueOf = Long.valueOf(dialog.Zb().d);
            if (dialog.Ed() == null) {
                valueOf = null;
            }
            if (valueOf == null) {
                throw new ImEngineException("Dialog info cannot be converted to memberId");
            }
            f1e0Var.a(valueOf.longValue(), Ed);
        }
        if (dialog.rc() && (Hb = dialog.Hb()) != null) {
            f1e0Var.c(Hb.d);
        }
        PinnedMsg dc = dialog.dc();
        if (dc != null) {
            f1e0Var.c(dc.d);
            lv30.c(dc.i, f1e0Var);
            lv30.e(dc.j, f1e0Var);
        }
        GroupCallInProgress Ob = dialog.Ob();
        if (Ob == null) {
            return;
        }
        List<Long> list = Ob.b;
        CallParticipants callParticipants = CallParticipants.d;
        f1e0Var.d(j5g.H0(CallParticipants.a.a(list), 3));
    }
}
