package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.d691;
import defpackage.hwa1;
import defpackage.ooc;
import defpackage.tje;
import defpackage.wo91;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    private final List zzb;
    static final List zza = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new zzag();

    public LocationResult(List list) {
        this.zzb = list;
    }

    public static LocationResult create(List<Location> list) {
        if (list == null) {
            list = zza;
        }
        return new LocationResult(list);
    }

    public static LocationResult extractResult(Intent intent) {
        if (!hasResult(intent)) {
            return null;
        }
        LocationResult locationResult = (LocationResult) hwa1.b(intent, "com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES", CREATOR);
        return locationResult == null ? (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") : locationResult;
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") || intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int i = Build.VERSION.SDK_INT;
        List list = this.zzb;
        if (i >= 31) {
            return list.equals(locationResult.zzb);
        }
        if (list.size() != locationResult.zzb.size()) {
            return false;
        }
        Iterator it = locationResult.zzb.iterator();
        for (Location location : this.zzb) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !ooc.m(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public Location getLastLocation() {
        int size = this.zzb.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.zzb.get(size - 1);
    }

    public List<Location> getLocations() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb});
    }

    public String toString() {
        String l;
        StringBuilder sb = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = d691.a;
        List<Location> list = this.zzb;
        sb.ensureCapacity(list.size() * 100);
        sb.append("[");
        boolean z = false;
        for (Location location : list) {
            DecimalFormat decimalFormat2 = d691.b;
            sb.ensureCapacity(100);
            if (location == null) {
                sb.append((String) null);
            } else {
                sb.append("{");
                sb.append(location.getProvider());
                sb.append(Extension.FIX_SPACE);
                if (tje.K(location)) {
                    sb.append("mock, ");
                }
                DecimalFormat decimalFormat3 = d691.a;
                sb.append(decimalFormat3.format(location.getLatitude()));
                sb.append(",");
                sb.append(decimalFormat3.format(location.getLongitude()));
                if (location.hasAccuracy()) {
                    sb.append("±");
                    sb.append(decimalFormat2.format(location.getAccuracy()));
                    sb.append("m");
                }
                if (location.hasAltitude()) {
                    sb.append(", alt=");
                    sb.append(decimalFormat2.format(location.getAltitude()));
                    if (location.hasVerticalAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getVerticalAccuracyMeters()));
                    }
                    sb.append("m");
                }
                if (location.hasSpeed()) {
                    sb.append(", spd=");
                    sb.append(decimalFormat2.format(location.getSpeed()));
                    if (location.hasSpeedAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getSpeedAccuracyMetersPerSecond()));
                    }
                    sb.append("m/s");
                }
                if (location.hasBearing()) {
                    sb.append(", brg=");
                    sb.append(decimalFormat2.format(location.getBearing()));
                    if (location.hasBearingAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getBearingAccuracyDegrees()));
                    }
                    sb.append("°");
                }
                Bundle extras = location.getExtras();
                String string = extras != null ? extras.getString("floorLabel") : null;
                if (string != null) {
                    sb.append(", fl=");
                    sb.append(string);
                }
                Bundle extras2 = location.getExtras();
                String string2 = extras2 != null ? extras2.getString("levelId") : null;
                if (string2 != null) {
                    sb.append(", lv=");
                    sb.append(string2);
                }
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb.append(", ert=");
                long elapsedRealtimeNanos = (location.getElapsedRealtimeNanos() / 1000000) + currentTimeMillis;
                if (elapsedRealtimeNanos >= 0) {
                    l = wo91.a.format(new Date(elapsedRealtimeNanos));
                } else {
                    SimpleDateFormat simpleDateFormat = wo91.a;
                    l = Long.toString(elapsedRealtimeNanos);
                }
                sb.append(l);
                sb.append('}');
            }
            sb.append(Extension.FIX_SPACE);
            z = true;
        }
        if (z) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.k0(parcel, 1, getLocations(), false);
        bb1.o0(parcel, n0);
    }
}
