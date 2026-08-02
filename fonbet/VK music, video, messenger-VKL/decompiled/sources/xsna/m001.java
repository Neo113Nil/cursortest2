package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import xsna.vnv;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class m001 extends com.google.android.gms.internal.cast.zzb {
    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        iui0 iui0Var;
        iui0 iui0Var2;
        iui0 iui0Var3;
        iui0 iui0Var4;
        iui0 iui0Var5;
        iui0 iui0Var6;
        iui0 iui0Var7;
        iui0 iui0Var8;
        iui0 iui0Var9;
        switch (i) {
            case 1:
                bq70 bq70Var = new bq70(((m301) this).a);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.zzc.zze(parcel2, bq70Var);
                return true;
            case 2:
                vnv f = vnv.a.f(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                m301 m301Var = (m301) this;
                ssi0 ssi0Var = (ssi0) bq70.g(f);
                Class cls = m301Var.b;
                if (cls.isInstance(ssi0Var) && (iui0Var = m301Var.a) != null) {
                    iui0Var.onSessionStarting((ssi0) cls.cast(ssi0Var));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                vnv f2 = vnv.a.f(parcel.readStrongBinder());
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                m301 m301Var2 = (m301) this;
                ssi0 ssi0Var2 = (ssi0) bq70.g(f2);
                Class cls2 = m301Var2.b;
                if (cls2.isInstance(ssi0Var2) && (iui0Var2 = m301Var2.a) != null) {
                    iui0Var2.onSessionStarted((ssi0) cls2.cast(ssi0Var2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                vnv f3 = vnv.a.f(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                m301 m301Var3 = (m301) this;
                ssi0 ssi0Var3 = (ssi0) bq70.g(f3);
                Class cls3 = m301Var3.b;
                if (cls3.isInstance(ssi0Var3) && (iui0Var3 = m301Var3.a) != null) {
                    iui0Var3.onSessionStartFailed((ssi0) cls3.cast(ssi0Var3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                vnv f4 = vnv.a.f(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                m301 m301Var4 = (m301) this;
                ssi0 ssi0Var4 = (ssi0) bq70.g(f4);
                Class cls4 = m301Var4.b;
                if (cls4.isInstance(ssi0Var4) && (iui0Var4 = m301Var4.a) != null) {
                    iui0Var4.onSessionEnding((ssi0) cls4.cast(ssi0Var4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                vnv f5 = vnv.a.f(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                m301 m301Var5 = (m301) this;
                ssi0 ssi0Var5 = (ssi0) bq70.g(f5);
                Class cls5 = m301Var5.b;
                if (cls5.isInstance(ssi0Var5) && (iui0Var5 = m301Var5.a) != null) {
                    iui0Var5.onSessionEnded((ssi0) cls5.cast(ssi0Var5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                vnv f6 = vnv.a.f(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                m301 m301Var6 = (m301) this;
                ssi0 ssi0Var6 = (ssi0) bq70.g(f6);
                Class cls6 = m301Var6.b;
                if (cls6.isInstance(ssi0Var6) && (iui0Var6 = m301Var6.a) != null) {
                    iui0Var6.onSessionResuming((ssi0) cls6.cast(ssi0Var6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                vnv f7 = vnv.a.f(parcel.readStrongBinder());
                boolean zza = com.google.android.gms.internal.cast.zzc.zza(parcel);
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                m301 m301Var7 = (m301) this;
                ssi0 ssi0Var7 = (ssi0) bq70.g(f7);
                Class cls7 = m301Var7.b;
                if (cls7.isInstance(ssi0Var7) && (iui0Var7 = m301Var7.a) != null) {
                    iui0Var7.onSessionResumed((ssi0) cls7.cast(ssi0Var7), zza);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                vnv f8 = vnv.a.f(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                m301 m301Var8 = (m301) this;
                ssi0 ssi0Var8 = (ssi0) bq70.g(f8);
                Class cls8 = m301Var8.b;
                if (cls8.isInstance(ssi0Var8) && (iui0Var8 = m301Var8.a) != null) {
                    iui0Var8.onSessionResumeFailed((ssi0) cls8.cast(ssi0Var8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                vnv f9 = vnv.a.f(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                m301 m301Var9 = (m301) this;
                ssi0 ssi0Var9 = (ssi0) bq70.g(f9);
                Class cls9 = m301Var9.b;
                if (cls9.isInstance(ssi0Var9) && (iui0Var9 = m301Var9.a) != null) {
                    iui0Var9.onSessionSuspended((ssi0) cls9.cast(ssi0Var9), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
