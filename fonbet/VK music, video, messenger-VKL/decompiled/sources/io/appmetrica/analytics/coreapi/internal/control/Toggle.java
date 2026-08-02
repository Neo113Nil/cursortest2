package io.appmetrica.analytics.coreapi.internal.control;

/* loaded from: classes8.dex */
public interface Toggle {
    boolean getActualState();

    void registerObserver(ToggleObserver toggleObserver, boolean z);

    void removeObserver(ToggleObserver toggleObserver);
}
