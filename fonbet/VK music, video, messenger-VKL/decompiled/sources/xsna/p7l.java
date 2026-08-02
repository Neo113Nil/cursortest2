package xsna;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.EnumSet;

/* compiled from: DecodeFormatManager.kt */
/* loaded from: classes5.dex */
public final class p7l {
    public static final BarcodeFormat a;
    public static final EnumSet b;
    public static final EnumSet c;
    public static final EnumSet d;
    public static final EnumSet e;
    public static final EnumSet f;
    public static final EnumSet g;

    static {
        BarcodeFormat barcodeFormat = BarcodeFormat.QR_CODE;
        a = barcodeFormat;
        b = EnumSet.of(BarcodeFormat.AZTEC);
        c = EnumSet.of(BarcodeFormat.DATA_MATRIX);
        EnumSet of = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
        d = of;
        EnumSet of2 = EnumSet.of(BarcodeFormat.UPC_A, BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8, BarcodeFormat.RSS_14, BarcodeFormat.RSS_EXPANDED);
        e = of2;
        f = EnumSet.of(BarcodeFormat.PDF_417);
        g = EnumSet.of(barcodeFormat);
        EnumSet.copyOf((Collection) of2).addAll(of);
    }
}
