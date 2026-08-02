package xsna;

import android.view.ViewGroup;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;

/* compiled from: PollViewerAdapter.kt */
/* loaded from: classes4.dex */
public final class ftb0 extends vif0<PollAttachment> implements AbstractPollView.c, asb0 {
    public final AbstractPollView n;

    public ftb0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.attach_poll, 0);
        AbstractPollView abstractPollView = (AbstractPollView) this.itemView.findViewById(R.id.poll_view);
        this.n = abstractPollView;
        abstractPollView.setPollViewCallback(this);
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            this.itemView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void C3(Poll poll) {
        kbj0.e(nr4.b(), this.itemView.getContext(), new PollAttachment(poll), false, null, false, null, 60);
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final boolean G4() {
        return o25.a().o().o;
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void J3(Poll poll, String str) {
        int i = PollEditorFragment.a.m;
        PollEditorFragment.a.C1520a.b(new PollAttachment(poll), str).k(this.itemView.getContext());
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void J4(Poll poll) {
        new PollResultsFragment.a(poll, true).k(this.itemView.getContext());
    }

    @Override // xsna.asb0
    public final void b0(Poll poll) {
        ysg0.b.a(new zrb0(poll));
        nub0.a().b0(poll);
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void h3(Poll poll) {
        nub0.a().k(this.itemView.getContext(), poll);
    }

    @Override // xsna.vif0
    public final void i6(PollAttachment pollAttachment) {
        PollAttachment pollAttachment2 = pollAttachment;
        if (pollAttachment2 != null) {
            Poll poll = pollAttachment2.f;
            AbstractPollView abstractPollView = this.n;
            if (abstractPollView.d == null || !epx.f(abstractPollView.getPoll(), poll)) {
                abstractPollView.f(poll, abstractPollView.d != null && abstractPollView.getPoll().b == poll.b && epx.f(abstractPollView.getPoll().c, poll.c));
            }
        }
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void s3(UserId userId) {
        nub0.a().l(this.itemView.getContext(), userId);
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final asb0 K2() {
        return this;
    }
}
