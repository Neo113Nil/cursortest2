package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.DraftMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.Collections;
import kotlin.Pair;

/* compiled from: DialogsGetDraftMsgCmd.kt */
/* loaded from: classes2.dex */
public final class vqm extends le6<a> {
    public final long b;

    /* compiled from: DialogsGetDraftMsgCmd.kt */
    public static final class a {
        public final DraftMsg a;
        public final MsgFromUser b;
        public final ProfilesSimpleInfo c;

        public a(DraftMsg draftMsg, MsgFromUser msgFromUser, ProfilesSimpleInfo profilesSimpleInfo) {
            this.a = draftMsg;
            this.b = msgFromUser;
            this.c = profilesSimpleInfo;
        }
    }

    public vqm(long j) {
        this.b = j;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        DraftMsg Kb;
        Pair pair;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        long j = this.b;
        Peer b = Peer.a.b(j);
        Dialog dialog = (Dialog) ((wpp) w2wVar.b1(this, new tqm(new sqm(b, (Source) null, false, (Object) null, 30)))).c.get(Long.valueOf(j));
        if (dialog == null || (Kb = dialog.Kb()) == null) {
            return new a(DraftMsg.h, null, null);
        }
        Integer num = Kb.f;
        if (num != null) {
            int intValue = num.intValue();
            t140 t140Var = (t140) w2wVar.L0(this, new ej30(MsgIdType.CNV_ID, Collections.singletonList(Integer.valueOf(intValue)), b, Source.CACHE, 48));
            pair = new Pair(t140Var.a.c.get(Integer.valueOf(intValue)), t140Var.b.Ob());
        } else {
            pair = null;
        }
        Msg msg = pair != null ? (Msg) pair.i() : null;
        return new a(Kb, msg instanceof MsgFromUser ? (MsgFromUser) msg : null, pair != null ? (ProfilesSimpleInfo) pair.j() : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqm) && this.b == ((vqm) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("DialogsGetDraftMsgCmd(dialogId="));
    }
}
