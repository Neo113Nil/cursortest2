package defpackage;

import com.yandex.go.superapp.order.multi.old.view.OrderViewContainer;

/* loaded from: classes14.dex */
public final class ka80 implements va80 {
    public int a;
    public final /* synthetic */ OrderViewContainer b;

    public ka80(OrderViewContainer orderViewContainer) {
        this.b = orderViewContainer;
    }

    @Override // defpackage.va80
    public final void a(int i) {
        this.a = i;
        this.b.updateContainerOffsets();
    }
}
