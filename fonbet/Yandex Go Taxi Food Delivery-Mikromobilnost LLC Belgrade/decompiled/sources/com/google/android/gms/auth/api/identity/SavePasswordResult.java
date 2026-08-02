package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import java.util.Arrays;

@Deprecated
/* loaded from: classes11.dex */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new zbt();
    private final PendingIntent zba;

    public SavePasswordResult(PendingIntent pendingIntent) {
        cvw.l(pendingIntent);
        this.zba = pendingIntent;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return ooc.m(this.zba, ((SavePasswordResult) obj).zba);
        }
        return false;
    }

    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, getPendingIntent(), i, false);
        bb1.o0(parcel, n0);
    }
}
