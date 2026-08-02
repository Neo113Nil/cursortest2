package com.yandex.runtime.recording;

/* loaded from: classes7.dex */
public interface EventLogging {
    boolean isValid();

    void subscribe(EventListener eventListener);

    void subscribe(EventListener eventListener, LoggingLevel loggingLevel);

    void unsubscribe(EventListener eventListener);
}
