package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.a;

/* loaded from: classes8.dex */
public abstract class jmw0 implements lmw0 {
    public final i3y a;
    public final i3y b;

    public jmw0() {
        final int i = 0;
        this.a = a.a(new sls(this) { // from class: imw0
            public final /* synthetic */ jmw0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                jmw0 jmw0Var = this.b;
                switch (i2) {
                    case 0:
                        ArrayList arrayList = jmw0Var.s().c;
                        int d = gw00.d(tcc.n(arrayList, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                        for (Object obj : arrayList) {
                            linkedHashMap.put(((ejj0) obj).a, obj);
                        }
                        return linkedHashMap;
                    default:
                        HashMap hashMap = new HashMap(jmw0Var.s().c.size());
                        Iterator it = jmw0Var.s().c.iterator();
                        while (it.hasNext()) {
                            ejj0 ejj0Var = (ejj0) it.next();
                            kf70 kf70Var = ejj0Var.l;
                            if (kf70Var != null) {
                                hashMap.put(kf70Var, ejj0Var);
                            }
                        }
                        return hashMap;
                }
            }
        });
        final int i2 = 1;
        this.b = a.a(new sls(this) { // from class: imw0
            public final /* synthetic */ jmw0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                jmw0 jmw0Var = this.b;
                switch (i22) {
                    case 0:
                        ArrayList arrayList = jmw0Var.s().c;
                        int d = gw00.d(tcc.n(arrayList, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                        for (Object obj : arrayList) {
                            linkedHashMap.put(((ejj0) obj).a, obj);
                        }
                        return linkedHashMap;
                    default:
                        HashMap hashMap = new HashMap(jmw0Var.s().c.size());
                        Iterator it = jmw0Var.s().c.iterator();
                        while (it.hasNext()) {
                            ejj0 ejj0Var = (ejj0) it.next();
                            kf70 kf70Var = ejj0Var.l;
                            if (kf70Var != null) {
                                hashMap.put(kf70Var, ejj0Var);
                            }
                        }
                        return hashMap;
                }
            }
        });
    }

    public abstract boolean m();

    public abstract boolean n();

    public abstract int o();

    public final ejj0 p(String str) {
        return (ejj0) ((Map) this.a.getValue()).get(str);
    }

    public final ejj0 q(kf70 kf70Var) {
        return (ejj0) ((Map) this.b.getValue()).get(kf70Var);
    }

    public abstract List r();

    public abstract vg70 s();

    public final boolean t() {
        return s().c.size() == 1 && ((ejj0) s().c.get(0)).e <= 1;
    }

    public abstract boolean u();
}
