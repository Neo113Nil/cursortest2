package defpackage;

import androidx.compose.foundation.layout.a;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public final /* synthetic */ class pca0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ oz40 c;

    public /* synthetic */ pca0(tls tlsVar, oz40 oz40Var, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = oz40Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o430 o430Var = did.a;
        c530 c530Var = c530.a;
        oz40 oz40Var = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tic ticVar = (tic) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ticVar) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new c0(tlsVar, oz40Var, 6);
                        btsVar.o0(Q);
                    }
                    vpa1.a(u3a1.d(an91.o(ticVar.a(x4c.I, c530Var), 0.0f, 8.0f, 8.0f, 8.0f, 1), "modal_close_button"), false, ButtonSize.M, (sls) Q, wwg.S(-771186319, false, qca0.a, btsVar), btsVar, 24960, 2);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(1 & intValue2, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    f530 k2 = an91.k(c530Var, 8.0f);
                    WeakHashMap weakHashMap = a.w;
                    f530 o = an91.o(k2, 0.0f, w8a1.f(vuz.o(btsVar2).g, btsVar2).d(), 0.0f, 0.0f, 13);
                    ButtonSize buttonSize = ButtonSize.M;
                    boolean k3 = btsVar2.k(tlsVar) | btsVar2.k(oz40Var);
                    Object Q2 = btsVar2.Q();
                    if (k3 || Q2 == o430Var) {
                        Q2 = new c0(tlsVar, oz40Var, 9);
                        btsVar2.o0(Q2);
                    }
                    jad.a.getClass();
                    vpa1.a(o, false, buttonSize, (sls) Q2, jad.b, btsVar2, 24960, 2);
                    break;
                }
        }
        return zy11Var;
    }
}
