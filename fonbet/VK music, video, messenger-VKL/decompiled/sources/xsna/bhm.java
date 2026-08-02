package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogMember;

/* compiled from: DialogMemberAddMergeTask.kt */
/* loaded from: classes2.dex */
public final class bhm extends b920 {
    public final Peer c;
    public final Peer d;
    public final DialogMember e;

    public bhm(Peer peer, Peer peer2, DialogMember dialogMember) {
        this.c = peer;
        this.d = peer2;
        this.e = dialogMember;
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        w2wVar.I0().u(new wze(this, 16));
        return Boolean.TRUE;
    }
}
