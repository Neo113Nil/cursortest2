package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes4.dex */
public final class n66 {
    public static n66 d;
    public BluetoothAdapter a;
    public Boolean b;
    public Boolean c;

    public static n66 a() {
        if (d == null) {
            n66 n66Var = new n66();
            new Handler(Looper.getMainLooper());
            n66Var.b = null;
            n66Var.c = null;
            d = n66Var;
        }
        return d;
    }
}
