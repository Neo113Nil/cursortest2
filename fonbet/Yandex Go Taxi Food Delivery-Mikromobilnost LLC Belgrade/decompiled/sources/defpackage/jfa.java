package defpackage;

import com.yandex.go.design.compose.button.ButtonForm;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class jfa implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj90 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ tls w;

    public /* synthetic */ jfa(wj90 wj90Var, boolean z, tls tlsVar, int i) {
        this.a = i;
        this.b = wj90Var;
        this.c = z;
        this.w = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = did.a;
        c530 c530Var = c530.a;
        tls tlsVar = this.w;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    wj90 wj90Var = this.b;
                    if (wj90Var != null) {
                        btsVar.e0(2041399097);
                        oeb1.c(btsVar, ljs0.q(c530Var, 8.0f));
                        ButtonForm buttonForm = ButtonForm.Squircle;
                        boolean e = btsVar.e(wj90Var) | btsVar.k(tlsVar);
                        Object Q = btsVar.Q();
                        if (e || Q == obj4) {
                            Q = new ifa(wj90Var, tlsVar, 0);
                            btsVar.o0(Q);
                        }
                        t791.c(null, wj90Var, this.c, buttonForm, (sls) Q, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 5);
                        nnm.s(c530Var, 16.0f, btsVar, false);
                        break;
                    } else {
                        btsVar.e0(2041399096);
                        btsVar.t(false);
                        break;
                    }
                }
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    oeb1.c(btsVar2, ljs0.q(c530Var, 8.0f));
                    wj90 wj90Var2 = this.b;
                    if (wj90Var2 == null) {
                        btsVar2.e0(1524711129);
                        btsVar2.t(false);
                        break;
                    } else {
                        btsVar2.e0(1524472801);
                        boolean e2 = btsVar2.e(wj90Var2) | btsVar2.k(tlsVar);
                        Object Q2 = btsVar2.Q();
                        if (e2 || Q2 == obj4) {
                            Q2 = new ifa(wj90Var2, tlsVar, 1);
                            btsVar2.o0(Q2);
                        }
                        t791.c(null, wj90Var2, this.c, null, (sls) Q2, btsVar2, 0, 21);
                        nnm.s(c530Var, 16.0f, btsVar2, false);
                        break;
                    }
                }
        }
        return zy11Var;
    }
}
