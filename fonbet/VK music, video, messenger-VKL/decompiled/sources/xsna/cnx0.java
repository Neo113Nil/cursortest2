package xsna;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: classes11.dex */
public final class cnx0 {
    public static int f;
    public ArrayList<ConstraintWidget> a;
    public int b;
    public int c;
    public ArrayList<a> d;
    public int e;

    /* compiled from: WidgetGroup.java */
    public static class a {
    }

    public final boolean a(ConstraintWidget constraintWidget) {
        ArrayList<ConstraintWidget> arrayList = this.a;
        if (arrayList.contains(constraintWidget)) {
            return false;
        }
        arrayList.add(constraintWidget);
        return true;
    }

    public final void b(ArrayList<cnx0> arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                cnx0 cnx0Var = arrayList.get(i);
                if (this.e == cnx0Var.b) {
                    d(this.c, cnx0Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int c(androidx.constraintlayout.core.c cVar, int i) {
        int n;
        int n2;
        ArrayList<ConstraintWidget> arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) arrayList.get(0).W;
        cVar.t();
        dVar.f(cVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).f(cVar, false);
        }
        if (i == 0 && dVar.E0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(dVar, cVar, arrayList, 0);
        }
        if (i == 1 && dVar.F0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(dVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace(X3.j.d, "   at ").replace(StringUtils.COMMA, "\n   at").replace(X3.j.e, ""));
        }
        this.d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ConstraintWidget constraintWidget = arrayList.get(i3);
            a aVar = new a();
            new WeakReference(constraintWidget);
            androidx.constraintlayout.core.c.n(constraintWidget.K);
            androidx.constraintlayout.core.c.n(constraintWidget.L);
            androidx.constraintlayout.core.c.n(constraintWidget.M);
            androidx.constraintlayout.core.c.n(constraintWidget.N);
            androidx.constraintlayout.core.c.n(constraintWidget.O);
            this.d.add(aVar);
        }
        if (i == 0) {
            n = androidx.constraintlayout.core.c.n(dVar.K);
            n2 = androidx.constraintlayout.core.c.n(dVar.M);
            cVar.t();
        } else {
            n = androidx.constraintlayout.core.c.n(dVar.L);
            n2 = androidx.constraintlayout.core.c.n(dVar.N);
            cVar.t();
        }
        return n2 - n;
    }

    public final void d(int i, cnx0 cnx0Var) {
        Iterator<ConstraintWidget> it = this.a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            cnx0Var.a(next);
            int i2 = cnx0Var.b;
            if (i == 0) {
                next.t0 = i2;
            } else {
                next.u0 = i2;
            }
        }
        this.e = cnx0Var.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : DeviceInfo.STR_TYPE_UNKNOWN);
        sb.append(" [");
        String c = h5s.c(this.b, "] <", sb);
        Iterator<ConstraintWidget> it = this.a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            StringBuilder b = ho8.b(c, " ");
            b.append(next.l0);
            c = b.toString();
        }
        return fo8.a(c, " >");
    }
}
