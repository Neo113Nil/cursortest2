package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import com.yandex.mapkit.map.ModelStyle;
import com.yandex.mapkit.navigation.transport.layer.AccuracyCircleStyle;
import com.yandex.mapkit.navigation.transport.layer.UserLocationIconStyle;
import com.yandex.mapkit.navigation.transport.layer.UserLocationStyleProvider;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.model.ModelProvider;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/DefaultUserLocationStyleProvider;", "Lcom/yandex/mapkit/navigation/transport/layer/UserLocationStyleProvider;", "Landroid/content/Context;", "defaultContext", "<init>", "(Landroid/content/Context;)V", "", "scaleFactor", "", "isNightMode", "Lcom/yandex/mapkit/navigation/transport/layer/UserLocationIconStyle;", "style", "Lzy11;", "provideIconStyle", "(FZLcom/yandex/mapkit/navigation/transport/layer/UserLocationIconStyle;)V", "Lcom/yandex/mapkit/navigation/transport/layer/AccuracyCircleStyle;", "provideAccuracyCircleStyle", "(ZLcom/yandex/mapkit/navigation/transport/layer/AccuracyCircleStyle;)V", "context", "Landroid/content/Context;", "", "blackAlpha16", CA20Status.STATUS_USER_I, "blackAlpha32", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DefaultUserLocationStyleProvider implements UserLocationStyleProvider {
    private final int blackAlpha16;
    private final int blackAlpha32;
    private final Context context;

    public DefaultUserLocationStyleProvider(Context context) {
        Context localizedContext = LocalizedContextKt.localizedContext(context);
        this.context = localizedContext;
        this.blackAlpha16 = localizedContext.getColor(R.color.mapkit_styling_transport_black_alpha_16);
        this.blackAlpha32 = localizedContext.getColor(R.color.mapkit_styling_transport_black_alpha_32);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.UserLocationStyleProvider
    public void provideAccuracyCircleStyle(boolean isNightMode, AccuracyCircleStyle style) {
        style.setFillColor(this.blackAlpha16);
        style.setStrokeColor(this.blackAlpha32);
        style.setStrokeWidth(1.0f);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.UserLocationStyleProvider
    public void provideIconStyle(float scaleFactor, boolean isNightMode, UserLocationIconStyle style) {
        ModelProvider fromResource = ModelProvider.fromResource(this.context, R.raw.mapkit_styling_transport_user_placemark, ImageProvider.fromResource(this.context, R.drawable.mapkit_styling_transport_user_placemark));
        float pixelsPerPoint = (scaleFactor / DrawableUtils.INSTANCE.pixelsPerPoint(this.context)) * 75.0f;
        PlacemarkStyle arrowStyle = style.arrowStyle();
        ModelStyle.UnitType unitType = ModelStyle.UnitType.NORMALIZED;
        ModelStyle.RenderMode renderMode = ModelStyle.RenderMode.USER_MODEL;
        arrowStyle.setModel(fromResource, new ModelStyle(pixelsPerPoint, unitType, renderMode, null));
        style.pinStyle().setModel(fromResource, new ModelStyle(pixelsPerPoint, unitType, renderMode, null));
    }
}
