package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new zae();
    final int zaa;
    final String zab;
    final int zac;

    public zac(String str, int i) {
        this.zaa = 1;
        this.zab = str;
        this.zac = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaa;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.g0(parcel, 2, this.zab, false);
        int i3 = this.zac;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i3);
        bb1.o0(parcel, n0);
    }

    public zac(int i, String str, int i2) {
        this.zaa = i;
        this.zab = str;
        this.zac = i2;
    }
}
