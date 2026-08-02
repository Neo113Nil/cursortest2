package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.ButtonPanelPosting;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e;
import com.vkontakte.android.R;

/* compiled from: BottomPanelPostingCommonButtonViewHolder.kt */
/* loaded from: classes4.dex */
public final class s68 extends vfz<e.a.b> {
    public final izs<e.a, s3q0> l;
    public final ImageView m;
    public final View n;
    public e.a.b o;

    public s68(ViewGroup viewGroup, com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.c cVar) {
        super(R.layout.item_posting_bottom_panel_button, viewGroup);
        this.l = cVar;
        this.m = (ImageView) this.itemView.findViewById(R.id.icon_button_panel);
        View findViewById = this.itemView.findViewById(R.id.root_layout);
        bwt0.s0(findViewById, 0.96f);
        this.n = findViewById;
        bwt0.i0(findViewById, new fm0(this, 8));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(e.a.b bVar) {
        e.a.b bVar2 = bVar;
        this.o = bVar2;
        ButtonPanelPosting buttonPanelPosting = bVar2.c;
        this.m.setImageResource(buttonPanelPosting.j());
        View view = this.itemView;
        view.setContentDescription(view.getContext().getString(buttonPanelPosting.i()));
        View view2 = this.itemView;
        f370.H(view2, view2.getContext().getString(buttonPanelPosting.h()));
    }
}
