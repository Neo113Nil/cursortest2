package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.oyr;
import defpackage.vfc;

@Deprecated
/* loaded from: classes11.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public final String toString() {
        long zza = zza();
        int zzb = zzb();
        String zzc = zzc();
        int length = String.valueOf(zza).length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(zzb).length() + 3 + zzc.length());
        vfc.y(sb, zza, "\t", zzb);
        return oyr.t(sb, "\t-1", zzc);
    }

    public abstract long zza();

    public abstract int zzb();

    public abstract String zzc();
}
