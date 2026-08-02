package xsna;

import android.util.Log;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zznz;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class ks01 extends rs01 {
    public final zzek g;
    public final /* synthetic */ fuz0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks01(fuz0 fuz0Var, String str, int i, zzek zzekVar) {
        super(str, i);
        this.h = fuz0Var;
        this.g = zzekVar;
    }

    @Override // xsna.rs01
    public final int a() {
        return this.g.zzb();
    }

    @Override // xsna.rs01
    public final boolean b() {
        return this.g.zzo();
    }

    @Override // xsna.rs01
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Long l, Long l2, zzft zzftVar, long j, kzz0 kzz0Var, boolean z) {
        boolean z2;
        Boolean bool;
        Boolean d;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        zznz.zzc();
        fuz0 fuz0Var = this.h;
        mb01 mb01Var = (mb01) fuz0Var.b;
        kwz0 kwz0Var = mb01Var.h;
        r701 r701Var = s701.W;
        String str = this.a;
        boolean t = kwz0Var.t(str, r701Var);
        zzek zzekVar = this.g;
        long j2 = zzekVar.zzn() ? kzz0Var.e : j;
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        boolean isLoggable = Log.isLoggable(k901Var.u(), 2);
        int i = this.b;
        boolean z3 = false;
        if (isLoggable) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.q.d("Evaluating filter. audience, filter, event", Integer.valueOf(i), zzekVar.zzp() ? Integer.valueOf(zzekVar.zzb()) : null, mb01Var.n.d(zzekVar.zzg()));
            k901 k901Var3 = mb01Var.j;
            mb01.k(k901Var3);
            i901 i901Var = k901Var3.q;
            sj01 sj01Var = fuz0Var.e.h;
            qj01.I(sj01Var);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (zzekVar.zzp()) {
                sj01.v(sb, 0, "filter_id", Integer.valueOf(zzekVar.zzb()));
            }
            sj01.v(sb, 0, "event_name", ((mb01) sj01Var.b).n.d(zzekVar.zzg()));
            String t2 = sj01.t(zzekVar.zzk(), zzekVar.zzm(), zzekVar.zzn());
            if (!t2.isEmpty()) {
                sj01.v(sb, 0, "filter_type", t2);
            }
            if (zzekVar.zzo()) {
                sj01.w(sb, 1, "event_count_filter", zzekVar.zzf());
            }
            if (zzekVar.zza() > 0) {
                sb.append("  filters {\n");
                Iterator it = zzekVar.zzh().iterator();
                while (it.hasNext()) {
                    sj01Var.r(sb, 2, (zzem) it.next());
                }
            }
            sj01.s(1, sb);
            sb.append("}\n}\n");
            i901Var.b(sb.toString(), "Filter definition");
        }
        if (!zzekVar.zzp() || zzekVar.zzb() > 256) {
            k901 k901Var4 = mb01Var.j;
            mb01.k(k901Var4);
            k901Var4.l.c("Invalid event filter ID. appId, id", k901.r(str), String.valueOf(zzekVar.zzp() ? Integer.valueOf(zzekVar.zzb()) : null));
            return false;
        }
        boolean z4 = zzekVar.zzk() || zzekVar.zzm() || zzekVar.zzn();
        if (z && !z4) {
            k901 k901Var5 = mb01Var.j;
            mb01.k(k901Var5);
            k901Var5.q.c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i), zzekVar.zzp() ? Integer.valueOf(zzekVar.zzb()) : null);
            return true;
        }
        String zzh = zzftVar.zzh();
        if (zzekVar.zzo()) {
            try {
                bool4 = rs01.d(new BigDecimal(j2), zzekVar.zzf(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            } catch (NumberFormatException unused) {
                bool4 = null;
            }
            if (bool4 != null) {
                if (!bool4.booleanValue()) {
                    bool = Boolean.FALSE;
                    z2 = false;
                    k901 k901Var6 = mb01Var.j;
                    mb01.k(k901Var6);
                    k901Var6.q.b(bool == null ? "null" : bool, "Event filter result");
                    if (bool == null) {
                        return z2;
                    }
                    Boolean bool5 = Boolean.TRUE;
                    this.c = bool5;
                    if (bool.booleanValue()) {
                        this.d = bool5;
                        if (z4 && zzftVar.zzu()) {
                            Long valueOf = Long.valueOf(zzftVar.zzd());
                            if (zzekVar.zzm()) {
                                if (t && zzekVar.zzo()) {
                                    valueOf = l;
                                }
                                this.f = valueOf;
                            } else {
                                if (t && zzekVar.zzo()) {
                                    valueOf = l2;
                                }
                                this.e = valueOf;
                            }
                        }
                    }
                    return true;
                }
            }
            z2 = z3;
            bool = null;
            k901 k901Var62 = mb01Var.j;
            mb01.k(k901Var62);
            k901Var62.q.b(bool == null ? "null" : bool, "Event filter result");
            if (bool == null) {
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = zzekVar.zzh().iterator();
        while (true) {
            if (!it2.hasNext()) {
                zk3 zk3Var = new zk3();
                Iterator it3 = zzftVar.zzi().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        Iterator it4 = zzekVar.zzh().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z2 = z3;
                                bool = Boolean.TRUE;
                                break;
                            }
                            zzem zzemVar = (zzem) it4.next();
                            boolean z5 = (zzemVar.zzh() && zzemVar.zzg()) ? true : z3;
                            String zze = zzemVar.zze();
                            if (zze.isEmpty()) {
                                k901 k901Var7 = mb01Var.j;
                                mb01.k(k901Var7);
                                k901Var7.l.b(mb01Var.n.d(zzh), "Event has empty param name. event");
                                break;
                            }
                            V v = zk3Var.get(zze);
                            z2 = z3;
                            if (v instanceof Long) {
                                if (!zzemVar.zzi()) {
                                    k901 k901Var8 = mb01Var.j;
                                    mb01.k(k901Var8);
                                    k901Var8.l.c("No number filter for long param. event, param", mb01Var.n.d(zzh), mb01Var.n.e(zze));
                                    break;
                                }
                                try {
                                    bool3 = rs01.d(new BigDecimal(((Long) v).longValue()), zzemVar.zzc(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                                } catch (NumberFormatException unused2) {
                                    bool3 = null;
                                }
                                if (bool3 == null) {
                                    break;
                                }
                                if (bool3.booleanValue() == z5) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                                z3 = z2;
                            } else if (v instanceof Double) {
                                if (!zzemVar.zzi()) {
                                    k901 k901Var9 = mb01Var.j;
                                    mb01.k(k901Var9);
                                    k901Var9.l.c("No number filter for double param. event, param", mb01Var.n.d(zzh), mb01Var.n.e(zze));
                                    break;
                                }
                                double doubleValue = ((Double) v).doubleValue();
                                try {
                                    bool2 = rs01.d(new BigDecimal(doubleValue), zzemVar.zzc(), Math.ulp(doubleValue));
                                } catch (NumberFormatException unused3) {
                                    bool2 = null;
                                }
                                if (bool2 == null) {
                                    break;
                                }
                                if (bool2.booleanValue() == z5) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                                z3 = z2;
                            } else if (v instanceof String) {
                                if (!zzemVar.zzk()) {
                                    if (!zzemVar.zzi()) {
                                        k901 k901Var10 = mb01Var.j;
                                        mb01.k(k901Var10);
                                        k901Var10.l.c("No filter for String param. event, param", mb01Var.n.d(zzh), mb01Var.n.e(zze));
                                        break;
                                    }
                                    String str2 = (String) v;
                                    if (!sj01.N(str2)) {
                                        k901 k901Var11 = mb01Var.j;
                                        mb01.k(k901Var11);
                                        k901Var11.l.c("Invalid param value for number filter. event, param", mb01Var.n.d(zzh), mb01Var.n.e(zze));
                                        break;
                                    }
                                    zzer zzc = zzemVar.zzc();
                                    if (sj01.N(str2)) {
                                        try {
                                            d = rs01.d(new BigDecimal(str2), zzc, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                                        } catch (NumberFormatException unused4) {
                                        }
                                    }
                                    d = null;
                                } else {
                                    zzey zzd = zzemVar.zzd();
                                    k901 k901Var12 = mb01Var.j;
                                    mb01.k(k901Var12);
                                    d = rs01.e((String) v, zzd, k901Var12);
                                }
                                if (d == null) {
                                    break;
                                }
                                if (d.booleanValue() == z5) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                                z3 = z2;
                            } else if (v == 0) {
                                k901 k901Var13 = mb01Var.j;
                                mb01.k(k901Var13);
                                k901Var13.q.c("Missing param for filter. event, param", mb01Var.n.d(zzh), mb01Var.n.e(zze));
                                bool = Boolean.FALSE;
                            } else {
                                k901 k901Var14 = mb01Var.j;
                                mb01.k(k901Var14);
                                k901Var14.l.c("Unknown param type. event, param", mb01Var.n.d(zzh), mb01Var.n.e(zze));
                            }
                        }
                    } else {
                        zzfx zzfxVar = (zzfx) it3.next();
                        if (hashSet.contains(zzfxVar.zzg())) {
                            if (!zzfxVar.zzw()) {
                                if (!zzfxVar.zzu()) {
                                    if (!zzfxVar.zzy()) {
                                        k901 k901Var15 = mb01Var.j;
                                        mb01.k(k901Var15);
                                        k901Var15.l.c("Unknown value for param. event, param", mb01Var.n.d(zzh), mb01Var.n.e(zzfxVar.zzg()));
                                        break;
                                    }
                                    zk3Var.put(zzfxVar.zzg(), zzfxVar.zzh());
                                } else {
                                    zk3Var.put(zzfxVar.zzg(), zzfxVar.zzu() ? Double.valueOf(zzfxVar.zza()) : null);
                                }
                            } else {
                                zk3Var.put(zzfxVar.zzg(), zzfxVar.zzw() ? Long.valueOf(zzfxVar.zzd()) : null);
                            }
                        }
                    }
                }
            } else {
                zzem zzemVar2 = (zzem) it2.next();
                if (zzemVar2.zze().isEmpty()) {
                    k901 k901Var16 = mb01Var.j;
                    mb01.k(k901Var16);
                    k901Var16.l.b(mb01Var.n.d(zzh), "null or empty param name in filter. event");
                    break;
                }
                hashSet.add(zzemVar2.zze());
            }
        }
        k901 k901Var622 = mb01Var.j;
        mb01.k(k901Var622);
        k901Var622.q.b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
        }
    }
}
