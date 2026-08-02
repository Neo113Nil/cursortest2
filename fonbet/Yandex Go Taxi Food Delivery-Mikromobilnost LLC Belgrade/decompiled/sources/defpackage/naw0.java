package defpackage;

import com.yandex.div.core.expression.variables.a;

/* loaded from: classes14.dex */
public final class naw0 implements v7p {
    public final /* synthetic */ int a = 0;
    public final nag b;
    public final xvf0 c;
    public final nag d;

    public naw0(nag nagVar, nag nagVar2, xvf0 xvf0Var) {
        this.b = nagVar;
        this.d = nagVar2;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        nag nagVar = this.d;
        xvf0 xvf0Var = this.c;
        nag nagVar2 = this.b;
        switch (i) {
            case 0:
                return new maw0((je7) nagVar2.get(), (zuj0) nagVar.get(), (d0m) xvf0Var.get());
            default:
                return new qaw0((je7) nagVar2.get(), (a) xvf0Var.get(), (zuj0) nagVar.get());
        }
    }

    public naw0(nag nagVar, xvf0 xvf0Var, nag nagVar2) {
        this.b = nagVar;
        this.c = xvf0Var;
        this.d = nagVar2;
    }
}
