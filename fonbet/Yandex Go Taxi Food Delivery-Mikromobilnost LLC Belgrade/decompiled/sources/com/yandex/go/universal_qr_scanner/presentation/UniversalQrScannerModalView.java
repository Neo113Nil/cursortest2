package com.yandex.go.universal_qr_scanner.presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.universal_qr_scanner.ui.UniversalQrScannerCameraPreview;
import defpackage.cma1;
import defpackage.e230;
import defpackage.er7;
import defpackage.g021;
import defpackage.h021;
import defpackage.i021;
import defpackage.jlh0;
import defpackage.jqr;
import defpackage.mth;
import defpackage.ney;
import defpackage.ny61;
import defpackage.t1w;
import defpackage.tje;
import defpackage.w130;
import defpackage.wx11;
import defpackage.y1y;
import defpackage.z8h0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlinx.coroutines.flow.j0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001a\u0010\u000fJ/\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0014¢\u0006\u0004\b%\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0014\u0010,\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/yandex/go/universal_qr_scanner/presentation/UniversalQrScannerModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Li021;", "Landroid/content/Context;", "context", "Lcom/yandex/go/universal_qr_scanner/presentation/d;", "presenter", "Lney;", "lifecycleObservable", "Ler7;", "cameraLifecycleOwner", "<init>", "(Landroid/content/Context;Lcom/yandex/go/universal_qr_scanner/presentation/d;Lney;Ler7;)V", "Lzy11;", "initClickListeners", "()V", "initLifecycleObserver", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Li021;", "Le230;", "insetsType", "()Le230;", "onAttachedToWindow", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "applyThemeForChildrenByDefault", "()Z", "onDetachedFromWindow", "Lcom/yandex/go/universal_qr_scanner/presentation/d;", "Lney;", "Ler7;", "Lcom/yandex/go/universal_qr_scanner/ui/UniversalQrScannerCameraPreview;", "getCameraPreview", "()Lcom/yandex/go/universal_qr_scanner/ui/UniversalQrScannerCameraPreview;", "cameraPreview", "g021", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UniversalQrScannerModalView extends SlideableBindingModalView<i021> {
    public static final int $stable = 8;
    private final er7 cameraLifecycleOwner;
    private final ney lifecycleObservable;
    private final d presenter;

    public UniversalQrScannerModalView(Context context, d dVar, ney neyVar, er7 er7Var) {
        super(context);
        this.presenter = dVar;
        this.lifecycleObservable = neyVar;
        this.cameraLifecycleOwner = er7Var;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UniversalQrScannerCameraPreview getCameraPreview() {
        return getBinding().c;
    }

    private final void initClickListeners() {
        ru.yandex.taxi.design.utils.c.z(new UniversalQrScannerModalView$initClickListeners$1(0, this.presenter, d.class, "onTorchButtonClicked", "onTorchButtonClicked()V", 0), getBinding().g);
        ru.yandex.taxi.design.utils.c.z(new UniversalQrScannerModalView$initClickListeners$2(0, this.presenter, d.class, "onBackButtonClicked", "onBackButtonClicked()V", 0), getBinding().b);
    }

    private final void initLifecycleObserver() {
        this.lifecycleObservable.a(new a(this), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(UniversalQrScannerModalView universalQrScannerModalView, t1w t1wVar) {
        GoFrameLayout goFrameLayout = universalQrScannerModalView.getBinding().e;
        ViewGroup.LayoutParams layoutParams = goFrameLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, t1wVar.b, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        goFrameLayout.setLayoutParams(marginLayoutParams);
        GoFrameLayout goFrameLayout2 = universalQrScannerModalView.getBinding().d;
        ViewGroup.LayoutParams layoutParams2 = goFrameLayout2.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, t1wVar.d);
        goFrameLayout2.setLayoutParams(marginLayoutParams2);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public i021 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(jlh0.universal_qr_scanner_modal_view, parent, false);
        int i = z8h0.back_button;
        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
        if (goImageView != null) {
            i = z8h0.camera_preview;
            UniversalQrScannerCameraPreview universalQrScannerCameraPreview = (UniversalQrScannerCameraPreview) cma1.O(i, inflate);
            if (universalQrScannerCameraPreview != null) {
                i = z8h0.footer;
                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                if (goFrameLayout != null) {
                    i = z8h0.header;
                    GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i, inflate);
                    if (goFrameLayout2 != null) {
                        i = z8h0.title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            i = z8h0.torch_button;
                            GoImageView goImageView2 = (GoImageView) cma1.O(i, inflate);
                            if (goImageView2 != null && (O = cma1.O((i = z8h0.universal_qr_scanner_camera_permission_screen), inflate)) != null) {
                                int i2 = z8h0.settings_button;
                                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, O);
                                if (buttonComponent != null) {
                                    i2 = z8h0.subtitle;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, O);
                                    if (robotoTextView2 != null) {
                                        i2 = z8h0.title;
                                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i2, O);
                                        if (robotoTextView3 != null) {
                                            return new i021((GoFrameLayout) inflate, goImageView, universalQrScannerCameraPreview, goFrameLayout, goFrameLayout2, robotoTextView, goImageView2, new y1y((GoLinearLayout) O, buttonComponent, robotoTextView2, robotoTextView3));
                                        }
                                    }
                                }
                                ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                                return null;
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
        return new w130(1, new wx11(2, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        d dVar = this.presenter;
        g021 g021Var = new g021(this);
        dVar.Bg(g021Var);
        tje.N(dVar.Jg(), null, null, new UniversalQrScannerPresenter$attachView$$inlined$collectIn$1(new c(new jqr(new mth(new j0(null, dVar.C.a(), new UniversalQrScannerPresenter$attachView$$inlined$withPreviousEmit$1(3, null)), 6), new UniversalQrScannerPresenter$attachView$1(2, dVar, d.class, "sendScreenOpenedAnalytics", "sendScreenOpenedAnalytics(Lcom/yandex/go/coroutines/EmitHolder;)V", 4), 3)), null, g021Var), 3);
        tje.N(dVar.Jg(), null, null, new UniversalQrScannerPresenter$attachView$$inlined$collectIn$2(dVar.H.a, null, dVar), 3);
        tje.N(dVar.Jg(), null, null, new UniversalQrScannerPresenter$attachView$5(dVar, null), 3);
        initClickListeners();
        initLifecycleObserver();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lifecycleObservable.d(this);
        this.presenter.Cg();
        getCameraPreview().detachPreview();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        OneShotPreDrawListener.add(this, new h021(this, w, h, this));
    }
}
