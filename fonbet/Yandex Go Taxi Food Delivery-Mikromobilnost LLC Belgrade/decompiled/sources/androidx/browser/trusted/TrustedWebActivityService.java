package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.core.app.s0;
import defpackage.hi11;
import defpackage.jnz0;
import defpackage.mi11;
import defpackage.ny61;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public abstract class TrustedWebActivityService extends Service {
    public static final String ACTION_TRUSTED_WEB_ACTIVITY_SERVICE = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
    public static final String KEY_SMALL_ICON_BITMAP = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
    public static final String KEY_SUCCESS = "androidx.browser.trusted.SUCCESS";
    public static final String META_DATA_NAME_SMALL_ICON = "android.support.customtabs.trusted.SMALL_ICON";
    public static final int SMALL_ICON_NOT_SET = -1;
    private NotificationManager mNotificationManager;
    int mVerifiedUid = -1;
    private final ITrustedWebActivityService.Stub mBinder = new ITrustedWebActivityService.Stub() { // from class: androidx.browser.trusted.TrustedWebActivityService.1
        private void checkCaller() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            int i = trustedWebActivityService.mVerifiedUid;
            if (i == -1) {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                TrustedWebActivityService.this.getTokenStore();
                throw null;
            }
            if (i == Binder.getCallingUid()) {
                return;
            }
            ny61.z("Caller is not verified as Trusted Web Activity provider.");
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService.Stub, android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle areNotificationsEnabled(Bundle bundle) {
            checkCaller();
            mi11.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            boolean onAreNotificationsEnabled = TrustedWebActivityService.this.onAreNotificationsEnabled(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", onAreNotificationsEnabled);
            return bundle2;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService.Stub, android.support.customtabs.trusted.ITrustedWebActivityService
        public void cancelNotification(Bundle bundle) {
            checkCaller();
            mi11.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            mi11.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            TrustedWebActivityService.this.onCancelNotification(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService.Stub, android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
            checkCaller();
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            ITrustedWebActivityCallback asInterface = iBinder == null ? null : ITrustedWebActivityCallback.Stub.asInterface(iBinder);
            return trustedWebActivityService.onExtraCommand(str, bundle, asInterface != null ? new hi11(asInterface) : null);
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService.Stub, android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getActiveNotifications() {
            checkCaller();
            Parcelable[] onGetActiveNotifications = TrustedWebActivityService.this.onGetActiveNotifications();
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", onGetActiveNotifications);
            return bundle;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService.Stub, android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getSmallIconBitmap() {
            checkCaller();
            return TrustedWebActivityService.this.onGetSmallIconBitmap();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService.Stub, android.support.customtabs.trusted.ITrustedWebActivityService
        public int getSmallIconId() {
            checkCaller();
            return TrustedWebActivityService.this.onGetSmallIconId();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService.Stub, android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle notifyNotificationWithChannel(Bundle bundle) {
            checkCaller();
            mi11.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            mi11.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            mi11.a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            mi11.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            boolean onNotifyNotificationWithChannel = TrustedWebActivityService.this.onNotifyNotificationWithChannel(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", onNotifyNotificationWithChannel);
            return bundle2;
        }
    };

    private static String channelNameToId(String str) {
        return str.toLowerCase(Locale.ROOT).replace(HexString.CHAR_SPACE, '_') + "_channel_id";
    }

    private void ensureOnCreateCalled() {
        if (this.mNotificationManager != null) {
            return;
        }
        ny61.r("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    public abstract jnz0 getTokenStore();

    public boolean onAreNotificationsEnabled(String str) {
        ensureOnCreateCalled();
        if (!new s0(this).b.areNotificationsEnabled()) {
            return false;
        }
        NotificationChannel notificationChannel = this.mNotificationManager.getNotificationChannel(channelNameToId(str));
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.mBinder;
    }

    public void onCancelNotification(String str, int i) {
        ensureOnCreateCalled();
        this.mNotificationManager.cancel(str, i);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mNotificationManager = (NotificationManager) getSystemService("notification");
    }

    public Bundle onExtraCommand(String str, Bundle bundle, hi11 hi11Var) {
        return null;
    }

    public Parcelable[] onGetActiveNotifications() {
        ensureOnCreateCalled();
        return this.mNotificationManager.getActiveNotifications();
    }

    public Bundle onGetSmallIconBitmap() {
        int onGetSmallIconId = onGetSmallIconId();
        Bundle bundle = new Bundle();
        if (onGetSmallIconId == -1) {
            return bundle;
        }
        bundle.putParcelable(KEY_SMALL_ICON_BITMAP, BitmapFactory.decodeResource(getResources(), onGetSmallIconId));
        return bundle;
    }

    public int onGetSmallIconId() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(META_DATA_NAME_SMALL_ICON, -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public boolean onNotifyNotificationWithChannel(String str, int i, Notification notification, String str2) {
        Notification build;
        ensureOnCreateCalled();
        if (!new s0(this).b.areNotificationsEnabled()) {
            return false;
        }
        String channelNameToId = channelNameToId(str2);
        NotificationManager notificationManager = this.mNotificationManager;
        notificationManager.createNotificationChannel(new NotificationChannel(channelNameToId, str2, 3));
        if (notificationManager.getNotificationChannel(channelNameToId).getImportance() == 0) {
            build = null;
        } else {
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(this, notification);
            recoverBuilder.setChannelId(channelNameToId);
            build = recoverBuilder.build();
        }
        NotificationChannel notificationChannel = this.mNotificationManager.getNotificationChannel(channelNameToId);
        if (notificationChannel != null && notificationChannel.getImportance() == 0) {
            return false;
        }
        this.mNotificationManager.notify(str, i, build);
        return true;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.mVerifiedUid = -1;
        return super.onUnbind(intent);
    }
}
