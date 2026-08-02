package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import defpackage.bb1;
import defpackage.sj21;
import java.util.List;

/* loaded from: classes11.dex */
public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new zze();
    List<CountrySpecification> zza;

    public UserAddressRequest(List<CountrySpecification> list) {
        this.zza = list;
    }

    public static sj21 newBuilder() {
        new UserAddressRequest();
        return new sj21();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.k0(parcel, 2, this.zza, false);
        bb1.o0(parcel, n0);
    }

    public UserAddressRequest() {
    }
}
