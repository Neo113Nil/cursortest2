package xsna;

import android.view.ViewGroup;
import com.vk.channels.impl.comments.e;
import com.vkontakte.android.R;

/* compiled from: CommentsHeaderAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class peg extends p1u0<reg> {
    public final e.a a;

    public peg(e.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends reg> b(ViewGroup viewGroup) {
        return new qeg(bwt0.I(R.layout.im_comments_header_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof reg;
    }
}
