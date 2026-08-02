package defpackage;

import ru.rt.ebs.cryptosdk.presentation.customView.TextType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class inf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TextType.values().length];
        try {
            iArr[TextType.PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextType.PROCESSING_WIDGET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextType.BIOMETRY_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TextType.FAILED_VERIFICATION_PRIMARY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TextType.FAILED_VERIFICATION_SECONDARY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TextType.ACCESS_DENIED_PRIMARY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TextType.ACCESS_DENIED_SECONDARY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TextType.VERIFICATION_ERROR_PRIMARY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TextType.VERIFICATION_ERROR_SECONDARY.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[TextType.VERIFICATION_ATTEMPTS_EXCEEDED_PRIMARY.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[TextType.VERIFICATION_ATTEMPTS_EXCEEDED_SECONDARY.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[TextType.NO_INTERNET_CONNECTION_PRIMARY.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[TextType.NO_INTERNET_CONNECTION_SECONDARY.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[TextType.SUCCESSFUL_VERIFICATION_WIDGET.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        a = iArr;
    }
}
