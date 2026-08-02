package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: AnonymousTokenRefresher.kt */
/* loaded from: classes.dex */
public final class zu2 {
    public final l7r0 a;

    /* compiled from: AnonymousTokenRefresher.kt */
    public static final class a extends Exception {
        public a(String str) {
            super("Refresh anonymous token need legacy fallback: ".concat(str));
        }
    }

    public zu2(l7r0 l7r0Var) {
        this.a = l7r0Var;
    }

    public static /* synthetic */ void e(zu2 zu2Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        zu2Var.d(z, null);
    }

    public final l6r0 a() {
        return this.a.a.C.getValue();
    }

    public final void b() {
        if (a() != null) {
            l6r0 a2 = a();
            String token = a2 != null ? a2.getToken() : null;
            if (token == null || token.length() == 0) {
                e(this, false, 3);
            }
        }
    }

    public final void c(boolean z, VKApiExecutionException vKApiExecutionException) {
        try {
            String str = (String) this.a.e(new npt(z, vKApiExecutionException));
            if (str == null || str.length() == 0) {
                throw new a("GetAnonymousTokenApiCommand return null or empty!");
            }
            l6r0 a2 = a();
            if (a2 != null) {
                a2.a(str);
            }
            a();
        } catch (a e) {
            throw e;
        } catch (Exception e2) {
            throw new a(String.valueOf(e2.getMessage()));
        }
    }

    public final void d(boolean z, VKApiExecutionException vKApiExecutionException) {
        l7r0 l7r0Var = this.a;
        ReentrantLock reentrantLock = l7r0Var.c.a;
        try {
            if (reentrantLock.tryLock()) {
                try {
                    c(z, vKApiExecutionException);
                } catch (a unused) {
                    try {
                        String str = (String) l7r0Var.e(new av2(z, l7r0Var, vKApiExecutionException));
                        if (str != null && str.length() != 0) {
                            l6r0 a2 = a();
                            if (a2 != null) {
                                a2.a(str);
                            }
                            a();
                        }
                        throw vKApiExecutionException;
                    } catch (Exception unused2) {
                        if (vKApiExecutionException != null) {
                            throw vKApiExecutionException;
                        }
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } else {
                reentrantLock.lock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
