package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: UnsupportedAttachAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class s6q0 extends p1u0<u6q0> {
    @Override // xsna.p1u0
    public final vfz<? extends u6q0> b(ViewGroup viewGroup) {
        return new t6q0(bwt0.I(R.layout.im_unsupported_comment_attach_item, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof u6q0;
    }
}
