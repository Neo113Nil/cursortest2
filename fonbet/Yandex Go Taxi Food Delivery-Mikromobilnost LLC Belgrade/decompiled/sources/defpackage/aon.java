package defpackage;

import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public final class aon implements bms {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dfl0 c;
    public final /* synthetic */ tls w;

    public aon(List list, int i, dfl0 dfl0Var, tls tlsVar) {
        this.a = list;
        this.b = i;
        this.c = dfl0Var;
        this.w = tlsVar;
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
            afl0 afl0Var = (afl0) obj5;
            btsVar.e0(-589246951);
            boolean z = intValue == 0;
            int i3 = this.b;
            boolean z2 = intValue == i3 + (-1);
            dfl0 dfl0Var = this.c;
            i4a1.b(afl0Var, z ? dfl0Var.d.a : z2 ? dfl0Var.d.c : dfl0Var.d.b, dfl0Var.f, this.w, intValue, i3, afl0Var.g, null, null, false, null, btsVar, (i2 << 9) & HProv.ALG_CLASS_ALL, 1920);
            i4a1.c(!z2, btsVar, 0);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }
}
