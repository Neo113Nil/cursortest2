package xsna;

import com.vk.knet.cornet.CronetHttpLogger$DebugType;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: RequestSemaphore.kt */
/* loaded from: classes.dex */
public final class j8g0 {
    public final int a;
    public final bnk0 b;
    public final LinkedHashMap c = new LinkedHashMap();

    public j8g0(int i, int i2) {
        this.a = i2;
        this.b = new bnk0(new Semaphore(i));
    }

    public static void a(bnk0 bnk0Var, String str, boolean z) {
        if (bnk0Var.a.tryAcquire(60000L, TimeUnit.MILLISECONDS)) {
            return;
        }
        Object[] objArr = {CronetHttpLogger$DebugType.CLIENT_QUEUE, "[cronet] Failed to acquire semaphore(isOverall=" + z + ") in 60000 ms. Semaphore is going to block for " + str};
        qek qekVar = vek.a;
        if (qekVar != null) {
            qekVar.c(Arrays.copyOf(objArr, 2));
        }
        bnk0Var.a.acquire();
    }

    public final synchronized bnk0 b(String str) {
        bnk0 bnk0Var;
        bnk0Var = (bnk0) this.c.get(str);
        if (bnk0Var == null) {
            bnk0Var = new bnk0(new Semaphore(this.a));
            this.c.put(str, bnk0Var);
        }
        return bnk0Var;
    }
}
