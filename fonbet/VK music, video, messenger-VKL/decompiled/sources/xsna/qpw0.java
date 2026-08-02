package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vk.voip.ui.history.friends.ui.a;
import com.vkontakte.android.R;
import xsna.bqw0;

/* compiled from: VoipHistoryFriendsPageLoadingErrorViewHolder.kt */
/* loaded from: classes7.dex */
public final class qpw0 extends aqw0<bqw0.c> {
    public final zpw0<a.e> l;
    public final TextView m;

    public qpw0(ViewGroup viewGroup, VoipHistoryFriendsFragment.c cVar) {
        super(R.layout.vk_view_default_list_error_view, viewGroup);
        this.l = cVar;
        this.m = (TextView) this.itemView.findViewById(R.id.error_button);
    }

    @Override // xsna.aqw0, xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        bwt0.i0(this.m, new qyi0(this, 25));
    }

    @Override // xsna.aqw0
    public final void h6(bqw0.c cVar) {
        bwt0.i0(this.m, new qyi0(this, 25));
    }
}
