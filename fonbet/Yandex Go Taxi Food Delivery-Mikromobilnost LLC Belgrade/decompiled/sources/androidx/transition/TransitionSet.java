package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import defpackage.oyr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class TransitionSet extends Transition {
    public int j0;
    public Transition[] m0;
    public ArrayList h0 = new ArrayList();
    public boolean i0 = true;
    public boolean k0 = false;
    public int l0 = 0;

    public static class TransitionSetListener extends TransitionListenerAdapter {
        public TransitionSet a;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            TransitionSet transitionSet = this.a;
            int i = transitionSet.j0 - 1;
            transitionSet.j0 = i;
            if (i == 0) {
                transitionSet.k0 = false;
                transitionSet.q();
            }
            transition.K(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            TransitionSet transitionSet = this.a;
            if (transitionSet.k0) {
                return;
            }
            transitionSet.V();
            transitionSet.k0 = true;
        }
    }

    @Override // androidx.transition.Transition
    public final boolean C() {
        for (int i = 0; i < this.h0.size(); i++) {
            if (((Transition) this.h0.get(i)).C()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public final boolean D() {
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            if (!((Transition) this.h0.get(i)).D()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    public final void H(View view) {
        super.H(view);
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.h0.get(i)).H(view);
        }
    }

    @Override // androidx.transition.Transition
    public final void J() {
        this.a0 = 0L;
        TransitionListenerAdapter transitionListenerAdapter = new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.2
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition) {
                TransitionSet transitionSet = TransitionSet.this;
                transitionSet.h0.remove(transition);
                if (transitionSet.C()) {
                    return;
                }
                transitionSet.G(transitionSet, Transition.TransitionNotification.c, false);
                transitionSet.R = true;
                transitionSet.G(transitionSet, Transition.TransitionNotification.b, false);
            }
        };
        for (int i = 0; i < this.h0.size(); i++) {
            Transition transition = (Transition) this.h0.get(i);
            transition.a(transitionListenerAdapter);
            transition.J();
            long j = transition.a0;
            boolean z = this.i0;
            long j2 = this.a0;
            if (z) {
                this.a0 = Math.max(j2, j);
            } else {
                transition.c0 = j2;
                this.a0 = j2 + j;
            }
        }
    }

    @Override // androidx.transition.Transition
    public final Transition K(Transition.TransitionListener transitionListener) {
        super.K(transitionListener);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void L(View view) {
        for (int i = 0; i < this.h0.size(); i++) {
            ((Transition) this.h0.get(i)).L(view);
        }
        this.y.remove(view);
    }

    @Override // androidx.transition.Transition
    public final void M(View view) {
        super.M(view);
        Transition[] e0 = e0();
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            e0[i].M(view);
        }
        Arrays.fill(e0, (Object) null);
        this.m0 = e0;
    }

    @Override // androidx.transition.Transition
    public final void N() {
        ArrayList arrayList;
        if (this.h0.isEmpty()) {
            V();
            q();
            return;
        }
        TransitionSetListener transitionSetListener = new TransitionSetListener();
        transitionSetListener.a = this;
        Iterator it = this.h0.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).a(transitionSetListener);
        }
        this.j0 = this.h0.size();
        if (this.i0) {
            Iterator it2 = this.h0.iterator();
            while (it2.hasNext()) {
                ((Transition) it2.next()).N();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.h0.size();
            arrayList = this.h0;
            if (i >= size) {
                break;
            }
            Transition transition = (Transition) arrayList.get(i - 1);
            final Transition transition2 = (Transition) this.h0.get(i);
            transition.a(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition3) {
                    Transition.this.N();
                    transition3.K(this);
                }
            });
            i++;
        }
        Transition transition3 = (Transition) arrayList.get(0);
        if (transition3 != null) {
            transition3.N();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(long j, long j2) {
        long j3;
        long j4 = this.a0;
        long j5 = 0;
        if (this.I != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.R = false;
            G(this, Transition.TransitionNotification.a, z);
        }
        if (!this.i0) {
            int i = 1;
            while (true) {
                int size = this.h0.size();
                ArrayList arrayList = this.h0;
                if (i >= size) {
                    i = arrayList.size();
                    break;
                } else if (((Transition) arrayList.get(i)).c0 > j2) {
                    break;
                } else {
                    i++;
                }
            }
            int i2 = i - 1;
            if (j >= j2) {
                while (i2 < this.h0.size()) {
                    Transition transition = (Transition) this.h0.get(i2);
                    long j6 = transition.c0;
                    j3 = j5;
                    long j7 = j - j6;
                    if (j7 < j3) {
                        break;
                    }
                    transition.O(j7, j2 - j6);
                    i2++;
                    j5 = j3;
                }
            } else {
                j3 = 0;
                while (i2 >= 0) {
                    Transition transition2 = (Transition) this.h0.get(i2);
                    long j8 = transition2.c0;
                    long j9 = j - j8;
                    transition2.O(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            if (this.I == null) {
                if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.R = true;
                }
                G(this, Transition.TransitionNotification.b, z);
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < this.h0.size(); i3++) {
            ((Transition) this.h0.get(i3)).O(j, j2);
        }
        j3 = j5;
        if (this.I == null) {
        }
    }

    @Override // androidx.transition.Transition
    public final void Q(Transition.EpicenterCallback epicenterCallback) {
        this.W = epicenterCallback;
        this.l0 |= 8;
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.h0.get(i)).Q(epicenterCallback);
        }
    }

    @Override // androidx.transition.Transition
    public final void S(PathMotion pathMotion) {
        super.S(pathMotion);
        this.l0 |= 4;
        if (this.h0 != null) {
            for (int i = 0; i < this.h0.size(); i++) {
                ((Transition) this.h0.get(i)).S(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void T(TransitionPropagation transitionPropagation) {
        this.V = transitionPropagation;
        this.l0 |= 2;
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.h0.get(i)).T(transitionPropagation);
        }
    }

    @Override // androidx.transition.Transition
    public final void U(long j) {
        this.b = j;
    }

    @Override // androidx.transition.Transition
    public final String W(String str) {
        String W = super.W(str);
        for (int i = 0; i < this.h0.size(); i++) {
            StringBuilder v = oyr.v(W, "\n");
            v.append(((Transition) this.h0.get(i)).W(str.concat("  ")));
            W = v.toString();
        }
        return W;
    }

    public final void X(Transition.TransitionListener transitionListener) {
        super.a(transitionListener);
    }

    @Override // androidx.transition.Transition
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void d(View view) {
        for (int i = 0; i < this.h0.size(); i++) {
            ((Transition) this.h0.get(i)).d(view);
        }
        this.y.add(view);
    }

    public final void Z(Transition transition) {
        this.h0.add(transition);
        transition.I = this;
        long j = this.c;
        if (j >= 0) {
            transition.P(j);
        }
        if ((this.l0 & 1) != 0) {
            transition.R(this.w);
        }
        if ((this.l0 & 2) != 0) {
            transition.T(this.V);
        }
        if ((this.l0 & 4) != 0) {
            transition.S(this.Z);
        }
        if ((this.l0 & 8) != 0) {
            transition.Q(this.W);
        }
    }

    public final Transition a0(int i) {
        if (i < 0 || i >= this.h0.size()) {
            return null;
        }
        return (Transition) this.h0.get(i);
    }

    @Override // androidx.transition.Transition
    public final Transition b(String str) {
        throw null;
    }

    @Override // androidx.transition.Transition
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final void P(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.h0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.h0.get(i)).P(j);
        }
    }

    @Override // androidx.transition.Transition
    public final void c(int i) {
        for (int i2 = 0; i2 < this.h0.size(); i2++) {
            ((Transition) this.h0.get(i2)).c(i);
        }
        super.c(i);
    }

    @Override // androidx.transition.Transition
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void R(TimeInterpolator timeInterpolator) {
        this.l0 |= 1;
        ArrayList arrayList = this.h0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.h0.get(i)).R(timeInterpolator);
            }
        }
        this.w = timeInterpolator;
    }

    @Override // androidx.transition.Transition
    public final void cancel() {
        super.cancel();
        Transition[] e0 = e0();
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            e0[i].cancel();
        }
        Arrays.fill(e0, (Object) null);
        this.m0 = e0;
    }

    public final void d0(int i) {
        if (i == 0) {
            this.i0 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(oyr.i(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.i0 = false;
        }
    }

    public final Transition[] e0() {
        Transition[] transitionArr = this.m0;
        this.m0 = null;
        if (transitionArr == null) {
            transitionArr = new Transition[this.h0.size()];
        }
        return (Transition[]) this.h0.toArray(transitionArr);
    }

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        if (F(transitionValues.b)) {
            Iterator it = this.h0.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.F(transitionValues.b)) {
                    transition.f(transitionValues);
                    transitionValues.c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void h(TransitionValues transitionValues) {
        super.h(transitionValues);
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.h0.get(i)).h(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        if (F(transitionValues.b)) {
            Iterator it = this.h0.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.F(transitionValues.b)) {
                    transition.i(transitionValues);
                    transitionValues.c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: m */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.h0 = new ArrayList();
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            Transition clone = ((Transition) this.h0.get(i)).clone();
            transitionSet.h0.add(clone);
            clone.I = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public final void p(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            Transition transition = (Transition) this.h0.get(i);
            if (j > 0 && (this.i0 || i == 0)) {
                long j2 = transition.b;
                if (j2 > 0) {
                    transition.U(j2 + j);
                } else {
                    transition.U(j);
                }
            }
            transition.p(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public final void u(View view) {
        for (int i = 0; i < this.h0.size(); i++) {
            ((Transition) this.h0.get(i)).u(view);
        }
        super.u(view);
    }

    @Override // androidx.transition.Transition
    public final void v() {
        for (int i = 0; i < this.h0.size(); i++) {
            ((Transition) this.h0.get(i)).v();
        }
        super.v();
    }

    @Override // androidx.transition.Transition
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        Transition[] e0 = e0();
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            e0[i].w(viewGroup);
        }
        Arrays.fill(e0, (Object) null);
        this.m0 = e0;
    }
}
