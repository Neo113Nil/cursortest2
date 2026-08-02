package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import com.yandex.go.taxi.main.a;
import ru.yandex.taxi.orderforanother.v1.ui.WhoRideSelectorModalView;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;

/* loaded from: classes6.dex */
public final /* synthetic */ class ka00 implements v030 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ka00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.v030
    public final void a(u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                if (!(u45Var2 instanceof RouteSelectorModalView)) {
                    if (u45Var instanceof RouteSelectorModalView) {
                        aVar.c().c3(false);
                        break;
                    }
                } else {
                    aVar.c().c3(true);
                    break;
                }
                break;
            case 1:
                uq40 uq40Var = ((zq40) obj).a;
                l9 l9Var = uq40Var.K;
                if (l9Var != null && modalViewCoordinator$StackChangeType.a() && (u45Var instanceof WhoRideSelectorModalView)) {
                    l9Var.run();
                    uq40Var.K = null;
                    break;
                }
                break;
            case 2:
                ShortcutsMainScreen.onAttachedToWindow$lambda$2((ShortcutsMainScreen) obj, u45Var, u45Var2, modalViewCoordinator$StackChangeType);
                break;
            default:
                rpt0 rpt0Var = (rpt0) obj;
                if (modalViewCoordinator$StackChangeType == ModalViewCoordinator$StackChangeType.PUSH && (u45Var2 instanceof kca0)) {
                    rpt0Var.g.a();
                    dgt0 dgt0Var = (dgt0) rpt0Var.c;
                    if (dgt0Var.w.a.w.a(Lifecycle.State.STARTED)) {
                        dgt0Var.b.a();
                        break;
                    }
                }
                break;
        }
    }
}
