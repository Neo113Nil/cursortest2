package com.yandex.go.scooters.debt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.scooters.analytics.ScootersDebtAnalytics$CloseReason;
import com.yandex.go.scooters.analytics.ScootersDebtAnalytics$TappedButton;
import com.yandex.go.scooters.debt.ScootersDebtModalView;
import defpackage.ajl0;
import defpackage.bia0;
import defpackage.cdn0;
import defpackage.cma1;
import defpackage.cno0;
import defpackage.ddn0;
import defpackage.kyh0;
import defpackage.lq31;
import defpackage.ny61;
import defpackage.qdb1;
import defpackage.qfh0;
import defpackage.r1b1;
import defpackage.rea0;
import defpackage.sls;
import defpackage.srh0;
import defpackage.tje;
import defpackage.tls;
import defpackage.wls;
import defpackage.xcn0;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u0087\u0001\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012 \b\u0001\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00100\u0012\u0012\u0016\b\u0001\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0014¢\u0006\u0004\b)\u0010$J%\u0010/\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0006\u0012\u0004\u0018\u00010.0,2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00105R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00106R,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00100\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00107R\"\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00100\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00108R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00109¨\u0006;"}, d2 = {"Lcom/yandex/go/scooters/debt/ScootersDebtModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lddn0;", "Landroid/content/Context;", "context", "Lxcn0;", "scootersDebtAnalytics", "Lbia0;", "paymentResourceProvider", "Lcno0;", "scootersPriceStringFactory", "Lrea0;", "paymentModelsTitleInteractor", "Lcom/yandex/go/scooters/debt/b;", "scootersDebtPresenter", "Lkotlin/Function0;", "Lzy11;", "onDebtPayedListener", "Lkotlin/Function2;", "", "showErrorDialog", "Lkotlin/Function1;", "Lm6a0;", "onPaymentClickedListener", "<init>", "(Landroid/content/Context;Lxcn0;Lbia0;Lcno0;Lrea0;Lcom/yandex/go/scooters/debt/b;Lsls;Lwls;Ltls;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lddn0;", "", "isArrowsPermanentlyHidden", "()Z", "onAttachedToWindow", "()V", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "onDetachedFromWindow", "Llq31;", "eventType", "", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Lxcn0;", "Lbia0;", "Lcno0;", "Lrea0;", "Lcom/yandex/go/scooters/debt/b;", "Lsls;", "Lwls;", "Ltls;", "Ljava/lang/Runnable;", "cdn0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDebtModalView extends SlideableBindingModalView<ddn0> {
    public static final int $stable = 8;
    private Runnable onBackPressedListener;
    private final sls onDebtPayedListener;
    private final tls onPaymentClickedListener;
    private final rea0 paymentModelsTitleInteractor;
    private final bia0 paymentResourceProvider;
    private final xcn0 scootersDebtAnalytics;
    private final b scootersDebtPresenter;
    private final cno0 scootersPriceStringFactory;
    private final wls showErrorDialog;

    public ScootersDebtModalView(Context context, xcn0 xcn0Var, bia0 bia0Var, cno0 cno0Var, rea0 rea0Var, b bVar, sls slsVar, wls wlsVar, tls tlsVar) {
        super(context);
        this.scootersDebtAnalytics = xcn0Var;
        this.paymentResourceProvider = bia0Var;
        this.scootersPriceStringFactory = cno0Var;
        this.paymentModelsTitleInteractor = rea0Var;
        this.scootersDebtPresenter = bVar;
        this.onDebtPayedListener = slsVar;
        this.showErrorDialog = wlsVar;
        this.onPaymentClickedListener = tlsVar;
        getBottomSheetBehavior().a0 = false;
        setAnalyticsContext(createAnalyticsContext("ScootersDebt", new LinkedHashSet()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersDebtModalView scootersDebtModalView) {
        Runnable runnable = scootersDebtModalView.onBackPressedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(ScootersDebtModalView scootersDebtModalView) {
        xcn0.b(scootersDebtModalView.scootersDebtAnalytics, ScootersDebtAnalytics$TappedButton.PayDebt, r1b1.b(scootersDebtModalView.scootersDebtPresenter.A.a));
        scootersDebtModalView.scootersDebtPresenter.Og();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnBackPressedListener$lambda$0(ScootersDebtModalView scootersDebtModalView, Runnable runnable) {
        xcn0.b(scootersDebtModalView.scootersDebtAnalytics, ScootersDebtAnalytics$TappedButton.Back, r1b1.b(scootersDebtModalView.scootersDebtPresenter.A.a));
        runnable.run();
        xcn0.a(scootersDebtModalView.scootersDebtAnalytics, ScootersDebtAnalytics$CloseReason.Back, r1b1.b(scootersDebtModalView.scootersDebtPresenter.A.a));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ddn0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_debt_modal_view, parent, false);
        int i = qfh0.error_image;
        if (((GoImageView) cma1.O(i, inflate)) != null) {
            i = qfh0.pay;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = qfh0.payment_info_view;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent != null) {
                    i = qfh0.payment_loading;
                    ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i, inflate);
                    if (shimmeringBar != null) {
                        i = qfh0.subtitle;
                        if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                            i = qfh0.title;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView != null) {
                                return new ddn0((GoConstraintLayout) inflate, buttonComponent, listItemComponent, shimmeringBar, robotoTextView);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.x42
    public Map<String, Object> getEventAnalyticsParams(lq31 eventType) {
        return kotlin.collections.b.l(new Pair(ClidProvider.STATE, r1b1.b(this.scootersDebtPresenter.A.a).getEventValue()));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getRouteSummaryIsVisible() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final int i = 0;
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        qdb1.b(this, new Runnable(this) { // from class: bdn0
            public final /* synthetic */ ScootersDebtModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ScootersDebtModalView scootersDebtModalView = this.b;
                switch (i2) {
                    case 0:
                        ScootersDebtModalView.onAttachedToWindow$lambda$0(scootersDebtModalView);
                        break;
                    default:
                        ScootersDebtModalView.onAttachedToWindow$lambda$1(scootersDebtModalView);
                        break;
                }
            }
        });
        getBinding().b.setText(getContext().getString(kyh0.scooters_you_have_a_dept_btn));
        b bVar = this.scootersDebtPresenter;
        cdn0 cdn0Var = new cdn0(this);
        bVar.Bg(cdn0Var);
        tje.N(bVar.Jg(), null, null, new ScootersDebtPresenter$load$1(bVar, null), 3);
        tje.N(bVar.Jg(), null, null, new ScootersDebtPresenter$attachView$$inlined$collectIn$1(bVar.x.g, null, cdn0Var), 3);
        final int i2 = 1;
        getBinding().b.setDebounceClickListener(new Runnable(this) { // from class: bdn0
            public final /* synthetic */ ScootersDebtModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ScootersDebtModalView scootersDebtModalView = this.b;
                switch (i22) {
                    case 0:
                        ScootersDebtModalView.onAttachedToWindow$lambda$0(scootersDebtModalView);
                        break;
                    default:
                        ScootersDebtModalView.onAttachedToWindow$lambda$1(scootersDebtModalView);
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersDebtPresenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        super.setOnBackPressedListener(onBackPressedListener);
        this.onBackPressedListener = new ajl0(16, this, onBackPressedListener);
    }
}
