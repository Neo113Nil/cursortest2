package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.ZoomRange;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.layers.TileFormat;
import com.yandex.mapkit.map.TileDataSourceBuilder;
import com.yandex.mapkit.tiles.TileProvider;
import com.yandex.mapkit.tiles.UrlProvider;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes15.dex */
public class TileDataSourceBuilderBinding extends BaseDataSourceBuilderBinding implements TileDataSourceBuilder {
    protected Subscription<TileProvider> tileProviderSubscription;
    protected Subscription<UrlProvider> urlProviderSubscription;

    public TileDataSourceBuilderBinding(NativeObject nativeObject) {
        super(nativeObject);
        this.tileProviderSubscription = new Subscription<TileProvider>(this) { // from class: com.yandex.mapkit.map.internal.TileDataSourceBuilderBinding.1
            @Override // com.yandex.runtime.subscription.Subscription
            public NativeObject createNativeListener(TileProvider tileProvider) {
                return TileDataSourceBuilderBinding.createTileProvider(tileProvider);
            }
        };
        this.urlProviderSubscription = new Subscription<UrlProvider>(this) { // from class: com.yandex.mapkit.map.internal.TileDataSourceBuilderBinding.2
            @Override // com.yandex.runtime.subscription.Subscription
            public NativeObject createNativeListener(UrlProvider urlProvider) {
                return TileDataSourceBuilderBinding.createUrlProvider(urlProvider);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createTileProvider(TileProvider tileProvider);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createUrlProvider(UrlProvider urlProvider);

    @Override // com.yandex.mapkit.map.TileDataSourceBuilder
    public native void setProjection(Projection projection);

    @Override // com.yandex.mapkit.map.TileDataSourceBuilder
    public native void setTileFormat(TileFormat tileFormat);

    @Override // com.yandex.mapkit.map.TileDataSourceBuilder
    public native void setTileProvider(TileProvider tileProvider);

    @Override // com.yandex.mapkit.map.TileDataSourceBuilder
    public native void setTileUrlProvider(UrlProvider urlProvider);

    @Override // com.yandex.mapkit.map.TileDataSourceBuilder
    public native void setZoomRanges(List<ZoomRange> list);
}
