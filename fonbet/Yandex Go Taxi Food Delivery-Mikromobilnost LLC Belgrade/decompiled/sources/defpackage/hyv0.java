package defpackage;

import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2ModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class hyv0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuperAppDiscoveryMapV2ModalView b;

    public /* synthetic */ hyv0(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView, int i) {
        this.a = i;
        this.b = superAppDiscoveryMapV2ModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 listeners$lambda$0$0$0;
        int attachGamification$lambda$1;
        v66 mapBlurDelegate_delegate$lambda$0;
        vxp0 searchbarController_delegate$lambda$0;
        int i = this.a;
        SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView = this.b;
        switch (i) {
            case 0:
                listeners$lambda$0$0$0 = SuperAppDiscoveryMapV2ModalView.setListeners$lambda$0$0$0(superAppDiscoveryMapV2ModalView);
                return listeners$lambda$0$0$0;
            case 1:
                attachGamification$lambda$1 = SuperAppDiscoveryMapV2ModalView.attachGamification$lambda$1(superAppDiscoveryMapV2ModalView);
                break;
            case 2:
                attachGamification$lambda$1 = SuperAppDiscoveryMapV2ModalView.attachGamification$lambda$2(superAppDiscoveryMapV2ModalView);
                break;
            case 3:
                mapBlurDelegate_delegate$lambda$0 = SuperAppDiscoveryMapV2ModalView.mapBlurDelegate_delegate$lambda$0(superAppDiscoveryMapV2ModalView);
                return mapBlurDelegate_delegate$lambda$0;
            default:
                searchbarController_delegate$lambda$0 = SuperAppDiscoveryMapV2ModalView.searchbarController_delegate$lambda$0(superAppDiscoveryMapV2ModalView);
                return searchbarController_delegate$lambda$0;
        }
        return Integer.valueOf(attachGamification$lambda$1);
    }
}
