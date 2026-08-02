package com.monetization.ads.utils.logger.collectors;

import com.monetization.ads.utils.logger.model.MobileAdsNetworkLog;
import com.monetization.ads.utils.logger.model.MobileAdsNetworkRequestLog;
import com.monetization.ads.utils.logger.model.MobileAdsNetworkResponseLog;
import defpackage.x43;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Js\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0003R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/monetization/ads/utils/logger/collectors/MobileAdsNetworkLogsCollector;", "", "<init>", "()V", "", "requestStartTimestamp", "", "requestMethod", "requestUrl", "", "requestHeaders", "requestBody", "", Constants.INTENT_PARAM_RESPONSE_CODE, "responseHeaders", "responseBody", "Lzy11;", "writeLog", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;)V", "", "Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkLog;", "getAll", "()Ljava/util/List;", "clearAll", "Lx43;", "logs", "Lx43;", "Companion", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MobileAdsNetworkLogsCollector {
    private static MobileAdsNetworkLogsCollector INSTANCE;
    private final x43 logs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Object LOCK = new Object();

    private MobileAdsNetworkLogsCollector() {
        this.logs = new x43();
    }

    public final void clearAll() {
        synchronized (LOCK) {
            this.logs.clear();
        }
    }

    public final List<MobileAdsNetworkLog> getAll() {
        List<MobileAdsNetworkLog> J0;
        synchronized (LOCK) {
            J0 = a.J0(this.logs);
        }
        return J0;
    }

    public final void writeLog(long requestStartTimestamp, String requestMethod, String requestUrl, Map<String, String> requestHeaders, String requestBody, Integer responseCode, Map<String, String> responseHeaders, String responseBody) {
        if (MobileAdsLogsCollector.INSTANCE.getLogsCollectingEnabled()) {
            MobileAdsNetworkLog mobileAdsNetworkLog = new MobileAdsNetworkLog(new MobileAdsNetworkRequestLog(requestStartTimestamp, requestMethod, requestUrl, requestHeaders, requestBody), (responseCode == null && responseHeaders == null && responseBody == null) ? null : new MobileAdsNetworkResponseLog(System.currentTimeMillis(), responseCode, responseHeaders, responseBody));
            synchronized (LOCK) {
                try {
                    if (this.logs.size() > 100) {
                        this.logs.remove(0);
                    }
                    this.logs.addLast(mobileAdsNetworkLog);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/monetization/ads/utils/logger/collectors/MobileAdsNetworkLogsCollector$Companion;", "", "()V", "INSTANCE", "Lcom/monetization/ads/utils/logger/collectors/MobileAdsNetworkLogsCollector;", "LOCK", "LOGS_LIMIT", "", "getInstance", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MobileAdsNetworkLogsCollector getInstance() {
            MobileAdsNetworkLogsCollector mobileAdsNetworkLogsCollector;
            MobileAdsNetworkLogsCollector mobileAdsNetworkLogsCollector2 = MobileAdsNetworkLogsCollector.INSTANCE;
            if (mobileAdsNetworkLogsCollector2 != null) {
                return mobileAdsNetworkLogsCollector2;
            }
            synchronized (MobileAdsNetworkLogsCollector.LOCK) {
                mobileAdsNetworkLogsCollector = MobileAdsNetworkLogsCollector.INSTANCE;
                if (mobileAdsNetworkLogsCollector == null) {
                    mobileAdsNetworkLogsCollector = new MobileAdsNetworkLogsCollector(null);
                    MobileAdsNetworkLogsCollector.INSTANCE = mobileAdsNetworkLogsCollector;
                }
            }
            return mobileAdsNetworkLogsCollector;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MobileAdsNetworkLogsCollector(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
