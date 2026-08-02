package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.images.ImageUrlProvider;
import com.yandex.mapkit.map.BaseDataSourceBuilder;
import com.yandex.mapkit.resource_url_provider.ResourceUrlProvider;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class BaseDataSourceBuilderBinding implements BaseDataSourceBuilder {
    private final NativeObject nativeObject;
    protected Subscription<ImageUrlProvider> imageUrlProviderSubscription = new Subscription<ImageUrlProvider>(this) { // from class: com.yandex.mapkit.map.internal.BaseDataSourceBuilderBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(ImageUrlProvider imageUrlProvider) {
            return BaseDataSourceBuilderBinding.createImageUrlProvider(imageUrlProvider);
        }
    };
    protected Subscription<ResourceUrlProvider> resourceUrlProviderSubscription = new Subscription<ResourceUrlProvider>(this) { // from class: com.yandex.mapkit.map.internal.BaseDataSourceBuilderBinding.2
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(ResourceUrlProvider resourceUrlProvider) {
            return BaseDataSourceBuilderBinding.createResourceUrlProvider(resourceUrlProvider);
        }
    };

    public BaseDataSourceBuilderBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createImageUrlProvider(ImageUrlProvider imageUrlProvider);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createResourceUrlProvider(ResourceUrlProvider resourceUrlProvider);

    @Override // com.yandex.mapkit.map.BaseDataSourceBuilder
    public native boolean isHasSharedIds();

    @Override // com.yandex.mapkit.map.BaseDataSourceBuilder
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.BaseDataSourceBuilder
    public native void setGLTFModelUrlProvider(ResourceUrlProvider resourceUrlProvider);

    @Override // com.yandex.mapkit.map.BaseDataSourceBuilder
    public native void setHasSharedIds(boolean z);

    @Override // com.yandex.mapkit.map.BaseDataSourceBuilder
    public native void setImageUrlProvider(ImageUrlProvider imageUrlProvider);

    @Override // com.yandex.mapkit.map.BaseDataSourceBuilder
    public native void setModelUrlProvider(ResourceUrlProvider resourceUrlProvider);
}
