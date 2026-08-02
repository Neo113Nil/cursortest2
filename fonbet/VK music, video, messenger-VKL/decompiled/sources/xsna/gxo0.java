package xsna;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: TimelineUpdateAnimation.kt */
/* loaded from: classes18.dex */
public final class gxo0 {
    public final List<List<gp6>> a;
    public final ftm b;
    public final dbj0 c;
    public ValueAnimator d;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public gxo0(List list, ArrayList arrayList, ftm ftmVar, dbj0 dbj0Var) {
        this.a = list;
        this.b = ftmVar;
        this.c = dbj0Var;
    }

    public static boolean a(List list, gp6 gp6Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                if (epx.f(((gp6) it2.next()).m(), gp6Var.m())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(gp6 gp6Var, gp6 gp6Var2, gp6 gp6Var3) {
        if ((gp6Var instanceof ckt0) && (gp6Var2 instanceof ckt0) && (gp6Var3 instanceof ckt0)) {
            ckt0 ckt0Var = (ckt0) gp6Var;
            boolean z = epx.f(ckt0Var.i, ((ckt0) gp6Var2).i) && epx.f(ckt0Var.i, ((ckt0) gp6Var3).i);
            boolean z2 = ((ckt0) gp6Var).getDuration() == ((ckt0) gp6Var3).getDuration() + ((ckt0) gp6Var2).getDuration();
            if (z && z2) {
                return true;
            }
        }
        return false;
    }
}
