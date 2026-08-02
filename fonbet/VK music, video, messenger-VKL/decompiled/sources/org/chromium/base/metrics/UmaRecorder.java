package org.chromium.base.metrics;

import java.util.List;
import org.chromium.base.Callback;

/* loaded from: classes8.dex */
public interface UmaRecorder {
    void addUserActionCallbackForTesting(Callback<String> callback);

    List<HistogramBucket> getHistogramSamplesForTesting(String str);

    int getHistogramTotalCountForTesting(String str);

    int getHistogramValueCountForTesting(String str, int i);

    void recordBooleanHistogram(String str, boolean z);

    void recordExponentialHistogram(String str, int i, int i2, int i3, int i4);

    void recordLinearHistogram(String str, int i, int i2, int i3, int i4);

    void recordSparseHistogram(String str, int i);

    void recordUserAction(String str, long j);

    void removeUserActionCallbackForTesting(Callback<String> callback);
}
