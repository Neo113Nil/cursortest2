package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.ClosingOfferContentView;
import com.yandex.plus.ui.core.theme.PlusTheme;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class k6c {
    public static final /* synthetic */ kgx[] s = {new PropertyReference1Impl("root", 0, "getRoot()Landroid/view/ViewGroup;", k6c.class), b64.x(qoi0.a, k6c.class, "linearRoot", "getLinearRoot()Landroid/view/ViewGroup;", 0), new PropertyReference1Impl("backgroundImageView", 0, "getBackgroundImageView()Landroid/widget/ImageView;", k6c.class), new PropertyReference1Impl("toolbar", 0, "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", k6c.class), new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", k6c.class), new PropertyReference1Impl("subtitleTextView", 0, "getSubtitleTextView()Landroid/widget/TextView;", k6c.class), new PropertyReference1Impl("itemRecyclerView", 0, "getItemRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", k6c.class), new PropertyReference1Impl("acceptButton", 0, "getAcceptButton()Landroid/widget/Button;", k6c.class), new PropertyReference1Impl("rejectButton", 0, "getRejectButton()Landroid/widget/Button;", k6c.class), new PropertyReference1Impl("conditionTextView", 0, "getConditionTextView()Landroid/widget/TextView;", k6c.class)};
    public final ClosingOfferContentView a;
    public final b5d0 b;
    public final gbd0 c;
    public final wv5 d;
    public final wv5 e;
    public final wv5 f;
    public final wv5 g;
    public final wv5 h;
    public final wv5 i;
    public final wv5 j;
    public final wv5 k;
    public final wv5 l;
    public final i3y m;
    public final z6c n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;

    public k6c(ClosingOfferContentView closingOfferContentView, b5d0 b5d0Var, gbd0 gbd0Var, sls slsVar, sls slsVar2, sls slsVar3) {
        this.a = closingOfferContentView;
        this.b = b5d0Var;
        this.c = gbd0Var;
        this.d = new wv5(new bg6(closingOfferContentView, z9h0.closing_view_root, 24));
        this.e = new wv5(new bg6(closingOfferContentView, z9h0.closing_view_linear_root, 25));
        this.f = new wv5(new bg6(closingOfferContentView, z9h0.closing_view_background, 26));
        this.g = new wv5(new bg6(closingOfferContentView, z9h0.closing_view_toolbar, 27));
        this.h = new wv5(new bg6(closingOfferContentView, z9h0.closing_view_title_text, 28));
        this.i = new wv5(new bg6(closingOfferContentView, z9h0.closing_view_subtitle_text, 29));
        wv5 wv5Var = new wv5(new j6c(closingOfferContentView, z9h0.closing_view_item_recycler, 0));
        wv5 wv5Var2 = new wv5(new j6c(closingOfferContentView, z9h0.closing_offer_accept_button, 1));
        this.j = wv5Var2;
        wv5 wv5Var3 = new wv5(new j6c(closingOfferContentView, z9h0.closing_offer_reject_button, 2));
        this.k = wv5Var3;
        this.l = new wv5(new bg6(closingOfferContentView, z9h0.closing_offer_condition_text, 23));
        this.m = a.a(new n8a(22, this, slsVar));
        z6c z6cVar = new z6c((PlusTheme) ((n4u0) ((qc20) gbd0Var).a).getValue(), b5d0Var);
        this.n = z6cVar;
        this.o = b().getPaddingLeft();
        this.p = b().getPaddingTop();
        this.q = b().getPaddingRight();
        this.r = b().getPaddingBottom();
        kgx[] kgxVarArr = s;
        Drawable t = vng.t(oxg0.pay_sdk_ic_divider_rounded, ((RecyclerView) wv5Var.a(kgxVarArr[6])).getContext());
        if (t != null) {
            t.setTint(vng.p(sng0.pay_sdk_primaryTextColor, closingOfferContentView.getContext()));
        }
        RecyclerView recyclerView = (RecyclerView) wv5Var.a(kgxVarArr[6]);
        recyclerView.setAdapter(z6cVar);
        recyclerView.addItemDecoration(new b7c(t, bb1.q(qvg0.pay_sdk_closing_item_spacing_size, recyclerView), bb1.q(qvg0.pay_sdk_closing_item_edge_radius, recyclerView), bb1.q(ovg0.pay_sdk_small_corner_size, recyclerView)));
        bb1.L((Button) wv5Var2.a(kgxVarArr[7]), new njb(1, slsVar2));
        bb1.L((Button) wv5Var3.a(kgxVarArr[8]), new njb(2, slsVar3));
    }

    public final ImageView a() {
        return (ImageView) this.f.a(s[2]);
    }

    public final ViewGroup b() {
        return (ViewGroup) this.d.a(s[0]);
    }
}
