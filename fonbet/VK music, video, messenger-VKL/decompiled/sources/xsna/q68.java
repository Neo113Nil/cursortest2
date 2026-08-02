package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.preference.Preference;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e;
import com.vkontakte.android.R;

/* compiled from: BottomPanelPostingAnimatedButtonViewHolder.kt */
/* loaded from: classes4.dex */
public final class q68 extends vfz<e.a.AbstractC1393a> {
    public final com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.b l;
    public final izs<e.a, s3q0> m;
    public final int n;
    public final ImageView o;
    public final View p;
    public e.a.AbstractC1393a q;

    public q68(com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.b bVar, ViewGroup viewGroup, com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.c cVar) {
        super(R.layout.item_posting_bottom_panel_button_animated, viewGroup);
        this.l = bVar;
        this.m = cVar;
        this.n = e3m.a(R.dimen.posting_attach_panel_item_size, this.itemView.getContext());
        this.o = (ImageView) this.itemView.findViewById(R.id.icon_button_panel);
        View findViewById = this.itemView.findViewById(R.id.root_layout);
        bwt0.s0(findViewById, 0.96f);
        this.p = findViewById;
        bwt0.i0(findViewById, new com.vk.voip.ui.menu.feature.a(this, 8));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(e.a.AbstractC1393a abstractC1393a) {
        e.a.AbstractC1393a abstractC1393a2 = abstractC1393a;
        this.q = abstractC1393a2;
        View view = this.itemView;
        view.setContentDescription(view.getContext().getString(abstractC1393a2.c.i()));
        View view2 = this.itemView;
        f370.H(view2, view2.getContext().getString(R.string.posting_attachments_action_select_from_more));
        if (!this.l.n.a) {
            int i = 0;
            if (Preference.j().getInt("three_dots_animation_counter", 0) < 3) {
                io.reactivex.rxjava3.internal.operators.observable.m1 b = sa30.b(new io.reactivex.rxjava3.internal.operators.observable.s0(new p68(i, this, abstractC1393a2)));
                int i2 = 4;
                lf1 lf1Var = new lf1(new kf1(this, i2), i2);
                int i3 = kwg0.a;
                b.subscribe(lf1Var, new hwg0());
                return;
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ImageView imageView = this.o;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.vk_icon_more_horizontal_28);
    }
}
