package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.brx;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new zzd();

    @Deprecated
    String zza;

    @Deprecated
    String zzb;
    final ArrayList zzc;

    public LabelValueRow() {
        this.zzc = new ArrayList();
    }

    public static brx newBuilder() {
        new LabelValueRow();
        return new brx();
    }

    public ArrayList<LabelValue> getColumns() {
        return this.zzc;
    }

    @Deprecated
    public String getHexBackgroundColor() {
        return this.zzb;
    }

    @Deprecated
    public String getHexFontColor() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.k0(parcel, 4, this.zzc, false);
        bb1.o0(parcel, n0);
    }

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = arrayList;
    }
}
