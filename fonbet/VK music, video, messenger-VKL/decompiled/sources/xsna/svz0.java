package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import xsna.f5o0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class svz0 extends com.google.android.gms.internal.cast.zzb implements ewz0 {
    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            com.google.android.gms.internal.cast.zzc.zzf(parcel);
            final ar01 ar01Var = (ar01) this;
            g0a g0aVar = ar01Var.a;
            a401 a401Var = g0aVar.i;
            if (a401Var != null && a401Var.e()) {
                a401 a401Var2 = g0aVar.i;
                a401Var2.getClass();
                f5o0.a a = f5o0.a();
                a.a = new s14(a401Var2, readString, readString2);
                a.e = 8407;
                a401Var2.doWrite(a.a()).addOnCompleteListener(new OnCompleteListener() { // from class: xsna.uq01
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final /* synthetic */ void onComplete(Task task) {
                        ar01.this.a.m("joinApplication", task);
                    }
                });
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String readString3 = parcel.readString();
            LaunchOptions launchOptions = (LaunchOptions) com.google.android.gms.internal.cast.zzc.zzb(parcel, LaunchOptions.CREATOR);
            com.google.android.gms.internal.cast.zzc.zzf(parcel);
            final ar01 ar01Var2 = (ar01) this;
            g0a g0aVar2 = ar01Var2.a;
            a401 a401Var3 = g0aVar2.i;
            if (a401Var3 != null && a401Var3.e()) {
                a401 a401Var4 = g0aVar2.i;
                a401Var4.getClass();
                f5o0.a a2 = f5o0.a();
                a2.a = new sj20(a401Var4, readString3, launchOptions);
                a2.e = 8406;
                a401Var4.doWrite(a2.a()).addOnCompleteListener(new OnCompleteListener() { // from class: xsna.yp01
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final /* synthetic */ void onComplete(Task task) {
                        ar01.this.a.m("launchApplication", task);
                    }
                });
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            }
            int readInt = parcel.readInt();
            com.google.android.gms.internal.cast.zzc.zzf(parcel);
            ((ar01) this).a.n(readInt);
            parcel2.writeNoException();
            return true;
        }
        String readString4 = parcel.readString();
        com.google.android.gms.internal.cast.zzc.zzf(parcel);
        g0a g0aVar3 = ((ar01) this).a;
        a401 a401Var5 = g0aVar3.i;
        if (a401Var5 != null && a401Var5.e()) {
            a401 a401Var6 = g0aVar3.i;
            a401Var6.getClass();
            f5o0.a a3 = f5o0.a();
            a3.a = new vul(a401Var6, readString4);
            a3.e = 8409;
            a401Var6.doWrite(a3.a());
        }
        parcel2.writeNoException();
        return true;
    }
}
