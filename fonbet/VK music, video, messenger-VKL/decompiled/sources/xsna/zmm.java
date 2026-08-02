package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;

/* compiled from: DialogsAvatarRemoveCmd.kt */
/* loaded from: classes2.dex */
public final class zmm extends le6<Boolean> {
    public final Peer b;
    public final Object c;

    public zmm(Peer peer, Object obj) {
        this.b = peer;
        this.c = obj;
        if (peer.zb()) {
            return;
        }
        throw new IllegalStateException(("Specified peer=" + peer + " is not a chat").toString());
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        Peer Q0 = w2wVar.Q0();
        Peer peer = this.b;
        bz2.c(new wd20(peer, Q0), null);
        hpm e = w2wVar.I0().b().e();
        long j = peer.b;
        ImageList imageList = new ImageList(null, 1, null);
        e.c.a(Long.valueOf(j), new dsc(imageList, 23), new pjb(e, j, imageList, 1));
        w2wVar.S0().v(j, this.c);
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmm)) {
            return false;
        }
        zmm zmmVar = (zmm) obj;
        return epx.f(this.b, zmmVar.b) && epx.f(this.c, zmmVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(Long.hashCode(this.b.b) * 31, 31, false);
        Object obj = this.c;
        return b + (obj != null ? obj.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsAvatarRemoveCmd(peer=");
        sb.append(this.b);
        sb.append(", isAwaitNetwork=false, changerTag=");
        return k73.c(sb, this.c, ')');
    }
}
