package defpackage;

import com.yandex.go.scooters.ignition.domain.model.ScootersIgnitionOption;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class esn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersIgnitionOption.values().length];
        try {
            iArr[ScootersIgnitionOption.NOTIFICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersIgnitionOption.GEOLOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersIgnitionOption.BLUETOOTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
