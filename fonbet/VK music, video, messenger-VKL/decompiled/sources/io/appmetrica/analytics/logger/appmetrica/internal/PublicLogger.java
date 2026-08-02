package io.appmetrica.analytics.logger.appmetrica.internal;

import android.content.Context;
import com.ironsource.X3;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import xsna.air;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class PublicLogger extends BaseReleaseLogger {
    public static final Companion Companion = new Companion(null);
    private static final PublicLogger a = new PublicLogger("");

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final PublicLogger getAnonymousInstance() {
            return PublicLogger.a;
        }

        public final void init(Context context) {
            BaseReleaseLogger.init(context);
        }

        private Companion() {
        }
    }

    public PublicLogger(String str) {
        super(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, air.b(']', X3.j.d, str));
    }

    public static final PublicLogger getAnonymousInstance() {
        return Companion.getAnonymousInstance();
    }
}
