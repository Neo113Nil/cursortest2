package defpackage;

import android.location.Location;
import com.yandex.go.explorer.impl.data.models.CoordinateDto;
import com.yandex.go.explorer.impl.data.models.LocationEntryDto;

/* loaded from: classes12.dex */
public final class duo {
    public static LocationEntryDto a(Location location) {
        Double d;
        Double d2;
        double d3;
        CoordinateDto coordinateDto = new CoordinateDto(location.getLatitude(), location.getLongitude());
        long time = location.getTime() / 1000;
        Double valueOf = Double.valueOf(location.getAccuracy());
        if (!location.hasAccuracy()) {
            valueOf = null;
        }
        double doubleValue = valueOf != null ? valueOf.doubleValue() : 0.0d;
        Double valueOf2 = Double.valueOf(location.getSpeed());
        if (!location.hasSpeed()) {
            valueOf2 = null;
        }
        double doubleValue2 = valueOf2 != null ? valueOf2.doubleValue() : 0.0d;
        Double valueOf3 = Double.valueOf(location.getBearing());
        if (!location.hasBearing()) {
            valueOf3 = null;
        }
        Double valueOf4 = Double.valueOf(location.getVerticalAccuracyMeters());
        if (!location.hasVerticalAccuracy()) {
            valueOf4 = null;
        }
        Double valueOf5 = Double.valueOf(location.getAltitude());
        if (location.hasAltitude()) {
            d2 = valueOf4;
            d3 = doubleValue;
            d = valueOf3;
        } else {
            valueOf5 = null;
            double d4 = doubleValue;
            d = valueOf3;
            d2 = valueOf4;
            d3 = d4;
        }
        return new LocationEntryDto(coordinateDto, time, d3, doubleValue2, d, d2, valueOf5);
    }
}
