package xsna;

import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$VideoSubscribeEvent;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NotificationsSubscriptionsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class kk70 {

    /* compiled from: NotificationsSubscriptionsBottomSheet.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoNotificationsStatus.values().length];
            try {
                iArr[VideoNotificationsStatus.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoNotificationsStatus.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoNotificationsStatus.PREFERRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MobileOfficialAppsGroupsStat$VideoSubscribeEvent.VideoSubscribeEventType a(VideoNotificationsStatus videoNotificationsStatus) {
        int i = a.$EnumSwitchMapping$0[videoNotificationsStatus.ordinal()];
        if (i == 1) {
            return MobileOfficialAppsGroupsStat$VideoSubscribeEvent.VideoSubscribeEventType.SUBSCRIBE_ALL;
        }
        if (i == 2) {
            return MobileOfficialAppsGroupsStat$VideoSubscribeEvent.VideoSubscribeEventType.UNSUBSCRIBE;
        }
        if (i == 3) {
            return MobileOfficialAppsGroupsStat$VideoSubscribeEvent.VideoSubscribeEventType.SUBSCRIBE_RECOM;
        }
        throw new NoWhenBranchMatchedException();
    }
}
