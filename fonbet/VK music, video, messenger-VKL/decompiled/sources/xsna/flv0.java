package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.vk.core.snackbar.HideReason;
import java.lang.ref.WeakReference;

/* compiled from: VkSnackbarManager.kt */
/* loaded from: classes.dex */
public final class flv0 {
    public static final Object a = new Object();
    public static final Handler b = new Handler(Looper.getMainLooper(), new elv0());
    public static b c;
    public static b d;

    /* compiled from: VkSnackbarManager.kt */
    /* loaded from: classes17.dex */
    public interface a {
        void a(HideReason hideReason);

        void show();
    }

    /* compiled from: VkSnackbarManager.kt */
    /* loaded from: classes17.dex */
    public static final class b {
        public final long a;
        public final WeakReference<a> b;
        public boolean c;

        public b(a aVar, long j) {
            this.a = j;
            this.b = new WeakReference<>(aVar);
        }

        public final WeakReference<a> a() {
            return this.b;
        }

        public final boolean b() {
            return this.c;
        }

        public final long c() {
            return this.a;
        }

        public final boolean d(a aVar) {
            return epx.f(this.b.get(), aVar);
        }

        public final void e(boolean z) {
            this.c = z;
        }
    }

    public static void a(b bVar, HideReason hideReason) {
        WeakReference<a> a2;
        a aVar;
        if (bVar == null || (a2 = bVar.a()) == null || (aVar = a2.get()) == null) {
            return;
        }
        Handler handler = b;
        handler.removeCallbacksAndMessages(aVar);
        ss3 ss3Var = new ss3(26, aVar, hideReason);
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            ss3Var.invoke();
        } else {
            handler.post(new b3m(ss3Var, 8));
        }
    }

    public static void b(a aVar, HideReason hideReason) {
        synchronized (a) {
            try {
                if (c(aVar)) {
                    a(c, hideReason);
                } else {
                    b bVar = d;
                    if (bVar != null ? bVar.d(aVar) : false) {
                        a(d, hideReason);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean c(a aVar) {
        b bVar = c;
        if (bVar != null) {
            return bVar.d(aVar);
        }
        return false;
    }

    public static void d(a aVar) {
        synchronized (a) {
            try {
                if (c(aVar)) {
                    c = null;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(a aVar) {
        synchronized (a) {
            try {
                if (c(aVar)) {
                    h(c);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(a aVar) {
        b bVar;
        synchronized (a) {
            try {
                if (c(aVar) && (bVar = c) != null && !bVar.b()) {
                    b bVar2 = c;
                    if (bVar2 != null) {
                        bVar2.e(true);
                    }
                    b.removeCallbacksAndMessages(c);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g(a aVar) {
        b bVar;
        synchronized (a) {
            try {
                if (c(aVar) && (bVar = c) != null && bVar.b()) {
                    b bVar2 = c;
                    if (bVar2 != null) {
                        bVar2.e(false);
                    }
                    h(c);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void h(b bVar) {
        Handler handler = b;
        handler.removeCallbacksAndMessages(bVar);
        long c2 = bVar != null ? bVar.c() : 4000L;
        if (c2 != -1) {
            handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), c2);
        }
    }

    public static void i(a aVar, long j) {
        a aVar2;
        synchronized (a) {
            try {
                if (c(aVar)) {
                    b.removeCallbacksAndMessages(c);
                    h(c);
                } else {
                    d = new b(aVar, j);
                    a(c, HideReason.Consecutive);
                    c = null;
                    b bVar = d;
                    if (bVar != null) {
                        c = bVar;
                        d = null;
                        WeakReference<a> a2 = bVar.a();
                        if (a2 == null || (aVar2 = a2.get()) == null) {
                            c = null;
                        } else {
                            glv0 glv0Var = new glv0(aVar2);
                            if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                                glv0Var.invoke();
                            } else {
                                b.post(new b3m(glv0Var, 8));
                            }
                        }
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
