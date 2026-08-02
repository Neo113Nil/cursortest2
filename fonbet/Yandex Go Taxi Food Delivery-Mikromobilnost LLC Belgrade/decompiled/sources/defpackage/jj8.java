package defpackage;

import com.yandex.go.payments.cards.navigation.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class jj8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ z80 b;

    public /* synthetic */ jj8(z80 z80Var, int i) {
        this.a = i;
        this.b = z80Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        z80 z80Var = this.b;
        switch (i) {
            case 0:
                ((fj8) obj).W0(z80Var);
                break;
            default:
                ((a) obj).a.r(new jj8(z80Var, 0));
                break;
        }
        return zy11Var;
    }
}
