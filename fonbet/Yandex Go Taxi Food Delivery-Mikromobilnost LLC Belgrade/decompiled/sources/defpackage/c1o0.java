package defpackage;

import android.view.View;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersNewControlPanelView;

/* loaded from: classes6.dex */
public final /* synthetic */ class c1o0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersNewControlPanelView b;

    public /* synthetic */ c1o0(ScootersNewControlPanelView scootersNewControlPanelView, int i) {
        this.a = i;
        this.b = scootersNewControlPanelView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 remainingButtonsRvAdapter_delegate$lambda$0$0$0$0;
        zy11 remainingButtonsRvAdapter_delegate$lambda$0$0$0$1;
        wys remainingButtonsRvAdapter_delegate$lambda$0$0$0;
        zy11 bindNewTopActionButton$lambda$0;
        int i = this.a;
        ScootersNewControlPanelView scootersNewControlPanelView = this.b;
        switch (i) {
            case 0:
                remainingButtonsRvAdapter_delegate$lambda$0$0$0$0 = ScootersNewControlPanelView.remainingButtonsRvAdapter_delegate$lambda$0$0$0$0(scootersNewControlPanelView, (jfn0) obj);
                return remainingButtonsRvAdapter_delegate$lambda$0$0$0$0;
            case 1:
                remainingButtonsRvAdapter_delegate$lambda$0$0$0$1 = ScootersNewControlPanelView.remainingButtonsRvAdapter_delegate$lambda$0$0$0$1(scootersNewControlPanelView, (kfn0) obj);
                return remainingButtonsRvAdapter_delegate$lambda$0$0$0$1;
            case 2:
                remainingButtonsRvAdapter_delegate$lambda$0$0$0 = ScootersNewControlPanelView.remainingButtonsRvAdapter_delegate$lambda$0$0$0(scootersNewControlPanelView, (View) obj);
                return remainingButtonsRvAdapter_delegate$lambda$0$0$0;
            default:
                bindNewTopActionButton$lambda$0 = ScootersNewControlPanelView.bindNewTopActionButton$lambda$0(scootersNewControlPanelView, (kfn0) obj);
                return bindNewTopActionButton$lambda$0;
        }
    }
}
