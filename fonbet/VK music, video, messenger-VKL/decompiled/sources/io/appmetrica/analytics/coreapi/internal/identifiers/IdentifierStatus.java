package io.appmetrica.analytics.coreapi.internal.identifiers;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes8.dex */
public enum IdentifierStatus {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FORBIDDEN_BY_CLIENT_CONFIG("FORBIDDEN_BY_CLIENT_CONFIG"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN);

    public static final Companion Companion = new Companion(null);
    private final String a;

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final IdentifierStatus from(String str) {
            IdentifierStatus identifierStatus;
            IdentifierStatus[] values = IdentifierStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    identifierStatus = null;
                    break;
                }
                identifierStatus = values[i];
                if (epx.f(identifierStatus.getValue(), str)) {
                    break;
                }
                i++;
            }
            return identifierStatus == null ? IdentifierStatus.UNKNOWN : identifierStatus;
        }

        private Companion() {
        }
    }

    IdentifierStatus(String str) {
        this.a = str;
    }

    public static final IdentifierStatus from(String str) {
        return Companion.from(str);
    }

    public final String getValue() {
        return this.a;
    }
}
