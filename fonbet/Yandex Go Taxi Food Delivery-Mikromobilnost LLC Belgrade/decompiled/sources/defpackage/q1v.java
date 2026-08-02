package defpackage;

import com.yandex.go.zone.dto.objects.TollRoadsAvailability;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class q1v {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TollRoadsAvailability.values().length];
        try {
            iArr[TollRoadsAvailability.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TollRoadsAvailability.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TollRoadsAvailability.ENABLED_IF_ONLY_TOLLS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
