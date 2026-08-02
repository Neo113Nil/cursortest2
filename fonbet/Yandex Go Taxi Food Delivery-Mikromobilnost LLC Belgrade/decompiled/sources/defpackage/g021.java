package defpackage;

import androidx.camera.core.g;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.universal_qr_scanner.domain.torch.UniversalQrScannerTorchState;
import com.yandex.go.universal_qr_scanner.presentation.UniversalQrScannerModalView;
import com.yandex.go.universal_qr_scanner.presentation.d;
import com.yandex.go.universal_qr_scanner.ui.UniversalQrScannerCameraPreview;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class g021 implements m021 {
    public final /* synthetic */ UniversalQrScannerModalView a;

    public g021(UniversalQrScannerModalView universalQrScannerModalView) {
        this.a = universalQrScannerModalView;
    }

    @Override // defpackage.m021
    public final void xg(i121 i121Var) {
        i021 binding;
        String string;
        i021 binding2;
        i021 binding3;
        i021 binding4;
        i021 binding5;
        i021 binding6;
        float f;
        UniversalQrScannerCameraPreview cameraPreview;
        i021 binding7;
        d dVar;
        i021 binding8;
        d dVar2;
        i021 binding9;
        UniversalQrScannerModalView universalQrScannerModalView = this.a;
        binding = universalQrScannerModalView.getBinding();
        binding.f.setText(i121Var.a);
        UniversalQrScannerTorchState universalQrScannerTorchState = i121Var.c;
        int i = f021.a[universalQrScannerTorchState.ordinal()];
        if (i == 1) {
            string = universalQrScannerModalView.getResources().getString(kyh0.flashlight_disable);
        } else {
            if (i != 2 && i != 3) {
                w511.b();
                return;
            }
            string = universalQrScannerModalView.getResources().getString(kyh0.flashlight_enable);
        }
        binding2 = universalQrScannerModalView.getBinding();
        binding2.g.setContentDescription(string);
        binding3 = universalQrScannerModalView.getBinding();
        binding3.g.setSelected(universalQrScannerTorchState == UniversalQrScannerTorchState.ENABLED);
        binding4 = universalQrScannerModalView.getBinding();
        binding4.g.setEnabled(universalQrScannerTorchState != UniversalQrScannerTorchState.NOT_AVAILABLE);
        binding5 = universalQrScannerModalView.getBinding();
        GoImageView goImageView = binding5.g;
        binding6 = universalQrScannerModalView.getBinding();
        boolean isEnabled = binding6.g.isEnabled();
        if (isEnabled) {
            f = 1.0f;
        } else {
            if (isEnabled) {
                w511.b();
                return;
            }
            f = 0.5f;
        }
        goImageView.setAlpha(f);
        cameraPreview = universalQrScannerModalView.getCameraPreview();
        cameraPreview.setDefaultQrTargetSize(i121Var.b);
        sz11 sz11Var = i121Var.d;
        if (sz11Var != null) {
            binding7 = universalQrScannerModalView.getBinding();
            y1y y1yVar = binding7.h;
            y1yVar.b.setVisibility(0);
            RobotoTextView robotoTextView = y1yVar.e;
            ButtonComponent buttonComponent = y1yVar.c;
            robotoTextView.setText(sz11Var.a);
            y1yVar.d.setText(sz11Var.b);
            buttonComponent.setText(sz11Var.c);
            dVar = universalQrScannerModalView.presenter;
            buttonComponent.setDebounceClickListener(new bh11(4, dVar));
            return;
        }
        binding8 = universalQrScannerModalView.getBinding();
        y1y y1yVar2 = binding8.h;
        y1yVar2.b.setVisibility(8);
        RobotoTextView robotoTextView2 = y1yVar2.e;
        ButtonComponent buttonComponent2 = y1yVar2.c;
        robotoTextView2.setText((CharSequence) null);
        y1yVar2.d.setText((CharSequence) null);
        buttonComponent2.setText((CharSequence) null);
        buttonComponent2.setDebounceClickListener(null);
        dVar2 = universalQrScannerModalView.presenter;
        binding9 = universalQrScannerModalView.getBinding();
        UniversalQrScannerCameraPreview universalQrScannerCameraPreview = binding9.c;
        wz11 wz11Var = dVar2.F;
        if (wz11Var.c) {
            return;
        }
        universalQrScannerCameraPreview.attachPreview((g) wz11Var.d.getValue());
        wz11Var.c = true;
    }
}
