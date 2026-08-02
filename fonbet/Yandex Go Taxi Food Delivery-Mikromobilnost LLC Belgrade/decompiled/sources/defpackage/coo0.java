package defpackage;

import com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class coo0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationStyle.values().length];
        try {
            iArr[ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationStyle.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationStyle.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationStyle.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationPriority.values().length];
        try {
            iArr2[ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationPriority.HIGH.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationPriority.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationPriority.LOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
