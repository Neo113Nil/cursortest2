package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.shortcuts.impl.interactors.q;
import com.yandex.go.taxi.cars.preorder.source.j;
import ru.yandex.taxi.order.OrderFragment;

/* loaded from: classes13.dex */
public final /* synthetic */ class iw70 implements hhf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iw70(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hhf
    public final void a(Screen screen) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                OrderFragment.onAttach$lambda$1((OrderFragment) obj, screen);
                break;
            case 1:
                j jVar = (j) obj;
                jVar.P = screen;
                jVar.Kg();
                break;
            default:
                q qVar = (q) obj;
                int i2 = iaf0.a[screen.ordinal()];
                if (i2 == 1) {
                    qVar.b(new qaf0(yaf0.a, qVar.hashCode()));
                    break;
                } else if (i2 == 2) {
                    qVar.b(new qaf0(yaf0.d, qVar.hashCode()));
                    break;
                } else {
                    pzt0 pzt0Var = qVar.m;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    qVar.b.b(new qaf0(yaf0.a, qVar.hashCode()), false);
                    break;
                }
        }
    }
}
