package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface ThreadSession {

    /* loaded from: classes6.dex */
    public interface ThreadListener {
        void onThreadError(Error error);

        void onThreadResponse(ThreadInfo threadInfo);
    }

    void cancel();

    void retry(ThreadListener threadListener);
}
