package xsna;

import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zznz;
import java.math.BigDecimal;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class bt01 extends rs01 {
    public final zzet g;
    public final /* synthetic */ fuz0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt01(fuz0 fuz0Var, String str, int i, zzet zzetVar) {
        super(str, i);
        this.h = fuz0Var;
        this.g = zzetVar;
    }

    @Override // xsna.rs01
    public final int a() {
        return this.g.zza();
    }

    @Override // xsna.rs01
    public final boolean b() {
        return false;
    }

    @Override // xsna.rs01
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(Long l, Long l2, zzgm zzgmVar, boolean z) {
        zznz.zzc();
        mb01 mb01Var = (mb01) this.h.b;
        boolean t = mb01Var.h.t(this.a, s701.U);
        zzet zzetVar = this.g;
        boolean zzg = zzetVar.zzg();
        boolean zzh = zzetVar.zzh();
        boolean zzi = zzetVar.zzi();
        Object[] objArr = zzg || zzh || zzi;
        Boolean bool = null;
        r5 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean d = null;
        bool = null;
        if (z && objArr != true) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.q.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null);
            return true;
        }
        zzem zzb = zzetVar.zzb();
        boolean zzg2 = zzb.zzg();
        if (zzgmVar.zzr()) {
            if (zzb.zzi()) {
                try {
                    bool3 = rs01.d(new BigDecimal(zzgmVar.zzb()), zzb.zzc(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                } catch (NumberFormatException unused) {
                }
                bool = rs01.f(zzg2, bool3);
            } else {
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.l.b(mb01Var.n.f(zzgmVar.zzf()), "No number filter for long property. property");
            }
        } else if (zzgmVar.zzq()) {
            if (zzb.zzi()) {
                double zza = zzgmVar.zza();
                try {
                    bool2 = rs01.d(new BigDecimal(zza), zzb.zzc(), Math.ulp(zza));
                } catch (NumberFormatException unused2) {
                }
                bool = rs01.f(zzg2, bool2);
            } else {
                k901 k901Var3 = mb01Var.j;
                mb01.k(k901Var3);
                k901Var3.l.b(mb01Var.n.f(zzgmVar.zzf()), "No number filter for double property. property");
            }
        } else if (!zzgmVar.zzt()) {
            k901 k901Var4 = mb01Var.j;
            mb01.k(k901Var4);
            k901Var4.l.b(mb01Var.n.f(zzgmVar.zzf()), "User property has no value, property");
        } else if (zzb.zzk()) {
            String zzg3 = zzgmVar.zzg();
            zzey zzd = zzb.zzd();
            k901 k901Var5 = mb01Var.j;
            mb01.k(k901Var5);
            bool = rs01.f(zzg2, rs01.e(zzg3, zzd, k901Var5));
        } else if (!zzb.zzi()) {
            k901 k901Var6 = mb01Var.j;
            mb01.k(k901Var6);
            k901Var6.l.b(mb01Var.n.f(zzgmVar.zzf()), "No string or number filter defined. property");
        } else if (sj01.N(zzgmVar.zzg())) {
            String zzg4 = zzgmVar.zzg();
            zzer zzc = zzb.zzc();
            if (sj01.N(zzg4)) {
                try {
                    d = rs01.d(new BigDecimal(zzg4), zzc, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                } catch (NumberFormatException unused3) {
                }
            }
            bool = rs01.f(zzg2, d);
        } else {
            k901 k901Var7 = mb01Var.j;
            mb01.k(k901Var7);
            k901Var7.l.c("Invalid user property value for Numeric number filter. property, value", mb01Var.n.f(zzgmVar.zzf()), zzgmVar.zzg());
        }
        k901 k901Var8 = mb01Var.j;
        mb01.k(k901Var8);
        k901Var8.q.b(bool == null ? "null" : bool, "Property filter result");
        if (bool == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!zzi || bool.booleanValue()) {
            if (!z || zzetVar.zzg()) {
                this.d = bool;
            }
            if (bool.booleanValue() && objArr != false && zzgmVar.zzs()) {
                long zzc2 = zzgmVar.zzc();
                if (l != null) {
                    zzc2 = l.longValue();
                }
                if (t && zzetVar.zzg() && !zzetVar.zzh() && l2 != null) {
                    zzc2 = l2.longValue();
                }
                if (zzetVar.zzh()) {
                    this.f = Long.valueOf(zzc2);
                } else {
                    this.e = Long.valueOf(zzc2);
                }
            }
        }
        return true;
    }
}
