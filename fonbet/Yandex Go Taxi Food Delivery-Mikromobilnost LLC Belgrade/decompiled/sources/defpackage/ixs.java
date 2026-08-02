package defpackage;

import com.ybsdk.core.transfer.utils.domain.AnalyticsPaymentStatus;
import com.ybsdk.core.transfer.utils.domain.entities.AnalyticsSourceScreen;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ixs {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AnalyticsSourceScreen.values().length];
        try {
            iArr[AnalyticsSourceScreen.TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AnalyticsSourceScreen.TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[AnalyticsPaymentStatus.values().length];
        try {
            iArr2[AnalyticsPaymentStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[AnalyticsPaymentStatus.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AnalyticsPaymentStatus.TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AnalyticsPaymentStatus.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AnalyticsPaymentStatus.ACCEPTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[AnalyticsPaymentStatus.PROCESSING.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
