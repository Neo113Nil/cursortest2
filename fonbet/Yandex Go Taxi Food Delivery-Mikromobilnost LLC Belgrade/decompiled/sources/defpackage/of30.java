package defpackage;

import com.yandex.go.payments.transport.navigation.b;

/* loaded from: classes13.dex */
public final class of30 implements tr30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ of30(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 1:
                ((b) this.b).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.tr30
    public final void s(lea0 lea0Var) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                qf30 qf30Var = (qf30) h55Var;
                qf30Var.R.b(lea0Var != null ? n6a0.b(qf30Var.S, lea0Var) : null);
                break;
            case 1:
                b bVar = (b) h55Var;
                bVar.E.a.g(lea0Var);
                bVar.r(new qu(9));
                break;
            default:
                dd31 dd31Var = (dd31) h55Var;
                ((lz30) dd31Var.h0.get()).b(lea0Var != null ? n6a0.b((n6a0) dd31Var.f0.get(), lea0Var) : null);
                break;
        }
    }
}
