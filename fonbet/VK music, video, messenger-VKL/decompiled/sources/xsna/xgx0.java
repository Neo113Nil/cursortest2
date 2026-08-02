package xsna;

import com.vk.api.sdk.utils.log.Logger;
import com.vk.log.L;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: WebLogger.kt */
/* loaded from: classes11.dex */
public final class xgx0 {
    public static final xgx0 a = new xgx0();
    public static final bpn0 b = new bpn0(new d53(12));

    /* compiled from: WebLogger.kt */
    public static final class a implements c {
        public final HashSet a;

        public a(HashSet hashSet) {
            this.a = hashSet;
        }

        @Override // xsna.xgx0.c
        public final void a(int i, String str, Throwable th) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(i, str, th);
            }
        }
    }

    /* compiled from: WebLogger.kt */
    public static final class b implements c {
        public final Logger a;

        public b(Logger logger) {
            this.a = logger;
        }

        @Override // xsna.xgx0.c
        public final void a(int i, String str, Throwable th) {
            Logger logger = this.a;
            if (i == 1) {
                logger.a(Logger.LogLevel.DEBUG, str, th);
                return;
            }
            if (i == 3) {
                logger.a(Logger.LogLevel.WARNING, str, th);
            } else if (i != 4) {
                logger.a(Logger.LogLevel.VERBOSE, str, th);
            } else {
                logger.a(Logger.LogLevel.ERROR, str, th);
            }
        }
    }

    /* compiled from: WebLogger.kt */
    public interface c {
        void a(int i, String str, Throwable th);
    }

    /* compiled from: WebLogger.kt */
    public static final class d implements c {
        @Override // xsna.xgx0.c
        public final void a(int i, String str, Throwable th) {
            String a = p2i0.c.a(str);
            if (i == 1) {
                if (th != null) {
                    L.e(th, a);
                    return;
                } else {
                    L.e(a);
                    return;
                }
            }
            if (i == 3) {
                if (th != null) {
                    L.E(th, a);
                    return;
                } else {
                    L.G(a);
                    return;
                }
            }
            if (i == 4) {
                if (th != null) {
                    L.j(th, a);
                    return;
                } else {
                    L.l(a);
                    return;
                }
            }
            Object[] objArr = {a};
            if (th != null) {
                L.E(th, objArr);
            } else {
                L.A(objArr);
            }
        }
    }

    public static void a(String str) {
        e().a(1, p2i0.c.a(str), null);
    }

    public static void b(String str) {
        e().a(4, p2i0.c.a(str), null);
    }

    public static void c(String str, Throwable th) {
        e().a(4, p2i0.c.a(str), th);
    }

    public static void d(Throwable th) {
        e().a(4, "An error occurred", th);
    }

    public static a e() {
        return (a) b.getValue();
    }

    public static void f(String str) {
        e().a(2, p2i0.c.a(str), null);
    }

    public static void g(String str) {
        e().a(3, p2i0.c.a(str), null);
    }
}
