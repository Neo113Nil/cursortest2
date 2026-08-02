package defpackage;

import com.yandex.go.walking.navigation.impl.ui.overlay.WaypointType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.location.Location;
import com.yandex.runtime.image.ImageProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lg541;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface g541 extends l050 {
    void P0(Location location);

    void o4(WaypointType waypointType, boolean z);

    void pause();

    void resume();

    void xc(Point point, ImageProvider imageProvider, WaypointType waypointType);
}
