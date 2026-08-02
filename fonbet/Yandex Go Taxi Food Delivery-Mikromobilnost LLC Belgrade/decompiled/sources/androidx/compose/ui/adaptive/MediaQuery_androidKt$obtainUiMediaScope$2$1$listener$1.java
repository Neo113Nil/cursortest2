package androidx.compose.ui.adaptive;

import android.hardware.input.InputManager;
import android.view.InputDevice;
import defpackage.ft11;
import defpackage.okb1;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$2$1$listener$1", "Landroid/hardware/input/InputManager$InputDeviceListener;", "", "id", "Lzy11;", "onInputDeviceAdded", "(I)V", "onInputDeviceRemoved", "onInputDeviceChanged", "update", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MediaQuery_androidKt$obtainUiMediaScope$2$1$listener$1 implements InputManager.InputDeviceListener {
    final /* synthetic */ InputManager $inputManager;
    final /* synthetic */ ft11 $scope;

    public MediaQuery_androidKt$obtainUiMediaScope$2$1$listener$1(ft11 ft11Var, InputManager inputManager) {
        this.$scope = ft11Var;
        this.$inputManager = inputManager;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceAdded(int id) {
        update();
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceChanged(int id) {
        update();
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceRemoved(int id) {
        update();
    }

    public final void update() {
        ft11 ft11Var = this.$scope;
        InputManager inputManager = this.$inputManager;
        if (inputManager != null) {
            String str = "None";
            for (int i : inputManager.getInputDeviceIds()) {
                InputDevice inputDevice = inputManager.getInputDevice(i);
                if (inputDevice != null) {
                    if (okb1.c(inputDevice, 8194) || okb1.c(inputDevice, 16386) || okb1.c(inputDevice, 1048584)) {
                        break;
                    }
                    if (okb1.c(inputDevice, 4098)) {
                        str = "Coarse";
                    } else if (str.equals("None") && (okb1.c(inputDevice, 16777232) || okb1.c(inputDevice, 1025))) {
                        str = "Blunt";
                    }
                }
            }
        }
        ft11Var.getClass();
        throw null;
    }
}
