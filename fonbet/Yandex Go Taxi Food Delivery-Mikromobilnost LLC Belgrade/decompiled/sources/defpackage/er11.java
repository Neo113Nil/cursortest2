package defpackage;

import com.google.zxing.BarcodeFormat;
import java.util.Map;

/* loaded from: classes11.dex */
public final class er11 implements fc51 {
    public final jan a = new jan();

    @Override // defpackage.fc51
    public final vz5 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat != BarcodeFormat.UPC_A) {
            kbs.f(barcodeFormat, "Can only encode UPC-A, but got ");
            return null;
        }
        return this.a.a(g8e.o("0", str), BarcodeFormat.EAN_13, i, i2, map);
    }
}
