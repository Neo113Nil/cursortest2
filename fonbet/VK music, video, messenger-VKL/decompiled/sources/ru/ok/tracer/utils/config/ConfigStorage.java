package ru.ok.tracer.utils.config;

import java.io.File;
import kotlin.collections.builders.MapBuilder;
import ru.ok.tracer.TracerFeature;
import ru.ok.tracer.utils.SimpleFileKeyValueStorage;
import xsna.gzs;
import xsna.ss9;

/* compiled from: ConfigStorage.kt */
/* loaded from: classes11.dex */
public final class ConfigStorage {
    public static final ConfigStorage INSTANCE = new ConfigStorage();
    private static volatile SimpleFileKeyValueStorage _settingsStorage;

    private ConfigStorage() {
    }

    private final SimpleFileKeyValueStorage getSettingsStorage() {
        SimpleFileKeyValueStorage simpleFileKeyValueStorage = _settingsStorage;
        if (simpleFileKeyValueStorage != null) {
            return simpleFileKeyValueStorage;
        }
        throw new IllegalStateException("Tracer settings are not initialized.");
    }

    public static /* synthetic */ boolean isLimited$default(ConfigStorage configStorage, TracerFeature tracerFeature, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return configStorage.isLimited(tracerFeature, str);
    }

    public static /* synthetic */ void setLimits$default(ConfigStorage configStorage, String str, String str2, Long l, Long l2, Long l3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            l2 = null;
        }
        if ((i & 16) != 0) {
            l3 = null;
        }
        configStorage.setLimits(str, str2, l, l2, l3);
    }

    public final void init$tracer_commons_release(gzs<? extends File> gzsVar) {
        _settingsStorage = new SimpleFileKeyValueStorage(gzsVar);
    }

    public final boolean isLimited(TracerFeature tracerFeature, String str) {
        boolean isShutdown;
        boolean isShutdown2;
        boolean isShutdown3;
        SimpleFileKeyValueStorage settingsStorage = getSettingsStorage();
        isShutdown = ConfigStorageKt.isShutdown(settingsStorage, "system.shutdown.until.ts");
        if (isShutdown) {
            return true;
        }
        isShutdown2 = ConfigStorageKt.isShutdown(settingsStorage, "system." + tracerFeature.getName() + ".shutdown.until.ts");
        if (isShutdown2) {
            return true;
        }
        if (str == null) {
            return false;
        }
        isShutdown3 = ConfigStorageKt.isShutdown(settingsStorage, ss9.a("system.", tracerFeature.getName(), ".", str, ".shutdown.until.ts"));
        return isShutdown3;
    }

    public final void save() {
        getSettingsStorage().save();
    }

    public final void setLimits(String str, String str2, Long l, Long l2, Long l3) {
        MapBuilder mapBuilder = new MapBuilder();
        ConfigStorageKt.putShutdownMs(mapBuilder, "system.shutdown.until.ts", l);
        ConfigStorageKt.putShutdownMs(mapBuilder, "system." + str + ".shutdown.until.ts", l2);
        if (str2 != null) {
            ConfigStorageKt.putShutdownMs(mapBuilder, ss9.a("system.", str, ".", str2, ".shutdown.until.ts"), l3);
        }
        getSettingsStorage().putAll(mapBuilder.h());
    }
}
