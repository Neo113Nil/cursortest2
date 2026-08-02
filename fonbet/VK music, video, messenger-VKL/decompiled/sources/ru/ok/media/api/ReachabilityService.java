package ru.ok.media.api;

/* compiled from: ReachabilityService.kt */
/* loaded from: classes9.dex */
public interface ReachabilityService {

    /* compiled from: ReachabilityService.kt */
    public interface Listener {
        void onReachabilityChanged();
    }

    void addListener(Listener listener);

    boolean isReachable();

    void release();

    void removeListener(Listener listener);
}
