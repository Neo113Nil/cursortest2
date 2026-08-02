package com.bumptech.glide.request;

/* loaded from: classes10.dex */
public enum RequestCoordinator$RequestState {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    private final boolean isComplete;

    RequestCoordinator$RequestState(boolean z) {
        this.isComplete = z;
    }

    public final boolean a() {
        return this.isComplete;
    }
}
