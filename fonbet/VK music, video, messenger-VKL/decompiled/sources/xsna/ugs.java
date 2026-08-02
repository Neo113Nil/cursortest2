package xsna;

import android.os.SystemClock;
import com.vk.api.internal.exceptions.FrequentMethodCallException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: FrequentMethodCallsDetector.kt */
/* loaded from: classes15.dex */
public final class ugs<T> extends ara<T> {
    public static final long d = TimeUnit.SECONDS.toMillis(2);
    public static final int e = 2;
    public static final Set<com.vk.api.sdk.a> f = tj0.c();
    public static final Object g = new Object();
    public static final HashMap<String, List<jj20>> h = new HashMap<>();
    public final com.vk.api.sdk.a b;
    public final ara<T> c;

    /* JADX WARN: Multi-variable type inference failed */
    public ugs(wy2 wy2Var, com.vk.api.sdk.a aVar, ara<? extends T> araVar) {
        super(wy2Var);
        this.b = aVar;
        this.c = araVar;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        int i;
        if (!f.contains(this.b)) {
            com.vk.api.sdk.a aVar = this.b;
            synchronized (g) {
                try {
                    List<jj20> list = h.get(aVar.c);
                    if (list != null) {
                        long uptimeMillis = SystemClock.uptimeMillis() - d;
                        List<jj20> list2 = list;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            i = 0;
                        } else {
                            i = 0;
                            for (jj20 jj20Var : list2) {
                                if (epx.f(jj20Var.a, aVar) && jj20Var.b > uptimeMillis && (i = i + 1) < 0) {
                                    e43.s();
                                    throw null;
                                }
                            }
                        }
                        if (i > e) {
                            f.add(aVar);
                            com.vk.metrics.eventtracking.b.a.a(new FrequentMethodCallException(aVar, h));
                            enj.r(this.a.a.a, "Api method (" + aVar.c + ") called many times with same arguments!", 0);
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.vk.api.sdk.a aVar2 = this.b;
            synchronized (g) {
                try {
                    HashMap<String, List<jj20>> hashMap = h;
                    String str = aVar2.c;
                    List<jj20> list3 = hashMap.get(str);
                    if (list3 == null) {
                        list3 = new ArrayList<>();
                        hashMap.put(str, list3);
                    }
                    list3.add(new jj20(aVar2, SystemClock.uptimeMillis()));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.c.a(zqaVar);
    }
}
