package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface LineSession {

    /* loaded from: classes6.dex */
    public interface LineListener {
        void onLineError(Error error);

        void onLineResponse(LineInfo lineInfo);
    }

    void cancel();

    void retry(LineListener lineListener);
}
