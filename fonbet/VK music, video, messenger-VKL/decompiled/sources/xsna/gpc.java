package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.attachments.api.publish.cta.ClipsInvolvementAttachesState;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import xsna.fpc;
import xsna.g0o;
import xsna.npc;

/* compiled from: ClipCtaWithDonutMviActor.kt */
/* loaded from: classes16.dex */
public final class gpc extends al50<ppc, fpc, on50, xpc, npc, mpc> {
    public gpc() {
        throw null;
    }

    @Override // xsna.al50, xsna.uic
    public final void clear() {
        r3y.c("tickets_posting_select");
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        ClipInvolvementActionButton clipInvolvementActionButton;
        String str;
        fpc fpcVar = (fpc) lj50Var;
        if (fpcVar.equals(fpc.b.b)) {
            c(jpc.a);
            return;
        }
        boolean z = fpcVar instanceof fpc.d;
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (!z) {
            if (fpcVar.equals(fpc.c.b)) {
                c(new lpc(((ppc) sj50Var.getCurrentState()).b));
                return;
            } else {
                if (!fpcVar.equals(fpc.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                e(npc.a.a);
                return;
            }
        }
        int i = ((fpc.d) fpcVar).b;
        if (i == -4) {
            ClipsInvolvementAttachesState.VkTicketActionState vkTicketActionState = ((ppc) sj50Var.getCurrentState()).j;
            if (vkTicketActionState == null || (str = vkTicketActionState.b) == null) {
                return;
            }
            c(new kpc(str));
            r3y.c("tickets_posting_select");
            r3y.a("tickets_posting_select", new yx0(this, 25));
            return;
        }
        ClipInvolvementActionButton clipInvolvementActionButton2 = null;
        if (i == -3) {
            clipInvolvementActionButton = ClipInvolvementActionButton.OpenChannel.e;
        } else if (i == -2) {
            clipInvolvementActionButton = ClipInvolvementActionButton.OnlineBooking.e;
        } else if (i != -1) {
            g0o g0oVar = ((ppc) sj50Var.getCurrentState()).f;
            g0o.a aVar = g0oVar instanceof g0o.a ? (g0o.a) g0oVar : null;
            if (aVar != null) {
                for (qaq0 qaq0Var : aVar.a) {
                    if (qaq0Var.a == i) {
                        clipInvolvementActionButton = new ClipInvolvementActionButton.DonutLevel(qaq0Var.a, qaq0Var.b);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            clipInvolvementActionButton = null;
        } else {
            clipInvolvementActionButton = ClipInvolvementActionButton.MessageToBusinessCommunity.e;
        }
        if (clipInvolvementActionButton != null && !clipInvolvementActionButton.equals(((ppc) sj50Var.getCurrentState()).b)) {
            clipInvolvementActionButton2 = clipInvolvementActionButton;
        }
        e(new npc.c(clipInvolvementActionButton2));
    }
}
