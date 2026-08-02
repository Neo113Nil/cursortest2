package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import com.yandex.mapkit.navigation.transport.layer.balloons.RouteSummaryDifference;
import com.yandex.runtime.i18n.I18nManagerFactory;
import defpackage.b64;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/DefaultConvertors;", "Lcom/yandex/mapkit/styling/transportnavigation/SummaryConvertors;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "timeToString", "", RemoteBioParameters.TIME, "", "timeDifferenceToString", "difference", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/RouteSummaryDifference$Pair;", "distanceToString", "distance", "neglectableTimeDifference", "", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultConvertors implements SummaryConvertors {
    private final Context context;

    public DefaultConvertors(Context context) {
        this.context = context;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SummaryConvertors
    public String distanceToString(double distance) {
        return I18nManagerFactory.getI18nManagerInstance().localizeDistance(Math.abs((int) distance));
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SummaryConvertors
    public boolean neglectableTimeDifference(RouteSummaryDifference.Pair difference) {
        return Math.abs(difference.getBallonValue() - difference.getSelectedRouteValue()) < 60.0d;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SummaryConvertors
    public String timeDifferenceToString(RouteSummaryDifference.Pair difference) {
        double ballonValue = difference.getBallonValue() - difference.getSelectedRouteValue();
        return b64.j(this.context.getString(ballonValue < 0.0d ? R.string.mapkit_styling_transport_alternative_minus_sign : R.string.mapkit_styling_transport_alternative_plus_sign), timeToString(ballonValue));
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SummaryConvertors
    public String timeToString(double time) {
        return I18nManagerFactory.getI18nManagerInstance().localizeDuration(Math.abs((int) time));
    }
}
