package defpackage;

import com.yandex.go.taxi.order.details.v1.elements.live_location.DetailsCardLiveLocationUiState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class oqu {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DetailsCardLiveLocationUiState.values().length];
        try {
            iArr[DetailsCardLiveLocationUiState.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DetailsCardLiveLocationUiState.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DetailsCardLiveLocationUiState.UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DetailsCardLiveLocationUiState.GONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
