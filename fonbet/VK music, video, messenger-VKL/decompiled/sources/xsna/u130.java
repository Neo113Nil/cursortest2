package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.gh6;
import xsna.t130;
import xsna.w130;

/* compiled from: ModalPostReactionsTabFeature.kt */
/* loaded from: classes4.dex */
public final class u130<VS extends gh6> extends wk50<VS, x130, t130, w130> {
    public u130() {
        throw null;
    }

    @Override // xsna.wk50
    public final void N(x130 x130Var, t130 t130Var) {
        t130 t130Var2 = t130Var;
        if (t130Var2 instanceof t130.b) {
            t130.b bVar = (t130.b) t130Var2;
            T(new w130.c(new q030(bVar.d, Long.valueOf(bVar.c), bVar.b.b)));
            return;
        }
        if (t130Var2 instanceof t130.d) {
            t130.d dVar = (t130.d) t130Var2;
            T(new w130.d(dVar.b, dVar.c));
        } else if (t130Var2.equals(t130.a.b)) {
            T(w130.a.b);
        } else {
            if (!t130Var2.equals(t130.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            T(w130.b.b);
        }
    }
}
