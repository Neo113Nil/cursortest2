package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.messages.Msg;
import java.util.Collection;

/* compiled from: UpdateChannelDonutMessagesCmd.kt */
/* loaded from: classes2.dex */
public final class w7q0 extends le6<s3q0> {
    public final Peer b;
    public final Collection<Msg> c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public w7q0(Peer peer, Collection<? extends Msg> collection, boolean z) {
        this.b = peer;
        this.c = collection;
        this.d = z;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.L0(this, new n2b(this.b.b, rli0.A(new ulp0(rli0.j(rli0.j(new i5g(this.c), igb0.d), new kl60(20)), new wyn0(3))), MsgIdType.CNV_ID, Source.NETWORK, true, this.d));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7q0)) {
            return false;
        }
        w7q0 w7q0Var = (w7q0) obj;
        return epx.f(this.b, w7q0Var.b) && epx.f(this.c, w7q0Var.c) && this.d == w7q0Var.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.d) + s3j0.a(Long.hashCode(this.b.b) * 31, this.c, 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateChannelDonutMessagesCmd(peer=");
        sb.append(this.b);
        sb.append(", messages=");
        sb.append(this.c);
        sb.append(", isPostponed=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
