package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.im_item.ImItemType;
import java.util.Collections;

/* compiled from: DialogPinCmd.kt */
/* loaded from: classes2.dex */
public final class iim extends xl6<s3q0> {
    public final Peer b;
    public lnm c;
    public w2w d;

    public iim(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-pin-unpin";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        boolean z;
        int e;
        x7w x7wVar;
        this.d = w2wVar;
        this.c = sn.c(w2wVar);
        boolean n = w2wVar.getExperiments().n();
        boolean z2 = false;
        Peer peer = this.b;
        if (n) {
            b5w b5wVar = new b5w(peer.b, ImItemType.DIALOG);
            w2w w2wVar2 = this.d;
            if (w2wVar2 == null) {
                w2wVar2 = null;
            }
            sew sewVar = w2wVar2.I0().j().c(Collections.singletonList(b5wVar)).get(b5wVar);
            if (sewVar == null || (x7wVar = sewVar.b) == null) {
                x7wVar = x7w.f;
            }
            z = com.vk.im.engine.models.im_item.b.f(x7wVar);
        } else {
            lnm lnmVar = this.c;
            if (lnmVar == null) {
                lnmVar = null;
            }
            com.vk.im.engine.models.dialogs.b c = lnmVar.c(peer.b);
            if (c != null) {
                vjm vjmVar = c.e;
                if (vjmVar != null ? vjmVar.i() : c.d.i()) {
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            throw new IllegalArgumentException("Dialog(peer " + peer + ") already pinned");
        }
        w2wVar.getConfig().getClass();
        if (n) {
            e = w2wVar.I0().j().g();
        } else {
            lnm lnmVar2 = this.c;
            if (lnmVar2 == null) {
                lnmVar2 = null;
            }
            e = lnmVar2.e();
        }
        if (e >= 5) {
            throw new IllegalStateException(tgw.b(e, "Max amount if pinned items reached. Count -> ", ". Limit -> 5"));
        }
        int i = e + 1;
        if (!n) {
            lnm lnmVar3 = this.c;
            if (lnmVar3 == null) {
                lnmVar3 = null;
            }
            int e2 = lnmVar3.e();
            lnm lnmVar4 = this.c;
            if (lnmVar4 == null) {
                lnmVar4 = null;
            }
            lnmVar4.f(e2 + 1, peer.b);
            w2w w2wVar3 = this.d;
            if (w2wVar3 == null) {
                w2wVar3 = null;
            }
            xgl0 I0 = w2wVar3.I0();
            long j = peer.b;
        }
        w2w w2wVar4 = this.d;
        if (w2wVar4 == null) {
            w2wVar4 = null;
        }
        w2wVar4.O0().a(new kim(i, peer));
        w2w w2wVar5 = this.d;
        if (w2wVar5 == null) {
            w2wVar5 = null;
        }
        w2wVar5.S0().u(this, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
        w2w w2wVar6 = this.d;
        if (w2wVar6 == null) {
            w2wVar6 = null;
        }
        w2wVar6.e1(this, new k480(this, peer));
        w2w w2wVar7 = this.d;
        (w2wVar7 != null ? w2wVar7 : null).e1(this, new r680(this, Collections.singleton(new b5w(peer.b, ImItemType.DIALOG))));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iim) && epx.f(this.b, ((iim) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("DialogPinCmd(peer="), this.b, ')');
    }
}
