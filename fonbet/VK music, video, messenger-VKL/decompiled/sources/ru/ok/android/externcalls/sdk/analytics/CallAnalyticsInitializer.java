package ru.ok.android.externcalls.sdk.analytics;

import com.vk.movika.sdk.android.defaultplayer.view.timeline.a;
import com.vk.movika.sdk.base.presenter.b;
import defpackage.r;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.ok.android.sdk.api.OkApi;
import ru.ok.android.webrtc.RTCLog;
import xsna.gzs;
import xsna.h9;
import xsna.i70;
import xsna.ic;
import xsna.j70;
import xsna.qc;
import xsna.s5;
import xsna.yh;

/* compiled from: CallAnalyticsInitializer.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class CallAnalyticsInitializer {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationAnalyticsUploadConfig init$lambda$0(ConversationAnalyticsConfigurationImpl conversationAnalyticsConfigurationImpl) {
        UploadConfigProvider uploadConfigProvider = conversationAnalyticsConfigurationImpl.getUploadConfigProvider();
        if (uploadConfigProvider != null) {
            return uploadConfigProvider.getUploadConfig();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String init$lambda$1(ConversationAnalyticsConfigurationImpl conversationAnalyticsConfigurationImpl) {
        ApplicationNameProvider applicationNameProvider = conversationAnalyticsConfigurationImpl.getApplicationNameProvider();
        if (applicationNameProvider != null) {
            return applicationNameProvider.getName();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer init$lambda$2(gzs gzsVar) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) gzsVar.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Integer.valueOf(conversationAnalyticsUploadConfig.getMaxLocalFileSizeKb());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer init$lambda$3(gzs gzsVar) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) gzsVar.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Integer.valueOf(conversationAnalyticsUploadConfig.getMaxEventCount());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer init$lambda$4(gzs gzsVar) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) gzsVar.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Integer.valueOf(conversationAnalyticsUploadConfig.getMaxLocalFileCount());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long init$lambda$5(gzs gzsVar) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) gzsVar.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return conversationAnalyticsUploadConfig.getTimeToUploadNextFileMs();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean init$lambda$6(gzs gzsVar) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) gzsVar.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Boolean.valueOf(conversationAnalyticsUploadConfig.getCompressContent());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean init$lambda$7(gzs gzsVar) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) gzsVar.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Boolean.valueOf(conversationAnalyticsUploadConfig.getDisableUploadWhenCallIsActiveProvider());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean init$lambda$8(gzs gzsVar) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) gzsVar.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Boolean.valueOf(conversationAnalyticsUploadConfig.getAutoDetectContentCompression());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean init$lambda$9(gzs gzsVar) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) gzsVar.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Boolean.valueOf(conversationAnalyticsUploadConfig.getUseDbCache());
        }
        return null;
    }

    public final void init(CallAnalyticsSender callAnalyticsSender, ConversationAnalyticsConfigurationImpl conversationAnalyticsConfigurationImpl, OkApi okApi, gzs<? extends RTCLog> gzsVar) {
        i70 i70Var = new i70(conversationAnalyticsConfigurationImpl, 11);
        callAnalyticsSender.initialize(new CallAnalyticsConfig(okApi, new EventMetaParamsConfig(new j70(conversationAnalyticsConfigurationImpl, 8)), new CallAnalyticsLoggerImpl(gzsVar), new UploadConfig(0, null, 0L, 0L, new r(i70Var, 13), new yh(i70Var, 9), new ic(i70Var, 11), new a(i70Var, 12), new h9(i70Var, 6), new b(i70Var, 3), new qc(i70Var, 7), new s5(i70Var, 12), 15, null)));
    }
}
