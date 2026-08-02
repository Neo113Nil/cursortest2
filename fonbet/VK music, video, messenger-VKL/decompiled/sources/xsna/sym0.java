package xsna;

import com.vk.libvideo.bottomsheet.notifications.SubscriptionAction;
import com.vkontakte.android.R;

/* compiled from: NotificationsSubscriptionsBottomSheet.kt */
/* loaded from: classes2.dex */
public abstract class sym0 {
    public final SubscriptionAction a;
    public final int b;
    public final Integer c;
    public final int d;
    public final Integer e;
    public final boolean f;

    /* compiled from: NotificationsSubscriptionsBottomSheet.kt */
    public static final class a extends sym0 {
        public final SubscriptionAction g;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(SubscriptionAction subscriptionAction) {
            super(r1, R.drawable.vk_icon_lego_bell_ring_outline_28, R.string.video_notifications_subscribe_all_enabled, subscriptionAction == r1, 44);
            SubscriptionAction subscriptionAction2 = SubscriptionAction.FULLY_ENABLED_NOTIFICATIONS;
            this.g = subscriptionAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.g == ((a) obj).g;
        }

        public final int hashCode() {
            return this.g.hashCode();
        }

        public final String toString() {
            return "AllNotifications(selectedAction=" + this.g + ')';
        }
    }

    /* compiled from: NotificationsSubscriptionsBottomSheet.kt */
    public static final class b extends sym0 {
        public static final b g = new b(SubscriptionAction.NOTIFICATIONS_PERMISSION, R.drawable.vk_icon_notification_slash_outline_24, R.string.video_notifications_permission_allow_notifications, false, 72);
    }

    /* compiled from: NotificationsSubscriptionsBottomSheet.kt */
    public static final class c extends sym0 {
        public static final c g = new c(SubscriptionAction.HIDE_AUTHOR, R.drawable.vk_icon_hide_outline_28, R.string.video_hide_author, false, 108);
    }

    /* compiled from: NotificationsSubscriptionsBottomSheet.kt */
    public static final class d extends sym0 {
        public final SubscriptionAction g;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(SubscriptionAction subscriptionAction) {
            super(r1, R.drawable.vk_icon_notification_slash_outline_24, R.string.video_notifications_subscribe_disabled, subscriptionAction == r1, 44);
            SubscriptionAction subscriptionAction2 = SubscriptionAction.DISABLED_NOTIFICATIONS;
            this.g = subscriptionAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.g == ((d) obj).g;
        }

        public final int hashCode() {
            return this.g.hashCode();
        }

        public final String toString() {
            return "NoneNotifications(selectedAction=" + this.g + ')';
        }
    }

    /* compiled from: NotificationsSubscriptionsBottomSheet.kt */
    public static final class e extends sym0 {
        public final SubscriptionAction g;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e(SubscriptionAction subscriptionAction) {
            super(r1, R.drawable.vk_icon_notification_outline_24, R.string.video_notifications_subscribe_preferred, subscriptionAction == r1, 44);
            SubscriptionAction subscriptionAction2 = SubscriptionAction.PREFERRED_VIDEOS_NOTIFICATIONS;
            this.g = subscriptionAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.g == ((e) obj).g;
        }

        public final int hashCode() {
            return this.g.hashCode();
        }

        public final String toString() {
            return "PreferredVideoNotifications(selectedAction=" + this.g + ')';
        }
    }

    /* compiled from: NotificationsSubscriptionsBottomSheet.kt */
    public static final class f extends sym0 {
        public static final f g = new f(SubscriptionAction.UNSUBSCRIBE_AUTHOR, R.drawable.vk_icon_minus_square_outline_28, R.string.video_cancel_subscription, false, 108);
    }

    public sym0(SubscriptionAction subscriptionAction, int i, int i2, boolean z, int i3) {
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_link_circle_24);
        Integer valueOf2 = Integer.valueOf(R.string.video_notifications_permission_allow_notifications_subtitle);
        valueOf = (i3 & 4) != 0 ? null : valueOf;
        valueOf2 = (i3 & 32) != 0 ? null : valueOf2;
        z = (i3 & 64) != 0 ? false : z;
        this.a = subscriptionAction;
        this.b = i;
        this.c = valueOf;
        this.d = i2;
        this.e = valueOf2;
        this.f = z;
    }
}
