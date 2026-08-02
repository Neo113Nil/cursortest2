package defpackage;

import androidx.compose.foundation.j;
import androidx.compose.material3.a0;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class avz0 {
    public static final l690 a = new l690(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(final ovz0 ovz0Var, f530 f530Var, float f, ehr0 ehr0Var, long j, long j2, final a aVar, fid fidVar, final int i) {
        int i2;
        bts btsVar;
        final f530 f530Var2;
        final float f2;
        final ehr0 ehr0Var2;
        final long j3;
        final long j4;
        long d;
        int i3;
        ehr0 ehr0Var3;
        long j5;
        f530 f530Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar2.k(ovz0Var) : btsVar2.e(ovz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= btsVar2.e(aVar) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if (btsVar2.V(i5 & 1, (306783379 & i5) != 306783378)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                f2 = tuz0.a;
                ehr0 b = zir0.b(khc0.b, btsVar2);
                long d2 = dgc.d(khc0.c, btsVar2);
                d = dgc.d(khc0.a, btsVar2);
                i3 = i5 & (-4186113);
                ehr0Var3 = b;
                j5 = d2;
                f530Var3 = c530.a;
            } else {
                btsVar2.Y();
                i3 = i5 & (-4186113);
                f530Var3 = f530Var;
                f2 = f;
                ehr0Var3 = ehr0Var;
                j5 = j;
                d = j2;
            }
            btsVar2.u();
            btsVar2.e0(-1719869687);
            btsVar2.t(false);
            int i6 = i3 >> 9;
            btsVar = btsVar2;
            mnw0.a(f530Var3, ehr0Var3, d, 0L, 0.0f, 0.0f, wwg.S(-1573998995, true, new k840(f2, j5, aVar), btsVar2), btsVar, (57344 & i6) | 12582912 | (i6 & ImageMetadata.JPEG_GPS_COORDINATES), 72);
            j3 = j5;
            f530Var2 = f530Var3;
            ehr0Var2 = ehr0Var3;
            j4 = d;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
            f2 = f;
            ehr0Var2 = ehr0Var;
            j3 = j;
            j4 = j2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: zuz0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    avz0.a(ovz0.this, f530Var2, f2, ehr0Var2, j3, j4, aVar, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(u9e0 u9e0Var, a aVar, svz0 svz0Var, f530 f530Var, boolean z, wls wlsVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        f530 f530Var3;
        boolean z2;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-293753984);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(u9e0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? btsVar.k(svz0Var) : btsVar.e(svz0Var) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 2048 : 1024;
            i4 = i3 | 14376960;
            if ((100663296 & i) == 0) {
                i4 |= btsVar.e(wlsVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
            }
            if (btsVar.V(i4 & 1, (38347923 & i4) == 38347922)) {
                btsVar.Y();
                f530Var3 = f530Var2;
                z2 = z;
            } else {
                f530 f530Var4 = i5 != 0 ? c530.a : f530Var2;
                zx01 O = bvf0.O(((a0) svz0Var).b, "tooltip transition", btsVar, 48, 0);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (Q == o430Var) {
                    Q = f.j(null);
                    btsVar.o0(Q);
                }
                oz40 oz40Var = (oz40) Q;
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    new yuz0(0, oz40Var);
                    Q2 = new ovz0();
                    btsVar.o0(Q2);
                }
                ovz0 ovz0Var = (ovz0) Q2;
                a S = wwg.S(-23901870, true, new hex0(15, oz40Var, wlsVar), btsVar);
                Object Q3 = btsVar.Q();
                if (Q3 == o430Var) {
                    Q3 = f.j(null);
                    btsVar.o0(Q3);
                }
                oz40 oz40Var2 = (oz40) Q3;
                Object Q4 = btsVar.Q();
                if (Q4 == o430Var) {
                    Q4 = f.d(new rsm(oz40Var, oz40Var2, 3));
                    btsVar.o0(Q4);
                }
                m3u0 m3u0Var = (m3u0) Q4;
                twt0 e = hob1.e(MotionSchemeKeyTokens.FastSpatial, btsVar);
                twt0 e2 = hob1.e(MotionSchemeKeyTokens.FastEffects, btsVar);
                gl11 gl11Var = gtq0.f;
                Object c = O.c();
                oz40 oz40Var3 = O.d;
                boolean booleanValue = ((Boolean) c).booleanValue();
                btsVar.e0(838300572);
                float f = booleanValue ? 1.0f : 0.8f;
                btsVar.t(false);
                Float valueOf = Float.valueOf(f);
                boolean booleanValue2 = ((Boolean) oz40Var3.getValue()).booleanValue();
                btsVar.e0(838300572);
                float f2 = booleanValue2 ? 1.0f : 0.8f;
                btsVar.t(false);
                Float valueOf2 = Float.valueOf(f2);
                O.f();
                btsVar.e0(-1664496585);
                btsVar.t(false);
                tx01 s = bvf0.s(O, valueOf, valueOf2, e, gl11Var, btsVar, ImageMetadata.EDGE_MODE);
                boolean booleanValue3 = ((Boolean) O.c()).booleanValue();
                btsVar.e0(-1903393104);
                float f3 = booleanValue3 ? 1.0f : 0.0f;
                btsVar.t(false);
                Float valueOf3 = Float.valueOf(f3);
                boolean booleanValue4 = ((Boolean) oz40Var3.getValue()).booleanValue();
                btsVar.e0(-1903393104);
                float f4 = booleanValue4 ? 1.0f : 0.0f;
                btsVar.t(false);
                Float valueOf4 = Float.valueOf(f4);
                O.f();
                btsVar.e0(-111222965);
                btsVar.t(false);
                n5b1.a(u9e0Var, wwg.S(-527401546, true, new t0(oz40Var2, s, bvf0.s(O, valueOf3, valueOf4, e2, gl11Var, btsVar, ImageMetadata.EDGE_MODE), m3u0Var, aVar, ovz0Var, 15), btsVar), svz0Var, f530Var4, S, btsVar, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128));
                f530Var3 = f530Var4;
                z2 = true;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new rpm(u9e0Var, aVar, svz0Var, f530Var3, z2, wlsVar, i, i2);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        i4 = i3 | 14376960;
        if ((100663296 & i) == 0) {
        }
        if (btsVar.V(i4 & 1, (38347923 & i4) == 38347922)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final a0 c(fid fidVar) {
        j jVar = we5.a;
        boolean a2 = fidVar.a(false) | ((bts) fidVar).k(jVar);
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (a2 || Q == did.a) {
            Q = new a0(jVar);
            btsVar.o0(Q);
        }
        return (a0) Q;
    }
}
