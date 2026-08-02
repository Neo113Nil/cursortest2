package xsna;

import com.vk.libvideo.api.NotificationsPermission;

/* compiled from: NotificationsSubscriptionDelegate.kt */
/* loaded from: classes2.dex */
public final class gk70 {
    public final NotificationsPermission a;

    /* compiled from: NotificationsSubscriptionDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationsPermission.Result.values().length];
            try {
                iArr[NotificationsPermission.Result.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationsPermission.Result.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gk70(NotificationsPermission notificationsPermission) {
        this.a = notificationsPermission;
    }
}
