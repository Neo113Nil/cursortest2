package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.kcp;
import defpackage.ny61;

/* loaded from: classes11.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    final int zaa;
    private final StringToIntConverter zab;

    private zaa(StringToIntConverter stringToIntConverter) {
        this.zaa = 1;
        this.zab = stringToIntConverter;
    }

    public static zaa zaa(kcp kcpVar) {
        if (kcpVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) kcpVar);
        }
        ny61.g("Unsupported safe parcelable field converter class.");
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaa;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.f0(parcel, 2, this.zab, i, false);
        bb1.o0(parcel, n0);
    }

    public final kcp zab() {
        StringToIntConverter stringToIntConverter = this.zab;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        ny61.r("There was no converter wrapped in this ConverterWrapper.");
        return null;
    }

    public zaa(int i, StringToIntConverter stringToIntConverter) {
        this.zaa = i;
        this.zab = stringToIntConverter;
    }
}
