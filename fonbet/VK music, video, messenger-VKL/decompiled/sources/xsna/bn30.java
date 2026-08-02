package xsna;

import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: MsgMarkAsPlayedJob.kt */
/* loaded from: classes.dex */
public final class bn30 extends u4w {
    public final int c;

    /* compiled from: MsgMarkAsPlayedJob.kt */
    public static final class a implements s7x<bn30> {
        @Override // xsna.s7x
        public final bn30 a(ny90 ny90Var) {
            return new bn30(ny90Var.c("msg_local_id"));
        }

        @Override // xsna.s7x
        public final void b(bn30 bn30Var, ny90 ny90Var) {
            ny90Var.l("msg_local_id", bn30Var.c);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImMsgMarkAsListened";
        }
    }

    public bn30(int i) {
        this.c = i;
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        d040 o = w2wVar.I0().o();
        int i = this.c;
        o.z(i, null);
        w2wVar.S0().s(i, "bn30");
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        nx2 hg20Var;
        d040 o = w2wVar.I0().o();
        int i = this.c;
        Msg L = o.L(i);
        Integer valueOf = L != null ? Integer.valueOf(L.Z5()) : null;
        if (valueOf == null) {
            w2wVar.I0().o().z(i, null);
            w2wVar.S0().s(i, "bn30");
            return;
        }
        if (L instanceof MsgFromUser) {
            MsgFromUser msgFromUser = (MsgFromUser) L;
            if (msgFromUser.S0()) {
                hg20Var = new gg20(valueOf.intValue(), com.vk.dto.common.b.e(msgFromUser.y()), w2wVar.Q0());
                bz2.c(hg20Var, null);
            }
        }
        hg20Var = new hg20(valueOf.intValue(), com.vk.dto.common.b.e(L.y()), w2wVar.Q0());
        bz2.c(hg20Var, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bn30) && this.c == ((bn30) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "MsgMarkAsPlayedJob";
    }

    public final String toString() {
        return vu5.b(new StringBuilder("MsgMarkAsPlayedJob(msgLocalId="), this.c, ')');
    }
}
