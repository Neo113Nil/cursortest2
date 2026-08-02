package defpackage;

import com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.b;
import com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.c;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final class mx41 implements bms {
    public final /* synthetic */ List a;
    public final /* synthetic */ float b;
    public final /* synthetic */ c c;
    public final /* synthetic */ int w;

    public mx41(List list, float f, c cVar, int i) {
        this.a = list;
        this.b = f;
        this.c = cVar;
        this.w = i;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        u4y u4yVar = (u4y) obj;
        int intValue = ((Number) obj2).intValue();
        fid fidVar = (fid) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((bts) fidVar).k(u4yVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= fidVar.c(intValue) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            Object obj5 = this.a.get(intValue);
            int i2 = i & HProv.PP_DELETE_SAVED_PASSWD;
            jx41 jx41Var = (jx41) obj5;
            btsVar.e0(-1059970118);
            f530 c = ljs0.c(c530.a, 1.0f);
            c cVar = this.c;
            boolean k = btsVar.k(cVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new u6s0(11, cVar);
                btsVar.o0(Q);
            }
            b.a(c, this.b, intValue, (sls) Q, jx41Var, intValue == this.w, btsVar, ((i2 << 3) & 896) | 6);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }
}
