package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat.ConnectionRecord;
import defpackage.ak00;
import defpackage.bb10;
import defpackage.cb10;
import defpackage.db10;
import defpackage.do91;
import defpackage.eb10;
import defpackage.fb10;
import defpackage.g8e;
import defpackage.h2t;
import defpackage.hf10;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.reu;
import defpackage.sa90;
import defpackage.unr0;
import defpackage.w53;
import defpackage.yci0;
import defpackage.yjb1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    private static final float EPSILON = 1.0E-5f;
    public static final String KEY_MEDIA_ITEM = "media_item";
    public static final String KEY_SEARCH_RESULTS = "search_results";
    public static final int RESULT_ERROR = -1;
    static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    public static final int RESULT_OK = 0;
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    ConnectionRecord mCurConnection;
    private cb10 mImpl;
    MediaSessionCompat$Token mSession;
    static final String TAG = "MBServiceCompat";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private final v mServiceBinderImpl = new v(this);
    final ConnectionRecord mConnectionFromFwk = new ConnectionRecord("android.media.session.MediaController", -1, -1, null, null);
    final ArrayList<ConnectionRecord> mPendingConnections = new ArrayList<>();
    final w53 mConnections = new w53();
    final ServiceHandler mHandler = new ServiceHandler(this);

    public class ConnectionRecord implements IBinder.DeathRecipient {
        public final hf10 browserInfo;
        public final fb10 callbacks;
        public final int pid;
        public final String pkg;
        public bb10 root;
        public final Bundle rootHints;
        public final HashMap<String, List<sa90>> subscriptions = new HashMap<>();
        public final int uid;

        public ConnectionRecord(String str, int i, int i2, Bundle bundle, fb10 fb10Var) {
            this.pkg = str;
            this.pid = i;
            this.uid = i2;
            this.browserInfo = new hf10(str, i, i2);
            this.rootHints = bundle;
            this.callbacks = fb10Var;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.mHandler.post(new f(this));
        }
    }

    public static final class ServiceHandler extends Handler {
        private MediaBrowserServiceCompat mService;

        public ServiceHandler(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.mService = mediaBrowserServiceCompat;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = this.mService;
            if (mediaBrowserServiceCompat != null) {
                mediaBrowserServiceCompat.handleMessageInternal(message);
            } else {
                removeCallbacksAndMessages(null);
            }
        }

        public void postOrRun(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void release() {
            this.mService = null;
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(android.support.v4.media.e.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public void addSubscription(String str, ConnectionRecord connectionRecord, IBinder iBinder, Bundle bundle) {
        List<sa90> list = connectionRecord.subscriptions.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (sa90 sa90Var : list) {
            if (iBinder == sa90Var.a && yjb1.b(bundle, (Bundle) sa90Var.b)) {
                return;
            }
        }
        list.add(new sa90(iBinder, bundle));
        connectionRecord.subscriptions.put(str, list);
        performLoadChildren(str, connectionRecord, bundle, null);
        this.mCurConnection = connectionRecord;
        onSubscribe(str, bundle);
        this.mCurConnection = null;
    }

    public List<MediaBrowserCompat$MediaItem> applyOptions(List<MediaBrowserCompat$MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.EMPTY_LIST;
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    public void attachToBaseContext(Context context) {
        attachBaseContext(context);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final Bundle getBrowserRootHints() {
        k kVar = (k) this.mImpl;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = kVar.f;
        ConnectionRecord connectionRecord = mediaBrowserServiceCompat.mCurConnection;
        if (connectionRecord == null) {
            ny61.r("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }
        if (connectionRecord == mediaBrowserServiceCompat.mConnectionFromFwk) {
            return kVar.b.getBrowserRootHints();
        }
        if (connectionRecord.rootHints == null) {
            return null;
        }
        return new Bundle(mediaBrowserServiceCompat.mCurConnection.rootHints);
    }

    public final hf10 getCurrentBrowserInfo() {
        l lVar = (l) this.mImpl;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = lVar.g;
        ConnectionRecord connectionRecord = mediaBrowserServiceCompat.mCurConnection;
        if (connectionRecord != null) {
            return connectionRecord == mediaBrowserServiceCompat.mConnectionFromFwk ? new hf10(lVar.b.getCurrentBrowserInfo()) : connectionRecord.browserInfo;
        }
        ny61.r("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        return null;
    }

    public MediaSessionCompat$Token getSessionToken() {
        return this.mSession;
    }

    public void handleMessageInternal(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                android.support.v4.media.session.c.a(bundle);
                v vVar = this.mServiceBinderImpl;
                String string = data.getString("data_package_name");
                int i = data.getInt("data_calling_pid");
                int i2 = data.getInt("data_calling_uid");
                h2t h2tVar = new h2t(message.replyTo);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = vVar.a;
                if (!mediaBrowserServiceCompat.isValidPackage(string, i2)) {
                    ny61.g(oyr.k(i2, "Package/uid mismatch: uid=", " package=", string));
                    break;
                } else {
                    mediaBrowserServiceCompat.mHandler.postOrRun(new m(i, i2, h2tVar, bundle, vVar, string));
                    break;
                }
            case 2:
                v vVar2 = this.mServiceBinderImpl;
                vVar2.a.mHandler.postOrRun(new n(vVar2, new h2t(message.replyTo)));
                break;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                android.support.v4.media.session.c.a(bundle2);
                v vVar3 = this.mServiceBinderImpl;
                String string2 = data.getString("data_media_item_id");
                IBinder binder = data.getBinder("data_callback_token");
                vVar3.a.mHandler.postOrRun(new o(vVar3, new h2t(message.replyTo), string2, binder, bundle2));
                break;
            case 4:
                v vVar4 = this.mServiceBinderImpl;
                String string3 = data.getString("data_media_item_id");
                IBinder binder2 = data.getBinder("data_callback_token");
                vVar4.a.mHandler.postOrRun(new p(vVar4, new h2t(message.replyTo), string3, binder2));
                break;
            case 5:
                v vVar5 = this.mServiceBinderImpl;
                String string4 = data.getString("data_media_item_id");
                ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                h2t h2tVar2 = new h2t(message.replyTo);
                vVar5.getClass();
                if (!TextUtils.isEmpty(string4) && resultReceiver != null) {
                    vVar5.a.mHandler.postOrRun(new q(vVar5, h2tVar2, string4, resultReceiver));
                    break;
                }
                break;
            case 6:
                Bundle bundle3 = data.getBundle("data_root_hints");
                android.support.v4.media.session.c.a(bundle3);
                v vVar6 = this.mServiceBinderImpl;
                h2t h2tVar3 = new h2t(message.replyTo);
                String string5 = data.getString("data_package_name");
                int i3 = data.getInt("data_calling_pid");
                vVar6.a.mHandler.postOrRun(new r(data.getInt("data_calling_uid"), i3, h2tVar3, bundle3, vVar6, string5));
                break;
            case 7:
                v vVar7 = this.mServiceBinderImpl;
                vVar7.a.mHandler.postOrRun(new s(vVar7, new h2t(message.replyTo)));
                break;
            case 8:
                Bundle bundle4 = data.getBundle("data_search_extras");
                android.support.v4.media.session.c.a(bundle4);
                v vVar8 = this.mServiceBinderImpl;
                String string6 = data.getString("data_search_query");
                ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                h2t h2tVar4 = new h2t(message.replyTo);
                vVar8.getClass();
                if (!TextUtils.isEmpty(string6) && resultReceiver2 != null) {
                    vVar8.a.mHandler.postOrRun(new t(vVar8, h2tVar4, string6, bundle4, resultReceiver2));
                    break;
                }
                break;
            case 9:
                Bundle bundle5 = data.getBundle("data_custom_action_extras");
                android.support.v4.media.session.c.a(bundle5);
                v vVar9 = this.mServiceBinderImpl;
                String string7 = data.getString("data_custom_action");
                ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                h2t h2tVar5 = new h2t(message.replyTo);
                vVar9.getClass();
                if (!TextUtils.isEmpty(string7) && resultReceiver3 != null) {
                    vVar9.a.mHandler.postOrRun(new u(vVar9, h2tVar5, string7, bundle5, resultReceiver3));
                    break;
                }
                break;
            default:
                message.toString();
                break;
        }
    }

    public boolean isValidPackage(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void notifyChildrenChanged(String str, Bundle bundle) {
        if (str == null) {
            ny61.g("parentId cannot be null in notifyChildrenChanged");
            return;
        }
        if (bundle == null) {
            ny61.g("options cannot be null in notifyChildrenChanged");
            return;
        }
        i iVar = (i) this.mImpl;
        iVar.getClass();
        ((k) iVar).b.notifyChildrenChanged(str, bundle);
        iVar.d.mHandler.post(new g(iVar, str, bundle));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return ((i) this.mImpl).b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        final l lVar = new l(this);
        this.mImpl = lVar;
        MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23 mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23 = new MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23(this) { // from class: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi26
            {
                new MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21(this) { // from class: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23
                    {
                        new MediaBrowserService(this) { // from class: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21
                            {
                                attachBaseContext(this);
                            }

                            @Override // android.service.media.MediaBrowserService
                            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                                android.support.v4.media.session.c.a(bundle);
                                i iVar = i.this;
                                Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
                                MediaBrowserServiceCompat mediaBrowserServiceCompat = iVar.d;
                                int i2 = -1;
                                if (bundle2 != null && bundle2.getInt("extra_client_version", 0) != 0) {
                                    bundle2.remove("extra_client_version");
                                    iVar.c = new Messenger(mediaBrowserServiceCompat.mHandler);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putInt("extra_service_version", 2);
                                    bundle3.putBinder("extra_messenger", iVar.c.getBinder());
                                    MediaSessionCompat$Token mediaSessionCompat$Token = mediaBrowserServiceCompat.mSession;
                                    if (mediaSessionCompat$Token != null) {
                                        IMediaSession extraBinder = mediaSessionCompat$Token.getExtraBinder();
                                        bundle3.putBinder("extra_session_binder", extraBinder == null ? null : extraBinder.asBinder());
                                    } else {
                                        iVar.a.add(bundle3);
                                    }
                                    i2 = bundle2.getInt("extra_calling_pid", -1);
                                    bundle2.remove("extra_calling_pid");
                                }
                                mediaBrowserServiceCompat.mCurConnection = iVar.d.new ConnectionRecord(str, i2, i, bundle2, null);
                                mediaBrowserServiceCompat.onGetRoot(str, i, bundle2);
                                mediaBrowserServiceCompat.mCurConnection = null;
                                return null;
                            }

                            @Override // android.service.media.MediaBrowserService
                            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                                i iVar = i.this;
                                reu reuVar = new reu(28, result);
                                iVar.getClass();
                                db10 db10Var = new db10(str, reuVar, 0);
                                MediaBrowserServiceCompat mediaBrowserServiceCompat = iVar.d;
                                mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
                                mediaBrowserServiceCompat.onLoadChildren(str, db10Var);
                                mediaBrowserServiceCompat.mCurConnection = null;
                            }
                        };
                    }

                    @Override // android.service.media.MediaBrowserService
                    public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                        j jVar = j.this;
                        reu reuVar = new reu(28, result);
                        jVar.getClass();
                        db10 db10Var = new db10(str, reuVar, 1);
                        MediaBrowserServiceCompat mediaBrowserServiceCompat = jVar.e;
                        mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
                        mediaBrowserServiceCompat.onLoadItem(str, db10Var);
                        mediaBrowserServiceCompat.mCurConnection = null;
                    }
                };
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                android.support.v4.media.session.c.a(bundle);
                k kVar = k.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = kVar.f;
                MediaBrowserServiceCompat.ConnectionRecord connectionRecord = mediaBrowserServiceCompat.mConnectionFromFwk;
                db10 db10Var = new db10(kVar, str, new reu(28, result), bundle);
                mediaBrowserServiceCompat.mCurConnection = connectionRecord;
                mediaBrowserServiceCompat.onLoadChildren(str, db10Var, bundle);
                mediaBrowserServiceCompat.mCurConnection = null;
                k.this.f.mCurConnection = null;
            }
        };
        lVar.b = mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23;
        mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23.onCreate();
    }

    public void onCustomAction(String str, Bundle bundle, eb10 eb10Var) {
        if (eb10Var.b || eb10Var.c) {
            yci0.t(eb10Var.a, "sendError() called when either sendResult() or sendError() had already been called for: ");
        } else {
            eb10Var.c = true;
            eb10Var.b();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.mHandler.release();
    }

    public abstract bb10 onGetRoot(String str, int i, Bundle bundle);

    public abstract void onLoadChildren(String str, eb10 eb10Var);

    public void onLoadChildren(String str, eb10 eb10Var, Bundle bundle) {
        eb10Var.d = 1;
        onLoadChildren(str, eb10Var);
    }

    public void onLoadItem(String str, eb10 eb10Var) {
        eb10Var.d = 2;
        eb10Var.d();
    }

    public void onSearch(String str, Bundle bundle, eb10 eb10Var) {
        eb10Var.d = 4;
        eb10Var.d();
    }

    public void onSubscribe(String str, Bundle bundle) {
    }

    public void onUnsubscribe(String str) {
    }

    public void performCustomAction(String str, Bundle bundle, ConnectionRecord connectionRecord, ResultReceiver resultReceiver) {
        e eVar = new e(str, resultReceiver);
        this.mCurConnection = connectionRecord;
        onCustomAction(str, bundle, eVar);
        this.mCurConnection = null;
        if (eVar.a()) {
            return;
        }
        ak00.h("onCustomAction must call detach() or sendResult() or sendError() before returning for action=", str, " extras=", bundle);
    }

    public void performLoadChildren(String str, ConnectionRecord connectionRecord, Bundle bundle, Bundle bundle2) {
        b bVar = new b(this, str, connectionRecord, str, bundle, bundle2);
        this.mCurConnection = connectionRecord;
        if (bundle == null) {
            onLoadChildren(str, bVar);
        } else {
            onLoadChildren(str, bVar, bundle);
        }
        this.mCurConnection = null;
        if (bVar.a()) {
            return;
        }
        ny61.r(unr0.r(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), connectionRecord.pkg, " id=", str));
    }

    public void performLoadItem(String str, ConnectionRecord connectionRecord, ResultReceiver resultReceiver) {
        c cVar = new c(str, resultReceiver);
        this.mCurConnection = connectionRecord;
        onLoadItem(str, cVar);
        this.mCurConnection = null;
        if (cVar.a()) {
            return;
        }
        ny61.r(g8e.o("onLoadItem must call detach() or sendResult() before returning for id=", str));
    }

    public void performSearch(String str, Bundle bundle, ConnectionRecord connectionRecord, ResultReceiver resultReceiver) {
        d dVar = new d(str, resultReceiver);
        this.mCurConnection = connectionRecord;
        onSearch(str, bundle, dVar);
        this.mCurConnection = null;
        if (dVar.a()) {
            return;
        }
        ny61.r(g8e.o("onSearch must call detach() or sendResult() before returning for query=", str));
    }

    public boolean removeSubscription(String str, ConnectionRecord connectionRecord, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder != null) {
                List<sa90> list = connectionRecord.subscriptions.get(str);
                if (list != null) {
                    Iterator<sa90> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().a) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (list.size() == 0) {
                        connectionRecord.subscriptions.remove(str);
                    }
                }
            } else if (connectionRecord.subscriptions.remove(str) != null) {
                z = true;
            }
            return z;
        } finally {
            this.mCurConnection = connectionRecord;
            onUnsubscribe(str);
            this.mCurConnection = null;
        }
    }

    public void setSessionToken(MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token == null) {
            ny61.g("Session token may not be null");
            return;
        }
        if (this.mSession != null) {
            ny61.r("The session token has already been set");
            return;
        }
        this.mSession = mediaSessionCompat$Token;
        i iVar = (i) this.mImpl;
        iVar.d.mHandler.postOrRun(new do91((Object) iVar, (Object) mediaSessionCompat$Token, false, 9));
    }

    public void notifyChildrenChanged(String str) {
        if (str != null) {
            i iVar = (i) this.mImpl;
            iVar.getClass();
            ((k) iVar).b.notifyChildrenChanged(str);
            iVar.d.mHandler.post(new g(iVar, str, null));
            return;
        }
        ny61.g("parentId cannot be null in notifyChildrenChanged");
    }

    public void notifyChildrenChanged(hf10 hf10Var, String str, Bundle bundle) {
        if (hf10Var == null) {
            ny61.g("remoteUserInfo cannot be null in notifyChildrenChanged");
            return;
        }
        if (str == null) {
            ny61.g("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            i iVar = (i) this.mImpl;
            iVar.d.mHandler.post(new h(iVar, hf10Var, str, bundle));
        } else {
            ny61.g("options cannot be null in notifyChildrenChanged");
        }
    }
}
