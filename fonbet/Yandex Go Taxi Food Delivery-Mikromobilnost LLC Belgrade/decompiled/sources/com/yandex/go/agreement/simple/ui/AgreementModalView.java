package com.yandex.go.agreement.simple.ui;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.b;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.agreement.api.Acceptance$Default$IconStyle;
import defpackage.avj0;
import defpackage.bd;
import defpackage.bdc;
import defpackage.c230;
import defpackage.c57;
import defpackage.ck1;
import defpackage.cma1;
import defpackage.dk1;
import defpackage.ehh0;
import defpackage.ei;
import defpackage.ek1;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.fd;
import defpackage.fk1;
import defpackage.gk1;
import defpackage.hk1;
import defpackage.ik1;
import defpackage.j73;
import defpackage.jk1;
import defpackage.kyh0;
import defpackage.lcb1;
import defpackage.m7x0;
import defpackage.my6;
import defpackage.nac;
import defpackage.ny61;
import defpackage.oj1;
import defpackage.pav;
import defpackage.pm5;
import defpackage.q47;
import defpackage.qeb1;
import defpackage.qj1;
import defpackage.rj1;
import defpackage.rp31;
import defpackage.s8o;
import defpackage.seb1;
import defpackage.sj1;
import defpackage.vng;
import defpackage.vqh0;
import defpackage.xng0;
import defpackage.xws;
import defpackage.y4;
import defpackage.yk1;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.common_models.ui.ButtonOrientation;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.BindingModalView;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002EVB%\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0019\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010\u0011J\u0019\u0010*\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b-\u0010+J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020(H\u0002¢\u0006\u0004\b.\u0010+J\u000f\u0010/\u001a\u00020\u000fH\u0002¢\u0006\u0004\b/\u0010\u0011J\u0017\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020$H\u0002¢\u0006\u0004\b1\u00102J\u001d\u00106\u001a\u00020\u000f2\f\u00105\u001a\b\u0012\u0004\u0012\u00020403H\u0002¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020@2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0018\u0010F\u001a\u00060ER\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010IR\u0014\u0010,\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010T¨\u0006W"}, d2 = {"Lcom/yandex/go/agreement/simple/ui/AgreementModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lxws;", "Lnwy0;", "Lyk1;", "presenter", "Lpav;", "imageLoader", "Landroid/content/Context;", "context", "<init>", "(Lyk1;Lpav;Landroid/content/Context;)V", "Lc230;", "insetsType", "()Lc230;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lxws;", "onBackPressed", "Landroid/view/View;", "getFocusedForAccessibilityViewOnAppear", "()Landroid/view/View;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "applyThemeForChildrenByDefault", "()Z", "enableScroll", "", "title", "setTitle", "(Ljava/lang/String;)V", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "setDescription", "setDescriptionHtml", "setDescriptionLinkColor", "isVisible", "setCloseButtonVisibility", "(Z)V", "Lq47;", "Ltj1;", "buttons", "setBottomButtons", "(Lq47;)V", "Lcom/yandex/go/agreement/api/Acceptance$Default$IconStyle;", "iconStyle", "applyIconStyle", "(Lcom/yandex/go/agreement/api/Acceptance$Default$IconStyle;)V", "Lck1;", ClidProvider.STATE, "loadImage", "(Lck1;)V", "Landroid/widget/ImageView;", "getImageView", "(Lcom/yandex/go/agreement/api/Acceptance$Default$IconStyle;)Landroid/widget/ImageView;", "Lyk1;", "Lpav;", "Ljk1;", "innerMvpView", "Ljk1;", "Lc57;", "Lc57;", "Lru/yandex/taxi/widget/RobotoTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroidx/core/widget/NestedScrollView;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "scrollIndicatorLine", "Landroid/view/View;", "Landroidx/appcompat/widget/AppCompatImageView;", "scrollIndicatorIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "Lck1;", "Companion", "ik1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AgreementModalView extends BindingModalView<xws> {
    public static final ik1 Companion = new ik1();
    private static final int DIRECTION_DOWN = 1;
    private final c57 buttons;
    private final RobotoTextView description;
    private final pav imageLoader;
    private final jk1 innerMvpView;
    private final yk1 presenter;
    private final AppCompatImageView scrollIndicatorIcon;
    private final View scrollIndicatorLine;
    private final NestedScrollView scrollView;
    private ck1 state;

    public AgreementModalView(yk1 yk1Var, pav pavVar, Context context) {
        super(context);
        this.presenter = yk1Var;
        this.imageLoader = pavVar;
        this.innerMvpView = new jk1(this);
        c57 buttonsContract = getBinding().b.buttonsContract();
        this.buttons = buttonsContract;
        RobotoTextView robotoTextView = getBinding().e;
        this.description = robotoTextView;
        this.scrollView = getBinding().h;
        this.scrollIndicatorLine = getBinding().g;
        this.scrollIndicatorIcon = getBinding().f;
        this.state = ck1.g;
        int i = 0;
        c.z(new ek1(this, i), getBinding().d);
        ((pm5) buttonsContract).f(new hk1(yk1Var, i));
        setDismissOnTouchOutside(false);
        setId(ehh0.gdpr_agreement_view);
        b.p(robotoTextView, new ei(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(AgreementModalView agreementModalView) {
        agreementModalView.presenter.Kg(qj1.a);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyIconStyle(Acceptance$Default$IconStyle iconStyle) {
        getBinding().i.setVisibility(iconStyle == Acceptance$Default$IconStyle.LEFT ? 0 : 8);
        getBinding().c.setVisibility(iconStyle == Acceptance$Default$IconStyle.CENTER ? 0 : 8);
    }

    private final void enableScroll() {
        this.scrollIndicatorLine.setVisibility(0);
        this.scrollIndicatorIcon.setVisibility(0);
        this.scrollView.setOnScrollChangeListener(new gk1(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableScroll$lambda$0(AgreementModalView agreementModalView, View view, int i, int i2, int i3, int i4) {
        boolean canScrollVertically = agreementModalView.scrollView.canScrollVertically(1);
        View view2 = agreementModalView.scrollIndicatorLine;
        if (canScrollVertically) {
            cma1.I(view2);
            cma1.I(agreementModalView.scrollIndicatorIcon);
        } else {
            cma1.b(0.0f, view2);
            cma1.b(0.0f, agreementModalView.scrollIndicatorIcon);
        }
    }

    private final ImageView getImageView(Acceptance$Default$IconStyle iconStyle) {
        Acceptance$Default$IconStyle acceptance$Default$IconStyle = Acceptance$Default$IconStyle.CENTER;
        xws binding = getBinding();
        return iconStyle == acceptance$Default$IconStyle ? binding.c : binding.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getPreDrawListener$lambda$0(AgreementModalView agreementModalView, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (agreementModalView.scrollView.canScrollVertically(1)) {
            agreementModalView.enableScroll();
        }
        return onPreDrawListener.onPreDraw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(AgreementModalView agreementModalView) {
        return agreementModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadImage(ck1 state) {
        ImageView imageView = getImageView(state.e);
        String str = state.f;
        if (str == null || evu0.J(str)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        nac nacVar = (nac) this.imageLoader.a(imageView);
        nacVar.i = new fk1(imageView, 0);
        nacVar.c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 loadImage$lambda$0(ImageView imageView) {
        imageView.setVisibility(8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBottomButtons(q47 buttons) {
        ((pm5) this.buttons).d(buttons);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCloseButtonVisibility(boolean isVisible) {
        getBinding().d.setVisibility(isVisible ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDescription(String description) {
        if (description == null || evu0.J(description)) {
            return;
        }
        setDescriptionHtml(description);
    }

    private final void setDescriptionHtml(String description) {
        Spanned c = qeb1.c(description);
        this.description.setText(c);
        if (qeb1.d(c)) {
            this.description.setMovementMethod(seb1.a(new y4(28, this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setDescriptionHtml$lambda$0(AgreementModalView agreementModalView, String str) {
        agreementModalView.presenter.Kg(new sj1(str));
        return zy11.a;
    }

    private final void setDescriptionLinkColor() {
        this.description.setLinkTextColor(s8o.m(new bdc(xng0.textMinor), getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitle(String title) {
        int i = ehh0.gdpr_title;
        WeakHashMap weakHashMap = b.a;
        ((View) rp31.d(this, i)).setVisibility(title == null || evu0.J(title) ? 8 : 0);
        ((RobotoTextView) ((View) rp31.d(this, ehh0.gdpr_title))).setText(title);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        getBinding().a.setBackground(vng.t(f1h0.bg_bottom_notification, getContext()));
        setDescriptionLinkColor();
        loadImage(this.state);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public xws bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(vqh0.gdpr_agreement, parent, false);
        int i = ehh0.bottom_buttons;
        ButtonsView buttonsView = (ButtonsView) cma1.O(i, inflate);
        if (buttonsView != null) {
            i = ehh0.gdpr_center_image;
            ImageView imageView = (ImageView) cma1.O(i, inflate);
            if (imageView != null) {
                i = ehh0.gdpr_close_button;
                ImageView imageView2 = (ImageView) cma1.O(i, inflate);
                if (imageView2 != null) {
                    i = ehh0.gdpr_description;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        i = ehh0.gdpr_scroll_indicator_icon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                        if (appCompatImageView != null && (O = cma1.O((i = ehh0.gdpr_scroll_indicator_line), inflate)) != null) {
                            i = ehh0.gdpr_scroll_view;
                            NestedScrollView nestedScrollView = (NestedScrollView) cma1.O(i, inflate);
                            if (nestedScrollView != null) {
                                i = ehh0.gdpr_start_image;
                                ImageView imageView3 = (ImageView) cma1.O(i, inflate);
                                if (imageView3 != null) {
                                    i = ehh0.gdpr_title;
                                    if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                                        return new xws((LinearLayout) inflate, buttonsView, imageView, imageView2, robotoTextView, appCompatImageView, O, nestedScrollView, imageView3);
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
    public View getFocusedForAccessibilityViewOnAppear() {
        return getBinding().d;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public ViewTreeObserver.OnPreDrawListener getPreDrawListener() {
        return new dk1(this, super.getPreDrawListener(), 0);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new ek1(this, 1), false);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        yk1 yk1Var = this.presenter;
        jk1 jk1Var = this.innerMvpView;
        yk1Var.Bg(jk1Var);
        bd bdVar = yk1Var.x;
        String str = bdVar.h;
        String a = (str == null || evu0.J(str)) ? "" : ((m7x0) yk1Var.A).a(str);
        String str2 = bdVar.d;
        String str3 = bdVar.e;
        String str4 = bdVar.f;
        if (str4 == null) {
            str4 = ((avj0) yk1Var.C).h(kyh0.common_continue);
        }
        my6 my6Var = my6.k;
        q47 q47Var = new q47(ButtonOrientation.HORIZONTAL, j73.A(new my6[]{null, lcb1.a(str4, rj1.a)}));
        boolean z = bdVar.k;
        Acceptance$Default$IconStyle acceptance$Default$IconStyle = bdVar.m;
        ck1 ck1Var = new ck1(str2, str3, q47Var, z, acceptance$Default$IconStyle, a);
        AgreementModalView agreementModalView = jk1Var.a;
        agreementModalView.state = ck1Var;
        agreementModalView.setTitle(str2);
        agreementModalView.setDescription(str3);
        agreementModalView.setBottomButtons(q47Var);
        agreementModalView.setCloseButtonVisibility(z);
        agreementModalView.applyIconStyle(acceptance$Default$IconStyle);
        agreementModalView.loadImage(ck1Var);
        ((fd) yk1Var.z).g(bdVar);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.presenter.Kg(oj1.a);
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.scrollView.setOnScrollChangeListener((View.OnScrollChangeListener) null);
    }
}
