package com.google.android.gms.wallet.firstparty;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class WarmUpUiProcessResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WarmUpUiProcessResponse> CREATOR = new zzo();
    final PendingIntent zza;

    public WarmUpUiProcessResponse(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    public PendingIntent getPendingIntent() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, this.zza, i, false);
        bb1.o0(parcel, n0);
    }
}
