package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bqw0;

/* compiled from: VoipHistoryFriendsStickyHeaderViewHolder.kt */
/* loaded from: classes7.dex */
public final class ypw0 extends aqw0<bqw0.e> {
    public final TextView l;

    public ypw0(ViewGroup viewGroup) {
        super(R.layout.voip_history_friends_item_sticky_header, viewGroup);
        this.l = (TextView) this.itemView;
    }

    @Override // xsna.aqw0
    /* renamed from: i6, reason: merged with bridge method [inline-methods] */
    public final void W5(bqw0.e eVar) {
        String str;
        if (eVar instanceof bqw0.e.b) {
            str = this.itemView.getContext().getString(R.string.voip_history_friends_header_important);
        } else {
            if (!(eVar instanceof bqw0.e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((bqw0.e.a) eVar).b;
        }
        this.l.setText(str);
    }
}
