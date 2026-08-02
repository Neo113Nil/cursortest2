package com.yandex.mapkit.transport.time;

/* loaded from: classes15.dex */
public interface AdjustedClock {
    boolean isValid();

    long now();

    void pause();

    void resume();
}
