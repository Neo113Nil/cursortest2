package com.yandex.mapkit.styling.automotivenavigation;

import android.content.Context;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayerMode;
import com.yandex.mapkit.navigation.automotive.layer.styling.UserPlacemarkStyleProvider;
import com.yandex.mapkit.styling.PlacemarkStyle;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/DefaultUserPlacemarkStyleProvider;", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/UserPlacemarkStyleProvider;", "Landroid/content/Context;", "defaultContext", "<init>", "(Landroid/content/Context;)V", "", "scaleFactor", "", "isNightMode", "Lcom/yandex/mapkit/navigation/automotive/layer/NavigationLayerMode;", "navigationLayerMode", "Lcom/yandex/mapkit/styling/PlacemarkStyle;", "style", "Lzy11;", "provideStyle", "(FZLcom/yandex/mapkit/navigation/automotive/layer/NavigationLayerMode;Lcom/yandex/mapkit/styling/PlacemarkStyle;)V", "context", "Landroid/content/Context;", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DefaultUserPlacemarkStyleProvider implements UserPlacemarkStyleProvider {
    private final Context context;

    public DefaultUserPlacemarkStyleProvider(Context context) {
        this.context = LocalizedContextKt.localizedContext(context);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.UserPlacemarkStyleProvider
    public void provideStyle(float scaleFactor, boolean isNightMode, NavigationLayerMode navigationLayerMode, PlacemarkStyle style) {
        style.setArrowModel();
    }
}
