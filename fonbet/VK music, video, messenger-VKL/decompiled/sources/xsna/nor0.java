package xsna;

import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: VerticalChainReference.java */
/* loaded from: classes11.dex */
public final class nor0 extends dra {

    /* compiled from: VerticalChainReference.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.Chain.values().length];
            a = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, xsna.dpf0
    public final void apply() {
        State state;
        ArrayList<Object> arrayList = this.m0;
        Iterator<Object> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            state = this.k0;
            if (!hasNext) {
                break;
            } else {
                state.b(it.next()).h();
            }
        }
        Iterator<Object> it2 = arrayList.iterator();
        androidx.constraintlayout.core.state.a aVar = null;
        androidx.constraintlayout.core.state.a aVar2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            androidx.constraintlayout.core.state.a b = state.b(next);
            if (aVar2 == null) {
                Object obj = this.R;
                if (obj != null) {
                    b.p(obj);
                    b.k(this.n).m(this.t);
                } else {
                    Object obj2 = this.S;
                    if (obj2 != null) {
                        b.d0 = State.Constraint.TOP_TO_BOTTOM;
                        b.S = obj2;
                        b.k(this.n).m(this.t);
                    } else {
                        String obj3 = b.a.toString();
                        b.p(0);
                        b.l(Float.valueOf(w(obj3))).n(Float.valueOf(v(obj3)));
                    }
                }
                aVar2 = b;
            }
            if (aVar != null) {
                String obj4 = aVar.a.toString();
                String obj5 = b.a.toString();
                Object obj6 = b.a;
                aVar.d0 = State.Constraint.BOTTOM_TO_TOP;
                aVar.U = obj6;
                aVar.l(Float.valueOf(u(obj4))).n(Float.valueOf(t(obj4)));
                Object obj7 = aVar.a;
                b.d0 = State.Constraint.TOP_TO_BOTTOM;
                b.S = obj7;
                b.l(Float.valueOf(w(obj5))).n(Float.valueOf(v(obj5)));
            }
            String obj8 = next.toString();
            HashMap<String, Float> hashMap = this.o0;
            float floatValue = hashMap.containsKey(obj8) ? hashMap.get(obj8).floatValue() : -1.0f;
            if (floatValue != -1.0f) {
                b.g = floatValue;
            }
            aVar = b;
        }
        if (aVar != null) {
            Object obj9 = this.U;
            if (obj9 != null) {
                aVar.d0 = State.Constraint.BOTTOM_TO_TOP;
                aVar.U = obj9;
                aVar.k(this.o).m(this.u);
            } else {
                Object obj10 = this.V;
                if (obj10 != null) {
                    aVar.e(obj10);
                    aVar.k(this.o).m(this.u);
                } else {
                    String obj11 = aVar.a.toString();
                    aVar.e(0);
                    aVar.l(Float.valueOf(u(obj11))).n(Float.valueOf(t(obj11)));
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f = this.n0;
        if (f != 0.5f) {
            aVar2.i = f;
        }
        int i = a.a[this.t0.ordinal()];
        if (i == 1) {
            aVar2.e = 0;
        } else if (i == 2) {
            aVar2.e = 1;
        } else {
            if (i != 3) {
                return;
            }
            aVar2.e = 2;
        }
    }
}
