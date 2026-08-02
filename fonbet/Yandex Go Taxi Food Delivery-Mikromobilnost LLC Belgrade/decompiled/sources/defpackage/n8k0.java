package defpackage;

import com.yandex.go.taxi.order.details.v2.domain.a11y.e;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import ru.yandex.taxi.preorder.source.domain.t;

/* loaded from: classes14.dex */
public final /* synthetic */ class n8k0 implements fy2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n8k0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fy2
    public final void a(boolean z, boolean z2) {
        RideCardPresentationType rideCardPresentationType;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                e eVar = (e) obj;
                if (z2) {
                    eVar.a(RideCardPresentationType.COMPACT);
                    eVar.a(RideCardPresentationType.DETAILS);
                }
                if (z && (rideCardPresentationType = (RideCardPresentationType) eVar.h.get()) != null) {
                    eVar.b(rideCardPresentationType);
                    break;
                }
                break;
            default:
                t tVar = (t) obj;
                if (!z) {
                    tVar.t = true;
                    break;
                }
                break;
        }
    }
}
