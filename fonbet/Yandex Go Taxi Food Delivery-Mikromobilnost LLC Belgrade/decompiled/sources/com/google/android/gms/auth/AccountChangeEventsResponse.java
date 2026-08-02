package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import java.util.List;

/* loaded from: classes11.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new zzc();
    final int zza;
    final List zzb;

    public AccountChangeEventsResponse(List<AccountChangeEvent> list) {
        this.zza = 1;
        cvw.l(list);
        this.zzb = list;
    }

    public List<AccountChangeEvent> getEvents() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.k0(parcel, 2, this.zzb, false);
        bb1.o0(parcel, n0);
    }

    public AccountChangeEventsResponse(int i, List list) {
        this.zza = i;
        cvw.l(list);
        this.zzb = list;
    }
}
