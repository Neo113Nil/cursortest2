package defpackage;

import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes6.dex */
public final /* synthetic */ class bz41 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ cms c;
    public final /* synthetic */ Object w;

    public /* synthetic */ bz41(int i, cms cmsVar, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = cmsVar;
        this.w = obj2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.w;
        cms cmsVar = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                cz41 cz41Var = (cz41) obj5;
                ((wzb) cz41Var.b).a(new a441(5, (ec31) cmsVar, cz41Var), Screen.WHERE_YOU_ARE);
                ((hh31) obj4).invoke();
                break;
            default:
                xd40 xd40Var = (xd40) obj5;
                tls tlsVar = (tls) cmsVar;
                aj31 aj31Var = (aj31) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    rzo.b(null, "default", wwg.S(233081459, true, new w4f(5, xd40Var, tlsVar, aj31Var), btsVar), btsVar, 3456, 3);
                    break;
                }
        }
        return zy11Var;
    }
}
