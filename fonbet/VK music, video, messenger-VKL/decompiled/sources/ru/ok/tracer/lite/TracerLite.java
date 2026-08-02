package ru.ok.tracer.lite;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import ru.ok.tracer.base.inject.ProviderUtils;
import ru.ok.tracer.base.manifest.TracerLiteManifestUtils;
import ru.ok.tracer.base.sessionuuuid.SessionUuidUtils;
import ru.ok.tracer.lite.limits.TracerLiteLimits;
import ru.ok.tracer.lite.upload.TracerDropHolder;
import ru.ok.tracer.lite.upload.TracerLiteHttpClientHolder;
import ru.ok.tracer.lite.utils.TracerExecutorsHolder;
import ru.ok.tracer.manifest.TracerLiteManifest;
import xsna.e9e0;
import xsna.gzs;
import xsna.izs;
import xsna.msy;
import xsna.ozl;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: TracerLite.kt */
/* loaded from: classes11.dex */
public final class TracerLite {
    private final Configuration configuration;
    private final Context context;
    private final TracerDropHolder dropHolder;
    private final TracerExecutorsHolder executorHolder;
    private final TracerLiteHttpClientHolder httpClientHolder;
    private volatile boolean isExplicitlyDisabled;
    private final Lazy libraryInfo$delegate;
    private final String libraryPackageName;
    private final TracerLiteLimits limits;
    private final Lazy manifest$delegate;
    private final TagsStorageLite tagsStorage;

    /* compiled from: TracerLite.kt */
    public static final class Configuration {
        public static final Companion Companion = new Companion(null);
        public static final String DEFAULT_API_URL = "https://sdk-api.apptracer.ru";
        private final e9e0<? extends String> apiUrlProvider;
        private final Executor ioExecutor;
        private final int maxKeysCount;
        private final e9e0<? extends String> overrideLibToken;
        private final int trafficStatsTag;

        /* compiled from: TracerLite.kt */
        public static final class Builder {
            private Executor ioExecutor;
            private e9e0<String> apiUrlProvider = ProviderUtils.providerOf(Configuration.DEFAULT_API_URL);
            private e9e0<? extends String> overrideLibTokenProvider = ProviderUtils.providerOf(null);
            private int trafficStatsTag = -1;
            private final int experimentalMaxKeysCount = 30;

            public final Configuration build() {
                return new Configuration(this, null);
            }

            public final String getApiUrl() {
                return this.apiUrlProvider.get();
            }

            public final e9e0<String> getApiUrlProvider() {
                return this.apiUrlProvider;
            }

            public final int getExperimentalMaxKeysCount() {
                return this.experimentalMaxKeysCount;
            }

            public final Executor getIoExecutor() {
                return this.ioExecutor;
            }

            public final String getOverrideLibToken() {
                return this.overrideLibTokenProvider.get();
            }

            public final e9e0<? extends String> getOverrideLibTokenProvider() {
                return this.overrideLibTokenProvider;
            }

            public final int getTrafficStatsTag() {
                return this.trafficStatsTag;
            }

            public final void setApiUrl(String str) {
                this.apiUrlProvider = ProviderUtils.providerOf(str);
            }

            public final void setApiUrlProvider(e9e0<String> e9e0Var) {
                this.apiUrlProvider = e9e0Var;
            }

            public final void setIoExecutor(Executor executor) {
                this.ioExecutor = executor;
            }

            public final void setOverrideLibToken(String str) {
                this.overrideLibTokenProvider = ProviderUtils.providerOf(str);
            }

            public final void setOverrideLibTokenProvider(e9e0<? extends String> e9e0Var) {
                this.overrideLibTokenProvider = e9e0Var;
            }

            public final void setTrafficStatsTag(int i) {
                this.trafficStatsTag = i;
            }
        }

        /* compiled from: TracerLite.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final Configuration build(izs<? super Builder, s3q0> izsVar) {
                Builder builder = new Builder();
                izsVar.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public /* synthetic */ Configuration(Builder builder, zcl zclVar) {
            this(builder);
        }

        public final String getApiUrl() {
            return this.apiUrlProvider.get();
        }

        public final Executor getIoExecutor$tracer_lite_commons_release() {
            return this.ioExecutor;
        }

        public final int getMaxKeysCount$tracer_lite_commons_release() {
            return this.maxKeysCount;
        }

        public final e9e0<? extends String> getOverrideLibToken$tracer_lite_commons_release() {
            return this.overrideLibToken;
        }

        public final int getTrafficStatsTag$tracer_lite_commons_release() {
            return this.trafficStatsTag;
        }

        private Configuration(Builder builder) {
            this.apiUrlProvider = builder.getApiUrlProvider();
            this.trafficStatsTag = builder.getTrafficStatsTag();
            this.overrideLibToken = builder.getOverrideLibTokenProvider();
            this.maxKeysCount = builder.getExperimentalMaxKeysCount();
            this.ioExecutor = builder.getIoExecutor();
        }
    }

