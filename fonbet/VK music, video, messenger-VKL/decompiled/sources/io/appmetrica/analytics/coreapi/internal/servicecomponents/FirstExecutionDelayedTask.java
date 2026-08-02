package io.appmetrica.analytics.coreapi.internal.servicecomponents;

/* loaded from: classes8.dex */
public interface FirstExecutionDelayedTask {
    void setInitialDelaySeconds(long j);

    boolean tryExecute(long j);
}
