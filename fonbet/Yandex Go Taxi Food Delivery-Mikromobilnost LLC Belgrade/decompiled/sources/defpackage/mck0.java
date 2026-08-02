package defpackage;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CoherentRatingSelector;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class mck0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RideCardItemDto$CoherentRatingSelector.DecorationStateType.values().length];
        try {
            iArr[RideCardItemDto$CoherentRatingSelector.DecorationStateType.SELECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardItemDto$CoherentRatingSelector.DecorationStateType.UNSELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RideCardItemDto$CoherentRatingSelector.DecorationStateType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
