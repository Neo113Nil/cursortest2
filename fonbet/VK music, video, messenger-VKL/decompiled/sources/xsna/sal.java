package xsna;

import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultAsyncExecutor.kt */
/* loaded from: classes.dex */
public final class sal {
    public final String a;
    public final pla b;
    public final HashMap c = new HashMap();
    public final bpn0 d = new bpn0(new m15(this, 2));
    public boolean e;

    public sal(String str, pla plaVar) {
        this.a = str;
        this.b = plaVar;
    }

    public final synchronized ScheduledFuture a(Runnable runnable, String str, long j) {
        js2 js2Var;
        ScheduledExecutorService scheduledExecutorService;
        if (this.e) {
            throw new IllegalStateException("Instance is released");
        }
        js2Var = new js2(2, runnable, this);
        if (str.equals("")) {
            scheduledExecutorService = (ScheduledExecutorService) this.d.getValue();
        } else {
            synchronized (this) {
                try {
                    HashMap hashMap = this.c;
                    Object obj = hashMap.get(str);
                    if (obj == null) {
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ral(new v43(9, this, str)));
                        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                        scheduledThreadPoolExecutor.setKeepAliveTime(30L, TimeUnit.SECONDS);
                        hashMap.put(str, scheduledThreadPoolExecutor);
                        obj = scheduledThreadPoolExecutor;
                    }
                    scheduledExecutorService = (ScheduledExecutorService) obj;
                } finally {
                }
            }
        }
        return scheduledExecutorService.schedule(js2Var, j, TimeUnit.MILLISECONDS);
    }
}
