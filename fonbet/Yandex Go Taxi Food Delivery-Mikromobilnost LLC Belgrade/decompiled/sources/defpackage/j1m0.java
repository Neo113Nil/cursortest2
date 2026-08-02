package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class j1m0 implements h1m0 {
    public static final tig0 x;
    public final Map a;
    public final hz40 b;
    public l1m0 c;
    public final ohk0 w;

    static {
        byte b = 0;
        x = new tig0(new dok0(b, 28), new i1m0(b));
    }

    public j1m0(Map map) {
        this.a = map;
        this.b = cmm0.b();
        this.w = new ohk0(24, this);
    }

    @Override // defpackage.h1m0
    public final void b(Object obj, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(533563200);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(this) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.h0(obj);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                ohk0 ohk0Var = this.w;
                if (!((Boolean) ohk0Var.invoke(obj)).booleanValue()) {
                    w511.f(qv10.p("Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.", obj));
                    return;
                }
                Map map = (Map) this.a.get(obj);
                a7u0 a7u0Var = n1m0.a;
                o1m0 o1m0Var = new o1m0(new m1m0(map, ohk0Var));
                btsVar.o0(o1m0Var);
                Q = o1m0Var;
            }
            o1m0 o1m0Var2 = (o1m0) Q;
            sb2.c(new vvf0[]{n1m0.a.a(o1m0Var2), l4z.a.a(o1m0Var2)}, aVar, btsVar, (i2 & 112) | 8);
            boolean e = btsVar.e(this) | btsVar.e(obj) | btsVar.e(o1m0Var2);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new zdk0(11, this, obj, o1m0Var2);
                btsVar.o0(Q2);
            }
            zpn.a(zy11.a, (tls) Q2, btsVar);
            if (btsVar.y && btsVar.G.i == btsVar.z) {
                btsVar.z = -1;
                btsVar.y = false;
            }
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(this, obj, aVar, i, 24);
        }
    }

    public j1m0() {
        this(0);
    }

    public /* synthetic */ j1m0(int i) {
        this(new LinkedHashMap());
    }
}
