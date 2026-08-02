package defpackage;

import ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.AbortAttemptByBleException;
import ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$3;

/* loaded from: classes6.dex */
public final class b2n0 implements sy60 {
    public final /* synthetic */ c2n0 a;
    public final /* synthetic */ ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$2 b;
    public final /* synthetic */ ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$3 c;

    public b2n0(c2n0 c2n0Var, ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$2 scootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$2, ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$3 scootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$3) {
        this.a = c2n0Var;
        this.b = scootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$2;
        this.c = scootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$3;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
        this.c.invoke(new AbortAttemptByBleException());
    }
}
