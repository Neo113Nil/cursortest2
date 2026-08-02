package com.yandex.go.chargers.order.completion.pre_finish;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersFinishCardCloseReason;
import com.yandex.go.chargers.design.components.ChargersButtonsView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import defpackage.c1a;
import defpackage.cma1;
import defpackage.cna;
import defpackage.dda;
import defpackage.dn7;
import defpackage.dna;
import defpackage.e230;
import defpackage.f1a;
import defpackage.g18;
import defpackage.g2a;
import defpackage.h1a;
import defpackage.h8;
import defpackage.io9;
import defpackage.k1a;
import defpackage.n35;
import defpackage.nac;
import defpackage.ny61;
import defpackage.od9;
import defpackage.pav;
import defpackage.pya;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.s1a;
import defpackage.t1w;
import defpackage.thh0;
import defpackage.tje;
import defpackage.tsh0;
import defpackage.w130;
import defpackage.ycc;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.common_models.net.TextMetaStyle;
import ru.yandex.taxi.design.NumberCheckoutView;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000234B7\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0011*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0011H\u0014¢\u0006\u0004\b'\u0010#J\u000f\u0010(\u001a\u00020\u0011H\u0014¢\u0006\u0004\b(\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/yandex/go/chargers/order/completion/pre_finish/ChargersFinishModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lcna;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lf1a;", "chargersFinishNavigator", "Lh1a;", "chargersFinishPresenter", "Lpya;", "chargersTypefaceDelegate", "<init>", "(Landroid/content/Context;Lpav;Lf1a;Lh1a;Lpya;)V", "Ls1a;", ClidProvider.STATE, "Lzy11;", "showPreFinish", "(Ls1a;)V", "", Constants.KEY_MESSAGE, "", "isInProgress", "showFinishingState", "(Ljava/lang/CharSequence;Z)V", "Landroid/view/ViewGroup;", "disableChildren", "(Landroid/view/ViewGroup;)V", "Landroid/view/LayoutInflater;", "inflater", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcna;", "onAttachedToWindow", "()V", "Le230;", "insetsType", "()Le230;", "onBackPressed", "onDetachedFromWindow", "Lpav;", "Lf1a;", "Lh1a;", "Lpya;", "Lcom/yandex/go/chargers/design/components/ChargersButtonsView;", "chargersButtonsView", "Lcom/yandex/go/chargers/design/components/ChargersButtonsView;", "Lg18;", "loadIconCancellable", "Lg18;", "c1a", "d1a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersFinishModalView extends SlideableBindingModalView<cna> {
    private final ChargersButtonsView chargersButtonsView;
    private final f1a chargersFinishNavigator;
    private final h1a chargersFinishPresenter;
    private final pya chargersTypefaceDelegate;
    private final pav imageLoader;
    private g18 loadIconCancellable;

    public ChargersFinishModalView(Context context, pav pavVar, f1a f1aVar, h1a h1aVar, pya pyaVar) {
        super(context);
        this.imageLoader = pavVar;
        this.chargersFinishNavigator = f1aVar;
        this.chargersFinishPresenter = h1aVar;
        this.chargersTypefaceDelegate = pyaVar;
        this.chargersButtonsView = new ChargersButtonsView(context, new ChargersFinishModalView$chargersButtonsView$1(1, h1aVar, h1a.class, "handleButtonClick", "handleButtonClick(Lcom/yandex/go/chargers/domain/model/ChargersAction;)V", 0), false);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disableChildren(ViewGroup viewGroup) {
        Iterator h8Var = new h8(3, viewGroup);
        ArrayList arrayList = new ArrayList();
        while (h8Var.hasNext()) {
            Object next = h8Var.next();
            Iterator it = (Iterator) n35.x.invoke(next);
            if (it == null || !it.hasNext()) {
                while (!h8Var.hasNext() && !arrayList.isEmpty()) {
                    h8Var = (Iterator) a.Z(arrayList);
                    ycc.z(arrayList);
                }
            } else {
                arrayList.add(h8Var);
                h8Var = it;
            }
            ((View) next).setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ChargersFinishModalView chargersFinishModalView, t1w t1wVar) {
        boolean z = t1wVar.f;
        zy11 zy11Var = zy11.a;
        if (z) {
            return zy11Var;
        }
        chargersFinishModalView.setTopSystemWindowInset(t1wVar.b - c.h(24, chargersFinishModalView));
        chargersFinishModalView.chargersButtonsView.handleInsets(t1wVar);
        View cardContentView = chargersFinishModalView.getCardContentView();
        cardContentView.setPadding(cardContentView.getPaddingLeft(), cardContentView.getPaddingTop(), cardContentView.getPaddingRight(), t1wVar.g);
        return zy11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$closeButtonClicked(h1a h1aVar) {
        h1aVar.x.k(ChargersAnalytics$ChargersFinishCardCloseReason.Back);
        ((k1a) ((io9) h1aVar.D).a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFinishingState(CharSequence message, boolean isInProgress) {
        getBinding().b.setVisibility(0);
        this.chargersButtonsView.setVisibility(8);
        getBinding().c.setVisibility(8);
        ((CardView) getBinding().d.d).setVisibility(8);
        getBinding().e.a.setVisibility(0);
        getBinding().e.c.setVisibility(isInProgress ? 0 : 8);
        getBinding().e.b.setVisibility(isInProgress ? 8 : 0);
        getBinding().e.d.setText(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPreFinish(s1a state) {
        getBinding().b.setVisibility(8);
        getBinding().e.a.setVisibility(8);
        ((GoImageView) getBinding().d.b).setVisibility(8);
        getBinding().c.initDependencies(this.imageLoader);
        getBinding().c.setNumber(state.b);
        pya pyaVar = this.chargersTypefaceDelegate;
        Context context = getContext();
        pyaVar.getClass();
        g2a a = pyaVar.a(context, TextMetaStyle.CondensedTitle1, 46.0f);
        getBinding().c.setNumberTypeface(a.a);
        getBinding().c.setNumberTextSize(a.b);
        getBinding().c.setHint(state.a);
        getBinding().c.setIcon(state.g);
        ((RobotoTextView) getBinding().d.e).setText(state.e);
        ((RobotoTextView) getBinding().d.f).setText(state.d);
        g18 g18Var = this.loadIconCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.loadIconCancellable = ((nac) this.imageLoader.a((GoImageView) getBinding().d.c)).c(state.f);
        this.chargersButtonsView.success(state.c);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public cna bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(tsh0.chargers_pre_finish_modal_view, parent, false);
        int i = thh0.full_screen_container;
        GoView goView = (GoView) cma1.O(i, inflate);
        if (goView != null) {
            i = thh0.number_checkout_view;
            NumberCheckoutView numberCheckoutView = (NumberCheckoutView) cma1.O(i, inflate);
            if (numberCheckoutView != null && (O = cma1.O((i = thh0.powerbank_view), inflate)) != null) {
                int i2 = thh0.chevron;
                GoImageView goImageView = (GoImageView) cma1.O(i2, O);
                if (goImageView != null) {
                    i2 = thh0.powerbank_type;
                    GoImageView goImageView2 = (GoImageView) cma1.O(i2, O);
                    if (goImageView2 != null) {
                        i2 = thh0.primary_label;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, O);
                        if (robotoTextView != null) {
                            i2 = thh0.secondary_label;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, O);
                            if (robotoTextView2 != null) {
                                dna dnaVar = new dna((CardView) O, goImageView, goImageView2, robotoTextView, robotoTextView2, 0);
                                i = thh0.preparing_view;
                                View O2 = cma1.O(i, inflate);
                                if (O2 != null) {
                                    return new cna((FrameLayout) inflate, goView, numberCheckoutView, dnaVar, dda.o(O2));
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                return null;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new od9(9, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        FrameLayout frameLayout = getBinding().a;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(0);
        frameLayout.setLayoutTransition(layoutTransition);
        this.chargersButtonsView.attach((CoordinatorLayout) getContent());
        h1a h1aVar = this.chargersFinishPresenter;
        c1a c1aVar = new c1a(this);
        h1aVar.Bg(c1aVar);
        tje.N(h1aVar.Jg(), null, null, new ChargersFinishPresenter$attachView$$inlined$collectIn$1(h1aVar.A.a(h1aVar.C, h1aVar.B), null, c1aVar), 3);
        qdb1.b(this, new dn7(29, this.chargersFinishPresenter));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.chargersFinishPresenter.x.k(ChargersAnalytics$ChargersFinishCardCloseReason.Back);
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.chargersFinishPresenter.Cg();
        g18 g18Var = this.loadIconCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.loadIconCancellable = null;
    }
}
