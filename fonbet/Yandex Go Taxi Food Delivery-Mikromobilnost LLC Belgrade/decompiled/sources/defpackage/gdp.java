package defpackage;

import com.yandex.go.address.models.PlainAddress;

/* loaded from: classes12.dex */
public final /* synthetic */ class gdp implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlainAddress b;

    public /* synthetic */ gdp(PlainAddress plainAddress, int i) {
        this.a = i;
        this.b = plainAddress;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        PlainAddress plainAddress = this.b;
        switch (i) {
            case 0:
                ljp.V(((jjp) obj).a, plainAddress);
                break;
            case 1:
                ((idp) obj).a.r(new gdp(plainAddress, 0));
                break;
            default:
                ((ub00) obj).a.S(new gfl0(new o8g0(new b8l0(new uhu0(null)), plainAddress)));
                break;
        }
        return zy11Var;
    }
}
