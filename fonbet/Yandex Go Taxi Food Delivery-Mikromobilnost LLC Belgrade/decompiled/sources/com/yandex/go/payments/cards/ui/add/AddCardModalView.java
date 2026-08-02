package com.yandex.go.payments.cards.ui.add;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.yandex.go.payments.api.card.CardScrollMode;
import com.yandex.go.payments.cards.nfc.navigation.a;
import com.yandex.go.payments.cards.ui.AddCardView;
import com.yandex.go.payments.cards.ui.AddCardViewImpl;
import com.yandex.go.payments.cards.ui.add.AddCardModalView;
import com.yandex.go.payments.yb.experiments.YbInPaymentsPromotionExperiment;
import defpackage.b7r0;
import defpackage.bo31;
import defpackage.ca0;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.d4;
import defpackage.d6z;
import defpackage.da0;
import defpackage.dcp0;
import defpackage.e230;
import defpackage.e6h0;
import defpackage.erw;
import defpackage.fa0;
import defpackage.g191;
import defpackage.ga0;
import defpackage.h8;
import defpackage.hn8;
import defpackage.hp51;
import defpackage.ib0;
import defpackage.jb0;
import defpackage.kb0;
import defpackage.lb0;
import defpackage.luh0;
import defpackage.lx4;
import defpackage.m6;
import defpackage.mb0;
import defpackage.n35;
import defpackage.n6o0;
import defpackage.ney;
import defpackage.ny61;
import defpackage.ryh;
import defpackage.s760;
import defpackage.u90;
import defpackage.va0;
import defpackage.w511;
import defpackage.w90;
import defpackage.x80;
import defpackage.x90;
import defpackage.xqw;
import defpackage.y130;
import defpackage.y5e;
import defpackage.y90;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000©\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001O\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001By\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020+H\u0014¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020+H\u0014¢\u0006\u0004\b/\u0010-J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00106\u001a\u00020+2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0014¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020+2\u0006\u00108\u001a\u0002032\u0006\u00109\u001a\u000203H\u0014¢\u0006\u0004\b:\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010=R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010>R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010@R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010AR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010BR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010CR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010DR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010ER\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lcom/yandex/go/payments/cards/ui/add/AddCardModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ly90;", "Landroid/content/Context;", "context", "Llb0;", "addCardViewFactory", "Lney;", "lifecycleObservable", "Llx4;", "baseAnalyticsManager", "Ls760;", "nfcBankCardRepository", "Ldcp0;", "screenCaptureProtector", "Lx80;", "addCardComponentDependencies", "Lcom/yandex/go/payments/cards/nfc/navigation/a;", "goCardScannerRouter", "Lhp51;", "ybAddCardConfigInteractor", "Lb7r0;", "settingsCardNavigationDirectionHolderRepository", "Lfa0;", "addCardNavigator", "Lxqw;", "addCardStepData", "Lcom/yandex/go/payments/api/card/CardScrollMode;", "cardScrollMode", "<init>", "(Landroid/content/Context;Llb0;Lney;Llx4;Ls760;Ldcp0;Lx80;Lcom/yandex/go/payments/cards/nfc/navigation/a;Lhp51;Lb7r0;Lfa0;Lxqw;Lcom/yandex/go/payments/api/card/CardScrollMode;)V", "Lcom/yandex/go/payments/cards/ui/AddCardView;", "createAddCardView", "()Lcom/yandex/go/payments/cards/ui/AddCardView;", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ly90;", "Lzy11;", "onAttachedToWindow", "()V", "onBackPressed", "onDetachedFromWindow", "", "screenName", "()Ljava/lang/String;", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Llb0;", "Lney;", "Llx4;", "Ls760;", "Ldcp0;", "Lx80;", "Lcom/yandex/go/payments/cards/nfc/navigation/a;", "Lhp51;", "Lb7r0;", "Lfa0;", "Lxqw;", "Lcom/yandex/go/payments/api/card/CardScrollMode;", "Lru/yandex/taxi/animation/NavigationDirection;", "closingNavigationDirection", "Lru/yandex/taxi/animation/NavigationDirection;", "addCardView", "Lcom/yandex/go/payments/cards/ui/AddCardView;", "Landroid/view/View$OnLayoutChangeListener;", "hideKeyboardOnLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "x90", "addCardViewLifecycleObserver", "Lx90;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddCardModalView extends SlideableBindingModalView<y90> {
    public static final int $stable = 8;
    private final x80 addCardComponentDependencies;
    private final fa0 addCardNavigator;
    private final xqw addCardStepData;
    private AddCardView addCardView;
    private final lb0 addCardViewFactory;
    private final x90 addCardViewLifecycleObserver;
    private final lx4 baseAnalyticsManager;
    private final CardScrollMode cardScrollMode;
    private NavigationDirection closingNavigationDirection;
    private final a goCardScannerRouter;
    private final View.OnLayoutChangeListener hideKeyboardOnLayoutChangeListener;
    private final ney lifecycleObservable;
    private final s760 nfcBankCardRepository;
    private final dcp0 screenCaptureProtector;
    private final b7r0 settingsCardNavigationDirectionHolderRepository;
    private final hp51 ybAddCardConfigInteractor;

    public AddCardModalView(Context context, lb0 lb0Var, ney neyVar, lx4 lx4Var, s760 s760Var, dcp0 dcp0Var, x80 x80Var, a aVar, hp51 hp51Var, b7r0 b7r0Var, fa0 fa0Var, xqw xqwVar, CardScrollMode cardScrollMode) {
        super(context);
        this.addCardViewFactory = lb0Var;
        this.lifecycleObservable = neyVar;
        this.baseAnalyticsManager = lx4Var;
        this.nfcBankCardRepository = s760Var;
        this.screenCaptureProtector = dcp0Var;
        this.addCardComponentDependencies = x80Var;
        this.goCardScannerRouter = aVar;
        this.ybAddCardConfigInteractor = hp51Var;
        this.settingsCardNavigationDirectionHolderRepository = b7r0Var;
        this.addCardNavigator = fa0Var;
        this.addCardStepData = xqwVar;
        this.cardScrollMode = cardScrollMode;
        NavigationDirection navigationDirection = NavigationDirection.BACKWARD;
        this.closingNavigationDirection = navigationDirection;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        if (b7r0Var.a == navigationDirection && cardScrollMode == CardScrollMode.HORIZONTAL) {
            b7r0Var.a();
        }
        this.hideKeyboardOnLayoutChangeListener = new u90(0, this);
        this.addCardViewLifecycleObserver = new x90(this);
    }

    private final AddCardView createAddCardView() {
        kb0 kb0Var;
        x80 x80Var = this.addCardComponentDependencies;
        lb0 lb0Var = this.addCardViewFactory;
        s760 s760Var = this.nfcBankCardRepository;
        dcp0 dcp0Var = this.screenCaptureProtector;
        x80Var.getClass();
        lb0Var.getClass();
        s760Var.getClass();
        dcp0Var.getClass();
        m6 m6Var = new m6(2, this);
        hp51 hp51Var = this.ybAddCardConfigInteractor;
        ryh ryhVar = hp51Var.c;
        YbInPaymentsPromotionExperiment ybInPaymentsPromotionExperiment = (YbInPaymentsPromotionExperiment) hp51Var.d.c();
        boolean z = ybInPaymentsPromotionExperiment.b;
        YbInPaymentsPromotionExperiment.AddCardDto addCardDto = ybInPaymentsPromotionExperiment.d;
        jb0 jb0Var = null;
        if (z) {
            YbInPaymentsPromotionExperiment.ImageDto imageDto = addCardDto.a;
            YbInPaymentsPromotionExperiment.AddCardTrailing addCardTrailing = addCardDto.b;
            ib0 ib0Var = imageDto.a == YbInPaymentsPromotionExperiment.ImageType.YB ? new ib0(d6z.Y(ybInPaymentsPromotionExperiment, imageDto.b)) : null;
            String Y = d6z.Y(ybInPaymentsPromotionExperiment, addCardTrailing.a);
            String str = addCardTrailing.b;
            if (Y.length() != 0 && str.length() != 0) {
                jb0Var = new jb0(Y, d6z.Y(ybInPaymentsPromotionExperiment, addCardTrailing.c), new bo31(15, hp51Var, str));
            }
            kb0Var = new kb0(ib0Var, jb0Var, ryhVar.e());
        } else {
            ga0 e = ryhVar.e();
            kb0Var = e == null ? kb0.d : new kb0(null, null, e);
        }
        if (!this.goCardScannerRouter.i()) {
            Context context = getContext();
            xqw xqwVar = this.addCardStepData;
            mb0 mb0Var = (mb0) lb0Var;
            va0 va0Var = new va0(kb0Var, (dcp0) ((n6o0) mb0Var.a.a.b).get());
            return new AddCardViewImpl(context, va0Var, mb0Var.b.a(m6Var, hn8.z1, xqwVar, va0Var), mb0Var.c);
        }
        Context context2 = getContext();
        a aVar = this.goCardScannerRouter;
        xqw xqwVar2 = this.addCardStepData;
        mb0 mb0Var2 = (mb0) lb0Var;
        va0 va0Var2 = new va0(kb0Var, (dcp0) ((n6o0) mb0Var2.a.a.b).get());
        return new AddCardViewImpl(context2, va0Var2, mb0Var2.b.a(m6Var, aVar, xqwVar2, va0Var2), mb0Var2.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAddCardView$lambda$0(AddCardModalView addCardModalView, erw erwVar) {
        ((j) addCardModalView.baseAnalyticsManager).t(addCardModalView.getModalScreenName(), "confirm");
        addCardModalView.closingNavigationDirection = NavigationDirection.FORWARD;
        ((da0) ((g191) addCardModalView.addCardNavigator).a).r(new ca0(erwVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideKeyboardOnLayoutChangeListener$lambda$0(AddCardModalView addCardModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (addCardModalView == null) {
            return;
        }
        addCardModalView.post(new ce0(addCardModalView, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(AddCardModalView addCardModalView) {
        return addCardModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(AddCardModalView addCardModalView) {
        Object obj;
        AddCardView addCardView = addCardModalView.addCardView;
        if (addCardView != null) {
            Iterator h8Var = new h8(3, addCardView);
            ArrayList arrayList = new ArrayList();
            while (true) {
                if (!h8Var.hasNext()) {
                    obj = null;
                    break;
                }
                obj = h8Var.next();
                Iterator it = (Iterator) n35.x.invoke(obj);
                if (it == null || !it.hasNext()) {
                    while (!h8Var.hasNext() && !arrayList.isEmpty()) {
                        h8Var = (Iterator) kotlin.collections.a.Z(arrayList);
                        ycc.z(arrayList);
                    }
                } else {
                    arrayList.add(h8Var);
                    h8Var = it;
                }
                if (((View) obj) instanceof EditText) {
                    break;
                }
            }
            View view = (View) obj;
            if (view != null) {
                view.requestFocus();
            }
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        int i = w90.a[this.cardScrollMode.ordinal()];
        if (i == 1) {
            y5e.c(getContent(), startAction, endAction, this.closingNavigationDirection, 4);
        } else if (i == 2) {
            super.animateDismiss(startAction, endAction);
        } else {
            w511.b();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        int i = w90.a[this.cardScrollMode.ordinal()];
        if (i == 1) {
            y5e.d(getContent(), onAnimateShowStartAction, onAnimateShowEndAction, this.settingsCardNavigationDirectionHolderRepository.a, 4);
        } else if (i == 2) {
            super.animateShow(onAnimateShowStartAction, onAnimateShowEndAction);
        } else {
            w511.b();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public y90 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(luh0.add_card_modal_view, parent, false);
        int i = e6h0.toolbar;
        ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
        if (toolbarComponent != null) {
            return new y90((LinearLayout) inflate, toolbarComponent);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new y130(1, new d4(10, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final int i = 0;
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        getBinding().a.addOnLayoutChangeListener(this.hideKeyboardOnLayoutChangeListener);
        getBinding().b.setOnNavigationClickListener(new Runnable(this) { // from class: v90
            public final /* synthetic */ AddCardModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                AddCardModalView addCardModalView = this.b;
                switch (i2) {
                    case 0:
                        addCardModalView.onBackPressed();
                        break;
                    default:
                        AddCardModalView.onAttachedToWindow$lambda$0(addCardModalView);
                        break;
                }
            }
        });
        this.addCardView = createAddCardView();
        getBinding().a.addView(this.addCardView, -1, -1);
        getBinding().b.requestAccessibilityFocus();
        this.lifecycleObservable.a(this.addCardViewLifecycleObserver, this);
        final int i2 = 1;
        post(new Runnable(this) { // from class: v90
            public final /* synthetic */ AddCardModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                AddCardModalView addCardModalView = this.b;
                switch (i22) {
                    case 0:
                        addCardModalView.onBackPressed();
                        break;
                    default:
                        AddCardModalView.onAttachedToWindow$lambda$0(addCardModalView);
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        AddCardView addCardView = this.addCardView;
        if (addCardView != null) {
            addCardView.onDismiss();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.addCardView = null;
        getBinding().a.removeOnLayoutChangeListener(this.hideKeyboardOnLayoutChangeListener);
        this.lifecycleObservable.d(this);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "add_creditcard";
    }
}
