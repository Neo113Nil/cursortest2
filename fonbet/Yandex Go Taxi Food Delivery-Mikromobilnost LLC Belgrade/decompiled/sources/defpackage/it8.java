package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.ComposeView;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.care.ui.n;

/* loaded from: classes4.dex */
public final /* synthetic */ class it8 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jt8 b;
    public final /* synthetic */ qhb0 c;
    public final /* synthetic */ ComposeView w;
    public final /* synthetic */ n x;
    public final /* synthetic */ cx7 y;

    public /* synthetic */ it8(jt8 jt8Var, qhb0 qhb0Var, ComposeView composeView, n nVar, cx7 cx7Var, int i) {
        this.a = i;
        this.b = jt8Var;
        this.c = qhb0Var;
        this.w = composeView;
        this.x = nVar;
        this.y = cx7Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    xi91.a(wwg.S(1166870276, true, new it8(this.b, this.c, this.w, this.x, this.y, 1), btsVar), btsVar, 6);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    jt8 jt8Var = this.b;
                    qti.c(null, null, ((Boolean) f.b(jt8Var.b.b.a.a, btsVar2).getValue()).booleanValue(), wwg.S(310057021, true, new it8(jt8Var, this.c, this.w, this.x, this.y, 2), btsVar2), btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 3);
                    break;
                }
            default:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    jt8 jt8Var2 = this.b;
                    wly0 wly0Var = jt8Var2.d;
                    f530 g = i9a1.g(c530.a);
                    qzd qzdVar = this.c.a;
                    this.w.getContext();
                    pm5 pm5Var = new pm5(23, jt8Var2);
                    n nVar = this.x;
                    wly0Var.m(new hs8(qzdVar, new c06(nVar, this.y), new hh5(20, nVar), pm5Var), g, btsVar3, 8);
                    break;
                }
        }
        return zy11Var;
    }
}
