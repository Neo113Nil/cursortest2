package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes10.dex */
public final class p5y {
    public final h1m0 a;
    public final w01 b;
    public final hz40 c = cmm0.b();

    public p5y(h1m0 h1m0Var, w01 w01Var) {
        this.a = h1m0Var;
        this.b = w01Var;
    }

    public final wls a(int i, Object obj, Object obj2) {
        hz40 hz40Var = this.c;
        o5y o5yVar = (o5y) hz40Var.d(obj);
        int i2 = 8;
        if (o5yVar != null && o5yVar.c == i && jl40.l(o5yVar.b, obj2)) {
            a aVar = o5yVar.d;
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a(818252804, new s0v(i2, o5yVar.e, o5yVar), true);
            o5yVar.d = aVar2;
            return aVar2;
        }
        o5y o5yVar2 = new o5y(this, i, obj, obj2);
        hz40Var.o(obj, o5yVar2);
        a aVar3 = o5yVar2.d;
        if (aVar3 != null) {
            return aVar3;
        }
        a aVar4 = new a(818252804, new s0v(i2, this, o5yVar2), true);
        o5yVar2.d = aVar4;
        return aVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        o5y o5yVar = (o5y) this.c.d(obj);
        if (o5yVar != null) {
            return o5yVar.b;
        }
        q5y q5yVar = (q5y) this.b.invoke();
        int b = q5yVar.b(obj);
        if (b != -1) {
            return q5yVar.a(b);
        }
        return null;
    }
}
