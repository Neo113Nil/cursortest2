package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogMarkAsReadCmd.kt */
/* loaded from: classes2.dex */
public final class qgm extends iuz {
    public final Peer b;
    public final int c;
    public final Object d;
    public final Boolean e;
    public final long f;

    public qgm(Peer peer, int i, Object obj, Boolean bool) {
        this.b = peer;
        this.c = i;
        this.d = obj;
        this.e = bool;
        this.f = peer.b;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-read-changes-local";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgm)) {
            return false;
        }
        qgm qgmVar = (qgm) obj;
        return epx.f(this.b, qgmVar.b) && this.c == qgmVar.c && epx.f(this.d, qgmVar.d) && epx.f(this.e, qgmVar.e);
    }

    @Override // xsna.iuz
    public final long h() {
        return this.f;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a = shy.a(this.c, Long.hashCode(this.b.b) * 31, 31);
        Object obj = this.d;
        int hashCode = (a + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // xsna.iuz
    public final void i(w2w w2wVar) {
        w2wVar.O0().a(new sgm(this.b, this.c, this.e));
    }

    @Override // xsna.iuz
    public final boolean j(w2w w2wVar) {
        x6x O0 = w2wVar.O0();
        StringBuilder sb = new StringBuilder("mark as read (dialogId=");
        Peer peer = this.b;
        O0.b(eq.a(sb, peer, ')'), new nhe(this, 14));
        xgl0 I0 = w2wVar.I0();
        final long j = peer.b;
        final int i = this.c;
        return ((Boolean) I0.u(new izs() { // from class: xsna.bjm
            /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
            
                if (r13 == false) goto L32;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
            @Override // xsna.izs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                boolean z;
                boolean z2;
                xgl0 xgl0Var = (xgl0) obj;
                hpm e = xgl0Var.b().e();
                d040 o = xgl0Var.o();
                int d = xgl0Var.system().d();
                long j2 = j;
                com.vk.im.engine.models.dialogs.b c = e.c(j2);
                boolean z3 = true;
                boolean z4 = c != null && c.O == d;
                if (c != null) {
                    Boolean bool = c.n;
                    if (bool != null ? bool.booleanValue() : c.m) {
                        e.q(j2, Boolean.FALSE);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i2 = c.g + 1;
                    int i3 = c.i;
                    int i4 = i;
                    boolean z5 = i4 == i3;
                    boolean M = o.M(i2, i4, d, j2);
                    if (z4) {
                        if (z5) {
                            e.A(i4, 0, j2);
                        } else if (!M) {
                            e.A(i4, Math.max(0, c.j - o.o0(i2, i4, j2)), j2);
                        }
                        z2 = true;
                        if (!z) {
                        }
                        return Boolean.valueOf(z3);
                    }
                    z2 = false;
                    if (!z) {
                    }
                    return Boolean.valueOf(z3);
                }
                z3 = false;
                return Boolean.valueOf(z3);
            }
        })).booleanValue();
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogMarkAsReadCmd(peer=");
        sb.append(this.b);
        sb.append(", readTillInMsgCnvId=");
        sb.append(this.c);
        sb.append(", changerTag=");
        sb.append(this.d);
        sb.append(", markConversationAsRead=");
        return tn.a(sb, this.e, ')');
    }

    public /* synthetic */ qgm(Peer peer, int i, Object obj, int i2) {
        this(peer, i, (i2 & 4) != 0 ? null : obj, (Boolean) null);
    }
}
