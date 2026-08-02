package defpackage;

import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.o0;

/* loaded from: classes14.dex */
public final class jdu implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final vnj0 d;

    public /* synthetic */ jdu(w0g w0gVar, b1g b1gVar, vnj0 vnj0Var, int i) {
        this.a = i;
        this.b = w0gVar;
        this.c = b1gVar;
        this.d = vnj0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        vnj0 vnj0Var = this.d;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new r1s(8, (zuj0) xvf0Var2.get(), (viv0) xvf0Var.get(), (oxs0) vnj0Var.get());
            default:
                return new o0((zuj0) xvf0Var2.get(), (viv0) xvf0Var.get(), (oxs0) vnj0Var.get());
        }
    }
}
