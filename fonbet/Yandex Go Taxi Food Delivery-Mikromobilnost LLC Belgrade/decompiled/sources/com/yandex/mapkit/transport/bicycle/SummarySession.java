package com.yandex.mapkit.transport.bicycle;

import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes15.dex */
public interface SummarySession {

    public interface SummaryListener {
        void onBicycleSummaries(List<Summary> list);

        void onBicycleSummariesError(Error error);
    }

    void cancel();

    void retry(SummaryListener summaryListener);
}
