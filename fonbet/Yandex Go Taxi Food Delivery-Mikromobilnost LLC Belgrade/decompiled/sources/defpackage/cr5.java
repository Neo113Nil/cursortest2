package defpackage;

import androidx.compose.ui.graphics.d;
import com.yandex.go.rida.bids.utils.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class cr5 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg6 b;

    public /* synthetic */ cr5(wg6 wg6Var, int i) {
        this.a = i;
        this.b = wg6Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wg6 wg6Var = this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    tx40 d = a.d(wg6Var, btsVar, 48, 0);
                    f530 c = ljs0.c(c530.a, 1.0f);
                    boolean k = btsVar.k(d);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new f0(d, 2);
                        btsVar.o0(Q);
                    }
                    yyf0.a(d.a(c, (tls) Q), btsVar, 0);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    oab1.a(wg6Var, btsVar2, 0);
                    break;
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar3.Y();
                    break;
                } else {
                    oab1.a(wg6Var, btsVar3, 0);
                    break;
                }
        }
        return zy11Var;
    }
}
