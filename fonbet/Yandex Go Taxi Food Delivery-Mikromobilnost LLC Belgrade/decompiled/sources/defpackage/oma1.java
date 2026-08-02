package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class oma1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ j c;

    public oma1(j jVar, long j, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                Objects.requireNonNull(jVar);
                this.c = jVar;
                break;
            default:
                this.b = j;
                Objects.requireNonNull(jVar);
                this.c = jVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        j jVar = this.c;
        switch (i) {
            case 0:
                g gVar = (g) jVar.b;
                o5a1 o5a1Var = gVar.x;
                g.e(o5a1Var);
                o5a1Var.E.b(j);
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.G.b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                jVar.Gg();
                jVar.Hg();
                g gVar2 = (g) jVar.b;
                y1a1 y1a1Var2 = gVar2.y;
                g.g(y1a1Var2);
                y1a1Var2.G.a("Resetting analytics data (FE)");
                m8b1 m8b1Var = gVar2.A;
                g.f(m8b1Var);
                m8b1Var.Gg();
                mdi0 mdi0Var = m8b1Var.z;
                ((s7b1) mdi0Var.c).c();
                ((g) ((m8b1) mdi0Var.d).b).D.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                mdi0Var.a = elapsedRealtime;
                mdi0Var.b = elapsedRealtime;
                gVar2.l().Lg();
                boolean z = !gVar2.a();
                o5a1 o5a1Var2 = gVar2.x;
                g.e(o5a1Var2);
                o5a1Var2.z.b(j);
                g gVar3 = (g) o5a1Var2.b;
                o5a1 o5a1Var3 = gVar3.x;
                g.e(o5a1Var3);
                if (!TextUtils.isEmpty(o5a1Var3.P.o())) {
                    o5a1Var2.P.p(null);
                }
                o5a1Var2.J.b(0L);
                o5a1Var2.K.b(0L);
                if (!gVar3.w.Tg()) {
                    o5a1Var2.Pg(z);
                }
                o5a1Var2.Q.p(null);
                o5a1Var2.R.b(0L);
                o5a1Var2.S.F(null);
                j5b1 j2 = gVar2.j();
                j2.Gg();
                j2.Hg();
                zzr Wg = j2.Wg(false);
                j2.Sg();
                ((g) j2.b).i().Kg();
                j2.Ug(new oza1(j2, Wg, 0));
                g.f(m8b1Var);
                m8b1Var.y.b();
                jVar.M = z;
                gVar2.j().Kg(new AtomicReference());
                break;
        }
    }
}
