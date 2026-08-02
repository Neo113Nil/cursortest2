package xsna;

import java.util.concurrent.ExecutorService;

/* compiled from: RLottieController.kt */
/* loaded from: classes5.dex */
public final class zse0 {
    public final String a;
    public final ExecutorService b;
    public final ExecutorService c;
    public final io.reactivex.rxjava3.core.w d;

    public zse0(String str, ExecutorService executorService, ExecutorService executorService2, io.reactivex.rxjava3.core.w wVar) {
        this.a = str;
        this.b = executorService;
        this.c = executorService2;
        this.d = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zse0)) {
            return false;
        }
        zse0 zse0Var = (zse0) obj;
        return epx.f(this.a, zse0Var.a) && epx.f(this.b, zse0Var.b) && epx.f(this.c, zse0Var.c) && epx.f(this.d, zse0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RLottieControllerConfig(cacheDirPath=" + this.a + ", cacheExecutor=" + this.b + ", drawExecutor=" + this.c + ", drawScheduler=" + this.d + ')';
    }
}
