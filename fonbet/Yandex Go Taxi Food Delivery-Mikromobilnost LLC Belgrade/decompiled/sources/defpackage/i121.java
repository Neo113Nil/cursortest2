package defpackage;

import android.graphics.Rect;
import com.yandex.go.universal_qr_scanner.domain.torch.UniversalQrScannerTorchState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class i121 {
    public final String a;
    public final Rect b;
    public final UniversalQrScannerTorchState c;
    public final sz11 d;

    public i121(String str, Rect rect, UniversalQrScannerTorchState universalQrScannerTorchState, sz11 sz11Var) {
        this.a = str;
        this.b = rect;
        this.c = universalQrScannerTorchState;
        this.d = sz11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i121)) {
            return false;
        }
        i121 i121Var = (i121) obj;
        return jl40.l(this.a, i121Var.a) && jl40.l(this.b, i121Var.b) && this.c == i121Var.c && jl40.l(this.d, i121Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        sz11 sz11Var = this.d;
        return hashCode + (sz11Var == null ? 0 : sz11Var.hashCode());
    }

    public final String toString() {
        return "UniversalQrScannerUiState(scanTitle=" + this.a + ", defaultQrFrame=" + this.b + ", torchState=" + this.c + ", cameraPermissionUiState=" + this.d + Extension.C_BRAKE;
    }
}
