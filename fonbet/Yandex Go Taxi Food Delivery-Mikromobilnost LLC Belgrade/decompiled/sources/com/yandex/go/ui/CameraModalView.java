package com.yandex.go.ui;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.c230;
import defpackage.cma1;
import defpackage.co7;
import defpackage.er7;
import defpackage.ggh0;
import defpackage.gsh0;
import defpackage.i3y;
import defpackage.ks7;
import defpackage.kyh0;
import defpackage.mr7;
import defpackage.ney;
import defpackage.nm7;
import defpackage.noh;
import defpackage.nr7;
import defpackage.ny61;
import defpackage.or7;
import defpackage.pr7;
import defpackage.qp7;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.vb3;
import defpackage.w8v;
import defpackage.xs7;
import defpackage.xw31;
import kotlin.Metadata;
import ru.yandex.taxi.camera.CameraPreview;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BC\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0014¢\u0006\u0004\b'\u0010\u0013J\u000f\u0010(\u001a\u00020\bH\u0014¢\u0006\u0004\b(\u0010\u0013J\u0017\u0010+\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b+\u0010,R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lcom/yandex/go/ui/CameraModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lpr7;", "Lmr7;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lzy11;", "onImageUpload", "Ltse;", "activityScope", "Lney;", "lifecycleObservable", "Lks7;", "presenter", "<init>", "(Landroid/content/Context;Ltls;Ltse;Lney;Lks7;)V", "takeAndShowPreviewPhoto", "()V", "showCamera", "startCamera", "releaseCamera", "Lc230;", "insetsType", "()Lc230;", LaunchBrowserActivity.KEY_URI, "showPreview", "(Landroid/net/Uri;)V", "", "isShowing", "setProgress", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lpr7;", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ltls;", "Ltse;", "Lney;", "Lks7;", "Lru/yandex/taxi/camera/CameraPreview;", "cameraPreview", "Lru/yandex/taxi/camera/CameraPreview;", "Ler7;", "cameraLifecycleOwner", "Ler7;", "Lnoh;", "Li5f0;", "cameraProviderDeferred", "Lnoh;", "Lw8v;", "imageCapture$delegate", "Li3y;", "getImageCapture", "()Lw8v;", "imageCapture", "Lco7;", "camera", "Lco7;", "Lxs7;", "cameraSelector", "Lxs7;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CameraModalView extends SlideableBindingModalView<pr7> implements mr7 {
    private final tse activityScope;
    private co7 camera;
    private final er7 cameraLifecycleOwner;
    private final CameraPreview cameraPreview;
    private final noh cameraProviderDeferred;
    private final xs7 cameraSelector;

    /* renamed from: imageCapture$delegate, reason: from kotlin metadata */
    private final i3y imageCapture;
    private final ney lifecycleObservable;
    private final tls onImageUpload;
    private final ks7 presenter;

    public CameraModalView(Context context, tls tlsVar, tse tseVar, ney neyVar, ks7 ks7Var) {
        super(context);
        this.onImageUpload = tlsVar;
        this.activityScope = tseVar;
        this.lifecycleObservable = neyVar;
        this.presenter = ks7Var;
        this.cameraPreview = getBinding().b;
        this.cameraLifecycleOwner = new er7();
        this.cameraProviderDeferred = ru.yandex.taxi.camera.ml.a.b(context);
        int i = 0;
        this.imageCapture = kotlin.a.a(new nr7(this, i));
        this.cameraSelector = xs7.b;
        setDismissOnTouchOutside(false);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        ToolbarComponent toolbarComponent = getBinding().g;
        toolbarComponent.enableNavigationButton();
        toolbarComponent.setOnNavigationClickListener(new or7(this, i));
        getBinding().e.setDebounceClickListener(new or7(this, 1));
        getBinding().f.setDebounceClickListener(new or7(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w8v getImageCapture() {
        return (w8v) this.imageCapture.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w8v imageCapture_delegate$lambda$0(CameraModalView cameraModalView) {
        return ru.yandex.taxi.camera.ml.a.a(ru.yandex.taxi.camera.ml.a.c(new Size(cameraModalView.getWidth(), cameraModalView.getHeight())), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(CameraModalView cameraModalView) {
        return cameraModalView.getBinding().a;
    }

    private final void releaseCamera() {
        qp7 b;
        co7 co7Var = this.camera;
        if (co7Var != null && (b = co7Var.b()) != null) {
            b.f(false);
        }
        this.cameraLifecycleOwner.a();
        this.cameraPreview.detachPreview();
        ru.yandex.taxi.camera.ml.a.f(this.cameraProviderDeferred);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCamera() {
        setProgress(false);
        cma1.c(getBinding().c).alpha(0.7f).start();
        cma1.L(getBinding().e);
        AppCompatImageButton appCompatImageButton = getBinding().d;
        cma1.b(0.0f, appCompatImageButton).withEndAction(new or7(this, 3));
        getBinding().f.setText(kyh0.camera_view_take_photo_btn);
        getBinding().f.setDebounceClickListener(new or7(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCamera$lambda$0(CameraModalView cameraModalView) {
        cameraModalView.getBinding().d.setImageDrawable(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPreview$lambda$0$0(CameraModalView cameraModalView, Uri uri) {
        cameraModalView.onImageUpload.invoke(uri);
        cameraModalView.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCamera() {
        cma1.J(this.cameraPreview);
        com.yandex.go.coroutines.b.g(this.activityScope, null, null, new CameraModalView$startCamera$1(this, null), 3);
        this.cameraLifecycleOwner.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void takeAndShowPreviewPhoto() {
        ks7 ks7Var = this.presenter;
        w8v imageCapture = getImageCapture();
        ((mr7) ks7Var.Dg()).setProgress(true);
        tje.N(ks7Var.Jg(), null, null, new CameraPresenter$takePhoto$1(ks7Var, imageCapture, null), 3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public pr7 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(gsh0.camera_modal_view, parent, false);
        int i = ggh0.camera_preview;
        CameraPreview cameraPreview = (CameraPreview) cma1.O(i, inflate);
        if (cameraPreview != null) {
            i = ggh0.mask;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) cma1.O(i, inflate);
            if (appCompatImageButton != null) {
                i = ggh0.photo_preview;
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) cma1.O(i, inflate);
                if (appCompatImageButton2 != null) {
                    i = ggh0.retake_photo_btn;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent != null) {
                        i = ggh0.take_photo_btn;
                        ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent2 != null) {
                            i = ggh0.toolbar_modal_view_toolbar;
                            ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
                            if (toolbarComponent != null) {
                                return new pr7((ConstraintLayout) inflate, cameraPreview, appCompatImageButton, appCompatImageButton2, buttonComponent, buttonComponent2, toolbarComponent);
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
    public c230 insetsType() {
        return new c230(0, new nr7(this, 1), true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(this);
        this.lifecycleObservable.a(new vb3(2, this), this);
        requestApplyInsets();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        this.lifecycleObservable.d(this);
        releaseCamera();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // defpackage.mr7
    public void setProgress(boolean isShowing) {
        pr7 binding = getBinding();
        binding.f.setProgressing(isShowing);
        boolean z = !isShowing;
        binding.f.setClickable(z);
        ButtonComponent buttonComponent = binding.e;
        buttonComponent.setProgressing(isShowing);
        buttonComponent.setClickable(z);
    }

    @Override // defpackage.mr7
    public void showPreview(Uri uri) {
        pr7 binding = getBinding();
        cma1.c(binding.c).alpha(0.9f).start();
        AppCompatImageButton appCompatImageButton = binding.d;
        appCompatImageButton.setImageURI(uri);
        View[] viewArr = {binding.e, appCompatImageButton};
        for (int i = 0; i < 2; i++) {
            cma1.J(viewArr[i]);
        }
        ButtonComponent buttonComponent = binding.f;
        buttonComponent.setText(kyh0.camera_view_upload);
        buttonComponent.setDebounceClickListener(new nm7(7, this, uri));
    }
}
