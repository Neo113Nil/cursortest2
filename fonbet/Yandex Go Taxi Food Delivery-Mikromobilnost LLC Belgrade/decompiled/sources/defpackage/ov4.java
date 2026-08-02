package defpackage;

import com.google.zxing.BarcodeFormat;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class ov4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BarcodeFormat.values().length];
        try {
            iArr[BarcodeFormat.PDF_417.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BarcodeFormat.AZTEC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
