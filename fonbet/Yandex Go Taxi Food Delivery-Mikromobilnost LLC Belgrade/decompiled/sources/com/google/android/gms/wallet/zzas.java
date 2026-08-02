package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzas implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        Cart cart = null;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    cart = (Cart) cma1.y(parcel, readInt, Cart.CREATOR);
                    break;
                case 3:
                    str = cma1.z(parcel, readInt);
                    break;
                case 4:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 5:
                    bundle = cma1.s(parcel, readInt);
                    break;
                case 6:
                    bArr = cma1.t(parcel, readInt);
                    break;
                case 7:
                    z = cma1.k0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new WebPaymentDataRequest(cart, str, str2, bArr, z, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WebPaymentDataRequest[i];
    }
}
