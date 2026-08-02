package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class fnb {
    public Map a;
    public final r0 b;
    public final r0 c;
    public final r0 d;
    public final gci0 e;
    public final r0 f;
    public final r0 g;
    public final r0 h;
    public final r0 i;
    public final r0 j;
    public final r0 k;

    public fnb() {
        r0 c = bvf0.c(qmb.a);
        this.b = c;
        this.c = c;
        r0 c2 = bvf0.c(b.f());
        this.d = c2;
        this.e = e.d(c2);
        Boolean bool = Boolean.FALSE;
        r0 c3 = bvf0.c(bool);
        this.f = c3;
        this.g = c3;
        r0 c4 = bvf0.c(klb.a);
        this.h = c4;
        this.i = c4;
        r0 c5 = bvf0.c(bool);
        this.j = c5;
        this.k = c5;
    }

    public final llc a() {
        Object value = this.b.getValue();
        wmb wmbVar = value instanceof wmb ? (wmb) value : null;
        if (wmbVar != null) {
            return wmbVar.b;
        }
        return null;
    }

    public final void b(plb plbVar) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.h;
            value = r0Var.getValue();
        } while (!r0Var.k(value, plbVar));
    }

    public final void c(boolean z) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.f;
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.valueOf(z)));
    }

    public final void d(eo21 eo21Var) {
        r0 r0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        String a = eo21Var.a();
        if (a == null) {
            return;
        }
        do {
            r0Var = this.d;
            value = r0Var.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            linkedHashMap.put(a, eo21Var);
        } while (!r0Var.k(value, b.t(linkedHashMap)));
    }

    public final void e(cnb cnbVar) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
        } while (!r0Var.k(value, cnbVar));
        if ((cnbVar instanceof wmb) || (cnbVar instanceof rmb)) {
            do {
                r0Var2 = this.d;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, b.f()));
            do {
                r0Var3 = this.h;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, klb.a));
        }
    }
}
