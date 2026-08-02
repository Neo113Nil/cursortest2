package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

@Deprecated
/* loaded from: classes11.dex */
public final class NotifyTransactionStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NotifyTransactionStatusRequest> CREATOR = new zzx();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        bb1.o0(parcel, bb1.n0(parcel, 20293));
    }
}
