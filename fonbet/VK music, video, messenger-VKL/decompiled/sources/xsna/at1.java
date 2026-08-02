package xsna;

import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* compiled from: AlignHorizontallyReference.java */
/* loaded from: classes11.dex */
public final class at1 extends androidx.constraintlayout.core.state.c {
    public float n0;

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, xsna.dpf0
    public final void apply() {
        Iterator<Object> it = this.m0.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.a b = this.k0.b(it.next());
            b.g();
            Object obj = this.N;
            if (obj != null) {
                b.o(obj);
            } else {
                Object obj2 = this.O;
                if (obj2 != null) {
                    b.d0 = State.Constraint.START_TO_END;
                    b.O = obj2;
                } else {
                    b.o(0);
                }
            }
            Object obj3 = this.P;
            if (obj3 != null) {
                b.d0 = State.Constraint.END_TO_START;
                b.P = obj3;
            } else {
                Object obj4 = this.Q;
                if (obj4 != null) {
                    b.i(obj4);
                } else {
                    b.i(0);
                }
            }
            float f = this.n0;
            if (f != 0.5f) {
                b.h = f;
            }
        }
    }
}
