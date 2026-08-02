package xsna;

import com.vk.channels.api.ChannelFilter;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5b;

/* compiled from: ChannelMessagesDeleteMergeTaskRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class h2b implements ae20<c5b> {
    public final xgl0 b;
    public final com.vk.im.engine.models.c c;

    public h2b(xgl0 xgl0Var, com.vk.im.engine.models.c cVar) {
        this.b = xgl0Var;
        this.c = cVar;
    }

    @Override // xsna.ae20
    public final Collection a(c5b c5bVar, gkx0 gkx0Var, gkx0 gkx0Var2) {
        return this.b.y().D0(c5bVar.a, gkx0Var, gkx0Var2, Integer.MAX_VALUE);
    }

    @Override // xsna.ae20
    public final void c(int i, boolean z) {
        this.b.y().X(i, z);
    }

    @Override // xsna.ae20
    public final lj30 e(c5b c5bVar, gkx0 gkx0Var) {
        return this.b.y().A(c5bVar.a, gkx0Var);
    }

    @Override // xsna.ae20
    public final void f(int i, gkx0 gkx0Var) {
        this.b.y().E0(i, gkx0Var);
    }

    @Override // xsna.ae20
    public final void g(c5b c5bVar, boolean z) {
        c5b c5bVar2 = c5bVar;
        boolean z2 = false;
        if (z) {
            if (!(c5bVar2 instanceof c5b.a ? ((c5b.a) c5bVar2).b : false)) {
                z2 = true;
            }
        }
        this.b.y().j0(c5bVar2.a, z2);
    }

    @Override // xsna.ae20
    public final void h(c5b c5bVar, gkx0 gkx0Var, gkx0 gkx0Var2, boolean z) {
        r3b y = this.b.y();
        Peer peer = c5bVar.a;
        if ((z ? null : MsgSyncState.SENDING) != null) {
            y.getClass();
            throw new UnsupportedOperationException("Unsupported param excludeWithSyncState for ChannelMessagesStorageManager");
        }
        g2b g2bVar = y.b;
        long j = peer.b;
        g2bVar.getClass();
        StringBuilder sb = new StringBuilder("\n            SELECT ");
        cr.a(ChannelMessageColumn.LOCAL_ID, sb, "\n            FROM ");
        sb.append(g2bVar.b.a);
        sb.append("\n            WHERE ");
        sb.append(ChannelMessageColumn.CHANNEL_ID.getKey());
        sb.append(" = ");
        sb.append(j);
        sb.append("\n                AND ");
        cr.a(ChannelMessageColumn.WEIGHT, sb, " BETWEEN ");
        sb.append(gkx0Var.b);
        sb.append(" AND ");
        g2bVar.d.b().h(new defpackage.c(10, g2bVar, efz.b(gkx0Var2.b, "\n            ", sb)));
    }

    @Override // xsna.ae20
    public final ikx0 i(c5b c5bVar) {
        c5b c5bVar2 = c5bVar;
        r3b y = this.b.y();
        y.getClass();
        if (!(c5bVar2 instanceof c5b.b)) {
            if (c5bVar2 instanceof c5b.a) {
                return new ikx0(gkx0.d, gkx0.e);
            }
            throw new NoWhenBranchMatchedException();
        }
        lj30 y2 = y.y(((c5b.b) c5bVar2).b, c5bVar2.a);
        if (y2 == null) {
            return null;
        }
        gkx0 gkx0Var = y2.h;
        return new ikx0(gkx0Var, gkx0Var);
    }

    @Override // xsna.ae20
    public final void j(c5b c5bVar, gkx0 gkx0Var, gkx0 gkx0Var2) {
        this.b.y().J0(c5bVar.a, gkx0Var, gkx0Var2, null);
    }

    @Override // xsna.ae20
    public final yj30 k(c5b c5bVar) {
        return this.b.y().q(c5bVar.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    @Override // xsna.ae20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(c5b c5bVar, Collection collection, boolean z) {
        int i;
        boolean z2;
        vcb vcbVar;
        int i2;
        int i3;
        int i4;
        vcb vcbVar2;
        vjm vjmVar;
        xgl0 xgl0Var = this.b;
        uib a = xgl0Var.a();
        r3b y = xgl0Var.y();
        Peer peer = c5bVar.a;
        long j = peer.b;
        bdb c = a.c(j);
        if (c == null) {
            L.l("ChannelMessagesDeleteMergeTaskRepositoryImpl", "updateChannelProperties: failed, channel with peer=" + peer + " is null");
            return;
        }
        int i5 = c.f;
        yj30 q = y.q(peer);
        lj30 lj30Var = (lj30) ((HashMap) y.r(Collections.singletonList(Long.valueOf(j)))).get(Long.valueOf(j));
        int i6 = c.c;
        int i7 = c.e;
        int i8 = c.g;
        vcb vcbVar3 = c.i;
        Collection<Msg> collection2 = collection;
        if (collection2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (Msg msg : collection2) {
                long j2 = j;
                if (msg.i && msg.d > c.d && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
                j = j2;
            }
        }
        long j3 = j;
        boolean z3 = true;
        if (i > 0) {
            i5 -= i;
            z2 = true;
        } else {
            z2 = false;
        }
        if (q == null || !q.b) {
            if (lj30Var == null || lj30Var.j) {
                z3 = z2;
            } else {
                i6 = lj30Var.d;
                z3 = true;
                vcbVar3 = vcb.b(vcbVar3, vjm.e(vcbVar3.b, 0, (int) (lj30Var.n / 1000), 1), 0L, 2);
            }
            vcbVar = vcbVar3;
            i2 = i8;
            i3 = i5;
            i4 = i6;
        } else {
            ChannelFilter channelFilter = c.l ? ChannelFilter.ARCHIVED : !c.m ? ChannelFilter.SUGGESTED : ChannelFilter.ALL;
            wfb o = a.o(channelFilter);
            if (o != null) {
                if (!o.c) {
                    o = null;
                }
                if (o != null) {
                    vcb vcbVar4 = o.b;
                    vjm vjmVar2 = vcbVar4.b;
                    int i9 = vjmVar2.c;
                    Integer valueOf = Integer.valueOf(i9);
                    if (i9 <= 0) {
                        valueOf = null;
                    }
                    vcbVar2 = vcb.b(vcbVar4, vjm.e(vjmVar2, 0, valueOf != null ? valueOf.intValue() - 1 : vjmVar2.c, 1), 0L, 2);
                    if (vcbVar2 != null) {
                        a.z(channelFilter, vcb.b(vcbVar2, null, c.b, 1));
                    }
                    vcbVar = vcb.b(vcbVar3, vjm.e(vcbVar3.b, 0, (vcbVar2 != null || (vjmVar = vcbVar2.b) == null) ? 0 : vjmVar.c, 1), 0L, 2);
                    i4 = 0;
                    i7 = 0;
                    i3 = 0;
                    i2 = 0;
                }
            }
            vcbVar2 = null;
            if (vcbVar2 != null) {
            }
            vcbVar = vcb.b(vcbVar3, vjm.e(vcbVar3.b, 0, (vcbVar2 != null || (vjmVar = vcbVar2.b) == null) ? 0 : vjmVar.c, 1), 0L, 2);
            i4 = 0;
            i7 = 0;
            i3 = 0;
            i2 = 0;
        }
        if (z3) {
            a.A(bdb.a(c, i4, 0, i7, i3, i2, 0, vcbVar, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -187, 7));
        }
        boolean n = this.c.n();
        List singletonList = Collections.singletonList(Long.valueOf(j3));
    }

    @Override // xsna.ae20
    public final void m(int i, boolean z) {
        this.b.y().x(i, z);
    }

    @Override // xsna.ae20
    public final void n(int i, gkx0 gkx0Var) {
        this.b.y().F0(i, gkx0Var);
    }

    @Override // xsna.ae20
    public final uz50 o(c5b c5bVar, gkx0 gkx0Var) {
        r3b y = this.b.y();
        Peer peer = c5bVar.a;
        g2b g2bVar = y.b;
        long j = peer.b;
        StringBuilder sb = new StringBuilder("\n                SELECT ");
        w1b w1bVar = g2bVar.f;
        sb.append(w1bVar.b);
        sb.append(" FROM ");
        sgl0 sgl0Var = g2bVar.b;
        sb.append(sgl0Var.a);
        sb.append(" \n                WHERE ");
        ChannelMessageColumn channelMessageColumn = ChannelMessageColumn.CHANNEL_ID;
        cr.a(channelMessageColumn, sb, " = ? \n                AND ");
        ChannelMessageColumn channelMessageColumn2 = ChannelMessageColumn.WEIGHT;
        sb.append(channelMessageColumn2.getKey());
        sb.append(" <= ?\n                ORDER BY ");
        sb.append(channelMessageColumn2.getKey());
        sb.append(" DESC LIMIT 2\n            ");
        return (uz50) g2bVar.d.b().h(new e2b(xqm0.g(sb.toString()), new String[]{String.valueOf(j), String.valueOf(gkx0Var.b)}, xqm0.g("\n                SELECT " + w1bVar.b + " FROM " + sgl0Var.a + "\n                WHERE " + channelMessageColumn.getKey() + " = ?\n                AND " + channelMessageColumn2.getKey() + " >= ?\n                ORDER BY " + channelMessageColumn2.getKey() + " ASC LIMIT 2\n            "), gkx0Var, g2bVar));
    }
}
