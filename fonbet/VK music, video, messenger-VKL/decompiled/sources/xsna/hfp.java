package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: EmptyCommentsAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class hfp extends p1u0<kfp> {
    @Override // xsna.p1u0
    public final vfz<? extends kfp> b(ViewGroup viewGroup) {
        return new jfp(bwt0.I(R.layout.im_empty_comments_item, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof kfp;
    }
}
