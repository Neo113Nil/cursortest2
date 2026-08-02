package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.kcp;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements kcp {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();
    final int zaa;
    private final HashMap zab;
    private final SparseArray zac;

    public StringToIntConverter(int i, ArrayList arrayList) {
        this.zaa = i;
        this.zab = new HashMap();
        this.zac = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zacVar = (zac) arrayList.get(i2);
            add(zacVar.zab, zacVar.zac);
        }
    }

    public StringToIntConverter add(String str, int i) {
        this.zab.put(str, Integer.valueOf(i));
        this.zac.put(i, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaa;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zab.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.zab.get(str)).intValue()));
        }
        bb1.k0(parcel, 2, arrayList, false);
        bb1.o0(parcel, n0);
    }

    @Override // defpackage.kcp
    public final int zaa() {
        return 7;
    }

    @Override // defpackage.kcp
    public final int zab() {
        return 0;
    }

    @Override // defpackage.kcp
    public final /* bridge */ /* synthetic */ Object zac(Object obj) {
        Integer num = (Integer) this.zab.get((String) obj);
        return num == null ? (Integer) this.zab.get("gms_unknown") : num;
    }

    @Override // defpackage.kcp
    public final /* bridge */ /* synthetic */ Object zad(Object obj) {
        String str = (String) this.zac.get(((Integer) obj).intValue());
        return (str == null && this.zab.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    public StringToIntConverter() {
        this.zaa = 1;
        this.zab = new HashMap();
        this.zac = new SparseArray();
    }
}
