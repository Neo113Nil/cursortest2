package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.PhotoStripView;
import com.vk.log.L;
import com.vk.poll.fragments.PollResultsFragment;
import com.vkontakte.android.R;

/* compiled from: PollResultAnswerHolder.kt */
/* loaded from: classes4.dex */
public final class irb0 extends vif0<aqb0> {
    public final TextView n;
    public final AppCompatTextView o;
    public final View p;
    public final PhotoStripView q;
    public final TextView r;

    public irb0(ViewGroup viewGroup, PollResultsFragment.c cVar) {
        super(viewGroup, R.layout.poll_results_item_view, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.poll_answer);
        this.o = (AppCompatTextView) this.itemView.findViewById(R.id.poll_rate);
        this.p = this.itemView.findViewById(R.id.poll_visual_result);
        this.q = (PhotoStripView) this.itemView.findViewById(R.id.poll_strip_view);
        this.r = (TextView) this.itemView.findViewById(R.id.poll_votes_count);
        jjc.g(this.itemView, new b7(18, this, cVar));
    }

    @Override // xsna.vif0
    public final void i6(aqb0 aqb0Var) {
        L.G("Can't bind this view holder with single item!");
    }
}
