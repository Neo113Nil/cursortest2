package ru.ok.tracer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import ru.ok.tracer.base.inject.ProviderUtils;
import xsna.e9e0;
import xsna.izs;
import xsna.ozl;
import xsna.pn00;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: CoreTracerConfiguration.kt */
/* loaded from: classes11.dex */
public final class CoreTracerConfiguration implements TracerConfiguration {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_API_URL = "https://sdk-api.apptracer.ru";
    private final e9e0<String> apiUrlProvider;
    private final Executor bgExecutor;
    private final boolean debugUpload;
    private final Map<String, String> initialKeys;
    private final Executor ioExecutor;
    private final int maxKeysCount;
    private final e9e0<String> overrideAppTokenProvider;
    private final String overrideEnvironment;
    private final int trafficStatsTag;

    /* compiled from: CoreTracerConfiguration.kt */
    public static final class Builder {
        private e9e0<String> apiUrlProvider;
        private Executor bgExecutor;
        private Boolean debugUpload;
        private final Map<String, String> initialKeys = new LinkedHashMap();
        private Executor ioExecutor;
        private Integer maxKeysCount;
        private e9e0<String> overrideAppTokenProvider;
        private String overrideEnvironment;
        private Integer trafficStatsTag;

        public final CoreTracerConfiguration build() {
            return new CoreTracerConfiguration(this, null);
        }

        public final e9e0<String> getApiUrlProvider$tracer_commons_release() {
            return this.apiUrlProvider;
        }

        public final Executor getBgExecutor$tracer_commons_release() {
            return this.bgExecutor;
        }

        public final Boolean getDebugUpload$tracer_commons_release() {
            return this.debugUpload;
        }

        public final Map<String, String> getInitialKeys$tracer_commons_release() {
            return this.initialKeys;
        }

        public final Executor getIoExecutor$tracer_commons_release() {
            return this.ioExecutor;
        }

        public final Integer getMaxKeysCount$tracer_commons_release() {
            return this.maxKeysCount;
        }

        public final e9e0<String> getOverrideAppTokenProvider$tracer_commons_release() {
            return this.overrideAppTokenProvider;
        }

        public final String getOverrideEnvironment$tracer_commons_release() {
            return this.overrideEnvironment;
        }

        public final Integer getTrafficStatsTag$tracer_commons_release() {
            return this.trafficStatsTag;
        }

        public final Builder provideApiUrl(e9e0<String> e9e0Var) {
            this.apiUrlProvider = e9e0Var;
            return this;
        }

        public final Builder provideOverrideAppToken(e9e0<String> e9e0Var) {
            this.overrideAppTokenProvider = e9e0Var;
            return this;
        }

        public final Builder setApiUrl(String str) {
            return provideApiUrl(ProviderUtils.providerOf(str));
        }

        public final void setApiUrlProvider$tracer_commons_release(e9e0<String> e9e0Var) {
            this.apiUrlProvider = e9e0Var;
        }

        public final Builder setBgExecutor(Executor executor) {
            this.bgExecutor = executor;
            return this;
        }

        public final void setBgExecutor$tracer_commons_release(Executor executor) {
            this.bgExecutor = executor;
        }

        public final Builder setDebugUpload(boolean z) {
            this.debugUpload = Boolean.valueOf(z);
            return this;
        }

        public final void setDebugUpload$tracer_commons_release(Boolean bool) {
            this.debugUpload = bool;
        }

        public final Builder setExperimentalMaxKeysCount(int i) {
            this.maxKeysCount = Integer.valueOf(i);
            return this;
        }

        @ozl
        public final Builder setExperimentalMaxTagsCount(int i) {
            setExperimentalMaxKeysCount(i);
            return this;
        }

        public final Builder setInitialKey(String str, String str2) {
            this.initialKeys.put(str, str2);
            return this;
        }

        public final Builder setInitialKeys(Map<String, String> map) {
            this.initialKeys.putAll(map);
            return this;
        }

        public final Builder setIoExecutor(Executor executor) {
            this.ioExecutor = executor;
            return this;
        }

        public final void setIoExecutor$tracer_commons_release(Executor executor) {
            this.ioExecutor = executor;
        }

        public final void setMaxKeysCount$tracer_commons_release(Integer num) {
            this.maxKeysCount = num;
        }

        public final Builder setOverrideAppToken(String str) {
            return provideOverrideAppToken(ProviderUtils.providerOf(str));
        }

