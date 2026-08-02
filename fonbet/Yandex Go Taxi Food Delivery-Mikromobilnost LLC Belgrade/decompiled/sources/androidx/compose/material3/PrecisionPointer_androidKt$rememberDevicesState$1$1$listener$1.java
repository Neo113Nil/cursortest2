package androidx.compose.material3;

import android.hardware.input.InputManager;
import android.view.InputDevice;
import defpackage.fcj;
import defpackage.fhe0;
import defpackage.oz40;
import defpackage.xx40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/compose/material3/PrecisionPointer_androidKt$rememberDevicesState$1$1$listener$1", "Landroid/hardware/input/InputManager$InputDeviceListener;", "", "deviceId", "Lzy11;", "maybeUpdateDevice", "(I)V", "onInputDeviceAdded", "onInputDeviceRemoved", "onInputDeviceChanged", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PrecisionPointer_androidKt$rememberDevicesState$1$1$listener$1 implements InputManager.InputDeviceListener {
    final /* synthetic */ oz40 $devicesState;
    final /* synthetic */ InputManager $inputManager;

    public PrecisionPointer_androidKt$rememberDevicesState$1$1$listener$1(InputManager inputManager, oz40 oz40Var) {
        this.$inputManager = inputManager;
        this.$devicesState = oz40Var;
    }

    private final void maybeUpdateDevice(int deviceId) {
        fcj fcjVar;
        InputDevice inputDevice = this.$inputManager.getInputDevice(deviceId);
        fcj fcjVar2 = (fcj) this.$devicesState.getValue();
        int i = fhe0.a;
        boolean z = false;
        boolean z2 = inputDevice != null && !inputDevice.isVirtual() && (inputDevice.getSources() & 257) == 257 && inputDevice.getKeyboardType() == 2;
        if (inputDevice != null && !inputDevice.isVirtual() && (inputDevice.getSources() & 8194) == 8194 && (inputDevice.getSources() & 16386) != 16386) {
            z = true;
        }
        xx40 xx40Var = fcjVar2.a;
        xx40 xx40Var2 = fcjVar2.b;
        xx40 b = fhe0.b(xx40Var, deviceId, z2);
        xx40 b2 = fhe0.b(xx40Var2, deviceId, z);
        if (b == null && b2 == null) {
            fcjVar = null;
        } else {
            if (b == null) {
                b = fcjVar2.a;
            }
            if (b2 != null) {
                xx40Var2 = b2;
            }
            fcjVar = new fcj(b, xx40Var2);
        }
        if (fcjVar != null) {
            this.$devicesState.setValue(fcjVar);
        }
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceAdded(int deviceId) {
        maybeUpdateDevice(deviceId);
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceChanged(int deviceId) {
        maybeUpdateDevice(deviceId);
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceRemoved(int deviceId) {
        maybeUpdateDevice(deviceId);
    }
}
