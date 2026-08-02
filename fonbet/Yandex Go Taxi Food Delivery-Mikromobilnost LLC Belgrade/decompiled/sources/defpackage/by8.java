package defpackage;

import android.content.Context;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.d;
import ru.yandex.taxi.requirements.interactor.x;

/* loaded from: classes6.dex */
public final class by8 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final t0g d;

    public /* synthetic */ by8(xvf0 xvf0Var, xvf0 xvf0Var2, t0g t0gVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = t0gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        t0g t0gVar = this.d;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new sk7(6, (k7x0) xvf0Var2.get(), (x) xvf0Var.get(), (Context) t0gVar.get());
            default:
                return new d((pav) xvf0Var2.get(), (k7x0) xvf0Var.get(), (Context) t0gVar.get());
        }
    }
}
