package com.yandex.go.scooters.insurance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.cma1;
import defpackage.e230;
import defpackage.g18;
import defpackage.gtn0;
import defpackage.itn0;
import defpackage.k4o;
import defpackage.ltn0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qfh0;
import defpackage.srh0;
import defpackage.tje;
import defpackage.tls;
import defpackage.wls;
import defpackage.y130;
import defpackage.zsn0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,-Bo\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012 \b\u0001\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0013\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0014¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'R,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0013\u0012\u0004\u0012\u00020\r0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/yandex/go/scooters/insurance/ScootersInsuranceModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Litn0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lzsn0;", "scootersInsuranceAnalytics", "Lltn0;", "mode", "Lkotlin/Function1;", "Lcom/yandex/go/scooters/insurance/model/ScootersInsuranceCompletion;", "Lzy11;", "onComplete", "Lcom/yandex/go/scooters/insurance/e;", "scootersInsurancePresenter", "Lkotlin/Function2;", "", "Lkotlin/Function0;", "showErrorDialog", "<init>", "(Landroid/content/Context;Lpav;Lzsn0;Lltn0;Ltls;Lcom/yandex/go/scooters/insurance/e;Lwls;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Litn0;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lpav;", "Lzsn0;", "Lltn0;", "Ltls;", "Lcom/yandex/go/scooters/insurance/e;", "Lwls;", "Lg18;", "loadImageCancellable", "Lg18;", "com/yandex/go/scooters/insurance/d", "LoadingButton", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersInsuranceModalView extends SlideableBindingModalView<itn0> {
    public static final int $stable = 8;
    private final pav imageLoader;
    private g18 loadImageCancellable;
    private final ltn0 mode;
    private final tls onComplete;
    private final zsn0 scootersInsuranceAnalytics;
    private final e scootersInsurancePresenter;
    private final wls showErrorDialog;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/scooters/insurance/ScootersInsuranceModalView$LoadingButton;", "", "MAIN", "MINOR", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class LoadingButton {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LoadingButton[] $VALUES;
        public static final LoadingButton MAIN;
        public static final LoadingButton MINOR;

        static {
            LoadingButton loadingButton = new LoadingButton("MAIN", 0);
            MAIN = loadingButton;
            LoadingButton loadingButton2 = new LoadingButton("MINOR", 1);
            MINOR = loadingButton2;
            LoadingButton[] loadingButtonArr = {loadingButton, loadingButton2};
            $VALUES = loadingButtonArr;
            $ENTRIES = kotlin.enums.a.a(loadingButtonArr);
        }

        public static LoadingButton valueOf(String str) {
            return (LoadingButton) Enum.valueOf(LoadingButton.class, str);
        }

        public static LoadingButton[] values() {
            return (LoadingButton[]) $VALUES.clone();
        }
    }

    public ScootersInsuranceModalView(Context context, pav pavVar, zsn0 zsn0Var, ltn0 ltn0Var, tls tlsVar, e eVar, wls wlsVar) {
        super(context);
        this.imageLoader = pavVar;
        this.scootersInsuranceAnalytics = zsn0Var;
        this.mode = ltn0Var;
        this.onComplete = tlsVar;
        this.scootersInsurancePresenter = eVar;
        this.showErrorDialog = wlsVar;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(ScootersInsuranceModalView scootersInsuranceModalView) {
        return scootersInsuranceModalView.getBinding().a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public itn0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_insurance_modal_view, parent, false);
        int i = qfh0.button_group;
        Group group = (Group) cma1.O(i, inflate);
        if (group != null) {
            i = qfh0.close_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = qfh0.conditions;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent != null) {
                    i = qfh0.details_item_component;
                    ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                    if (listItemComponent2 != null) {
                        i = qfh0.icon;
                        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                        if (goImageView != null) {
                            i = qfh0.insurance_toggle;
                            ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) cma1.O(i, inflate);
                            if (listItemSwitchComponent != null) {
                                i = qfh0.main_button;
                                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                                if (buttonComponent2 != null) {
                                    i = qfh0.minor_button;
                                    ButtonComponent buttonComponent3 = (ButtonComponent) cma1.O(i, inflate);
                                    if (buttonComponent3 != null) {
                                        i = qfh0.price;
                                        ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, inflate);
                                        if (listItemComponent3 != null) {
                                            i = qfh0.subtitle;
                                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                                            if (robotoTextView != null) {
                                                i = qfh0.title;
                                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                                if (robotoTextView2 != null) {
                                                    i = qfh0.toggle_group;
                                                    Group group2 = (Group) cma1.O(i, inflate);
                                                    if (group2 != null) {
                                                        i = qfh0.toolbar;
                                                        ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
                                                        if (toolbarComponent != null) {
                                                            return new itn0((GoConstraintLayout) inflate, group, buttonComponent, listItemComponent, listItemComponent2, goImageView, listItemSwitchComponent, buttonComponent2, buttonComponent3, listItemComponent3, robotoTextView, robotoTextView2, group2, toolbarComponent);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new y130(1, new gtn0(this, 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        e eVar = this.scootersInsurancePresenter;
        d dVar = new d(this);
        eVar.Bg(dVar);
        tje.N(eVar.Jg(), null, null, new ScootersInsurancePresenter$attachView$1(eVar, dVar, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersInsurancePresenter.Cg();
        g18 g18Var = this.loadImageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.loadImageCancellable = null;
    }
}
