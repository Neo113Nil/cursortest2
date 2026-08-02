package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.vk.dto.Push;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.vendor.pushes.proxy.VKPushService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ProxyPushCommandHandler.kt */
/* loaded from: classes6.dex */
public final class mae0 implements bhe0 {
    public final Context a;
    public final String b;
    public dhe0 c;
    public final ArrayList d = new ArrayList();

    /* compiled from: ProxyPushCommandHandler.kt */
    public static abstract class a {

        /* compiled from: ProxyPushCommandHandler.kt */
        /* renamed from: xsna.mae0$a$a, reason: collision with other inner class name */
        public static final class C3330a extends a {
            public static final C3330a a = new C3330a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3330a);
            }

            public final int hashCode() {
                return 1616318396;
            }

            public final String toString() {
                return "DeletedMessages";
            }
        }

        /* compiled from: ProxyPushCommandHandler.kt */
        public static final class b extends a {
            public final String a;
            public final String b;
            public final Push c;

            public b(Push push, String str, String str2) {
                this.a = str;
                this.b = str2;
                this.c = push;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                return "Message(sessionUuid=" + this.a + ", from=" + this.b + ", push=" + this.c + ')';
            }
        }

        /* compiled from: ProxyPushCommandHandler.kt */
        public static final class c extends a {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Token(token="), this.a, ')');
            }
        }
    }

    /* compiled from: ProxyPushCommandHandler.kt */
    public final class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            mae0 mae0Var = mae0.this;
            dhe0 dhe0Var = new dhe0(iBinder);
            synchronized (mae0Var) {
                try {
                    ExecutorService executorService = wum0.a;
                    wum0.a(mae0Var.a, mae0Var.b, "push_service_connected");
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"[push]", "ProxyPushCommandHandler connected to the VKPushService queue size:" + mae0Var.d.size()});
                    }
                    mae0Var.c = dhe0Var;
                    Iterator it = mae0Var.d.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar instanceof a.c) {
                            String str = ((a.c) aVar).a;
                            Bundle bundle = new Bundle();
                            bundle.putString("push_command_name", "new_token");
                            bundle.putString("push_token", str);
                            dhe0Var.a(bundle);
                        } else if (aVar instanceof a.b) {
                            dhe0Var.b(((a.b) aVar).c, ((a.b) aVar).a, ((a.b) aVar).b);
                        } else {
                            if (!(aVar instanceof a.C3330a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("push_command_name", "deleted_messages");
                            dhe0Var.a(bundle2);
                        }
                    }
                    mae0Var.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            mae0 mae0Var = mae0.this;
            synchronized (mae0Var) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"[push]", "ProxyPushCommandHandler disconnected from the VKPushService queue size:" + mae0Var.d.size()});
                }
                mae0Var.c = null;
                mae0Var.d.clear();
            }
        }
    }

    public mae0(Context context, String str) {
        boolean z;
        this.a = context;
        this.b = str;
        final b bVar = new b();
        final Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getPackageName(), VKPushService.class.getCanonicalName()));
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"[push]", "ProxyPushCommandHandler requesting bind to VKPushService"});
        }
        try {
            z = new File(new File(context.getFilesDir(), "push-analytics"), "notif_push_receiving_post").exists();
        } catch (SecurityException unused) {
            z = false;
        }
        if (z) {
            new Handler(this.a.getMainLooper()).post(new Runnable() { // from class: xsna.lae0
                @Override // java.lang.Runnable
                public final void run() {
                    mae0 mae0Var = mae0.this;
                    mae0Var.a.bindService(intent, bVar, 1);
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{"[push]", "ProxyPushCommandHandler start binding to the VKPushService in post"});
                    }
                    synchronized (mae0Var) {
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            });
            return;
        }
        this.a.bindService(intent, bVar, 1);
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"[push]", "ProxyPushCommandHandler start binding to the VKPushService"});
        }
        synchronized (this) {
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.bhe0
    public final synchronized void a(String str) {
        ExecutorService executorService = wum0.a;
        wum0.a(this.a, this.b, "push_on_new_token");
        dhe0 dhe0Var = this.c;
        if (dhe0Var != null) {
            Bundle bundle = new Bundle();
            bundle.putString("push_command_name", "new_token");
            bundle.putString("push_token", str);
            dhe0Var.a(bundle);
        } else {
            this.d.add(new a.c(str));
        }
    }

    @Override // xsna.bhe0
    public final synchronized void b() {
        ExecutorService executorService = wum0.a;
        wum0.a(this.a, this.b, "push_on_deleted");
        L.e("[push]", "ProxyPushCommandHandler on deleted messages");
        dhe0 dhe0Var = this.c;
        if (dhe0Var != null) {
            Bundle bundle = new Bundle();
            bundle.putString("push_command_name", "deleted_messages");
            dhe0Var.a(bundle);
        } else {
            this.d.add(a.C3330a.a);
        }
    }

    @Override // xsna.bhe0
    public final synchronized void c(Push push, String str, String str2) {
        try {
            ExecutorService executorService = wum0.a;
            wum0.a(this.a, this.b, "push_on_message_received");
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"[push]", "ProxyPushCommandHandler message received " + str + ' ' + push.a()});
            }
            dhe0 dhe0Var = this.c;
            if (dhe0Var != null) {
                dhe0Var.b(push, this.b, str);
            } else {
                this.d.add(new a.b(push, this.b, str));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
