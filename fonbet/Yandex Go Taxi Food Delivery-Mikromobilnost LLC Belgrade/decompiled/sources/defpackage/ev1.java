package defpackage;

import com.yandex.go.navigator.alt_select.AltSelectModalView;
import com.yandex.go.navigator.alt_select.e;

/* loaded from: classes12.dex */
public final /* synthetic */ class ev1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ ev1(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                AltSelectModalView._init_$onRouteConfirmClicked(eVar);
                break;
            case 1:
                AltSelectModalView._init_$toggleCarParksVisibility(eVar);
                break;
            case 2:
                AltSelectModalView.updateCarParksButton$toggleCarParksVisibility(eVar);
                break;
            case 3:
                AltSelectModalView.renderContentState$lambda$3$0$onRouteConfirmClicked(eVar);
                break;
            case 4:
                AltSelectModalView.renderContentState$lambda$1$onTrafficJamClicked(eVar);
                break;
            case 5:
                AltSelectModalView.renderErrorState$lambda$1$onReloadClicked(eVar);
                break;
            default:
                eVar.Ng();
                break;
        }
    }
}
