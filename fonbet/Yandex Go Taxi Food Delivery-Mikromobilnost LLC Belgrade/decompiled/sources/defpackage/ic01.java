package defpackage;

import com.yandex.go.compose.ComposeContentKt$ContentImpl$scope$1$1$action$1;
import com.yandex.go.walking.navigation.impl.guidance.e;
import java.util.List;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.masstransit.trains.search.b;

/* loaded from: classes14.dex */
public final /* synthetic */ class ic01 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ic01(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.a;
        o430 o430Var = did.a;
        int i4 = 2;
        int i5 = 1;
        zy11 zy11Var = zy11.a;
        Object obj5 = this.b;
        switch (i3) {
            case 0:
                kc01 kc01Var = (kc01) obj5;
                xfd xfdVar = (xfd) obj;
                nc01 nc01Var = (nc01) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = intValue | ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= (intValue & 64) == 0 ? ((bts) fidVar).k(nc01Var) : fidVar.e(nc01Var) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(i & 1, (i & 147) != 146)) {
                    btsVar.Y();
                    break;
                } else {
                    b.f(nc01Var, kc01Var.H.e, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
                    break;
                }
            case 1:
                final is11 is11Var = (is11) obj5;
                final boolean booleanValue = ((Boolean) obj).booleanValue();
                final boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                final f fVar = (f) obj3;
                final List list = (List) obj4;
                break;
            case 2:
                e eVar = (e) obj5;
                o341 o341Var = (o341) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= (intValue2 & 64) == 0 ? ((bts) fidVar2).k(o341Var) : fidVar2.e(o341Var) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 145) != 144)) {
                    btsVar2.Y();
                    break;
                } else {
                    boolean e = btsVar2.e(eVar);
                    if ((intValue2 & 112) == 32 || ((intValue2 & 64) != 0 && btsVar2.e(o341Var))) {
                        r4 = true;
                    }
                    boolean z = e | r4;
                    Object Q = btsVar2.Q();
                    if (z || Q == o430Var) {
                        Q = new e331(11, eVar, o341Var);
                        btsVar2.o0(Q);
                    }
                    tls tlsVar = (tls) Q;
                    boolean e2 = btsVar2.e(eVar);
                    Object Q2 = btsVar2.Q();
                    if (e2 || Q2 == o430Var) {
                        Q2 = new w141(eVar, i4);
                        btsVar2.o0(Q2);
                    }
                    hk91.a(o341Var, tlsVar, (tls) Q2, btsVar2, (intValue2 >> 3) & 14);
                    break;
                }
                break;
            case 3:
                t441 t441Var = (t441) obj5;
                xfd xfdVar2 = (xfd) obj;
                e541 e541Var = (e541) obj2;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    i2 = intValue3 | ((intValue3 & 8) == 0 ? ((bts) fidVar3).k(xfdVar2) : fidVar3.e(xfdVar2) ? 4 : 2);
                } else {
                    i2 = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i2 |= (intValue3 & 64) == 0 ? ((bts) fidVar3).k(e541Var) : fidVar3.e(e541Var) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(i2 & 1, (i2 & 147) != 146)) {
                    btsVar3.Y();
                    break;
                } else {
                    ComposeContentKt$ContentImpl$scope$1$1$action$1 composeContentKt$ContentImpl$scope$1$1$action$1 = ((bgd) xfdVar2).a;
                    boolean e3 = btsVar3.e(t441Var);
                    Object Q3 = btsVar3.Q();
                    if (e3 || Q3 == o430Var) {
                        Q3 = new r441(t441Var, i5);
                        btsVar3.o0(Q3);
                    }
                    lk91.a(e541Var, composeContentKt$ContentImpl$scope$1$1$action$1, (tls) Q3, btsVar3, (i2 >> 3) & 14);
                    break;
                }
            default:
                qv90.a.getClass();
                ((y22) ((rwo) ((mj31) obj5).w)).a(sv90.L((String) obj, (String) obj3, (String) obj2, (String) obj4));
                break;
        }
        return zy11Var;
    }
}
