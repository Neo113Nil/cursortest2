package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.OfferSwitchView;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class jt60 {
    public static final /* synthetic */ kgx[] h = {new PropertyReference1Impl("layout", 0, "getLayout()Landroidx/constraintlayout/widget/ConstraintLayout;", jt60.class), b64.x(qoi0.a, jt60.class, "selectedCard", "getSelectedCard()Lcom/google/android/material/card/MaterialCardView;", 0), new PropertyReference1Impl("originalTextView", 0, "getOriginalTextView()Landroid/widget/TextView;", jt60.class), new PropertyReference1Impl("suggestedFlow", 0, "getSuggestedFlow()Landroidx/constraintlayout/helper/widget/Flow;", jt60.class), new PropertyReference1Impl("suggestedTextView", 0, "getSuggestedTextView()Landroid/widget/TextView;", jt60.class), new PropertyReference1Impl("badgeTextView", 0, "getBadgeTextView()Landroid/widget/TextView;", jt60.class)};
    public final wv5 a;
    public final wv5 b;
    public final wv5 c;
    public final wv5 d;
    public final wv5 e;
    public final wv5 f;
    public Boolean g;

    public jt60(OfferSwitchView offerSwitchView, final tls tlsVar) {
        this.a = new wv5(new a450(offerSwitchView, z9h0.offer_switch_layout, 2));
        this.b = new wv5(new a450(offerSwitchView, z9h0.offer_switch_selected_card, 3));
        wv5 wv5Var = new wv5(new a450(offerSwitchView, z9h0.offer_switch_original_text, 4));
        this.c = wv5Var;
        wv5 wv5Var2 = new wv5(new a450(offerSwitchView, z9h0.offer_switch_suggested_flow, 5));
        this.d = wv5Var2;
        this.e = new wv5(new a450(offerSwitchView, z9h0.offer_switch_suggested_text, 6));
        this.f = new wv5(new a450(offerSwitchView, z9h0.offer_switch_badge_text, 7));
        kgx[] kgxVarArr = h;
        final int i = 0;
        bb1.L((TextView) wv5Var.a(kgxVarArr[2]), new View.OnClickListener(this) { // from class: it60
            public final /* synthetic */ jt60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                tls tlsVar2 = tlsVar;
                jt60 jt60Var = this.b;
                switch (i2) {
                    case 0:
                        if (jl40.l(jt60Var.g, Boolean.TRUE)) {
                            tlsVar2.invoke(Boolean.FALSE);
                            break;
                        }
                        break;
                    default:
                        if (jl40.l(jt60Var.g, Boolean.FALSE)) {
                            tlsVar2.invoke(Boolean.TRUE);
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        bb1.L((Flow) wv5Var2.a(kgxVarArr[3]), new View.OnClickListener(this) { // from class: it60
            public final /* synthetic */ jt60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                tls tlsVar2 = tlsVar;
                jt60 jt60Var = this.b;
                switch (i22) {
                    case 0:
                        if (jl40.l(jt60Var.g, Boolean.TRUE)) {
                            tlsVar2.invoke(Boolean.FALSE);
                            break;
                        }
                        break;
                    default:
                        if (jl40.l(jt60Var.g, Boolean.FALSE)) {
                            tlsVar2.invoke(Boolean.TRUE);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void a(View view) {
        e eVar = new e();
        kgx[] kgxVarArr = h;
        kgx kgxVar = kgxVarArr[0];
        wv5 wv5Var = this.a;
        TransitionManager.beginDelayedTransition((ConstraintLayout) wv5Var.a(kgxVar));
        eVar.g((ConstraintLayout) wv5Var.a(kgxVarArr[0]));
        kgx kgxVar2 = kgxVarArr[1];
        wv5 wv5Var2 = this.b;
        eVar.i(((MaterialCardView) wv5Var2.a(kgxVar2)).getId(), 6, view.getId(), 6);
        eVar.i(((MaterialCardView) wv5Var2.a(kgxVarArr[1])).getId(), 7, view.getId(), 7);
        eVar.b((ConstraintLayout) wv5Var.a(kgxVarArr[0]));
    }
}
