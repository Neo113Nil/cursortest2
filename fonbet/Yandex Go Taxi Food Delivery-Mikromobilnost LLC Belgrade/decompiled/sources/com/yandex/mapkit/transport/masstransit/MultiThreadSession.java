package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes15.dex */
public interface MultiThreadSession {

    public interface MultiThreadListener {
        void onMultiThreadError(Error error);

        void onMultiThreadResponse(List<ThreadInfo> list);
    }

    void cancel();

    void retry(MultiThreadListener multiThreadListener);
}
