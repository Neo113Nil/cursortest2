package defpackage;

import com.monetization.ads.utils.logger.collectors.MobileAdsLogsCollector;
import yads.mt1;

/* loaded from: classes7.dex */
public final class jb71 {
    public static jb71 b;
    public static final Object c = new Object();
    public final x43 a = new x43();

    public final void a(mt1 mt1Var, String str, String str2) {
        if (MobileAdsLogsCollector.INSTANCE.getLogsCollectingEnabled()) {
            x471 x471Var = new x471(System.currentTimeMillis(), mt1Var.name(), str, str2);
            synchronized (c) {
                try {
                    if (this.a.size() > 5000) {
                        this.a.remove(0);
                    }
                    this.a.addLast(x471Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
