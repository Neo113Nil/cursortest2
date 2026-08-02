package com.yandex.mapkit.styling.transportnavigation;

import com.yandex.mapkit.navigation.transport.layer.balloons.RouteSummaryDifference;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\r"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/SummaryConvertors;", "", "timeToString", "", RemoteBioParameters.TIME, "", "timeDifferenceToString", "difference", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/RouteSummaryDifference$Pair;", "distanceToString", "distance", "neglectableTimeDifference", "", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SummaryConvertors {
    String distanceToString(double distance);

    boolean neglectableTimeDifference(RouteSummaryDifference.Pair difference);

    String timeDifferenceToString(RouteSummaryDifference.Pair difference);

    String timeToString(double time);
}
