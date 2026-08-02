package ru.ok.media.api;

/* loaded from: classes9.dex */
public interface PublisherStateChangeListener {
    void handleBandwidthChanged(long j);

    void handleError(int i);

    void handleRetrying();

    void handleStarted();

    void handleStopped();
}
