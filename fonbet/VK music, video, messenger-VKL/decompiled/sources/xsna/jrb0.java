package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: PollResultFooterHolder.kt */
/* loaded from: classes4.dex */
public final class jrb0 extends vif0<Integer> {
    public final TextView n;

    public jrb0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.poll_result_footer_view, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.poll_results_votes_count);
    }

    @Override // xsna.vif0
    public final void i6(Integer num) {
        String f;
        int intValue = num.intValue();
        if (intValue == 0) {
            Context context = e43.a;
            f = (context != null ? context : null).getString(R.string.poll_no_votes);
        } else {
            Context context2 = e43.a;
            f = enj.f(R.plurals.poll_voters, intValue, context2 != null ? context2 : null);
        }
        this.n.setText(f);
    }
}
