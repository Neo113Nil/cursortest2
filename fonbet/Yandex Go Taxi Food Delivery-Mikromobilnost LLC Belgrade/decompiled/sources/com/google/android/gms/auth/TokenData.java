package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new zzm();
    final int zza;
    private final String zzb;
    private final Long zzc;
    private final boolean zzd;
    private final boolean zze;
    private final List zzf;
    private final String zzg;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.zza = i;
        cvw.i(str);
        this.zzb = str;
        this.zzc = l;
        this.zzd = z;
        this.zze = z2;
        this.zzf = list;
        this.zzg = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.zzb, tokenData.zzb) && ooc.m(this.zzc, tokenData.zzc) && this.zzd == tokenData.zzd && this.zze == tokenData.zze && ooc.m(this.zzf, tokenData.zzf) && ooc.m(this.zzg, tokenData.zzg);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf, this.zzg});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.g0(parcel, 2, this.zzb, false);
        bb1.e0(parcel, 3, this.zzc);
        boolean z = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bb1.i0(parcel, 6, this.zzf);
        bb1.g0(parcel, 7, this.zzg, false);
        bb1.o0(parcel, n0);
    }

    public final String zza() {
        return this.zzb;
    }
}
