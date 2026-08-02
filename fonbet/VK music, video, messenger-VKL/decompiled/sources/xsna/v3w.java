package xsna;

import com.vk.log.L;

/* compiled from: ImExperimentCachedModelStorage.kt */
/* loaded from: classes.dex */
public final class v3w<T> {
    public final gzs<String> a;
    public final izs<String, T> b;
    public volatile String c;
    public volatile T d;

    /* JADX WARN: Multi-variable type inference failed */
    public v3w(gzs<String> gzsVar, izs<? super String, ? extends T> izsVar) {
        this.a = gzsVar;
        this.b = izsVar;
    }

    public final T a() {
        T t;
        if (epx.f(this.a.invoke(), this.c)) {
            return this.d;
        }
        synchronized (this) {
            try {
                String invoke = this.a.invoke();
                if (epx.f(invoke, this.c)) {
                    t = this.d;
                } else if (invoke == null) {
                    synchronized (this) {
                        this.c = null;
                        this.d = null;
                        t = null;
                    }
                } else {
                    try {
                        T invoke2 = this.b.invoke(invoke);
                        this.d = invoke2;
                        this.c = invoke;
                        t = invoke2;
                    } catch (Throwable th) {
                        L.j(th, "failed to parse config: ".concat(invoke));
                        synchronized (this) {
                            this.c = null;
                            this.d = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t;
    }
}
