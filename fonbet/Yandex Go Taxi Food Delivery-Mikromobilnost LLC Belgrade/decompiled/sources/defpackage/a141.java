package defpackage;

import com.yandex.go.walking.navigation.impl.error.interactor.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class a141 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n12 b;

    public /* synthetic */ a141(n12 n12Var, int i) {
        this.a = i;
        this.b = n12Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        n12 n12Var = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((a) n12Var.I).getClass();
                ((agd) yfdVar).c = a.a();
                agd agdVar = (agd) yfdVar;
                agdVar.e = new a141(n12Var, 1);
                hfd.a.getClass();
                agdVar.g = hfd.b;
                return zy11Var;
            default:
                d141 d141Var = (d141) obj;
                ((e141) n12Var.J).getClass();
                if (jl40.l(d141Var, b141.a)) {
                    n12Var.r(new qu(9));
                    return zy11Var;
                }
                if (jl40.l(d141Var, c141.a)) {
                    n12Var.r(new ke31(25));
                    return zy11Var;
                }
                w511.b();
                return null;
        }
    }
}
