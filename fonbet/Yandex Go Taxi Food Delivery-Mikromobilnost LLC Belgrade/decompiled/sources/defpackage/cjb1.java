package defpackage;

import androidx.compose.animation.k;
import com.yandex.go.summary.ui.compose.mapcontent.surge.a;

/* loaded from: classes14.dex */
public abstract class cjb1 {
    public static final void a(qja qjaVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1759065750);
        int i2 = 2;
        int i3 = (btsVar.k(qjaVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            cx20.a(null, null, null, null, null, false, false, null, wwg.S(-39472904, true, new u5(i2, qjaVar, tlsVar), btsVar), btsVar, 100663296, 255);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(qjaVar, tlsVar, i, 6);
        }
    }

    public static final void b(nww0 nww0Var, f530 f530Var, yur yurVar, final tls tlsVar, fid fidVar, int i, int i2) {
        final yur yurVar2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1868888476);
        int i4 = i | (btsVar.k(nww0Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            yurVar2 = yurVar;
        } else {
            yurVar2 = yurVar;
            i3 = i4 | (btsVar.k(yurVar2) ? 256 : 128);
        }
        int i6 = i3 | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                yurVar2 = null;
            }
            final float b = w4a1.b(btsVar, mrg0.go_design_s_space);
            ttb1.a(nww0Var, f530Var, k.e(null, 3), k.f(null, 3), null, wwg.S(936914066, true, new bms() { // from class: zvw0
                @Override // defpackage.bms
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    nww0 nww0Var2 = (nww0) obj2;
                    fid fidVar2 = (fid) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= ((bts) fidVar2).k(nww0Var2) ? 32 : 16;
                    }
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 145) != 144)) {
                        c530 c530Var = c530.a;
                        yur yurVar3 = yur.this;
                        a.c(nww0Var2, ljs0.v(an91.o(c530Var, b, 16.0f, 0.0f, 0.0f, 12), x4c.b, 2).k(yurVar3 != null ? hi91.d(gi91.b(c530Var, yurVar3), false, null, 3) : c530Var), tlsVar, btsVar2, (intValue >> 3) & 14);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, (i6 & 14) | 200064 | (i6 & 112), 16);
        } else {
            btsVar.Y();
        }
        yur yurVar3 = yurVar2;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new p91(nww0Var, f530Var, yurVar3, tlsVar, i, i2, 14);
        }
    }

    public static final float c(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final float d(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final int e(int i, int i2, float f) {
        return i + ((int) Math.round((i2 - i) * f));
    }
}
