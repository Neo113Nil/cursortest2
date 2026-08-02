package defpackage;

import android.view.View;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class g0d {
    public int a;
    public int b;
    public Object c;
    public final Serializable d;
    public final Object e;
    public Object f;
    public Object g;

    public g0d(Class cls, Class[] clsArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.f = new HashSet();
        hashSet.add(jgg0.a(cls));
        for (Class cls2 : clsArr) {
            jhe0.a(cls2, "Null interface");
            ((HashSet) this.d).add(jgg0.a(cls2));
        }
    }

    public void a(vwi vwiVar) {
        if (((HashSet) this.d).contains(vwiVar.a)) {
            ny61.g("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            ((HashSet) this.e).add(vwiVar);
        }
    }

    public void b(h690 h690Var) {
        tls tlsVar = (tls) this.e;
        this.f = h690Var;
        d();
        if (h690Var instanceof c690) {
            tlsVar.invoke(rzo.r(((c690) h690Var).a));
            return;
        }
        if (h690Var instanceof g690) {
            yul yulVar = new yul(0, this, h690Var);
            this.g = yulVar;
            ((View) this.c).addOnLayoutChangeListener(yulVar);
        } else if (h690Var == null) {
            tlsVar.invoke(pkj.x);
        } else {
            w511.b();
        }
    }

    public j0d c() {
        if (((e1d) this.g) != null) {
            return new j0d((String) this.c, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.a, this.b, (e1d) this.g, (HashSet) this.f);
        }
        ny61.r("Missing required property: factory.");
        return null;
    }

    public void d() {
        yul yulVar = (yul) this.g;
        if (yulVar != null) {
            ((View) this.c).removeOnLayoutChangeListener(yulVar);
        }
        this.g = null;
        this.b = -1;
    }

    public void e(int i) {
        if (this.a == 0) {
            this.a = i;
        } else {
            ny61.r("Instantiation type has already been set.");
        }
    }

    public g0d(jgg0 jgg0Var, jgg0[] jgg0VarArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.f = new HashSet();
        hashSet.add(jgg0Var);
        for (jgg0 jgg0Var2 : jgg0VarArr) {
            jhe0.a(jgg0Var2, "Null interface");
        }
        Collections.addAll((HashSet) this.d, jgg0VarArr);
    }

    public g0d(View view, Integer num, int i, tls tlsVar) {
        this.c = view;
        this.d = num;
        this.a = i;
        this.e = tlsVar;
        this.b = -1;
    }
}
