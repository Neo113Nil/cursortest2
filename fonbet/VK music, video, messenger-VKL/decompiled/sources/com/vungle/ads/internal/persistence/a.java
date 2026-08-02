package com.vungle.ads.internal.persistence;

import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.util.PathProvider;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class a {
    public final synchronized FilePreferences a(j jVar, PathProvider pathProvider, String str) {
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        Object putIfAbsent;
        try {
            concurrentHashMap = FilePreferences.e;
            obj = concurrentHashMap.get(str);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new FilePreferences(jVar, pathProvider, str, 0)))) != null) {
                obj = putIfAbsent;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (FilePreferences) obj;
    }
}
