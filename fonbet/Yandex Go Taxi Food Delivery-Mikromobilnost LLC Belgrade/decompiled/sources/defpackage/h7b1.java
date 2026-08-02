package defpackage;

import android.content.Context;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.zzw;

/* loaded from: classes11.dex */
public final /* synthetic */ class h7b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h7b1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d3, code lost:
    
        if (r10.lh() >= 242600) goto L22;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                m7b1 m7b1Var = (m7b1) obj;
                m8b1 m8b1Var = (m8b1) m7b1Var.c.b;
                m8b1Var.Gg();
                g gVar = (g) m8b1Var.b;
                y1a1 y1a1Var = gVar.y;
                Context context = gVar.a;
                g.g(y1a1Var);
                y1a1Var.G.a("Application going to the background");
                o5a1 o5a1Var = gVar.x;
                g.e(o5a1Var);
                o5a1Var.M.b(true);
                m8b1Var.Gg();
                m8b1Var.x = true;
                j691 j691Var = gVar.w;
                if (!j691Var.Ug()) {
                    long j = m7b1Var.b;
                    mdi0 mdi0Var = m8b1Var.z;
                    mdi0Var.e(j, false, false);
                    ((s7b1) mdi0Var.c).c();
                }
                long j2 = m7b1Var.a;
                g.g(y1a1Var);
                y1a1Var.F.b(Long.valueOf(j2), "Application backgrounded at: timestamp_millis");
                j jVar = gVar.F;
                g.f(jVar);
                jVar.Gg();
                g gVar2 = (g) jVar.b;
                jVar.Hg();
                j5b1 j3 = gVar2.j();
                j3.Gg();
                j3.Hg();
                if (j3.Ng()) {
                    ieb1 ieb1Var = ((g) j3.b).B;
                    g.e(ieb1Var);
                    break;
                }
                j5b1 j4 = gVar2.j();
                j4.Gg();
                j4.Hg();
                j4.Ug(new do91((Object) j4, (Object) j4.Wg(true), false, 28));
                if (j691Var.Qg(null, nw91.N0)) {
                    ieb1 ieb1Var2 = gVar.B;
                    g.e(ieb1Var2);
                    long Ng = ieb1Var2.fh(context.getPackageName(), j691Var.w) ? 1000L : j691Var.Ng(context.getPackageName(), nw91.E);
                    g.g(y1a1Var);
                    y1a1Var.H.b(Long.valueOf(Ng), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    g.d(gVar.N);
                    gVar.N.Kg(Ng);
                    break;
                }
                break;
            case 1:
                ((zzw) obj).zza();
                break;
            default:
                g gVar3 = (g) obj;
                ieb1 ieb1Var3 = gVar3.B;
                j jVar2 = gVar3.F;
                g.e(ieb1Var3);
                ieb1Var3.Gg();
                if (ieb1Var3.ah() != 1) {
                    y1a1 y1a1Var2 = gVar3.y;
                    g.g(y1a1Var2);
                    y1a1Var2.C.a("registerTrigger called but app not eligible");
                    break;
                } else {
                    g.f(jVar2);
                    jVar2.Gg();
                    cla1 cla1Var = jVar2.F;
                    if (cla1Var != null) {
                        cla1Var.c();
                    }
                    g.f(jVar2);
                    new Thread(new xka1(jVar2, 2)).start();
                    break;
                }
        }
    }
}
