package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bArr = cma1.t(parcel, readInt);
            } else if (c == 2) {
                bArr2 = cma1.t(parcel, readInt);
            } else if (c == 3) {
                bArr3 = cma1.t(parcel, readInt);
            } else if (c != 4) {
                cma1.A0(parcel, readInt);
            } else {
                i = cma1.r0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zzai(bArr == null ? null : zzgx.m(bArr.length, bArr), bArr2 == null ? null : zzgx.m(bArr2.length, bArr2), bArr3 != null ? zzgx.m(bArr3.length, bArr3) : null, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzai[i];
    }
}
