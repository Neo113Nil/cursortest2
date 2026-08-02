package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.ooc;
import defpackage.unr0;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiMetadata> CREATOR = zza.zza();
    public static final ApiMetadata zza;
    private static final ApiMetadata zzb;
    private final ComplianceOptions zzc;
    private final boolean zzd;
    private boolean zze;

    public static final class a {
        public ComplianceOptions a;
        public boolean b = false;
        public boolean c;
    }

    static {
        a newBuilder = newBuilder();
        newBuilder.getClass();
        ApiMetadata apiMetadata = new ApiMetadata(newBuilder.a, newBuilder.b);
        apiMetadata.zza(newBuilder.c);
        zzb = apiMetadata;
        a newBuilder2 = newBuilder();
        newBuilder2.c = true;
        ApiMetadata apiMetadata2 = new ApiMetadata(newBuilder2.a, newBuilder2.b);
        apiMetadata2.zza(newBuilder2.c);
        zza = apiMetadata2;
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z) {
        this.zzc = complianceOptions;
        this.zzd = z;
    }

    public static final ApiMetadata fromComplianceOptions(ComplianceOptions complianceOptions) {
        a newBuilder = newBuilder();
        newBuilder.a = complianceOptions;
        ApiMetadata apiMetadata = new ApiMetadata(complianceOptions, newBuilder.b);
        apiMetadata.zza(newBuilder.c);
        return apiMetadata;
    }

    public static final ApiMetadata getEmptyInstance() {
        return zzb;
    }

    public static a newBuilder() {
        return new a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return ooc.m(this.zzc, apiMetadata.zzc) && this.zze == apiMetadata.zze && this.zzd == apiMetadata.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzc, Boolean.valueOf(this.zze), Boolean.valueOf(this.zzd)});
    }

    public a toBuilder() {
        a newBuilder = newBuilder();
        newBuilder.a = this.zzc;
        newBuilder.b = this.zzd;
        newBuilder.c = this.zze;
        return newBuilder;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        return unr0.r(new StringBuilder(valueOf.length() + 31), "ApiMetadata(complianceOptions=", valueOf, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.zze) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, this.zzc, i, false);
        boolean z = this.zzd;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.o0(parcel, n0);
    }

    public final /* synthetic */ void zza(boolean z) {
        this.zze = z;
    }
}
