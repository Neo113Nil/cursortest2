package defpackage;

import android.bluetooth.BluetoothDevice;
import com.yandex.xplat.common.PollingError;
import com.yandex.xplat.common.PollingStep;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.common.c;

/* loaded from: classes2.dex */
public final class d2e0 {
    public int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public d2e0(sls slsVar, tls tlsVar, kdd0 kdd0Var) {
        this.c = slsVar;
        this.d = tlsVar;
        this.e = kdd0Var;
        this.b = c.a(Long.valueOf(System.currentTimeMillis()));
    }

    public md51 a(tyj0 tyj0Var) {
        tyj0 tyj0Var2 = (tyj0) ((tls) this.d).invoke(tyj0Var);
        if (tyj0Var2.b()) {
            YSError ySError = tyj0Var2.b;
            c.b(ySError);
            return zmx.c(ySError);
        }
        if (((PollingStep) tyj0Var2.a()) == PollingStep.done) {
            return ooa1.d(tyj0Var);
        }
        int i = this.a + 1;
        this.a = i;
        kdd0 kdd0Var = (kdd0) this.e;
        Integer num = (Integer) kdd0Var.a;
        if (num != null && i > num.intValue()) {
            return zmx.c(new PollingError("Maximum retries count reached", null));
        }
        long a = c.a(Long.valueOf(System.currentTimeMillis())) - this.b;
        Long l = (Long) kdd0Var.c;
        if (l != null && a > l.longValue()) {
            return zmx.c(new PollingError("Timeout reached", null));
        }
        long a2 = ((g2e0) kdd0Var.b).a(this.a);
        q7x0 q7x0Var = zmx.c;
        eoh eohVar = new eoh(zmx.a);
        new y4r0(q7x0Var, new ctq(18, new vg3(a2, eohVar)));
        mtw mtwVar = new mtw(13);
        y4r0 y4r0Var = eohVar.a;
        y4r0Var.getClass();
        md51 l2 = ymx.l(y4r0Var, mtwVar, null, 5);
        c2e0 c2e0Var = new c2e0(this, 2);
        ymx ymxVar = (ymx) l2;
        ymxVar.getClass();
        return ymx.j(ymxVar, c2e0Var, null, 5);
    }

    public md51 b() {
        w18 w18Var = (w18) ((kdd0) this.e).d;
        return w18Var != null ? w18Var.a : false ? zmx.c(new PollingError("Polling cancelled", null)) : ((md51) ((sls) this.c).invoke()).e(new c2e0(this, 0), new c2e0(this, 1));
    }

    public d2e0(mlm0 mlm0Var, BluetoothDevice bluetoothDevice, int i, byte[] bArr, long j) {
        this.e = mlm0Var;
        this.c = bluetoothDevice;
        this.a = i;
        this.d = bArr;
        this.b = j;
    }
}
