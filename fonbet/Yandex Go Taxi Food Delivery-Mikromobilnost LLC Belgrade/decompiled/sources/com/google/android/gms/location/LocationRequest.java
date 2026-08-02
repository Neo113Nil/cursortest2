package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import defpackage.apa1;
import defpackage.bb1;
import defpackage.ca51;
import defpackage.cvw;
import defpackage.hya1;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.wo91;
import defpackage.zoa1;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzaf();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private int zzf;
    private float zzg;
    private boolean zzh;
    private long zzi;
    private final int zzj;
    private final int zzk;
    private final boolean zzl;
    private final WorkSource zzm;
    private final ClientIdentity zzn;

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, ClientIdentity clientIdentity) {
        this.zza = i;
        if (i == 105) {
            this.zzb = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        } else {
            this.zzb = j;
        }
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.zzf = i2;
        this.zzg = f;
        this.zzh = z;
        this.zzi = j6 != -1 ? j6 : j;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = z2;
        this.zzm = workSource;
        this.zzn = clientIdentity;
    }

    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String zze(long j) {
        return j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? "∞" : wo91.a(j);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched() && ((!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzl == locationRequest.zzl && this.zzm.equals(locationRequest.zzm) && ooc.m(this.zzn, locationRequest.zzn)))) {
                return true;
            }
        }
        return false;
    }

    public long getDurationMillis() {
        return this.zze;
    }

    @Deprecated
    public long getExpirationTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.zze;
        long j2 = elapsedRealtime + j;
        return ((elapsedRealtime ^ j2) & (j ^ j2)) < 0 ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : j2;
    }

    @Deprecated
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    public int getGranularity() {
        return this.zzj;
    }

    @Deprecated
    public long getInterval() {
        return getIntervalMillis();
    }

    public long getIntervalMillis() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    public int getMaxUpdates() {
        return this.zzf;
    }

    @Deprecated
    public long getMaxWaitTime() {
        return Math.max(this.zzd, this.zzb);
    }

    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @Deprecated
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    public int getPriority() {
        return this.zza;
    }

    @Deprecated
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzm});
    }

    public boolean isBatched() {
        long j = this.zzd;
        return j > 0 && (j >> 1) >= this.zzb;
    }

    @Deprecated
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    public boolean isPassive() {
        return this.zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @Deprecated
    public LocationRequest setExpirationDuration(long j) {
        cvw.d("durationMillis must be greater than 0", j > 0);
        this.zze = j;
        return this;
    }

    @Deprecated
    public LocationRequest setExpirationTime(long j) {
        this.zze = Math.max(1L, j - SystemClock.elapsedRealtime());
        return this;
    }

    @Deprecated
    public LocationRequest setFastestInterval(long j) {
        cvw.f(j >= 0, "illegal fastest interval: %d", Long.valueOf(j));
        this.zzc = j;
        return this;
    }

    @Deprecated
    public LocationRequest setInterval(long j) {
        cvw.d("intervalMillis must be greater than or equal to 0", j >= 0);
        long j2 = this.zzc;
        long j3 = this.zzb;
        if (j2 == j3 / 6) {
            this.zzc = j / 6;
        }
        if (this.zzi == j3) {
            this.zzi = j;
        }
        this.zzb = j;
        return this;
    }

    @Deprecated
    public LocationRequest setMaxWaitTime(long j) {
        cvw.f(j >= 0, "illegal max wait time: %d", Long.valueOf(j));
        this.zzd = j;
        return this;
    }

    @Deprecated
    public LocationRequest setNumUpdates(int i) {
        if (i > 0) {
            this.zzf = i;
            return this;
        }
        ny61.g(unr0.m(i, "invalid numUpdates: ", new StringBuilder(String.valueOf(i).length() + 20)));
        return null;
    }

    @Deprecated
    public LocationRequest setPriority(int i) {
        zoa1.e(i);
        this.zza = i;
        return this;
    }

    @Deprecated
    public LocationRequest setSmallestDisplacement(float f) {
        if (f >= 0.0f) {
            this.zzg = f;
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 22);
        sb.append("invalid displacement: ");
        sb.append(f);
        throw new IllegalArgumentException(sb.toString());
    }

    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z) {
        this.zzh = z;
        return this;
    }

    public String toString() {
        StringBuilder t = qv10.t("Request[");
        if (isPassive()) {
            t.append(zoa1.f(this.zza));
            if (this.zzd > 0) {
                t.append("/");
                wo91.b(this.zzd, t);
            }
        } else {
            t.append("@");
            boolean isBatched = isBatched();
            long j = this.zzb;
            if (isBatched) {
                wo91.b(j, t);
                t.append("/");
                wo91.b(this.zzd, t);
            } else {
                wo91.b(j, t);
            }
            t.append(" ");
            t.append(zoa1.f(this.zza));
        }
        if (isPassive() || this.zzc != this.zzb) {
            t.append(", minUpdateInterval=");
            t.append(zze(this.zzc));
        }
        if (this.zzg > 0.0d) {
            t.append(", minUpdateDistance=");
            t.append(this.zzg);
        }
        boolean isPassive = isPassive();
        long j2 = this.zzi;
        if (!isPassive ? j2 != this.zzb : j2 != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            t.append(", maxUpdateAge=");
            t.append(zze(this.zzi));
        }
        if (this.zze != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            t.append(", duration=");
            wo91.b(this.zze, t);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            t.append(", maxUpdates=");
            t.append(this.zzf);
        }
        if (this.zzk != 0) {
            t.append(Extension.FIX_SPACE);
            t.append(apa1.f(this.zzk));
        }
        if (this.zzj != 0) {
            t.append(Extension.FIX_SPACE);
            t.append(hya1.d(this.zzj));
        }
        if (this.zzh) {
            t.append(", waitForAccurateLocation");
        }
        if (this.zzl) {
            t.append(", bypass");
        }
        if (!ca51.b(this.zzm)) {
            t.append(Extension.FIX_SPACE);
            t.append(this.zzm);
        }
        if (this.zzn != null) {
            t.append(", impersonation=");
            t.append(this.zzn);
        }
        t.append(']');
        return t.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int priority = getPriority();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(priority);
        long intervalMillis = getIntervalMillis();
        bb1.m0(2, parcel, 8);
        parcel.writeLong(intervalMillis);
        long minUpdateIntervalMillis = getMinUpdateIntervalMillis();
        bb1.m0(3, parcel, 8);
        parcel.writeLong(minUpdateIntervalMillis);
        int maxUpdates = getMaxUpdates();
        bb1.m0(6, parcel, 4);
        parcel.writeInt(maxUpdates);
        float minUpdateDistanceMeters = getMinUpdateDistanceMeters();
        bb1.m0(7, parcel, 4);
        parcel.writeFloat(minUpdateDistanceMeters);
        long maxUpdateDelayMillis = getMaxUpdateDelayMillis();
        bb1.m0(8, parcel, 8);
        parcel.writeLong(maxUpdateDelayMillis);
        boolean isWaitForAccurateLocation = isWaitForAccurateLocation();
        bb1.m0(9, parcel, 4);
        parcel.writeInt(isWaitForAccurateLocation ? 1 : 0);
        long durationMillis = getDurationMillis();
        bb1.m0(10, parcel, 8);
        parcel.writeLong(durationMillis);
        long maxUpdateAgeMillis = getMaxUpdateAgeMillis();
        bb1.m0(11, parcel, 8);
        parcel.writeLong(maxUpdateAgeMillis);
        int granularity = getGranularity();
        bb1.m0(12, parcel, 4);
        parcel.writeInt(granularity);
        int i2 = this.zzk;
        bb1.m0(13, parcel, 4);
        parcel.writeInt(i2);
        boolean z = this.zzl;
        bb1.m0(15, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.f0(parcel, 16, this.zzm, i, false);
        bb1.f0(parcel, 17, this.zzn, i, false);
        bb1.o0(parcel, n0);
    }

    public final int zza() {
        return this.zzk;
    }

    public final boolean zzb() {
        return this.zzl;
    }

    public final WorkSource zzc() {
        return this.zzm;
    }

    public final ClientIdentity zzd() {
        return this.zzn;
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }
}
