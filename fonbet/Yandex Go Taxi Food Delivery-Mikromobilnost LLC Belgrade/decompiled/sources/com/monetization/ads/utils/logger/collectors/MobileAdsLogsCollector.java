package com.monetization.ads.utils.logger.collectors;

import defpackage.jb71;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/monetization/ads/utils/logger/collectors/MobileAdsLogsCollector;", "", "()V", "value", "", "logsCollectingEnabled", "getLogsCollectingEnabled", "()Z", "setLogsCollectingEnabled", "(Z)V", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MobileAdsLogsCollector {
    public static final MobileAdsLogsCollector INSTANCE = new MobileAdsLogsCollector();
    private static boolean logsCollectingEnabled;

    private MobileAdsLogsCollector() {
    }

    public final synchronized boolean getLogsCollectingEnabled() {
        return logsCollectingEnabled;
    }

    public final synchronized void setLogsCollectingEnabled(boolean z) {
        jb71 jb71Var;
        if (!z) {
            try {
                MobileAdsNetworkLogsCollector.INSTANCE.getInstance().clearAll();
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
                synchronized (jb71.c) {
                    jb71Var2.a.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logsCollectingEnabled = z;
    }
}
