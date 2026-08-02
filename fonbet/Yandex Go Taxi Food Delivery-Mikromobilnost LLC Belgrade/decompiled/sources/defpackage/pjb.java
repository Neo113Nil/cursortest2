package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.home.common.ui.DisabledEmptyLineClickLinkMovementMethod;
import com.yandex.plus.pay.ui.core.internal.common.views.PaySdkCompoundDrawableTextView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.CheckoutContentView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.OfferSwitchView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.ui.core.theme.PlusTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class pjb {
    public static final /* synthetic */ kgx[] I = {new PropertyReference1Impl("offerSwitchView", 0, "getOfferSwitchView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/checkout/onsale/OfferSwitchView;", pjb.class), b64.x(qoi0.a, pjb.class, "toolbar", "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", 0), new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", pjb.class), new PropertyReference1Impl("productsRecyclerView", 0, "getProductsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", pjb.class), new PropertyReference1Impl("onsaleCardsRecycler", 0, "getOnsaleCardsRecycler()Landroidx/recyclerview/widget/RecyclerView;", pjb.class), new PropertyReference1Impl("paymentMethodsGroupsRecyclerView", 0, "getPaymentMethodsGroupsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", pjb.class), new PropertyReference1Impl("paymentTextView", 0, "getPaymentTextView()Landroid/widget/TextView;", pjb.class), new PropertyReference1Impl("agreementCheckBox", 0, "getAgreementCheckBox()Landroid/widget/CheckBox;", pjb.class), new PropertyReference1Impl("agreementTextView", 0, "getAgreementTextView()Landroid/widget/TextView;", pjb.class), new PropertyReference1Impl("legalTextRecyclerView", 0, "getLegalTextRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", pjb.class), new PropertyReference1Impl("paymentButtonTopTextView", 0, "getPaymentButtonTopTextView()Landroid/widget/TextView;", pjb.class), new PropertyReference1Impl("paymentButton", 0, "getPaymentButton()Landroid/widget/Button;", pjb.class), new PropertyReference1Impl("paymentViaTextView", 0, "getPaymentViaTextView()Lcom/yandex/plus/pay/ui/core/internal/common/views/PaySdkCompoundDrawableTextView;", pjb.class), new PropertyReference1Impl("paymentCardView", 0, "getPaymentCardView()Landroidx/cardview/widget/CardView;", pjb.class), new PropertyReference1Impl("agreementCardView", 0, "getAgreementCardView()Landroidx/cardview/widget/CardView;", pjb.class), new PropertyReference1Impl("legalCardView", 0, "getLegalCardView()Landroidx/cardview/widget/CardView;", pjb.class), new PropertyReference1Impl("buttonCardView", 0, "getButtonCardView()Landroidx/cardview/widget/CardView;", pjb.class), new PropertyReference1Impl("agreementLayout", 0, "getAgreementLayout()Landroid/widget/LinearLayout;", pjb.class)};
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final ViewTreeObserver F;
    public final p6 G;
    public final View H;
    public final CheckoutContentView a;
    public final sls b;
    public final wv5 c;
    public final wv5 d;
    public final wv5 e;
    public final wv5 f;
    public final wv5 g;
    public final wv5 h;
    public final wv5 i;
    public final wv5 j;
    public final wv5 k;
    public final wv5 l;
    public final wv5 m;
    public final wv5 n;
    public final wv5 o;
    public final wv5 p;
    public final wv5 q;
    public final wv5 r;
    public final wv5 s;
    public final jt60 t;
    public final lgd0 u;
    public final z6c v;
    public final qze w;
    public final e9a0 x;
    public final skb y;
    public final int z;

    public pjb(CheckoutContentView checkoutContentView, tls tlsVar, tls tlsVar2, tls tlsVar3, sls slsVar, sls slsVar2, sls slsVar3, wls wlsVar, tls tlsVar4, b5d0 b5d0Var, gbd0 gbd0Var) {
        this.a = checkoutContentView;
        this.b = slsVar3;
        wv5 wv5Var = new wv5(new bg6(checkoutContentView, z9h0.checkout_offer_switch, 13));
        this.c = wv5Var;
        wv5 wv5Var2 = new wv5(new bg6(checkoutContentView, z9h0.checkout_toolbar, 14));
        this.d = wv5Var2;
        this.e = new wv5(new bg6(checkoutContentView, z9h0.checkout_title, 15));
        wv5 wv5Var3 = new wv5(new bg6(checkoutContentView, z9h0.checkout_products_recycler, 16));
        this.f = new wv5(new bg6(checkoutContentView, z9h0.checkout_onsale_cards_recycler, 17));
        this.g = new wv5(new bg6(checkoutContentView, z9h0.checkout_payment_methods_groups_recycler, 18));
        this.h = new wv5(new bg6(checkoutContentView, z9h0.checkout_payment_text, 19));
        this.i = new wv5(new bg6(checkoutContentView, z9h0.checkout_agreement_checkbox, 20));
        wv5 wv5Var4 = new wv5(new bg6(checkoutContentView, z9h0.checkout_agreement_text, 21));
        this.j = wv5Var4;
        this.k = new wv5(new bg6(checkoutContentView, z9h0.checkout_legals_recycler, 4));
        this.l = new wv5(new bg6(checkoutContentView, z9h0.checkout_button_top_text, 5));
        this.m = new wv5(new bg6(checkoutContentView, z9h0.checkout_button, 6));
        this.n = new wv5(new bg6(checkoutContentView, z9h0.payment_via_text, 7));
        this.o = new wv5(new bg6(checkoutContentView, z9h0.checkout_payment_card, 8));
        this.p = new wv5(new bg6(checkoutContentView, z9h0.checkout_agreement_card, 9));
        this.q = new wv5(new bg6(checkoutContentView, z9h0.checkout_legal_card, 10));
        wv5 wv5Var5 = new wv5(new bg6(checkoutContentView, z9h0.checkout_button_card, 11));
        this.r = wv5Var5;
        wv5 wv5Var6 = new wv5(new bg6(checkoutContentView, z9h0.checkout_agreement_layout, 12));
        this.s = wv5Var6;
        kgx[] kgxVarArr = I;
        this.t = new jt60((OfferSwitchView) wv5Var.a(kgxVarArr[0]), tlsVar4);
        int i = 1;
        this.u = new lgd0((PlusPayToolbarView) wv5Var2.a(kgxVarArr[1]), b5d0Var, slsVar2);
        n4u0 n4u0Var = (n4u0) ((qc20) gbd0Var).a;
        z6c z6cVar = new z6c(n4u0Var, b5d0Var);
        this.v = z6cVar;
        qze qzeVar = new qze(b5d0Var, n4u0Var, wlsVar);
        this.w = qzeVar;
        e9a0 e9a0Var = new e9a0((PlusTheme) n4u0Var.getValue(), b5d0Var, tlsVar, tlsVar2);
        this.x = e9a0Var;
        skb skbVar = new skb();
        this.y = skbVar;
        this.z = ((PlusPayToolbarView) wv5Var2.a(kgxVarArr[1])).getPaddingTop();
        this.A = checkoutContentView.getPaddingLeft();
        this.B = checkoutContentView.getPaddingRight();
        LinearLayout linearLayout = (LinearLayout) wv5Var6.a(kgxVarArr[17]);
        this.C = linearLayout != null ? linearLayout.getPaddingBottom() : 0;
        CardView cardView = (CardView) wv5Var5.a(kgxVarArr[16]);
        this.D = cardView != null ? cardView.getPaddingBottom() : 0;
        ViewGroup.LayoutParams layoutParams = f().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        this.E = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
        ViewTreeObserver viewTreeObserver = checkoutContentView.getViewTreeObserver();
        this.F = viewTreeObserver;
        p6 p6Var = new p6(i, this);
        this.G = p6Var;
        View view = new View(checkoutContentView.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view.setClickable(true);
        this.H = view;
        ((TextView) wv5Var4.a(kgxVarArr[8])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
        ((RecyclerView) wv5Var3.a(kgxVarArr[3])).setAdapter(z6cVar);
        c().setAdapter(qzeVar);
        c().setItemAnimator(null);
        e().setAdapter(e9a0Var);
        e().setItemAnimator(null);
        b().setAdapter(skbVar);
        b().setItemAnimator(null);
        ((RecyclerView) wv5Var3.a(kgxVarArr[3])).addItemDecoration(new dkt0(bb1.q(qvg0.pay_sdk_checkout_small_card_top_margin, checkoutContentView)));
        c().addItemDecoration(new dkt0(bb1.q(qvg0.pay_sdk_checkout_small_card_top_margin, checkoutContentView)));
        e().addItemDecoration(new dkt0(bb1.q(qvg0.pay_sdk_checkout_card_margin, checkoutContentView)));
        b().addItemDecoration(new dkt0(bb1.q(qvg0.pay_sdk_checkout_legals_text_margin, checkoutContentView)));
        bb1.L(d(), new njb(0, slsVar));
        a().setOnCheckedChangeListener(new ojb(0, tlsVar3));
        viewTreeObserver.addOnScrollChangedListener(p6Var);
    }

    public final CheckBox a() {
        return (CheckBox) this.i.a(I[7]);
    }

    public final RecyclerView b() {
        return (RecyclerView) this.k.a(I[9]);
    }

    public final RecyclerView c() {
        return (RecyclerView) this.f.a(I[4]);
    }

    public final Button d() {
        return (Button) this.m.a(I[11]);
    }

    public final RecyclerView e() {
        return (RecyclerView) this.g.a(I[5]);
    }

    public final PaySdkCompoundDrawableTextView f() {
        return (PaySdkCompoundDrawableTextView) this.n.a(I[12]);
    }

    public final void g(mjb mjbVar) {
        List<Object> list = mjbVar.c;
        ArrayList arrayList = mjbVar.j;
        kgx[] kgxVarArr = I;
        ((TextView) this.e.a(kgxVarArr[2])).setText(mjbVar.a);
        ijb ijbVar = mjbVar.k;
        wv5 wv5Var = this.c;
        if (ijbVar != null) {
            boolean z = ijbVar.d;
            Boolean valueOf = Boolean.valueOf(z);
            jt60 jt60Var = this.t;
            jt60Var.g = valueOf;
            wv5 wv5Var2 = jt60Var.c;
            kgx[] kgxVarArr2 = jt60.h;
            ((TextView) wv5Var2.a(kgxVarArr2[2])).setText(ijbVar.a);
            ((TextView) jt60Var.e.a(kgxVarArr2[4])).setText(ijbVar.b);
            TextView textView = (TextView) jt60Var.f.a(kgxVarArr2[5]);
            String str = ijbVar.c;
            if (str == null || evu0.J(str)) {
                str = null;
            }
            v3a1.c(textView, str);
            if (z) {
                jt60Var.a((Flow) jt60Var.d.a(kgxVarArr2[3]));
            } else {
                jt60Var.a((TextView) wv5Var2.a(kgxVarArr2[2]));
            }
            ((OfferSwitchView) wv5Var.a(kgxVarArr[0])).setVisibility(0);
        } else {
            ((OfferSwitchView) wv5Var.a(kgxVarArr[0])).setVisibility(8);
        }
        this.v.submitList(mjbVar.b);
        if (arrayList.isEmpty()) {
            c().setVisibility(8);
        } else {
            c().setVisibility(0);
            this.w.submitList(arrayList);
        }
        this.x.submitList(list);
        e().setVisibility(!list.isEmpty() ? 0 : 8);
        gjb gjbVar = mjbVar.d;
        boolean z2 = gjbVar != null;
        CardView cardView = (CardView) this.p.a(kgxVarArr[14]);
        if (cardView != null) {
            cardView.setVisibility(z2 ? 0 : 8);
        }
        kgx kgxVar = kgxVarArr[8];
        wv5 wv5Var3 = this.j;
        ((TextView) wv5Var3.a(kgxVar)).setVisibility(z2 ? 0 : 8);
        a().setVisibility(z2 ? 0 : 8);
        if (gjbVar != null) {
            CharSequence charSequence = gjbVar.a;
            if (!evu0.J(charSequence)) {
                ((TextView) wv5Var3.a(kgxVarArr[8])).setText(charSequence);
                a().setChecked(gjbVar.b);
            }
        }
        List<Object> list2 = mjbVar.e;
        boolean isEmpty = list2.isEmpty();
        CardView cardView2 = (CardView) this.q.a(kgxVarArr[15]);
        if (cardView2 != null) {
            cardView2.setVisibility(!isEmpty ? 0 : 8);
        }
        b().setVisibility(!isEmpty ? 0 : 8);
        if (!isEmpty) {
            this.y.submitList(list2);
        }
        String str2 = mjbVar.f;
        boolean J = evu0.J(str2);
        wv5 wv5Var4 = this.h;
        wv5 wv5Var5 = this.o;
        if (J) {
            CardView cardView3 = (CardView) wv5Var5.a(kgxVarArr[13]);
            if (cardView3 != null) {
                cardView3.setVisibility(8);
            }
            ((TextView) wv5Var4.a(kgxVarArr[6])).setVisibility(8);
        } else {
            CardView cardView4 = (CardView) wv5Var5.a(kgxVarArr[13]);
            if (cardView4 != null) {
                cardView4.setVisibility(0);
            }
            ((TextView) wv5Var4.a(kgxVarArr[6])).setVisibility(0);
            ((TextView) wv5Var4.a(kgxVarArr[6])).setText(str2);
        }
        ljb ljbVar = mjbVar.h;
        if (ljbVar != null) {
            f().setVisibility(0);
            f().setText(ljbVar.b);
            f().setDrawableEnd(ljbVar.a);
        } else {
            f().setVisibility(8);
        }
        v3a1.c((TextView) this.l.a(kgxVarArr[10]), mjbVar.g);
        d().setText(mjbVar.i);
        a().post(new v4a(10, this));
    }
}
