package defpackage;

import ru.rt.ebs.cryptosdk.presentation.customView.ConstraintLayoutType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class bnf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ConstraintLayoutType.values().length];
        try {
            iArr[ConstraintLayoutType.BIOMETRY_INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConstraintLayoutType.FAILED_VERIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ConstraintLayoutType.ACCESS_DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ConstraintLayoutType.VERIFICATION_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ConstraintLayoutType.PROCESSING_WIDGET_DARKENING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ConstraintLayoutType.SUCCESSFUL_VERIFICATION_WIDGET_DARKENING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ConstraintLayoutType.VERIFICATION_ATTEMPTS_EXCEEDED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ConstraintLayoutType.NO_INTERNET_CONNECTION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
