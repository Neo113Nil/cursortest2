package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzvb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvb> CREATOR = new zzvc();
    private final String zza;
    private final Rect zzb;
    private final List zzc;
    private final String zzd;
    private final float zze;
    private final float zzf;
    private final List zzg;

    public zzvb(String str, Rect rect, List list, String str2, float f, float f2, List list2) {
        this.zza = str;
        this.zzb = rect;
        this.zzc = list;
        this.zzd = str2;
        this.zze = f;
        this.zzf = f2;
        this.zzg = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, str, false);
        bb1.f0(parcel, 2, this.zzb, i, false);
        bb1.k0(parcel, 3, this.zzc, false);
        bb1.g0(parcel, 4, this.zzd, false);
        float f = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeFloat(f);
        float f2 = this.zzf;
        bb1.m0(6, parcel, 4);
        parcel.writeFloat(f2);
        bb1.k0(parcel, 7, this.zzg, false);
        bb1.o0(parcel, n0);
    }

    public final float zza() {
        return this.zzf;
    }

    public final float zzb() {
        return this.zze;
    }

    public final Rect zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zza;
    }

    public final List zzf() {
        return this.zzc;
    }

    public final List zzg() {
        return this.zzg;
    }
}
