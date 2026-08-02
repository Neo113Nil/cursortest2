package defpackage;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.d;
import androidx.lifecycle.v;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class efb1 {
    public static final void a(e88 e88Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1009606447);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(e88Var) : btsVar.e(e88Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qy20.a(null, null, null, false, wwg.S(259191663, true, new sp5(10, e88Var, tlsVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(e88Var, tlsVar, i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(float f, float f2, wp2 wp2Var, fid fidVar, final int i, final int i2) {
        float f3;
        int i3;
        float f4;
        int i4;
        wp2 wp2Var2;
        int i5;
        final float f5;
        final float f6;
        final wp2 wp2Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(566006275);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            f3 = f;
        } else if ((i & 6) == 0) {
            f3 = f;
            i3 = (btsVar.b(f3) ? 4 : 2) | i;
        } else {
            f3 = f;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f4 = f2;
            i3 |= btsVar.b(f4) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                wp2Var2 = wp2Var;
                i3 |= btsVar.k(wp2Var2) ? 256 : 128;
                i5 = i3;
                if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
                    float f7 = i6 != 0 ? 64.0f : f3;
                    float f8 = i7 != 0 ? 8.0f : f4;
                    wp2 wp2Var4 = i4 != 0 ? tp2.a : wp2Var2;
                    osv d = z5b1.d(z5b1.g(null, btsVar, 1), 0.0f, 360.0f, sb2.w(sb2.K(2000, 0, ubn.d, 2), RepeatMode.Restart, 0L, 4), "rotation angle", btsVar, 29112, 0);
                    f530 m = ljs0.m(c530.a, f7);
                    boolean k = btsVar.k(d);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new xo1(d, 18);
                        btsVar.o0(Q);
                    }
                    f530 k2 = an91.k(ymb1.l(d.a(m, (tls) Q), cyk0.a), f8);
                    z910 d2 = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d3 = b.d(btsVar, k2);
                    ohd.G1.getClass();
                    sls slsVar = androidx.compose.ui.node.d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, androidx.compose.ui.node.d.f, d2);
                    qje.W(btsVar, androidx.compose.ui.node.d.e, o);
                    qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, androidx.compose.ui.node.d.h);
                    qje.W(btsVar, androidx.compose.ui.node.d.d, d3);
                    wp2 wp2Var5 = wp2Var4;
                    sya1.a(gfb1.c(), null, null, wp2Var5, btsVar, ((i5 << 3) & 7168) | 384, 2);
                    btsVar = btsVar;
                    btsVar.t(true);
                    f5 = f7;
                    f6 = f8;
                    wp2Var3 = wp2Var5;
                } else {
                    btsVar.Y();
                    f5 = f3;
                    f6 = f4;
                    wp2Var3 = wp2Var2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: vpt0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            efb1.b(f5, f6, wp2Var3, (fid) obj, vng.O(i | 1), i2);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            wp2Var2 = wp2Var;
            i5 = i3;
            if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f4 = f2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        wp2Var2 = wp2Var;
        i5 = i3;
        if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final wv00 c(v vVar, ims imsVar) {
        wv00 wv00Var = new wv00(imsVar.mo104apply(vVar.d()), imsVar);
        wv00Var.o(vVar);
        return wv00Var;
    }
}
