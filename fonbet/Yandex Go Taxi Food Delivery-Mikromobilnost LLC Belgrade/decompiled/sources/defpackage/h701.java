package defpackage;

import android.content.Context;
import androidx.compose.animation.m;
import androidx.compose.ui.input.nestedscroll.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.ComposeView;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public final class h701 implements wni {
    public final String A = UUID.randomUUID().toString();
    public final Context a;
    public final h801 b;
    public final tgg c;
    public final rza0 w;
    public final hwy0 x;
    public final rpb y;
    public final dci z;

    public h701(Context context, h801 h801Var, tgg tggVar, rza0 rza0Var, hwy0 hwy0Var, rpb rpbVar, dci dciVar) {
        this.a = context;
        this.b = h801Var;
        this.c = tggVar;
        this.w = rza0Var;
        this.x = hwy0Var;
        this.y = rpbVar;
        this.z = dciVar;
    }

    public final void a(qkg qkgVar, qkg qkgVar2, zvz0 zvz0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        h701 h701Var;
        bts btsVar;
        boolean z;
        ldc ldcVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2013302582);
        int i2 = i | (btsVar2.k(qkgVar) ? 4 : 2) | (btsVar2.k(qkgVar2) ? 32 : 16) | (btsVar2.k(zvz0Var) ? 256 : 128) | (btsVar2.e(this) ? 131072 : 65536);
        if (btsVar2.V(i2 & 1, (74899 & i2) != 74898)) {
            byk0 c = YandexShapes.c(((YandexShapes) btsVar2.m(qm51.a)).d, YandexShapes.Corner.TOP);
            c530 c530Var = c530.a;
            f530 a = b.a(m4m0.b(ymb1.l(c530Var, c), ((el51) btsVar2.m(gl51.a)).c(), qke.q), zrb1.f(btsVar2), null);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a2);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            oip0 o2 = pw91.o(btsVar2);
            b(zvz0Var, qkgVar, c, ((ldc) m.a((zvz0Var == null || (ldcVar = zvz0Var.b) == null) ? ldc.l : ldcVar.a, null, null, btsVar2, 0, 14).getValue()).a, o2, tlsVar, tlsVar2, btsVar2, ((i2 >> 3) & 112) | 6 | ((i2 << 6) & 896) | 14155776 | ((i2 << 9) & 234881024));
            h701Var = this;
            btsVar = btsVar2;
            if (qkgVar2 == null) {
                btsVar.e0(-1311016812);
                btsVar.t(false);
                z = true;
            } else {
                btsVar.e0(-1311016811);
                f530 u = ljs0.u(ljs0.c(c530Var, 1.0f), null, 3);
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = a12.n;
                    btsVar.o0(Q);
                }
                z = true;
                lbb1.b(exw0.a(u, zy11.a, (PointerInputEventHandler) Q), o2.b(), 0.0f, 0.0f, null, null, wwg.S(454359689, true, new hex0(16, h701Var, qkgVar2), btsVar), btsVar, 1572864, 60);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            h701Var = this;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t0(h701Var, qkgVar, qkgVar2, zvz0Var, tlsVar, tlsVar2, i, 16);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0127, code lost:
    
        if (defpackage.jl40.l(r0.Q(), java.lang.Integer.valueOf(r3)) == false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(final zvz0 zvz0Var, final qkg qkgVar, byk0 byk0Var, final long j, final oip0 oip0Var, final tls tlsVar, final tls tlsVar2, fid fidVar, final int i) {
        int i2;
        byk0 byk0Var2;
        wls wlsVar;
        final h701 h701Var = this;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1768831988);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i & 6;
        uic uicVar = uic.a;
        if (i3 == 0) {
            i2 = (btsVar.k(uicVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(zvz0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(qkgVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(byk0Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.d(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.k(oip0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.e(tlsVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar.e(tlsVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i2 |= btsVar.e(h701Var) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if (btsVar.V(i2 & 1, (38347923 & i2) != 38347922)) {
            gji0 gji0Var = qke.q;
            c530 c530Var = c530.a;
            f530 b = uicVar.b(m4m0.b(c530Var, j, gji0Var), 1.0f, false);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar2 = d.f;
            qje.W(btsVar, wlsVar2, a);
            wls wlsVar3 = d.e;
            qje.W(btsVar, wlsVar3, o);
            wls wlsVar4 = d.g;
            if (btsVar.S) {
                wlsVar = wlsVar3;
            } else {
                wlsVar = wlsVar3;
            }
            b64.z(hashCode, btsVar, hashCode, wlsVar4);
            wls wlsVar5 = d.d;
            qje.W(btsVar, wlsVar5, d);
            if (zvz0Var == null) {
                btsVar.e0(-47073676);
                btsVar.t(false);
            } else {
                btsVar.e0(-47073675);
                a.a(zvz0Var, tlsVar, tlsVar2, btsVar, (i2 >> 15) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
                btsVar.t(false);
            }
            boolean z = zvz0Var != null;
            boolean z2 = (i2 & 7168) == 2048;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                byk0Var2 = byk0Var;
                Q = new a2q0(byk0Var2, 1);
                btsVar.o0(Q);
            } else {
                byk0Var2 = byk0Var;
            }
            f530 u = pw91.u(ljs0.c(rx21.c(c530Var, z, (tls) Q), 1.0f), oip0Var, 14);
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, u);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, a2);
            qje.W(btsVar, wlsVar, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar4);
            }
            qje.W(btsVar, wlsVar5, d2);
            h701Var = this;
            h701Var.c.a(qkgVar, null, 6.0f, 0L, true, false, null, btsVar, ((i2 >> 6) & 14) | 16802176, 106);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            byk0Var2 = byk0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final byk0 byk0Var3 = byk0Var2;
            v.d = new wls() { // from class: f701
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h701.this.b(zvz0Var, qkgVar, byk0Var3, j, oip0Var, tlsVar, tlsVar2, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.a, null, 0, 6, null);
        composeView.setContent(new androidx.compose.runtime.internal.a(602288332, new e701(this, 1), true));
        return composeView;
    }
}
