package defpackage;

import java.util.List;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public final /* synthetic */ class mpy0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ tls c;

    public /* synthetic */ mpy0(List list, tls tlsVar, int i) {
        this.a = i;
        this.b = list;
        this.c = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        List<t460> list = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    for (t460 t460Var : list) {
                        boolean k = btsVar.k(tlsVar) | btsVar.k(t460Var);
                        Object Q = btsVar.Q();
                        if (k || Q == did.a) {
                            Q = new i5y0(6, tlsVar, t460Var);
                            btsVar.o0(Q);
                        }
                        a.f((sls) Q, ljs0.e(c530.a, 32.0f), ((YandexShapes) btsVar.m(qm51.a)).e(), 0L, 0L, null, null, false, null, null, null, wwg.S(1308402700, true, new jvx0(4, t460Var), btsVar), btsVar, 0, 4088);
                    }
                    break;
                } else {
                    btsVar.Y();
                    break;
                }
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    apa1.a(list, tlsVar, btsVar2, 8);
                    break;
                } else {
                    btsVar2.Y();
                    break;
                }
        }
        return zy11Var;
    }
}
