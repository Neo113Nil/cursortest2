package com.yandex.mapkit.experiments;

import com.yandex.runtime.config.ExperimentData;
import java.util.List;

/* loaded from: classes15.dex */
public interface TestBucketsProvider {
    Integer getExperimentsRegionId();

    List<ExperimentData> getTestBuckets();

    boolean isValid();

    void subscribe(TestBucketsListener testBucketsListener);

    void unsubscribe(TestBucketsListener testBucketsListener);
}
