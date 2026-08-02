package defpackage;

import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.profile.b;
import com.yandex.go.suggest.impl.router.e;

/* loaded from: classes8.dex */
public final /* synthetic */ class j230 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ j230(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        int i2 = 9;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                a aVar = (a) h55Var;
                aVar.D = null;
                aVar.r(new qu(i2));
                break;
            case 1:
                ((com.yandex.go.payments.paymentlist.navigation.deeplink.a) h55Var).r(new qu(9));
                break;
            case 2:
                ((b) h55Var).r(new qu(i2));
                break;
            default:
                ((e) h55Var).r(new qu(9));
                break;
        }
    }
}
