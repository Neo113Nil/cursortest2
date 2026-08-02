package defpackage;

import android.media.metrics.PlaybackMetrics;
import java.util.HashMap;
import java.util.Random;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class eih {
    public static final cih h = new cih(0);
    public static final Random i = new Random();
    public ue10 d;
    public String f;
    public final z8z0 a = new z8z0();
    public final y8z0 b = new y8z0();
    public final HashMap c = new HashMap();
    public a9z0 e = a9z0.a;
    public long g = -1;

    public final void a(dih dihVar) {
        long j = dihVar.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dih b(int i2, sf10 sf10Var) {
        long j;
        long j2;
        long j3;
        HashMap hashMap = this.c;
        dih dihVar = null;
        long j4 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        for (dih dihVar2 : hashMap.values()) {
            long j5 = dihVar2.c;
            sf10 sf10Var2 = dihVar2.d;
            if (j5 == -1 && i2 == dihVar2.b && sf10Var != null) {
                long j6 = sf10Var.d;
                eih eihVar = dihVar2.g;
                j = -1;
                dih dihVar3 = (dih) eihVar.c.get(eihVar.f);
                if (dihVar3 != null) {
                    j3 = dihVar3.c;
                }
                j3 = eihVar.g + 1;
                if (j6 >= j3) {
                    dihVar2.c = j6;
                }
            } else {
                j = -1;
            }
            if (sf10Var != null) {
                long j7 = sf10Var.d;
                if (sf10Var2 == null) {
                    if (!sf10Var.b() && j7 == dihVar2.c) {
                        j2 = dihVar2.c;
                        if (j2 == j) {
                        }
                        dihVar = dihVar2;
                        j4 = j2;
                    }
                } else if (j7 == sf10Var2.d && sf10Var.b == sf10Var2.b && sf10Var.c == sf10Var2.c) {
                    j2 = dihVar2.c;
                    if (j2 == j) {
                    }
                    dihVar = dihVar2;
                    j4 = j2;
                }
            } else if (i2 == dihVar2.b) {
                j2 = dihVar2.c;
                if (j2 == j || j2 < j4) {
                    dihVar = dihVar2;
                    j4 = j2;
                } else if (j2 == j4) {
                    int i3 = tw21.a;
                    if (dihVar.d != null && sf10Var2 != null) {
                        dihVar = dihVar2;
                    }
                }
            }
        }
        if (dihVar != null) {
            return dihVar;
        }
        String str = (String) h.get();
        dih dihVar4 = new dih(this, str, i2, sf10Var);
        hashMap.put(str, dihVar4);
        return dihVar4;
    }

    public final synchronized String c(a9z0 a9z0Var, sf10 sf10Var) {
        return b(a9z0Var.h(sf10Var.a, this.b).c, sf10Var).a;
    }

    public final void d(h42 h42Var) {
        sf10 sf10Var;
        a9z0 a9z0Var = h42Var.b;
        int i2 = h42Var.c;
        sf10 sf10Var2 = h42Var.d;
        boolean q = a9z0Var.q();
        String str = this.f;
        HashMap hashMap = this.c;
        if (q) {
            if (str != null) {
                dih dihVar = (dih) hashMap.get(str);
                dihVar.getClass();
                a(dihVar);
                return;
            }
            return;
        }
        dih dihVar2 = (dih) hashMap.get(str);
        this.f = b(i2, sf10Var2).a;
        e(h42Var);
        if (sf10Var2 != null) {
            long j = sf10Var2.d;
            if (sf10Var2.b()) {
                if (dihVar2 != null && dihVar2.c == j && (sf10Var = dihVar2.d) != null && sf10Var.b == sf10Var2.b && sf10Var.c == sf10Var2.c) {
                    return;
                }
                b(i2, new sf10(j, sf10Var2.a));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:10:0x0014, B:12:0x0024, B:19:0x0036, B:21:0x0042, B:23:0x0048, B:27:0x002b, B:29:0x0053, B:31:0x005f, B:32:0x0063, B:34:0x0068, B:36:0x006e, B:38:0x0085, B:39:0x00a6, B:41:0x00aa, B:42:0x00b1, B:44:0x00bb, B:46:0x00bf, B:48:0x00cc, B:51:0x00d3), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e(h42 h42Var) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        long j;
        this.d.getClass();
        if (h42Var.b.q()) {
            return;
        }
        sf10 sf10Var = h42Var.d;
        if (sf10Var != null) {
            long j2 = sf10Var.d;
            dih dihVar = (dih) this.c.get(this.f);
            if (dihVar != null) {
                j = dihVar.c;
                if (j != -1) {
                    if (j2 >= j) {
                        return;
                    }
                    dih dihVar2 = (dih) this.c.get(this.f);
                    if (dihVar2 != null && dihVar2.c == -1 && dihVar2.b != h42Var.c) {
                        return;
                    }
                }
            }
            j = this.g + 1;
            if (j2 >= j) {
            }
        }
        dih b = b(h42Var.c, h42Var.d);
        if (this.f == null) {
            this.f = b.a;
        }
        sf10 sf10Var2 = h42Var.d;
        if (sf10Var2 != null && sf10Var2.b()) {
            sf10 sf10Var3 = h42Var.d;
            dih b2 = b(h42Var.c, new sf10(sf10Var3.a, sf10Var3.d, sf10Var3.b));
            if (!b2.e) {
                b2.e = true;
                h42Var.b.h(h42Var.d.a, this.b);
                this.b.d(h42Var.d.b);
                int i2 = tw21.a;
                long j3 = this.b.e;
                this.d.getClass();
            }
        }
        if (!b.e) {
            b.e = true;
            this.d.getClass();
        }
        if (b.a.equals(this.f) && !b.f) {
            b.f = true;
            ue10 ue10Var = this.d;
            String str = b.a;
            ue10Var.getClass();
            sf10 sf10Var4 = h42Var.d;
            if (sf10Var4 == null || !sf10Var4.b()) {
                ue10Var.b();
                ue10Var.j = str;
                playerName = xbm.k().setPlayerName("AndroidXMedia3");
                playerVersion = playerName.setPlayerVersion("1.7.1");
                ue10Var.k = playerVersion;
                ue10Var.c(h42Var.b, h42Var.d);
            }
        }
    }
}
