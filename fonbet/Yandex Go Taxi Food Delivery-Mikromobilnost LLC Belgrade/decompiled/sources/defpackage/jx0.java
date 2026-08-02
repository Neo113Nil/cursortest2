package defpackage;

import ru.yandex.taxi.fragment.preorder.AddressMapFragment;
import ru.yandex.taxi.order.overlay.OrderBubblesOverlay;
import ru.yandex.taxi.preorder.source.routeoverlay.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class jx0 implements yg00 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jx0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yg00
    public final void rc() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AddressMapFragment.onResume$lambda$0((AddressMapFragment) obj);
                break;
            case 1:
                ((OrderBubblesOverlay) obj).ensureBubblesPosition();
                break;
            default:
                a aVar = (a) obj;
                aVar.S.e();
                f4c0 f4c0Var = aVar.k0;
                if (f4c0Var != null) {
                    aVar.T.B(f4c0Var);
                    break;
                }
                break;
        }
    }
}
