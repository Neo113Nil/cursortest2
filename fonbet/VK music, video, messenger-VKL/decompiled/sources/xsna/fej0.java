package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.AdsButton;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.Arrays;
import xsna.gd60;

/* compiled from: ShittyFooterHolderShortBtn.kt */
/* loaded from: classes4.dex */
public final class fej0 extends qi6<ShitAttachment> implements View.OnClickListener, AdsButton.b {
    public final TextView C;
    public final TextView D;
    public final ImageView E;
    public final TextView F;
    public final AdsButton G;
    public final View H;
    public final ysm0 I;

    public fej0(ViewGroup viewGroup, h170 h170Var) {
        super(R.layout.news_ads_footer_redesign, viewGroup);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.itemView.findViewById(R.id.footer);
        this.C = (TextView) this.itemView.findViewById(R.id.attach_description);
        this.D = (TextView) this.itemView.findViewById(R.id.attach_title);
        this.E = (ImageView) this.itemView.findViewById(R.id.attach_rating_img);
        this.F = (TextView) this.itemView.findViewById(R.id.attach_rating_text);
        AdsButton adsButton = (AdsButton) this.itemView.findViewById(R.id.attach_subtitle);
        this.G = adsButton;
        View findViewById = this.itemView.findViewById(R.id.shine_anim);
        this.H = findViewById;
        ysm0 ysm0Var = new ysm0(adsButton, h170Var, findViewById, 8);
        this.I = ysm0Var;
        adsButton.setOnClickListener(this);
        adsButton.setAnimationDelegate(ysm0Var);
        adsButton.setStyleChangeListener(new o860(this, 6));
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.containerShine);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(hav0.c);
        this.itemView.setOnClickListener(this);
        constraintLayout.setMinHeight(cn70.b(54));
        constraintLayout.setMinimumHeight(cn70.b(54));
        awt0.x(constraintLayout, 0, cn70.b(8), 0, cn70.b(10), 5);
    }

    @Override // xsna.qi6
    public final void E6(ShitAttachment shitAttachment) {
        ShitAttachment shitAttachment2 = shitAttachment;
        String str = shitAttachment2.u;
        float f = shitAttachment2.t;
        String str2 = shitAttachment2.n;
        boolean N = drm0.N(str2);
        TextView textView = this.D;
        bwt0.p0(textView, N);
        String str3 = shitAttachment2.D;
        int i = 0;
        boolean z = (drm0.N(str3) && drm0.N(str2)) ? false : true;
        TextView textView2 = this.C;
        bwt0.p0(textView2, z);
        this.H.setVisibility(4);
        textView.setText(shitAttachment2.o);
        if (drm0.N(str2)) {
            str2 = str3;
        }
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            str2 = String.format("%s •", Arrays.copyOf(new Object[]{str2}, 1));
        }
        textView2.setText(str2);
        ImageView imageView = this.E;
        TextView textView3 = this.F;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            textView3.setVisibility(8);
            imageView.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(String.valueOf(f));
            imageView.setVisibility(0);
        }
        int c = dhr0.t.c(R.attr.vk_ui_background_accent_themed);
        u1c0 J0 = J0();
        Object obj = J0 != null ? J0.g : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        com.vk.toggle.data.a a = this.I.b.a();
        if ((a != null ? a.b : null) == null) {
            i = 1;
        } else if (num != null) {
            i = num.intValue();
        }
        AdsButton adsButton = this.G;
        adsButton.setCalculatedColor(c);
        adsButton.b(i, true);
        if (!shitAttachment2.l0 || drm0.N(str)) {
            str = shitAttachment2.p;
        }
        adsButton.setText(str);
    }

    @Override // com.vk.core.view.AdsButton.b
    public final void O2(int i) {
        u1c0 J0 = J0();
        if (J0 != null) {
            J0.g = Integer.valueOf(i);
        }
        this.I.g();
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
        if (epx.f(view, this.G)) {
            gd60 a = hd60.a();
            gd60.a aVar = gd60.a;
            a.O(context, q62, i, false);
        } else if (q62.h0 == null) {
            hd60.a().r0(context, q6, i, AdClickContext.FOOTER);
        }
    }
}
