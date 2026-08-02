package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.eys0;
import xsna.iys0;

/* compiled from: VideoNotLoadedFeature.kt */
/* loaded from: classes3.dex */
public final class gys0 extends wk50<lys0, hys0, eys0, jys0> {
    public final f4z f;

    public gys0(kys0 kys0Var) {
        super(null, kys0Var);
        this.f = new f4z();
    }

    @Override // xsna.wk50
    public final void N(hys0 hys0Var, eys0 eys0Var) {
        eys0 eys0Var2 = eys0Var;
        boolean equals = eys0Var2.equals(eys0.c.b);
        f4z f4zVar = this.f;
        if (equals) {
            f4zVar.b(iys0.c.a);
        } else if (eys0Var2.equals(eys0.a.b)) {
            f4zVar.b(iys0.a.a);
        } else {
            if (!eys0Var2.equals(eys0.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(iys0.b.a);
        }
    }
}
