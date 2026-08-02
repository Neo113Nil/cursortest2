package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zzac;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class wwz0 extends com.google.android.gms.internal.cast.zzb implements axz0 {
    public wwz0() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                a(readInt);
                return true;
            case 2:
                ApplicationMetadata applicationMetadata = (ApplicationMetadata) com.google.android.gms.internal.cast.zzc.zzb(parcel, ApplicationMetadata.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean zza = com.google.android.gms.internal.cast.zzc.zza(parcel);
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                F1(applicationMetadata, readString, readString2, zza);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                zzf(readInt2);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                com.google.android.gms.internal.cast.zzc.zza(parcel);
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                q();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                i(readString3, readString4);
                return true;
            case 6:
                String readString5 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                w0(readString5, createByteArray);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                zzh(readInt3);
                return true;
            case 8:
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                zzg(readInt4);
                return true;
            case 9:
                int readInt5 = parcel.readInt();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                e(readInt5);
                return true;
            case 10:
                parcel.readString();
                long readLong = parcel.readLong();
                int readInt6 = parcel.readInt();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                S0(readInt6, readLong);
                return true;
            case 11:
                parcel.readString();
                long readLong2 = parcel.readLong();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                Q(readLong2);
                return true;
            case 12:
                com.google.android.gms.cast.internal.zza zzaVar = (com.google.android.gms.cast.internal.zza) com.google.android.gms.internal.cast.zzc.zzb(parcel, com.google.android.gms.cast.internal.zza.CREATOR);
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                w1(zzaVar);
                return true;
            case 13:
                zzac zzacVar = (zzac) com.google.android.gms.internal.cast.zzc.zzb(parcel, zzac.CREATOR);
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                o0(zzacVar);
                return true;
            case 14:
                int readInt7 = parcel.readInt();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                zzc(readInt7);
                return true;
            case 15:
                int readInt8 = parcel.readInt();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                zzd(readInt8);
                return true;
            default:
                return false;
        }
    }
}
