package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.b64;
import defpackage.bb1;
import defpackage.ny61;
import defpackage.w511;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes11.dex */
public class DeviceOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientation> CREATOR = new zzm();
    private final float[] zza;
    private final float zzb;
    private final float zzc;
    private final long zzd;
    private final byte zze;
    private final float zzf;
    private final float zzg;

    public DeviceOrientation(float[] fArr, float f, float f2, long j, byte b, float f3, float f4) {
        zzj(fArr);
        if (f < 0.0f || f >= 360.0f) {
            w511.q();
            throw null;
        }
        if (f2 < 0.0f || f2 > 180.0f) {
            w511.q();
            throw null;
        }
        if (f4 < 0.0f || f4 > 180.0f) {
            w511.q();
            throw null;
        }
        if (j < 0) {
            w511.q();
            throw null;
        }
        this.zza = fArr;
        this.zzb = f;
        this.zzc = f2;
        this.zzf = f3;
        this.zzg = f4;
        this.zzd = j;
        this.zze = (byte) (((byte) (((byte) (b | PKIBody._CKUANN)) | 4)) | 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzj(float[] fArr) {
        if (!(fArr != null && fArr.length == 4)) {
            ny61.g("Input attitude array should be of length 4.");
            return;
        }
        if ((Float.isNaN(fArr[0]) || Float.isNaN(fArr[1]) || Float.isNaN(fArr[2]) || Float.isNaN(fArr[3])) ? false : true) {
            return;
        }
        ny61.g("Input attitude cannot contain NaNs.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientation)) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
        return Float.compare(this.zzb, deviceOrientation.zzb) == 0 && Float.compare(this.zzc, deviceOrientation.zzc) == 0 && (zza() == deviceOrientation.zza() && (!zza() || Float.compare(this.zzf, deviceOrientation.zzf) == 0)) && (hasConservativeHeadingErrorDegrees() == deviceOrientation.hasConservativeHeadingErrorDegrees() && (!hasConservativeHeadingErrorDegrees() || Float.compare(getConservativeHeadingErrorDegrees(), deviceOrientation.getConservativeHeadingErrorDegrees()) == 0)) && this.zzd == deviceOrientation.zzd && Arrays.equals(this.zza, deviceOrientation.zza);
    }

    public float[] getAttitude() {
        return (float[]) this.zza.clone();
    }

    public float getConservativeHeadingErrorDegrees() {
        return this.zzg;
    }

    public long getElapsedRealtimeNs() {
        return this.zzd;
    }

    public float getHeadingDegrees() {
        return this.zzb;
    }

    public float getHeadingErrorDegrees() {
        return this.zzc;
    }

    public boolean hasConservativeHeadingErrorDegrees() {
        return (this.zze & DerValue.TAG_APPLICATION) != 0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.zzb), Float.valueOf(this.zzc), Float.valueOf(this.zzg), Long.valueOf(this.zzd), this.zza, Byte.valueOf(this.zze)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientation[attitude=");
        sb.append(Arrays.toString(this.zza));
        sb.append(", headingDegrees=");
        sb.append(this.zzb);
        sb.append(", headingErrorDegrees=");
        sb.append(this.zzc);
        if (hasConservativeHeadingErrorDegrees()) {
            sb.append(", conservativeHeadingErrorDegrees=");
            sb.append(this.zzg);
        }
        sb.append(", elapsedRealtimeNs=");
        return b64.o(sb, this.zzd, ']');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.Y(parcel, 1, getAttitude(), false);
        float headingDegrees = getHeadingDegrees();
        bb1.m0(4, parcel, 4);
        parcel.writeFloat(headingDegrees);
        float headingErrorDegrees = getHeadingErrorDegrees();
        bb1.m0(5, parcel, 4);
        parcel.writeFloat(headingErrorDegrees);
        long elapsedRealtimeNs = getElapsedRealtimeNs();
        bb1.m0(6, parcel, 8);
        parcel.writeLong(elapsedRealtimeNs);
        byte b = this.zze;
        bb1.m0(7, parcel, 4);
        parcel.writeInt(b);
        float f = this.zzf;
        bb1.m0(8, parcel, 4);
        parcel.writeFloat(f);
        float conservativeHeadingErrorDegrees = getConservativeHeadingErrorDegrees();
        bb1.m0(9, parcel, 4);
        parcel.writeFloat(conservativeHeadingErrorDegrees);
        bb1.o0(parcel, n0);
    }

    public final boolean zza() {
        return (this.zze & BlobHeaderStructure.BLOB_VERSION) != 0;
    }

    public final /* synthetic */ float[] zzc() {
        return this.zza;
    }

    public final /* synthetic */ float zzd() {
        return this.zzb;
    }

    public final /* synthetic */ float zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }

    public final /* synthetic */ byte zzg() {
        return this.zze;
    }

    public final /* synthetic */ float zzh() {
        return this.zzf;
    }

    public final /* synthetic */ float zzi() {
        return this.zzg;
    }
}
