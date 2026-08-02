package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.layers.DataSourceLayer;
import com.yandex.mapkit.layers.LayerOptions;
import com.yandex.mapkit.map.DataSourceFactory;
import com.yandex.mapkit.map.DataSourceLayerFactory;
import com.yandex.mapkit.map.TileDataSourceFactory;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class DataSourceLayerFactoryBinding implements DataSourceLayerFactory {
    private final NativeObject nativeObject;
    protected Subscription<DataSourceFactory> dataSourceFactorySubscription = new Subscription<DataSourceFactory>(this) { // from class: com.yandex.mapkit.map.internal.DataSourceLayerFactoryBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(DataSourceFactory dataSourceFactory) {
            return DataSourceLayerFactoryBinding.createDataSourceFactory(dataSourceFactory);
        }
    };
    protected Subscription<TileDataSourceFactory> tileDataSourceFactorySubscription = new Subscription<TileDataSourceFactory>(this) { // from class: com.yandex.mapkit.map.internal.DataSourceLayerFactoryBinding.2
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(TileDataSourceFactory tileDataSourceFactory) {
            return DataSourceLayerFactoryBinding.createTileDataSourceFactory(tileDataSourceFactory);
        }
    };

    public DataSourceLayerFactoryBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createDataSourceFactory(DataSourceFactory dataSourceFactory);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createTileDataSourceFactory(TileDataSourceFactory tileDataSourceFactory);

    @Override // com.yandex.mapkit.map.DataSourceLayerFactory
    public native DataSourceLayer addLayer(String str, DataSourceFactory dataSourceFactory);

    @Override // com.yandex.mapkit.map.DataSourceLayerFactory
    public native DataSourceLayer addTileLayer(String str, LayerOptions layerOptions, TileDataSourceFactory tileDataSourceFactory);

    @Override // com.yandex.mapkit.map.DataSourceLayerFactory
    public native boolean isValid();
}
