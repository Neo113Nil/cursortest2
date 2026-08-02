package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.TransferMainAnalyticsInteractor$Companion$LogType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class pj01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransferMainAnalyticsInteractor$Companion$LogType.values().length];
        try {
            iArr[TransferMainAnalyticsInteractor$Companion$LogType.TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferMainAnalyticsInteractor$Companion$LogType.MOBILE_PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferMainAnalyticsInteractor$Companion$LogType.INTERNET_PAYMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransferMainAnalyticsInteractor$Companion$LogType.C2G.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TransferMainAnalyticsInteractor$Companion$LogType.TEMPLATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
