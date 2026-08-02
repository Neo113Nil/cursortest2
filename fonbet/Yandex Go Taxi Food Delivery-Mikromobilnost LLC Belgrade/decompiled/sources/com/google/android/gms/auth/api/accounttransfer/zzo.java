package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.bb1;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    private static final HashMap zzc;
    final Set zza;
    final int zzb;
    private ArrayList zzd;
    private int zze;
    private zzs zzf;

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, zzu.class));
        hashMap.put("progress", FastJsonResponse.Field.forConcreteType("progress", 4, zzs.class));
    }

    public zzo() {
        this.zza = new HashSet(1);
        this.zzb = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            kbs.o("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[]{Integer.valueOf(safeParcelableFieldId), arrayList.getClass().getCanonicalName()});
        } else {
            this.zzd = arrayList;
            this.zza.add(Integer.valueOf(safeParcelableFieldId));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 4) {
            kbs.o("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(safeParcelableFieldId), fastJsonResponse.getClass().getCanonicalName()});
        } else {
            this.zzf = (zzs) fastJsonResponse;
            this.zza.add(Integer.valueOf(safeParcelableFieldId));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return zzc;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            return Integer.valueOf(this.zzb);
        }
        if (safeParcelableFieldId == 2) {
            return this.zzd;
        }
        if (safeParcelableFieldId == 4) {
            return this.zzf;
        }
        ny61.r(oyr.i(field.getSafeParcelableFieldId(), "Unknown SafeParcelable id="));
        return null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.zza.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        Set set = this.zza;
        if (set.contains(1)) {
            int i2 = this.zzb;
            bb1.m0(1, parcel, 4);
            parcel.writeInt(i2);
        }
        if (set.contains(2)) {
            bb1.k0(parcel, 2, this.zzd, true);
        }
        if (set.contains(3)) {
            int i3 = this.zze;
            bb1.m0(3, parcel, 4);
            parcel.writeInt(i3);
        }
        if (set.contains(4)) {
            bb1.f0(parcel, 4, this.zzf, i, true);
        }
        bb1.o0(parcel, n0);
    }

    public zzo(Set set, int i, ArrayList arrayList, int i2, zzs zzsVar) {
        this.zza = set;
        this.zzb = i;
        this.zzd = arrayList;
        this.zze = i2;
        this.zzf = zzsVar;
    }
}
