package defpackage;

import com.yandex.go.design.compose.slot.body.BodyAlign;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class jun0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sun0 b;

    public /* synthetic */ jun0(sun0 sun0Var, int i) {
        this.a = i;
        this.b = sun0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sun0 sun0Var = this.b;
        switch (i) {
            case 0:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    m9b1.a(ebp0Var, sun0Var.f, null, null, null, 0, 0, null, null, null, 0, 0, BodyAlign.Center, btsVar, intValue & 14, HProv.ALG_TYPE_SECURECHANNEL, 12286);
                    break;
                }
            default:
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    m9b1.a(ebp0Var2, sun0Var.g, null, null, xya1.e(btsVar2).g.b, 0, 0, null, null, null, 0, 0, BodyAlign.Center, btsVar2, intValue2 & 14, HProv.ALG_TYPE_SECURECHANNEL, 12278);
                    break;
                }
        }
        return zy11Var;
    }
}
