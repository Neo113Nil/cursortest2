package io.appmetrica.analytics.logger.appmetrica.internal;

import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.logger.common.BaseImportantLogger;

/* loaded from: classes8.dex */
public final class ImportantLogger extends BaseImportantLogger {
    public static final ImportantLogger INSTANCE = new ImportantLogger();

    private ImportantLogger() {
        super(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA);
    }
}
