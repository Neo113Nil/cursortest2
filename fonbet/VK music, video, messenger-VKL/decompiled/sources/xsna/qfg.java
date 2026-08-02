package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: CommentsOrderAdapter.kt */
/* loaded from: classes16.dex */
public final class qfg extends p1u0<wfg> {
    public final /* synthetic */ j20 a;

    public qfg(j20 j20Var) {
        this.a = j20Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends wfg> b(ViewGroup viewGroup) {
        return new vfg(bwt0.I(R.layout.im_comments_order_menu_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof wfg;
    }
}
