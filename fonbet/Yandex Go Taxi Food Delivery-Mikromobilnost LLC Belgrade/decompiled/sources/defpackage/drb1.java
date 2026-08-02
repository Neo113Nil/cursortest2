package defpackage;

import android.content.Context;
import android.util.TypedValue;
import androidx.compose.animation.k;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class drb1 {
    public static final void a(osz0 osz0Var, f530 f530Var, yur yurVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1431526783);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(osz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(yurVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            ttb1.a(osz0Var, f530Var, k.e(null, 3), k.f(null, 3), "ToolbarButtonItem", wwg.S(1673289080, true, new n91(yurVar, tlsVar, i3), btsVar), btsVar, (i2 & 14) | 224640 | (i2 & 112), 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0((Object) osz0Var, f530Var, (Object) yurVar, (Object) tlsVar, i, 21);
        }
    }

    public static final void b(htz0 htz0Var, f530 f530Var, yur yurVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2101557467);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(htz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(yurVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            a(htz0Var.a, i9a1.f(f530Var), yurVar, tlsVar, btsVar, i2 & 8064);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0((Object) htz0Var, f530Var, (Object) yurVar, (Object) tlsVar, i, 20);
        }
    }

    public static final int c(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static final int d(Context context, int i, int i2) {
        int c = c(i, context);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return job1.g(c, typedValue.getFloat());
    }

    public static long e(int i, byte[] bArr) {
        long j = i & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        int i2 = i >>> 2;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 << 2;
            long j2 = (((bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24)) * 1540483477) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
            j = (((j * 1540483477) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) ^ (((j2 ^ ((j2 >>> 24) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * 1540483477) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        }
        int i5 = i2 << 2;
        int i6 = i & 3;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    j ^= (bArr[i5 + 2] & 255) << 16;
                }
                long j3 = ((((j >>> 13) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) ^ j) * 1540483477) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                return j3 ^ (j3 >>> 15);
            }
            j ^= (bArr[i5 + 1] & 255) << 8;
        }
        j = (((bArr[i5] & 255) ^ j) * 1540483477) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long j32 = ((((j >>> 13) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) ^ j) * 1540483477) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        return j32 ^ (j32 >>> 15);
    }
}
