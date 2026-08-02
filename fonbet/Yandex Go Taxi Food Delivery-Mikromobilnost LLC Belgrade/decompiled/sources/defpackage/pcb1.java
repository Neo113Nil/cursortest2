package defpackage;

import com.google.android.gms.measurement.internal.n;

/* loaded from: classes11.dex */
public final class pcb1 {
    public final n a;
    public int b = 1;
    public long c = d();

    public pcb1(n nVar) {
        this.a = nVar;
    }

    public final void a() {
        this.b++;
        this.c = d();
    }

    public final boolean b() {
        ((kl40) this.a.q4()).getClass();
        return System.currentTimeMillis() >= this.c;
    }

    public final /* synthetic */ long c() {
        return this.c;
    }

    public final long d() {
        n nVar = this.a;
        cvw.l(nVar);
        long longValue = ((Long) nw91.v.a(null)).longValue();
        long longValue2 = ((Long) nw91.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        ((kl40) nVar.q4()).getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
