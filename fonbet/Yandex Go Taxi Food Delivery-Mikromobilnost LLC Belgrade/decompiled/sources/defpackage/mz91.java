package defpackage;

import android.content.Context;
import androidx.compose.animation.core.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.n;
import com.yandex.go.payments.api.interactor.BankPaymentsDepositType;
import com.yandex.go.yb.api.domain.model.YbDepositType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_screens.ai_camera.a;

/* loaded from: classes5.dex */
public abstract class mz91 {
    public static final void a(CharSequence charSequence, CharSequence charSequence2, boolean z, v4v v4vVar, boolean z2, nhe nheVar, sls slsVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        boolean z3;
        yx40 yx40Var;
        bts btsVar2;
        boolean z4;
        iy40 iy40Var;
        int i2;
        oz40 oz40Var;
        boolean z5;
        iy40 iy40Var2;
        oz40 oz40Var2;
        oz40 oz40Var3;
        oz40 oz40Var4;
        tx40 tx40Var;
        tls tlsVar2;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(572050537);
        int i3 = i | (btsVar3.e(charSequence) ? 4 : 2) | (btsVar3.e(charSequence2) ? 32 : 16) | (btsVar3.a(z) ? 256 : 128) | (btsVar3.k(v4vVar) ? 2048 : 1024) | (btsVar3.a(z2) ? 16384 : 8192) | (btsVar3.k(nheVar) ? 131072 : 65536) | (btsVar3.e(slsVar) ? 1048576 : 524288) | (btsVar3.e(tlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (btsVar3.V(i3 & 1, (i3 & 4793491) != 4793490)) {
            Object Q = btsVar3.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.g(2);
                btsVar3.o0(Q);
            }
            yx40 yx40Var2 = (yx40) Q;
            Object Q2 = btsVar3.Q();
            if (Q2 == o430Var) {
                Q2 = f.h(0L);
                btsVar3.o0(Q2);
            }
            iy40 iy40Var3 = (iy40) Q2;
            Object Q3 = btsVar3.Q();
            if (Q3 == o430Var) {
                Q3 = new q8v().f();
                btsVar3.o0(Q3);
            }
            w8v w8vVar = (w8v) Q3;
            Object Q4 = btsVar3.Q();
            if (Q4 == o430Var) {
                Q4 = Executors.newSingleThreadExecutor();
                btsVar3.o0(Q4);
            }
            ExecutorService executorService = (ExecutorService) Q4;
            Context context = (Context) btsVar3.m(AndroidCompositionLocals_androidKt.b);
            boolean z6 = (v4vVar == null || z2) ? false : true;
            Object Q5 = btsVar3.Q();
            if (Q5 == o430Var) {
                Q5 = f.f(1.0f);
                btsVar3.o0(Q5);
            }
            tx40 tx40Var2 = (tx40) Q5;
            Object Q6 = btsVar3.Q();
            if (Q6 == o430Var) {
                z3 = z6;
                Q6 = f.j(new wu60(0L));
                btsVar3.o0(Q6);
            } else {
                z3 = z6;
            }
            oz40 oz40Var5 = (oz40) Q6;
            Object Q7 = btsVar3.Q();
            if (Q7 == o430Var) {
                Q7 = f.j(zii0.e);
                btsVar3.o0(Q7);
            }
            oz40 oz40Var6 = (oz40) Q7;
            Object Q8 = btsVar3.Q();
            if (Q8 == o430Var) {
                yx40Var = yx40Var2;
                Q8 = f.j(new k6w(0L));
                btsVar3.o0(Q8);
            } else {
                yx40Var = yx40Var2;
            }
            oz40 oz40Var7 = (oz40) Q8;
            boolean e = btsVar3.e(executorService) | btsVar3.e(context);
            Object Q9 = btsVar3.Q();
            if (e || Q9 == o430Var) {
                Q9 = new scs0(8, executorService, context);
                btsVar3.o0(Q9);
            }
            zy11 zy11Var = zy11.a;
            zpn.a(zy11Var, (tls) Q9, btsVar3);
            m3u0 b = b.b(z3 ? -((fwi) btsVar3.m(j.h)).w0(91.0f) : 0.0f, sb2.K(150, 0, ubn.d, 2), "offset_animation", null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 20);
            f530 f530Var = ljs0.c;
            Object Q10 = btsVar3.Q();
            if (Q10 == o430Var) {
                Q10 = new ttm(28, oz40Var7);
                btsVar3.o0(Q10);
            }
            f530 b2 = xm91.b(f530Var, (tls) Q10);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar3.T);
            r1b0 o = btsVar3.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar3, b2);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar3.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar2);
            } else {
                btsVar3.r0();
            }
            qje.W(btsVar3, d.f, d);
            qje.W(btsVar3, d.e, o);
            wls wlsVar = d.g;
            if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar3, hashCode, wlsVar);
            }
            qje.W(btsVar3, d.d, d2);
            if (v4vVar != null) {
                btsVar3.e0(-1796343444);
                if (z2) {
                    btsVar3.e0(-1796300385);
                    Object Q11 = btsVar3.Q();
                    if (Q11 == o430Var) {
                        Q11 = new y9m(2, tx40Var2, oz40Var5);
                        btsVar3.o0(Q11);
                    }
                    f530Var = exw0.a(f530Var, zy11Var, (PointerInputEventHandler) Q11);
                    btsVar3.t(false);
                } else {
                    btsVar3.e0(-1795185687);
                    btsVar3.t(false);
                }
                boolean k = btsVar3.k(b);
                Object Q12 = btsVar3.Q();
                if (k || Q12 == o430Var) {
                    Q12 = new lxo0(17, b, tx40Var2, oz40Var5);
                    btsVar3.o0(Q12);
                }
                s3b1.f(v4vVar, androidx.compose.ui.graphics.d.a(f530Var, (tls) Q12), nheVar, btsVar3, (i3 >> 9) & 910, 0);
                btsVar2 = btsVar3;
                btsVar2.t(false);
            } else {
                btsVar2 = btsVar3;
                btsVar2.e0(-1794644520);
                if (((Boolean) btsVar2.m(n.a)).booleanValue()) {
                    z4 = false;
                    btsVar2.e0(-1794217185);
                    btsVar2.t(false);
                } else {
                    btsVar2.e0(-1794598702);
                    if (z) {
                        btsVar2.e0(-1794562897);
                        z4 = false;
                        a.a(w8vVar, yx40Var.getIntValue(), btsVar2, 0);
                        btsVar2.t(false);
                    } else {
                        z4 = false;
                        btsVar2.e0(-1794382911);
                        wp81.a(slsVar, btsVar2, (i3 >> 18) & 14);
                        btsVar2.t(false);
                    }
                    btsVar2.t(z4);
                }
                btsVar2.t(z4);
            }
            y40 y40Var = new y40();
            int i4 = i3 & 29360128;
            boolean z7 = i4 == 8388608;
            Object Q13 = btsVar2.Q();
            if (z7 || Q13 == o430Var) {
                Q13 = new uwl0(12, tlsVar);
                btsVar2.o0(Q13);
            }
            yd00 e2 = kla1.e(y40Var, (tls) Q13, btsVar2, 0);
            int intValue = yx40Var.getIntValue();
            boolean e3 = btsVar2.e(e2);
            Object Q14 = btsVar2.Q();
            if (e3 || Q14 == o430Var) {
                iy40Var = iy40Var3;
                Q14 = new ppr0(20, e2, iy40Var);
                btsVar2.o0(Q14);
            } else {
                iy40Var = iy40Var3;
            }
            sls slsVar3 = (sls) Q14;
            boolean e4 = btsVar2.e(w8vVar) | (i4 == 8388608) | btsVar2.e(executorService);
            Object Q15 = btsVar2.Q();
            if (e4 || Q15 == o430Var) {
                i2 = i4;
                oz40Var = oz40Var6;
                z5 = false;
                iy40Var2 = iy40Var;
                zoi zoiVar = new zoi(w8vVar, executorService, iy40Var2, tlsVar, oz40Var7, oz40Var, 5);
                oz40Var2 = oz40Var7;
                btsVar2.o0(zoiVar);
                Q15 = zoiVar;
            } else {
                i2 = i4;
                z5 = false;
                iy40Var2 = iy40Var;
                oz40Var = oz40Var6;
                oz40Var2 = oz40Var7;
            }
            sls slsVar4 = (sls) Q15;
            Object Q16 = btsVar2.Q();
            if (Q16 == o430Var) {
                Q16 = new ppr0(21, iy40Var2, yx40Var);
                btsVar2.o0(Q16);
            }
            sls slsVar5 = (sls) Q16;
            boolean z8 = i2 == 8388608 ? true : z5;
            Object Q17 = btsVar2.Q();
            if (z8 || Q17 == o430Var) {
                oz40Var3 = oz40Var;
                oz40Var4 = oz40Var5;
                tx40Var = tx40Var2;
                Q17 = new npb(tlsVar, oz40Var2, oz40Var3, tx40Var, oz40Var4, 10);
                tlsVar2 = tlsVar;
                btsVar2.o0(Q17);
            } else {
                oz40Var4 = oz40Var5;
                tx40Var = tx40Var2;
                oz40Var3 = oz40Var;
                tlsVar2 = tlsVar;
            }
            sls slsVar6 = (sls) Q17;
            if (i2 == 8388608) {
                z5 = true;
            }
            Object Q18 = btsVar2.Q();
            if (z5 || Q18 == o430Var) {
                Q18 = new xlp0(9, tlsVar2, tx40Var, oz40Var4);
                btsVar2.o0(Q18);
            }
            sls slsVar7 = (sls) Q18;
            Object Q19 = btsVar2.Q();
            if (Q19 == o430Var) {
                Q19 = new ttm(27, oz40Var3);
                btsVar2.o0(Q19);
            }
            bts btsVar4 = btsVar2;
            hn1.a(charSequence, charSequence2, z2, z3, intValue, z, slsVar3, slsVar4, slsVar5, slsVar6, slsVar7, (tls) Q19, btsVar4, (i3 & 14) | 221184 | (i3 & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 29360128));
            btsVar = btsVar4;
            btsVar.t(true);
        } else {
            btsVar = btsVar3;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yxs0(charSequence, charSequence2, z, v4vVar, z2, nheVar, slsVar, tlsVar, i);
        }
    }

    public static r1n b(p1n p1nVar, w030 w030Var) {
        return new r1n(new hdi(0, w030Var), (i6r) p1nVar.a.a.get());
    }

    public static final md51 c(sls slsVar, tls tlsVar, kdd0 kdd0Var) {
        return new d2e0(slsVar, new gv40(14, tlsVar), kdd0Var).b();
    }

    public static final YbDepositType d(BankPaymentsDepositType bankPaymentsDepositType) {
        int i = or51.a[bankPaymentsDepositType.ordinal()];
        if (i == 1) {
            return YbDepositType.EXACT_AMOUNT;
        }
        if (i == 2) {
            return YbDepositType.ORDER_AMOUNT;
        }
        w511.b();
        return null;
    }
}
