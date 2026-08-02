package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class eau implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ qcu b;
    public final /* synthetic */ fwi c;

    public /* synthetic */ eau(qcu qcuVar, fwi fwiVar, int i) {
        this.a = i;
        this.b = qcuVar;
        this.c = fwiVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        fwi fwiVar = this.c;
        qcu qcuVar = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    ydb1.a(null, null, wwg.S(-58167033, true, new eau(qcuVar, fwiVar, i2), btsVar), null, null, null, SlotSize.S, false, btsVar, 1573248, 187);
                    break;
                }
            default:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var, qcuVar.a, null, AppColor$Palette.Text, bza1.c(xya1.e(btsVar2).h.a, fwiVar), 0, 0, null, null, null, 0, 0, null, btsVar2, (intValue2 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 0, 8178);
                    break;
                }
        }
        return zy11Var;
    }
}
