package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new zzp();
    ArrayList zza;
    String zzb;
    String zzc;
    ArrayList zzd;
    boolean zze;
    String zzf;

    public IsReadyToPayRequest(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z, String str3) {
        this.zza = arrayList;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = arrayList2;
        this.zze = z;
        this.zzf = str3;
    }

    public static IsReadyToPayRequest fromJson(String str) {
        b newBuilder = newBuilder();
        cvw.m(str, "isReadyToPayRequestJson cannot be null!");
        IsReadyToPayRequest isReadyToPayRequest = newBuilder.a;
        isReadyToPayRequest.zzf = str;
        return isReadyToPayRequest;
    }

    @Deprecated
    public static b newBuilder() {
        return new b(new IsReadyToPayRequest());
    }

    @Deprecated
    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.zza;
    }

    @Deprecated
    public ArrayList<Integer> getAllowedPaymentMethods() {
        return this.zzd;
    }

    @Deprecated
    public boolean isExistingPaymentMethodRequired() {
        return this.zze;
    }

    public String toJson() {
        return this.zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.c0(parcel, 2, this.zza);
        bb1.g0(parcel, 4, this.zzb, false);
        bb1.g0(parcel, 5, this.zzc, false);
        bb1.c0(parcel, 6, this.zzd);
        boolean z = this.zze;
        bb1.m0(7, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.g0(parcel, 8, this.zzf, false);
        bb1.o0(parcel, n0);
    }

    public IsReadyToPayRequest() {
    }
}
