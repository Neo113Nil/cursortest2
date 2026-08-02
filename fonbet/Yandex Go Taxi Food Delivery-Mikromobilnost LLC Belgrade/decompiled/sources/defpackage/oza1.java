package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class oza1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ j5b1 c;

    public oza1(j5b1 j5b1Var, zzr zzrVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = zzrVar;
                Objects.requireNonNull(j5b1Var);
                this.c = j5b1Var;
                break;
            default:
                this.b = zzrVar;
                this.c = j5b1Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzr zzrVar = this.b;
        j5b1 j5b1Var = this.c;
        switch (i) {
            case 0:
                zzgb zzgbVar = j5b1Var.x;
                g gVar = (g) j5b1Var.b;
                if (zzgbVar != null) {
                    try {
                        zzgbVar.zzt(zzrVar);
                    } catch (RemoteException e) {
                        y1a1 y1a1Var = gVar.y;
                        g.g(y1a1Var);
                        y1a1Var.z.b(e, "Failed to reset data on the service: remote exception");
                    }
                    j5b1Var.Tg();
                    break;
                } else {
                    y1a1 y1a1Var2 = gVar.y;
                    g.g(y1a1Var2);
                    y1a1Var2.z.a("Failed to reset data on the service: not connected to service");
                    break;
                }
            default:
                zzgb zzgbVar2 = j5b1Var.x;
                g gVar2 = (g) j5b1Var.b;
                if (zzgbVar2 == null) {
                    y1a1 y1a1Var3 = gVar2.y;
                    g.g(y1a1Var3);
                    y1a1Var3.z.a("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        zzgbVar2.zzv(zzrVar);
                        j5b1Var.Tg();
                        break;
                    } catch (RemoteException e2) {
                        y1a1 y1a1Var4 = gVar2.y;
                        g.g(y1a1Var4);
                        y1a1Var4.z.b(e2, "Failed to send consent settings to the service");
                    }
                }
        }
    }
}
