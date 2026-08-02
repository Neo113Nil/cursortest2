package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adt;
import defpackage.bb1;

/* loaded from: classes11.dex */
public class GetSaveInstrumentDetailsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSaveInstrumentDetailsResponse> CREATOR = new zzc();
    String[] zza;
    int[] zzb;
    RemoteViews zzc;
    byte[] zzd;

    public GetSaveInstrumentDetailsResponse(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = remoteViews;
        this.zzd = bArr;
    }

    public static adt newBuilder() {
        new GetSaveInstrumentDetailsResponse();
        return new adt();
    }

    public String[] getBinRegexes() {
        return this.zza;
    }

    public int[] getCardNetworks() {
        return this.zzb;
    }

    public RemoteViews getLegalRemoteViews() {
        return this.zzc;
    }

    public byte[] getSessionData() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.h0(parcel, 1, this.zza, false);
        bb1.b0(parcel, 2, this.zzb, false);
        bb1.f0(parcel, 3, this.zzc, i, false);
        bb1.V(parcel, 4, this.zzd, false);
        bb1.o0(parcel, n0);
    }

    private GetSaveInstrumentDetailsResponse() {
    }
}
