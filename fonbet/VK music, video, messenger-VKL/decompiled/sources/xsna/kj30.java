package xsna;

import com.vk.api.generated.messages.dto.MessagesDeleteConversationSourceDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.DraftMsg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.gv30;

/* compiled from: MsgHistoryClearCmd.kt */
/* loaded from: classes2.dex */
public final class kj30 extends le6<Boolean> {
    public final Peer b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final MessagesDeleteConversationSourceDto g;
    public final Object h;

    public /* synthetic */ kj30(Peer peer, boolean z, boolean z2, boolean z3, Object obj, int i) {
        this(peer, z, (i & 4) != 0 ? false : z2, true, z3, null, (i & 64) != 0 ? null : obj);
    }

    @Override // xsna.le6
    public final Boolean e(final w2w w2wVar) {
        x6x O0 = w2wVar.O0();
        Peer peer = this.b;
        O0.b("clear msg history", new v6x(peer.b));
        boolean zb = peer.zb();
        boolean z = this.c;
        final int intValue = ((Number) bz2.c(new xd20(this.b, zb && z, this.d, this.f, w2wVar.Q0(), this.g), null)).intValue();
        if (this.e && peer.Ab(Peer.Type.USER) && z) {
            w2wVar.L0(this, new a6g0(peer, false, this.f, null));
        }
        w2wVar.I0().u(new izs() { // from class: xsna.jj30
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                List list;
                kj30 kj30Var = this;
                boolean z2 = kj30Var.d;
                Peer peer2 = kj30Var.b;
                xgl0 xgl0Var = (xgl0) obj;
                int i = intValue;
                w2w w2wVar2 = w2wVar;
                if (i > 0) {
                    long j = peer2.b;
                    gv30.a aVar = new gv30.a();
                    aVar.a = j;
                    aVar.a();
                    aVar.b();
                    aVar.e = 1;
                    aVar.d(i);
                    new zd20(new gv30(aVar), new utb(w2wVar2.I0(), w2wVar2.getExperiments()), false, z2).a(w2wVar2);
                }
                d040 o = xgl0Var.o();
                long j2 = peer2.b;
                MsgSyncState.Companion.getClass();
                list = MsgSyncState.NOT_SYNCED;
                Collection<lj30> f = o.f(j2, list);
                ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                Iterator<T> it = f.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((lj30) it.next()).c));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int intValue2 = ((Number) it2.next()).intValue();
                    gv30.a aVar2 = new gv30.a();
                    aVar2.a = j2;
                    aVar2.a();
                    aVar2.b();
                    aVar2.c();
                    aVar2.b = Integer.valueOf(intValue2);
                    new zd20(new gv30(aVar2), new utb(w2wVar2.I0(), w2wVar2.getExperiments()), false, z2).a(w2wVar2);
                }
                xgl0Var.b().e().k0(j2, DraftMsg.h);
                return s3q0.a;
            }
        });
        w2wVar.L0(this, new sh30(peer));
        w2wVar.L0(this, new pj30(this.b, uj30.d, 1, Source.NETWORK, this.f, this.h));
        w2wVar.e1(this, new OnCacheInvalidateEvent(this.h, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE));
        w2wVar.e1(this, new r680(null, Collections.singleton(new b5w(peer.b, ImItemType.DIALOG))));
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj30)) {
            return false;
        }
        kj30 kj30Var = (kj30) obj;
        return epx.f(this.b, kj30Var.b) && this.c == kj30Var.c && this.d == kj30Var.d && this.e == kj30Var.e && this.f == kj30Var.f && this.g == kj30Var.g && epx.f(this.h, kj30Var.h);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        MessagesDeleteConversationSourceDto messagesDeleteConversationSourceDto = this.g;
        int hashCode = (b + (messagesDeleteConversationSourceDto == null ? 0 : messagesDeleteConversationSourceDto.hashCode())) * 31;
        Object obj = this.h;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgHistoryClearCmd(peer=");
        sb.append(this.b);
        sb.append(", markAsSpam=");
        sb.append(this.c);
        sb.append(", afterLeaveChat=");
        sb.append(this.d);
        sb.append(", shouldReportUser=");
        sb.append(this.e);
        sb.append(", isAwaitNetwork=");
        sb.append(this.f);
        sb.append(", source=");
        sb.append(this.g);
        sb.append(", changerTag=");
        return k73.c(sb, this.h, ')');
    }

    public kj30(Peer peer, boolean z, boolean z2, boolean z3, boolean z4, MessagesDeleteConversationSourceDto messagesDeleteConversationSourceDto, Object obj) {
        this.b = peer;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = messagesDeleteConversationSourceDto;
        this.h = obj;
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
