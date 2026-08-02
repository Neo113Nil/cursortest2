package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.layers.internal.LayerBinding;
import com.yandex.mapkit.map.CompositeLayer;
import com.yandex.mapkit.map.DataSourceLayerFactory;
import com.yandex.mapkit.resource_url_provider.ResourceUrlProvider;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class CompositeLayerBinding extends LayerBinding implements CompositeLayer {
    protected Subscription<ResourceUrlProvider> resourceUrlProviderSubscription;

    public CompositeLayerBinding(NativeObject nativeObject) {
        super(nativeObject);
        this.resourceUrlProviderSubscription = new Subscription<ResourceUrlProvider>(this) { // from class: com.yandex.mapkit.map.internal.CompositeLayerBinding.1
            @Override // com.yandex.runtime.subscription.Subscription
            public NativeObject createNativeListener(ResourceUrlProvider resourceUrlProvider) {
                return CompositeLayerBinding.createResourceUrlProvider(resourceUrlProvider);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createResourceUrlProvider(ResourceUrlProvider resourceUrlProvider);

    @Override // com.yandex.mapkit.map.CompositeLayer
    public native DataSourceLayerFactory getDataSourceLayerFactory();

    @Override // com.yandex.mapkit.map.CompositeLayer
    public native boolean isSkyEnabled();

    @Override // com.yandex.mapkit.map.CompositeLayer
    public native void setIndoorPlanUrlProvider(ResourceUrlProvider resourceUrlProvider);

    @Override // com.yandex.mapkit.map.CompositeLayer
    public native void setSkyEnabled(boolean z);

    @Override // com.yandex.mapkit.map.CompositeLayer
    public native void setStyle(byte[] bArr);
}
