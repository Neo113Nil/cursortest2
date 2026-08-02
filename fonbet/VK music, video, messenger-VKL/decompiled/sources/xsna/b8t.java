package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.donut.impl.PaidSubscriptionsFragment;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.superapp.api.dto.app.GameSubscription;
import com.vkontakte.android.R;

/* compiled from: GameSubscriptionViewHolder.kt */
/* loaded from: classes18.dex */
public final class b8t extends j0n0<a8t> implements View.OnClickListener {
    public final izs<a8t, s3q0> n;
    public final VKImageView o;
    public final TextView p;
    public final TextView q;
    public a8t r;

    public b8t(ViewGroup viewGroup, PaidSubscriptionsFragment.c cVar) {
        super(viewGroup, R.layout.settings_game_subscription, 0);
        this.n = cVar;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.subscription_icon);
        vKImageView.setCornerRadius(iah0.a(10));
        this.o = vKImageView;
        this.p = (TextView) this.itemView.findViewById(R.id.subscription_title);
        this.q = (TextView) this.itemView.findViewById(R.id.payed_date);
        bwt0.h0(this, this.itemView);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        a8t a8tVar = (a8t) obj;
        GameSubscription gameSubscription = a8tVar.b;
        this.r = a8tVar;
        this.o.O0(gameSubscription.j, ImageScreenSize.SIZE_48DP);
        this.p.setText(gameSubscription.k);
        long j = gameSubscription.m;
        if (j == 0) {
            Long l = gameSubscription.r;
            j = l != null ? l.longValue() : 0L;
        }
        this.q.setText(this.itemView.getContext().getString(R.string.vk_subscription_payed, pvo0.o((int) j, false, true)));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a8t a8tVar = this.r;
        if (a8tVar != null) {
            this.n.invoke(a8tVar);
        }
    }
}
