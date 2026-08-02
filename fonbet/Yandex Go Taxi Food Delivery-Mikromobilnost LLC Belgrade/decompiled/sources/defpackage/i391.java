package defpackage;

import com.google.android.gms.measurement.internal.g;

/* loaded from: classes11.dex */
public final class i391 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ bh91 w;

    public /* synthetic */ i391(bh91 bh91Var, String str, long j, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.w = bh91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        String str = this.b;
        bh91 bh91Var = this.w;
        switch (i) {
            case 0:
                bh91Var.Gg();
                cvw.i(str);
                w53 w53Var = bh91Var.w;
                if (w53Var.isEmpty()) {
                    bh91Var.x = j;
                }
                Integer num = (Integer) w53Var.get(str);
                if (num == null) {
                    if (w53Var.c < 100) {
                        w53Var.put(str, 1);
                        bh91Var.c.put(str, Long.valueOf(j));
                        break;
                    } else {
                        y1a1 y1a1Var = ((g) bh91Var.b).y;
                        g.g(y1a1Var);
                        y1a1Var.C.a("Too many ads visible");
                        break;
                    }
                } else {
                    w53Var.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            default:
                bh91Var.Gg();
                cvw.i(str);
                w53 w53Var2 = bh91Var.w;
                Integer num2 = (Integer) w53Var2.get(str);
                g gVar = (g) bh91Var.b;
                if (num2 == null) {
                    y1a1 y1a1Var2 = gVar.y;
                    g.g(y1a1Var2);
                    y1a1Var2.z.b(str, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    jya1 jya1Var = gVar.E;
                    y1a1 y1a1Var3 = gVar.y;
                    g.f(jya1Var);
                    qwa1 Mg = jya1Var.Mg(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue != 0) {
                        w53Var2.put(str, Integer.valueOf(intValue));
                        break;
                    } else {
                        w53Var2.remove(str);
                        w53 w53Var3 = bh91Var.c;
                        Long l = (Long) w53Var3.get(str);
                        if (l == null) {
                            g.g(y1a1Var3);
                            y1a1Var3.z.a("First ad unit exposure time was never set");
                        } else {
                            long longValue = j - l.longValue();
                            w53Var3.remove(str);
                            bh91Var.Lg(str, longValue, Mg);
                        }
                        if (w53Var2.isEmpty()) {
                            long j2 = bh91Var.x;
                            if (j2 != 0) {
                                bh91Var.Kg(j - j2, Mg);
                                bh91Var.x = 0L;
                                break;
                            } else {
                                g.g(y1a1Var3);
                                y1a1Var3.z.a("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
