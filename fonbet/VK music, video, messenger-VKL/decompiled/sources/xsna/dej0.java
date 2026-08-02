package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.AdsButton;
import com.vk.core.view.VkRatingView;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import xsna.gd60;

/* compiled from: ShittyFooterHolder.kt */
/* loaded from: classes4.dex */
public final class dej0 extends qi6<ShitAttachment> implements View.OnClickListener, AdsButton.b {
    public final VkRatingView C;
    public final TextView D;
    public final TextView E;
    public final AdsButton F;
    public u1c0 G;

    public dej0(ViewGroup viewGroup, h170 h170Var) {
        super(R.layout.news_ads_footer, viewGroup);
        this.C = (VkRatingView) this.itemView.findViewById(R.id.attach_rating);
        this.D = (TextView) this.itemView.findViewById(R.id.attach_description);
        this.E = (TextView) this.itemView.findViewById(R.id.attach_title);
        AdsButton adsButton = (AdsButton) this.itemView.findViewById(R.id.attach_subtitle);
        this.F = adsButton;
        ysm0 ysm0Var = new ysm0(adsButton, h170Var, null, 12);
        adsButton.setOnClickListener(this);
        adsButton.setAnimationDelegate(ysm0Var);
        adsButton.setStyleChangeListener(new xb20(this, 14));
        this.itemView.setOnClickListener(this);
        this.itemView.setMinimumHeight(cn70.b(54));
    }

    @Override // xsna.qi6
    public final void E6(ShitAttachment shitAttachment) {
        ShitAttachment shitAttachment2 = shitAttachment;
        float f = shitAttachment2.t;
        String str = shitAttachment2.u;
        String str2 = shitAttachment2.D;
        AdsButton adsButton = this.F;
        adsButton.b(0, true);
        String str3 = shitAttachment2.n;
        int i = !drm0.N(str3) ? 8 : 0;
        TextView textView = this.E;
        textView.setVisibility(i);
        int i2 = (drm0.N(str2) && drm0.N(str3)) ? 8 : 0;
        TextView textView2 = this.D;
        textView2.setVisibility(i2);
        textView.setText(shitAttachment2.o);
        if (!drm0.N(str3)) {
            str2 = str3;
        }
        textView2.setText(str2);
        if (!shitAttachment2.l0 || drm0.N(str)) {
            str = shitAttachment2.p;
        }
        adsButton.setText(str);
        int i3 = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 8;
        VkRatingView vkRatingView = this.C;
        vkRatingView.setVisibility(i3);
        vkRatingView.setRating(f);
        u1c0 u1c0Var = this.G;
        Object obj = u1c0Var != null ? u1c0Var.g : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 0;
        adsButton.b(intValue, intValue == 1);
    }

    @Override // com.vk.core.view.AdsButton.b
    public final void O2(int i) {
        u1c0 u1c0Var = this.G;
        if (u1c0Var != null) {
            u1c0Var.g = Integer.valueOf(i);
        }
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.G = u1c0Var;
        super.a6(u1c0Var);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = this.itemView.getContext();
        ShitAttachment q6 = q6();
        if (q6 == null) {
            return;
        }
        ShitAttachment q62 = q6();
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : -1;
        if (epx.f(view, this.F)) {
            gd60 a = hd60.a();
            gd60.a aVar = gd60.a;
            a.O(context, q62, i, false);
        } else if (q62.h0 == null) {
            hd60.a().r0(context, q6, i, AdClickContext.FOOTER);
        }
    }
}
