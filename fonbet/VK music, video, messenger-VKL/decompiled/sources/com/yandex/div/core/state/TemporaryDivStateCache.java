package com.yandex.div.core.state;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.s3q0;

/* compiled from: TemporaryDivStateCache.kt */
/* loaded from: classes7.dex */
public final class TemporaryDivStateCache {
    private final Map<String, Map<String, String>> temporaryCache = new LinkedHashMap();

    public final String getState(String str, String str2) {
        String str3;
        synchronized (this.temporaryCache) {
            Map<String, String> map = this.temporaryCache.get(str);
            str3 = map != null ? map.get(str2) : null;
        }
        return str3;
    }

    public final void putRootState(String str, String str2) {
        putState(str, DomExceptionUtils.SEPARATOR, str2);
    }

    public final void putState(String str, String str2, String str3) {
        synchronized (this.temporaryCache) {
            try {
                Map<String, Map<String, String>> map = this.temporaryCache;
                Map<String, String> map2 = map.get(str);
                if (map2 == null) {
                    map2 = new LinkedHashMap<>();
                    map.put(str, map2);
                }
                map2.put(str2, str3);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map<String, String> resetCard(String str) {
        Map<String, String> remove;
        synchronized (this.temporaryCache) {
            remove = this.temporaryCache.remove(str);
        }
        return remove;
    }
}
