package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final /* synthetic */ class bl2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl2 b;

    public /* synthetic */ bl2(cl2 cl2Var, int i) {
        this.a = i;
        this.b = cl2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        cl2 cl2Var = this.b;
        switch (i) {
            case 0:
                AtomicLong atomicLong = cl2Var.d;
                AtomicBoolean atomicBoolean = cl2Var.c;
                long j = 0;
                while (atomicBoolean.get() && !Thread.currentThread().isInterrupted()) {
                    atomicLong.set(0L);
                    cl2Var.e.post(new bl2(cl2Var, 1));
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        Thread.sleep(5000L);
                        if (!atomicBoolean.get()) {
                            break;
                        } else {
                            if (atomicLong.get() == 0) {
                                long currentTimeMillis2 = System.currentTimeMillis();
                                long j2 = currentTimeMillis2 - currentTimeMillis;
                                if (currentTimeMillis2 - j > 30000) {
                                    al2 al2Var = cl2Var.a;
                                    String str = cl2Var.f;
                                    z22 z22Var = al2Var.a;
                                    MapBuilder y = qv10.y("scenario", str);
                                    y.put("duration_ms", String.valueOf(j2));
                                    ((a) z22Var).a(new fyt0("stability_anr_detected", y.j()));
                                    j = currentTimeMillis2;
                                }
                            }
                            Thread.sleep(500L);
                        }
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            default:
                cl2Var.d.set(System.currentTimeMillis());
                break;
        }
    }
}
