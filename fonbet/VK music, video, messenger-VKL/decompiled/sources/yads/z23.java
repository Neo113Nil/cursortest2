package yads;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* loaded from: classes10.dex */
public final class z23 implements zg1 {
    public final y23 b;

    public z23(com.monetization.ads.exo.source.dash.a aVar) {
        this.b = aVar;
    }

    @Override // yads.zg1
    public final void a(ch1 ch1Var, long j, long j2, boolean z) {
    }

    @Override // yads.zg1
    public final void a(ch1 ch1Var, long j, long j2) {
        boolean z;
        if (this.b != null) {
            synchronized (b33.b) {
                z = b33.c;
            }
            if (z) {
                ((com.monetization.ads.exo.source.dash.a) this.b).a();
                return;
            }
            y23 y23Var = this.b;
            ((com.monetization.ads.exo.source.dash.a) y23Var).a.a(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // yads.zg1
    public final ah1 a(ch1 ch1Var, long j, long j2, IOException iOException, int i) {
        y23 y23Var = this.b;
        if (y23Var != null) {
            ((com.monetization.ads.exo.source.dash.a) y23Var).a.a(iOException);
        }
        return gh1.d;
    }
}
