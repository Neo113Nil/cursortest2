package xsna;

import com.vk.voip.ui.share.link.pager.view.c;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VoipShareLinkPagerTabItemViewHolder.kt */
/* loaded from: classes7.dex */
public final class t1x0 extends vfz<r1x0> {
    public final z4t0 l;
    public final u1x0 m;
    public com.vk.voip.ui.share.link.pager.view.c n;

    public t1x0(z4t0 z4t0Var, u1x0 u1x0Var) {
        super(u1x0Var);
        this.l = z4t0Var;
        this.m = u1x0Var;
        bwt0.i0(this.itemView, new s1x0(this, 0));
    }

    @Override // xsna.vfz
    public final void W5(r1x0 r1x0Var) {
        int i;
        r1x0 r1x0Var2 = r1x0Var;
        com.vk.voip.ui.share.link.pager.view.c cVar = r1x0Var2.b;
        if (cVar instanceof c.a) {
            i = R.string.voip_share_link_page_long_link_title;
        } else {
            if (!(cVar instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.voip_share_link_page_with_password_link_title;
        }
        u1x0 u1x0Var = this.m;
        u1x0Var.setText(i);
        u1x0Var.setIsSelected(r1x0Var2.c);
        this.n = cVar;
    }
}
