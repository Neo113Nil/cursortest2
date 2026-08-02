package defpackage;

import com.yandex.go.order.tariffs_suggest.mapper.ChangeStatusUiState$Status;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class ob80 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChangeStatusUiState$Status.values().length];
        try {
            iArr[ChangeStatusUiState$Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChangeStatusUiState$Status.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChangeStatusUiState$Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChangeStatusUiState$Status.UNAVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
