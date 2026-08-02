package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        Card card = null;
        ArrayList arrayList = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                card = (Card) cma1.y(parcel, readInt, Card.CREATOR);
            } else if (c == 2) {
                arrayList = cma1.D(parcel, readInt, UserAddress.CREATOR);
            } else if (c != 3) {
                cma1.A0(parcel, readInt);
            } else {
                bArr = cma1.t(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new SaveInstrumentRequest(card, arrayList, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SaveInstrumentRequest[i];
    }
}
