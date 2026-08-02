package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.transition.AutoTransition;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.PlusPayPaymentLoadingView;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class hed0 {
    public static final /* synthetic */ kgx[] m = {new PropertyReference1Impl("root", 0, "getRoot()Landroid/view/ViewGroup;", hed0.class), b64.x(qoi0.a, hed0.class, "progressView", "getProgressView()Landroid/view/View;", 0), new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", hed0.class), new PropertyReference1Impl("subtitleTextView", 0, "getSubtitleTextView()Landroid/widget/TextView;", hed0.class), new PropertyReference1Impl("firstPaymentTextView", 0, "getFirstPaymentTextView()Landroid/widget/TextView;", hed0.class), new PropertyReference1Impl("nextPaymentTextView", 0, "getNextPaymentTextView()Landroid/widget/TextView;", hed0.class), new PropertyReference1Impl("footerTextView", 0, "getFooterTextView()Landroid/widget/TextView;", hed0.class)};
    public final PlusPayPaymentLoadingView a;
    public final wv5 b;
    public final wv5 c;
    public final wv5 d;
    public final wv5 e;
    public final wv5 f;
    public final wv5 g;
    public final wv5 h;
    public final int i = a().getPaddingLeft();
    public final int j = a().getPaddingTop();
    public final int k = a().getPaddingRight();
    public final int l = a().getPaddingBottom();

    public hed0(PlusPayPaymentLoadingView plusPayPaymentLoadingView) {
        this.a = plusPayPaymentLoadingView;
        this.b = new wv5(new a450(plusPayPaymentLoadingView, z9h0.payment_loading_root, 26));
        this.c = new wv5(new a450(plusPayPaymentLoadingView, z9h0.payment_loading_progress_view, 27));
        this.d = new wv5(new a450(plusPayPaymentLoadingView, z9h0.payment_loading_title_text, 28));
        this.e = new wv5(new a450(plusPayPaymentLoadingView, z9h0.payment_loading_subtitle_text, 29));
        this.f = new wv5(new ged0(plusPayPaymentLoadingView, z9h0.payment_loading_first_payment_text, 0));
        this.g = new wv5(new ged0(plusPayPaymentLoadingView, z9h0.payment_loading_next_payment_text, 1));
        this.h = new wv5(new ged0(plusPayPaymentLoadingView, z9h0.payment_loading_footer_text, 2));
    }

    public final ViewGroup a() {
        return (ViewGroup) this.b.a(m[0]);
    }

    public final void b() {
        PlusPayPaymentLoadingView plusPayPaymentLoadingView = this.a;
        ViewParent parent = plusPayPaymentLoadingView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            Fade fade = new Fade();
            fade.c = 300L;
            fade.d(plusPayPaymentLoadingView);
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.P(300L);
            kgx[] kgxVarArr = m;
            autoTransition.d((View) this.c.a(kgxVarArr[1]));
            autoTransition.d((TextView) this.d.a(kgxVarArr[2]));
            autoTransition.d((TextView) this.e.a(kgxVarArr[3]));
            autoTransition.d((TextView) this.f.a(kgxVarArr[4]));
            autoTransition.d((TextView) this.g.a(kgxVarArr[5]));
            autoTransition.d((TextView) this.h.a(kgxVarArr[6]));
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.Z(fade);
            transitionSet.Z(autoTransition);
            TransitionManager.a(transitionSet, viewGroup);
        }
    }

    public final void c(boolean z) {
        kgx[] kgxVarArr = m;
        ((TextView) this.d.a(kgxVarArr[2])).setVisibility(z ? 0 : 8);
        ((TextView) this.e.a(kgxVarArr[3])).setVisibility(z ? 0 : 8);
        ((TextView) this.f.a(kgxVarArr[4])).setVisibility(z ? 0 : 8);
        ((TextView) this.g.a(kgxVarArr[5])).setVisibility(z ? 0 : 8);
        ((TextView) this.h.a(kgxVarArr[6])).setVisibility(z ? 0 : 8);
    }

    public final void d(fed0 fed0Var) {
        b();
        this.a.setVisibility(0);
        c(true);
        kgx[] kgxVarArr = m;
        ((TextView) this.d.a(kgxVarArr[2])).setText(fed0Var.a);
        v3a1.c((TextView) this.e.a(kgxVarArr[3]), fed0Var.b);
        v3a1.c((TextView) this.f.a(kgxVarArr[4]), fed0Var.c);
        v3a1.c((TextView) this.g.a(kgxVarArr[5]), fed0Var.d);
        v3a1.c((TextView) this.h.a(kgxVarArr[6]), fed0Var.e);
    }
}
