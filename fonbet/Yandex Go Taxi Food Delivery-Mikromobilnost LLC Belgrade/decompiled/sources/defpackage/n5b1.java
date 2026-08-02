package defpackage;

import androidx.compose.material3.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.window.e;
import com.google.ar.core.ImageMetadata;
import defpackage.ivr;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.serialization.json.c;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class n5b1 {
    public static final void a(u9e0 u9e0Var, a aVar, svz0 svz0Var, f530 f530Var, a aVar2, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        oz40 oz40Var;
        a0 a0Var;
        o430 o430Var;
        boolean z;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1221877520);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(u9e0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(svz0Var) : btsVar.e(svz0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i2 |= btsVar.k(f530Var2) ? 2048 : 1024;
        } else {
            f530Var2 = f530Var;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(null) ? 16384 : 8192;
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
            i2 |= btsVar.a(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.a(true) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar.a(false) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i2 |= btsVar.e(aVar2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if (btsVar.V(i2 & 1, (38347923 & i2) != 38347922)) {
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (Q == o430Var2) {
                Q = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q);
            }
            tse tseVar = (tse) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var2) {
                Q2 = f.j(Boolean.FALSE);
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            btsVar.e0(-1104742522);
            btsVar.t(false);
            z910 d = pi6.d(x4c.b, false);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c530.a);
            ohd.G1.getClass();
            sls slsVar = d.b;
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            a0 a0Var2 = (a0) svz0Var;
            if (a0Var2.b()) {
                btsVar.e0(-1891243071);
                o430Var = o430Var2;
                z = true;
                b(u9e0Var, a0Var2, tseVar, false, oz40Var2, aVar, btsVar, (i2 & 14) | ImageMetadata.EDGE_MODE | ((i2 >> 3) & 112) | ((i2 >> 6) & 896) | ((i2 << 15) & 3670016));
                a0Var = a0Var2;
                oz40Var = oz40Var2;
                btsVar = btsVar;
                z2 = false;
            } else {
                oz40Var = oz40Var2;
                a0Var = a0Var2;
                o430Var = o430Var2;
                z = true;
                z2 = false;
                btsVar.e0(-1896607156);
            }
            btsVar.t(z2);
            c(a0Var, oz40Var, f530Var2, aVar2, btsVar, ((i2 >> 18) & 14) | 384 | ((i2 >> 3) & 112) | ((i2 >> 12) & 7168) | (57344 & (i2 << 3)) | ((i2 >> 9) & ImageMetadata.JPEG_GPS_COORDINATES));
            btsVar.t(z);
            boolean z3 = ((i2 & 896) == 256 || ((i2 & 512) != 0 && btsVar.e(a0Var))) ? z : z2;
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new j24(16, a0Var);
                btsVar.o0(Q3);
            }
            zpn.a(a0Var, (tls) Q3, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0((Object) u9e0Var, (Object) aVar, (Object) svz0Var, f530Var, aVar2, i, 7);
        }
    }

    public static final void b(u9e0 u9e0Var, final svz0 svz0Var, final tse tseVar, boolean z, final oz40 oz40Var, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1413720282);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(u9e0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(svz0Var) : btsVar.e(svz0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(null) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tseVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.a(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.k(oz40Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.e(aVar) ? 1048576 : 524288;
        }
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            String e = ohb1.e(btsVar, lyh0.tooltip_description);
            boolean e2 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && btsVar.e(svz0Var))) | ((i2 & 896) == 256) | btsVar.e(tseVar) | ((458752 & i2) == 131072);
            Object Q = btsVar.Q();
            if (e2 || Q == did.a) {
                Q = new sls() { // from class: androidx.compose.material3.internal.c
                    @Override // defpackage.sls
                    public final Object invoke() {
                        a0 a0Var = (a0) svz0Var;
                        if (a0Var.b()) {
                            tje.N(tseVar, null, null, new BasicTooltipKt$TooltipPopup$1$1$1(a0Var, null), 3);
                            oz40Var.setValue(Boolean.FALSE);
                        }
                        return zy11.a;
                    }
                };
                btsVar.o0(Q);
            }
            e.a(u9e0Var, (sls) Q, new eae0(z, false, 6), wwg.S(-1287705660, true, new xe5(e, aVar), btsVar), btsVar, (i2 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ye5(u9e0Var, svz0Var, tseVar, z, oz40Var, aVar, i, 0);
        }
    }

    public static final void c(final svz0 svz0Var, oz40 oz40Var, f530 f530Var, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1873232064);
        int i3 = 1;
        if ((i & 6) == 0) {
            i2 = (btsVar.a(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(svz0Var) : btsVar.e(svz0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(oz40Var) ? 256 : 128;
        }
        int i4 = 0;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(false) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(f530Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(aVar) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q);
            }
            final tse tseVar = (tse) Q;
            String e = ohb1.e(btsVar, lyh0.tooltip_label);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(Boolean.FALSE);
                btsVar.o0(Q2);
            }
            final oz40 oz40Var2 = (oz40) Q2;
            f530 d = lj91.d(ci91.f(exw0.a(exw0.a(f530Var, svz0Var, new androidx.compose.material3.internal.d(svz0Var, i4)), svz0Var, new androidx.compose.material3.internal.d(svz0Var, i3)).k(new de90(new q(15, e, tseVar, svz0Var))), new tls() { // from class: androidx.compose.material3.internal.a
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    tje.N(tse.this, null, null, new BasicTooltipKt$keyboardBehavior$1$1((ivr) obj, oz40Var2, svz0Var, null), 3);
                    return zy11.a;
                }
            }), new ze5(i4, svz0Var, oz40Var, oz40Var2));
            z910 d2 = pi6.d(x4c.b, false);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar = d.b;
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
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, d.d, d3);
            nnm.p((i2 >> 15) & 14, aVar, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(svz0Var, oz40Var, f530Var, aVar, i, 7);
        }
    }

    public static final knp0 d(inp0 inp0Var, sls slsVar) {
        return new knp0(new a5p0(4, inp0Var, slsVar));
    }

    public static final c e(JSONObject jSONObject) {
        rbx rbxVar = sbx.d;
        String jSONObject2 = jSONObject.toString();
        rbxVar.getClass();
        return (c) rbxVar.b(c.Companion.serializer(), jSONObject2);
    }
}
