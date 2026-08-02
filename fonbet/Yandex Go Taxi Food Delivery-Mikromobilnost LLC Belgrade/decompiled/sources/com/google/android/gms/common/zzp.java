package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final Context zzd;
    private final boolean zze;
    private final boolean zzf;
    private final boolean zzg;

    public zzp(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (Context) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zze = z3;
        this.zzf = z4;
        this.zzg = z5;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, str, false);
        boolean z = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bb1.a0(parcel, 4, ObjectWrapper.wrap(this.zzd));
        boolean z3 = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.zzf;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.zzg;
        bb1.m0(8, parcel, 4);
        parcel.writeInt(z5 ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
