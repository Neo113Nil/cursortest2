package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class psj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HubOfferType.values().length];
        try {
            iArr[HubOfferType.TAXI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HubOfferType.NAVIGATOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HubOfferType.PEDESTRIAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[HubOfferType.TRANSPORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[HubOfferType.MULTIMODAL_TAXI_TRANSPORT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[HubOfferType.MULTIMODAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[HubOfferType.SCOOTERS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
