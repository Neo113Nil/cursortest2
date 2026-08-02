package io.appmetrica.analytics.coreapi.internal.cache;

/* loaded from: classes8.dex */
public interface CacheUpdateScheduler {
    void onStateUpdated();

    void scheduleUpdateIfNeededNow();
}
