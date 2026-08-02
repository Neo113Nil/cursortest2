package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public int zza;
    public String zzb;
    public String zzc;
    public int zzd;
    public Point[] zze;
    public zzn zzf;
    public zzq zzg;
    public zzr zzh;
    public zzt zzi;
    public zzs zzj;
    public zzo zzk;
    public zzk zzl;
    public zzl zzm;
    public zzm zzn;
    public byte[] zzo;
    public boolean zzp;
    public double zzq;

    public zzu(int i, String str, String str2, int i2, Point[] pointArr, zzn zznVar, zzq zzqVar, zzr zzrVar, zzt zztVar, zzs zzsVar, zzo zzoVar, zzk zzkVar, zzl zzlVar, zzm zzmVar, byte[] bArr, boolean z, double d) {
        this.zza = i;
        this.zzb = str;
        this.zzo = bArr;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = pointArr;
        this.zzp = z;
        this.zzq = d;
        this.zzf = zznVar;
        this.zzg = zzqVar;
        this.zzh = zzrVar;
        this.zzi = zztVar;
        this.zzj = zzsVar;
        this.zzk = zzoVar;
        this.zzl = zzkVar;
        this.zzm = zzlVar;
        this.zzn = zzmVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i2);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.g0(parcel, 4, this.zzc, false);
        int i3 = this.zzd;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i3);
        bb1.j0(parcel, 6, this.zze, i);
        bb1.f0(parcel, 7, this.zzf, i, false);
        bb1.f0(parcel, 8, this.zzg, i, false);
        bb1.f0(parcel, 9, this.zzh, i, false);
        bb1.f0(parcel, 10, this.zzi, i, false);
        bb1.f0(parcel, 11, this.zzj, i, false);
        bb1.f0(parcel, 12, this.zzk, i, false);
        bb1.f0(parcel, 13, this.zzl, i, false);
        bb1.f0(parcel, 14, this.zzm, i, false);
        bb1.f0(parcel, 15, this.zzn, i, false);
        bb1.V(parcel, 16, this.zzo, false);
        boolean z = this.zzp;
        bb1.m0(17, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.zzq;
        bb1.m0(18, parcel, 8);
        parcel.writeDouble(d);
        bb1.o0(parcel, n0);
    }

    public zzu() {
    }
}
