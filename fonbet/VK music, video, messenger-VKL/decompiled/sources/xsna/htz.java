package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: LoadingMoreCommentsAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class htz extends p1u0<itz> {
    @Override // xsna.p1u0
    public final vfz<? extends itz> b(ViewGroup viewGroup) {
        return new zr8(bwt0.I(R.layout.im_loading_more_comments_item, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof itz;
    }
}
