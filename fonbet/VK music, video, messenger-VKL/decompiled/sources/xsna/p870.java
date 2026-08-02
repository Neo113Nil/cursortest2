package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: NotificationCenter.java */
/* loaded from: classes.dex */
public final class p870 {
    public static volatile p870 e;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Object b = new Object();
    public final ScheduledExecutorService c;
    public final Set<b> d;

    /* compiled from: NotificationCenter.java */
    /* loaded from: classes17.dex */
    public class a implements Runnable {
        public final /* synthetic */ b b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Object e;

        public a(b bVar, int i, int i2, Object obj) {
            this.b = bVar;
            this.c = i;
            this.d = i2;
            this.e = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (p870.this.b) {
                if (!this.b.e) {
                    try {
                        this.b.c.x0(this.c, this.d, this.e);
                    } catch (Exception e) {
                        com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("Error in listener " + this.b.c, e));
                    }
                }
            }
        }
    }

    /* compiled from: NotificationCenter.java */
    public class b {
        public int a;
        public int b;
        public bd70 c;
        public boolean d;
        public volatile boolean e;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.a == bVar.a && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
        }

        public final String toString() {
            return "OnNotificationListenerContainer{eventType=" + this.a + ", eventId=" + this.b + ", listener=" + this.c + '}';
        }
    }

    public p870() {
        asu0.a.getClass();
        this.c = asu0.o();
        this.d = tj0.c();
    }

    public static p870 f() {
        if (e == null) {
            synchronized (p870.class) {
                try {
                    if (e == null) {
                        e = new p870();
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public final void a(int i, int i2, bd70 bd70Var) {
        if (bd70Var != null) {
            Set<b> set = this.d;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            b bVar = new b();
            bVar.e = false;
            bVar.a = i;
            bVar.b = i2;
            bVar.c = bd70Var;
            bVar.d = z;
            set.add(bVar);
        }
    }

    public final void b(int i, bd70 bd70Var) {
        a(i, Integer.MIN_VALUE, bd70Var);
    }

    public final void c(int i) {
        d(i, Integer.MIN_VALUE, null);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:? -> B:31:0x0083). Please report as a decompilation issue!!! */
    public final <T> void d(int i, int i2, T t) {
        int i3;
        int i4;
        T t2;
        Throwable th;
        Iterator<b> it = this.d.iterator();
        boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
        while (it.hasNext()) {
            b next = it.next();
            if (next == null) {
                it.remove();
            } else if (next.a == i && next.b == i2) {
                synchronized (this.b) {
                    try {
                        if (next.e) {
                            i3 = i;
                            i4 = i2;
                            t2 = t;
                        } else {
                            if (z) {
                                try {
                                    if (next.d) {
                                        try {
                                            next.c.x0(i, i2, t);
                                        } catch (Exception e2) {
                                            com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("Error in listener " + next.c, e2));
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            i3 = i;
                            i4 = i2;
                            t2 = t;
                            try {
                                a aVar = new a(next, i3, i4, t2);
                                if (next.d) {
                                    this.a.post(aVar);
                                } else {
                                    this.c.submit(aVar);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        throw th;
                    }
                }
                i = i3;
                i2 = i4;
                t = t2;
            }
            i3 = i;
            i4 = i2;
            t2 = t;
            i = i3;
            i2 = i4;
            t = t2;
        }
    }

    public final <T> void e(int i, T t) {
        d(i, Integer.MIN_VALUE, t);
    }

    public final void g(bd70 bd70Var) {
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next == null) {
                it.remove();
            } else if (next.c == bd70Var) {
                synchronized (this.b) {
                    it.remove();
                    next.e = true;
                }
            } else {
                continue;
            }
        }
    }
}
