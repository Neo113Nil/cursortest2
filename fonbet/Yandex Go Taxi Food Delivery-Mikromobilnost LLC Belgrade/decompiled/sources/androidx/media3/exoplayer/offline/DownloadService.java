package androidx.media3.exoplayer.offline;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.IBinder;
import androidx.media3.exoplayer.scheduler.Requirements;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher$DeviceStatusChangeReceiver;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher$NetworkCallback;
import defpackage.d6z;
import defpackage.lk91;
import defpackage.lom0;
import defpackage.p7m;
import defpackage.q7m;
import defpackage.tw21;
import defpackage.u6m;
import defpackage.wqj;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class DownloadService extends Service {
    public static final String ACTION_ADD_DOWNLOAD = "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final String ACTION_INIT = "androidx.media3.exoplayer.downloadService.action.INIT";
    public static final String ACTION_PAUSE_DOWNLOADS = "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final String ACTION_REMOVE_ALL_DOWNLOADS = "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final String ACTION_REMOVE_DOWNLOAD = "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    private static final String ACTION_RESTART = "androidx.media3.exoplayer.downloadService.action.RESTART";
    public static final String ACTION_RESUME_DOWNLOADS = "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final String ACTION_SET_REQUIREMENTS = "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final String ACTION_SET_STOP_REASON = "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final String KEY_CONTENT_ID = "content_id";
    public static final String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final String KEY_FOREGROUND = "foreground";
    public static final String KEY_REQUIREMENTS = "requirements";
    public static final String KEY_STOP_REASON = "stop_reason";
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, p7m> downloadManagerHelpers = new HashMap<>();
    private final int channelDescriptionResourceId;
    private final String channelId;
    private final int channelNameResourceId;
    private p7m downloadManagerHelper;
    private final q7m foregroundNotificationUpdater;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    public DownloadService(int i, long j, String str, int i2, int i3) {
        if (i == 0) {
            this.foregroundNotificationUpdater = null;
            this.channelId = null;
            this.channelNameResourceId = 0;
            this.channelDescriptionResourceId = 0;
            return;
        }
        this.foregroundNotificationUpdater = new q7m(this, i, j);
        this.channelId = str;
        this.channelNameResourceId = i2;
        this.channelDescriptionResourceId = i3;
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i, boolean z) {
        return getIntent(context, cls, ACTION_ADD_DOWNLOAD, z).putExtra(KEY_DOWNLOAD_REQUEST, downloadRequest).putExtra(KEY_STOP_REASON, i);
    }

    public static Intent buildPauseDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_PAUSE_DOWNLOADS, z);
    }

    public static Intent buildRemoveAllDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_REMOVE_ALL_DOWNLOADS, z);
    }

    public static Intent buildRemoveDownloadIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
        return getIntent(context, cls, ACTION_REMOVE_DOWNLOAD, z).putExtra(KEY_CONTENT_ID, str);
    }

    public static Intent buildResumeDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_RESUME_DOWNLOADS, z);
    }

    public static Intent buildSetRequirementsIntent(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z) {
        return getIntent(context, cls, ACTION_SET_REQUIREMENTS, z).putExtra(KEY_REQUIREMENTS, requirements);
    }

    public static Intent buildSetStopReasonIntent(Context context, Class<? extends DownloadService> cls, String str, int i, boolean z) {
        return getIntent(context, cls, ACTION_SET_STOP_REASON, z).putExtra(KEY_CONTENT_ID, str).putExtra(KEY_STOP_REASON, i);
    }

    public static void clearDownloadManagerHelpers() {
        downloadManagerHelpers.clear();
    }

    private static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
        return getIntent(context, cls, str).putExtra("foreground", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isStopped() {
        return this.isStopped;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean needsStartedService(int i) {
        return i == 2 || i == 5 || i == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloadChanged(u6m u6mVar) {
        if (this.foregroundNotificationUpdater != null) {
            boolean needsStartedService = needsStartedService(u6mVar.b);
            q7m q7mVar = this.foregroundNotificationUpdater;
            if (needsStartedService) {
                q7mVar.d = true;
                q7mVar.a();
            } else if (q7mVar.e) {
                q7mVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloadRemoved() {
        q7m q7mVar = this.foregroundNotificationUpdater;
        if (q7mVar == null || !q7mVar.e) {
            return;
        }
        q7mVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloads(List<u6m> list) {
        if (this.foregroundNotificationUpdater != null) {
            for (int i = 0; i < list.size(); i++) {
                if (needsStartedService(list.get(i).b)) {
                    q7m q7mVar = this.foregroundNotificationUpdater;
                    q7mVar.d = true;
                    q7mVar.a();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onIdle() {
        q7m q7mVar = this.foregroundNotificationUpdater;
        if (q7mVar != null) {
            q7mVar.d = false;
            q7mVar.c.removeCallbacksAndMessages(null);
        }
        p7m p7mVar = this.downloadManagerHelper;
        p7mVar.getClass();
        if (p7mVar.b.l) {
            return;
        }
        if (tw21.a >= 28 || !this.taskRemoved) {
            this.isStopped |= stopSelfResult(this.lastStartId);
        } else {
            stopSelf();
            this.isStopped = true;
        }
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, z), z);
    }

    public static void sendPauseDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
        startService(context, buildPauseDownloadsIntent(context, cls, z), z);
    }

    public static void sendRemoveAllDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
        startService(context, buildRemoveAllDownloadsIntent(context, cls, z), z);
    }

    public static void sendRemoveDownload(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
        startService(context, buildRemoveDownloadIntent(context, cls, str, z), z);
    }

    public static void sendResumeDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
        startService(context, buildResumeDownloadsIntent(context, cls, z), z);
    }

    public static void sendSetRequirements(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z) {
        startService(context, buildSetRequirementsIntent(context, cls, requirements, z), z);
    }

    public static void sendSetStopReason(Context context, Class<? extends DownloadService> cls, String str, int i, boolean z) {
        startService(context, buildSetStopReasonIntent(context, cls, str, i, z), z);
    }

    public static void start(Context context, Class<? extends DownloadService> cls) {
        context.startService(getIntent(context, cls, ACTION_INIT));
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
        tw21.i0(context, getIntent(context, cls, ACTION_INIT, true));
    }

    private static void startService(Context context, Intent intent, boolean z) {
        if (z) {
            tw21.i0(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public abstract e getDownloadManager();

    public abstract Notification getForegroundNotification(List<u6m> list, int i);

    public abstract lom0 getScheduler();

    public final void invalidateForegroundNotification() {
        q7m q7mVar = this.foregroundNotificationUpdater;
        if (q7mVar == null || this.isDestroyed || !q7mVar.e) {
            return;
        }
        q7mVar.a();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public void onCreate() {
        String str = this.channelId;
        if (str != null) {
            int i = this.channelNameResourceId;
            int i2 = this.channelDescriptionResourceId;
            if (tw21.a >= 26) {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                notificationManager.getClass();
                NotificationChannel notificationChannel = new NotificationChannel(str, getString(i), 2);
                if (i2 != 0) {
                    notificationChannel.setDescription(getString(i2));
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, p7m> hashMap = downloadManagerHelpers;
        p7m p7mVar = (p7m) hashMap.get(cls);
        if (p7mVar == null) {
            boolean z = this.foregroundNotificationUpdater != null;
            boolean z2 = tw21.a < 31;
            if (z && z2) {
                getScheduler();
            }
            e downloadManager = getDownloadManager();
            downloadManager.c(false);
            p7m p7mVar2 = new p7m(getApplicationContext(), downloadManager, z, cls);
            hashMap.put(cls, p7mVar2);
            p7mVar = p7mVar2;
        }
        this.downloadManagerHelper = p7mVar;
        d6z.x(p7mVar.e == null);
        p7mVar.e = this;
        if (p7mVar.b.g) {
            tw21.o(null).postAtFrontOfQueue(new wqj(7, p7mVar, this));
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.isDestroyed = true;
        p7m p7mVar = this.downloadManagerHelper;
        p7mVar.getClass();
        d6z.x(p7mVar.e == this);
        p7mVar.e = null;
        q7m q7mVar = this.foregroundNotificationUpdater;
        if (q7mVar != null) {
            q7mVar.d = false;
            q7mVar.c.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String str2;
        e eVar;
        DownloadManager$InternalHandler downloadManager$InternalHandler;
        q7m q7mVar;
        this.lastStartId = i2;
        this.taskRemoved = false;
        if (intent != null) {
            str = intent.getAction();
            str2 = intent.getStringExtra(KEY_CONTENT_ID);
            this.startedInForeground |= intent.getBooleanExtra("foreground", false) || ACTION_RESTART.equals(str);
        } else {
            str = null;
            str2 = null;
        }
        if (str == null) {
            str = ACTION_INIT;
        }
        p7m p7mVar = this.downloadManagerHelper;
        p7mVar.getClass();
        eVar = p7mVar.b;
        downloadManager$InternalHandler = eVar.b;
        switch (str) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra(KEY_STOP_REASON)) {
                    lk91.e(TAG, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    int intExtra = intent.getIntExtra(KEY_STOP_REASON, 0);
                    eVar.e++;
                    downloadManager$InternalHandler.obtainMessage(4, intExtra, 0, str2).sendToTarget();
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (str2 != null) {
                    eVar.e++;
                    downloadManager$InternalHandler.obtainMessage(8, str2).sendToTarget();
                    break;
                } else {
                    lk91.e(TAG, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                eVar.c(false);
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                eVar.e++;
                downloadManager$InternalHandler.obtainMessage(9).sendToTarget();
                break;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                DownloadRequest downloadRequest = (DownloadRequest) intent.getParcelableExtra(KEY_DOWNLOAD_REQUEST);
                if (downloadRequest != null) {
                    int intExtra2 = intent.getIntExtra(KEY_STOP_REASON, 0);
                    eVar.e++;
                    downloadManager$InternalHandler.obtainMessage(7, intExtra2, 0, downloadRequest).sendToTarget();
                    break;
                } else {
                    lk91.e(TAG, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                Requirements requirements = (Requirements) intent.getParcelableExtra(KEY_REQUIREMENTS);
                if (requirements != null) {
                    if (!requirements.equals(eVar.n.c)) {
                        androidx.media3.exoplayer.scheduler.b bVar = eVar.n;
                        Context context = bVar.a;
                        RequirementsWatcher$DeviceStatusChangeReceiver requirementsWatcher$DeviceStatusChangeReceiver = bVar.e;
                        requirementsWatcher$DeviceStatusChangeReceiver.getClass();
                        context.unregisterReceiver(requirementsWatcher$DeviceStatusChangeReceiver);
                        bVar.e = null;
                        if (tw21.a >= 24 && bVar.g != null) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            connectivityManager.getClass();
                            RequirementsWatcher$NetworkCallback requirementsWatcher$NetworkCallback = bVar.g;
                            requirementsWatcher$NetworkCallback.getClass();
                            connectivityManager.unregisterNetworkCallback(requirementsWatcher$NetworkCallback);
                            bVar.g = null;
                        }
                        androidx.media3.exoplayer.scheduler.b bVar2 = new androidx.media3.exoplayer.scheduler.b(eVar.a, eVar.c, requirements);
                        eVar.n = bVar2;
                        eVar.b(eVar.n, bVar2.b());
                        break;
                    }
                } else {
                    lk91.e(TAG, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                eVar.c(true);
                break;
            default:
                lk91.e(TAG, "Ignored unrecognized action: ".concat(str));
                break;
        }
        if (tw21.a >= 26 && this.startedInForeground && (q7mVar = this.foregroundNotificationUpdater) != null && !q7mVar.e) {
            q7mVar.a();
        }
        this.isStopped = false;
        if (eVar.f == 0 && eVar.e == 0) {
            onIdle();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.taskRemoved = true;
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i, boolean z) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, i, z), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z) {
        return buildAddDownloadIntent(context, cls, downloadRequest, 0, z);
    }

    public DownloadService(int i, long j) {
        this(i, j, null, 0, 0);
    }

    public DownloadService(int i) {
        this(i, 1000L);
    }
}
