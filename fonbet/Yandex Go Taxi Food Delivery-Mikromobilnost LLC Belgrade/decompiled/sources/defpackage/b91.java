package defpackage;

import com.yandex.go.design.compose.slot.body.BodyAlign;

/* loaded from: classes11.dex */
public final /* synthetic */ class b91 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ zls b;

    public /* synthetic */ b91(zls zlsVar, int i) {
        this.a = i;
        this.b = zlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        zls zlsVar = this.b;
        switch (i) {
            case 0:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    zlsVar.invoke(ibp0Var, btsVar, Integer.valueOf(intValue & 14));
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
                    sb2.b(u76.a.a(BodyAlign.Center), wwg.S(-1994733524, true, new q0v(27, zlsVar, ebp0Var), btsVar2), btsVar2, 56);
                    break;
                }
        }
        return zy11Var;
    }
}
