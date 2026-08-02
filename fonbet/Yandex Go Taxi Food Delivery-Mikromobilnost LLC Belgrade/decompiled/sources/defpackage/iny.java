package defpackage;

import android.view.ViewTreeObserver;
import ru.yandex.taxi.linked_order.modals.info.LinkedOrderInfoModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class iny implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedOrderInfoModalView b;

    public /* synthetic */ iny(LinkedOrderInfoModalView linkedOrderInfoModalView, int i) {
        this.a = i;
        this.b = linkedOrderInfoModalView;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        int i = this.a;
        LinkedOrderInfoModalView linkedOrderInfoModalView = this.b;
        switch (i) {
            case 0:
                linkedOrderInfoModalView.updateBottomPosition();
                break;
            default:
                linkedOrderInfoModalView.updateBottomPosition();
                break;
        }
    }
}
