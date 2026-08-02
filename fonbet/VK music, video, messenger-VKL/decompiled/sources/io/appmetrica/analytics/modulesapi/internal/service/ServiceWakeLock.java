package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes8.dex */
public interface ServiceWakeLock {
    boolean acquireWakeLock(String str);

    void releaseWakeLock(String str);
}
