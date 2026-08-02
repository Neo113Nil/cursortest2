package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.y78;

/* loaded from: classes11.dex */
public class Card extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Card> CREATOR = new zza();
    String zza;
    String zzb;
    int zzc;
    int zzd;

    public Card(String str, String str2, int i, int i2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
    }

    public static y78 newBuilder() {
        new Card();
        return new y78();
    }

    public String getCvc() {
        String str = this.zzb;
        return str != null ? str.replaceAll("[\\s\\-]", "") : "";
    }

    public int getExpirationDateMonth() {
        return this.zzc;
    }

    public int getExpirationDateYear() {
        return this.zzd;
    }

    public String getPan() {
        return this.zza.replaceAll("[\\s\\-]", "");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, this.zza, false);
        bb1.g0(parcel, 2, this.zzb, false);
        int i2 = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i3);
        bb1.o0(parcel, n0);
    }

    private Card() {
    }
}
