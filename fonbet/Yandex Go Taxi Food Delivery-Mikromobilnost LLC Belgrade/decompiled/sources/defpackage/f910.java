package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultState$WidgetState;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultEntity$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class f910 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Me2MeDebitResultEntity$Status.values().length];
        try {
            iArr[Me2MeDebitResultEntity$Status.PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Me2MeDebitResultEntity$Status.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Me2MeDebitResultEntity$Status.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Me2MeDebitResultEntity$Status.TIMEOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[Me2MeDebitResultState$WidgetState.values().length];
        try {
            iArr2[Me2MeDebitResultState$WidgetState.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Me2MeDebitResultState$WidgetState.ON.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
