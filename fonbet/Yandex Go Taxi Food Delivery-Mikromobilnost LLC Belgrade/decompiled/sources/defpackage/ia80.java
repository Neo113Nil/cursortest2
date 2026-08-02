package defpackage;

import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.e;

/* loaded from: classes6.dex */
public final class ia80 implements v7p {
    public final /* synthetic */ int a = 1;
    public final xvf0 b;
    public final xvf0 c;
    public final n3w d;
    public final n3w e;

    public ia80(k7g k7gVar, xvf0 xvf0Var, n3w n3wVar, n3w n3wVar2) {
        this.b = k7gVar;
        this.c = xvf0Var;
        this.d = n3wVar;
        this.e = n3wVar2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        n3w n3wVar = this.e;
        n3w n3wVar2 = this.d;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new ha80((f0g) n3wVar2.a, xvf0Var2, (f0g) n3wVar.a, (g6y0) xvf0Var.get());
            default:
                return new e((w030) xvf0Var2.get(), (ukn0) xvf0Var.get(), (nym0) n3wVar2.a, (lym0) n3wVar.a);
        }
    }

    public ia80(n3w n3wVar, xvf0 xvf0Var, n3w n3wVar2, xvf0 xvf0Var2) {
        this.d = n3wVar;
        this.b = xvf0Var;
        this.e = n3wVar2;
        this.c = xvf0Var2;
    }
}
