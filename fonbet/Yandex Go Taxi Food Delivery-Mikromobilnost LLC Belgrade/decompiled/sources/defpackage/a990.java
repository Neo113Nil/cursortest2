package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public abstract class a990 {
    public static final z890 a;
    public static final s890 b;

    static {
        z890 z890Var = new z890(0);
        a = z890Var;
        b = new s890(0, 0, 0, Orientation.Horizontal, 0, 0, 0, msb1.U, new o4y(2), bvf0.a(EmptyCoroutineContext.a), z890Var, p8e.b(0, 0, 0, 0, 15));
    }

    public static final long a(s890 s890Var, int i) {
        int i2 = s890Var.c;
        int i3 = s890Var.b;
        long j = i * (i2 + i3);
        int i4 = -s890Var.f;
        long j2 = ((j + i4) + s890Var.d) - i2;
        int e = (int) (s890Var.e == Orientation.Horizontal ? s890Var.e() >> 32 : s890Var.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        long d = j2 - (e - y6i0.d(s890Var.n.c(e, i3, i4, r2), 0, e));
        if (d < 0) {
            return 0L;
        }
        return d;
    }

    public static final ugh b(int i, sls slsVar, fid fidVar, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        tig0 tig0Var = ugh.H;
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && fidVar.c(i)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && fidVar.b(0.0f)) || (i2 & 48) == 32);
        if ((((i2 & 896) ^ 384) <= 256 || !((bts) fidVar).k(slsVar)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (z3 || Q == did.a) {
            Q = new ys0(i, slsVar, 8);
            btsVar.o0(Q);
        }
        ugh ughVar = (ugh) cvw.W(objArr, tig0Var, (sls) Q, btsVar, 0);
        ughVar.G.setValue(slsVar);
        return ughVar;
    }
}
