package defpackage;

import com.yandex.go.summary.ui.compose.common.tariffcell.a;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public final /* synthetic */ class jex0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ mex0 b;

    public /* synthetic */ jex0(mex0 mex0Var, int i) {
        this.a = i;
        this.b = mex0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        mex0 mex0Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    a.a(mex0Var.m, mex0Var.h, null, btsVar, 0);
                    break;
                }
            case 1:
                String str = mex0Var.m;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    boolean k = btsVar2.k(str);
                    Object Q = btsVar2.Q();
                    if (k || Q == did.a) {
                        Q = str + PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX;
                        btsVar2.o0(Q);
                    }
                    com.yandex.go.summary.ui.compose.common.tooltip.a.a((String) Q, mex0Var.i, null, wwg.S(-1747887158, true, new jex0(mex0Var, 2), btsVar2), btsVar2, HProv.ALG_TYPE_SECURECHANNEL);
                    break;
                }
                break;
            default:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    btsVar3.Y();
                    break;
                } else {
                    a.f(mex0Var, null, btsVar3, 0);
                    break;
                }
        }
        return zy11Var;
    }
}
