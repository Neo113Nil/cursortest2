package defpackage;

import com.yandex.go.navigator.gas_stations.pins_layer.a;
import com.yandex.go.navigator.navigation.e;

/* loaded from: classes12.dex */
public final class jlm implements cg50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ jlm(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    private final void n1(String str) {
    }

    private final void o1(String str) {
    }

    @Override // defpackage.cg50
    public final void J0() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((mlm) h55Var).R(new fkm(true));
                break;
            case 1:
                ((jws) h55Var).r(new iws(0));
                break;
            default:
                ((e) h55Var).W(dlm.c);
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((mlm) h55Var).R(new fkm(false));
                break;
            case 1:
                jws jwsVar = (jws) h55Var;
                a aVar = jwsVar.G;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.q4(true);
                k4 k4Var = jwsVar.H;
                jwsVar.C((m950) (k4Var != null ? k4Var : null).get(), new hws(jwsVar));
                break;
            default:
                e eVar = (e) h55Var;
                eVar.Q.l(qz60.a);
                eVar.r(new qu(9));
                break;
        }
    }

    @Override // defpackage.cg50
    public final void g0(String str) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                e eVar = (e) this.b;
                eVar.Q.l(new rz60(str));
                eVar.r(new qu(9));
                break;
        }
    }
}
