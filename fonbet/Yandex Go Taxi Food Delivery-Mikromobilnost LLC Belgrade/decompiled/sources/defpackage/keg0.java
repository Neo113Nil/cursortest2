package defpackage;

import android.graphics.Rect;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public abstract class keg0 {
    public static final long a = rzo.f(2568953889L);
    public static final long b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        int i = ldc.n;
        b = ldc.f;
        c = 168.0f;
        d = 24.0f;
        e = 8.0f;
    }

    public static final void a(yeg0 yeg0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(779019811);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(yeg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        boolean z = true;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            xeg0 xeg0Var = yeg0Var.a;
            if (!(xeg0Var instanceof weg0) && !(xeg0Var instanceof ueg0)) {
                z = false;
            }
            ueg0 ueg0Var = xeg0Var instanceof ueg0 ? (ueg0) xeg0Var : null;
            Rect rect = ueg0Var != null ? ueg0Var.a : null;
            f530 k = f530Var.k(ljs0.c);
            boolean a2 = btsVar.a(z) | btsVar.e(rect);
            Object Q = btsVar.Q();
            if (a2 || Q == did.a) {
                Q = new xz3(z, rect, 14);
                btsVar.o0(Q);
            }
            qeb1.a(0, btsVar, (tls) Q, k);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(yeg0Var, f530Var, i, 10);
        }
    }

    public static final zii0 b(long j, qam qamVar) {
        float w0 = qamVar.w0(c);
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 3.57f;
        float f = w0 / 2.0f;
        return new zii0(intBitsToFloat - f, intBitsToFloat2 - f, intBitsToFloat + f, intBitsToFloat2 + f);
    }
}
