package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingStatusDto;
import com.vk.internal.api.GsonHolder;

/* compiled from: NotificationSettingsMapper.kt */
/* loaded from: classes5.dex */
public final class og70 {

    /* compiled from: NotificationSettingsMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto.ValueDto.values().length];
            try {
                iArr[NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto.ValueDto.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto.ValueDto.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto.ValueDto.ONLY_BELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto.ValueDto.ONLY_PUSH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final NotificationsNotificationSettingStatusDto a(String str) {
        x9y x9yVar = new x9y();
        x9yVar.o("type", "string");
        x9yVar.o("value", str);
        return (NotificationsNotificationSettingStatusDto) GsonHolder.a().fromJson((b9y) x9yVar, NotificationsNotificationSettingStatusDto.class);
    }
}
