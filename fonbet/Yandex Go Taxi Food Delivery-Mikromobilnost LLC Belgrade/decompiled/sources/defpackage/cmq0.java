package defpackage;

import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class cmq0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SummaryUiState$Type.values().length];
        try {
            iArr[SummaryUiState$Type.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SummaryUiState$Type.TRAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
