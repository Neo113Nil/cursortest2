package com.yandex.runtime.logging;

/* loaded from: classes2.dex */
public interface Logging {
    boolean isValid();

    void subscribe(LogListener logListener);

    void unsubscribe(LogListener logListener);
}
