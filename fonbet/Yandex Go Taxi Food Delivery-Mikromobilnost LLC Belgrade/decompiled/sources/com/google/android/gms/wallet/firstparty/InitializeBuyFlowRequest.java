package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public class InitializeBuyFlowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<InitializeBuyFlowRequest> CREATOR = new zzi();
    byte[][] zza;
    private final int zzb;

    public InitializeBuyFlowRequest(int i, byte[][] bArr) {
        this.zzb = i;
        this.zza = bArr;
    }

    public byte[][] getPurchaseContextProtos() {
        return this.zza;
    }

    public int getVersionCode() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int versionCode = getVersionCode();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(versionCode);
        bb1.W(parcel, 2, this.zza);
        bb1.o0(parcel, n0);
    }

    public InitializeBuyFlowRequest(byte[]... bArr) {
        this(1, bArr);
    }
}
