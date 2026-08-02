package com.yandex.go.chargers.qr;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.Size;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersQrScanState;
import defpackage.bma;
import defpackage.boa;
import defpackage.co7;
import defpackage.coa;
import defpackage.doa;
import defpackage.jl40;
import defpackage.kj7;
import defpackage.moa;
import defpackage.ooa;
import defpackage.qp7;
import defpackage.roa;
import defpackage.sk7;
import defpackage.soa;
import defpackage.sy9;
import defpackage.tje;
import defpackage.toa;
import defpackage.uoa;
import defpackage.v1h0;
import defpackage.w511;
import defpackage.woa;
import defpackage.zna;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;

/* loaded from: classes12.dex */
public final class b implements moa {
    public final int a;
    public final /* synthetic */ ChargersQrModalView b;

    public b(ChargersQrModalView chargersQrModalView) {
        this.b = chargersQrModalView;
        this.a = tje.u(8, chargersQrModalView.getContext());
    }

    public static final void h(b bVar) {
        ru.yandex.taxi.camera.ml.c cVar;
        coa coaVar;
        ru.yandex.taxi.camera.ml.c cVar2;
        woa binding;
        int i;
        woa binding2;
        int i2;
        woa binding3;
        woa binding4;
        ChargersQrModalView chargersQrModalView = bVar.b;
        cVar = chargersQrModalView.mlCameraController;
        coaVar = chargersQrModalView.chargersQrMlVisionDetectorFactory;
        cVar.d = new com.yandex.go.chargers.qr.ml_detector.a((sk7) ((kj7) ((doa) coaVar).a.a).get(), new ChargersQrModalView$InnerMvpView$startMlDetection$1(1, bVar, b.class, "onQrFound", "onQrFound(Lru/yandex/taxi/qr/QrUriScan;)V", 0));
        cVar2 = chargersQrModalView.mlCameraController;
        binding = chargersQrModalView.getBinding();
        if (binding.b.getWidth() != 0) {
            binding4 = chargersQrModalView.getBinding();
            i = binding4.b.getWidth();
        } else {
            i = 1080;
        }
        binding2 = chargersQrModalView.getBinding();
        if (binding2.b.getHeight() != 0) {
            binding3 = chargersQrModalView.getBinding();
            i2 = binding3.b.getHeight();
        } else {
            i2 = 2080;
        }
        cVar2.b(new Size(i, i2));
    }

    @Override // defpackage.moa
    public final void L(Rect rect) {
        woa binding;
        Runnable runnable;
        Runnable runnable2;
        ChargersQrModalView chargersQrModalView = this.b;
        binding = chargersQrModalView.getBinding();
        ChargersQrCameraPreview chargersQrCameraPreview = binding.b;
        Rect rect2 = new Rect(rect);
        int i = -this.a;
        rect2.set(rect2.left - i, rect2.top - i, rect2.right + i, rect2.bottom + i);
        chargersQrCameraPreview.grabQrRect(rect2);
        runnable = chargersQrModalView.leaveGrabbedQrRectRunnable;
        chargersQrModalView.removeCallbacks(runnable);
        runnable2 = chargersQrModalView.leaveGrabbedQrRectRunnable;
        chargersQrModalView.postDelayed(runnable2, 1000L);
    }

    @Override // defpackage.moa
    public final void M() {
        ru.yandex.taxi.camera.ml.c cVar;
        cVar = this.b.mlCameraController;
        androidx.camera.core.f fVar = cVar.g;
        if (fVar != null) {
            fVar.N((ExecutorService) cVar.h.getValue(), new ru.yandex.taxi.camera.ml.b(cVar));
        }
    }

