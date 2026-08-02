package ru.ok.tracer;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Pair;
import ru.ok.tracer.base.apptoken.AppTokenUtils;
import ru.ok.tracer.base.builduuid.BuildUuidUtils;
import ru.ok.tracer.base.compat.PackageInfoCompat;
import ru.ok.tracer.base.compat.PackageManagerCompat;
import ru.ok.tracer.base.drop.DropManager;
import ru.ok.tracer.base.http.HttpClient;
import ru.ok.tracer.base.http.TracerHttpClientKt;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.session.SessionState;
import ru.ok.tracer.session.SessionStateStorage;
import ru.ok.tracer.session.TagsStorage;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import ru.ok.tracer.utils.config.ConfigStorage;
import xsna.bpn0;
import xsna.c5g;
import xsna.gzs;
import xsna.jgp;
import xsna.nbr;
import xsna.on00;
import xsna.ozl;

/* compiled from: Tracer.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes11.dex */
public final class Tracer {
    private static TracerApplicationInfo applicationInfo;
    private static Context context;
    private static volatile boolean isDisabled;
    private static SessionStateStorage stateStorage;
    private static TagsStorage tagsStorage;
    public static final Tracer INSTANCE = new Tracer();
    private static final AtomicBoolean isInitialized = new AtomicBoolean();
    private static final Lazy httpClient$delegate = new bpn0(new gzs<HttpClient>() { // from class: ru.ok.tracer.Tracer$httpClient$2
        @Override // xsna.gzs
        public final HttpClient invoke() {
            return TracerHttpClientKt.createTracerHttpClient(Tracer.INSTANCE.getContext(), CoreTracerConfiguration.Companion.get().getTrafficStatsTag$tracer_commons_release());
        }
    });
    private static final Lazy dropManager$delegate = new bpn0(new gzs<DropManager>() { // from class: ru.ok.tracer.Tracer$dropManager$2
        @Override // xsna.gzs
        public final DropManager invoke() {
            return new DropManager(nbr.t(TracerFiles.INSTANCE.getTracerDir(Tracer.INSTANCE.getContext()), "drops.json"));
        }
    });
    private static volatile Map<TracerFeature, ? extends TracerConfiguration> runtimeConfigs = jgp.b;

    private Tracer() {
    }

    public static final void disable() {
        isDisabled = true;
        Logger.d$default("Tracer is disabled", null, 2, null);
    }

    @ozl
    public static final SessionState getLastSessionState() {
        return getPrevLaunchSessionState();
    }

    public static final SessionState getPrevLaunchSessionState() {
        if (isDisabled) {
            Logger.d$default("Tracer is disabled", null, 2, null);
            return null;
        }
        try {
            return INSTANCE.getStateStorage().getPrevLaunchSessionState();
        } catch (Exception unused) {
            INSTANCE.getClass();
            return null;
        }
    }

    public static final boolean getSampled() {
        return !isDisabled && privateSampled();
    }

    public static final String getUserId() {
        return privateUserId();
    }

    public static final boolean isDisabled() {
        return isDisabled;
    }

    private static final boolean privateSampled() {
        try {
            return INSTANCE.getStateStorage().getSampled$tracer_commons_release();
        } catch (Exception unused) {
            INSTANCE.getClass();
            return false;
        }
    }

    private static final String privateUserId() {
        try {
            return INSTANCE.getStateStorage().getUserId$tracer_commons_release();
        } catch (Exception unused) {
            INSTANCE.getClass();
            return null;
        }
    }

    private final List<TracerConfiguration> requestTracerConfiguration(HasTracerConfiguration hasTracerConfiguration) {
        return hasTracerConfiguration.getTracerConfiguration();
    }

    public static final void setCustomProperties(Map<String, String> map) {
        if (isDisabled) {
            Logger.d$default("Tracer is disabled", null, 2, null);
            return;
        }
        try {
            INSTANCE.getStateStorage().setCustomProperties$tracer_commons_release(map);
        } catch (Exception unused) {
            INSTANCE.getClass();
        }
    }

    public static final void setCustomProperty(String str, String str2) {
        setCustomProperties(on00.f(new Pair(str, str2)));
    }

    public static final void setKey(String str, String str2) {
        setKeys(on00.f(new Pair(str, str2)));
    }

    public static final void setKeys(Map<String, String> map) {
        if (isDisabled) {
            Logger.d$default("Tracer is disabled", null, 2, null);
            return;
        }
        try {
            INSTANCE.getTagsStorage().setKeys$tracer_commons_release(map);
        } catch (Exception unused) {
            INSTANCE.getClass();
        }
    }

    public static final void setSampled(boolean z) {
        try {
            INSTANCE.getStateStorage().setSampled$tracer_commons_release(z);
        } catch (Exception unused) {
            INSTANCE.getClass();
        }
    }

