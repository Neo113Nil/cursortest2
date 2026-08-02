package xsna;

import android.content.Context;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.HistoryAttachAction;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.attaches.MediaType;
import com.vk.im.engine.models.dialogs.ChatSettings;
import java.util.List;

/* compiled from: LinkAttachesComponent.kt */
/* loaded from: classes2.dex */
public final class t8z extends c8v {
    public final Context t;
    public final fpj0 u;

    public t8z(Context context, Peer peer, MediaType mediaType, ChatSettings chatSettings, kkm kkmVar, mxv mxvVar, a1w a1wVar) {
        super(context, peer, mediaType, chatSettings, kkmVar, mxvVar, a1wVar);
        this.t = context;
        this.u = new fpj0();
    }

    @Override // xsna.c8v
    public final List<HistoryAttachAction> c1(HistoryAttach historyAttach) {
        HistoryAttachAction historyAttachAction = HistoryAttachAction.GO_TO_MSG;
        HistoryAttachAction historyAttachAction2 = HistoryAttachAction.SHARE;
        if (h1()) {
            historyAttachAction2 = null;
        }
        return rl3.I(new HistoryAttachAction[]{historyAttachAction, historyAttachAction2, h1() ? null : HistoryAttachAction.COPY_LINK});
    }

    @Override // xsna.c8v
    public final l56 d1() {
        return this.u;
    }

    @Override // xsna.c8v
    public final f8v k1() {
        return new g9z(this.t, this, this.o);
    }
}
