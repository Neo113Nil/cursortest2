package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes15.dex */
public interface SummarySession {

    public interface SummaryListener {
        void onMasstransitSummaries(List<Summary> list);

        void onMasstransitSummariesError(Error error);
    }

    void cancel();

    void retry(SummaryListener summaryListener);
}
