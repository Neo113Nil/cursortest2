package xsna;

import android.text.Layout;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.jio0;
import xsna.veo0;
import xsna.y8g;

/* compiled from: TextEditableDataExt.kt */
/* loaded from: classes4.dex */
public final class yeo0 {
    public static final gfo0 a(gfo0 gfo0Var, wlo0 wlo0Var) {
        y5g y5gVar = wlo0Var.e;
        y8g y8gVar = y5gVar.b;
        y8g y8gVar2 = y5gVar.c;
        lw5 lw5Var = wlo0Var.c.a;
        lw5 lw5Var2 = new lw5(lw5Var.a, y8gVar, lw5Var.c, lw5Var.d, lw5Var.e, lw5Var.f, lw5Var.g, lw5Var.h);
        String str = wlo0Var.a;
        jio0 jio0Var = gfo0Var.a.a;
        t4s t4sVar = wlo0Var.b;
        return new gfo0(new afo0(new jio0(y8gVar2, jio0Var.b, t4sVar.a, t4sVar.b, jio0Var.e, jio0Var.f, wlo0Var.d.a, jio0Var.h, jio0Var.i), lw5Var2), str);
    }

    public static final veo0 b(v7g v7gVar, xeo0 xeo0Var, gfo0 gfo0Var) {
        Object obj;
        Object obj2;
        afo0 afo0Var = gfo0Var.a;
        jio0 jio0Var = afo0Var.a;
        jio0.a aVar = jio0Var.c;
        Layout.Alignment alignment = jio0Var.g;
        lw5 lw5Var = afo0Var.b;
        boolean a = v7gVar.a(lw5Var);
        y8g y8gVar = a ? lw5Var.b : jio0Var.a;
        ArrayList arrayList = xeo0Var.e;
        boolean z = true;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (epx.f((y8g.c) it.next(), y8gVar)) {
                    z = false;
                    break;
                }
            }
        }
        boolean z2 = z;
        Iterator<T> it2 = xeo0Var.d.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((et1) obj2).a == alignment) {
                break;
            }
        }
        et1 et1Var = (et1) obj2;
        Iterator<T> it3 = xeo0Var.c.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (epx.f(((ew5) next).a.a, lw5Var.a)) {
                obj = next;
                break;
            }
        }
        ew5 ew5Var = (ew5) obj;
        return new veo0(gfo0Var, gfo0Var, new wlo0(gfo0Var.b, new t4s(aVar, jio0Var.d), new ew5(lw5Var, ew5Var != null ? ew5Var.b : -1, ew5Var != null ? ew5Var.c : -1), new et1(alignment, et1Var != null ? et1Var.b : -1, et1Var != null ? et1Var.c : -1), new y5g(y8gVar, lw5Var.b, jio0Var.a, z2 ? y8gVar : y8g.a.a, z2, a)), veo0.a.c.a, veo0.a.b.a, xeo0Var);
    }
}
