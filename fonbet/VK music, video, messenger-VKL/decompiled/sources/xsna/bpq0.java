package xsna;

import android.content.res.Configuration;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.R;

/* compiled from: UserProfileErrorEmptyViewHolder.kt */
/* loaded from: classes5.dex */
public final class bpq0 extends aq6<UserProfileAdapterItem.g> {
    public final zuq0 n;
    public final ImageView o;
    public final View p;
    public final View q;

    public bpq0(View view, khc0 khc0Var) {
        super(view);
        this.n = khc0Var;
        this.o = (ImageView) this.itemView.findViewById(R.id.iv_icon);
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_error_text);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.tv_retry);
        this.p = this.itemView.findViewById(R.id.content_error_view);
        this.q = this.itemView.findViewById(R.id.progress_bar);
        View view2 = this.itemView;
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(R.drawable.profile_card_bottom_rounded_background, view2);
        q6();
        textView.setText(this.itemView.getContext().getString(R.string.user_profile_error_load_profile_wall));
        bwt0.i0(textView2, new n7b0(this, 20));
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        qcy<Object>[] qcyVarArr = bwt0.a;
        this.p.setVisibility(0);
        bwt0.d0(this.q, true);
    }

    @Override // xsna.aq6
    public final void onConfigurationChanged(Configuration configuration) {
        q6();
    }

    @Override // xsna.aq6
    public final void onResume() {
        q6();
    }

    public final void q6() {
        this.o.setImageResource(dhr0.M() ? R.drawable.vk_icon_illustration_antenna_dark_56 : R.drawable.vk_icon_illustration_antenna_light_56);
    }
}
