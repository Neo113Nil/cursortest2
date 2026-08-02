package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.eq91;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzem> CREATOR = new zzen();
    private final List zza;
    private final PendingIntent zzb;
    private final String zzc;

    public zzem(List list, PendingIntent pendingIntent, String str) {
        zzex j;
        if (list == null) {
            eq91 eq91Var = zzex.b;
            j = zzey.x;
        } else {
            j = zzex.j(list);
        }
        this.zza = j;
        this.zzb = pendingIntent;
        this.zzc = str;
    }

    public static zzem zza(List list) {
        cvw.m(list, "geofence can't be null.");
        cvw.d("Geofences must contains at least one id.", !list.isEmpty());
        return new zzem(list, null, "");
    }

    public static zzem zzb(PendingIntent pendingIntent) {
        cvw.m(pendingIntent, "PendingIntent can not be null.");
        return new zzem(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.i0(parcel, 1, list);
        bb1.f0(parcel, 2, this.zzb, i, false);
        bb1.g0(parcel, 3, this.zzc, false);
        bb1.o0(parcel, n0);
    }
}
