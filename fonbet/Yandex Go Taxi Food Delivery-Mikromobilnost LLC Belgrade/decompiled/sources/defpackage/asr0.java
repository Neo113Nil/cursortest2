package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.WeakHashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class asr0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ asr0(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        int i2 = 14;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        int i3 = 16;
        tls tlsVar = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    f530 k = an91.k(c530Var, 8.0f);
                    WeakHashMap weakHashMap = a.w;
                    f530 o = an91.o(k, 0.0f, w8a1.f(vuz.o(btsVar).g, btsVar).d(), 0.0f, 0.0f, 13);
                    ButtonSize buttonSize = ButtonSize.M;
                    boolean k2 = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k2 || Q == o430Var) {
                        Q = new lao0(13, tlsVar);
                        btsVar.o0(Q);
                    }
                    fdd.a.getClass();
                    vpa1.a(o, false, buttonSize, (sls) Q, fdd.b, btsVar, 24960, 2);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean k3 = btsVar2.k(tlsVar);
                    Object Q2 = btsVar2.Q();
                    if (k3 || Q2 == o430Var) {
                        Q2 = new lao0(i3, tlsVar);
                        btsVar2.o0(Q2);
                    }
                    iab1.a(null, null, null, null, null, null, (sls) Q2, btsVar2, 0);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                nvz0 nvz0Var = (nvz0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(nvz0Var) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    huz0.b(nvz0Var, null, this.b, btsVar3, intValue3 & 14, 1);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    boolean k4 = btsVar4.k(tlsVar);
                    Object Q3 = btsVar4.Q();
                    if (k4 || Q3 == o430Var) {
                        Q3 = new fc01(3, tlsVar);
                        btsVar4.o0(Q3);
                    }
                    iab1.a(null, null, null, null, null, null, (sls) Q3, btsVar4, 0);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    boolean k5 = btsVar5.k(tlsVar);
                    Object Q4 = btsVar5.Q();
                    if (k5 || Q4 == o430Var) {
                        Q4 = new ec01(i2, tlsVar);
                        btsVar5.o0(Q4);
                    }
                    cf91.b(null, (tls) Q4, btsVar5, 0, 1);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    f530 c = ljs0.c(c530Var, 1.0f);
                    sic a = qic.a(lr20.c, x4c.G, btsVar6, 0);
                    int hashCode = Long.hashCode(btsVar6.T);
                    r1b0 o2 = btsVar6.o();
                    f530 d = b.d(btsVar6, c);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, d.f, a);
                    qje.W(btsVar6, d.e, o2);
                    qje.W(btsVar6, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar6, d.h);
                    qje.W(btsVar6, d.d, d);
                    jeb1.f(ohb1.e(btsVar6, kyh0.walking_navigation_complete), an91.k(c530Var, 16.0f), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ((xy2) btsVar6.m(uy2.b)).b.e.d, btsVar6, 432, 0, 16376);
                    f530 c2 = ljs0.c(an91.m(c530Var, 12.0f, 0.0f, 2), 1.0f);
                    boolean k6 = btsVar6.k(tlsVar);
                    Object Q5 = btsVar6.Q();
                    if (k6 || Q5 == o430Var) {
                        Q5 = new fc01(13, tlsVar);
                        btsVar6.o0(Q5);
                    }
                    ifd.a.getClass();
                    ulb1.a(c2, false, null, (sls) Q5, ifd.b, btsVar6, 24582, 6);
                    f530 c3 = ljs0.c(an91.n(c530Var, 12.0f, 4.0f, 12.0f, 8.0f), 1.0f);
                    boolean k7 = btsVar6.k(tlsVar);
                    Object Q6 = btsVar6.Q();
                    if (k7 || Q6 == o430Var) {
                        Q6 = new fc01(i2, tlsVar);
                        btsVar6.o0(Q6);
                    }
                    ohb1.b(c3, false, null, (sls) Q6, ifd.c, btsVar6, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 6:
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    boolean k8 = btsVar7.k(tlsVar);
                    Object Q7 = btsVar7.Q();
                    if (k8 || Q7 == o430Var) {
                        Q7 = new fc01(26, tlsVar);
                        btsVar7.o0(Q7);
                    }
                    mab1.a(null, null, null, null, null, null, (sls) Q7, btsVar7, 0, 63);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            default:
                dj6 dj6Var = (dj6) obj;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((bts) fidVar8).k(dj6Var) ? 4 : 2;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                    qe61.c(0, btsVar8, tlsVar, an91.o(cj6.a.a(sm91.f(c530Var, 0.0f, dj6Var.c() / 3.0f, 1), x4c.w), 0.0f, 0.0f, 8.0f, 0.0f, 11));
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
        }
    }
}
