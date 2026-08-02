package defpackage;

import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2ModalView;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes14.dex */
public final /* synthetic */ class iyv0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuperAppDiscoveryMapV2ModalView b;

    public /* synthetic */ iyv0(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView, int i) {
        this.a = i;
        this.b = superAppDiscoveryMapV2ModalView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 searchbarController_delegate$lambda$0$0;
        zy11 onAttachedToWindow$lambda$0;
        int i = this.a;
        SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView = this.b;
        switch (i) {
            case 0:
                searchbarController_delegate$lambda$0$0 = SuperAppDiscoveryMapV2ModalView.searchbarController_delegate$lambda$0$0(superAppDiscoveryMapV2ModalView, ((Float) obj).floatValue());
                return searchbarController_delegate$lambda$0$0;
            default:
                onAttachedToWindow$lambda$0 = SuperAppDiscoveryMapV2ModalView.onAttachedToWindow$lambda$0(superAppDiscoveryMapV2ModalView, (TaxiMapView) obj);
                return onAttachedToWindow$lambda$0;
        }
    }
}
