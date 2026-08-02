package defpackage;

import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class d9l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RouteSelectorModalView b;

    public /* synthetic */ d9l0(RouteSelectorModalView routeSelectorModalView, int i) {
        this.a = i;
        this.b = routeSelectorModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RouteSelectorModalView routeSelectorModalView = this.b;
        switch (i) {
            case 0:
                RouteSelectorModalView.circlePinAddressView_delegate$lambda$0$0$0(routeSelectorModalView);
                break;
            case 1:
                routeSelectorModalView.confirmRoute();
                break;
            case 2:
                routeSelectorModalView.openEntranceInput();
                break;
            case 3:
                RouteSelectorModalView.onModalViewAppear$lambda$0(routeSelectorModalView);
                break;
            case 4:
                routeSelectorModalView.onBackPressed();
                break;
            default:
                RouteSelectorModalView._init_$lambda$2(routeSelectorModalView);
                break;
        }
    }
}
