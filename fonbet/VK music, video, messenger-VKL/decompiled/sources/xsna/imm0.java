package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vkontakte.android.attachments.PollAttachment;

/* compiled from: StoryViewPollDelegate.kt */
/* loaded from: classes6.dex */
public final class imm0 implements AbstractPollView.c {
    public final /* synthetic */ jmm0 b;

    public imm0(jmm0 jmm0Var) {
        this.b = jmm0Var;
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void C3(Poll poll) {
        kbj0.e(nr4.b(), this.b.d, new PollAttachment(poll), false, null, false, null, 60);
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final boolean G4() {
        return o25.a().o().o;
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void J4(Poll poll) {
        if (poll.h > 0) {
            b6m.a().c(this.b.d, poll);
        }
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final asb0 K2() {
        return this.b.h;
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void h3(Poll poll) {
        b6m.a().e(this.b.d, poll.j ? "board_poll" : "poll", poll.b, poll.c, null, null);
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void s3(UserId userId) {
        b6m.a().j(this.b.d, userId);
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void J3(Poll poll, String str) {
    }
}
