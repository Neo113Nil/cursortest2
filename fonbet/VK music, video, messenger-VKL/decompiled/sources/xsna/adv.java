package xsna;

import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: HorizontalChainReference.java */
/* loaded from: classes11.dex */
public final class adv extends dra {

    /* compiled from: HorizontalChainReference.java */
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
                state.b(it.next()).g();
            }
        }
        Iterator<Object> it2 = arrayList.iterator();
        androidx.constraintlayout.core.state.a aVar = null;
        androidx.constraintlayout.core.state.a aVar2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            androidx.constraintlayout.core.state.a b = state.b(next);
            if (aVar2 == null) {
                Object obj = this.N;
                if (obj != null) {
                    b.o(obj);
                    b.k(this.l).m(this.r);
                } else {
                    Object obj2 = this.O;
                    if (obj2 != null) {
                        b.d0 = State.Constraint.START_TO_END;
                        b.O = obj2;
                        b.k(this.l).m(this.r);
                    } else {
                        Object obj3 = this.J;
                        if (obj3 != null) {
                            b.o(obj3);
                            b.k(this.j).m(this.p);
                        } else {
                            Object obj4 = this.K;
                            if (obj4 != null) {
                                b.d0 = State.Constraint.START_TO_END;
                                b.O = obj4;
                                b.k(this.j).m(this.p);
                            } else {
                                String obj5 = b.a.toString();
                                b.o(0);
                                b.l(Float.valueOf(w(obj5))).n(Float.valueOf(v(obj5)));
                            }
                        }
                    }
                }
                aVar2 = b;
            }
            if (aVar != null) {
                String obj6 = aVar.a.toString();
                String obj7 = b.a.toString();
                Object obj8 = b.a;
                aVar.d0 = State.Constraint.END_TO_START;
                aVar.P = obj8;
                aVar.l(Float.valueOf(u(obj6))).n(Float.valueOf(t(obj6)));
                Object obj9 = aVar.a;
                b.d0 = State.Constraint.START_TO_END;
                b.O = obj9;
                b.l(Float.valueOf(w(obj7))).n(Float.valueOf(v(obj7)));
            }
            String obj10 = next.toString();
            HashMap<String, Float> hashMap = this.o0;
            float floatValue = hashMap.containsKey(obj10) ? hashMap.get(obj10).floatValue() : -1.0f;
            if (floatValue != -1.0f) {
                b.f = floatValue;
            }
            aVar = b;
        }
        if (aVar != null) {
            Object obj11 = this.P;
            if (obj11 != null) {
                aVar.d0 = State.Constraint.END_TO_START;
                aVar.P = obj11;
                aVar.k(this.m).m(this.s);
            } else {
                Object obj12 = this.Q;
                if (obj12 != null) {
                    aVar.i(obj12);
                    aVar.k(this.m).m(this.s);
                } else {
                    Object obj13 = this.L;
                    if (obj13 != null) {
                        aVar.d0 = State.Constraint.END_TO_START;
                        aVar.P = obj13;
                        aVar.k(this.k).m(this.q);
                    } else {
                        Object obj14 = this.M;
                        if (obj14 != null) {
                            aVar.i(obj14);
                            aVar.k(this.k).m(this.q);
                        } else {
                            String obj15 = aVar.a.toString();
                            aVar.i(0);
                            aVar.l(Float.valueOf(u(obj15))).n(Float.valueOf(t(obj15)));
                        }
                    }
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f = this.n0;
        if (f != 0.5f) {
            aVar2.h = f;
        }
        int i = a.a[this.t0.ordinal()];
        if (i == 1) {
            aVar2.d = 0;
        } else if (i == 2) {
            aVar2.d = 1;
        } else {
            if (i != 3) {
                return;
            }
            aVar2.d = 2;
        }
    }
}
