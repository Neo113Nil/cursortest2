package defpackage;

import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleOfferView;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class iue0 {
    public static final /* synthetic */ kgx[] i = {new PropertyReference1Impl("cardView", 0, "getCardView()Lcom/google/android/material/card/MaterialCardView;", iue0.class), b64.x(qoi0.a, iue0.class, "periodTextView", "getPeriodTextView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("benefitTextView", 0, "getBenefitTextView()Landroid/widget/TextView;", iue0.class), new PropertyReference1Impl("priceTextView", 0, "getPriceTextView()Landroid/widget/TextView;", iue0.class), new PropertyReference1Impl("priceDescriptionTextView", 0, "getPriceDescriptionTextView()Landroid/widget/TextView;", iue0.class), new PropertyReference1Impl("button", 0, "getButton()Landroid/widget/Button;", iue0.class), new PropertyReference1Impl("additionalButtonTextTextView", 0, "getAdditionalButtonTextTextView()Landroid/widget/TextView;", iue0.class)};
    public final PresaleOfferView a;
    public final wv5 b;
    public final wv5 c;
    public final wv5 d;
    public final wv5 e;
    public final wv5 f;
    public final wv5 g;
    public final wv5 h;

    public iue0(PresaleOfferView presaleOfferView, gbd0 gbd0Var, sls slsVar) {
        this.a = presaleOfferView;
        this.b = new wv5(new ged0(presaleOfferView, z9h0.presale_offer_card, 17));
        this.c = new wv5(new ged0(presaleOfferView, z9h0.presale_offer_period_text, 18));
        wv5 wv5Var = new wv5(new ged0(presaleOfferView, z9h0.presale_offer_benefit_text, 19));
        this.d = wv5Var;
        this.e = new wv5(new ged0(presaleOfferView, z9h0.presale_offer_price_text, 20));
        this.f = new wv5(new ged0(presaleOfferView, z9h0.presale_offer_price_description_text, 21));
        wv5 wv5Var2 = new wv5(new ged0(presaleOfferView, z9h0.presale_offer_button, 22));
        this.g = wv5Var2;
        this.h = new wv5(new ged0(presaleOfferView, z9h0.presale_offer_additional_button_text, 23));
        float dimension = presaleOfferView.getContext().getResources().getDimension(ovg0.pay_sdk_medium_corner_size);
        int s = vng.s(qvg0.pay_sdk_presale_offer_card_gradient_top_space, presaleOfferView.getContext());
        presaleOfferView.getContext();
        Drawable o = msa1.o(t2d0.a(), dimension);
        final Drawable background = a().getBackground();
        a().setBackground(new LayerDrawable(new Drawable[]{o, new InsetDrawable(background, 0, s, 0, 0)}));
        a().setClipToOutline(false);
        a().setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleOfferViewController$setupBackgroundGradient$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                Drawable drawable = background;
                if (drawable != null) {
                    drawable.getOutline(outline);
                }
            }
        });
        float dimension2 = presaleOfferView.getContext().getResources().getDimension(ovg0.pay_sdk_small_corner_size);
        int p = vng.p(sng0.pay_sdk_successColor, presaleOfferView.getContext());
        kgx[] kgxVarArr = i;
        ((TextView) wv5Var.a(kgxVarArr[2])).setBackground(msa1.o(new ColorDrawable(p), dimension2));
        bb1.L((Button) wv5Var2.a(kgxVarArr[5]), new njb(20, slsVar));
    }

    public final MaterialCardView a() {
        return (MaterialCardView) this.b.a(i[0]);
    }
}
