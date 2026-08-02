package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* compiled from: FindAttachRelatedEntitiesCmd.kt */
/* loaded from: classes2.dex */
public final class dhr extends le6<i34> {
    public final int b;

    public dhr(int i) {
        this.b = i;
    }

    @Override // xsna.le6
    public final i34 e(w2w w2wVar) {
        i34 i34Var;
        i34 i34Var2;
        d040 o = w2wVar.I0().o();
        int i = this.b;
        Integer e0 = o.e0(i);
        int i2 = 0;
        if (e0 == null) {
            i34Var = new i34(i2);
        } else {
            MsgIdType msgIdType = MsgIdType.LOCAL_ID;
            Source source = Source.CACHE;
            List singletonList = Collections.singletonList(e0);
            Serializer.c<Peer> cVar = Peer.CREATOR;
            t140 t140Var = (t140) w2wVar.L0(this, new ej30(msgIdType, singletonList, Peer.Unknown.e, source, false, null));
            Pair pair = new Pair(t140Var.a.e(e0), t140Var.b);
            xpp xppVar = (xpp) pair.i();
            ProfilesInfo profilesInfo = (ProfilesInfo) pair.j();
            if (xppVar.c()) {
                i34Var = new i34(i2);
            } else {
                Pair<xpp<Dialog>, ProfilesInfo> f = f(w2wVar, ((Msg) xppVar.a()).c);
                xpp<Dialog> i3 = f.i();
                i34Var = i3.c() ? new i34(i2) : new i34(i3, xppVar, new ProfilesInfo(profilesInfo, f.j()));
            }
        }
        if (!i34Var.a.c() && !i34Var.b.c()) {
            return i34Var;
        }
        Long K = fl3.K(sn.c(w2wVar).d.b.b().d("SELECT dialog_id FROM dialog_pinned_msg_attaches WHERE attach_local_id = ?", new String[]{String.valueOf(i)}));
        if (K == null) {
            i34Var2 = new i34(i2);
        } else {
            Pair<xpp<Dialog>, ProfilesInfo> f2 = f(w2wVar, K.longValue());
            i34Var2 = new i34(f2.i(), new xpp(), f2.j());
        }
        return !i34Var2.a.c() ? i34Var2 : new i34(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhr) && this.b == ((dhr) obj).b;
    }

    public final Pair<xpp<Dialog>, ProfilesInfo> f(w2w w2wVar, long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        ipm ipmVar = (ipm) k9q0.f(w2wVar, this, new uqm(new sqm(Peer.a.b(j), Source.CACHE, false, (Object) null, 28)));
        return new Pair<>(ipmVar.a.e(Long.valueOf(j)), ipmVar.b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.b(new StringBuilder("FindAttachRelatedEntitiesCmd(attachLocalId="), this.b, ')');
    }
}
