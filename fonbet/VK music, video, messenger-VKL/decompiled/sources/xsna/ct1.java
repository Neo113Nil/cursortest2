package xsna;

import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* compiled from: AlignVerticallyReference.java */
/* loaded from: classes11.dex */
public final class ct1 extends androidx.constraintlayout.core.state.c {
    public float n0;

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, xsna.dpf0
    public final void apply() {
        Iterator<Object> it = this.m0.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.a b = this.k0.b(it.next());
            b.h();
            Object obj = this.R;
            if (obj != null) {
                b.p(obj);
            } else {
                Object obj2 = this.S;
                if (obj2 != null) {
                    b.d0 = State.Constraint.TOP_TO_BOTTOM;
                    b.S = obj2;
                } else {
                    b.p(0);
                }
            }
            Object obj3 = this.U;
            if (obj3 != null) {
                b.d0 = State.Constraint.BOTTOM_TO_TOP;
                b.U = obj3;
            } else {
                Object obj4 = this.V;
                if (obj4 != null) {
                    b.e(obj4);
                } else {
                    b.e(0);
                }
            }
            float f = this.n0;
            if (f != 0.5f) {
                b.i = f;
            }
        }
    }
}