        public final void setOverrideAppTokenProvider$tracer_commons_release(e9e0<String> e9e0Var) {
            this.overrideAppTokenProvider = e9e0Var;
        }

        public final Builder setOverrideEnvironment(String str) {
            this.overrideEnvironment = str;
            return this;
        }

        public final void setOverrideEnvironment$tracer_commons_release(String str) {
            this.overrideEnvironment = str;
        }

        public final Builder setTrafficStatsTag(int i) {
            this.trafficStatsTag = Integer.valueOf(i);
            return this;
        }

        public final void setTrafficStatsTag$tracer_commons_release(Integer num) {
            this.trafficStatsTag = num;
        }
    }

    /* compiled from: CoreTracerConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CoreTracerConfiguration get() {
            TracerConfiguration tracerConfiguration = Tracer.INSTANCE.getRuntimeConfigs().get(FEATURE_COREKt.getFEATURE_CORE());
            CoreTracerConfiguration coreTracerConfiguration = tracerConfiguration instanceof CoreTracerConfiguration ? (CoreTracerConfiguration) tracerConfiguration : null;
            return coreTracerConfiguration == null ? new Builder().build() : coreTracerConfiguration;
        }

        /* renamed from: private, reason: not valid java name */
        public final CoreTracerConfiguration m400private(izs<? super Builder, s3q0> izsVar) {
            Builder builder = new Builder();
            izsVar.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CoreTracerConfiguration(Builder builder, zcl zclVar) {
        this(builder);
    }

    public final String getApiUrl() {
        Object failure;
        try {
            e9e0<String> e9e0Var = this.apiUrlProvider;
            failure = e9e0Var != null ? (String) e9e0Var.get() : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        String str = (String) (failure instanceof Result.Failure ? null : failure);
        return str == null ? "https://sdk-api.apptracer.ru" : str;
    }

    public final Executor getBgExecutor$tracer_commons_release() {
        return this.bgExecutor;
    }

    public final boolean getDebugUpload() {
        return this.debugUpload;
    }

    @Override // ru.ok.tracer.TracerConfiguration
    public TracerFeature getFeature() {
        return FEATURE_COREKt.getFEATURE_CORE();
    }

    public final Map<String, String> getInitialKeys$tracer_commons_release() {
        return this.initialKeys;
    }

    public final Executor getIoExecutor$tracer_commons_release() {
        return this.ioExecutor;
    }

    public final int getMaxKeysCount$tracer_commons_release() {
        return this.maxKeysCount;
    }

    public final String getOverrideAppToken() {
        Object failure;
        try {
            e9e0<String> e9e0Var = this.overrideAppTokenProvider;
            failure = e9e0Var != null ? (String) e9e0Var.get() : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (String) (failure instanceof Result.Failure ? null : failure);
    }

    public final String getOverrideEnvironment$tracer_commons_release() {
        return this.overrideEnvironment;
    }

    public final int getTrafficStatsTag$tracer_commons_release() {
        return this.trafficStatsTag;
    }

    private CoreTracerConfiguration(Builder builder) {
        this.apiUrlProvider = builder.getApiUrlProvider$tracer_commons_release();
        this.overrideAppTokenProvider = builder.getOverrideAppTokenProvider$tracer_commons_release();
        this.overrideEnvironment = builder.getOverrideEnvironment$tracer_commons_release();
        Boolean debugUpload$tracer_commons_release = builder.getDebugUpload$tracer_commons_release();
        this.debugUpload = debugUpload$tracer_commons_release != null ? debugUpload$tracer_commons_release.booleanValue() : false;
        Integer maxKeysCount$tracer_commons_release = builder.getMaxKeysCount$tracer_commons_release();
        this.maxKeysCount = maxKeysCount$tracer_commons_release != null ? maxKeysCount$tracer_commons_release.intValue() : 30;
        this.initialKeys = pn00.t(builder.getInitialKeys$tracer_commons_release());
        Integer trafficStatsTag$tracer_commons_release = builder.getTrafficStatsTag$tracer_commons_release();
        this.trafficStatsTag = trafficStatsTag$tracer_commons_release != null ? trafficStatsTag$tracer_commons_release.intValue() : -1;
        this.ioExecutor = builder.getIoExecutor$tracer_commons_release();
        this.bgExecutor = builder.getBgExecutor$tracer_commons_release();
    }
}
