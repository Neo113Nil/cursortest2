package xsna;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class dd70 {
    public static String d;
    public static d g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes11.dex */
    public static class a {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes11.dex */
    public static class b implements e {
        public final String a;
        public final int b;
        public final Notification c;

        public b(String str, int i, Notification notification) {
            this.a = str;
            this.b = i;
            this.c = notification;
        }

        @Override // xsna.dd70.e
        public final void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.a, this.b, null, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
            sb.append(this.a);
            sb.append(", id:");
            return h5s.c(this.b, ", tag:null]", sb);
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes11.dex */
    public static class c {
        public final ComponentName a;
        public final IBinder b;

        public c(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes11.dex */
    public static class d implements Handler.Callback, ServiceConnection {
        public final Context b;
        public final HashMap d = new HashMap();
        public HashSet e = new HashSet();
        public final Handler c = new Handler(h5s.a("NotificationManagerCompat").getLooper(), this);

        /* compiled from: NotificationManagerCompat.java */
        public static class a {
            public final ComponentName a;
            public INotificationSideChannel c;
            public boolean b = false;
            public final ArrayDeque<e> d = new ArrayDeque<>();
            public int e = 0;

            public a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        public d(Context context) {
            this.b = context;
        }

        public final void a(a aVar) {
            boolean z;
            ComponentName componentName = aVar.a;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
                aVar.d.size();
            }
            ArrayDeque<e> arrayDeque = aVar.d;
            if (arrayDeque.isEmpty()) {
                return;
            }
            if (aVar.b) {
                z = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.b;
                boolean bindService = context.bindService(component, this, 33);
                aVar.b = bindService;
                if (bindService) {
                    aVar.e = 0;
                } else {
                    Objects.toString(componentName);
                    context.unbindService(this);
                }
                z = aVar.b;
            }
            if (!z || aVar.c == null) {
                f(aVar);
                return;
            }
            while (true) {
                e peek = arrayDeque.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        peek.toString();
                    }
                    peek.a(aVar.c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(componentName);
                }
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            f(aVar);
        }

        public final void c(b bVar) {
            this.c.obtainMessage(0, bVar).sendToTarget();
        }

        public final void f(a aVar) {
            ComponentName componentName = aVar.a;
            ArrayDeque<e> arrayDeque = aVar.d;
            Handler handler = this.c;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i = aVar.e + 1;
            aVar.e = i;
            if (i <= 6) {
                handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r4) * 1000);
                return;
            }
            arrayDeque.size();
            Objects.toString(componentName);
            arrayDeque.clear();
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            HashSet hashSet;
            int i = message.what;
            if (i == 0) {
                e eVar = (e) message.obj;
                String string = Settings.Secure.getString(this.b.getContentResolver(), "enabled_notification_listeners");
                synchronized (dd70.c) {
                    if (string != null) {
                        try {
                            if (!string.equals(dd70.d)) {
                                String[] split = string.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1);
                                HashSet hashSet2 = new HashSet(split.length);
                                for (String str : split) {
                                    ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                    if (unflattenFromString != null) {
                                        hashSet2.add(unflattenFromString.getPackageName());
                                    }
                                }
                                dd70.e = hashSet2;
                                dd70.d = string;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    hashSet = dd70.e;
                }
                if (!hashSet.equals(this.e)) {
                    this.e = hashSet;
                    List<ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                        if (!this.d.containsKey(componentName2)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Objects.toString(componentName2);
                            }
                            this.d.put(componentName2, new a(componentName2));
                        }
                    }
                    Iterator it2 = this.d.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        if (!hashSet3.contains(entry.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Objects.toString(entry.getKey());
                            }
                            a aVar = (a) entry.getValue();
                            if (aVar.b) {
                                this.b.unbindService(this);
                                aVar.b = false;
                            }
                            aVar.c = null;
                            it2.remove();
                        }
                    }
                }
                for (a aVar2 : this.d.values()) {
                    aVar2.d.add(eVar);
                    a(aVar2);
                }
            } else if (i == 1) {
                c cVar = (c) message.obj;
                ComponentName componentName3 = cVar.a;
                IBinder iBinder = cVar.b;
                a aVar3 = (a) this.d.get(componentName3);
                if (aVar3 != null) {
                    aVar3.c = INotificationSideChannel.Stub.asInterface(iBinder);
                    aVar3.e = 0;
                    a(aVar3);
                    return true;
                }
            } else if (i == 2) {
                a aVar4 = (a) this.d.get((ComponentName) message.obj);
                if (aVar4 != null) {
                    if (aVar4.b) {
                        this.b.unbindService(this);
                        aVar4.b = false;
                    }
                    aVar4.c = null;
                    return true;
                }
            } else {
                if (i != 3) {
                    return false;
                }
                a aVar5 = (a) this.d.get((ComponentName) message.obj);
                if (aVar5 != null) {
                    a(aVar5);
                    return true;
                }
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes11.dex */
    public interface e {
        void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    public dd70(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(Notification notification, int i) {
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras == null || !extras.getBoolean("android.support.useSideChannel")) {
            this.b.notify(null, i, notification);
            return;
        }
        b bVar = new b(this.a.getPackageName(), i, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new d(this.a.getApplicationContext());
                }
                g.c(bVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.cancel(null, i);
    }
}
