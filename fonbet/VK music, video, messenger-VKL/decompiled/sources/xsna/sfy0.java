package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class sfy0 extends b920 {
    @Override // xsna.b920
    public final njz0 d(njz0 njz0Var, u6z0 u6z0Var, xla xlaVar) {
        dbz0 dbz0Var;
        rez0 rez0Var = (rez0) njz0Var;
        ArrayList c = rez0Var.c();
        int size = c.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = c.get(i2);
            i2++;
            ((pjz0) obj).h();
        }
        int i3 = u6z0Var.f;
        boolean z = i3 == 0 || i3 == 4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = c.size();
        while (i < size2) {
            Object obj2 = c.get(i);
            i++;
            for (lgz0 lgz0Var : Collections.unmodifiableList(((pjz0) obj2).d)) {
                wty0 wty0Var = lgz0Var.L;
                if (wty0Var != null) {
                    kiw kiwVar = wty0Var.a;
                    kiwVar.c();
                    arrayList.add(kiwVar);
                }
                if (z && (dbz0Var = (dbz0) lgz0Var.v0) != null) {
                    arrayList2.add(new wdz0(dbz0Var, lgz0Var.T));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            o2z0.a(arrayList).g();
        }
        if (!arrayList2.isEmpty()) {
            if (o8z0.b()) {
                gu8.e(null, "AudioLoaderUtils: Method load called from main thread");
                return rez0Var;
            }
            CountDownLatch countDownLatch = new CountDownLatch(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                wdz0 wdz0Var = (wdz0) it.next();
                dbz0 dbz0Var2 = (dbz0) wdz0Var.a;
                String str = dbz0Var2.a;
                hdz0 hdz0Var = new hdz0(dbz0Var2, countDownLatch, wdz0Var, str);
                hcz0 hcz0Var = hcz0.b;
                if (hcz0Var == null) {
                    synchronized (hcz0.class) {
                        try {
                            hcz0Var = hcz0.b;
                            if (hcz0Var == null) {
                                hcz0Var = new hcz0();
                                hcz0.b = hcz0Var;
                            }
                        } finally {
                        }
                    }
                }
                o8z0.a.execute(new vv6(hcz0Var, str, hdz0Var, 3));
            }
            try {
                countDownLatch.await();
                gu8.c(null, "AudioLoaderUtils: success media loading");
                return rez0Var;
            } catch (InterruptedException unused) {
                gu8.c(null, "AudioLoaderUtils: awaiting media files load failed");
            }
        }
        return rez0Var;
    }
}
