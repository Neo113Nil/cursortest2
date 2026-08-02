package xsna;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class vc01 implements Runnable {
    public final /* synthetic */ zzaw b;
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzq c;
    public final /* synthetic */ cd01 d;

    public vc01(cd01 cd01Var, zzaw zzawVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        this.d = cd01Var;
        this.b = zzawVar;
        this.c = zzqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzff zzffVar;
        cd01 cd01Var = this.d;
        qj01 qj01Var = cd01Var.a;
        zzaw zzawVar = this.b;
        String str = zzawVar.b;
        zzau zzauVar = zzawVar.c;
        if ("_cmp".equals(str) && zzauVar != null) {
            Bundle bundle = zzauVar.b;
            if (bundle.size() != 0) {
                String string = bundle.getString("_cis");
                if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                    qj01Var.e().o.b(zzawVar.toString(), "Event has been filtered ");
                    zzawVar = new zzaw("_cmpx", zzawVar.c, zzawVar.d, zzawVar.e);
                }
            }
        }
        String str2 = zzawVar.b;
        fb01 fb01Var = qj01Var.b;
        sj01 sj01Var = qj01Var.h;
        qj01.I(fb01Var);
        com.google.android.gms.measurement.internal.zzq zzqVar = this.c;
        String str3 = zzqVar.b;
        if (TextUtils.isEmpty(str3) || (zzffVar = (zzff) fb01Var.k.get(str3)) == null || zzffVar.zza() == 0) {
            cd01Var.f(zzawVar, zzqVar);
            return;
        }
        qj01Var.e().q.b(str3, "EES config found for");
        fb01 fb01Var2 = qj01Var.b;
        qj01.I(fb01Var2);
        com.google.android.gms.internal.measurement.zzc zzcVar = TextUtils.isEmpty(str3) ? null : (com.google.android.gms.internal.measurement.zzc) fb01Var2.m.get(str3);
        if (zzcVar == null) {
            qj01Var.e().q.b(str3, "EES not loaded for");
            cd01Var.f(zzawVar, zzqVar);
            return;
        }
        try {
            qj01.I(sj01Var);
            HashMap I = sj01.I(zzawVar.c.i(), true);
            String r = yiz.r(str2);
            if (r == null) {
                r = str2;
            }
            if (zzcVar.zze(new zzaa(r, zzawVar.e, I))) {
                if (zzcVar.zzg()) {
                    qj01Var.e().q.b(str2, "EES edited event");
                    qj01.I(sj01Var);
                    cd01Var.f(sj01.B(zzcVar.zza().zzb()), zzqVar);
                } else {
                    cd01Var.f(zzawVar, zzqVar);
                }
                if (zzcVar.zzf()) {
                    for (zzaa zzaaVar : zzcVar.zza().zzc()) {
                        qj01Var.e().q.b(zzaaVar.zzd(), "EES logging created event");
                        qj01.I(sj01Var);
                        cd01Var.f(sj01.B(zzaaVar), zzqVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            qj01Var.e().i.c("EES error. appId, eventName", zzqVar.c, str2);
        }
        qj01Var.e().q.b(str2, "EES was not applied to event");
        cd01Var.f(zzawVar, zzqVar);
    }
}
