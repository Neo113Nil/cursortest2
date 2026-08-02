package defpackage;

import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications.LocalNotificationDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class pe11 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[LocalNotificationDto.TriggersDto.EntryPointsDto.values().length];
        try {
            iArr[LocalNotificationDto.TriggersDto.EntryPointsDto.PULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LocalNotificationDto.TriggersDto.EntryPointsDto.SUMMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[LocalNotificationDto.ContactPolicyDto.TypeDto.values().length];
        try {
            iArr2[LocalNotificationDto.ContactPolicyDto.TypeDto.MINUTES.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[LocalNotificationDto.ContactPolicyDto.TypeDto.HOURS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[LocalNotificationDto.ContactPolicyDto.TypeDto.DAYS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
