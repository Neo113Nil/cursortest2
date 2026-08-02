package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: EmptyListItemAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class egp extends p1u0<cgp> {
    @Override // xsna.p1u0
    public final vfz<? extends cgp> b(ViewGroup viewGroup) {
        return new fgp(bwt0.I(R.layout.im_channel_item_empty_list_teaser, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof cgp;
    }
}
