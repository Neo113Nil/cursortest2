package defpackage;

import com.yandex.go.rida.bids.state.BidsBoostButtonUiState$BoostStyle;
import com.yandex.go.rida.bids.state.MapDecorationUiState$PulsarType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ip5 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[BidsBoostButtonUiState$BoostStyle.values().length];
        try {
            iArr[BidsBoostButtonUiState$BoostStyle.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BidsBoostButtonUiState$BoostStyle.FORCED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[MapDecorationUiState$PulsarType.values().length];
        try {
            iArr2[MapDecorationUiState$PulsarType.TWO_CIRCLES.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[MapDecorationUiState$PulsarType.WIDE_CIRCLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[MapDecorationUiState$PulsarType.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
