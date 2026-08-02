package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.bb1;
import defpackage.j0m0;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class SaveInstrumentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SaveInstrumentRequest> CREATOR = new zzd();
    Card zza;
    ArrayList zzb;
    byte[] zzc;

    public SaveInstrumentRequest(Card card, ArrayList<UserAddress> arrayList, byte[] bArr) {
        this.zza = card;
        this.zzb = arrayList;
        this.zzc = bArr;
    }

    public static j0m0 newBuilder() {
        new SaveInstrumentRequest();
        return new j0m0();
    }

    public ArrayList<UserAddress> getAddresses() {
        return this.zzb;
    }

    public Card getCard() {
        return this.zza;
    }

    public byte[] getSessionData() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, this.zza, i, false);
        bb1.k0(parcel, 2, this.zzb, false);
        bb1.V(parcel, 3, this.zzc, false);
        bb1.o0(parcel, n0);
    }

    private SaveInstrumentRequest() {
    }
}
