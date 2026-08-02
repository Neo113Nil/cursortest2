package io.appmetrica.analytics.coreapi.internal.data;

import java.util.Collection;

/* loaded from: classes8.dex */
public interface TempCacheStorage {

    public interface Entry {
        byte[] getData();

        long getId();

        String getScope();

        long getTimestamp();
    }

    Entry get(String str);

    Collection<Entry> get(String str, int i);

    long put(String str, long j, byte[] bArr);

    void remove(long j);

    void removeOlderThan(String str, long j);
}
