package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.c;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final class hc31 implements SourceDestinationComponent.a {
    public final /* synthetic */ VerticalHubV1ModalView a;

    public hc31(VerticalHubV1ModalView verticalHubV1ModalView) {
        this.a = verticalHubV1ModalView;
    }

    @Override // ru.yandex.taxi.address.design.SourceDestinationComponent.a
    public final void Y() {
        c cVar;
        cVar = this.a.presenter;
        qc31.T((qc31) cVar.x.a, PointType.SOURCE);
        cVar.Og();
    }

    @Override // ru.yandex.taxi.address.design.SourceDestinationComponent.a
    public final void x0() {
        c cVar;
        cVar = this.a.presenter;
        qc31.T((qc31) cVar.x.a, PointType.DESTINATION);
        cVar.Og();
    }
}
