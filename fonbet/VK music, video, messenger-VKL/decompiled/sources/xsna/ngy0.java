package xsna;

import java.util.Objects;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.aP;
import one.video.calls.sdk_private.bI;

/* compiled from: ClientRolePacketParser.java */
/* loaded from: classes8.dex */
public final class ngy0 extends nly0 {
    public volatile byte[] i;

    @Override // xsna.nly0
    public final nby0 a(tly0 tly0Var) throws aP, one.video.calls.sdk_private.bz {
        sby0 sby0Var;
        if (tly0Var.a.equals(this.b.a)) {
            sby0Var = this.a;
        } else {
            if (tly0Var.n() == aF.d || tly0Var.n() == aF.c) {
                throw new one.video.calls.sdk_private.bz("invalid version");
            }
            if (tly0Var.n() != aF.a) {
                throw new one.video.calls.sdk_private.bz("invalid version");
            }
            kgy0 kgy0Var = tly0Var.a;
            lgy0 lgy0Var = this.b;
            Objects.toString(kgy0Var);
            Objects.toString(lgy0Var);
            sby0Var = new sby0(new lgy0(tly0Var.a), bI.a, new sp(29));
            sby0Var.d(this.i);
        }
        return sby0Var.a(tly0Var.n());
    }
}
