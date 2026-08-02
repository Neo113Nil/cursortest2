package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import defpackage.bb1;
import defpackage.ooc;
import defpackage.qv10;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();
    private final boolean zza;
    private final ClientIdentity zzb;

    public zzad(boolean z, ClientIdentity clientIdentity) {
        this.zza = z;
        this.zzb = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        return this.zza == zzadVar.zza && ooc.m(this.zzb, zzadVar.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza)});
    }

    public final String toString() {
        StringBuilder t = qv10.t("LocationAvailabilityRequest[");
        if (this.zza) {
            t.append("bypass, ");
        }
        if (this.zzb != null) {
            t.append("impersonation=");
            t.append(this.zzb);
            t.append(Extension.FIX_SPACE);
        }
        t.setLength(t.length() - 2);
        t.append(']');
        return t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.f0(parcel, 2, this.zzb, i, false);
        bb1.o0(parcel, n0);
    }
}
