package ru.ok.android.externcalls.analytics.internal.upload;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.api.common.BoxedApiValue;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig;
import ru.ok.android.externcalls.analytics.internal.api.CallExternalAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.api.CallNativeAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;
import xsna.epx;
import xsna.gzs;
import xsna.zcl;

/* compiled from: Uploader.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class UploadHelper {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String SDK_TYPE_STRING = "ANDROID";

    @Deprecated
    public static final String SDK_VERSION_STRING = "0.2.3";

    @Deprecated
    public static final int VERSION_INT = 1;
    private static String appVersionString;
    private String lastReportedError;
    private final String logTag;

    /* compiled from: Uploader.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final String getApplicationVersionParams() {
            String str = UploadHelper.appVersionString;
            if (str != null) {
                return str;
            }
            ApplicationProvider.Companion companion = ApplicationProvider.Companion;
            String str2 = companion.getVersionName() + StringUtils.PROCESS_POSTFIX_DELIMITER + companion.getVersionCode();
            Companion unused = UploadHelper.Companion;
            UploadHelper.appVersionString = str2;
            return str2;
        }

        public final String getPlatformParam() {
            EventMetaParamsConfig eventMetaParams;
            gzs<String> appName;
            String invoke;
            CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
            return (config == null || (eventMetaParams = config.getEventMetaParams()) == null || (appName = eventMetaParams.getAppName()) == null || (invoke = appName.invoke()) == null) ? "debug" : invoke;
        }

        private Companion() {
        }

        public static /* synthetic */ void getApplicationVersionParams$annotations() {
        }
    }

    public UploadHelper(String str) {
        this.logTag = str;
    }

    public static final String getApplicationVersionParams() {
        return Companion.getApplicationVersionParams();
    }

    private final void reportApiInvocationError(StatDeliveryException statDeliveryException) {
        CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
        if (logger == null) {
            return;
        }
        String message = statDeliveryException.getMessage();
        if (epx.f(this.lastReportedError, message)) {
            String str = this.logTag;
            if (message == null) {
                message = "";
            }
            logger.e(str, message, statDeliveryException);
            return;
        }
        this.lastReportedError = message;
        String str2 = this.logTag;
        if (message == null) {
            message = "";
        }
        logger.report(str2, message, statDeliveryException);
    }

    public final void executeApiMethod$calls_sdk_analytics_release(ApiClient apiClient, EventChannel eventChannel, BoxedApiValue boxedApiValue) throws IOException, ApiException {
        ApiExecutableRequest callNativeAnalyticsApiRequest;
        if (eventChannel.isExternal()) {
            callNativeAnalyticsApiRequest = new CallExternalAnalyticsApiRequest(eventChannel.getApiMethod(), eventChannel.getApplication(), eventChannel.getCollector(), eventChannel.getPlatform(), boxedApiValue, CallAnalyticsConfigStorage.INSTANCE.getLogger());
        } else {
            String apiMethod = eventChannel.getApiMethod();
            Companion companion = Companion;
            callNativeAnalyticsApiRequest = new CallNativeAnalyticsApiRequest(apiMethod, companion.getPlatformParam(), companion.getApplicationVersionParams(), "ANDROID", "0.2.3", 1, boxedApiValue, CallAnalyticsConfigStorage.INSTANCE.getLogger());
        }
        try {
            apiClient.execute(callNativeAnalyticsApiRequest);
            this.lastReportedError = null;
        } catch (IOException e) {
            throw e;
        } catch (ApiInvocationException e2) {
            reportApiInvocationError(new StatDeliveryException(eventChannel.getApiMethod(), e2));
            throw e2;
        } catch (Throwable th) {
            reportApiInvocationError(new StatDeliveryException(eventChannel.getApiMethod(), th));
            throw th;
        }
    }
}
