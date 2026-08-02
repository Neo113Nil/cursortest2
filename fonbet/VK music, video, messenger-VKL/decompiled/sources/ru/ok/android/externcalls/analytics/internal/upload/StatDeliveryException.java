package ru.ok.android.externcalls.analytics.internal.upload;

import ru.ok.android.api.core.ApiInvocationException;
import xsna.xy6;
import xsna.y57;
import xsna.zcl;

/* compiled from: StatDeliveryException.kt */
/* loaded from: classes9.dex */
public final class StatDeliveryException extends Throwable {
    private static final Companion Companion = new Companion(null);

    /* compiled from: StatDeliveryException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final String getApiInvocationErrorMessage(String str, ApiInvocationException apiInvocationException) {
            int errorCode = apiInvocationException.getErrorCode();
            String errorMessage = apiInvocationException.getErrorMessage();
            StringBuilder b = xy6.b(errorCode, "Error executing API method ", str, ": code=", ", message=");
            b.append(errorMessage);
            return b.toString();
        }

        public final String getErrorMessage(String str, Throwable th) {
            return y57.a("Error executing API method ", str, ": ", th.getMessage());
        }

        private Companion() {
        }
    }

    public StatDeliveryException(String str, ApiInvocationException apiInvocationException) {
        super(Companion.getApiInvocationErrorMessage(str, apiInvocationException), apiInvocationException);
    }

    public static final String getApiInvocationErrorMessage(String str, ApiInvocationException apiInvocationException) {
        return Companion.getApiInvocationErrorMessage(str, apiInvocationException);
    }

    public static final String getErrorMessage(String str, Throwable th) {
        return Companion.getErrorMessage(str, th);
    }

    public StatDeliveryException(String str, Throwable th) {
        super(Companion.getErrorMessage(str, th), th);
    }

    public StatDeliveryException(Throwable th) {
        super(th);
    }
}
