package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: LoadingCommentsAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class usz extends p1u0<wsz> {
    @Override // xsna.p1u0
    public final vfz<? extends wsz> b(ViewGroup viewGroup) {
        return new vsz(bwt0.I(R.layout.im_loading_comments_item, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof wsz;
    }
}
