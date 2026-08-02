package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.instantjobs.InstantJob;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.b5w;
import xsna.u6x;

/* compiled from: ChannelDeleteJob.kt */
/* loaded from: classes.dex */
public final class qxa extends u4w {
    public final Peer c;

    /* compiled from: ChannelDeleteJob.kt */
    public static final class a implements s7x<qxa> {
        @Override // xsna.s7x
        public final qxa a(ny90 ny90Var) {
            return new qxa(com.vk.dto.common.b.e(ny90Var.e("channel_id")));
        }

        @Override // xsna.s7x
        public final void b(qxa qxaVar, ny90 ny90Var) {
            ny90Var.n("channel_id", qxaVar.c.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ChannelDeleteJob";
        }
    }

    public qxa(Peer peer) {
        this.c = peer;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        R(w2wVar);
        Q(w2wVar);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).X()) {
            new txa(this.c).n(w2wVar);
            Q(w2wVar);
        } else {
            R(w2wVar);
            Q(w2wVar);
        }
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Object c;
        Peer peer = this.c;
        c = bz2.c(new nxa(peer), null);
        boolean booleanValue = ((Boolean) c).booleanValue();
        if (booleanValue) {
            new txa(peer).n(w2wVar);
            Q(w2wVar);
        } else {
            if (booleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            R(w2wVar);
            Q(w2wVar);
        }
    }

    public final void Q(w2w w2wVar) {
        w2wVar.S0().Q(this, OnChannelsCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
        w2wVar.e1(this, new r680(this, Collections.singleton(b5w.a.a(this.c.b))));
    }

    public final void R(w2w w2wVar) {
        w2wVar.I0().a().q(this.c.b, ChannelActionInProgress.NONE, null);
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
        return sa30.p(this.c.b);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ChannelDeleteJob";
    }
}
