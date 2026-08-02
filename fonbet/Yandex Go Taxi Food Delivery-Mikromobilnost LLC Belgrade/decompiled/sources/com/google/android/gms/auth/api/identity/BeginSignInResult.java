package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;

@Deprecated
/* loaded from: classes11.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new zbh();
    private final PendingIntent zba;

    public BeginSignInResult(PendingIntent pendingIntent) {
        cvw.l(pendingIntent);
        this.zba = pendingIntent;
    }

    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, getPendingIntent(), i, false);
        bb1.o0(parcel, n0);
    }
}
