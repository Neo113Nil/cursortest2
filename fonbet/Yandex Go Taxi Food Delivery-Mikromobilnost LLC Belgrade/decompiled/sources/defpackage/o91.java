package defpackage;

import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.summary.ui.compose.expanded.content.tariffcard.scrollbutton.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class o91 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ o91(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        gz6 gz6Var;
        int i = this.a;
        c530 c530Var = c530.a;
        Object obj5 = did.a;
        tls tlsVar = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                z91 z91Var = (z91) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 48) == 0) {
                    intValue |= ((bts) fidVar).k(z91Var) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 145) != 144)) {
                    btsVar.Y();
                    break;
                } else {
                    jpa1.a(z91Var, null, null, this.b, btsVar, (intValue >> 3) & 14, 6);
                    break;
                }
            case 1:
                me3 me3Var = (me3) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((bts) fidVar2).k(me3Var) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 145) != 144)) {
                    btsVar2.Y();
                    break;
                } else {
                    h1b1.c(me3Var, null, tlsVar, btsVar2, (intValue2 >> 3) & 14);
                    break;
                }
            case 2:
                kp5 kp5Var = (kp5) obj2;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 48) == 0) {
                    intValue3 |= ((bts) fidVar3).k(kp5Var) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 145) != 144)) {
                    f530 w = ljs0.w(an91.o(an91.m(c530Var, 16.0f, 0.0f, 2), 0.0f, 20.0f, 0.0f, 0.0f, 13), 3);
                    ButtonSize buttonSize = ButtonSize.L;
                    ButtonForm buttonForm = ButtonForm.Circle;
                    int i2 = ip5.a[kp5Var.b.ordinal()];
                    if (i2 == 1) {
                        gz6Var = jp5.a;
                    } else if (i2 != 2) {
                        w511.b();
                        break;
                    } else {
                        gz6Var = jp5.b;
                    }
                    gz6 gz6Var2 = gz6Var;
                    boolean k = btsVar3.k(tlsVar);
                    Object Q = btsVar3.Q();
                    if (k || Q == obj5) {
                        Q = new o0(27, tlsVar);
                        btsVar3.o0(Q);
                    }
                    d17.d(w, false, buttonSize, gz6Var2, buttonForm, (sls) Q, wwg.S(-488921948, true, new bj0(r12, kp5Var), btsVar3), btsVar3, 1597830, 2);
                } else {
                    btsVar3.Y();
                }
                break;
            case 3:
                q1a0 q1a0Var = (q1a0) obj2;
                fid fidVar4 = (fid) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= ((bts) fidVar4).k(q1a0Var) ? 32 : 16;
                }
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 145) != 144)) {
                    btsVar4.Y();
                    break;
                } else {
                    mi91.f(q1a0Var, ljs0.n(c530Var, 64.0f, 56.0f), tlsVar, btsVar4, ((intValue4 >> 3) & 14) | 48);
                    break;
                }
            case 4:
                phx0 phx0Var = (phx0) obj2;
                fid fidVar5 = (fid) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                if ((intValue5 & 48) == 0) {
                    intValue5 |= ((bts) fidVar5).k(phx0Var) ? 32 : 16;
                }
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 145) != 144)) {
                    btsVar5.Y();
                    break;
                } else {
                    mi91.g(phx0Var, ljs0.n(c530Var, 64.0f, 56.0f), tlsVar, btsVar5, ((intValue5 >> 3) & 14) | 48);
                    break;
                }
            case 5:
                wdu wduVar = (wdu) obj2;
                fid fidVar6 = (fid) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                if ((intValue6 & 48) == 0) {
                    intValue6 |= ((bts) fidVar6).k(wduVar) ? 32 : 16;
                }
                bts btsVar6 = (bts) fidVar6;
                if (!btsVar6.V(intValue6 & 1, (intValue6 & 145) != 144)) {
                    btsVar6.Y();
                    break;
                } else {
                    wza1.c(wduVar, null, tlsVar, btsVar6, (intValue6 >> 3) & 14);
                    break;
                }
            case 6:
                ixq0 ixq0Var = (ixq0) obj2;
                fid fidVar7 = (fid) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                if ((intValue7 & 48) == 0) {
                    intValue7 |= ((bts) fidVar7).k(ixq0Var) ? 32 : 16;
                }
                bts btsVar7 = (bts) fidVar7;
                if (!btsVar7.V(intValue7 & 1, (intValue7 & 145) != 144)) {
                    btsVar7.Y();
                    break;
                } else {
                    String str = ixq0Var.a;
                    boolean k2 = btsVar7.k(tlsVar) | ((intValue7 & 112) == 32);
                    Object Q2 = btsVar7.Q();
                    if (k2 || Q2 == obj5) {
                        Q2 = new muv(ixq0Var, tlsVar, 0);
                        btsVar7.o0(Q2);
                    }
                    mua1.c(str, null, (sls) Q2, btsVar7, 0, 2);
                    break;
                }
            case 7:
                jxq0 jxq0Var = (jxq0) obj2;
                fid fidVar8 = (fid) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                if ((intValue8 & 48) == 0) {
                    intValue8 |= ((bts) fidVar8).k(jxq0Var) ? 32 : 16;
                }
                bts btsVar8 = (bts) fidVar8;
                if (!btsVar8.V(intValue8 & 1, (intValue8 & 145) != 144)) {
                    btsVar8.Y();
                    break;
                } else {
                    ovi0 a = mja1.a(jxq0Var.c, null, 6);
                    String str2 = jxq0Var.b;
                    boolean k3 = btsVar8.k(tlsVar) | ((intValue8 & 112) == 32);
                    Object Q3 = btsVar8.Q();
                    if (k3 || Q3 == obj5) {
                        Q3 = new mqu(8, jxq0Var, tlsVar);
                        btsVar8.o0(Q3);
                    }
                    mua1.c(str2, a, (sls) Q3, btsVar8, 0, 0);
                    break;
                }
            case 8:
                n7k0 n7k0Var = (n7k0) obj2;
                fid fidVar9 = (fid) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                if ((intValue9 & 48) == 0) {
                    intValue9 |= ((bts) fidVar9).k(n7k0Var) ? 32 : 16;
                }
                bts btsVar9 = (bts) fidVar9;
                if (!btsVar9.V(intValue9 & 1, (intValue9 & 145) != 144)) {
                    btsVar9.Y();
                    break;
                } else {
                    au2 au2Var = n7k0Var.a;
                    String str3 = n7k0Var.b;
                    boolean k4 = btsVar9.k(tlsVar);
                    Object Q4 = btsVar9.Q();
                    if (k4 || Q4 == obj5) {
                        Q4 = new v6k0(0, tlsVar);
                        btsVar9.o0(Q4);
                    }
                    nab1.a(au2Var, str3, (sls) Q4, null, btsVar9, 0, 8);
                    break;
                }
            case 9:
                hhp0 hhp0Var = (hhp0) obj2;
                fid fidVar10 = (fid) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                if ((intValue10 & 48) == 0) {
                    intValue10 |= ((bts) fidVar10).k(hhp0Var) ? 32 : 16;
                }
                bts btsVar10 = (bts) fidVar10;
                if (!btsVar10.V(intValue10 & 1, (intValue10 & 145) != 144)) {
                    btsVar10.Y();
                    break;
                } else {
                    a.a(hhp0Var, null, tlsVar, btsVar10, (intValue10 >> 3) & 14);
                    break;
                }
            case 10:
                psz0 psz0Var = (psz0) obj2;
                fid fidVar11 = (fid) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                if ((intValue11 & 48) == 0) {
                    intValue11 |= ((bts) fidVar11).k(psz0Var) ? 32 : 16;
                }
                bts btsVar11 = (bts) fidVar11;
                if (!btsVar11.V(intValue11 & 1, (intValue11 & 145) != 144)) {
                    btsVar11.Y();
                    break;
                } else {
                    etz0 etz0Var = psz0Var.c;
                    au2 au2Var2 = psz0Var.a;
                    String str4 = psz0Var.b;
                    boolean k5 = btsVar11.k(tlsVar) | btsVar11.e(etz0Var);
                    Object Q5 = btsVar11.Q();
                    if (k5 || Q5 == obj5) {
                        Q5 = new xsz0(tlsVar, etz0Var, 1);
                        btsVar11.o0(Q5);
                    }
                    nab1.a(au2Var2, str4, (sls) Q5, null, btsVar11, 0, 8);
                    break;
                }
            default:
                ua31 ua31Var = (ua31) obj2;
                fid fidVar12 = (fid) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                if ((intValue12 & 48) == 0) {
                    intValue12 |= ((bts) fidVar12).k(ua31Var) ? 32 : 16;
                }
                bts btsVar12 = (bts) fidVar12;
                if (!btsVar12.V(intValue12 & 1, (intValue12 & 145) != 144)) {
                    btsVar12.Y();
                    break;
                } else {
                    com.yandex.go.summary.ui.compose.common.selector.a.h(ua31Var, tlsVar, null, btsVar12, (intValue12 >> 3) & 14);
                    break;
                }
        }
        return zy11Var;
    }
}
