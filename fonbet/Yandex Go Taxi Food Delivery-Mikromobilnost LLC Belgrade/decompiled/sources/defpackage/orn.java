package defpackage;

import com.google.crypto.tink.subtle.EllipticCurves$CurveType;
import com.google.crypto.tink.subtle.EllipticCurves$PointFormatType;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class orn {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EllipticCurves$CurveType.values().length];
        b = iArr;
        try {
            iArr[EllipticCurves$CurveType.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[EllipticCurves$CurveType.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[EllipticCurves$CurveType.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EllipticCurves$PointFormatType.values().length];
        a = iArr2;
        try {
            iArr2[EllipticCurves$PointFormatType.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[EllipticCurves$PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[EllipticCurves$PointFormatType.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
