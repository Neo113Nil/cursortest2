package defpackage;

import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidMobileServicesClientAdapter$Request$Priority;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class mut {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AndroidMobileServicesClientAdapter$Request$Priority.values().length];
        try {
            iArr[AndroidMobileServicesClientAdapter$Request$Priority.HIGH_ACCURACY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AndroidMobileServicesClientAdapter$Request$Priority.BALANCED_POWER_ACCURACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AndroidMobileServicesClientAdapter$Request$Priority.LOW_POWER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AndroidMobileServicesClientAdapter$Request$Priority.PASSIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
