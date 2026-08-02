package xsna;

import android.util.SparseArray;
import com.vk.dto.reactions.ItemReactions;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.wab;

/* compiled from: SetChannelMsgMyReactionCmd.kt */
/* loaded from: classes2.dex */
public final class hyi0 extends le6<s3q0> {
    public final long b;
    public final int c;
    public final wab d;
    public final boolean e = true;

    public hyi0(long j, int i, wab wabVar) {
        this.b = j;
        this.c = i;
        this.d = wabVar;
    }

    @Override // xsna.le6
    public final s3q0 e(final w2w w2wVar) {
        w2wVar.O0().c(new q8i0(this, 3));
        xgl0 I0 = w2wVar.I0();
        final int i = this.c;
        I0.u(new izs() { // from class: xsna.gyi0
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
            
                if (r5.intValue() != r2) goto L16;
             */
            @Override // xsna.izs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                r3b y = ((xgl0) obj).y();
                int i2 = i;
                SparseArray<Msg> T = y.T(Collections.singletonList(Integer.valueOf(i2)));
                u4q0 u4q0Var = zik0.a;
                Msg msg = T.get(i2);
                if (msg == null) {
                    return null;
                }
                if (!(msg instanceof MsgFromChannel)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                wab wabVar = this.d;
                boolean z = wabVar instanceof wab.a;
                w2w w2wVar2 = w2wVar;
                if (z) {
                    ItemReactions itemReactions = ((MsgFromChannel) msg).I.p;
                    if (itemReactions != null) {
                        Integer num = itemReactions.e;
                        int i3 = ((wab.a) wabVar).a;
                        if (num != null) {
                        }
                    }
                    w2wVar2.I0().y().D(i2, Integer.valueOf(((wab.a) wabVar).a));
                } else {
                    if (!epx.f(wabVar, wab.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ItemReactions itemReactions2 = ((MsgFromChannel) msg).I.p;
                    if (itemReactions2 != null && itemReactions2.e != null) {
                        w2wVar2.I0().y().D(i2, Integer.valueOf(wabVar.a()));
                    }
                }
                return s3q0.a;
            }
        });
        long j = this.b;
        w2wVar.e1(this, new o280("ChannelMessageAddReactionCmd", j, i));
        boolean z = this.e;
        wab wabVar = this.d;
        w2wVar.O0().a(z ? new oug(j, i, wabVar) : new n6b(j, i, wabVar));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyi0)) {
            return false;
        }
        hyi0 hyi0Var = (hyi0) obj;
        return this.b == hyi0Var.b && this.c == hyi0Var.c && epx.f(this.d, hyi0Var.d) && this.e == hyi0Var.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + shy.a(this.c, Long.hashCode(this.b) * 31, 31)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("SetChannelMsgMyReactionCmd(channelId=");
        sb.append(this.b);
        sb.append(", msgLocalId=");
        sb.append(this.c);
        sb.append(", mode=");
        sb.append(this.d);
        sb.append(", isCommunityChannel=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
