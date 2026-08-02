package com.yandex.runtime.network.internal;

/* loaded from: classes2.dex */
public interface NetworkPlayer {
    boolean isValid();

    void play(String str, FileOperationsListener fileOperationsListener);

    void stop();
}
