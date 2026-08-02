package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.channels.impl.comments.e;
import com.vkontakte.android.R;

/* compiled from: CommentAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class lag extends p1u0<xbg> {
    public final e.a a;
    public final RecyclerView.u b = new RecyclerView.u();

    public lag(e.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends xbg> b(ViewGroup viewGroup) {
        return new ubg(bwt0.I(R.layout.im_comment_item, viewGroup, false), this.b, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof xbg;
    }
}
