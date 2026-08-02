package defpackage;

import com.yandex.go.taxi.order.details.v1.elements.destination.DetailsCardDestinationStyleInteractor$DestinationState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class j5j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DetailsCardDestinationStyleInteractor$DestinationState.values().length];
        try {
            iArr[DetailsCardDestinationStyleInteractor$DestinationState.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DetailsCardDestinationStyleInteractor$DestinationState.EDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DetailsCardDestinationStyleInteractor$DestinationState.STATIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
