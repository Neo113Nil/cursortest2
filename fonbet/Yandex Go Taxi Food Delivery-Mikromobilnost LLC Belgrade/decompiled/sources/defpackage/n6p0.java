package defpackage;

import com.yandex.mapkit.map.ModelStyle;
import com.yandex.mapkit.navigation.transport.layer.AccuracyCircleStyle;
import com.yandex.mapkit.navigation.transport.layer.UserLocationIconStyle;
import com.yandex.mapkit.navigation.transport.layer.UserLocationStyleProvider;

/* loaded from: classes15.dex */
public final class n6p0 implements UserLocationStyleProvider {
    public final UserLocationStyleProvider a;
    public final vr b;

    public n6p0(UserLocationStyleProvider userLocationStyleProvider, vr vrVar) {
        this.a = userLocationStyleProvider;
        this.b = vrVar;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.UserLocationStyleProvider
    public final void provideAccuracyCircleStyle(boolean z, AccuracyCircleStyle accuracyCircleStyle) {
        this.a.provideAccuracyCircleStyle(z, accuracyCircleStyle);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.UserLocationStyleProvider
    public final void provideIconStyle(float f, boolean z, UserLocationIconStyle userLocationIconStyle) {
        ModelStyle modelStyle = new ModelStyle(24.0f, ModelStyle.UnitType.UNIT, ModelStyle.RenderMode.USER_MODEL, null);
        me0 me0Var = new me0(this.b.a.getApplicationContext(), (byte) 0);
        userLocationIconStyle.arrowStyle().setGltfModel(me0Var, modelStyle);
        userLocationIconStyle.pinStyle().setGltfModel(me0Var, modelStyle);
    }
}
