package defpackage;

import com.yandex.go.scooters.data.model.ScootersOffersPresentationState$LaunchContext;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class n4o0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersOffersPresentationState$LaunchContext.values().length];
        try {
            iArr[ScootersOffersPresentationState$LaunchContext.ON_CAMERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersOffersPresentationState$LaunchContext.ON_MAP_AFTER_QR_SCAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersOffersPresentationState$LaunchContext.ON_MAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
