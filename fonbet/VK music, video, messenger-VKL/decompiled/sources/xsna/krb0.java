package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.polls.Poll;
import com.vkontakte.android.R;

/* compiled from: PollResultHeaderHolder.kt */
/* loaded from: classes4.dex */
public final class krb0 extends vif0<Poll> {
    public final TextView n;
    public final TextView o;
    public final TextView p;

    public krb0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.poll_result_header_view, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.poll_result_question);
        this.o = (TextView) this.itemView.findViewById(R.id.poll_result_subtitle);
        TextView textView = (TextView) this.itemView.findViewById(R.id.poll_result_author_name);
        this.p = textView;
        textView.setOnClickListener(new mna(2, this, viewGroup.getContext()));
    }

    @Override // xsna.vif0
    public final void i6(Poll poll) {
        Poll poll2 = poll;
        if (poll2 != null) {
            this.n.setText(poll2.d);
            this.o.setText(poll2.i ? R.string.poll_anonym : R.string.poll_public);
            Owner owner = poll2.w;
            TextView textView = this.p;
            if (owner == null) {
                textView.setVisibility(8);
                textView.setClickable(false);
            } else {
                textView.setVisibility(0);
                textView.setText(owner.c);
                textView.setClickable(true);
            }
        }
    }
}
