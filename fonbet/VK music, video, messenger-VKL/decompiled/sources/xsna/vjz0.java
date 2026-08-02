package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import xsna.niz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class vjz0 {
    public final ArrayList a;

    public vjz0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void a() {
        if (o8z0.b()) {
            gu8.e(null, "VideoLoaderUtils: Method load called from main thread");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            wdz0 wdz0Var = (wdz0) it.next();
            sgz0 sgz0Var = (sgz0) wdz0Var.a;
            String str = sgz0Var.a;
            a aVar = new a(sgz0Var, countDownLatch, wdz0Var, str);
            siz0 siz0Var = siz0.b;
            if (siz0Var == null) {
                synchronized (siz0.class) {
                    try {
                        siz0Var = siz0.b;
                        if (siz0Var == null) {
                            siz0Var = new siz0();
                            siz0.b = siz0Var;
                        }
                    } finally {
                    }
                }
            }
            o8z0.a.execute(new f9p(siz0Var, str, aVar, 2));
        }
        try {
            countDownLatch.await();
            gu8.c(null, "VideoLoaderUtils: success media loading");
        } catch (InterruptedException unused) {
            gu8.c(null, "VideoLoaderUtils: awaiting media files load failed");
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements niz0.a {
        public final /* synthetic */ sgz0 a;
        public final /* synthetic */ CountDownLatch b;
        public final /* synthetic */ wdz0 c;
        public final /* synthetic */ String d;

        public a(sgz0 sgz0Var, CountDownLatch countDownLatch, wdz0 wdz0Var, String str) {
            this.a = sgz0Var;
            this.b = countDownLatch;
            this.c = wdz0Var;
            this.d = str;
        }

        @Override // xsna.niz0.a
        public final void a(Object obj) {
            this.a.d = (String) obj;
            this.b.countDown();
        }

        @Override // xsna.niz0.a
        public final void a() {
            this.a.d = null;
            this.b.countDown();
            this.c.b.g(0, 4001, "videoUrl=" + this.d);
        }
    }
}
