package xsna;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class p301 extends com.google.android.gms.internal.cast.zzb {
    public final /* synthetic */ lui0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p301(lui0 lui0Var) {
        super("com.google.android.gms.cast.framework.ISessionProvider");
        this.a = lui0Var;
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        d001 d001Var;
        lui0 lui0Var = this.a;
        if (i == 1) {
            String readString = parcel.readString();
            com.google.android.gms.internal.cast.zzc.zzf(parcel);
            ssi0 createSession = lui0Var.createSession(readString);
            vnv vnvVar = null;
            if (createSession != null && (d001Var = createSession.a) != null) {
                try {
                    vnvVar = d001Var.zzf();
                } catch (RemoteException unused) {
                    ssi0.b.b("Unable to call %s on %s.", "getWrappedObject", d001.class.getSimpleName());
                }
            }
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zze(parcel2, vnvVar);
            return true;
        }
        if (i == 2) {
            boolean isSessionRecoverable = lui0Var.isSessionRecoverable();
            parcel2.writeNoException();
            int i3 = com.google.android.gms.internal.cast.zzc.zza;
            parcel2.writeInt(isSessionRecoverable ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String category = lui0Var.getCategory();
            parcel2.writeNoException();
            parcel2.writeString(category);
            return true;
        }
        if (i != 4) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(12451000);
        return true;
    }
}
