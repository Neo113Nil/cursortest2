package defpackage;

import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.a;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.b;

/* loaded from: classes.dex */
public final class l1w0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final yvr0 e;
    public final xvf0 f;

    public /* synthetic */ l1w0(xvf0 xvf0Var, alv0 alv0Var, l20 l20Var, yvr0 yvr0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = alv0Var;
        this.d = l20Var;
        this.e = yvr0Var;
        this.f = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        yvr0 yvr0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new a((tt2) xvf0Var4.get(), (k1w0) xvf0Var3.get(), (com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.a) xvf0Var2.get(), (tig0) yvr0Var.get(), (ney) xvf0Var.get());
            default:
                return new b((tt2) xvf0Var4.get(), (k1w0) xvf0Var3.get(), (com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.a) xvf0Var2.get(), (tig0) yvr0Var.get(), (ney) xvf0Var.get());
        }
    }
}
