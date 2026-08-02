package defpackage;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class c66 implements b66 {
    public final BluetoothDevice a;
    public final String b;
    public final Integer c;

    public c66(BluetoothDevice bluetoothDevice) {
        String name = bluetoothDevice.getName();
        name = name == null ? "Bluetooth" : name;
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        Integer valueOf = bluetoothClass != null ? Integer.valueOf(bluetoothClass.getDeviceClass()) : null;
        this.a = bluetoothDevice;
        this.b = name;
        this.c = valueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c66)) {
            return false;
        }
        c66 c66Var = (c66) obj;
        return jl40.l(this.a, c66Var.a) && jl40.l(this.b, c66Var.b) && jl40.l(this.c, c66Var.c);
    }

    public final int hashCode() {
        BluetoothDevice bluetoothDevice = this.a;
        int hashCode = (bluetoothDevice != null ? bluetoothDevice.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BluetoothDeviceWrapperImpl(device=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", deviceClass=");
        return oo31.j(sb, this.c, Extension.C_BRAKE);
    }
}
