package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;

/* loaded from: classes11.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i, String str, int i2) {
        this.zza = 1;
        cvw.l(str);
        this.zzb = str;
        this.zzc = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.g0(parcel, 2, this.zzb, false);
        int i3 = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i3);
        bb1.o0(parcel, n0);
    }

    public zzav(String str, int i) {
        this(1, str, i);
    }
}
