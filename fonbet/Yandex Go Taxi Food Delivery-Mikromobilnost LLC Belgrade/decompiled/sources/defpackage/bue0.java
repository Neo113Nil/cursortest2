package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.yandex.plus.home.common.ui.DisabledEmptyLineClickLinkMovementMethod;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleContentView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleOfferView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes2.dex */
public final class bue0 {
    public static final /* synthetic */ kgx[] m = {new PropertyReference1Impl("root", 0, "getRoot()Landroid/view/ViewGroup;", bue0.class), b64.x(qoi0.a, bue0.class, "toolbar", "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", 0), new PropertyReference1Impl("loadingLayout", 0, "getLoadingLayout()Landroid/view/ViewGroup;", bue0.class), new PropertyReference1Impl("loadingTextView", 0, "getLoadingTextView()Landroid/widget/TextView;", bue0.class), new PropertyReference1Impl("offerView", 0, "getOfferView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/presale/PresaleOfferView;", bue0.class), new PropertyReference1Impl("originalOfferButton", 0, "getOriginalOfferButton()Landroid/widget/Button;", bue0.class), new PropertyReference1Impl("legalTextView", 0, "getLegalTextView()Landroid/widget/TextView;", bue0.class), new PropertyReference1Impl("nestedScrollView", 0, "getNestedScrollView()Landroidx/core/widget/NestedScrollView;", bue0.class)};
    public final PresaleContentView a;
    public final sls b;
    public final wv5 c;
    public final wv5 d;
    public final wv5 e;
    public final wv5 f;
    public final wv5 g;
    public final wv5 h;
    public final wv5 i;
    public zte0 j;
    public final lgd0 k;
    public final iue0 l;

    public bue0(PresaleContentView presaleContentView, b5d0 b5d0Var, gbd0 gbd0Var, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4) {
        this.a = presaleContentView;
        this.b = slsVar4;
        this.c = new wv5(new ged0(presaleContentView, z9h0.presale_root, 10));
        this.d = new wv5(new ged0(presaleContentView, z9h0.presale_toolbar, 11));
        this.e = new wv5(new ged0(presaleContentView, z9h0.presale_loading_layout, 12));
        this.f = new wv5(new ged0(presaleContentView, z9h0.presale_loading_text, 13));
        int i = z9h0.presale_offer_view;
        this.g = new wv5(new ged0(presaleContentView, z9h0.presale_original_offer_button, 14));
        this.h = new wv5(new ged0(presaleContentView, z9h0.presale_legal_text, 15));
        this.i = new wv5(new ged0(presaleContentView, z9h0.presale_scroll_view, 16));
        this.k = new lgd0(f(), b5d0Var, slsVar);
        kgx kgxVar = m[4];
        try {
            View findViewById = presaleContentView.findViewById(i);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleOfferView");
            }
            this.l = new iue0((PresaleOfferView) findViewById, gbd0Var, slsVar2);
            a().setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
            bb1.L(e(), new njb(19, slsVar3));
        } catch (ClassCastException e) {
            dy31.f(kgxVar, e);
            throw null;
        }
    }

    public final TextView a() {
        return (TextView) this.h.a(m[6]);
    }

    public final ViewGroup b() {
        return (ViewGroup) this.e.a(m[2]);
    }

    public final TextView c() {
        return (TextView) this.f.a(m[3]);
    }

    public final NestedScrollView d() {
        return (NestedScrollView) this.i.a(m[7]);
    }

    public final Button e() {
        return (Button) this.g.a(m[5]);
    }

    public final PlusPayToolbarView f() {
        return (PlusPayToolbarView) this.d.a(m[1]);
    }

    public final void g() {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.a(new aue0(this, new Ref$IntRef()));
        TransitionManager.a(autoTransition, this.a);
    }
}
