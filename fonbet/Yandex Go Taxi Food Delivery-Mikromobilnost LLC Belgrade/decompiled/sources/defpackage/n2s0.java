package defpackage;

import android.view.View;
import com.yandex.go.address.models.Address;
import com.yandex.go.preorder.map.CameraAnimationFinishType;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.widget.modalview.ModalViewProcessing$ProcessingState;

/* loaded from: classes14.dex */
public final class n2s0 implements q2s0 {
    public final /* synthetic */ ShortcutsMainScreen a;

    public n2s0(ShortcutsMainScreen shortcutsMainScreen) {
        this.a = shortcutsMainScreen;
    }

    @Override // defpackage.q2s0
    public final void F1() {
        this.a.dismissMainModalView();
    }

    @Override // defpackage.q2s0
    public final void Q0(CameraAnimationFinishType cameraAnimationFinishType) {
        v3s0 transitionCoordinator = this.a.getTransitionCoordinator();
        if (!transitionCoordinator.q4() || transitionCoordinator.B.a()) {
            return;
        }
        if (cameraAnimationFinishType != CameraAnimationFinishType.ANIMATE_TAP_ON_PICKUP_POINT || transitionCoordinator.b.a().i(MultiexitModalView.class) == null) {
            transitionCoordinator.Q2().d(true);
        }
    }

    @Override // defpackage.q2s0
    public final void showAddressesPicker(SourcePicker sourcePicker, PointType pointType) {
        this.a.showAddressesPicker(sourcePicker, pointType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q2s0
    public final void ua(Address address) {
        y700 y700Var;
        y700 y700Var2;
        y700 y700Var3;
        ShortcutsMainScreen shortcutsMainScreen = this.a;
        y700Var = shortcutsMainScreen.mainModalView;
        if (y700Var != null) {
            y700Var.setSourceAddress(address);
        }
        y700Var2 = shortcutsMainScreen.mainModalView;
        if (y700Var2 != null) {
            y700Var2.tryRenderPanoramaButton(address);
        }
        y700Var3 = shortcutsMainScreen.mainModalView;
        if (y700Var3 != 0) {
            View view = (View) y700Var3;
            if (view.getParent() != null) {
                cma1.J(view);
                y700Var3.setProcessingState(ModalViewProcessing$ProcessingState.DONE);
            }
        }
    }
}
