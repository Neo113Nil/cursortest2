package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new zzb();
    String zza;
    String zzb;
    String zzc;
    String zzd;
    String zze;
    String zzf;
    String zzg;

    @Deprecated
    String zzh;
    int zzi;
    final ArrayList zzj;
    TimeInterval zzk;
    final ArrayList zzl;

    @Deprecated
    String zzm;

    @Deprecated
    String zzn;
    final ArrayList zzo;
    boolean zzp;
    final ArrayList zzq;
    final ArrayList zzr;
    final ArrayList zzs;

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = i;
        this.zzj = arrayList;
        this.zzk = timeInterval;
        this.zzl = arrayList2;
        this.zzm = str9;
        this.zzn = str10;
        this.zzo = arrayList3;
        this.zzp = z;
        this.zzq = arrayList4;
        this.zzr = arrayList5;
        this.zzs = arrayList6;
    }

    public static a zza() {
        return new a(new CommonWalletObject());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.g0(parcel, 4, this.zzc, false);
        bb1.g0(parcel, 5, this.zzd, false);
        bb1.g0(parcel, 6, this.zze, false);
        bb1.g0(parcel, 7, this.zzf, false);
        bb1.g0(parcel, 8, this.zzg, false);
        bb1.g0(parcel, 9, this.zzh, false);
        int i2 = this.zzi;
        bb1.m0(10, parcel, 4);
        parcel.writeInt(i2);
        bb1.k0(parcel, 11, this.zzj, false);
        bb1.f0(parcel, 12, this.zzk, i, false);
        bb1.k0(parcel, 13, this.zzl, false);
        bb1.g0(parcel, 14, this.zzm, false);
        bb1.g0(parcel, 15, this.zzn, false);
        bb1.k0(parcel, 16, this.zzo, false);
        boolean z = this.zzp;
        bb1.m0(17, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.k0(parcel, 18, this.zzq, false);
        bb1.k0(parcel, 19, this.zzr, false);
        bb1.k0(parcel, 20, this.zzs, false);
        bb1.o0(parcel, n0);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzg;
    }

    @Deprecated
    public final String zzi() {
        return this.zzh;
    }

    public final int zzj() {
        return this.zzi;
    }

    public final ArrayList zzk() {
        return this.zzj;
    }

    public final TimeInterval zzl() {
        return this.zzk;
    }

    public final ArrayList zzm() {
        return this.zzl;
    }

    @Deprecated
    public final String zzn() {
        return this.zzm;
    }

    @Deprecated
    public final String zzo() {
        return this.zzn;
    }

    public final ArrayList zzp() {
        return this.zzo;
    }

    public final boolean zzq() {
        return this.zzp;
    }

    public final ArrayList zzr() {
        return this.zzq;
    }

    public final ArrayList zzs() {
        return this.zzr;
    }

    public final ArrayList zzt() {
        return this.zzs;
    }

    public CommonWalletObject() {
        this.zzj = new ArrayList();
        this.zzl = new ArrayList();
        this.zzo = new ArrayList();
        this.zzq = new ArrayList();
        this.zzr = new ArrayList();
        this.zzs = new ArrayList();
    }
}
