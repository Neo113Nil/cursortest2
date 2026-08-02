package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.uyj0;

/* loaded from: classes11.dex */
public final class zaa extends AbstractSafeParcelable implements uyj0 {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    final int zaa;
    private int zab;
    private Intent zac;

    public zaa(int i, int i2, Intent intent) {
        this.zaa = i;
        this.zab = i2;
        this.zac = intent;
    }

    @Override // defpackage.uyj0
    public final Status getStatus() {
        return this.zab == 0 ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaa;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.zab;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i3);
        bb1.f0(parcel, 3, this.zac, i, false);
        bb1.o0(parcel, n0);
    }

    public zaa() {
        this(2, 0, null);
    }
}
