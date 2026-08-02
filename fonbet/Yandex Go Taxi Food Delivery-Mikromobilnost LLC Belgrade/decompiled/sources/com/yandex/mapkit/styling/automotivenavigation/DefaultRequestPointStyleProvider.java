package com.yandex.mapkit.styling.automotivenavigation;

import android.content.Context;
import android.graphics.PointF;
import android.util.TypedValue;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayerMode;
import com.yandex.mapkit.navigation.automotive.layer.styling.RequestPointStyleProvider;
import com.yandex.mapkit.styling.PlacemarkStyle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JO\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/DefaultRequestPointStyleProvider;", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/RequestPointStyleProvider;", "Landroid/content/Context;", "defaultContext", "<init>", "(Landroid/content/Context;)V", "", "requestPointIndex", "requestPointsNumber", "Lcom/yandex/mapkit/RequestPointType;", "requestPointType", "", "scaleFactor", "", "isSelected", "isNightMode", "Lcom/yandex/mapkit/navigation/automotive/layer/NavigationLayerMode;", "navigationLayerMode", "Lcom/yandex/mapkit/styling/PlacemarkStyle;", "style", "Lzy11;", "provideStyle", "(IILcom/yandex/mapkit/RequestPointType;FZZLcom/yandex/mapkit/navigation/automotive/layer/NavigationLayerMode;Lcom/yandex/mapkit/styling/PlacemarkStyle;)V", "context", "Landroid/content/Context;", "Companion", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DefaultRequestPointStyleProvider implements RequestPointStyleProvider {
    private static final float REQUEST_POINT_SCALE = 1.0f;
    private final Context context;

    public DefaultRequestPointStyleProvider(Context context) {
        this.context = LocalizedContextKt.localizedContext(context);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RequestPointStyleProvider
    public void provideStyle(int requestPointIndex, int requestPointsNumber, RequestPointType requestPointType, float scaleFactor, boolean isSelected, boolean isNightMode, NavigationLayerMode navigationLayerMode, PlacemarkStyle style) {
        style.setImage(DrawableUtils.createImageProvider(this.context, requestPointIndex == 0 ? R.drawable.mapkit_styling_automotive_route_start_point : requestPointIndex == requestPointsNumber + (-1) ? R.drawable.mapkit_styling_automotive_route_finish_point : R.drawable.mapkit_styling_automotive_route_via_point, true, 1.0f, scaleFactor));
        if (requestPointIndex == 0 || requestPointIndex == requestPointsNumber - 1) {
            TypedValue typedValue = new TypedValue();
            this.context.getResources().getValue(R.dimen.mapkit_styling_automotive_route_start_end_anchor_y, typedValue, true);
            style.setIconAnchor(new PointF(0.5f, typedValue.getFloat()));
        }
    }
}
