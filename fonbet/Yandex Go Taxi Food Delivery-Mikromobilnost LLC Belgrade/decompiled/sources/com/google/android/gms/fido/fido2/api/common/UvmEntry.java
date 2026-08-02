package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntry> CREATOR = new zzbe();
    private final int zza;
    private final short zzb;
    private final short zzc;

    public UvmEntry(int i, short s, short s2) {
        this.zza = i;
        this.zzb = s;
        this.zzc = s2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.zza == uvmEntry.zza && this.zzb == uvmEntry.zzb && this.zzc == uvmEntry.zzc;
    }

    public short getKeyProtectionType() {
        return this.zzb;
    }

    public short getMatcherProtectionType() {
        return this.zzc;
    }

    public int getUserVerificationMethod() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Short.valueOf(this.zzb), Short.valueOf(this.zzc)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int userVerificationMethod = getUserVerificationMethod();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(userVerificationMethod);
        short keyProtectionType = getKeyProtectionType();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(keyProtectionType);
        short matcherProtectionType = getMatcherProtectionType();
        bb1.m0(3, parcel, 4);
        parcel.writeInt(matcherProtectionType);
        bb1.o0(parcel, n0);
    }
}
