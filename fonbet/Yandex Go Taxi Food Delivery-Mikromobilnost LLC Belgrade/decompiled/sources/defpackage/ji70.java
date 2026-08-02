package defpackage;

import com.yandex.go.taxi.order.overlay.g;
import ru.yandex.taxi.map.overlay.pickup.d;
import ru.yandex.taxi.order.overlay.OrderBubblesOverlay;

/* loaded from: classes14.dex */
public final /* synthetic */ class ji70 implements gr7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ji70(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gr7
    public final void a8() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                OrderBubblesOverlay.cameraListener$lambda$0((OrderBubblesOverlay) obj);
                break;
            case 1:
                ((g) obj).Ng();
                break;
            default:
                ((d) obj).K.a(Void.TYPE);
                break;
        }
    }
}
