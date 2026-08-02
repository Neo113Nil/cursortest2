package xsna;

import java.util.List;
import xsna.tra0;

/* compiled from: FeedFooter.kt */
/* loaded from: classes18.dex */
public final class rzq implements cp10 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public rzq(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        final int r0 = ep10Var.r0(this.a);
        final int r02 = ep10Var.r0(this.b);
        zo10 zo10Var = list.get(0);
        if (!((r0 >= 0) & (r0 >= 0))) {
            wzw.a("width and height must be >= 0");
        }
        final tra0 N = zo10Var.N(s6j.h(r0, r0, r0, r0));
        zo10 zo10Var2 = list.get(1);
        if (!((r02 >= 0) & (r02 >= 0))) {
            wzw.a("width and height must be >= 0");
        }
        final tra0 N2 = zo10Var2.N(s6j.h(r02, r02, r02, r02));
        return ep10Var.Q(r0, r0, jgp.b, new izs() { // from class: xsna.qzq
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                tra0.a aVar = (tra0.a) obj;
                tra0.a.x(aVar, N, 0, 0);
                int i = (r0 - r02) / 2;
                tra0.a.x(aVar, N2, i, i);
                return s3q0.a;
            }
        });
    }
}
