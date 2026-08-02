package com.yandex.runtime.network.internal;

import com.yandex.runtime.Error;

/* loaded from: classes2.dex */
public interface FileOperationsListener {
    void onError(Error error);

    void onSuccess();
}
