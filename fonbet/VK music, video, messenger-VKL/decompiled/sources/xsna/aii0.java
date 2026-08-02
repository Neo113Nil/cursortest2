package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.messages.dto.MessagesSendReactionSourceDto;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.InstantJob;
import java.util.Iterator;
import xsna.u6x;

/* compiled from: SendMsgReactionJob.kt */
/* loaded from: classes.dex */
public final class aii0 extends u4w {
    public final long c;
    public final int d;
    public final int e;
    public final Integer f;
    public final Integer g;
    public final String h;

    /* compiled from: SendMsgReactionJob.kt */
    public static final class a implements s7x<aii0> {
        @Override // xsna.s7x
        public final aii0 a(ny90 ny90Var) {
            long e = ny90Var.e("dialog_id");
            int c = ny90Var.c("cnv_msg_id");
            int c2 = ny90Var.c("local_msg_id");
            int c3 = ny90Var.c("reaction_id");
            Integer valueOf = c3 != -1 ? Integer.valueOf(c3) : null;
            int c4 = ny90Var.c("old_reaction_id");
            return new aii0(e, c, c2, valueOf, c4 != -1 ? Integer.valueOf(c4) : null, ny90Var.f("source"));
        }

        @Override // xsna.s7x
        public final void b(aii0 aii0Var, ny90 ny90Var) {
            aii0 aii0Var2 = aii0Var;
            ny90Var.n("dialog_id", aii0Var2.c);
            ny90Var.l("cnv_msg_id", aii0Var2.d);
            ny90Var.l("local_msg_id", aii0Var2.e);
            Integer num = aii0Var2.f;
            ny90Var.l("reaction_id", num != null ? num.intValue() : -1);
            Integer num2 = aii0Var2.g;
            ny90Var.l("old_reaction_id", num2 != null ? num2.intValue() : -1);
            ny90Var.o("source", aii0Var2.h);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "SendMsgReactionJob";
        }
    }

    public aii0(long j, int i, int i2, Integer num, Integer num2, String str) {
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = num;
        this.g = num2;
        this.h = str;
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        Q(w2wVar, false);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        tfx tfxVar;
        Object obj;
        long j = this.c;
        Integer num = this.f;
        try {
            if (num != null) {
                vg20 vg20Var = new vg20();
                UserId userId = new UserId(j);
                int i = this.d;
                int intValue = num.intValue();
                UserId d = fto0.d(w2wVar.Q0());
                Iterator<E> it = MessagesSendReactionSourceDto.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next = it.next();
                    if (epx.f(((MessagesSendReactionSourceDto) next).j(), this.h)) {
                        obj = next;
                        break;
                    }
                }
                tfxVar = vg20Var.s(userId, i, intValue, d, (MessagesSendReactionSourceDto) obj);
            } else {
                UserId userId2 = new UserId(j);
                int i2 = this.d;
                UserId d2 = fto0.d(w2wVar.Q0());
                tfx tfxVar2 = new tfx("messages.deleteReaction", new j8(19), new jh(19));
                tfx.n(tfxVar2, "peer_id", userId2, 0L, 0L, 12);
                tfx.l(tfxVar2, "cmid", i2, 0, 0, 8);
                if (d2 != null) {
                    tfx.n(tfxVar2, "group_id", d2, 0L, 0L, 8);
                }
                tfxVar = tfxVar2;
            }
            if (((BaseBoolIntDto) bz2.c(bz2.n(tfxVar, new irt(20)), "SendMsgReactionJob")).i() == 1) {
            } else {
                throw new IllegalStateException("Can't change my reaction");
            }
        } catch (Exception e) {
            if (sv1.t(e)) {
                Q(w2wVar, true);
                throw e;
            }
            Q(w2wVar, false);
        }
    }

    public final void Q(w2w w2wVar, boolean z) {
        wyi0 wyi0Var = new wyi0(this.c, this.d, this.e, this.g);
        w2wVar.e1(this, new za80(this.c, this.d, this.e, this.g, this));
        if (z) {
            w2wVar.J0(this, wyi0Var).await();
        } else {
            w2wVar.J0(this, wyi0Var);
        }
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
        return "im-reactions-job";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "SendMsgReactionJob";
    }
}
