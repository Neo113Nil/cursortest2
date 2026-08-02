package com.ybsdk.core.qr.scanner.ui;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import com.ybsdk.feature.qr.api.QrCameraType;
import com.ybsdk.feature.qr.api.QrScannerPreview;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.i3y;
import defpackage.iq7;
import defpackage.nlm0;
import defpackage.olm0;
import defpackage.pdy;
import defpackage.pey;
import defpackage.t7v;
import defpackage.tls;
import defpackage.tob1;
import defpackage.tpr;
import defpackage.tzt;
import defpackage.vng;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0014¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/ybsdk/core/qr/scanner/ui/InteractorQrScannerView;", "Lcom/ybsdk/feature/qr/api/QrScannerPreview;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lolm0;", "interactorProvider", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILolm0;)V", "Liq7;", "Lzy11;", "init", "(Liq7;)V", "Lkotlin/Function1;", "", "onDecode", "decodeSingle", "(Ltls;)V", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "decodeUri", "(Landroid/net/Uri;Ltls;)V", "Ltpr;", "", "Lxlm0;", "getDecodeFlow", "()Ltpr;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "isOn", "setTorch", "(Z)V", "Lcom/ybsdk/feature/qr/api/QrCameraType;", "cameraType", "()Lcom/ybsdk/feature/qr/api/QrCameraType;", "Lolm0;", "Landroidx/camera/view/PreviewView;", "preview", "Landroidx/camera/view/PreviewView;", "Lnlm0;", "interactor$delegate", "Li3y;", "getInteractor", "()Lnlm0;", "interactor", "Lpdy;", "cameraController", "Lpdy;", "core-qr-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InteractorQrScannerView extends QrScannerPreview {
    private final pdy cameraController;

    /* renamed from: interactor$delegate, reason: from kotlin metadata */
    private final i3y interactor;
    private final olm0 interactorProvider;
    private final PreviewView preview;

    public InteractorQrScannerView(Context context, AttributeSet attributeSet, int i, olm0 olm0Var) {
        super(context, attributeSet, i);
        this.interactorProvider = olm0Var;
        PreviewView previewView = new PreviewView(context);
        previewView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        previewView.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
        addView(previewView);
        this.preview = previewView;
        this.interactor = a.a(new tzt(19, this));
        pdy pdyVar = new pdy(context);
        init(pdyVar);
        pdyVar.q();
        this.cameraController = pdyVar;
    }

    private final nlm0 getInteractor() {
        return (nlm0) this.interactor.getValue();
    }

    private final void init(iq7 iq7Var) {
        Executor mainExecutor = getContext().getMainExecutor();
        t7v e = getInteractor().e();
        iq7Var.getClass();
        tob1.b();
        t7v t7vVar = iq7Var.h;
        if (t7vVar != e || iq7Var.g != mainExecutor) {
            iq7Var.g = mainExecutor;
            iq7Var.h = e;
            iq7Var.i.N(mainExecutor, e);
            iq7Var.n(t7vVar, e);
        }
        this.preview.setController(iq7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nlm0 interactor_delegate$lambda$1(InteractorQrScannerView interactorQrScannerView) {
        return interactorQrScannerView.interactorProvider.c(interactorQrScannerView);
    }

    @Override // com.ybsdk.feature.qr.api.QrScannerPreview
    public QrCameraType cameraType() {
        return getInteractor().c();
    }

    @Override // com.ybsdk.feature.qr.api.QrScannerPreview
    public void decodeSingle(tls onDecode) {
        super.decodeSingle(onDecode);
        getInteractor().d(onDecode);
    }

    @Override // com.ybsdk.feature.qr.api.QrScannerPreview
    public void decodeUri(Uri uri, tls onDecode) {
        super.decodeUri(uri, onDecode);
        getInteractor().b(uri, onDecode);
    }

    @Override // com.ybsdk.feature.qr.api.QrScannerPreview
    public tpr getDecodeFlow() {
        super.getDecodeFlow();
        return getInteractor().a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        reportAction("bind");
        pdy pdyVar = this.cameraController;
        pey o = vng.o(this);
        pdyVar.getClass();
        tob1.b();
        pdyVar.O = o;
        pdyVar.t(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        reportAction("unbind");
        this.cameraController.z();
        super.onDetachedFromWindow();
    }

    @Override // com.ybsdk.feature.qr.api.QrScannerPreview
    public void setTorch(boolean isOn) {
        super.setTorch(isOn);
        this.cameraController.g(isOn);
    }

    public InteractorQrScannerView(Context context, AttributeSet attributeSet, olm0 olm0Var) {
        this(context, attributeSet, 0, olm0Var, 4, null);
    }

    public /* synthetic */ InteractorQrScannerView(Context context, AttributeSet attributeSet, int i, olm0 olm0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, olm0Var);
    }

    public InteractorQrScannerView(Context context, olm0 olm0Var) {
        this(context, null, 0, olm0Var, 6, null);
    }
}
