package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new zzf();
    ArrayList zza;
    boolean zzb;
    boolean zzc;
    int zzd;

    public CardRequirements(ArrayList arrayList, boolean z, boolean z2, int i) {
        this.zza = arrayList;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i;
    }

    public static a newBuilder() {
        return new a(new CardRequirements());
    }

    public boolean allowPrepaidCards() {
        return this.zzb;
    }

    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.zza;
    }

    public int getBillingAddressFormat() {
        return this.zzd;
    }

    public boolean isBillingAddressRequired() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.c0(parcel, 1, this.zza);
        boolean z = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i2 = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i2);
        bb1.o0(parcel, n0);
    }

    private CardRequirements() {
        this.zzb = true;
    }
}
