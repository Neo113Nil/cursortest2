package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupLogoResultStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class k04 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AutoTopupLogoResultStatus.values().length];
        try {
            iArr[AutoTopupLogoResultStatus.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoTopupLogoResultStatus.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AutoTopupLogoResultStatus.PROCESSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AutoTopupLogoResultStatus.TIMEOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AutoTopupLogoResultStatus.HIDDEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AutoTopupLogoResultStatus.BIG_LOGO_PROCESSING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
