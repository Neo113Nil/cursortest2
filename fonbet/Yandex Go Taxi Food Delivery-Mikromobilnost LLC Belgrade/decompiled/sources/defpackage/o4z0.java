package defpackage;

import androidx.compose.runtime.internal.a;
import ru.yandex.taxi.logistics.sdk.ui.component.icon.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class o4z0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3b1 b;
    public final /* synthetic */ a c;

    public /* synthetic */ o4z0(w3b1 w3b1Var, a aVar, int i) {
        this.a = i;
        this.b = w3b1Var;
        this.c = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.c;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    r3b1.a(ljs0.c, this.b, null, null, wwg.S(1286977944, true, new jz2(aVar, 6), btsVar), btsVar, 24582, 12);
                    break;
                }
            default:
                bj6 bj6Var = (bj6) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(bj6Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    k8v k8vVar = (k8v) this.b;
                    b b = ua3.b(k8vVar.a, null, null, btsVar2, 14);
                    Float f = k8vVar.b;
                    float floatValue = f != null ? f.floatValue() : 1.0f;
                    Float f2 = k8vVar.c;
                    float floatValue2 = f2 != null ? f2.floatValue() : 1.0f;
                    y7m y7mVar = k8vVar.e;
                    float f3 = y7mVar != null ? y7mVar.a : 0.0f;
                    y7m y7mVar2 = k8vVar.f;
                    wi91.a(b, floatValue, floatValue2, f3, y7mVar2 != null ? y7mVar2.a : 0.0f, k8vVar.d, btsVar2, 0, 32);
                    aVar.invoke(bj6Var, btsVar2, Integer.valueOf(intValue2 & 14));
                    break;
                }
        }
        return zy11Var;
    }
}
