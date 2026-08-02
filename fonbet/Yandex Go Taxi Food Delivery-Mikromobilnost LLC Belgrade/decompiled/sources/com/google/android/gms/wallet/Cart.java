package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.r09;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class Cart extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Cart> CREATOR = new zzg();
    String zza;
    String zzb;
    final ArrayList zzc;

    public Cart() {
        this.zzc = new ArrayList();
    }

    public static r09 newBuilder() {
        new Cart();
        return new r09();
    }

    public String getCurrencyCode() {
        return this.zzb;
    }

    public ArrayList<LineItem> getLineItems() {
        return this.zzc;
    }

    public String getTotalPrice() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.k0(parcel, 4, this.zzc, false);
        bb1.o0(parcel, n0);
    }

    public Cart(String str, String str2, ArrayList arrayList) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = arrayList;
    }
}
