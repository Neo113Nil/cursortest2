package ru.mail.libverify.h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import ru.mail.libverify.api.q;
import ru.mail.libverify.h.a;
import ru.mail.libverify.h.b;
import ru.mail.libverify.h.d;
import ru.mail.libverify.h.f;
import ru.mail.libverify.h.g;
import ru.mail.verify.core.utils.FileLog;
import xsna.vuy0;

/* loaded from: classes9.dex */
public final class f {

    @NonNull
    private final Context a;

    @NonNull
    private final q b;

    @NonNull
    private final b c;

    @NonNull
    private final HashMap<d, a> d = new HashMap<>();

    @Nullable
    private Timer e = null;

    public enum a {
        Initial,
        Connected,
        Completed,
        Failed
    }

    public interface b {
        void a(@NonNull c cVar);
    }

    public enum c {
        OK,
        READY_SERVICE_FOUND,
        FAILED_TO_FIND_READY_SERVICE,
        FAILED_TO_FIND_TARGET_SESSION,
        CONNECTION_TIMEOUT_EXPIRED,
        GENERAL_FAILURE
    }

    public class d implements ServiceConnection {

        @Nullable
        private ru.mail.libverify.h.a a;

        @NonNull
        private final ResolveInfo b;

        public /* synthetic */ d(f fVar, ResolveInfo resolveInfo, ru.mail.libverify.h.a aVar, int i) {
            this(resolveInfo, aVar);
        }

