package defpackage;

import com.yandex.go.payments.transport.navigation.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class czz implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ hfa0 b;

    public /* synthetic */ czz(hfa0 hfa0Var, int i) {
        this.a = i;
        this.b = hfa0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        hfa0 hfa0Var = this.b;
        switch (i) {
            case 0:
                ((zyz) obj).j(hfa0Var);
                break;
            case 1:
                ((tr30) obj).s(hfa0Var.b());
                break;
            default:
                a aVar = ((vr30) obj).a;
                aVar.r(new czz(hfa0Var, 1));
                com.yandex.go.payments.transport.domain.a aVar2 = aVar.F;
                m6a0 d = hfa0Var.d();
                lz30 lz30Var = aVar2.c;
                if (!jl40.l(lz30Var.a(), d)) {
                    lz30Var.b(d);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
