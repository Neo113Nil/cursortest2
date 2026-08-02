package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzvj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvj> CREATOR = new zzvk();
    private final String zza;
    private final Rect zzb;
    private final List zzc;
    private final float zzd;
    private final float zze;

    public zzvj(String str, Rect rect, List list, float f, float f2) {
        this.zza = str;
        this.zzb = rect;
        this.zzc = list;
        this.zzd = f;
        this.zze = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, str, false);
        bb1.f0(parcel, 2, this.zzb, i, false);
        bb1.k0(parcel, 3, this.zzc, false);
        float f = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeFloat(f);
        float f2 = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeFloat(f2);
        bb1.o0(parcel, n0);
    }

    public final float zza() {
        return this.zze;
    }

    public final float zzb() {
        return this.zzd;
    }

    public final Rect zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }

    public final List zze() {
        return this.zzc;
    }
}
