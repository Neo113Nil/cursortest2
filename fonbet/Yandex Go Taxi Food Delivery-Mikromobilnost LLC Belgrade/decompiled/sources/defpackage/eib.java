package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.domain.c;

/* loaded from: classes5.dex */
public final /* synthetic */ class eib implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc b;
    public final /* synthetic */ dib c;

    public /* synthetic */ eib(dib dibVar, bc bcVar) {
        this.a = 0;
        this.c = dibVar;
        this.b = bcVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        dib dibVar = this.c;
        bc bcVar = this.b;
        switch (i) {
            case 0:
                fib fibVar = dibVar.b;
                boolean z = dibVar.a;
                r9x0 action = (fibVar.a() || !z) ? fibVar.getAction() : fibVar.b();
                if (!(action instanceof o9x0)) {
                    ((hf5) ((h3y) bcVar.x).get()).b((fibVar.a() || !z) ? fibVar.getValue() : null, fibVar.getKey(), scc.h(action));
                    break;
                } else {
                    o9x0 o9x0Var = (o9x0) action;
                    ((c) ((h3y) bcVar.w).get()).b(new o9x0(o9x0Var.a, o9x0Var.b, o9x0Var.c, o9x0Var.d, o9x0Var.e, o9x0Var.f, new eib(bcVar, dibVar, 1), new eib(bcVar, dibVar, 2), o9x0Var.i, o9x0Var.j));
                    break;
                }
            case 1:
                ((p6s) bcVar.c).c(dibVar.b.getValue(), dibVar.b.getKey());
                break;
            default:
                ((p6s) bcVar.c).c(null, dibVar.b.getKey());
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ eib(bc bcVar, dib dibVar, int i) {
        this.a = i;
        this.b = bcVar;
        this.c = dibVar;
    }
}
