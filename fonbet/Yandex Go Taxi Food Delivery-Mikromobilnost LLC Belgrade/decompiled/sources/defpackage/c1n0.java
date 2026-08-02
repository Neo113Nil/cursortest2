package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import kotlin.a;

/* loaded from: classes8.dex */
public final class c1n0 {
    public final i3y a;

    public c1n0(Context context) {
        this.a = a.a(new ku2(context, 16));
    }

    public final boolean a() {
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.a.getValue();
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }
}
