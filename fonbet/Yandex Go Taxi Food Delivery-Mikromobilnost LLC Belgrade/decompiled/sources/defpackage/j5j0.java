package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.eatskit.dto.BluetoothError;

@gsq0
/* loaded from: classes5.dex */
public final class j5j0 {
    public static final i5j0 Companion = new i5j0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new lqi0(21))};
    public final boolean a;
    public final BluetoothError b;

    public /* synthetic */ j5j0(int i, boolean z, BluetoothError bluetoothError) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, h5j0.a.getDescriptor());
            throw null;
        }
        this.a = z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bluetoothError;
        }
    }

    public j5j0(boolean z, BluetoothError bluetoothError) {
        this.a = z;
        this.b = bluetoothError;
    }
}
