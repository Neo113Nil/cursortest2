package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.bb1;
import defpackage.j63;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes11.dex */
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();
    private static final HashMap zzc;
    final Set zza;
    final int zzb;
    private String zzd;
    private int zze;
    private byte[] zzf;
    private PendingIntent zzg;
    private DeviceMetaData zzh;

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.forString("accountType", 2));
        hashMap.put(ACSPConstants.STATUS, FastJsonResponse.Field.forInteger(ACSPConstants.STATUS, 3));
        hashMap.put("transferBytes", FastJsonResponse.Field.forBase64("transferBytes", 4));
    }

    public zzw(Set set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.zza = set;
        this.zzb = i;
        this.zzd = str;
        this.zze = i2;
        this.zzf = bArr;
        this.zzg = pendingIntent;
        this.zzh = deviceMetaData;
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
            return Integer.valueOf(this.zze);
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
    public final void setDecodedBytesInternal(FastJsonResponse.Field field, String str, byte[] bArr) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 4) {
            ny61.g(oyr.j(safeParcelableFieldId, "Field with id=", " is not known to be a byte array."));
        } else {
            this.zzf = bArr;
            this.zza.add(Integer.valueOf(safeParcelableFieldId));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(FastJsonResponse.Field field, String str, int i) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 3) {
            ny61.g(oyr.j(safeParcelableFieldId, "Field with id=", " is not known to be an int."));
        } else {
            this.zze = i;
            this.zza.add(Integer.valueOf(safeParcelableFieldId));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(FastJsonResponse.Field field, String str, String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            kbs.o("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(safeParcelableFieldId)});
        } else {
            this.zzd = str2;
            this.zza.add(Integer.valueOf(safeParcelableFieldId));
        }
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
            bb1.g0(parcel, 2, this.zzd, true);
        }
        if (set.contains(3)) {
            int i3 = this.zze;
            bb1.m0(3, parcel, 4);
            parcel.writeInt(i3);
        }
        if (set.contains(4)) {
            bb1.V(parcel, 4, this.zzf, true);
        }
        if (set.contains(5)) {
            bb1.f0(parcel, 5, this.zzg, i, true);
        }
        if (set.contains(6)) {
            bb1.f0(parcel, 6, this.zzh, i, true);
        }
        bb1.o0(parcel, n0);
    }

    public zzw() {
        this.zza = new j63(3);
        this.zzb = 1;
    }
}
