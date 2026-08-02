package defpackage;

import com.yandex.go.payments.menu.navigation.b;
import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.payments.paymentlist.navigation.f;

/* loaded from: classes13.dex */
public final class mm10 implements ygz0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ mm10(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    private final void p1() {
    }

    @Override // defpackage.ygz0, defpackage.sy60
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.ygz0
    public final void n(String str) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((c) ((i) ((b) h55Var).L.get()).j).e();
                break;
            case 1:
                ((f) h55Var).k0.f();
                break;
            default:
                ((c) ((i) ((com.yandex.go.payments.summary.domain.f) h55Var).U.get()).j).e();
                break;
        }
    }
}
