package defpackage;

import android.location.Location;
import android.os.SystemClock;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import ru.yandex.taxi.locationsdk.core.location.SpoofingType;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationType;

/* loaded from: classes9.dex */
public final class fa2 {
    public final ja2 a;

    public fa2(c7z c7zVar, ja2 ja2Var) {
        this.a = ja2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k7z a(Location location) {
        AndroidLocationType androidLocationType;
        int i;
        String str;
        Double valueOf;
        Float valueOf2;
        Float valueOf3;
        Float valueOf4;
        String provider = location.getProvider();
        if (provider != null) {
            int hashCode = provider.hashCode();
            if (hashCode != 102570) {
                if (hashCode != 97798435) {
                    if (hashCode == 1843485230 && provider.equals("network")) {
                        androidLocationType = AndroidLocationType.Network;
                        i = ia2.a[androidLocationType.ordinal()];
                        ja2 ja2Var = this.a;
                        if (i == 1) {
                            str = ja2Var.a;
                        } else if (i == 2) {
                            str = ja2Var.b;
                        } else {
                            if (i != 3) {
                                w511.b();
                                return null;
                            }
                            str = ja2Var.c;
                        }
                        long elapsedRealtimeNanos = location.getElapsedRealtimeNanos() / 1000000;
                        ajc ajcVar = new ajc(elapsedRealtimeNanos, (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + elapsedRealtimeNanos);
                        yzs yzsVar = new yzs(location.getLatitude(), location.getLongitude());
                        float accuracy = location.getAccuracy();
                        Float valueOf5 = Float.valueOf(accuracy);
                        if (location.hasAccuracy() || Math.abs(accuracy) > Float.MAX_VALUE) {
                            valueOf5 = null;
                        }
                        p6z p6zVar = new p6z(yzsVar, valueOf5 != null ? new u1k(valueOf5.doubleValue()) : null);
                        double altitude = location.getAltitude();
                        valueOf = Double.valueOf(altitude);
                        if (location.hasAltitude() || Math.abs(altitude) > Double.MAX_VALUE) {
                            valueOf = null;
                        }
                        u1k u1kVar = valueOf != null ? new u1k(valueOf.doubleValue()) : null;
                        float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                        Float valueOf6 = Float.valueOf(verticalAccuracyMeters);
                        if (location.hasVerticalAccuracy() || Math.abs(verticalAccuracyMeters) > Float.MAX_VALUE || verticalAccuracyMeters <= 0.0f) {
                            valueOf6 = null;
                        }
                        r6z r6zVar = new r6z(u1kVar, valueOf6 != null ? new u1k(valueOf6.doubleValue()) : null, 4);
                        float speed = location.getSpeed();
                        valueOf2 = Float.valueOf(speed);
                        if (location.hasSpeed() || Math.abs(speed) > Float.MAX_VALUE || speed < 0.0f) {
                            valueOf2 = null;
                        }
                        jpt0 jpt0Var = valueOf2 != null ? new jpt0(valueOf2.doubleValue()) : null;
                        float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                        valueOf3 = Float.valueOf(speedAccuracyMetersPerSecond);
                        if (location.hasSpeedAccuracy() || Math.abs(speedAccuracyMetersPerSecond) > Float.MAX_VALUE || speedAccuracyMetersPerSecond <= 0.0f) {
                            valueOf3 = null;
                        }
                        jpt0 jpt0Var2 = valueOf3 != null ? new jpt0(valueOf3.doubleValue()) : null;
                        float bearing = location.getBearing();
                        valueOf4 = Float.valueOf(bearing);
                        if (location.hasBearing() || bearing < 0.0f || bearing >= 360.0f) {
                            valueOf4 = null;
                        }
                        td2 td2Var = valueOf4 != null ? new td2(valueOf4.doubleValue()) : null;
                        float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                        Float valueOf7 = Float.valueOf(bearingAccuracyDegrees);
                        if (location.hasBearingAccuracy() || Math.abs(bearingAccuracyDegrees) > Float.MAX_VALUE || bearingAccuracyDegrees <= 0.0f) {
                            valueOf7 = null;
                        }
                        return new k7z(ajcVar, p6zVar, r6zVar, new o6z(jpt0Var, jpt0Var2, td2Var, valueOf7 != null ? new td2(valueOf7.doubleValue()) : null), new ga2(androidLocationType, SpoofingType.None, tje.K(location), str));
                    }
                } else if (provider.equals(GplLibraryWrapper.FUSED_PROVIDER)) {
                    androidLocationType = AndroidLocationType.Fused;
                    i = ia2.a[androidLocationType.ordinal()];
                    ja2 ja2Var2 = this.a;
                    if (i == 1) {
                    }
                    long elapsedRealtimeNanos2 = location.getElapsedRealtimeNanos() / 1000000;
                    ajc ajcVar2 = new ajc(elapsedRealtimeNanos2, (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + elapsedRealtimeNanos2);
                    yzs yzsVar2 = new yzs(location.getLatitude(), location.getLongitude());
                    float accuracy2 = location.getAccuracy();
                    Float valueOf52 = Float.valueOf(accuracy2);
                    if (location.hasAccuracy()) {
                    }
                    valueOf52 = null;
                    p6z p6zVar2 = new p6z(yzsVar2, valueOf52 != null ? new u1k(valueOf52.doubleValue()) : null);
                    double altitude2 = location.getAltitude();
                    valueOf = Double.valueOf(altitude2);
                    if (location.hasAltitude()) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    float verticalAccuracyMeters2 = location.getVerticalAccuracyMeters();
                    Float valueOf62 = Float.valueOf(verticalAccuracyMeters2);
                    if (location.hasVerticalAccuracy()) {
                    }
                    valueOf62 = null;
                    r6z r6zVar2 = new r6z(u1kVar, valueOf62 != null ? new u1k(valueOf62.doubleValue()) : null, 4);
                    float speed2 = location.getSpeed();
                    valueOf2 = Float.valueOf(speed2);
                    if (location.hasSpeed()) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    float speedAccuracyMetersPerSecond2 = location.getSpeedAccuracyMetersPerSecond();
                    valueOf3 = Float.valueOf(speedAccuracyMetersPerSecond2);
                    if (location.hasSpeedAccuracy()) {
                    }
                    valueOf3 = null;
                    if (valueOf3 != null) {
                    }
                    float bearing2 = location.getBearing();
                    valueOf4 = Float.valueOf(bearing2);
                    if (location.hasBearing()) {
                    }
                    valueOf4 = null;
                    if (valueOf4 != null) {
                    }
                    float bearingAccuracyDegrees2 = location.getBearingAccuracyDegrees();
                    Float valueOf72 = Float.valueOf(bearingAccuracyDegrees2);
                    if (location.hasBearingAccuracy()) {
                    }
                    valueOf72 = null;
                    return new k7z(ajcVar2, p6zVar2, r6zVar2, new o6z(jpt0Var, jpt0Var2, td2Var, valueOf72 != null ? new td2(valueOf72.doubleValue()) : null), new ga2(androidLocationType, SpoofingType.None, tje.K(location), str));
                }
            } else if (provider.equals("gps")) {
                androidLocationType = AndroidLocationType.Gps;
                i = ia2.a[androidLocationType.ordinal()];
                ja2 ja2Var22 = this.a;
                if (i == 1) {
                }
                long elapsedRealtimeNanos22 = location.getElapsedRealtimeNanos() / 1000000;
                ajc ajcVar22 = new ajc(elapsedRealtimeNanos22, (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + elapsedRealtimeNanos22);
                yzs yzsVar22 = new yzs(location.getLatitude(), location.getLongitude());
                float accuracy22 = location.getAccuracy();
                Float valueOf522 = Float.valueOf(accuracy22);
                if (location.hasAccuracy()) {
                }
                valueOf522 = null;
                p6z p6zVar22 = new p6z(yzsVar22, valueOf522 != null ? new u1k(valueOf522.doubleValue()) : null);
                double altitude22 = location.getAltitude();
                valueOf = Double.valueOf(altitude22);
                if (location.hasAltitude()) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                float verticalAccuracyMeters22 = location.getVerticalAccuracyMeters();
                Float valueOf622 = Float.valueOf(verticalAccuracyMeters22);
                if (location.hasVerticalAccuracy()) {
                }
                valueOf622 = null;
                r6z r6zVar22 = new r6z(u1kVar, valueOf622 != null ? new u1k(valueOf622.doubleValue()) : null, 4);
                float speed22 = location.getSpeed();
                valueOf2 = Float.valueOf(speed22);
                if (location.hasSpeed()) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                float speedAccuracyMetersPerSecond22 = location.getSpeedAccuracyMetersPerSecond();
                valueOf3 = Float.valueOf(speedAccuracyMetersPerSecond22);
                if (location.hasSpeedAccuracy()) {
                }
                valueOf3 = null;
                if (valueOf3 != null) {
                }
                float bearing22 = location.getBearing();
                valueOf4 = Float.valueOf(bearing22);
                if (location.hasBearing()) {
                }
                valueOf4 = null;
                if (valueOf4 != null) {
                }
                float bearingAccuracyDegrees22 = location.getBearingAccuracyDegrees();
                Float valueOf722 = Float.valueOf(bearingAccuracyDegrees22);
                if (location.hasBearingAccuracy()) {
                }
                valueOf722 = null;
                return new k7z(ajcVar22, p6zVar22, r6zVar22, new o6z(jpt0Var, jpt0Var2, td2Var, valueOf722 != null ? new td2(valueOf722.doubleValue()) : null), new ga2(androidLocationType, SpoofingType.None, tje.K(location), str));
            }
        }
        ny61.g(g8e.o("Unsupported provider: ", location.getProvider()));
        return null;
    }
}
