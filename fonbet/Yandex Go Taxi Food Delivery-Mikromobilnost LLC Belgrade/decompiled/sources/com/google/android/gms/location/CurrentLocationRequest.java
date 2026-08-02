package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import defpackage.apa1;
import defpackage.bb1;
import defpackage.ca51;
import defpackage.hya1;
import defpackage.ooc;
import defpackage.qv10;
import defpackage.wo91;
import defpackage.zoa1;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new zzj();
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final boolean zze;
    private final int zzf;
    private final WorkSource zzg;
    private final ClientIdentity zzh;

    /* loaded from: classes12.dex */
    public static final class a {
        public long a = 10000;
        public int b = 102;
    }

    public CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, int i3, WorkSource workSource, ClientIdentity clientIdentity) {
        this.zza = j;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j2;
        this.zze = z;
        this.zzf = i3;
        this.zzg = workSource;
        this.zzh = clientIdentity;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.zza == currentLocationRequest.zza && this.zzb == currentLocationRequest.zzb && this.zzc == currentLocationRequest.zzc && this.zzd == currentLocationRequest.zzd && this.zze == currentLocationRequest.zze && this.zzf == currentLocationRequest.zzf && ooc.m(this.zzg, currentLocationRequest.zzg) && ooc.m(this.zzh, currentLocationRequest.zzh);
    }

    public long getDurationMillis() {
        return this.zzd;
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int getPriority() {
        return this.zzc;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Long.valueOf(this.zzd)});
    }

    public String toString() {
        StringBuilder t = qv10.t("CurrentLocationRequest[");
        t.append(zoa1.f(this.zzc));
        if (this.zza != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            t.append(", maxAge=");
            wo91.b(this.zza, t);
        }
        if (this.zzd != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            t.append(", duration=");
            t.append(this.zzd);
            t.append("ms");
        }
        if (this.zzb != 0) {
            t.append(Extension.FIX_SPACE);
            t.append(hya1.d(this.zzb));
        }
        if (this.zze) {
            t.append(", bypass");
        }
        if (this.zzf != 0) {
            t.append(Extension.FIX_SPACE);
            t.append(apa1.f(this.zzf));
        }
        if (!ca51.b(this.zzg)) {
            t.append(", workSource=");
            t.append(this.zzg);
        }
        if (this.zzh != null) {
            t.append(", impersonation=");
            t.append(this.zzh);
        }
        t.append(']');
        return t.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        long maxUpdateAgeMillis = getMaxUpdateAgeMillis();
        bb1.m0(1, parcel, 8);
        parcel.writeLong(maxUpdateAgeMillis);
        int granularity = getGranularity();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(granularity);
        int priority = getPriority();
        bb1.m0(3, parcel, 4);
        parcel.writeInt(priority);
        long durationMillis = getDurationMillis();
        bb1.m0(4, parcel, 8);
        parcel.writeLong(durationMillis);
        boolean z = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.f0(parcel, 6, this.zzg, i, false);
        int i2 = this.zzf;
        bb1.m0(7, parcel, 4);
        parcel.writeInt(i2);
        bb1.f0(parcel, 9, this.zzh, i, false);
        bb1.o0(parcel, n0);
    }

    public final boolean zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final WorkSource zzc() {
        return this.zzg;
    }

    public final ClientIdentity zzd() {
        return this.zzh;
    }
}