    @Override // defpackage.moa
    public final void M9(uoa uoaVar) {
        boa boaVar;
        woa binding;
        bma bmaVar;
        ooa ooaVar;
        boa boaVar2;
        zna znaVar;
        bma bmaVar2;
        woa binding2;
        woa binding3;
        boolean l = jl40.l(uoaVar, roa.a);
        ChargersQrModalView chargersQrModalView = this.b;
        if (l) {
            bmaVar2 = chargersQrModalView.permissionsViewBinding;
            bmaVar2.e.setVisibility(8);
            binding2 = chargersQrModalView.getBinding();
            binding2.b.setVisibility(0);
            chargersQrModalView.applyManualOrQrViewState(uoaVar);
            binding3 = chargersQrModalView.getBinding();
            ConstraintLayout constraintLayout = binding3.a;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
                constraintLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.chargers.qr.ChargersQrModalView$InnerMvpView$startCamera$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        b.h(b.this);
                    }
                });
                return;
            } else {
                h(this);
                return;
            }
        }
        if (jl40.l(uoaVar, soa.a)) {
            binding = chargersQrModalView.getBinding();
            binding.b.setActive(false);
            bmaVar = chargersQrModalView.permissionsViewBinding;
            bmaVar.e.setVisibility(0);
            ooaVar = chargersQrModalView.qrPhotoStateBinding;
            ooaVar.d.setVisibility(8);
            boaVar2 = chargersQrModalView.qrManualEnterStateBinding;
            boaVar2.g.setVisibility(8);
            znaVar = chargersQrModalView.chargersQrAnalyticsProxy;
            znaVar.a(ChargersAnalytics$ChargersQrScanState.PermissionRequest);
            return;
        }
        if (!(uoaVar instanceof toa)) {
            w511.b();
            return;
        }
        toa toaVar = (toa) uoaVar;
        int i = toaVar.a;
        chargersQrModalView.numberLength = i;
        chargersQrModalView.validNumberMinLength = Math.min(toaVar.b, i);
        boaVar = chargersQrModalView.qrManualEnterStateBinding;
        boaVar.i.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        chargersQrModalView.applyManualOrQrViewState(toaVar);
    }

    @Override // defpackage.moa
    public final void p0() {
        ru.yandex.taxi.camera.ml.c cVar;
        cVar = this.b.mlCameraController;
        androidx.camera.core.f fVar = cVar.g;
        if (fVar != null) {
            fVar.H();
        }
    }

    @Override // defpackage.moa
    public final void q5(sy9 sy9Var) {
        boa boaVar;
        boa boaVar2;
        Drawable drawable;
        boa boaVar3;
        boa boaVar4;
        boa boaVar5;
        boa boaVar6;
        ChargersQrModalView chargersQrModalView = this.b;
        boaVar = chargersQrModalView.qrManualEnterStateBinding;
        boaVar.i.setEnabled(true);
        boaVar2 = chargersQrModalView.qrManualEnterStateBinding;
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = boaVar2.i;
        drawable = chargersQrModalView.drawable(v1h0.chargers_manual_enter_bg_error);
        keyboardAwareRobotoEditText.setBackground(drawable);
        boaVar3 = chargersQrModalView.qrManualEnterStateBinding;
        boaVar3.i.requestFocus();
        boaVar4 = chargersQrModalView.qrManualEnterStateBinding;
        boaVar4.d.setText(sy9Var.a);
        boaVar5 = chargersQrModalView.qrManualEnterStateBinding;
        boaVar5.d.setVisibility(0);
        boaVar6 = chargersQrModalView.qrManualEnterStateBinding;
        boaVar6.f.finishProgress();
        chargersQrModalView.hasError = true;
    }

    @Override // defpackage.moa
    public final void r8() {
        boa boaVar;
        boa boaVar2;
        boa boaVar3;
        ChargersQrModalView chargersQrModalView = this.b;
        boaVar = chargersQrModalView.qrManualEnterStateBinding;
        boaVar.i.setEnabled(false);
        boaVar2 = chargersQrModalView.qrManualEnterStateBinding;
        boaVar2.f.setEnabled(false);
        boaVar3 = chargersQrModalView.qrManualEnterStateBinding;
        boaVar3.f.startProgress();
    }

    @Override // defpackage.moa
    public final void releaseCamera() {
        ru.yandex.taxi.camera.ml.c cVar;
        ru.yandex.taxi.camera.ml.c cVar2;
        woa binding;
        qp7 b;
        ChargersQrModalView chargersQrModalView = this.b;
        cVar = chargersQrModalView.mlCameraController;
        co7 co7Var = cVar.i;
        if (co7Var != null && (b = co7Var.b()) != null) {
            b.f(false);
        }
        cVar2 = chargersQrModalView.mlCameraController;
        cVar2.a();
        binding = chargersQrModalView.getBinding();
        binding.b.detachPreview();
    }

    @Override // defpackage.moa
    public final void stopCamera() {
        ru.yandex.taxi.camera.ml.c cVar;
        cVar = this.b.mlCameraController;
        cVar.f.c();
    }
}
