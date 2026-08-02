package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.uyj0;

/* loaded from: classes11.dex */
public final class zzl extends AbstractSafeParcelable implements uyj0 {
    private final Status zzb;
    public static final zzl zza = new zzl(Status.RESULT_SUCCESS);
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    public zzl(Status status) {
        this.zzb = status;
    }

    @Override // defpackage.uyj0
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, this.zzb, i, false);
        bb1.o0(parcel, n0);
    }
}
