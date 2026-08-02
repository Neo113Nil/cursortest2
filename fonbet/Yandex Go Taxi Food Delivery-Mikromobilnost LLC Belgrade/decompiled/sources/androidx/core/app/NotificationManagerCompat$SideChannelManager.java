package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
class NotificationManagerCompat$SideChannelManager implements Handler.Callback, ServiceConnection {
    private static final int MSG_QUEUE_TASK = 0;
    private static final int MSG_RETRY_LISTENER_QUEUE = 3;
    private static final int MSG_SERVICE_CONNECTED = 1;
    private static final int MSG_SERVICE_DISCONNECTED = 2;
    private final Context mContext;
    private final Handler mHandler;
    private final HandlerThread mHandlerThread;
    private final Map<ComponentName, q0> mRecordMap = new HashMap();
    private Set<String> mCachedEnabledPackages = new HashSet();

    public NotificationManagerCompat$SideChannelManager(Context context) {
        this.mContext = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper(), this);
    }

    private boolean ensureServiceBound(q0 q0Var) {
        boolean z = q0Var.b;
        ComponentName componentName = q0Var.a;
        if (z) {
            return true;
        }
        boolean bindService = this.mContext.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName), this, 33);
        q0Var.b = bindService;
        if (bindService) {
            q0Var.e = 0;
        } else {
            Objects.toString(componentName);
            this.mContext.unbindService(this);
        }
        return q0Var.b;
    }

    private void ensureServiceUnbound(q0 q0Var) {
        if (q0Var.b) {
            this.mContext.unbindService(this);
            q0Var.b = false;
        }
        q0Var.c = null;
    }

    private void handleQueueTask(r0 r0Var) {
        updateListenerMap();
        for (q0 q0Var : this.mRecordMap.values()) {
            q0Var.d.add(r0Var);
            processListenerQueue(q0Var);
        }
    }

    private void handleRetryListenerQueue(ComponentName componentName) {
        q0 q0Var = this.mRecordMap.get(componentName);
        if (q0Var != null) {
            processListenerQueue(q0Var);
        }
    }

    private void handleServiceConnected(ComponentName componentName, IBinder iBinder) {
        q0 q0Var = this.mRecordMap.get(componentName);
        if (q0Var != null) {
            q0Var.c = INotificationSideChannel.Stub.asInterface(iBinder);
            q0Var.e = 0;
            processListenerQueue(q0Var);
        }
    }

    private void handleServiceDisconnected(ComponentName componentName) {
        q0 q0Var = this.mRecordMap.get(componentName);
        if (q0Var != null) {
            ensureServiceUnbound(q0Var);
        }
    }

    private void processListenerQueue(q0 q0Var) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(q0Var.a);
            q0Var.d.size();
        }
        ArrayDeque arrayDeque = q0Var.d;
        ComponentName componentName = q0Var.a;
        ArrayDeque arrayDeque2 = q0Var.d;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (!ensureServiceBound(q0Var) || q0Var.c == null) {
            scheduleListenerRetry(q0Var);
            return;
        }
        while (true) {
            r0 r0Var = (r0) arrayDeque2.peek();
            if (r0Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    r0Var.toString();
                }
                o0 o0Var = (o0) r0Var;
                q0Var.c.notify(o0Var.a, o0Var.b, o0Var.c, o0Var.d);
                arrayDeque2.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException unused2) {
                Objects.toString(componentName);
            }
        }
        if (arrayDeque2.isEmpty()) {
            return;
        }
        scheduleListenerRetry(q0Var);
    }

    private void scheduleListenerRetry(q0 q0Var) {
        Handler handler = this.mHandler;
        ComponentName componentName = q0Var.a;
        ComponentName componentName2 = q0Var.a;
        ArrayDeque arrayDeque = q0Var.d;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = q0Var.e;
        int i2 = i + 1;
        q0Var.e = i2;
        if (i2 > 6) {
            arrayDeque.size();
            Objects.toString(componentName2);
            arrayDeque.clear();
        } else {
            Log.isLoggable("NotifManCompat", 3);
            this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(3, componentName2), (1 << i) * 1000);
        }
    }

    private void updateListenerMap() {
        HashSet hashSet;
        Context context = this.mContext;
        Object obj = s0.c;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (s0.c) {
            if (string != null) {
                try {
                    if (!string.equals(s0.d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        s0.e = hashSet2;
                        s0.d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = s0.e;
        }
        if (hashSet.equals(this.mCachedEnabledPackages)) {
            return;
        }
        this.mCachedEnabledPackages = hashSet;
        List<ResolveInfo> queryIntentServices = this.mContext.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
        HashSet hashSet3 = new HashSet();
        for (ResolveInfo resolveInfo : queryIntentServices) {
            if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                if (resolveInfo.serviceInfo.permission != null) {
                    componentName.toString();
                } else {
                    hashSet3.add(componentName);
                }
            }
        }
        Iterator it = hashSet3.iterator();
        while (it.hasNext()) {
            ComponentName componentName2 = (ComponentName) it.next();
            if (!this.mRecordMap.containsKey(componentName2)) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName2);
                }
                this.mRecordMap.put(componentName2, new q0(componentName2));
            }
        }
        Iterator<Map.Entry<ComponentName, q0>> it2 = this.mRecordMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<ComponentName, q0> next = it2.next();
            if (!hashSet3.contains(next.getKey())) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(next.getKey());
                }
                ensureServiceUnbound(next.getValue());
                it2.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            handleQueueTask((r0) message.obj);
            return true;
        }
        if (i == 1) {
            p0 p0Var = (p0) message.obj;
            handleServiceConnected(p0Var.a, p0Var.b);
            return true;
        }
        if (i == 2) {
            handleServiceDisconnected((ComponentName) message.obj);
            return true;
        }
        if (i != 3) {
            return false;
        }
        handleRetryListenerQueue((ComponentName) message.obj);
        return true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.mHandler.obtainMessage(1, new p0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.mHandler.obtainMessage(2, componentName).sendToTarget();
    }

    public void queueTask(r0 r0Var) {
        this.mHandler.obtainMessage(0, r0Var).sendToTarget();
    }
}
