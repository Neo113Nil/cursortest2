package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: FeedLikesPlaceholder.kt */
/* loaded from: classes18.dex */
public final class j1r extends vif0<Integer> {
    public final TextView n;

    public j1r(ViewGroup viewGroup) {
        super(viewGroup, R.layout.view_feed_likes_placeholder, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.placeholder_feed_likes_title);
    }

    @Override // xsna.vif0
    public final void i6(Integer num) {
        Integer num2 = num;
        int i = (num2 != null && num2.intValue() == 2) ? 8 : 0;
        TextView textView = this.n;
        textView.setVisibility(i);
        textView.setText(R.string.no_feed_likes_list);
    }
}
