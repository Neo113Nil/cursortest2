package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.model.actions.ActionPoll;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.writebar.WriteBar;
import java.util.Collections;
import java.util.List;

/* compiled from: CeaSubtitle.java */
/* loaded from: classes12.dex */
public final class xla implements m0n0, s0y0, asb0 {
    public Object b;

    public /* synthetic */ xla(Object obj) {
        this.b = obj;
    }

    public static xla a(iaz0 iaz0Var) {
        xla xlaVar = new xla();
        xlaVar.b = iaz0Var;
        return xlaVar;
    }

    public void b(iaz0 iaz0Var) {
        if (((iaz0) this.b) != null) {
            return;
        }
        this.b = iaz0Var;
    }

    @Override // xsna.asb0
    public void b0(Poll poll) {
        ActionPoll actionPoll;
        ClickablePoll clickablePoll = ((jmm0) this.b).g;
        if (clickablePoll == null || (actionPoll = clickablePoll.e) == null) {
            return;
        }
        actionPoll.b = poll;
    }

    public io.reactivex.rxjava3.internal.operators.single.y d(long j, UserId userId) {
        StringBuilder sb = new StringBuilder();
        sb.append(userId.b);
        sb.append('_');
        sb.append(j);
        return rsg0.w0(yfb.x(((yd10) this.b).C(Collections.singletonList(sb.toString())))).l(new vj0(new kz0(17), 13));
    }

    @Override // xsna.m0n0
    public List getCues(long j) {
        return j >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // xsna.m0n0
    public long getEventTime(int i) {
        fxc0.p(i == 0);
        return 0L;
    }

    @Override // xsna.m0n0
    public int getEventTimeCount() {
        return 1;
    }

    @Override // xsna.m0n0
    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // xsna.s0y0
    public boolean i(Attachment attachment) {
        oob oobVar = (oob) this.b;
        if (!(attachment instanceof PendingPhotoAttachment) && !(attachment instanceof PendingDocumentAttachment)) {
            return false;
        }
        Attach b = ca3.b(attachment);
        if (b != null) {
            tob tobVar = oobVar.z;
            oz30.c(tobVar == null ? null : tobVar, 0, null, null, null, Collections.singletonList(b), null, null, null, null, 495);
        }
        WriteBar writeBar = oobVar.q;
        (writeBar != null ? writeBar : null).K();
        return true;
    }

    @Override // xsna.s0y0
    public void e() {
    }

    @Override // xsna.s0y0
    public void f() {
    }

    @Override // xsna.s0y0
    public void g() {
    }

    @Override // xsna.s0y0
    public void c(List list, List list2) {
    }
}
