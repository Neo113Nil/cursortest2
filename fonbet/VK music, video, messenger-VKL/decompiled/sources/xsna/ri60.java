package xsna;

import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.feed.core.models.feedback.FeedbackPoll;
import com.vk.newsfeed.impl.fragments.NewsfeedFeedbackPollFragment;
import java.util.List;

/* compiled from: NewsfeedFeedbackPollPresenter.kt */
/* loaded from: classes4.dex */
public final class ri60 implements gm6 {
    public final NewsfeedFeedbackPollFragment b;
    public FeedbackPoll c;
    public int d;
    public int e;

    public ri60(NewsfeedFeedbackPollFragment newsfeedFeedbackPollFragment) {
        this.b = newsfeedFeedbackPollFragment;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.gm6
    public final void d() {
        FeedbackPoll feedbackPoll = this.c;
        NewsfeedFeedbackPollFragment newsfeedFeedbackPollFragment = this.b;
        if (feedbackPoll == null) {
            newsfeedFeedbackPollFragment.finish();
            return;
        }
        FeedbackPoll.Poll poll = feedbackPoll.j;
        String str = poll.b;
        List<FeedbackPoll.Question> list = poll.c;
        Toolbar toolbar = newsfeedFeedbackPollFragment.T;
        if (toolbar != null) {
            toolbar.setTitle(str);
        }
        newsfeedFeedbackPollFragment.lo(this.d + 1, list.size());
        newsfeedFeedbackPollFragment.ko(list.get(this.d));
        FeedbackPoll.Gratitude gratitude = poll.d;
        TextView textView = newsfeedFeedbackPollFragment.c0;
        if (textView != null) {
            textView.setText(gratitude.b);
        }
        TextView textView2 = newsfeedFeedbackPollFragment.d0;
        if (textView2 != null) {
            textView2.setText(gratitude.c);
        }
        TextView textView3 = newsfeedFeedbackPollFragment.e0;
        if (textView3 != null) {
            textView3.setText(gratitude.d);
        }
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
