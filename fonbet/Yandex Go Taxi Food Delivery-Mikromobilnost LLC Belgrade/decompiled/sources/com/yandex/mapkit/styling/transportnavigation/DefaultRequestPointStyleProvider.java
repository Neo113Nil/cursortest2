package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.navigation.transport.layer.RequestPointStyleProvider;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.mapkit.styling.transportnavigation.DrawableUtils;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJQ\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/DefaultRequestPointStyleProvider;", "Lcom/yandex/mapkit/navigation/transport/layer/RequestPointStyleProvider;", "Landroid/content/Context;", "defaultContext", "<init>", "(Landroid/content/Context;)V", "", "scaleFactor", "", "isNightMode", "", "indoorLevelName", "Lcom/yandex/mapkit/styling/transportnavigation/DrawableUtils$ImageWithAnchor;", "getImageWithAnchor", "(FZLjava/lang/String;)Lcom/yandex/mapkit/styling/transportnavigation/DrawableUtils$ImageWithAnchor;", "", "requestPointIndex", "requestPointsSize", "Lcom/yandex/mapkit/RequestPointType;", "requestPoint", "selected", "Lcom/yandex/mapkit/styling/PlacemarkStyle;", "style", "Lzy11;", "provideIconsStyle", "(IILcom/yandex/mapkit/RequestPointType;Ljava/lang/String;FZZLcom/yandex/mapkit/styling/PlacemarkStyle;)V", "context", "Landroid/content/Context;", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DefaultRequestPointStyleProvider implements RequestPointStyleProvider {
    private final Context context;

    public DefaultRequestPointStyleProvider(Context context) {
        this.context = LocalizedContextKt.localizedContext(context);
    }

    private final DrawableUtils.ImageWithAnchor getImageWithAnchor(float scaleFactor, boolean isNightMode, String indoorLevelName) {
        String localizeLabel;
        int i = isNightMode ? R.drawable.mapkit_styling_transport_waypoint_night : R.drawable.mapkit_styling_transport_waypoint_day;
        Context context = this.context;
        if (indoorLevelName == null) {
            return new DrawableUtils.ImageWithAnchor(DrawableUtils.createImageProvider(context, i, true, scaleFactor), new PointF(0.5f, 0.5f));
        }
        localizeLabel = DefaultRequestPointStyleProviderKt.localizeLabel(context, indoorLevelName);
        return DrawableUtils.INSTANCE.generateImageWithLabel(this.context, i, localizeLabel, scaleFactor, isNightMode, indoorLevelName);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RequestPointStyleProvider
    public void provideIconsStyle(int requestPointIndex, int requestPointsSize, RequestPointType requestPoint, String indoorLevelName, float scaleFactor, boolean selected, boolean isNightMode, PlacemarkStyle style) {
        if (!selected) {
            scaleFactor /= 2.0f;
        }
        DrawableUtils.ImageWithAnchor imageWithAnchor = getImageWithAnchor(scaleFactor, isNightMode, indoorLevelName);
        style.setImage(imageWithAnchor.getImageProvider());
        style.setIconAnchor(imageWithAnchor.getAnchor());
    }
}
