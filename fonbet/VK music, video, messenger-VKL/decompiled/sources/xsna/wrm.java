package xsna;

import com.vk.dto.common.Peer;
import xsna.vrm;

/* compiled from: DialogsLeaveCmd.kt */
/* loaded from: classes2.dex */
public final class wrm extends le6<Boolean> {
    public final Peer b;
    public final boolean c;
    public final Object d;

    public wrm(Peer peer, boolean z, Object obj) {
        this.b = peer;
        this.c = z;
        this.d = obj;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        return (Boolean) w2wVar.L0(this, new vrm(this.b, new vrm.a.b(w2wVar.H0()), this.c, this.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrm)) {
            return false;
        }
        wrm wrmVar = (wrm) obj;
        return epx.f(this.b, wrmVar.b) && this.c == wrmVar.c && epx.f(this.d, wrmVar.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c);
        Object obj = this.d;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsLeaveCmd(peer=");
        sb.append(this.b);
        sb.append(", isAwaitNetwork=");
        sb.append(this.c);
        sb.append(", changerTag=");
        return k73.c(sb, this.d, ')');
    }
}
