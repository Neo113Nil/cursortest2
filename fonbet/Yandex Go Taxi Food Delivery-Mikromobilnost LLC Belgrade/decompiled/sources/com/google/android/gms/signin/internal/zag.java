package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.uyj0;
import java.util.List;

/* loaded from: classes11.dex */
public final class zag extends AbstractSafeParcelable implements uyj0 {
    public static final Parcelable.Creator<zag> CREATOR = new zah();
    private final List zaa;
    private final String zab;

    public zag(List list, String str) {
        this.zaa = list;
        this.zab = str;
    }

    @Override // defpackage.uyj0
    public final Status getStatus() {
        return this.zab != null ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.zaa;
        int n0 = bb1.n0(parcel, 20293);
        bb1.i0(parcel, 1, list);
        bb1.g0(parcel, 2, this.zab, false);
        bb1.o0(parcel, n0);
    }
}
