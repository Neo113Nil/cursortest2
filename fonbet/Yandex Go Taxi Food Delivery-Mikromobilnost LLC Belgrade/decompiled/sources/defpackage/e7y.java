package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class e7y implements l1m0, h1m0 {
    public final m1m0 a;
    public final j1m0 b;
    public final iz40 c;

    public e7y(l1m0 l1m0Var, Map map, j1m0 j1m0Var) {
        ptw ptwVar = new ptw(12, l1m0Var);
        a7u0 a7u0Var = n1m0.a;
        this.a = new m1m0(map, ptwVar);
        this.b = j1m0Var;
        this.c = dmm0.a();
    }

    @Override // defpackage.l1m0
    public final Map a() {
        iz40 iz40Var = this.c;
        Object[] objArr = iz40Var.b;
        long[] jArr = iz40Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            j1m0 j1m0Var = this.b;
                            if (j1m0Var.b.m(obj) == null) {
                                j1m0Var.a.remove(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.a.a();
    }

    @Override // defpackage.h1m0
    public final void b(Object obj, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-858296452);
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
            this.b.b(obj, aVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            boolean e = btsVar.e(this) | btsVar.e(obj);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new mgu(24, this, obj);
                btsVar.o0(Q);
            }
            zpn.a(obj, (tls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(this, obj, aVar, i, 25);
        }
    }

    @Override // defpackage.l1m0
    public final k1m0 c(sls slsVar, String str) {
        return this.a.c(slsVar, str);
    }

    @Override // defpackage.l1m0
    public final boolean d(Object obj) {
        return this.a.d(obj);
    }

    @Override // defpackage.l1m0
    public final Object e(String str) {
        return this.a.e(str);
    }
}
