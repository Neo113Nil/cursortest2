package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class TextModuleData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TextModuleData> CREATOR = new zzg();
    String zza;
    String zzb;

    public TextModuleData(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public String getBody() {
        return this.zzb;
    }

    public String getHeader() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.o0(parcel, n0);
    }

    public TextModuleData() {
    }
}
