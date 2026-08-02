package defpackage;

import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class kcz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LocationRequirementsException.FailureReason.values().length];
        try {
            iArr[LocationRequirementsException.FailureReason.PERMISSION_NOT_GRANTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LocationRequirementsException.FailureReason.LOCATION_SERVICE_NOT_AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
