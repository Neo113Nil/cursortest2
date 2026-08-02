package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class hlr implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ FlexRouteHandlerImpl b;

    public /* synthetic */ hlr(FlexRouteHandlerImpl flexRouteHandlerImpl, int i) {
        this.a = i;
        this.b = flexRouteHandlerImpl;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 reloadCurrentDocument$lambda$13;
        zy11 backward$lambda$4;
        int i = this.a;
        FlexRouteHandlerImpl flexRouteHandlerImpl = this.b;
        switch (i) {
            case 0:
                reloadCurrentDocument$lambda$13 = FlexRouteHandlerImpl.reloadCurrentDocument$lambda$13(flexRouteHandlerImpl);
                return reloadCurrentDocument$lambda$13;
            default:
                backward$lambda$4 = FlexRouteHandlerImpl.backward$lambda$4(flexRouteHandlerImpl);
                return backward$lambda$4;
        }
    }
}
