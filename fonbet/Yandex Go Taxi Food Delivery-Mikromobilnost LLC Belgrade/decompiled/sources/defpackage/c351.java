package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.b;
import androidx.constraintlayout.core.widgets.d;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class c351 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final boolean a(ConstraintWidget constraintWidget) {
        ArrayList arrayList = this.a;
        if (arrayList.contains(constraintWidget)) {
            return false;
        }
        arrayList.add(constraintWidget);
        return true;
    }

    public final void b(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                c351 c351Var = (c351) arrayList.get(i);
                if (this.e == c351Var.b) {
                    d(this.c, c351Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int c(ijy ijyVar, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        d dVar = (d) ((ConstraintWidget) arrayList.get(0)).V;
        ijyVar.t();
        dVar.c(ijyVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ConstraintWidget) arrayList.get(i2)).c(ijyVar, false);
        }
        if (i == 0 && dVar.E0 > 0) {
            b.a(dVar, ijyVar, arrayList, 0);
        }
        if (i == 1 && dVar.F0 > 0) {
            b.a(dVar, ijyVar, arrayList, 1);
        }
        try {
            ijyVar.p();
        } catch (Exception e) {
            PrintStream printStream = System.err;
            Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", "");
            printStream.getClass();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i3);
            egz egzVar = new egz();
            new WeakReference(constraintWidget);
            ijy.n(constraintWidget.J);
            ijy.n(constraintWidget.K);
            ijy.n(constraintWidget.L);
            ijy.n(constraintWidget.M);
            ijy.n(constraintWidget.N);
            this.d.add(egzVar);
        }
        if (i == 0) {
            n = ijy.n(dVar.J);
            n2 = ijy.n(dVar.L);
            ijyVar.t();
        } else {
            n = ijy.n(dVar.K);
            n2 = ijy.n(dVar.M);
            ijyVar.t();
        }
        return n2 - n;
    }

    public final void d(int i, c351 c351Var) {
        int i2 = c351Var.b;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            c351Var.a(constraintWidget);
            if (i == 0) {
                constraintWidget.s0 = i2;
            } else {
                constraintWidget.t0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String m = oyr.m(this.b, "] <", sb);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            StringBuilder v = oyr.v(m, " ");
            v.append(constraintWidget.k0);
            m = v.toString();
        }
        return m.concat(" >");
    }
}
