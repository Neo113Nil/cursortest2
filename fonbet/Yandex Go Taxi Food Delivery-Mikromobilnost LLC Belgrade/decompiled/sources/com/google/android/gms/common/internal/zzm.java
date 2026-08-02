package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import defpackage.bb1;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzm implements Parcelable.Creator {
    public static void zza(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = getServiceRequest.zzc;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        int i3 = getServiceRequest.zzd;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i3);
        int i4 = getServiceRequest.zze;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i4);
        bb1.g0(parcel, 4, getServiceRequest.zzf, false);
        bb1.a0(parcel, 5, getServiceRequest.zzg);
        bb1.j0(parcel, 6, getServiceRequest.zzh, i);
        bb1.U(parcel, 7, getServiceRequest.zzi, false);
        bb1.f0(parcel, 8, getServiceRequest.zzj, i, false);
        bb1.j0(parcel, 10, getServiceRequest.zzk, i);
        bb1.j0(parcel, 11, getServiceRequest.zzl, i);
        boolean z = getServiceRequest.zzm;
        bb1.m0(12, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = getServiceRequest.zzn;
        bb1.m0(13, parcel, 4);
        parcel.writeInt(i5);
        boolean z2 = getServiceRequest.zzo;
        bb1.m0(14, parcel, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bb1.g0(parcel, 15, getServiceRequest.getAttributionTag(), false);
        bb1.o0(parcel, n0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        Scope[] scopeArr = GetServiceRequest.zza;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.zzb;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 2:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case 3:
                    i3 = cma1.r0(parcel, readInt);
                    break;
                case 4:
                    str = cma1.z(parcel, readInt);
                    break;
                case 5:
                    iBinder = cma1.q0(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) cma1.C(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = cma1.s(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) cma1.y(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    cma1.A0(parcel, readInt);
                    break;
                case '\n':
                    featureArr = (Feature[]) cma1.C(parcel, readInt, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) cma1.C(parcel, readInt, Feature.CREATOR);
                    break;
                case '\f':
                    z = cma1.k0(parcel, readInt);
                    break;
                case '\r':
                    i4 = cma1.r0(parcel, readInt);
                    break;
                case 14:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 15:
                    str2 = cma1.z(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
