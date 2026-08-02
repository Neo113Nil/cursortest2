package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import defpackage.bb1;
import defpackage.hya1;
import defpackage.ooc;
import defpackage.qv10;
import defpackage.wo91;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzaa();
    private final long zza;
    private final int zzb;
    private final boolean zzc;
    private final ClientIdentity zzd;

    public static final class a {
        public final LastLocationRequest a() {
            return new LastLocationRequest(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, 0, false, null);
        }
    }

    public LastLocationRequest(long j, int i, boolean z, ClientIdentity clientIdentity) {
        this.zza = j;
        this.zzb = i;
        this.zzc = z;
        this.zzd = clientIdentity;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.zza == lastLocationRequest.zza && this.zzb == lastLocationRequest.zzb && this.zzc == lastLocationRequest.zzc && ooc.m(this.zzd, lastLocationRequest.zzd);
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc)});
    }

    public String toString() {
        StringBuilder t = qv10.t("LastLocationRequest[");
        if (this.zza != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            t.append("maxAge=");
            wo91.b(this.zza, t);
        }
        if (this.zzb != 0) {
            t.append(Extension.FIX_SPACE);
            t.append(hya1.d(this.zzb));
        }
        if (this.zzc) {
            t.append(", bypass");
        }
        if (this.zzd != null) {
            t.append(", impersonation=");
            t.append(this.zzd);
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
        boolean z = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.f0(parcel, 5, this.zzd, i, false);
        bb1.o0(parcel, n0);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final ClientIdentity zzb() {
        return this.zzd;
    }
}
