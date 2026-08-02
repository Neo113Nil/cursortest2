package com.yandex.runtime.network.internal;

/* loaded from: classes2.dex */
public interface NetworkRecorder {
    void dump(String str, FileOperationsListener fileOperationsListener);

    boolean isValid();

    void start();

    void stop();
}
