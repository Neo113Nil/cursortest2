package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.home.common.ui.DisabledEmptyLineClickLinkMovementMethod;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class pze extends x0 {
    public static final /* synthetic */ kgx[] U = {new PropertyReference1Impl("button", 0, "getButton()Landroid/widget/Button;", pze.class), b64.x(qoi0.a, pze.class, "cardView", "getCardView()Lcom/google/android/material/card/MaterialCardView;", 0), new PropertyReference1Impl("logosRecycler", 0, "getLogosRecycler()Landroidx/recyclerview/widget/RecyclerView;", pze.class), new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", pze.class), new PropertyReference1Impl("benefitsRecycler", 0, "getBenefitsRecycler()Landroidx/recyclerview/widget/RecyclerView;", pze.class), new PropertyReference1Impl("additionalTextView", 0, "getAdditionalTextView()Landroid/widget/TextView;", pze.class)};
    public final wv5 N;
    public final wv5 O;
    public final wv5 P;
    public final wv5 Q;
    public final wv5 R;
    public final zr60 S;
    public final /* synthetic */ qze T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pze(qze qzeVar, View view, boolean z) {
        super(view);
        this.T = qzeVar;
        this.N = new wv5(new j6c(view, z9h0.counter_offer_button, 7));
        wv5 wv5Var = new wv5(new j6c(view, z9h0.counter_offer_card_view, 8));
        this.O = wv5Var;
        this.P = new wv5(new j6c(view, z9h0.counter_offer_logos_recycler, 9));
        wv5 wv5Var2 = new wv5(new j6c(view, z9h0.counter_offer_title, 10));
        this.Q = wv5Var2;
        int i = z9h0.counter_offer_benefits_recycler;
        this.R = new wv5(new j6c(view, z9h0.counter_offer_additional_text, 11));
        zr60 zr60Var = new zr60();
        this.S = zr60Var;
        kgx[] kgxVarArr = U;
        ((TextView) wv5Var2.a(kgxVarArr[3])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
        kgx kgxVar = kgxVarArr[4];
        try {
            View findViewById = view.findViewById(i);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
            ((RecyclerView) findViewById).setAdapter(zr60Var);
            if (z) {
                ((MaterialCardView) wv5Var.a(kgxVarArr[1])).setCardBackgroundColor(((MaterialCardView) wv5Var.a(kgxVarArr[1])).getCardBackgroundColor().withAlpha(102));
            }
        } catch (ClassCastException e) {
            dy31.f(kgxVar, e);
            throw null;
        }
    }
}
