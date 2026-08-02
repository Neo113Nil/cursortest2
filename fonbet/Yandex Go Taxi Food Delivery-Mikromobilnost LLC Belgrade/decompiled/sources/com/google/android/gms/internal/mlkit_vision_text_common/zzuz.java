package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzuz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuz> CREATOR = new zzva();
    private final String zza;
    private final Rect zzb;
    private final List zzc;
    private final String zzd;
    private final List zze;

    public zzuz(String str, Rect rect, List list, String str2, List list2) {
        this.zza = str;
        this.zzb = rect;
        this.zzc = list;
        this.zzd = str2;
        this.zze = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, str, false);
        bb1.f0(parcel, 2, this.zzb, i, false);
        bb1.k0(parcel, 3, this.zzc, false);
        bb1.g0(parcel, 4, this.zzd, false);
        bb1.k0(parcel, 5, this.zze, false);
        bb1.o0(parcel, n0);
    }

    public final Rect zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final List zzd() {
        return this.zzc;
    }

    public final List zze() {
        return this.zze;
    }
}
