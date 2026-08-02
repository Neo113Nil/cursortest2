package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.bb1;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.w53;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    private static final w53 zzb;
    final int zza;
    private List zzc;
    private List zzd;
    private List zze;
    private List zzf;
    private List zzg;

    static {
        w53 w53Var = new w53();
        zzb = w53Var;
        w53Var.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        w53Var.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        w53Var.put("success", FastJsonResponse.Field.forStrings("success", 4));
        w53Var.put("failed", FastJsonResponse.Field.forStrings("failed", 5));
        w53Var.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzs(int i, List list, List list2, List list3, List list4, List list5) {
        this.zza = i;
        this.zzc = list;
        this.zzd = list2;
        this.zze = list3;
        this.zzf = list4;
        this.zzg = list5;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map getFieldMappings() {
        return zzb;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zza);
            case 2:
                return this.zzc;
            case 3:
                return this.zzd;
            case 4:
                return this.zze;
            case 5:
                return this.zzf;
            case 6:
                return this.zzg;
            default:
                ny61.r(oyr.i(field.getSafeParcelableFieldId(), "Unknown SafeParcelable id="));
                return null;
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzc = arrayList;
            return;
        }
        if (safeParcelableFieldId == 3) {
            this.zzd = arrayList;
            return;
        }
        if (safeParcelableFieldId == 4) {
            this.zze = arrayList;
            return;
        }
        if (safeParcelableFieldId == 5) {
            this.zzf = arrayList;
        } else if (safeParcelableFieldId == 6) {
            this.zzg = arrayList;
        } else {
            kbs.o("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(safeParcelableFieldId)});
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.i0(parcel, 2, this.zzc);
        bb1.i0(parcel, 3, this.zzd);
        bb1.i0(parcel, 4, this.zze);
        bb1.i0(parcel, 5, this.zzf);
        bb1.i0(parcel, 6, this.zzg);
        bb1.o0(parcel, n0);
    }

    public zzs() {
        this.zza = 1;
    }
}
