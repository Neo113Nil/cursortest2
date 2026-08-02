package defpackage;

import com.yandex.go.universal_qr_scanner.presentation.UniversalQrScannerModalView;
import com.yandex.go.universal_qr_scanner.presentation.d;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class h021 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ UniversalQrScannerModalView c;

    public h021(UniversalQrScannerModalView universalQrScannerModalView, int i, int i2, UniversalQrScannerModalView universalQrScannerModalView2) {
        this.a = i;
        this.b = i2;
        this.c = universalQrScannerModalView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i021 binding;
        i021 binding2;
        d dVar;
        UniversalQrScannerModalView universalQrScannerModalView = this.c;
        binding = universalQrScannerModalView.getBinding();
        int bottom = binding.e.getBottom();
        binding2 = universalQrScannerModalView.getBinding();
        z021 z021Var = new z021(this.a, this.b, bottom, binding2.d.getTop());
        dVar = universalQrScannerModalView.presenter;
        r0 r0Var = ((a121) dVar.B.c).a;
        r0Var.getClass();
        r0Var.m(null, z021Var);
    }
}
