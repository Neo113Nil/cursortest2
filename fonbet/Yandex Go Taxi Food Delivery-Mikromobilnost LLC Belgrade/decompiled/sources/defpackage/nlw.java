package defpackage;

import com.yandex.go.parks.nearest.presentation.ui.NearestZoneErrorModalView;
import com.yandex.go.preorder.navigation.s;
import java.util.concurrent.ConcurrentLinkedDeque;
import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;

/* loaded from: classes13.dex */
public final class nlw implements v030 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nlw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.v030
    public final void a(u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
        llw llwVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ConcurrentLinkedDeque concurrentLinkedDeque = ((olw) obj).b;
                if (modalViewCoordinator$StackChangeType != ModalViewCoordinator$StackChangeType.PUSH || !(u45Var2 instanceof llw)) {
                    if (modalViewCoordinator$StackChangeType != ModalViewCoordinator$StackChangeType.POLL || !(u45Var instanceof llw)) {
                        if (modalViewCoordinator$StackChangeType == ModalViewCoordinator$StackChangeType.CLEAN) {
                            concurrentLinkedDeque.clear();
                            break;
                        }
                    } else {
                        ((llw) u45Var).onPause();
                        llwVar = u45Var2 instanceof llw ? (llw) u45Var2 : null;
                        if (llwVar != null) {
                            llwVar.onResume();
                        }
                        concurrentLinkedDeque.remove(u45Var);
                        break;
                    }
                } else {
                    llwVar = u45Var instanceof llw ? (llw) u45Var : null;
                    if (llwVar != null) {
                        llwVar.onPause();
                    }
                    ((llw) u45Var2).onResume();
                    concurrentLinkedDeque.push(u45Var2);
                    break;
                }
                break;
            case 1:
                j18 j18Var = (j18) obj;
                if (modalViewCoordinator$StackChangeType.getIsStackIncreased() && u45Var2 != null && (j18Var.t() instanceof mf60)) {
                    j18Var.q(zy11.a, a2d.B);
                    break;
                }
                break;
            default:
                s sVar = (s) obj;
                fy01 fy01Var = sVar.H;
                if (modalViewCoordinator$StackChangeType == ModalViewCoordinator$StackChangeType.PUSH && (u45Var2 instanceof NearestZoneErrorModalView)) {
                    ((nwx0) fy01Var).a.c();
                }
                if (modalViewCoordinator$StackChangeType == ModalViewCoordinator$StackChangeType.POLL && (u45Var instanceof NearestZoneErrorModalView)) {
                    ((nwx0) fy01Var).a.c();
                    g18 g18Var = sVar.L;
                    if (g18Var != null) {
                        g18Var.cancel();
                    }
                    sVar.r(new qu(9));
                    break;
                }
                break;
        }
    }
}
