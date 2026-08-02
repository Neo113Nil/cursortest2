package defpackage;

import com.monetization.ads.utils.logger.collectors.MobileAdsNetworkLogsCollector;

/* loaded from: classes7.dex */
public final class fa71 {
    public static final Object c = new Object();
    public final jb71 a;
    public final MobileAdsNetworkLogsCollector b;

    public fa71() {
        jb71 jb71Var;
        jb71 jb71Var2 = jb71.b;
        if (jb71Var2 == null) {
            synchronized (jb71.c) {
                jb71Var = jb71.b;
                if (jb71Var == null) {
                    jb71Var = new jb71();
                    jb71.b = jb71Var;
                }
            }
            jb71Var2 = jb71Var;
        }
        MobileAdsNetworkLogsCollector companion = MobileAdsNetworkLogsCollector.INSTANCE.getInstance();
        this.a = jb71Var2;
        this.b = companion;
    }
}
