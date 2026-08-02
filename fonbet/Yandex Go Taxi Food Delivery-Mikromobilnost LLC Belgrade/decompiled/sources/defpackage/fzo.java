package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes4.dex */
public final class fzo extends n2 {
    public Hashtable a = new Hashtable();
    public Vector b = new Vector();

    public fzo(byo[] byoVarArr) {
        for (int i = 0; i != byoVarArr.length; i++) {
            byo byoVar = byoVarArr[i];
            this.b.addElement(byoVar.a);
            this.a.put(byoVar.a, byoVar);
        }
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        Vector vector = this.b;
        b2 b2Var = new b2(vector.size());
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            b2Var.a((byo) this.a.get((t2) elements.nextElement()));
        }
        return new iqf(b2Var);
    }
}
