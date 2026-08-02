package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.bb1;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.reprov.x509.X509CertImpl;

/* loaded from: classes11.dex */
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    private static final HashMap zzc;
    final Set zza;
    final int zzb;
    private zzw zzd;
    private String zze;
    private String zzf;
    private String zzg;

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.forConcreteType("authenticatorInfo", 2, zzw.class));
        hashMap.put(X509CertImpl.SIGNATURE, FastJsonResponse.Field.forString(X509CertImpl.SIGNATURE, 3));
        hashMap.put("package", FastJsonResponse.Field.forString("package", 4));
    }

    public zzu(Set set, int i, zzw zzwVar, String str, String str2, String str3) {
        this.zza = set;
        this.zzb = i;
        this.zzd = zzwVar;
        this.zze = str;
        this.zzf = str2;
        this.zzg = str3;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            kbs.o("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(safeParcelableFieldId), fastJsonResponse.getClass().getCanonicalName()});
        } else {
            this.zzd = (zzw) fastJsonResponse;
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
        if (safeParcelableFieldId == 3) {
            return this.zze;
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

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(FastJsonResponse.Field field, String str, String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 3) {
            this.zze = str2;
        } else {
            if (safeParcelableFieldId != 4) {
                kbs.o("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(safeParcelableFieldId)});
                return;
            }
            this.zzf = str2;
        }
        this.zza.add(Integer.valueOf(safeParcelableFieldId));
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
            bb1.f0(parcel, 2, this.zzd, i, true);
        }
        if (set.contains(3)) {
            bb1.g0(parcel, 3, this.zze, true);
        }
        if (set.contains(4)) {
            bb1.g0(parcel, 4, this.zzf, true);
        }
        if (set.contains(5)) {
            bb1.g0(parcel, 5, this.zzg, true);
        }
        bb1.o0(parcel, n0);
    }

    public zzu() {
        this.zza = new HashSet(3);
        this.zzb = 1;
    }
}
