package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.InstantJob;
import java.util.List;
import java.util.Set;
import xsna.u6x;

/* compiled from: MarkMsgReactionsAsReadJob.kt */
/* loaded from: classes.dex */
public final class yn00 extends u4w {
    public final long c;
    public final Set<Integer> d;

    /* compiled from: MarkMsgReactionsAsReadJob.kt */
    public static final class a implements s7x<yn00> {
        @Override // xsna.s7x
        public final yn00 a(ny90 ny90Var) {
            return new yn00(j5g.S0(ny90Var.d("cnv_msg_ids")), ny90Var.e("peer_id"));
        }

        @Override // xsna.s7x
        public final void b(yn00 yn00Var, ny90 ny90Var) {
            yn00 yn00Var2 = yn00Var;
            ny90Var.n("peer_id", yn00Var2.c);
            ny90Var.m("cnv_msg_ids", j5g.O0(yn00Var2.d));
        }

        @Override // xsna.s7x
        public final String getType() {
            return "MarkMsgReactionsAsReadJob";
        }
    }

    public yn00(Set set, long j) {
        this.c = j;
        this.d = set;
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        mnh0.s(w2wVar.I0(), this.c, j5g.O0(this.d));
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        UserId userId = new UserId(this.c);
        List O0 = j5g.O0(this.d);
        tfx tfxVar = new tfx("messages.markReactionsAsRead", new jr(21), new kr(26));
        tfx.n(tfxVar, "peer_id", userId, 0L, 0L, 12);
        if (O0 != null) {
            tfxVar.i("cmids", O0);
        }
        if (((BaseBoolIntDto) bz2.l(tfxVar, true)).i() != 1) {
            throw new IllegalStateException("Can't mark reactions as read");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn00)) {
            return false;
        }
        yn00 yn00Var = (yn00) obj;
        return this.c == yn00Var.c && epx.f(this.d, yn00Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Long.hashCode(this.c) * 31);
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
        return "MarkMsgReactionsAsReadJob";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final long r() {
        return 3000L;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "MarkMsgReactionsAsReadJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarkMsgReactionsAsReadJob(dialogId=");
        sb.append(this.c);
        sb.append(", cnvIds=");
        return ur.c(sb, this.d, ')');
    }
}