        public final synchronized void b() {
            FileLog.v("IpcMessageClient", "unbind service %s", this.b.toString());
            try {
                f.this.a.unbindService(this);
            } catch (Throwable th) {
                FileLog.d("IpcMessageClient", "failed to unbind service %s", th.getMessage());
            }
            a();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, @Nullable IBinder iBinder) {
            if (this.a == null || iBinder == null) {
                FileLog.e("IpcMessageClient", "onServiceConnected connected %s, but connection had been already stopped or binder is null", this.b.toString());
                return;
            }
            FileLog.v("IpcMessageClient", "onServiceConnected connected %s", this.b.toString());
            ru.mail.libverify.h.a aVar = this.a;
            Messenger messenger = new Messenger(iBinder);
            a.InterfaceC2203a interfaceC2203a = new a.InterfaceC2203a() { // from class: ru.mail.libverify.h.h
                @Override // ru.mail.libverify.h.a.InterfaceC2203a
                public final void a(boolean z) {
                    f.d.this.a(z);
                }
            };
            synchronized (aVar) {
                try {
                    if (aVar.b != null) {
                        throw new IllegalStateException("can't call postDataToService twice");
                    }
                    aVar.b = messenger;
                    aVar.a = interfaceC2203a;
                    aVar.d();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            FileLog.v("IpcMessageClient", "onServiceDisconnected disconnected %s", this.b.toString());
            a();
            synchronized (f.this) {
                f.this.d.put(this, a.Failed);
                f.this.a(false);
            }
        }

        private d(ResolveInfo resolveInfo, @NonNull ru.mail.libverify.h.a aVar) {
            this.b = resolveInfo;
            this.a = aVar;
        }

        private synchronized void a() {
            ru.mail.libverify.h.a aVar = this.a;
            if (aVar != null) {
                aVar.a();
                this.a = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z) {
            FileLog.v("IpcMessageClient", "onServiceConnected postDataToService result = %b", Boolean.valueOf(z));
            b();
            synchronized (f.this) {
                try {
                    f.this.d.put(this, z ? a.Completed : a.Failed);
                    f.this.a(false);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public f(@NonNull Context context, @NonNull q qVar, @NonNull b bVar) {
        this.a = context;
        this.b = qVar;
        this.c = bVar;
    }

    public final void a(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        a(new g.a(this.b, str, str2), str3);
    }

    public final void a(@NonNull String str, long j) {
        a(new b.a(this.b, str, j), (String) null);
    }

    public final void b() {
        a(new d.b(this.b, this.a, d.c.STOPPED), (String) null);
    }

    public final void a() {
        a(new d.b(this.b, this.a, d.c.STARTED), (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[Catch: all -> 0x005e, Exception -> 0x0061, TryCatch #1 {Exception -> 0x0061, blocks: (B:6:0x0012, B:8:0x0055, B:12:0x0063, B:13:0x0067, B:15:0x006d, B:17:0x007d, B:25:0x008f, B:27:0x0093, B:28:0x0098, B:30:0x009c, B:31:0x00a5), top: B:5:0x0012, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[Catch: all -> 0x005e, Exception -> 0x0061, TryCatch #1 {Exception -> 0x0061, blocks: (B:6:0x0012, B:8:0x0055, B:12:0x0063, B:13:0x0067, B:15:0x006d, B:17:0x007d, B:25:0x008f, B:27:0x0093, B:28:0x0098, B:30:0x009c, B:31:0x00a5), top: B:5:0x0012, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void a(@NonNull ru.mail.libverify.h.c cVar, @Nullable String str) {
        String packageName;
        boolean isEmpty;
        List<ResolveInfo> queryIntentServices;
        boolean z;
        Timer timer;
        FileLog.v("IpcMessageClient", "connectAndPostData target package = %s", str);
        this.d.clear();
        try {
            Intent intent = new Intent(cVar.a().getName());
            packageName = this.a.getPackageName();
            isEmpty = TextUtils.isEmpty(str);
            queryIntentServices = this.a.getPackageManager().queryIntentServices(intent, 0);
            Collections.sort(queryIntentServices, new vuy0());
            FileLog.d("IpcMessageClient", "connectAndPostData found services count %d", Integer.valueOf(queryIntentServices.size()));
        } catch (Exception e) {
            FileLog.e("IpcMessageClient", "connectAndPostData", e);
            Timer timer2 = this.e;
            if (timer2 != null) {
                timer2.cancel();
                this.e = null;
            }
            FileLog.d("IpcMessageClient", "unbind %d connections", Integer.valueOf(this.d.size()));
            Iterator<d> it = this.d.keySet().iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.c.a(c.GENERAL_FAILURE);
        }
        if (queryIntentServices.isEmpty()) {
            this.c.a(c.FAILED_TO_FIND_READY_SERVICE);
            return;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            boolean equals = TextUtils.equals(packageName, resolveInfo.serviceInfo.packageName);
            if (!isEmpty && !TextUtils.equals(str, resolveInfo.serviceInfo.packageName)) {
                z = false;
                if (!equals && z) {
                    timer = this.e;
                    if (timer != null) {
                        timer.cancel();
                        this.e = null;
                    }
                    if (this.e == null) {
                        this.e = new Timer("IpcMessageClient.connectionTimer");
                    }
                    this.e.schedule(new e(this), 1000L);
                    a(resolveInfo, cVar);
                }
            }
            z = true;
            if (!equals) {
                timer = this.e;
                if (timer != null) {
                }
                if (this.e == null) {
                }
                this.e.schedule(new e(this), 1000L);
                a(resolveInfo, cVar);
            }
        }
        if (this.d.isEmpty()) {
            this.c.a(c.FAILED_TO_FIND_READY_SERVICE);
        } else {
            this.c.a(c.READY_SERVICE_FOUND);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
        return Long.compare(new File(resolveInfo2.serviceInfo.applicationInfo.sourceDir).lastModified(), new File(resolveInfo.serviceInfo.applicationInfo.sourceDir).lastModified());
    }

    private void a(@NonNull ResolveInfo resolveInfo, @NonNull ru.mail.libverify.h.c cVar) {
        FileLog.v("IpcMessageClient", "connectToService try binding to %s", resolveInfo.toString());
        try {
            Intent intent = new Intent();
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            intent.setClassName(serviceInfo.packageName, serviceInfo.name);
            d dVar = new d(this, resolveInfo, cVar.b(), 0);
            if (!this.a.bindService(intent, dVar, 1)) {
                FileLog.e("IpcMessageClient", "connectToService failed to bind to %s", resolveInfo.toString());
            } else {
                this.d.put(dVar, a.Initial);
                FileLog.v("IpcMessageClient", "connectToService bound to %s", resolveInfo.toString());
            }
        } catch (SecurityException e) {
            FileLog.e("IpcMessageClient", e, "connectToService failed to bind to %s", resolveInfo.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.d.isEmpty()) {
            return;
        }
        Iterator<a> it = this.d.values().iterator();
        boolean z2 = true;
        boolean z3 = false;
        while (it.hasNext()) {
            a next = it.next();
            z2 &= next != a.Initial;
            z3 |= next == a.Completed;
        }
        if (z) {
            this.c.a(z3 ? c.OK : c.CONNECTION_TIMEOUT_EXPIRED);
            this.d.clear();
        } else if (z2) {
            if (z3) {
                this.c.a(c.OK);
            } else {
                this.c.a(c.FAILED_TO_FIND_TARGET_SESSION);
            }
            this.d.clear();
        }
    }
}
