package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import java.util.Iterator;

/* compiled from: InvalidCredentialsObserverChainCall.kt */
/* loaded from: classes.dex */
public final class jpx<T> extends ara<T> {
    public final kz2 b;

    public jpx(l7r0 l7r0Var, kz2 kz2Var) {
        super(l7r0Var);
        this.b = kz2Var;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) throws Exception {
        return c(zqaVar, 0);
    }

    public final T c(zqa zqaVar, int i) {
        try {
            return (T) this.b.a(zqaVar);
        } catch (VKApiExecutionException e) {
            if (e.V()) {
                if (i < 1) {
                    String d = e.d();
                    String a = i7r0.a(this.a.i().e.getValue());
                    String str = this.a.i().h;
                    boolean f = epx.f(d, a);
                    boolean z = str != null && epx.f(d, str);
                    if (d != null && (!f || z)) {
                        return c(zqaVar, i + 1);
                    }
                }
                d(e);
                synchronized (jpx.class) {
                    try {
                        UserId d2 = d(e);
                        if (e.s() == 3610) {
                            j7r0 j7r0Var = this.a.g;
                            if (j7r0Var != null) {
                                j7r0Var.b(d2, e.g());
                                s3q0 s3q0Var = s3q0.a;
                            }
                        } else {
                            j7r0 j7r0Var2 = this.a.g;
                            if (j7r0Var2 != null) {
                                j7r0Var2.a(e.g(), e.D(), d2, null);
                                s3q0 s3q0Var2 = s3q0.a;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            throw e;
        }
    }

    public final UserId d(VKApiExecutionException vKApiExecutionException) throws VKApiExecutionException {
        T t;
        Iterator<T> it = this.a.i().e.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = (T) null;
                break;
            }
            t = it.next();
            if (epx.f(((h7r0) t).a, vKApiExecutionException.d())) {
                break;
            }
        }
        h7r0 h7r0Var = t;
        UserId userId = h7r0Var != null ? h7r0Var.e : null;
        if (userId == null) {
            throw vKApiExecutionException;
        }
        if (fkq0.c(userId)) {
            return userId;
        }
        throw vKApiExecutionException;
    }
}
