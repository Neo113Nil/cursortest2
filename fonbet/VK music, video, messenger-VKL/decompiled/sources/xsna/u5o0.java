package xsna;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.e9y0;

/* loaded from: classes13.dex */
public final class u5o0 {
    public static final u5o0 c = new u5o0();
    public final ThreadPoolExecutor a;
    public final e9y0.a b;

    public u5o0() {
        e9y0 e9y0Var = e9y0.b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(e9y0.c, e9y0.d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = threadPoolExecutor;
        this.b = e9y0.b.a;
    }
}
