package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.yandex.go.scooters.ble.a;
import com.yandex.go.scooters.ble.api.ScootersBleProtocol;

/* loaded from: classes13.dex */
public final class f1n0 {
    public final Context a;
    public final c1n0 b;

    public f1n0(Context context, c1n0 c1n0Var) {
        this.a = context;
        this.b = c1n0Var;
    }

    public final a a(ScootersBleProtocol scootersBleProtocol) {
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.b.a.getValue();
        if (bluetoothAdapter == null) {
            ny61.g("BluetoothAdapter must be non null and available on the device when calling the create method");
            return null;
        }
        Context context = this.a;
        context.getClass();
        scootersBleProtocol.getClass();
        new j1n0();
        n3w a = n3w.a(context);
        n3w a2 = n3w.a(bluetoothAdapter);
        s3f0 s3f0Var = new s3f0(eso0.a, i5m.b(new kln(a, a2, l1n0.a)), q1n0.a, 24);
        jzi0 jzi0Var = new jzi0(29, new f2i(a, a2, 3));
        h3y a3 = i5m.a(s3f0Var);
        h3y a4 = i5m.a(jzi0Var);
        int i = i1n0.a[scootersBleProtocol.ordinal()];
        if (i == 1) {
            return new a((o1n0) a3.get());
        }
        if (i == 2) {
            return new a((o1n0) a4.get());
        }
        w511.b();
        return null;
    }
}
