package defpackage;

import com.yandex.messaging.internal.menu.c;

/* loaded from: classes15.dex */
public final /* synthetic */ class e3b implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ e3b(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                sfl0 sfl0Var = cVar.d;
                new b0j0(a620.d);
                sfl0Var.getClass();
                break;
            default:
                sk7 sk7Var = cVar.t;
                if (sk7Var == null) {
                    sk7Var = null;
                }
                ((x22) ((io9) sk7Var.w).a).f("chat menu closed", "chat id", (String) sk7Var.b, "source", (String) sk7Var.c);
                break;
        }
        return zy11Var;
    }
}
