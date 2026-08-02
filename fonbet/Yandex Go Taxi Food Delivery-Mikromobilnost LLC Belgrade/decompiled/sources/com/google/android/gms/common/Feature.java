package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.kjz;
import defpackage.ooc;
import java.util.Arrays;

/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzb();
    private final String zza;

    @Deprecated
    private final int zzb;
    private final long zzc;
    private final boolean zzd;

    public Feature(String str, int i, long j, boolean z) {
        this.zza = str;
        this.zzb = i;
        this.zzc = j;
        this.zzd = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (ooc.m(getName(), feature.getName()) && getVersion() == feature.getVersion() && getIsFullyRolledOut() == feature.getIsFullyRolledOut()) {
                return true;
            }
        }
        return false;
    }

    public boolean getIsFullyRolledOut() {
        return this.zzd;
    }

    public String getName() {
        return this.zza;
    }

    public long getVersion() {
        long j = this.zzc;
        return j == -1 ? this.zzb : j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getName(), Long.valueOf(getVersion()), Boolean.valueOf(getIsFullyRolledOut())});
    }

    public final String toString() {
        kjz kjzVar = new kjz(this);
        kjzVar.b(getName(), "name");
        kjzVar.b(Long.valueOf(getVersion()), "version");
        kjzVar.b(Boolean.valueOf(getIsFullyRolledOut()), "is_fully_rolled_out");
        return kjzVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, getName(), false);
        int i2 = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i2);
        long version = getVersion();
        bb1.m0(3, parcel, 8);
        parcel.writeLong(version);
        boolean isFullyRolledOut = getIsFullyRolledOut();
        bb1.m0(4, parcel, 4);
        parcel.writeInt(isFullyRolledOut ? 1 : 0);
        bb1.o0(parcel, n0);
    }

    public Feature(String str, int i, long j) {
        this(str, i, j, false);
    }

    public Feature(String str, long j) {
        this(str, -1, j, false);
    }

    public Feature(String str, long j, boolean z) {
        this(str, -1, j, z);
    }
}
