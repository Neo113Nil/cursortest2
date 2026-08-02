package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import xsna.b660.d;

/* compiled from: NetworkTypeObserver.java */
/* loaded from: classes.dex */
public final class b660 {

    @Nullable
    public static b660 f;
    public final Executor a;
    public final CopyOnWriteArrayList<c> b;
    public final Object c;
    public int d;
    public boolean e;

    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes12.dex */
    public static final class a {

        /* compiled from: NetworkTypeObserver.java */
        /* renamed from: xsna.b660$a$a, reason: collision with other inner class name */
        public static final class C2590a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            public final b660 a;

            public C2590a(b660 b660Var) {
                this.a = b660Var;
            }

            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.a.d(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, b660 b660Var) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                C2590a c2590a = new C2590a(b660Var);
                telephonyManager.registerTelephonyCallback(b660Var.a, c2590a);
                telephonyManager.unregisterTelephonyCallback(c2590a);
            } catch (RuntimeException unused) {
                b660Var.d(5);
            }
        }
    }

    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes12.dex */
    public interface b {
        void a(int i);
    }

    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes12.dex */
    public final class c {
        public final WeakReference<b> a;
        public final Executor b;

        public c(b bVar, Executor executor) {
            this.a = new WeakReference<>(bVar);
            this.b = executor;
        }

        public final void a() {
            this.b.execute(new tsk(this, 5));
        }

        public final boolean b() {
            return this.a.get() == null;
        }
    }

    /* compiled from: NetworkTypeObserver.java */
    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            b660.this.a.execute(new cky(1, this, context));
        }
    }

    public b660(final Context context) {
        Executor t = jw5.t();
        this.a = t;
        this.b = new CopyOnWriteArrayList<>();
        this.c = new Object();
        this.d = 0;
        t.execute(new Runnable() { // from class: xsna.a660
            @Override // java.lang.Runnable
            public final void run() {
                IntentFilter a2 = z23.a("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(this.new d(), a2);
            }
        });
    }

    public static synchronized b660 a(Context context) {
        b660 b660Var;
        synchronized (b660.class) {
            try {
                if (f == null) {
                    f = new b660(context);
                }
                b660Var = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b660Var;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(b bVar, Executor executor) {
        boolean z;
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.b;
        Iterator<c> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.b()) {
                copyOnWriteArrayList.remove(next);
            }
        }
        c cVar = new c(bVar, executor);
        synchronized (this.c) {
            this.b.add(cVar);
            z = this.e;
        }
        if (z) {
            cVar.a();
        }
    }

    public final void d(int i) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.b;
        Iterator<c> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.b()) {
                copyOnWriteArrayList.remove(next);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                Iterator<c> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
