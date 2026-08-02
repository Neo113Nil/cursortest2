package defpackage;

import com.yandex.go.scooters.domain.model.ScootersNotificationType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class n2o0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersNotificationType.values().length];
        try {
            iArr[ScootersNotificationType.SYSTEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersNotificationType.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersNotificationType.IMPORTANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
