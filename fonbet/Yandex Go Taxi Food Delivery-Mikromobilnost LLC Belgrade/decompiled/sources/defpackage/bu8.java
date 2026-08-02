package defpackage;

import ru.yandex.logistics.care.ui.l;

/* loaded from: classes4.dex */
public final class bu8 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt8 b;
    public final /* synthetic */ l c;

    public /* synthetic */ bu8(pt8 pt8Var, l lVar, int i) {
        this.a = i;
        this.b = pt8Var;
        this.c = lVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        l lVar = this.c;
        pt8 pt8Var = this.b;
        switch (i) {
            case 0:
                nt8 nt8Var = (nt8) pt8Var;
                nt8Var.a.e.k(jq8.b);
                lVar.a0(new o4c(nt8Var.a.i));
                break;
            default:
                nt8 nt8Var2 = (nt8) pt8Var;
                nt8Var2.a.e.k(gq8.b);
                lVar.a0(new m4c(nt8Var2.a.i));
                break;
        }
        return zy11Var;
    }
}
