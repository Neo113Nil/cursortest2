package xsna;

import android.os.Handler;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class qn2 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ qn2(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis() - 10000;
                ConcurrentHashMap<String, x6q0> concurrentHashMap = kfs.d;
                Date date = new Date(currentTimeMillis);
                ConcurrentHashMap<String, x6q0> concurrentHashMap2 = kfs.d;
                synchronized (concurrentHashMap2) {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, x6q0> entry : concurrentHashMap2.entrySet()) {
                            if (entry.getValue().b.compareTo(date) < 0) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            ((x6q0) entry2.getValue()).a.clear();
                            kfs.d.remove(entry2.getKey());
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((Handler) com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.e.getValue()).postDelayed(com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.g, 10000L);
                return;
            default:
                dw20 dw20Var = i4a.a;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                i4a.a = null;
                return;
        }
    }
}
