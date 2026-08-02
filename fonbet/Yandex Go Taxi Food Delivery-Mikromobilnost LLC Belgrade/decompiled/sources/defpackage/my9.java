package defpackage;

import com.yandex.go.chargers.error.api.ChargersErrorUiState$Action;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class my9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersErrorUiState$Action.values().length];
        try {
            iArr[ChargersErrorUiState$Action.CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersErrorUiState$Action.RETRY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChargersErrorUiState$Action.FIND_ANOTHER_STATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChargersErrorUiState$Action.RETURN_TO_PAYMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChargersErrorUiState$Action.SUPPORT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
