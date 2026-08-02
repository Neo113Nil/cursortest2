package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes.dex */
public abstract class k2z {
    public static final qwd a = new qwd(qqr.w);
    public static final qwd b = new qwd(qqr.c);

    public static final void a(final wp2 wp2Var, final wp2 wp2Var2, final a aVar, fid fidVar, final int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(115938485);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(wp2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(wp2Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            sb2.c(new vvf0[]{b.a(new ldc(tje.n(wp2Var, btsVar))), a.a(new ldc(tje.n(wp2Var2, btsVar)))}, aVar, btsVar, (i2 >> 3) & 112);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: j2z
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    k2z.a(wp2.this, wp2Var2, aVar, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }
}
