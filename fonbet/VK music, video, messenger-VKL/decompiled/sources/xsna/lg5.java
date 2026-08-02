package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.bg5;

/* compiled from: AutoEnhancerReducer.kt */
/* loaded from: classes4.dex */
public final class lg5 extends z9 {
    @Override // xsna.z9
    public final void d(mwx mwxVar) {
        Object value;
        bg5.a aVar;
        bg5 bg5Var = (bg5) mwxVar;
        if (!(bg5Var instanceof bg5.a)) {
            throw new NoWhenBranchMatchedException();
        }
        utk0 utk0Var = (utk0) this.a;
        do {
            value = utk0Var.getValue();
            aVar = (bg5.a) bg5Var;
        } while (!utk0Var.compareAndSet(value, new cg5(aVar.a, aVar.b)));
    }
}
