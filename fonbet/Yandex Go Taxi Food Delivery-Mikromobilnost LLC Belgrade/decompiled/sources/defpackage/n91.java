package defpackage;

import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes11.dex */
public final /* synthetic */ class n91 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ yur b;
    public final /* synthetic */ tls c;

    public /* synthetic */ n91(yur yurVar, tls tlsVar, int i) {
        this.a = i;
        this.b = yurVar;
        this.c = tlsVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        o430 o430Var = did.a;
        tls tlsVar = this.c;
        yur yurVar = this.b;
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
                    xw91 xw91Var = ((nx2) btsVar.m(uy2.c)).b;
                    boolean b = btsVar.b(16.0f);
                    Object Q = btsVar.Q();
                    if (b || Q == o430Var) {
                        Q = cyk0.c(16.0f);
                        btsVar.o0(Q);
                    }
                    byk0 byk0Var = (byk0) Q;
                    jpa1.a(z91Var, ymb1.l(bzk0.c(hbb1.c(an91.o(c530.a, 8.0f, 8.0f, 8.0f, 0.0f, 8), dbb1.c(btsVar), false, 0.0f, null, 14), AppColor$Palette.Background, byk0Var), byk0Var), this.b, this.c, btsVar, (intValue >> 3) & 14, 0);
                    break;
                }
            case 1:
                osz0 osz0Var = (osz0) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((bts) fidVar2).k(osz0Var) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 145) != 144)) {
                    btsVar2.Y();
                    break;
                } else {
                    osz0Var.getClass();
                    f530 d = hi91.d(gi91.b(an91.o(c530.a, 8.0f, 0.0f, 0.0f, 0.0f, 14), yurVar), false, null, 3);
                    boolean z = (intValue2 & 112) == 32;
                    Object Q2 = btsVar2.Q();
                    if (z || Q2 == o430Var) {
                        Q2 = new pxy0(9, osz0Var);
                        btsVar2.o0(Q2);
                    }
                    f530 b2 = fnq0.b(d, false, (tls) Q2);
                    ButtonSize buttonSize = ButtonSize.M;
                    boolean a = btsVar2.a(true) | btsVar2.k(tlsVar) | btsVar2.k(dtz0.a);
                    Object Q3 = btsVar2.Q();
                    if (a || Q3 == o430Var) {
                        Q3 = new lao0(28, tlsVar);
                        btsVar2.o0(Q3);
                    }
                    vpa1.a(b2, true, buttonSize, (sls) Q3, wwg.S(1587190024, true, new jvx0(10, osz0Var), btsVar2), btsVar2, 24960, 0);
                    break;
                }
            default:
                msz0 msz0Var = (msz0) obj2;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 48) == 0) {
                    intValue3 |= ((bts) fidVar3).k(msz0Var) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 145) != 144)) {
                    btsVar3.Y();
                    break;
                } else {
                    f4b1.a(wwg.S(-1342929834, true, new jvx0(11, msz0Var), btsVar3), null, 0.0f, 0.0f, wwg.S(-1958022054, true, new ls40(25, msz0Var, yurVar, tlsVar), btsVar3), btsVar3, 24582, 14);
                    break;
                }
        }
        return zy11Var;
    }
}
