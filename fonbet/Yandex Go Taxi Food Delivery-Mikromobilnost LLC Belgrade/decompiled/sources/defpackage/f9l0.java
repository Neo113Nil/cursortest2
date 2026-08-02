package defpackage;

import android.widget.FrameLayout;
import com.yandex.go.address_confirmation.modal.SourceAddressConfirmationModalView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class f9l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ ListItemComponent c;

    public /* synthetic */ f9l0(FrameLayout frameLayout, ListItemComponent listItemComponent, int i) {
        this.a = i;
        this.b = frameLayout;
        this.c = listItemComponent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ListItemComponent listItemComponent = this.c;
        FrameLayout frameLayout = this.b;
        switch (i) {
            case 0:
                RouteSelectorModalView.appendEntrance$lambda$1(frameLayout, listItemComponent);
                break;
            default:
                SourceAddressConfirmationModalView.appendPorchNumberButton$lambda$1(frameLayout, listItemComponent);
                break;
        }
    }
}
