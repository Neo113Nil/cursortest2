package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new zay();
    final int zaa;
    private final int zab;
    private final int zac;

    @Deprecated
    private final Scope[] zad;

    public zax(int i, int i2, int i3, Scope[] scopeArr) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = scopeArr;
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
        int i4 = this.zac;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i4);
        bb1.j0(parcel, 4, this.zad, i);
        bb1.o0(parcel, n0);
    }
}
