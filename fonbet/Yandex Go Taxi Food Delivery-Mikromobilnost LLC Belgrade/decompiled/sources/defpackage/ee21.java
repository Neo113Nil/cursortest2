package defpackage;

import android.animation.LayoutTransition;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.glide.a;
import com.yandex.plus.home.common.ui.DisabledEmptyLineClickLinkMovementMethod;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.UpsaleContentView;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class ee21 {
    public static final /* synthetic */ kgx[] w = {new PropertyReference1Impl("root", 0, "getRoot()Landroid/view/ViewGroup;", ee21.class), b64.x(qoi0.a, ee21.class, "contentLayout", "getContentLayout()Landroid/view/ViewGroup;", 0), new PropertyReference1Impl("upsaleCardLayout", 0, "getUpsaleCardLayout()Landroid/view/ViewGroup;", ee21.class), new PropertyReference1Impl("headingImageCard", 0, "getHeadingImageCard()Lcom/google/android/material/card/MaterialCardView;", ee21.class), new PropertyReference1Impl("headingImageView", 0, "getHeadingImageView()Landroid/widget/ImageView;", ee21.class), new PropertyReference1Impl("title", 0, "getTitle()Landroid/widget/TextView;", ee21.class), new PropertyReference1Impl("subtitle", 0, "getSubtitle()Landroid/widget/TextView;", ee21.class), new PropertyReference1Impl("offerText", 0, "getOfferText()Landroid/widget/TextView;", ee21.class), new PropertyReference1Impl("additionalOfferText", 0, "getAdditionalOfferText()Landroid/widget/TextView;", ee21.class), new PropertyReference1Impl("legalsText", 0, "getLegalsText()Landroid/widget/TextView;", ee21.class), new PropertyReference1Impl("rejectButton", 0, "getRejectButton()Landroid/widget/TextView;", ee21.class), new PropertyReference1Impl("acceptButton", 0, "getAcceptButton()Landroid/widget/TextView;", ee21.class), new PropertyReference1Impl("benefitsRecycler", 0, "getBenefitsRecycler()Landroidx/recyclerview/widget/RecyclerView;", ee21.class)};
    public final UpsaleContentView a;
    public final b5d0 b;
    public final sls c;
    public final sls d;
    public final sls e;
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
    public final zr60 p;
    public final ViewTreeObserver q;
    public final p6 r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;

    public ee21(UpsaleContentView upsaleContentView, b5d0 b5d0Var, sls slsVar, sls slsVar2, sls slsVar3) {
        this.a = upsaleContentView;
        this.b = b5d0Var;
        this.c = slsVar;
        this.d = slsVar2;
        this.e = slsVar3;
        this.f = new wv5(new l9f0(upsaleContentView, z9h0.upsale_root, 11));
        int i = z9h0.upsale_content;
        int i2 = z9h0.upsale_card_layout;
        wv5 wv5Var = new wv5(new l9f0(upsaleContentView, z9h0.upsale_image_card, 12));
        this.g = wv5Var;
        this.h = new wv5(new l9f0(upsaleContentView, z9h0.upsale_image, 13));
        this.i = new wv5(new l9f0(upsaleContentView, z9h0.upsale_title, 14));
        wv5 wv5Var2 = new wv5(new l9f0(upsaleContentView, z9h0.upsale_subtitle, 15));
        this.j = wv5Var2;
        this.k = new wv5(new l9f0(upsaleContentView, z9h0.upsale_offer_text, 16));
        this.l = new wv5(new l9f0(upsaleContentView, z9h0.upsale_additional_offer_text, 17));
        wv5 wv5Var3 = new wv5(new l9f0(upsaleContentView, z9h0.upsale_legals_text, 8));
        this.m = wv5Var3;
        wv5 wv5Var4 = new wv5(new l9f0(upsaleContentView, z9h0.upsale_reject_button, 9));
        this.n = wv5Var4;
        wv5 wv5Var5 = new wv5(new l9f0(upsaleContentView, z9h0.upsale_accept_button, 10));
        this.o = wv5Var5;
        int i3 = z9h0.upsale_benefits_recycler;
        zr60 zr60Var = new zr60();
        this.p = zr60Var;
        ViewTreeObserver viewTreeObserver = upsaleContentView.getViewTreeObserver();
        this.q = viewTreeObserver;
        p6 p6Var = new p6(3, this);
        this.r = p6Var;
        this.s = a().getPaddingLeft();
        this.t = a().getPaddingTop();
        this.u = a().getPaddingRight();
        this.v = a().getPaddingBottom();
        kgx[] kgxVarArr = w;
        kgx kgxVar = kgxVarArr[2];
        try {
            ViewGroup viewGroup = (ViewGroup) upsaleContentView.findViewById(i2);
            if (viewGroup == null) {
                kgx kgxVar2 = kgxVarArr[1];
                try {
                    View findViewById = upsaleContentView.findViewById(i);
                    if (findViewById == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                    viewGroup = (ViewGroup) findViewById;
                } catch (ClassCastException e) {
                    dy31.f(kgxVar2, e);
                    throw null;
                }
            }
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(2, 600L);
            final int i4 = 0;
            layoutTransition.setDuration(0, 200L);
            viewGroup.setLayoutTransition(layoutTransition);
            ((MaterialCardView) wv5Var.a(kgxVarArr[3])).setVisibility(8);
            ((TextView) wv5Var3.a(kgxVarArr[9])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
            bb1.L((TextView) wv5Var5.a(kgxVarArr[11]), new View.OnClickListener(this) { // from class: de21
                public final /* synthetic */ ee21 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i5 = i4;
                    ee21 ee21Var = this.b;
                    switch (i5) {
                        case 0:
                            ee21Var.c.invoke();
                            break;
                        default:
                            ee21Var.d.invoke();
                            break;
                    }
                }
            });
            final int i5 = 1;
            bb1.L((TextView) wv5Var4.a(kgxVarArr[10]), new View.OnClickListener(this) { // from class: de21
                public final /* synthetic */ ee21 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i52 = i5;
                    ee21 ee21Var = this.b;
                    switch (i52) {
                        case 0:
                            ee21Var.c.invoke();
                            break;
                        default:
                            ee21Var.d.invoke();
                            break;
                    }
                }
            });
            kgx kgxVar3 = kgxVarArr[12];
            try {
                View findViewById2 = upsaleContentView.findViewById(i3);
                if (findViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                }
                ((RecyclerView) findViewById2).setAdapter(zr60Var);
                b.q((TextView) wv5Var2.a(kgxVarArr[6]), true);
                viewTreeObserver.addOnScrollChangedListener(p6Var);
            } catch (ClassCastException e2) {
                dy31.f(kgxVar3, e2);
                throw null;
            }
        } catch (ClassCastException e3) {
            dy31.f(kgxVar, e3);
            throw null;
        }
    }

    public final ViewGroup a() {
        return (ViewGroup) this.f.a(w[0]);
    }

    public final void b(be21 be21Var) {
        kgx[] kgxVarArr = w;
        ((TextView) this.i.a(kgxVarArr[5])).setText(be21Var.a);
        ((TextView) this.j.a(kgxVarArr[6])).setText(be21Var.b);
        ((TextView) this.k.a(kgxVarArr[7])).setText(be21Var.c);
        TextView textView = (TextView) this.l.a(kgxVarArr[8]);
        String str = be21Var.d;
        if (evu0.J(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        ((TextView) this.o.a(kgxVarArr[11])).setText(be21Var.f);
        ((TextView) this.n.a(kgxVarArr[10])).setText(be21Var.e);
        CharSequence charSequence = be21Var.i;
        boolean z = (charSequence == null || evu0.J(charSequence)) ? false : true;
        TextView textView2 = (TextView) this.m.a(kgxVarArr[9]);
        if (z) {
            textView2.setVisibility(0);
            textView2.setText(charSequence);
        } else {
            textView2.setVisibility(8);
        }
        String str2 = be21Var.h;
        if (str2 != null) {
            a b = ((com.yandex.plus.glide.b) this.b).b(str2);
            b.a.g(null);
            b.a(new a5d0() { // from class: ce21
                @Override // defpackage.a5d0
                public final void onImage(Drawable drawable) {
                    if (drawable != null) {
                        ee21 ee21Var = ee21.this;
                        wv5 wv5Var = ee21Var.h;
                        kgx[] kgxVarArr2 = ee21.w;
                        ((ImageView) wv5Var.a(kgxVarArr2[4])).setImageDrawable(drawable);
                        ((MaterialCardView) ee21Var.g.a(kgxVarArr2[3])).setVisibility(0);
                    }
                }
            });
        } else {
            ((MaterialCardView) this.g.a(kgxVarArr[3])).setVisibility(8);
        }
        this.p.submitList(be21Var.g);
    }
}
