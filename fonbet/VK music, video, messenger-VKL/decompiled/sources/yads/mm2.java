package yads;

import java.util.Iterator;
import java.util.List;
import xsna.e43;

/* loaded from: classes10.dex */
public final class mm2 implements ug3 {
    public final cl3 a;
    public final List b = e43.o(new lm2(bl3.b, 0.25f), new lm2(bl3.c, 0.5f), new lm2(bl3.d, 0.75f));

    public mm2(dl3 dl3Var) {
        this.a = dl3Var;
    }

    @Override // yads.ug3
    public final void a(long j, long j2) {
        if (j != 0) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                lm2 lm2Var = (lm2) it.next();
                if (lm2Var.b * j <= j2) {
                    this.a.a(lm2Var.a);
                    it.remove();
                }
            }
        }
    }
}
