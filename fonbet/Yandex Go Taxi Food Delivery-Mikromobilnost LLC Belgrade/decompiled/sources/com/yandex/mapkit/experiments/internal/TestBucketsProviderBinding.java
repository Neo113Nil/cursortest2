package com.yandex.mapkit.experiments.internal;

import com.yandex.mapkit.experiments.TestBucketsListener;
import com.yandex.mapkit.experiments.TestBucketsProvider;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.config.ExperimentData;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes15.dex */
public class TestBucketsProviderBinding implements TestBucketsProvider {
    private final NativeObject nativeObject;
    protected Subscription<TestBucketsListener> testBucketsListenerSubscription = new Subscription<TestBucketsListener>(this) { // from class: com.yandex.mapkit.experiments.internal.TestBucketsProviderBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(TestBucketsListener testBucketsListener) {
            return TestBucketsProviderBinding.createTestBucketsListener(testBucketsListener);
        }
    };

    public TestBucketsProviderBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createTestBucketsListener(TestBucketsListener testBucketsListener);

    @Override // com.yandex.mapkit.experiments.TestBucketsProvider
    public native Integer getExperimentsRegionId();

    @Override // com.yandex.mapkit.experiments.TestBucketsProvider
    public native List<ExperimentData> getTestBuckets();

    @Override // com.yandex.mapkit.experiments.TestBucketsProvider
    public native boolean isValid();

    @Override // com.yandex.mapkit.experiments.TestBucketsProvider
    public native void subscribe(TestBucketsListener testBucketsListener);

    @Override // com.yandex.mapkit.experiments.TestBucketsProvider
    public native void unsubscribe(TestBucketsListener testBucketsListener);
}
