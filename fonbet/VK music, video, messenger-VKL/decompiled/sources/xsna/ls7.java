package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ks7;

/* compiled from: BookingPreloaderReducer.kt */
/* loaded from: classes18.dex */
public final class ls7 implements bm50<ss7, ks7> {
    @Override // xsna.bm50
    public final ss7 a(ss7 ss7Var, ks7 ks7Var) {
        ss7 ss7Var2 = ss7Var;
        ks7 ks7Var2 = ks7Var;
        if (ks7Var2 instanceof ks7.a) {
            return new ss7(null, false, null);
        }
        if (ks7Var2.equals(ks7.b.a)) {
            return new ss7(ss7Var2.b, true, ss7Var2.d);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(ks7 ks7Var) {
        return true;
    }
}
