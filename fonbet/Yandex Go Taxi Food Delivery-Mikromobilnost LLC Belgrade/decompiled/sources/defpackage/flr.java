package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class flr implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ kr b;
    public final /* synthetic */ FlexRouteHandlerImpl c;

    public /* synthetic */ flr(kr krVar, FlexRouteHandlerImpl flexRouteHandlerImpl) {
        this.b = krVar;
        this.c = flexRouteHandlerImpl;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 dispatchActionOnCurrent$lambda$14;
        zy11 showPopup$lambda$10$lambda$9$lambda$8;
        int i = this.a;
        FlexRouteHandlerImpl flexRouteHandlerImpl = this.c;
        kr krVar = this.b;
        switch (i) {
            case 0:
                dispatchActionOnCurrent$lambda$14 = FlexRouteHandlerImpl.dispatchActionOnCurrent$lambda$14(flexRouteHandlerImpl, krVar);
                return dispatchActionOnCurrent$lambda$14;
            default:
                showPopup$lambda$10$lambda$9$lambda$8 = FlexRouteHandlerImpl.showPopup$lambda$10$lambda$9$lambda$8(krVar, flexRouteHandlerImpl);
                return showPopup$lambda$10$lambda$9$lambda$8;
        }
    }

    public /* synthetic */ flr(FlexRouteHandlerImpl flexRouteHandlerImpl, kr krVar) {
        this.c = flexRouteHandlerImpl;
        this.b = krVar;
    }
}
