package defpackage;

import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsServiceName;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class gsr0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SharingPersonalGoalsServiceName.values().length];
        try {
            iArr[SharingPersonalGoalsServiceName.SCOOTERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharingPersonalGoalsServiceName.CHARGERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SharingPersonalGoalsServiceName.DRIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
