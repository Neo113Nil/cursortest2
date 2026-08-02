package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogExt;
import java.util.ArrayList;
import xsna.u8m;

/* compiled from: CommonFolderDialogsListActionsProvider.kt */
/* loaded from: classes18.dex */
public final class vjg extends fo50 {
    @Override // xsna.fo50
    public final ArrayList H(com.vk.im.engine.models.c cVar, DialogExt dialogExt, Peer peer) {
        ArrayList b = w8m.b(cVar, dialogExt, peer);
        if (!peer.Ab(Peer.Type.GROUP)) {
            b.add(u8m.b.b);
        }
        return b;
    }
}
