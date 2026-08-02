package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.yandex.go.scooters.ble.data.ninebot.a;

/* loaded from: classes13.dex */
public final class kln implements v7p {
    public final /* synthetic */ int a = 1;
    public final n3w b;
    public final n3w c;
    public final xvf0 d;

    public kln(n3w n3wVar, n3w n3wVar2, xvf0 xvf0Var) {
        this.b = n3wVar;
        this.c = n3wVar2;
        this.d = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        n3w n3wVar = this.c;
        n3w n3wVar2 = this.b;
        switch (i) {
            case 0:
                return new ej1(6, (w030) xvf0Var.get(), (bln) n3wVar2.a, (gln) n3wVar.a);
            default:
                return new a((Context) n3wVar2.a, (BluetoothAdapter) n3wVar.a, (k1n0) xvf0Var.get());
        }
    }

    public kln(xvf0 xvf0Var, n3w n3wVar, n3w n3wVar2) {
        this.d = xvf0Var;
        this.b = n3wVar;
        this.c = n3wVar2;
    }
}
