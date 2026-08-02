package defpackage;

import androidx.lifecycle.v;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public class ch10 extends dy40 {
    public final yol0 l = new yol0();

    @Override // androidx.lifecycle.v
    public final void h() {
        Iterator it = this.l.iterator();
        while (true) {
            xol0 xol0Var = (xol0) it;
            if (!xol0Var.hasNext()) {
                return;
            }
            bh10 bh10Var = (bh10) ((Map.Entry) xol0Var.next()).getValue();
            bh10Var.a.g(bh10Var);
        }
    }

    @Override // androidx.lifecycle.v
    public final void i() {
        Iterator it = this.l.iterator();
        while (true) {
            xol0 xol0Var = (xol0) it;
            if (!xol0Var.hasNext()) {
                return;
            }
            bh10 bh10Var = (bh10) ((Map.Entry) xol0Var.next()).getValue();
            bh10Var.a.j(bh10Var);
        }
    }

    public final void n(v vVar, pq60 pq60Var) {
        Object obj;
        if (vVar == null) {
            ny61.t("source cannot be null");
            return;
        }
        bh10 bh10Var = new bh10(vVar, pq60Var);
        yol0 yol0Var = this.l;
        vol0 a = yol0Var.a(vVar);
        if (a != null) {
            obj = a.b;
        } else {
            vol0 vol0Var = new vol0(vVar, bh10Var);
            yol0Var.w++;
            vol0 vol0Var2 = yol0Var.b;
            if (vol0Var2 == null) {
                yol0Var.a = vol0Var;
                yol0Var.b = vol0Var;
            } else {
                vol0Var2.c = vol0Var;
                vol0Var.w = vol0Var2;
                yol0Var.b = vol0Var;
            }
            obj = null;
        }
        bh10 bh10Var2 = (bh10) obj;
        if (bh10Var2 != null && bh10Var2.b != pq60Var) {
            ny61.g("This source was already added with the different observer");
        } else if (bh10Var2 == null && e()) {
            vVar.g(bh10Var);
        }
    }
}
