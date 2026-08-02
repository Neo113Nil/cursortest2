package com.yandex.go.drive.vertical.ui.tariff_card;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.drive.vertical.ui.double_content_modal.DoubleContentModalView;
import com.yandex.go.drive.vertical.ui.tariff_card.collapsed.DriveTariffCardCollapsedView;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a2i0;
import defpackage.ahm;
import defpackage.c2h0;
import defpackage.f1h0;
import defpackage.g641;
import defpackage.gh00;
import defpackage.jqr;
import defpackage.kyh0;
import defpackage.mrg0;
import defpackage.qje;
import defpackage.rgm;
import defpackage.tgm;
import defpackage.tje;
import defpackage.u90;
import defpackage.ugm;
import defpackage.uxh;
import defpackage.vgm;
import defpackage.vng;
import defpackage.xgm;
import defpackage.xng0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002./B1\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/yandex/go/drive/vertical/ui/tariff_card/DriveTariffCardModalView;", "Lcom/yandex/go/drive/vertical/ui/double_content_modal/DoubleContentModalView;", "Landroid/content/Context;", "context", "Lahm;", "presenter", "Lcom/yandex/go/drive/vertical/ui/tariff_card/collapsed/DriveTariffCardCollapsedView;", "collapsedView", "Lrgm;", "expandedView", "<init>", "(Landroid/content/Context;Lahm;Lcom/yandex/go/drive/vertical/ui/tariff_card/collapsed/DriveTariffCardCollapsedView;Lrgm;)V", "", "attrId", "colorAttr", "(I)I", "dimenId", "dimen", "drawableId", "Landroid/graphics/drawable/Drawable;", "drawable", "(I)Landroid/graphics/drawable/Drawable;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "hasCustomBackground", "()Z", "Lahm;", "Lcom/yandex/go/drive/vertical/ui/tariff_card/collapsed/DriveTariffCardCollapsedView;", "Lrgm;", "", "floatButtonCompensation", "F", "bottomSheetBackground", "Landroid/graphics/drawable/Drawable;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "focusRouteButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lru/yandex/taxi/design/BackButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/BackButtonIconComponent;", "Landroid/view/View$OnLayoutChangeListener;", "collapsedViewLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "vgm", "wgm", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DriveTariffCardModalView extends DoubleContentModalView {
    private final BackButtonIconComponent backButton;
    private final Drawable bottomSheetBackground;
    private final DriveTariffCardCollapsedView collapsedView;
    private final View.OnLayoutChangeListener collapsedViewLayoutChangeListener;
    private final rgm expandedView;
    private final float floatButtonCompensation;
    private final FloatButtonIconComponent focusRouteButton;
    private final ahm presenter;

    public DriveTariffCardModalView(Context context, ahm ahmVar, DriveTariffCardCollapsedView driveTariffCardCollapsedView, rgm rgmVar) {
        super(context, driveTariffCardCollapsedView, rgmVar, ahmVar);
        this.presenter = ahmVar;
        this.collapsedView = driveTariffCardCollapsedView;
        this.expandedView = rgmVar;
        float dimen = dimen(mrg0.component_float_button_icon_shadow_compensation);
        this.floatButtonCompensation = dimen;
        Drawable drawable = drawable(c2h0.drive_tariff_card_background);
        this.bottomSheetBackground = drawable;
        FloatButtonIconComponent floatButtonIconComponent = new FloatButtonIconComponent(context, null, 0, a2i0.FloatButtonIconStyle, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        floatButtonIconComponent.setLayoutParams(layoutParams);
        floatButtonIconComponent.setTranslationX(-dimen);
        floatButtonIconComponent.setDebounceClickListener(new uxh(29, ahmVar));
        floatButtonIconComponent.setIcon(f1h0.ic_route);
        floatButtonIconComponent.setContentDescription(floatButtonIconComponent.getResources().getString(kyh0.summory_route_show_description));
        this.focusRouteButton = floatButtonIconComponent;
        BackButtonIconComponent backButtonIconComponent = new BackButtonIconComponent(context, null, 0, a2i0.FloatButtonIconStyle, 6, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388611;
        backButtonIconComponent.setLayoutParams(layoutParams2);
        backButtonIconComponent.setTranslationX(dimen);
        backButtonIconComponent.setDebounceClickListener(new ugm(this, 0));
        backButtonIconComponent.setBadgeBackgroundColor(qje.t(xng0.controlMain, backButtonIconComponent.getContext()));
        backButtonIconComponent.setBadgeTextColorAttr(xng0.textOnControl);
        c.y(backButtonIconComponent, true);
        this.backButton = backButtonIconComponent;
        this.collapsedViewLayoutChangeListener = new u90(29, this);
        getBottomSheet().setBackground(drawable);
        addView(backButtonIconComponent, 0);
        addView(floatButtonIconComponent, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collapsedViewLayoutChangeListener$lambda$0(DriveTariffCardModalView driveTariffCardModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        driveTariffCardModalView.backButton.setY(((driveTariffCardModalView.getHeight() - view.getHeight()) - driveTariffCardModalView.backButton.getHeight()) - driveTariffCardModalView.floatButtonCompensation);
        driveTariffCardModalView.focusRouteButton.setY(((driveTariffCardModalView.getHeight() - view.getHeight()) - driveTariffCardModalView.focusRouteButton.getHeight()) - driveTariffCardModalView.floatButtonCompensation);
    }

    private final int colorAttr(int attrId) {
        return qje.t(attrId, getContext());
    }

    private final int dimen(int dimenId) {
        return tje.r(dimenId, getContext());
    }

    private final Drawable drawable(int drawableId) {
        return vng.t(drawableId, getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void focusRouteButton$lambda$0$onFocusRoute(ahm ahmVar) {
        g641 g641Var = ahmVar.B.d;
        if (g641Var != null) {
            g641Var.Jg(true);
        }
        r0 r0Var = ahmVar.G;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(DriveTariffCardModalView driveTariffCardModalView) {
        driveTariffCardModalView.presenter.Kg();
    }

    @Override // com.yandex.go.drive.vertical.ui.double_content_modal.DoubleContentModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return true;
    }

    @Override // com.yandex.go.drive.vertical.ui.double_content_modal.DoubleContentModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ahm ahmVar = this.presenter;
        vgm vgmVar = new vgm(this);
        ahmVar.Bg(vgmVar);
        tgm tgmVar = ahmVar.A;
        tgmVar.a.b8(tgmVar.b);
        ((gh00) ahmVar.z).e(ahmVar.P);
        ((xgm) ahmVar.Dg()).pg(false);
        int i = 3;
        tje.N(ahmVar.Jg(), null, null, new DriveTariffCardPresenter$attachView$$inlined$safeCollectIn$1(new jqr(ahmVar.G, new DriveTariffCardPresenter$attachView$1(vgmVar, null), i), null), 3);
        tje.N(ahmVar.Jg(), null, null, new DriveTariffCardPresenter$attachView$$inlined$safeCollectIn$2(e.t(new b(new jqr(((k) ahmVar.C).j.b(), new DriveTariffCardPresenter$attachView$3(ahmVar, null), i), ahmVar)), null, ahmVar, vgmVar), 3);
        setDismissOnBackPressed(false);
        setOnBackPressedListener(new ugm(this, 1));
        this.collapsedView.addOnLayoutChangeListener(this.collapsedViewLayoutChangeListener);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.collapsedView.removeOnLayoutChangeListener(this.collapsedViewLayoutChangeListener);
    }
}
