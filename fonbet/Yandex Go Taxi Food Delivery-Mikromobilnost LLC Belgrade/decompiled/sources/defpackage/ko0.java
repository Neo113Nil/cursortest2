package defpackage;

import com.yandex.go.promocodes.a;
import com.yandex.go.promocodes.b;

/* loaded from: classes8.dex */
public final class ko0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final gd d;
    public final xvf0 e;
    public final bi4 f;

    public /* synthetic */ ko0(xvf0 xvf0Var, su suVar, gd gdVar, g430 g430Var, bi4 bi4Var, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = suVar;
        this.d = gdVar;
        this.e = g430Var;
        this.f = bi4Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        bi4 bi4Var = this.f;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new a((com.yandex.go.lifecycle.a) xvf0Var2.get(), this.c, this.d, (fx60) xvf0Var.get(), (an5) bi4Var.get());
            default:
                return new b((com.yandex.go.lifecycle.a) xvf0Var2.get(), this.c, this.d, (fx60) xvf0Var.get(), (an5) bi4Var.get());
        }
    }
}