    public TracerLite(Context context, String str) {
        this(context, str, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TracerLiteManifest getManifest() {
        return (TracerLiteManifest) this.manifest$delegate.getValue();
    }

    public final void disable() {
        this.isExplicitlyDisabled = true;
    }

    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final Context getContext() {
        return this.context;
    }

    public final TracerDropHolder getDropHolder$tracer_lite_commons_release() {
        return this.dropHolder;
    }

    public final TracerExecutorsHolder getExecutorHolder$tracer_lite_commons_release() {
        return this.executorHolder;
    }

    public final TracerLiteHttpClientHolder getHttpClientHolder$tracer_lite_commons_release() {
        return this.httpClientHolder;
    }

    public final String getLibToken() {
        String str = this.configuration.getOverrideLibToken$tracer_lite_commons_release().get();
        if (str != null) {
            return str;
        }
        TracerLiteManifest manifest = getManifest();
        if (manifest != null) {
            if (manifest.isDisabled()) {
                manifest = null;
            }
            if (manifest != null) {
                return manifest.appToken();
            }
        }
        return null;
    }

    public final TracerLibraryInfo getLibraryInfo() {
        return (TracerLibraryInfo) this.libraryInfo$delegate.getValue();
    }

    public final String getLibraryPackageName() {
        return this.libraryPackageName;
    }

    public final TracerLiteLimits getLimits$tracer_lite_commons_release() {
        return this.limits;
    }

    public final String getSessionUuid() {
        return SessionUuidUtils.getCurrentSessionUuid();
    }

    public final TagsStorageLite getTagsStorage$tracer_lite_commons_release() {
        return this.tagsStorage;
    }

    public final boolean isDisabled() {
        if (this.isExplicitlyDisabled) {
            return true;
        }
        TracerLiteManifest manifest = getManifest();
        if (manifest != null && !manifest.isDisabled()) {
            return false;
        }
        this.isExplicitlyDisabled = true;
        return true;
    }

    public final void setKey(String str, String str2) {
        if (this.isExplicitlyDisabled) {
            return;
        }
        this.tagsStorage.setKey(str, str2);
    }

    public TracerLite(Context context, String str, Configuration configuration) {
        this.libraryPackageName = str;
        this.configuration = configuration;
        this.context = context.getApplicationContext();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.manifest$delegate = msy.a(lazyThreadSafetyMode, new gzs<TracerLiteManifest>() { // from class: ru.ok.tracer.lite.TracerLite$manifest$2
            {
                super(0);
            }

            @Override // xsna.gzs
            public final TracerLiteManifest invoke() {
                try {
                    return TracerLiteManifestUtils.requireTracerLiteManifest(TracerLite.this.getLibraryPackageName());
                } catch (Exception unused) {
                    Log.e("Tracer", "Could not find manifest for library " + TracerLite.this.getLibraryPackageName());
                    return null;
                }
            }
        });
        this.libraryInfo$delegate = msy.a(lazyThreadSafetyMode, new gzs<TracerLibraryInfo>() { // from class: ru.ok.tracer.lite.TracerLite$libraryInfo$2
            {
                super(0);
            }

            @Override // xsna.gzs
            public final TracerLibraryInfo invoke() {
                TracerLiteManifest manifest;
                String str2;
                TracerLiteManifest manifest2;
                TracerLiteManifest manifest3;
                String libraryPackageName = TracerLite.this.getLibraryPackageName();
                manifest = TracerLite.this.getManifest();
                if (manifest == null || (str2 = manifest.versionName()) == null) {
                    str2 = "NA";
                }
                manifest2 = TracerLite.this.getManifest();
                String buildUuid = manifest2 != null ? manifest2.buildUuid() : null;
                manifest3 = TracerLite.this.getManifest();
                return new TracerLibraryInfo(libraryPackageName, str2, buildUuid, manifest3 != null ? manifest3.environment() : null);
            }
        });
        this.tagsStorage = new TagsStorageLite(configuration.getMaxKeysCount$tracer_lite_commons_release());
        this.dropHolder = new TracerDropHolder(context, str);
        this.httpClientHolder = new TracerLiteHttpClientHolder(context, str, configuration.getTrafficStatsTag$tracer_lite_commons_release());
        this.executorHolder = new TracerExecutorsHolder(configuration.getIoExecutor$tracer_lite_commons_release(), str);
        this.limits = new TracerLiteLimits(context, str);
    }

    public /* synthetic */ TracerLite(Context context, String str, Configuration configuration, int i, zcl zclVar) {
        this(context, str, (i & 4) != 0 ? new Configuration.Builder().build() : configuration);
    }

    @ozl
    public static /* synthetic */ void getLibraryPackageName$annotations() {
    }
}