    public static final void setUserId(String str) {
        try {
            INSTANCE.getStateStorage().setUserId$tracer_commons_release(str);
        } catch (Exception unused) {
            INSTANCE.getClass();
        }
    }

    public final String getAppToken() {
        if (isDisabled) {
            Logger.d$default("Tracer is disabled", null, 2, null);
            return null;
        }
        String overrideAppToken = CoreTracerConfiguration.Companion.get().getOverrideAppToken();
        return overrideAppToken == null ? AppTokenUtils.getAppToken(getContext()) : overrideAppToken;
    }

    public final TracerApplicationInfo getApplicationInfo() {
        TracerApplicationInfo tracerApplicationInfo = applicationInfo;
        if (tracerApplicationInfo != null) {
            return tracerApplicationInfo;
        }
        return null;
    }

    public final Context getContext() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        return null;
    }

    public final DropManager getDropManager() {
        return (DropManager) dropManager$delegate.getValue();
    }

    public final HttpClient getHttpClient() {
        return (HttpClient) httpClient$delegate.getValue();
    }

    public final Map<TracerFeature, TracerConfiguration> getRuntimeConfigs() {
        if (isInitialized.get()) {
            return runtimeConfigs;
        }
        throw new IllegalStateException("Tracer is not initialized");
    }

    public final SessionStateStorage getStateStorage() {
        SessionStateStorage sessionStateStorage = stateStorage;
        if (sessionStateStorage != null) {
            return sessionStateStorage;
        }
        return null;
    }

    public final TagsStorage getTagsStorage() {
        TagsStorage tagsStorage2 = tagsStorage;
        if (tagsStorage2 != null) {
            return tagsStorage2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void init$tracer_commons_release(final Context context2) {
        if (isInitialized.getAndSet(true)) {
            throw new IllegalStateException("Tracer already initialized!");
        }
        context = context2;
        if (context2 instanceof HasTracerConfiguration) {
            try {
                List<TracerConfiguration> requestTracerConfiguration = requestTracerConfiguration((HasTracerConfiguration) context2);
                int e = on00.e(c5g.u(requestTracerConfiguration, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj : requestTracerConfiguration) {
                    linkedHashMap.put(((TracerConfiguration) obj).getFeature(), obj);
                }
                runtimeConfigs = linkedHashMap;
            } catch (Exception unused) {
            }
        } else {
            Logger.w$default("Application does not implement HasTracerConfiguration", null, 2, null);
        }
        CoreTracerConfiguration coreTracerConfiguration = CoreTracerConfiguration.Companion.get();
        PackageInfo packageInfoCompat = PackageManagerCompat.getPackageInfoCompat(context2.getPackageManager(), context2.getPackageName(), 0);
        String str = packageInfoCompat.packageName;
        String str2 = packageInfoCompat.versionName;
        long longVersionCodeCompat = PackageInfoCompat.getLongVersionCodeCompat(packageInfoCompat);
        String buildUuid = BuildUuidUtils.getBuildUuid(context2);
        String overrideEnvironment$tracer_commons_release = coreTracerConfiguration.getOverrideEnvironment$tracer_commons_release();
        if (overrideEnvironment$tracer_commons_release == null) {
            overrideEnvironment$tracer_commons_release = BuildUuidUtils.getBuildEnvironment(context2);
        }
        applicationInfo = new TracerApplicationInfo(str, str2, longVersionCodeCompat, buildUuid, overrideEnvironment$tracer_commons_release);
        ConfigStorage.INSTANCE.init$tracer_commons_release(new gzs<File>() { // from class: ru.ok.tracer.Tracer$init$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final File invoke() {
                return nbr.t(FileUtils.mkdirsChecked(TracerFiles.INSTANCE.getTracerDir(context2)), "settings.data");
            }
        });
        stateStorage = new SessionStateStorage(context2);
        tagsStorage = new TagsStorage(context2, coreTracerConfiguration.getMaxKeysCount$tracer_commons_release());
        Map<String, String> initialKeys$tracer_commons_release = coreTracerConfiguration.getInitialKeys$tracer_commons_release();
        if (!initialKeys$tracer_commons_release.isEmpty()) {
            getTagsStorage().setKeys$tracer_commons_release(initialKeys$tracer_commons_release);
        }
        Logger.d$default("Tracer initialized!", null, 2, null);
        ((Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new TracerActivityLifecycleCallbacks(getStateStorage()));
    }

    public final void setRuntimeConfigs$tracer_commons_release(Map<TracerFeature, ? extends TracerConfiguration> map) {
        runtimeConfigs = map;
    }

    public static /* synthetic */ void getSampled$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public static /* synthetic */ void isDisabled$annotations() {
    }
}
