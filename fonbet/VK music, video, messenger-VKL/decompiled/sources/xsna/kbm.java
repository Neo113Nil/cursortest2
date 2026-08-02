package xsna;

import com.vk.dto.common.Peer;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collections;
import java.util.List;
import xsna.u6x;
import xsna.y120;

/* compiled from: DialogChangeWritePermissionJob.kt */
/* loaded from: classes.dex */
public final class kbm extends u4w {
    public final long c;
    public final Peer d;
    public final int e;
    public final boolean f;

    /* compiled from: DialogChangeWritePermissionJob.kt */
    public static final class a implements s7x<kbm> {
        @Override // xsna.s7x
        public final kbm a(ny90 ny90Var) {
            return new kbm(ny90Var.e("dialog_id"), com.vk.dto.common.b.e(ny90Var.e("member_id")), ny90Var.c("duration_sec"));
        }

        @Override // xsna.s7x
        public final void b(kbm kbmVar, ny90 ny90Var) {
            kbm kbmVar2 = kbmVar;
            ny90Var.n("dialog_id", kbmVar2.c);
            ny90Var.n("member_id", kbmVar2.d.d);
            ny90Var.l("duration_sec", kbmVar2.e);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "DialogChangeWritePermissionJob";
        }
    }

    public kbm(long j, Peer peer, int i) {
        this.c = j;
        this.d = peer;
        this.e = i;
        this.f = i != 0;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        Q(w2wVar, !this.f);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.e, new Object[]{th});
        }
        Q(w2wVar, !this.f);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Object c;
        boolean z = this.f;
        Q(w2wVar, z);
        int i = this.e;
        y120 aVar2 = i != -1 ? i != 0 ? new y120.a(Long.valueOf(i)) : y120.b.a : new y120.a(0);
        Peer e = com.vk.dto.common.b.e(this.c);
        Peer peer = this.d;
        c = bz2.c(new hhm(e, Collections.singletonList(peer), aVar2), null);
        if (((List) c).contains(Long.valueOf(peer.d))) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"DialogChangeWritePermissionJob - request returned member as failed"});
            }
            Q(w2wVar, !z);
        }
    }

    public final void Q(w2w w2wVar, boolean z) {
        hpm c = sn.c(w2wVar);
        Peer peer = this.d;
        long j = this.c;
        c.E(j, peer, z);
        w2wVar.S0().V(j);
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
    public final String q() {
        return "im-dialogs-write-restriction-job";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "DialogChangeWritePermissionJob";
    }
}
