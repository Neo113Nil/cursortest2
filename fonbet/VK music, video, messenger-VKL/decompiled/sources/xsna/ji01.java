package xsna;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ji01 implements Runnable {
    public final long b;
    public final long c;
    public final /* synthetic */ rd50 d;

    public ji01(rd50 rd50Var, long j, long j2) {
        this.d = rd50Var;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kb01 kb01Var = ((mb01) ((fj01) this.d.c).b).k;
        mb01.k(kb01Var);
        kb01Var.s(new Runnable() { // from class: xsna.ii01
            @Override // java.lang.Runnable
            public final void run() {
                ji01 ji01Var = ji01.this;
                rd50 rd50Var = ji01Var.d;
                long j = ji01Var.b;
                long j2 = ji01Var.c;
                ((fj01) rd50Var.c).k();
                fj01 fj01Var = (fj01) rd50Var.c;
                dj01 dj01Var = fj01Var.h;
                mb01 mb01Var = (mb01) fj01Var.b;
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.p.a("Application going to the background");
                x901 x901Var = mb01Var.i;
                mb01.i(x901Var);
                x901Var.t.a(true);
                Bundle bundle = new Bundle();
                if (!mb01Var.h.v()) {
                    dj01Var.c.a();
                    dj01Var.a(j2, false, false);
                }
                bf01 bf01Var = mb01Var.q;
                mb01.j(bf01Var);
                bf01Var.s("auto", "_ab", bundle, j);
            }
        });
    }
}
