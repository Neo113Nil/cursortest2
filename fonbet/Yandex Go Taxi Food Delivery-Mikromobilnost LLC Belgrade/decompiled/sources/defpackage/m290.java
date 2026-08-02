package defpackage;

import androidx.compose.foundation.c;

/* loaded from: classes10.dex */
public abstract class m290 {
    public static final qwd a = new qwd(new ur70(24));

    public static final c a(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(282942128);
        i92 i92Var = (i92) btsVar.m(a);
        if (i92Var == null) {
            btsVar.t(false);
            return null;
        }
        boolean k = btsVar.k(i92Var);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            c cVar = new c(i92Var.a, i92Var.b, i92Var.c, i92Var.d);
            btsVar.o0(cVar);
            Q = cVar;
        }
        c cVar2 = (c) Q;
        btsVar.t(false);
        return cVar2;
    }
}
