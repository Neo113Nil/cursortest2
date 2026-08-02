package ru.ok.tracer.utils.config;

import java.util.Map;
import ru.ok.tracer.utils.SimpleFileKeyValueStorage;

/* compiled from: ConfigStorage.kt */
/* loaded from: classes9.dex */
public final class ConfigStorageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isShutdown(SimpleFileKeyValueStorage simpleFileKeyValueStorage, String str) {
        Long l = simpleFileKeyValueStorage.getLong(str);
        return l != null && System.currentTimeMillis() < l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void putShutdownMs(Map<String, Object> map, String str, Long l) {
        Long l2 = null;
        if (l != null && l.longValue() > 0) {
            l2 = Long.valueOf(l.longValue() + System.currentTimeMillis());
        }
        map.put(str, l2);
    }
}
