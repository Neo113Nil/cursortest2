package androidx.media.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.MediaBrowserCompat$ConnectionCallback;
import android.support.v4.media.e;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.hb10;
import defpackage.ny61;
import defpackage.unr0;
import java.util.List;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes10.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    private static final String TAG = "MediaButtonReceiver";

    public static class MediaButtonConnectionCallback extends MediaBrowserCompat$ConnectionCallback {
        private final Context mContext;
        private final Intent mIntent;
        private e mMediaBrowser;
        private final BroadcastReceiver.PendingResult mPendingResult;

        public MediaButtonConnectionCallback(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.mContext = context;
            this.mIntent = intent;
            this.mPendingResult = pendingResult;
        }

        private void finish() {
            this.mMediaBrowser.a.disconnect();
            this.mPendingResult.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat$ConnectionCallback
        public void onConnected() {
            b bVar = new b(this.mContext, this.mMediaBrowser.a.getSessionToken());
            KeyEvent keyEvent = (KeyEvent) this.mIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null) {
                ny61.g("KeyEvent may not be null");
            } else {
                bVar.a.dispatchMediaButtonEvent(keyEvent);
                finish();
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat$ConnectionCallback
        public void onConnectionFailed() {
            finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat$ConnectionCallback
        public void onConnectionSuspended() {
            finish();
        }

        public void setMediaBrowser(e eVar) {
            this.mMediaBrowser = eVar;
        }
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, ComponentName componentName, long j) {
        int keyCode;
        if (componentName == null || (keyCode = PlaybackStateCompat.toKeyCode(j)) == 0) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, keyCode));
        intent.addFlags(SelfTester_JCP.IMITA);
        return PendingIntent.getBroadcast(context, keyCode, intent, Build.VERSION.SDK_INT >= 31 ? SelfTester_JCP.DECRYPT_CFB : 0);
    }

    public static ComponentName getMediaButtonReceiverComponent(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        queryBroadcastReceivers.size();
        return null;
    }

    private static ComponentName getServiceComponentByAction(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder x = unr0.x("Expected 1 service that handles ", str, ", found ");
        x.append(queryIntentServices.size());
        throw new IllegalStateException(x.toString());
    }

    public static KeyEvent handleIntent(c cVar, Intent intent) {
        return null;
    }

    public void onForegroundServiceStartNotAllowedException(Intent intent, ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        String message;
        StringBuilder sb = new StringBuilder("caught exception when trying to start a foreground service from the background: ");
        message = foregroundServiceStartNotAllowedException.getMessage();
        sb.append(message);
        Log.e(TAG, sb.toString());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName serviceComponentByAction = getServiceComponentByAction(context, "android.intent.action.MEDIA_BUTTON");
        if (serviceComponentByAction != null) {
            intent.setComponent(serviceComponentByAction);
            try {
                context.startForegroundService(intent);
                return;
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT < 31 || !hb10.b(e)) {
                    throw e;
                }
                onForegroundServiceStartNotAllowedException(intent, hb10.a(e));
                return;
            }
        }
        ComponentName serviceComponentByAction2 = getServiceComponentByAction(context, MediaBrowserServiceCompat.SERVICE_INTERFACE);
        if (serviceComponentByAction2 == null) {
            ny61.r("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        MediaButtonConnectionCallback mediaButtonConnectionCallback = new MediaButtonConnectionCallback(applicationContext, intent, goAsync);
        e eVar = new e(applicationContext, serviceComponentByAction2, mediaButtonConnectionCallback);
        mediaButtonConnectionCallback.setMediaBrowser(eVar);
        eVar.a.connect();
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, long j) {
        ComponentName mediaButtonReceiverComponent = getMediaButtonReceiverComponent(context);
        if (mediaButtonReceiverComponent == null) {
            return null;
        }
        return buildMediaButtonPendingIntent(context, mediaButtonReceiverComponent, j);
    }
}
