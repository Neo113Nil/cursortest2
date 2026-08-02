package xsna;

import android.view.ViewGroup;
import com.vk.channels.impl.comments.e;
import com.vkontakte.android.R;

/* compiled from: NegativeRepliesAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class n060 extends p1u0<q060> {
    public final e.a a;

    public n060(e.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends q060> b(ViewGroup viewGroup) {
        return new p060(bwt0.I(R.layout.im_negative_replies_placeholder_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof q060;
    }
}
