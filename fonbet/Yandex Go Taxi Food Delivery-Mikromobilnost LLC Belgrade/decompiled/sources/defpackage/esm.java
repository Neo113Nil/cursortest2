package defpackage;

import androidx.compose.runtime.internal.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class esm implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ esm(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i2) {
            case 0:
                tic ticVar = (tic) obj;
                Boolean bool = (Boolean) obj2;
                boolean booleanValue = bool.booleanValue();
                fid fidVar = (fid) obj3;
                int intValue = ((Number) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (((bts) fidVar).k(ticVar) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= fidVar.a(booleanValue) ? 32 : 16;
                }
                if ((i & 147) == 146) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                aVar.invoke(ticVar, bool, fidVar, Integer.valueOf(i & HProv.PP_DELETE_SAVED_PASSWD));
                break;
            default:
                tic ticVar2 = (tic) obj;
                ((Boolean) obj2).getClass();
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ticVar2) ? 4 : 2;
                }
                if ((intValue2 & HProv.PP_FAST_CODE) == 130) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        break;
                    }
                }
                aVar.invoke(ticVar2, Boolean.FALSE, fidVar2, Integer.valueOf((intValue2 & 14) | 48));
                break;
        }
        return zy11Var;
    }
}
